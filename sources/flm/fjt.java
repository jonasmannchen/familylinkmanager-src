package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fjt implements fkz {
    private static final fkd b = new fju();
    private final fkd a;

    public fjt() {
        this(new fjv(fim.a, a()));
    }

    private fjt(fkd fkdVar) {
        this.a = (fkd) fiv.a((Object) fkdVar, "messageInfoFactory");
    }

    @Override // flm.fkz
    public final fky a(Class cls) {
        fla.a(cls);
        fkc fkcVarB = this.a.b(cls);
        if (fkcVarB.b()) {
            if (fin.class.isAssignableFrom(cls)) {
                return fkj.a(fla.c, fif.a, fkcVarB.c());
            }
            return fkj.a(fla.a, fif.a(), fkcVarB.c());
        }
        if (fin.class.isAssignableFrom(cls)) {
            if (a(fkcVarB)) {
                return fki.a(fkcVarB, fkn.b, fjp.b, fla.c, fif.a, fkb.b);
            }
            return fki.a(fkcVarB, fkn.b, fjp.b, fla.c, (fid) null, fkb.b);
        }
        if (a(fkcVarB)) {
            return fki.a(fkcVarB, fkn.a, fjp.a, fla.a, fif.a(), fkb.a);
        }
        return fki.a(fkcVarB, fkn.a, fjp.a, fla.b, (fid) null, fkb.a);
    }

    private static boolean a(fkc fkcVar) {
        return fkcVar.a() == dp.ay;
    }

    private static fkd a() {
        try {
            return (fkd) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            return b;
        }
    }
}
