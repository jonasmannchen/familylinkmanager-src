package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bjr {
    public static final asw a;

    @Deprecated
    public static att a(atp atpVar, bjo bjoVar, bjq bjqVar) {
        bdi.checkNotNull(bjqVar);
        return atpVar.a(new bjs(atpVar, bjoVar, bjqVar));
    }

    @Deprecated
    public static att a(atp atpVar, bjq bjqVar) {
        bdi.checkNotNull(bjqVar);
        return atpVar.a(new bjt(atpVar, bjqVar));
    }

    static {
        new atf();
        a = aml.c;
    }
}
