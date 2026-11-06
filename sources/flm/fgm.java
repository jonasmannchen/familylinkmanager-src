package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fgm extends fmv {
    public fgm() {
        this.g = null;
        this.h = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fgm)) {
            return false;
        }
        fgm fgmVar = (fgm) obj;
        if (this.g == null || this.g.a()) {
            return fgmVar.g == null || fgmVar.g.a();
        }
        return this.g.equals(fgmVar.g);
    }

    public final int hashCode() {
        return ((this.g == null || this.g.a()) ? 0 : this.g.hashCode()) + ((getClass().getName().hashCode() + 527) * 31);
    }

    @Override // flm.fnb
    public final /* synthetic */ fnb a(fms fmsVar) throws fna {
        int iA;
        do {
            iA = fmsVar.a();
            switch (iA) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    return this;
                default:
                    break;
            }
        } while (super.a(fmsVar, iA));
        return this;
    }
}
