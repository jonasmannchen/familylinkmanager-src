package flm;

import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class axe extends avu {
    private final atm b;

    public axe(atm atmVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.b = atmVar;
    }

    @Override // flm.atp
    public final auv a(auv auvVar) {
        return this.b.a(0, auvVar);
    }

    @Override // flm.atp
    public final auv b(auv auvVar) {
        return this.b.a(1, auvVar);
    }

    @Override // flm.atp
    public final Looper a() {
        return this.b.c;
    }

    @Override // flm.atp
    public final void a(ayl aylVar) {
    }

    @Override // flm.atp
    public final void b(ayl aylVar) {
    }
}
