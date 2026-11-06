package flm;

import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dye extends dxu {
    public static final long serialVersionUID = 0;
    private final Comparator a;

    dye(dya dyaVar) {
        super(dyaVar);
        this.a = dyaVar.comparator();
    }

    @Override // flm.dxu
    final Object readResolve() {
        return a(new dyd(this.a));
    }
}
