package flm;

import android.os.Message;
import android.support.v7.app.AlertController;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class vn implements View.OnClickListener {
    private final /* synthetic */ AlertController a;

    public vn(AlertController alertController) {
        this.a = alertController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message messageObtain;
        if (view == this.a.o && this.a.q != null) {
            messageObtain = Message.obtain(this.a.q);
        } else if (view != this.a.s || this.a.u == null) {
            messageObtain = (view != this.a.w || this.a.y == null) ? null : Message.obtain(this.a.y);
        } else {
            messageObtain = Message.obtain(this.a.u);
        }
        if (messageObtain != null) {
            messageObtain.sendToTarget();
        }
        this.a.Q.obtainMessage(1, this.a.b).sendToTarget();
    }
}
