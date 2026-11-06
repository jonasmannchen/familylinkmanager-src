package flm;

import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aza extends ecy {
    private final /* synthetic */ ayy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aza(ayy ayyVar, String str) {
        super(str);
        this.b = ayyVar;
    }

    @Override // flm.ecg
    public final boolean a(Level level) {
        return this.b.a.e.a(level);
    }

    @Override // flm.ecg
    public final void a(final ecf ecfVar) {
        final ayv ayvVar = this.b.a;
        ayvVar.f.execute(new Runnable(ayvVar, ecfVar) { // from class: flm.ayw
            private final ayv a;
            private final ecf b;

            {
                this.a = ayvVar;
                this.b = ecfVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                eiu eiuVarA;
                ayv ayvVar2 = this.a;
                ecf ecfVar2 = this.b;
                if (((Boolean) azf.a.b()).booleanValue() && ecfVar2.l().b(bim.a) != null && ((Integer) ecfVar2.l().b(bim.a)).intValue() != 0 && ayvVar2.d.a()) {
                    eim eimVar = ayvVar2.c;
                    efk efkVarB = eim.b(ecfVar2);
                    if (efkVarB == null) {
                        eiuVarA = null;
                    } else {
                        eiuVarA = ecfVar2.h() != null ? eimVar.a(efkVarB, ecfVar2.i()) : eimVar.a(efkVarB, new Object[0]);
                    }
                    if (eiuVarA != null) {
                        String strD = ecfVar2.g().d();
                        if (strD != null) {
                            eja ejaVar = (eja) ((fio) eiz.c.a(dp.au, (Object) null));
                            ejaVar.c();
                            eiz eizVar = (eiz) ejaVar.a;
                            if (strD == null) {
                                throw new NullPointerException();
                            }
                            eizVar.a |= 1;
                            eizVar.b = strD;
                            fgy fgyVarA = ((eiz) ((fin) ejaVar.h())).a();
                            eiuVarA.c();
                            eit eitVar = (eit) eiuVarA.a;
                            if (fgyVarA == null) {
                                throw new NullPointerException();
                            }
                            eitVar.a |= 8;
                            eitVar.d = fgyVarA;
                        }
                        bey beyVarA = bey.a(((Integer) ecfVar2.l().b(bim.a)).intValue());
                        aob aobVarA = (aob) ayvVar2.a.get(beyVarA);
                        if (aobVarA == null) {
                            ayx ayxVar = ayvVar2.b;
                            String strValueOf = String.valueOf("CLIENT_LOGGING_GMSCORE_");
                            String strValueOf2 = String.valueOf(beyVarA.name());
                            aobVarA = ayxVar.a(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
                            ayvVar2.a.put(beyVarA, aobVarA);
                        }
                        aobVarA.a(((eit) ((fin) eiuVarA.h())).b()).a(eim.a(ecfVar2)).a();
                    }
                }
            }
        });
    }
}
