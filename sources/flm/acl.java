package flm;

import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class acl implements ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ acj a;

    acl(acj acjVar) {
        this.a = acjVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        acj acjVar = this.a;
        acg acgVar = this.a.d;
        if (!(ti.z(acgVar) && acgVar.getGlobalVisibleRect(acjVar.c))) {
            this.a.c();
        } else {
            this.a.a();
            super/*flm.aeq*/.b();
        }
    }
}
