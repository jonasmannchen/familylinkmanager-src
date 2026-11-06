package flm;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.gcm.Task;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bqi {
    public int c;
    public String d;
    public String e;
    public boolean f;
    public boolean g;
    public Set h = Collections.emptySet();
    public bqe i = bqe.a;
    public Bundle j;

    public abstract Task b();

    protected void a() {
        bdi.checkArgument(this.d != null, "Must provide an endpoint for this task by calling setService(ComponentName).");
        String str = this.e;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must provide a valid tag.");
        }
        if (100 < str.length()) {
            throw new IllegalArgumentException("Tag is larger than max permissible tag length (100)");
        }
        bqe bqeVar = this.i;
        if (bqeVar != null) {
            int i = bqeVar.b;
            if (i != 1 && i != 0) {
                throw new IllegalArgumentException(new StringBuilder(45).append("Must provide a valid RetryPolicy: ").append(i).toString());
            }
            int i2 = bqeVar.c;
            int i3 = bqeVar.d;
            if (i == 0 && i2 < 0) {
                throw new IllegalArgumentException(new StringBuilder(52).append("InitialBackoffSeconds can't be negative: ").append(i2).toString());
            }
            if (i == 1 && i2 < 10) {
                throw new IllegalArgumentException("RETRY_POLICY_LINEAR must have an initial backoff at least 10 seconds.");
            }
            if (i3 < i2) {
                throw new IllegalArgumentException(new StringBuilder(77).append("MaximumBackoffSeconds must be greater than InitialBackoffSeconds: ").append(bqeVar.d).toString());
            }
        }
        if (this.g) {
            Task.b(this.j);
        }
        if (!this.h.isEmpty() && this.c == 2) {
            throw new IllegalArgumentException("Required URIs may not be used with NETWORK_STATE_ANY");
        }
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            Task.a((Uri) it.next());
        }
    }
}
