package flm;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dqh implements dpz {
    private static final dql b = new dqi();
    private static final dql c = new dqj();
    private static final dql d = new dqk();

    public abstract void a_(gtr gtrVar);

    private static void a(dql dqlVar, fkf fkfVar) {
        if (TextUtils.isEmpty(dqlVar.b(fkfVar))) {
            dqlVar.a(fkfVar, dhi.a(dqlVar.a(fkfVar)));
        } else {
            dqlVar.a(fkfVar, (Long) null);
        }
        dqlVar.a(fkfVar, (String) null);
    }

    @Override // flm.dpz
    public final void a(gtr gtrVar) {
        goi goiVar;
        fio fioVar = (fio) gtrVar.a(dp.au, (Object) null);
        fioVar.a((fin) gtrVar);
        gts gtsVar = (gts) fioVar;
        a(b, gtsVar);
        if ((((gtr) gtsVar.a).a & 512) == 512) {
            if ((gtsVar.k().a & 1) == 1) {
                gom gomVarK = gtsVar.k();
                if (gomVarK.b == null) {
                    goiVar = goi.k;
                } else {
                    goiVar = gomVarK.b;
                }
                fio fioVar2 = (fio) goiVar.a(dp.au, (Object) null);
                fioVar2.a((fin) goiVar);
                goj gojVar = (goj) fioVar2;
                a(c, gojVar);
                gom gomVarK2 = gtsVar.k();
                fio fioVar3 = (fio) gomVarK2.a(dp.au, (Object) null);
                fioVar3.a((fin) gomVarK2);
                gtsVar.a(((gon) fioVar3).a(gojVar));
            }
        }
        if ((((gtr) gtsVar.a).a & 256) == 256 && gtsVar.j().j.size() != 0) {
            gst gstVarJ = gtsVar.j();
            fio fioVar4 = (fio) gstVarJ.a(dp.au, (Object) null);
            fioVar4.a((fin) gstVarJ);
            gsu gsuVar = (gsu) fioVar4;
            for (int i = 0; i < ((gst) gsuVar.a).j.size(); i++) {
                gsv gsvVar = (gsv) ((gst) gsuVar.a).j.get(i);
                fio fioVar5 = (fio) gsvVar.a(dp.au, (Object) null);
                fioVar5.a((fin) gsvVar);
                gsw gswVar = (gsw) fioVar5;
                if (!TextUtils.isEmpty(gswVar.a())) {
                    gswVar.c();
                    ((gsv) gswVar.a).c = gsv.i();
                    for (String str : a(gswVar.a())) {
                        long jLongValue = dhi.a(str).longValue();
                        gswVar.c();
                        gsv gsvVar2 = (gsv) gswVar.a;
                        if (!gsvVar2.c.a()) {
                            gsvVar2.c = fin.a(gsvVar2.c);
                        }
                        gsvVar2.c.a(jLongValue);
                    }
                }
                gswVar.c();
                gsv gsvVar3 = (gsv) gswVar.a;
                gsvVar3.a &= -2;
                gsvVar3.b = gsv.e.b;
                gsuVar.c();
                gst gstVar = (gst) gsuVar.a;
                if (!gstVar.j.a()) {
                    gstVar.j = fin.a(gstVar.j);
                }
                gstVar.j.set(i, (gsv) ((fin) gswVar.h()));
            }
            gtsVar.a(gsuVar);
        }
        if ((((gtr) gtsVar.a).a & 32) == 32 && gtsVar.i().b.size() != 0) {
            gqf gqfVarI = gtsVar.i();
            fio fioVar6 = (fio) gqfVarI.a(dp.au, (Object) null);
            fioVar6.a((fin) gqfVarI);
            gqg gqgVar = (gqg) fioVar6;
            for (int i2 = 0; i2 < ((gqf) gqgVar.a).b.size(); i2++) {
                gqd gqdVar = (gqd) ((gqf) gqgVar.a).b.get(i2);
                fio fioVar7 = (fio) gqdVar.a(dp.au, (Object) null);
                fioVar7.a((fin) gqdVar);
                gqe gqeVar = (gqe) fioVar7;
                if (!TextUtils.isEmpty(gqeVar.a())) {
                    gqeVar.c();
                    ((gqd) gqeVar.a).h = gqd.i();
                    String[] strArrA = a(gqeVar.a());
                    long[] jArr = new long[strArrA.length];
                    for (int i3 = 0; i3 < jArr.length; i3++) {
                        jArr[i3] = dhi.a(strArrA[i3]).longValue();
                    }
                    for (long j : jArr) {
                        gqeVar.c();
                        gqd gqdVar2 = (gqd) gqeVar.a;
                        if (!gqdVar2.h.a()) {
                            gqdVar2.h = fin.a(gqdVar2.h);
                        }
                        gqdVar2.h.a(j);
                    }
                }
                gqeVar.c();
                gqd gqdVar3 = (gqd) gqeVar.a;
                gqdVar3.a &= -262145;
                gqdVar3.g = gqd.j.g;
                gqgVar.c();
                gqf gqfVar = (gqf) gqgVar.a;
                if (!gqfVar.b.a()) {
                    gqfVar.b = fin.a(gqfVar.b);
                }
                gqfVar.b.set(i2, (gqd) ((fin) gqeVar.h()));
            }
            gtsVar.c();
            gtr gtrVar2 = (gtr) gtsVar.a;
            gtrVar2.g = (gqf) ((fin) gqgVar.h());
            gtrVar2.a |= 32;
        }
        if ((((gtr) gtsVar.a).a & 32768) == 32768 && gtsVar.l().c.size() != 0) {
            grh grhVarL = gtsVar.l();
            fio fioVar8 = (fio) grhVarL.a(dp.au, (Object) null);
            fioVar8.a((fin) grhVarL);
            gri griVar = (gri) fioVar8;
            for (int i4 = 0; i4 < ((grh) griVar.a).c.size(); i4++) {
                grj grjVar = (grj) ((grh) griVar.a).c.get(i4);
                fio fioVar9 = (fio) grjVar.a(dp.au, (Object) null);
                fioVar9.a((fin) grjVar);
                grk grkVar = (grk) fioVar9;
                a(d, grkVar);
                griVar.c();
                grh grhVar = (grh) griVar.a;
                if (!grhVar.c.a()) {
                    grhVar.c = fin.a(grhVar.c);
                }
                grhVar.c.set(i4, (grj) ((fin) grkVar.h()));
            }
            gtsVar.c();
            gtr gtrVar3 = (gtr) gtsVar.a;
            gtrVar3.p = (grh) ((fin) griVar.h());
            gtrVar3.a |= 32768;
        }
        a_((gtr) ((fin) gtsVar.h()));
    }

    private static String[] a(String str) {
        return str.replaceFirst("^/+", "").split("/+");
    }
}
