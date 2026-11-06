package flm;

import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bws {
    public String a = UUID.randomUUID().toString();
    public fej b;
    public long c;
    public long d;
    public String e;

    public bws(fej fejVar, long j, long j2, String str) {
        this.b = fejVar;
        this.c = j;
        this.d = j2;
        this.e = dvj.b(str);
    }

    public final fei a() {
        fel felVar = (fel) ((fio) fei.h.a(dp.au, (Object) null));
        fem femVar = fem.DEFAULT;
        felVar.c();
        fei feiVar = (fei) felVar.a;
        if (femVar == null) {
            throw new NullPointerException();
        }
        feiVar.a |= 64;
        feiVar.g = femVar.c;
        fej fejVar = this.b;
        felVar.c();
        fei feiVar2 = (fei) felVar.a;
        if (fejVar == null) {
            throw new NullPointerException();
        }
        feiVar2.a |= 8;
        feiVar2.e = fejVar.g;
        long j = this.c;
        felVar.c();
        fei feiVar3 = (fei) felVar.a;
        feiVar3.a |= 2;
        feiVar3.d = j;
        String str = this.a;
        felVar.c();
        fei feiVar4 = (fei) felVar.a;
        if (str == null) {
            throw new NullPointerException();
        }
        feiVar4.a |= 32;
        feiVar4.f = str;
        switch (this.b.ordinal()) {
            case 2:
                fep fepVar = (fep) ((fio) feo.d.a(dp.au, (Object) null));
                long j2 = this.d;
                fepVar.c();
                feo feoVar = (feo) fepVar.a;
                feoVar.a |= 1;
                feoVar.b = j2;
                String str2 = this.e;
                fepVar.c();
                feo feoVar2 = (feo) fepVar.a;
                if (str2 == null) {
                    throw new NullPointerException();
                }
                feoVar2.a |= 2;
                feoVar2.c = str2;
                feo feoVar3 = (feo) ((fin) fepVar.h());
                felVar.c();
                fei feiVar5 = (fei) felVar.a;
                if (feoVar3 == null) {
                    throw new NullPointerException();
                }
                feiVar5.c = feoVar3;
                feiVar5.b = 8;
                break;
                break;
            case 3:
                fer ferVar = (fer) ((fio) feq.d.a(dp.au, (Object) null));
                long j3 = this.d;
                ferVar.c();
                feq feqVar = (feq) ferVar.a;
                feqVar.a |= 1;
                feqVar.b = j3;
                String str3 = this.e;
                ferVar.c();
                feq feqVar2 = (feq) ferVar.a;
                if (str3 == null) {
                    throw new NullPointerException();
                }
                feqVar2.a |= 2;
                feqVar2.c = str3;
                feq feqVar3 = (feq) ((fin) ferVar.h());
                felVar.c();
                fei feiVar6 = (fei) felVar.a;
                if (feqVar3 == null) {
                    throw new NullPointerException();
                }
                feiVar6.c = feqVar3;
                feiVar6.b = 7;
                break;
                break;
        }
        return (fei) ((fin) felVar.h());
    }
}
