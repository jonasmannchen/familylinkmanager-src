package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class fst extends ftu {
    public abstract ftu a();

    @Override // flm.ftu
    public ftt b() {
        return a().b();
    }

    public String toString() {
        return dve.a(this).a("delegate", a()).toString();
    }

    @Override // flm.ftu
    public final /* synthetic */ ftu c() {
        a().c();
        if (this == null) {
            throw null;
        }
        return this;
    }

    @Override // flm.ftu
    @Deprecated
    public final /* synthetic */ ftu a(boolean z) {
        a().a(z);
        if (this == null) {
            throw null;
        }
        return this;
    }
}
