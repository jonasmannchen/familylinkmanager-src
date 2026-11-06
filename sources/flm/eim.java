package flm;

import java.nio.charset.Charset;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eim {
    private static final efh a;
    private static final Charset b;
    private final eir c;
    private final eiv d;

    public eim(String str, int i, String str2, eix eixVar) {
        eis eisVar = (eis) ((fio) eir.e.a(dp.au, (Object) null));
        eisVar.c();
        eir eirVar = (eir) eisVar.a;
        if (str == null) {
            throw new NullPointerException();
        }
        eirVar.a |= 2;
        eirVar.c = str;
        eisVar.c();
        eir eirVar2 = (eir) eisVar.a;
        eirVar2.a |= 1;
        eirVar2.b = i;
        if (str2 != null) {
            eisVar.c();
            eir eirVar3 = (eir) eisVar.a;
            if (str2 == null) {
                throw new NullPointerException();
            }
            eirVar3.a |= 4;
            eirVar3.d = str2;
        }
        this.c = (eir) ((fin) eisVar.h());
        eiw eiwVar = (eiw) ((fio) eiv.c.a(dp.au, (Object) null));
        eiwVar.c();
        eiv eivVar = (eiv) eiwVar.a;
        if (eixVar == null) {
            throw new NullPointerException();
        }
        eivVar.a |= 1;
        eivVar.b = eixVar.c;
        this.d = (eiv) ((fin) eiwVar.h());
    }

    private static String c(ecf ecfVar) {
        ecx ecxVarH = ecfVar.h();
        if (ecxVarH != null) {
            return ecxVarH.b;
        }
        Object objJ = ecfVar.j();
        if (objJ instanceof String) {
            return (String) objJ;
        }
        return objJ != null ? objJ.getClass().getName() : "null";
    }

    public static int a(ecf ecfVar) {
        return eeu.a().a(c(ecfVar), b).b();
    }

    public final eiu a(efk efkVar, Object... objArr) {
        eiu eiuVar = (eiu) ((fio) eit.f.a(dp.au, (Object) null));
        eiq eiqVar = (eiq) ((fio) eip.d.a(dp.au, (Object) null));
        eir eirVar = this.c;
        eiqVar.c();
        eip eipVar = (eip) eiqVar.a;
        if (eirVar == null) {
            throw new NullPointerException();
        }
        eipVar.b = eirVar;
        eipVar.a |= 1;
        eiv eivVar = this.d;
        eiqVar.c();
        eip eipVar2 = (eip) eiqVar.a;
        if (eivVar == null) {
            throw new NullPointerException();
        }
        eipVar2.c = eivVar;
        eipVar2.a |= 2;
        eip eipVar3 = (eip) ((fin) eiqVar.h());
        eiuVar.c();
        eit eitVar = (eit) eiuVar.a;
        if (eipVar3 == null) {
            throw new NullPointerException();
        }
        eitVar.b = eipVar3;
        eitVar.a |= 1;
        eiuVar.c();
        eit eitVar2 = (eit) eiuVar.a;
        if (efkVar == null) {
            throw new NullPointerException();
        }
        eitVar2.c = efkVar;
        eitVar2.a |= 2;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < objArr.length) {
                Object obj = objArr[i2];
                if (obj instanceof eil) {
                    ejc ejcVar = (ejc) ((fio) ejb.d.a(dp.au, (Object) null));
                    ejcVar.c();
                    ejb ejbVar = (ejb) ejcVar.a;
                    ejbVar.a |= 1;
                    ejbVar.b = i2;
                    String string = ((eil) obj).toString();
                    ejcVar.c();
                    ejb ejbVar2 = (ejb) ejcVar.a;
                    if (string == null) {
                        throw new NullPointerException();
                    }
                    ejbVar2.a |= 2;
                    ejbVar2.c = string;
                    ejb ejbVar3 = (ejb) ((fin) ejcVar.h());
                    eiuVar.c();
                    eit eitVar3 = (eit) eiuVar.a;
                    if (ejbVar3 == null) {
                        throw new NullPointerException();
                    }
                    if (!eitVar3.e.a()) {
                        eitVar3.e = fin.a(eitVar3.e);
                    }
                    eitVar3.e.add(ejbVar3);
                }
                i = i2 + 1;
            } else {
                return eiuVar;
            }
        }
    }

    public static efk b(ecf ecfVar) {
        String strC = c(ecfVar);
        Throwable cause = (Throwable) ecfVar.l().b(ebg.a);
        if ((strC == null || strC.isEmpty()) && cause == null) {
            return null;
        }
        ebj ebjVarG = ecfVar.g();
        Level levelD = ecfVar.d();
        String strA = ebjVarG.a();
        String strB = ebjVarG.b();
        efl eflVar = (efl) ((fio) efk.i.a(dp.au, (Object) null));
        efh efhVar = a;
        eflVar.c();
        efk efkVar = (efk) eflVar.a;
        if (efhVar == null) {
            throw new NullPointerException();
        }
        efkVar.b = efhVar;
        efkVar.a |= 1;
        String name = Thread.currentThread().getName();
        eflVar.c();
        efk efkVar2 = (efk) eflVar.a;
        if (name == null) {
            throw new NullPointerException();
        }
        efkVar2.a |= 2;
        efkVar2.c = name;
        int iIntValue = levelD.intValue();
        eflVar.c();
        efk efkVar3 = (efk) eflVar.a;
        efkVar3.a |= 4;
        efkVar3.d = iIntValue;
        eflVar.c();
        efk efkVar4 = (efk) eflVar.a;
        if (strA == null) {
            throw new NullPointerException();
        }
        efkVar4.a |= 8;
        efkVar4.e = strA;
        eflVar.c();
        efk efkVar5 = (efk) eflVar.a;
        if (strB == null) {
            throw new NullPointerException();
        }
        efkVar5.a |= 16;
        efkVar5.f = strB;
        if (strC != null) {
            eflVar.c();
            efk efkVar6 = (efk) eflVar.a;
            if (strC == null) {
                throw new NullPointerException();
            }
            efkVar6.a |= 64;
            efkVar6.g = strC;
        }
        if (cause != null) {
            efr efrVar = (efr) ((fio) efq.d.a(dp.au, (Object) null));
            efn efnVarA = efs.a(cause, false);
            efrVar.c();
            efq efqVar = (efq) efrVar.a;
            efqVar.b = (efm) ((fin) efnVarA.h());
            efqVar.a |= 1;
            while (true) {
                Throwable th = cause;
                Throwable cause2 = th.getCause();
                if (!((cause2 == null || cause2 == th) ? false : true)) {
                    break;
                }
                efn efnVarA2 = efs.a(th.getCause(), false);
                efrVar.c();
                efq efqVar2 = (efq) efrVar.a;
                if (!efqVar2.c.a()) {
                    fjf fjfVar = efqVar2.c;
                    int size = fjfVar.size();
                    efqVar2.c = fjfVar.a(size == 0 ? 10 : size << 1);
                }
                efqVar2.c.add((efm) ((fin) efnVarA2.h()));
                cause = th.getCause();
            }
            eflVar.c();
            efk efkVar7 = (efk) eflVar.a;
            efkVar7.h = (efq) ((fin) efrVar.h());
            efkVar7.a |= 256;
        }
        return (efk) ((fin) eflVar.h());
    }

    static {
        efi efiVar = (efi) ((fio) efh.e.a(dp.au, (Object) null));
        efiVar.c();
        efh efhVar = (efh) efiVar.a;
        efhVar.a |= 1;
        efhVar.b = 0L;
        efiVar.c();
        efh efhVar2 = (efh) efiVar.a;
        efhVar2.a |= 2;
        efhVar2.c = 0;
        efiVar.c();
        efh efhVar3 = (efh) efiVar.a;
        efhVar3.a |= 4;
        efhVar3.d = 0;
        a = (efh) ((fin) efiVar.h());
        b = Charset.forName("UTF-8");
    }
}
