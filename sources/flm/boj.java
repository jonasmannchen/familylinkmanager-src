package flm;

import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.BoundService;
import com.google.android.gms.common.apiservice.ILifecycleSynchronizerRequired;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class boj extends BoundService implements ILifecycleSynchronizerRequired {
    public LifecycleSynchronizer a;
    public bhl b;
    public Set c;
    public Map d;
    public int[] e;
    public int f;
    private ArrayList g;

    public boj(int i, String str, Set set, int i2, int i3) {
        this(new int[]{i}, new String[]{str}, set, i2, i3, 1, null);
    }

    public abstract void a(bon bonVar, bbn bbnVar);

    public boj(int[] iArr, String[] strArr, Set set, int i, int i2) {
        this(iArr, strArr, set, i, i2, 1, null);
    }

    public boj(int[] iArr, String[] strArr, Set set, int i, int i2, int i3, Map map) {
        this(iArr, strArr, set, i, bgy.a(i3, i2), map);
    }

    public boj(int[] iArr, String[] strArr, Set set, int i, bhl bhlVar, Map map) {
        bdi.checkNotNull(iArr);
        bdi.checkArgument(iArr.length > 0);
        bdi.checkNotNull(strArr);
        bdi.checkArgument(strArr.length > 0);
        for (String str : strArr) {
            bdi.checkNotEmpty(str);
        }
        this.e = iArr;
        this.g = new ArrayList(strArr.length);
        Collections.addAll(this.g, strArr);
        this.f = i;
        this.b = bhlVar;
        this.c = set;
        this.d = map;
        dxm.g();
        dxm.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IBinder onBind(Intent intent) {
        if (!this.g.contains(intent.getAction())) {
            String strValueOf = String.valueOf(intent.getAction());
            Log.w("ApiService", strValueOf.length() != 0 ? "incompatible service action: ".concat(strValueOf) : new String("incompatible service action: "));
            return null;
        }
        return new bok(this, this, this.e[0], this.e);
    }

    public void setLifecycleSynchronizer(LifecycleSynchronizer lifecycleSynchronizer) {
        this.a = lifecycleSynchronizer;
    }

    protected void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.println("==== ApiService dumped info ====");
        printWriter.printf("ID: %s\n", Arrays.toString(this.e));
        printWriter.printf("Action: %s\n", TextUtils.join(bdp.WHITELIST_DELIMITER, this.g));
        printWriter.printf("Visibility: %d\n", Integer.valueOf(this.f));
        printWriter.printf("OperationCount: %d\n", Integer.valueOf(this.a.getRefCount()));
        printWriter.printf("Executor: %s", this.b.toString());
    }
}
