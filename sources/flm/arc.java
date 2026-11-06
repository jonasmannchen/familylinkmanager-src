package flm;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class arc extends lf {
    public Dialog X = null;
    public DialogInterface.OnCancelListener Y = null;

    @Override // flm.lf
    public final Dialog f() {
        if (this.X == null) {
            this.a = false;
        }
        return this.X;
    }

    @Override // flm.lf, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        if (this.Y != null) {
            this.Y.onCancel(dialogInterface);
        }
    }
}
