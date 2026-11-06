package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class fjm {
    public fgy a;
    public volatile fke b;
    public volatile fgy c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjm)) {
            return false;
        }
        fjm fjmVar = (fjm) obj;
        fke fkeVar = this.b;
        fke fkeVar2 = fjmVar.b;
        if (fkeVar == null && fkeVar2 == null) {
            return b().equals(fjmVar.b());
        }
        if (fkeVar == null || fkeVar2 == null) {
            return fkeVar != null ? fkeVar.equals(fjmVar.a(fkeVar.m())) : a(fkeVar2.m()).equals(fkeVar2);
        }
        return fkeVar.equals(fkeVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final fke a(fke fkeVar) {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    try {
                        this.b = fkeVar;
                        this.c = fgy.a;
                    } catch (fjg e) {
                        this.b = fkeVar;
                        this.c = fgy.a;
                    }
                }
            }
        }
        return this.b;
    }

    public final fgy b() {
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c != null) {
                return this.c;
            }
            if (this.b == null) {
                this.c = fgy.a;
            } else {
                this.c = this.b.a();
            }
            return this.c;
        }
    }

    static {
        fib.a();
    }
}
