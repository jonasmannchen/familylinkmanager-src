package flm;

import com.google.android.gms.googlehelp.GoogleHelp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class brw {
    public final GoogleHelp a;
    public final bry b;

    public brw(GoogleHelp googleHelp) {
        this(googleHelp, new brx());
    }

    private brw(GoogleHelp googleHelp, bry bryVar) {
        this.a = googleHelp;
        this.b = bryVar;
    }

    final void a(Runnable runnable, int i) {
        Thread threadA = this.b.a(runnable);
        threadA.setPriority(i);
        threadA.start();
    }
}
