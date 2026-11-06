package flm;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(19)
public class bhw extends bhv implements AppOpsManager.OnOpChangedListener {
    private final AppOpsManager b;
    private final AtomicReference c = new AtomicReference();

    bhw(Context context) {
        this.b = (AppOpsManager) context.getSystemService("appops");
    }

    @Override // flm.bhv, flm.bhs
    public final int a(String str, int i, String str2) {
        return this.b.noteOpNoThrow(str, i, str2);
    }

    @Override // android.app.AppOpsManager.OnOpChangedListener
    public void onOpChanged(String str, String str2) {
        bhu bhuVar = (bhu) this.c.get();
        if (bhuVar != null) {
            bhuVar.a();
        }
    }
}
