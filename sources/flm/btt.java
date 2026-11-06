package flm;

import android.accounts.Account;
import android.location.Location;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class btt {
    private static final Object a = new Object();
    private static volatile aob b;

    private static aob u() {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = new aob(ayt.a(), "KIDS_SUPERVISION", null);
                }
            }
        }
        return b;
    }

    private static void a(String str, String[] strArr, String str2, Object... objArr) {
        a(eoi.DEBUG, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a((emb) ((fin) ((emc) ((fio) emb.e.a(dp.au, (Object) null))).a(dvj.b(str)).a(Arrays.asList(strArr)).c(String.format(str2, objArr)).h())).h()));
    }

    public static void a(String str, String str2, String str3, Object... objArr) {
        a(str, new String[]{str2}, str3, objArr);
    }

    public static void a(String str, Throwable th, String str2, Object... objArr) {
        a(str, "error", "%s\nBackTrace:\n%s", String.format(str2, objArr), Log.getStackTraceString(th));
    }

    public static void a() {
        a(eoi.GCM_RECEIVED, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a(enk.e).h()));
    }

    public static void b() {
        a(eoi.REPORT_DEVICE_INFO, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a(enk.e).h()));
    }

    public static void c() {
        a(eoi.POLICY_LEVEL_FIXED, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a(enk.e).h()));
    }

    public static void a(euz euzVar) {
        a(eoi.POLICY_SYNCED, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a((enk) ((fin) ((enl) ((fio) enk.e.a(dp.au, (Object) null))).a(euzVar == euz.SERVER_CHANGE).h())).h()));
    }

    public static void a(fdc fdcVar, String str, boolean z) {
        enj enjVar = (enj) ((fio) eni.d.a(dp.au, (Object) null));
        eng engVarA = a(fdcVar, str);
        if (z) {
            enjVar.c();
            eni eniVar = (eni) enjVar.a;
            if (engVarA == null) {
                throw new NullPointerException();
            }
            if (!eniVar.b.a()) {
                eniVar.b = fin.a(eniVar.b);
            }
            eniVar.b.add(engVarA);
        } else {
            enjVar.c();
            eni eniVar2 = (eni) enjVar.a;
            if (engVarA == null) {
                throw new NullPointerException();
            }
            if (!eniVar2.c.a()) {
                eniVar2.c = fin.a(eniVar2.c);
            }
            eniVar2.c.add(engVarA);
        }
        enl enlVar = (enl) ((fio) enk.e.a(dp.au, (Object) null));
        enlVar.c();
        enk enkVar = (enk) enlVar.a;
        enkVar.c = (fin) enjVar.h();
        enkVar.b = 6;
        a(eoi.POLICY_RECEIVED, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a((enk) ((fin) enlVar.h())).h()));
    }

    public static void a(List list, List list2) {
        a(eoi.POLICY_APPLIED, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a((enk) ((fin) ((enl) ((fio) enk.e.a(dp.au, (Object) null))).a((eni) ((fin) ((enj) ((fio) eni.d.a(dp.au, (Object) null))).a(a(list)).b(a(list2)).h())).h())).h()));
    }

    public static void b(List list, List list2) {
        a(eoi.POLICY_REVOKED, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a((enk) ((fin) ((enl) ((fio) enk.e.a(dp.au, (Object) null))).a((eni) ((fin) ((enj) ((fio) eni.d.a(dp.au, (Object) null))).a(a(list)).b(a(list2)).h())).h())).h()));
    }

    private static List a(List list) {
        return dxm.a(dyk.a((Iterable) list, btu.a));
    }

    private static eng a(fdc fdcVar, String str) {
        eol eolVar;
        enh enhVar = (enh) ((fio) eng.d.a(dp.au, (Object) null));
        switch (fdcVar.ordinal()) {
            case 1:
                eolVar = eol.TYPE_IS_SUPERVISED;
                break;
            case 2:
                eolVar = eol.TYPE_DISALLOW_ACCOUNT_MANAGEMENT;
                break;
            case 3:
                eolVar = eol.TYPE_DISALLOW_FACTORY_RESET;
                break;
            case 4:
                eolVar = eol.TYPE_DISALLOW_INSTALL_UNKNOWN_RESOURCES;
                break;
            case 5:
                eolVar = eol.TYPE_DISALLOW_DEV_OPTIONS;
                break;
            case 6:
                eolVar = eol.TYPE_FORCE_ENABLE_LOCKBOX;
                break;
            case 7:
                eolVar = eol.TYPE_RING;
                break;
            case 8:
                eolVar = eol.TYPE_WIPE;
                break;
            case 9:
                eolVar = eol.TYPE_LOCATION;
                break;
            case 10:
                eolVar = eol.TYPE_HIDE_APP;
                break;
            case 11:
                eolVar = eol.TYPE_NOTIFY_LOCATION_SETTING_CHANGE;
                break;
            case 12:
                eolVar = eol.TYPE_DISALLOW_ADD_REMOVE_USER;
                break;
            case 13:
                eolVar = eol.TYPE_BROADCAST_GCM_REGISTERED;
                break;
            case 14:
                eolVar = eol.TYPE_SUPERVISED_COMMUNICATIONS;
                break;
            case 15:
                eolVar = eol.TYPE_APP_PERMISSION_CONTROL_MODE;
                break;
            case 16:
                eolVar = eol.TYPE_APP_PERMISSION_GRANT_STATE;
                break;
            case 17:
                eolVar = eol.TYPE_APP_MIN_VERSION;
                break;
            case 18:
                eolVar = eol.TYPE_PARENT_ACCESS_CODE;
                break;
            case 19:
                eolVar = eol.TYPE_LOCATION_REFRESH;
                break;
            case 20:
                eolVar = eol.TYPE_TIME_LIMIT;
                break;
            case 21:
                eolVar = eol.TYPE_SET_SCREEN_LOCK;
                break;
            case 22:
                eolVar = eol.TYPE_FACTORY_RESET_PROTECTION;
                break;
            case 23:
                eolVar = eol.TYPE_FAMILY_PLACES;
                break;
            default:
                eolVar = eol.TYPE_UNKNOWN;
                break;
        }
        enhVar.c();
        eng engVar = (eng) enhVar.a;
        if (eolVar == null) {
            throw new NullPointerException();
        }
        engVar.a |= 1;
        engVar.b = eolVar.y;
        String strB = dvj.b(str);
        enhVar.c();
        eng engVar2 = (eng) enhVar.a;
        if (strB == null) {
            throw new NullPointerException();
        }
        engVar2.a |= 2;
        engVar2.c = strB;
        return (eng) ((fin) enhVar.h());
    }

    public static void d() {
        a(eoi.RING, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a(enk.e).h()));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void a(long j, fee feeVar, euc eucVar, boolean z, etw etwVar, long j2, long j3) {
        eot eotVar;
        eua euaVar;
        eot eotVar2;
        enn ennVar;
        ffg ffgVar;
        ffc ffcVar;
        ffa ffaVar;
        enw enwVar;
        eox eoxVar;
        eov eovVar;
        ffa ffaVar2;
        ffa ffaVar3;
        enp enpVar = (enp) ((fio) enm.h.a(dp.au, (Object) null));
        enpVar.c();
        enm enmVar = (enm) enpVar.a;
        enmVar.a |= 1;
        enmVar.b = j;
        enpVar.c();
        enm enmVar2 = (enm) enpVar.a;
        enmVar2.a |= 16;
        enmVar2.f = j2;
        eno enoVarA = ((eno) ((fio) enn.i.a(dp.au, (Object) null))).a(z);
        switch (eucVar.ordinal()) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                eotVar = eot.NO_NOTIFICATION;
                break;
            case 1:
                eotVar = eot.ONE_MINUTE;
                break;
            case 2:
                eotVar = eot.FIVE_MINUTES;
                break;
            case 3:
                eotVar = eot.FIFTEEN_MINUTES;
                break;
            default:
                eotVar = eot.NO_NOTIFICATION;
                break;
        }
        eno enoVarA2 = enoVarA.a(eotVar);
        enpVar.c();
        enm enmVar3 = (enm) enpVar.a;
        enmVar3.d = (enn) ((fin) enoVarA2.h());
        enmVar3.a |= 4;
        if (etwVar == null) {
            ennVar = enn.i;
        } else {
            eno enoVarA3 = ((eno) ((fio) enn.i.a(dp.au, (Object) null))).a(etwVar.b);
            esu esuVarA = esu.a(etwVar.c);
            if (esuVarA == null) {
                esuVarA = esu.NO_ACTIVE_POLICY;
            }
            eoo eooVarA = a(esuVarA);
            enoVarA3.c();
            enn ennVar2 = (enn) enoVarA3.a;
            if (eooVarA == null) {
                throw new NullPointerException();
            }
            ennVar2.a |= 2;
            ennVar2.c = eooVarA.e;
            if (etwVar.w == null) {
                euaVar = eua.f;
            } else {
                euaVar = etwVar.w;
            }
            euc eucVarA = euc.a(euaVar.c);
            if (eucVarA == null) {
                eucVarA = euc.NO_NOTIFICATION;
            }
            switch (eucVarA.ordinal()) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    eotVar2 = eot.NO_NOTIFICATION;
                    break;
                case 1:
                    eotVar2 = eot.ONE_MINUTE;
                    break;
                case 2:
                    eotVar2 = eot.FIVE_MINUTES;
                    break;
                case 3:
                    eotVar2 = eot.FIFTEEN_MINUTES;
                    break;
                default:
                    eotVar2 = eot.NO_NOTIFICATION;
                    break;
            }
            eno enoVarA4 = enoVarA3.a(eotVar2);
            esu esuVarA2 = esu.a(etwVar.f);
            if (esuVarA2 == null) {
                esuVarA2 = esu.NO_ACTIVE_POLICY;
            }
            eoo eooVarA2 = a(esuVarA2);
            enoVarA4.c();
            enn ennVar3 = (enn) enoVarA4.a;
            if (eooVarA2 == null) {
                throw new NullPointerException();
            }
            ennVar3.a |= 8;
            ennVar3.e = eooVarA2.e;
            long j4 = etwVar.d;
            enoVarA4.c();
            enn ennVar4 = (enn) enoVarA4.a;
            ennVar4.a |= 16;
            ennVar4.f = j4;
            long j5 = etwVar.e;
            enoVarA4.c();
            enn ennVar5 = (enn) enoVarA4.a;
            ennVar5.a |= 32;
            ennVar5.g = j5;
            long j6 = etwVar.o;
            enoVarA4.c();
            enn ennVar6 = (enn) enoVarA4.a;
            ennVar6.a |= 64;
            ennVar6.h = j6;
            ennVar = (enn) ((fin) enoVarA4.h());
        }
        enpVar.c();
        enm enmVar4 = (enm) enpVar.a;
        if (ennVar == null) {
            throw new NullPointerException();
        }
        enmVar4.e = ennVar;
        enmVar4.a |= 8;
        enpVar.c();
        enm enmVar5 = (enm) enpVar.a;
        enmVar5.a |= 32;
        enmVar5.g = j3;
        ent entVar = (ent) ((fio) ens.e.a(dp.au, (Object) null));
        if (feeVar.b == null) {
            ffgVar = ffg.f;
        } else {
            ffgVar = feeVar.b;
        }
        eob eobVar = (eob) ((fio) eoa.e.a(dp.au, (Object) null));
        feu feuVarA = feu.a(ffgVar.b);
        if (feuVarA == null) {
            feuVarA = feu.UNSPECIFIED_TIME_LIMIT_STATE;
        }
        eoz eozVarA = a(feuVarA);
        eobVar.c();
        eoa eoaVar = (eoa) eobVar.a;
        if (eozVarA == null) {
            throw new NullPointerException();
        }
        eoaVar.a |= 1;
        eoaVar.b = eozVarA.d;
        long j7 = ffgVar.e;
        eobVar.c();
        eoa eoaVar2 = (eoa) eobVar.a;
        eoaVar2.a |= 2;
        eoaVar2.c = j7;
        fjf<ffi> fjfVar = ffgVar.d;
        List arrayList = new ArrayList();
        for (ffi ffiVar : fjfVar) {
            eod eodVar = (eod) ((fio) eoc.f.a(dp.au, (Object) null));
            feu feuVarA2 = feu.a(ffiVar.d);
            if (feuVarA2 == null) {
                feuVarA2 = feu.UNSPECIFIED_TIME_LIMIT_STATE;
            }
            eoz eozVarA2 = a(feuVarA2);
            eodVar.c();
            eoc eocVar = (eoc) eodVar.a;
            if (eozVarA2 == null) {
                throw new NullPointerException();
            }
            eocVar.a |= 1;
            eocVar.b = eozVarA2.d;
            exf exfVarA = exf.a(ffiVar.c);
            if (exfVarA == null) {
                exfVarA = exf.UNSPECIFIED_EFFECTIVE_DAY;
            }
            eor eorVarA = a(exfVarA);
            eodVar.c();
            eoc eocVar2 = (eoc) eodVar.a;
            if (eorVarA == null) {
                throw new NullPointerException();
            }
            eocVar2.a |= 2;
            eocVar2.c = eorVarA.i;
            if (ffiVar.f == null) {
                ffaVar2 = ffa.d;
            } else {
                ffaVar2 = ffiVar.f;
            }
            enu enuVarA = a(ffaVar2);
            eodVar.c();
            eoc eocVar3 = (eoc) eodVar.a;
            if (enuVarA == null) {
                throw new NullPointerException();
            }
            eocVar3.d = enuVarA;
            eocVar3.a |= 4;
            if (ffiVar.g == null) {
                ffaVar3 = ffa.d;
            } else {
                ffaVar3 = ffiVar.g;
            }
            enu enuVarA2 = a(ffaVar3);
            eodVar.c();
            eoc eocVar4 = (eoc) eodVar.a;
            if (enuVarA2 == null) {
                throw new NullPointerException();
            }
            eocVar4.e = enuVarA2;
            eocVar4.a |= 8;
            arrayList.add((eoc) ((fin) eodVar.h()));
        }
        eobVar.c();
        eoa eoaVar3 = (eoa) eobVar.a;
        if (!eoaVar3.d.a()) {
            eoaVar3.d = fin.a(eoaVar3.d);
        }
        List list = eoaVar3.d;
        fiv.a(arrayList);
        if (arrayList instanceof fjo) {
            List listD = ((fjo) arrayList).d();
            fjo fjoVar = (fjo) list;
            int size = list.size();
            for (Object obj : listD) {
                if (obj == null) {
                    String string = new StringBuilder(37).append("Element at index ").append(fjoVar.size() - size).append(" is null.").toString();
                    for (int size2 = fjoVar.size() - 1; size2 >= size; size2--) {
                        fjoVar.remove(size2);
                    }
                    throw new NullPointerException(string);
                }
                if (obj instanceof fgy) {
                    fjoVar.a((fgy) obj);
                } else {
                    fjoVar.add((String) obj);
                }
            }
        } else if (arrayList instanceof fkp) {
            list.addAll(arrayList);
        } else {
            if ((list instanceof ArrayList) && (arrayList instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
            }
            int size3 = list.size();
            for (Object obj2 : arrayList) {
                if (obj2 == null) {
                    String string2 = new StringBuilder(37).append("Element at index ").append(list.size() - size3).append(" is null.").toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(string2);
                }
                list.add(obj2);
            }
        }
        eoa eoaVar4 = (eoa) ((fin) eobVar.h());
        entVar.c();
        ens ensVar = (ens) entVar.a;
        if (eoaVar4 == null) {
            throw new NullPointerException();
        }
        ensVar.b = eoaVar4;
        ensVar.a |= 1;
        if (feeVar.c == null) {
            ffcVar = ffc.g;
        } else {
            ffcVar = feeVar.c;
        }
        if (ffcVar == null) {
            enwVar = enw.f;
        } else {
            enx enxVar = (enx) ((fio) enw.f.a(dp.au, (Object) null));
            feu feuVarA3 = feu.a(ffcVar.b);
            if (feuVarA3 == null) {
                feuVarA3 = feu.UNSPECIFIED_TIME_LIMIT_STATE;
            }
            eoz eozVarA3 = a(feuVarA3);
            enxVar.c();
            enw enwVar2 = (enw) enxVar.a;
            if (eozVarA3 == null) {
                throw new NullPointerException();
            }
            enwVar2.a |= 1;
            enwVar2.b = eozVarA3.d;
            long j8 = ffcVar.f;
            enxVar.c();
            enw enwVar3 = (enw) enxVar.a;
            enwVar3.a |= 2;
            enwVar3.c = j8;
            if (ffcVar.d == null) {
                ffaVar = ffa.d;
            } else {
                ffaVar = ffcVar.d;
            }
            enu enuVarA3 = a(ffaVar);
            enxVar.c();
            enw enwVar4 = (enw) enxVar.a;
            if (enuVarA3 == null) {
                throw new NullPointerException();
            }
            enwVar4.d = enuVarA3;
            enwVar4.a |= 4;
            fjf<ffe> fjfVar2 = ffcVar.e;
            List arrayList2 = new ArrayList();
            for (ffe ffeVar : fjfVar2) {
                enz enzVar = (enz) ((fio) eny.e.a(dp.au, (Object) null));
                feu feuVarA4 = feu.a(ffeVar.d);
                if (feuVarA4 == null) {
                    feuVarA4 = feu.UNSPECIFIED_TIME_LIMIT_STATE;
                }
                eoz eozVarA4 = a(feuVarA4);
                enzVar.c();
                eny enyVar = (eny) enzVar.a;
                if (eozVarA4 == null) {
                    throw new NullPointerException();
                }
                enyVar.a |= 1;
                enyVar.b = eozVarA4.d;
                exf exfVarA2 = exf.a(ffeVar.c);
                if (exfVarA2 == null) {
                    exfVarA2 = exf.UNSPECIFIED_EFFECTIVE_DAY;
                }
                eor eorVarA2 = a(exfVarA2);
                enzVar.c();
                eny enyVar2 = (eny) enzVar.a;
                if (eorVarA2 == null) {
                    throw new NullPointerException();
                }
                enyVar2.a |= 2;
                enyVar2.c = eorVarA2.i;
                int i = ffeVar.f;
                enzVar.c();
                eny enyVar3 = (eny) enzVar.a;
                enyVar3.a |= 4;
                enyVar3.d = i;
                arrayList2.add((eny) ((fin) enzVar.h()));
            }
            enxVar.c();
            enw enwVar5 = (enw) enxVar.a;
            if (!enwVar5.e.a()) {
                enwVar5.e = fin.a(enwVar5.e);
            }
            List list2 = enwVar5.e;
            fiv.a(arrayList2);
            if (arrayList2 instanceof fjo) {
                List listD2 = ((fjo) arrayList2).d();
                fjo fjoVar2 = (fjo) list2;
                int size5 = list2.size();
                for (Object obj3 : listD2) {
                    if (obj3 == null) {
                        String string3 = new StringBuilder(37).append("Element at index ").append(fjoVar2.size() - size5).append(" is null.").toString();
                        for (int size6 = fjoVar2.size() - 1; size6 >= size5; size6--) {
                            fjoVar2.remove(size6);
                        }
                        throw new NullPointerException(string3);
                    }
                    if (obj3 instanceof fgy) {
                        fjoVar2.a((fgy) obj3);
                    } else {
                        fjoVar2.add((String) obj3);
                    }
                }
            } else if (arrayList2 instanceof fkp) {
                list2.addAll(arrayList2);
            } else {
                if ((list2 instanceof ArrayList) && (arrayList2 instanceof Collection)) {
                    ((ArrayList) list2).ensureCapacity(arrayList2.size() + list2.size());
                }
                int size7 = list2.size();
                for (Object obj4 : arrayList2) {
                    if (obj4 == null) {
                        String string4 = new StringBuilder(37).append("Element at index ").append(list2.size() - size7).append(" is null.").toString();
                        for (int size8 = list2.size() - 1; size8 >= size7; size8--) {
                            list2.remove(size8);
                        }
                        throw new NullPointerException(string4);
                    }
                    list2.add(obj4);
                }
            }
            enwVar = (enw) ((fin) enxVar.h());
        }
        entVar.c();
        ens ensVar2 = (ens) entVar.a;
        if (enwVar == null) {
            throw new NullPointerException();
        }
        ensVar2.c = enwVar;
        ensVar2.a |= 2;
        fjf<fei> fjfVar3 = feeVar.e;
        List arrayList3 = new ArrayList();
        for (fei feiVar : fjfVar3) {
            enr enrVar = (enr) ((fio) enq.f.a(dp.au, (Object) null));
            fem femVarA = fem.a(feiVar.g);
            if (femVarA == null) {
                femVarA = fem.DEFAULT;
            }
            switch (femVarA.ordinal()) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    eoxVar = eox.DEFAULT;
                    break;
                case 1:
                    eoxVar = eox.DELETED;
                    break;
                default:
                    eoxVar = eox.DEFAULT;
                    break;
            }
            enrVar.c();
            enq enqVar = (enq) enrVar.a;
            if (eoxVar == null) {
                throw new NullPointerException();
            }
            enqVar.a |= 4;
            enqVar.d = eoxVar.c;
            fej fejVarA = fej.a(feiVar.e);
            if (fejVarA == null) {
                fejVarA = fej.UNSPECIFIED_ACTION;
            }
            switch (fejVarA.ordinal()) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    eovVar = eov.UNSPECIFIED_ACTION;
                    break;
                case 1:
                    eovVar = eov.LOCK;
                    break;
                case 2:
                    eovVar = eov.UNLOCK_USAGE_LIMIT;
                    break;
                case 3:
                    eovVar = eov.UNLOCK_WINDOW_LIMIT;
                    break;
                case 4:
                    eovVar = eov.UNLOCK_LOCK_OVERRIDE;
                    break;
                case 5:
                    eovVar = eov.UNLOCK_WITH_DEADLINE;
                    break;
                default:
                    eovVar = eov.UNSPECIFIED_ACTION;
                    break;
            }
            enrVar.c();
            enq enqVar2 = (enq) enrVar.a;
            if (eovVar == null) {
                throw new NullPointerException();
            }
            enqVar2.a |= 2;
            enqVar2.c = eovVar.g;
            long j9 = feiVar.d;
            enrVar.c();
            enq enqVar3 = (enq) enrVar.a;
            enqVar3.a |= 1;
            enqVar3.b = j9;
            boolean z2 = (feiVar.a & 32) == 32;
            enrVar.c();
            enq enqVar4 = (enq) enrVar.a;
            enqVar4.a |= 8;
            enqVar4.e = z2;
            arrayList3.add((enq) ((fin) enrVar.h()));
        }
        entVar.c();
        ens ensVar3 = (ens) entVar.a;
        if (!ensVar3.d.a()) {
            ensVar3.d = fin.a(ensVar3.d);
        }
        List list3 = ensVar3.d;
        fiv.a(arrayList3);
        if (arrayList3 instanceof fjo) {
            List listD3 = ((fjo) arrayList3).d();
            fjo fjoVar3 = (fjo) list3;
            int size9 = list3.size();
            for (Object obj5 : listD3) {
                if (obj5 == null) {
                    String string5 = new StringBuilder(37).append("Element at index ").append(fjoVar3.size() - size9).append(" is null.").toString();
                    for (int size10 = fjoVar3.size() - 1; size10 >= size9; size10--) {
                        fjoVar3.remove(size10);
                    }
                    throw new NullPointerException(string5);
                }
                if (obj5 instanceof fgy) {
                    fjoVar3.a((fgy) obj5);
                } else {
                    fjoVar3.add((String) obj5);
                }
            }
        } else if (arrayList3 instanceof fkp) {
            list3.addAll(arrayList3);
        } else {
            if ((list3 instanceof ArrayList) && (arrayList3 instanceof Collection)) {
                ((ArrayList) list3).ensureCapacity(arrayList3.size() + list3.size());
            }
            int size11 = list3.size();
            for (Object obj6 : arrayList3) {
                if (obj6 == null) {
                    String string6 = new StringBuilder(37).append("Element at index ").append(list3.size() - size11).append(" is null.").toString();
                    for (int size12 = list3.size() - 1; size12 >= size11; size12--) {
                        list3.remove(size12);
                    }
                    throw new NullPointerException(string6);
                }
                list3.add(obj6);
            }
        }
        enpVar.c();
        enm enmVar6 = (enm) enpVar.a;
        enmVar6.c = (ens) ((fin) entVar.h());
        enmVar6.a |= 2;
        enm enmVar7 = (enm) ((fin) enpVar.h());
        eoi eoiVar = eoi.TIME_LIMIT_STATE_CHANGED;
        ema emaVar = (ema) ((fio) elz.e.a(dp.au, (Object) null));
        enl enlVar = (enl) ((fio) enk.e.a(dp.au, (Object) null));
        enlVar.c();
        enk enkVar = (enk) enlVar.a;
        if (enmVar7 == null) {
            throw new NullPointerException();
        }
        enkVar.c = enmVar7;
        enkVar.b = 7;
        emaVar.c();
        elz elzVar = (elz) emaVar.a;
        elzVar.c = (fin) enlVar.h();
        elzVar.b = 3;
        a(eoiVar, (elz) ((fin) emaVar.h()));
    }

    private static enu a(ffa ffaVar) {
        env envVar = (env) ((fio) enu.d.a(dp.au, (Object) null));
        int i = ffaVar.b;
        envVar.c();
        enu enuVar = (enu) envVar.a;
        enuVar.a |= 1;
        enuVar.b = i;
        int i2 = ffaVar.c;
        envVar.c();
        enu enuVar2 = (enu) envVar.a;
        enuVar2.a |= 2;
        enuVar2.c = i2;
        return (enu) ((fin) envVar.h());
    }

    private static eoo a(esu esuVar) {
        switch (esuVar.ordinal()) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return eoo.NO_ACTIVE_POLICY;
            case 1:
                return eoo.OVERRIDE;
            case 2:
                return eoo.FIXED_LIMIT;
            case 3:
                return eoo.USAGE_LIMIT;
            default:
                return eoo.NO_ACTIVE_POLICY;
        }
    }

    private static eoz a(feu feuVar) {
        switch (feuVar.ordinal()) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return eoz.UNSPECIFIED_TIME_LIMIT_STATE;
            case 1:
                return eoz.TIME_LIMIT_OFF;
            case 2:
                return eoz.TIME_LIMIT_ON;
            default:
                return eoz.UNSPECIFIED_TIME_LIMIT_STATE;
        }
    }

    private static eor a(exf exfVar) {
        switch (exfVar.ordinal()) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return eor.UNSPECIFIED_EFFECTIVE_DAY;
            case 1:
                return eor.MONDAY;
            case 2:
                return eor.TUESDAY;
            case 3:
                return eor.WEDNESDAY;
            case 4:
                return eor.THURSDAY;
            case 5:
                return eor.FRIDAY;
            case 6:
                return eor.SATURDAY;
            case 7:
                return eor.SUNDAY;
            default:
                return eor.UNSPECIFIED_EFFECTIVE_DAY;
        }
    }

    public static void e() {
        a(eoi.DEVICE_LOCKED, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a((enk) ((fin) ((enl) ((fio) enk.e.a(dp.au, (Object) null))).a(true).h())).h()));
    }

    public static void f() {
        a(eoi.DEVICE_LOCKED, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a((enk) ((fin) ((enl) ((fio) enk.e.a(dp.au, (Object) null))).a(false).h())).h()));
    }

    public static void a(ene eneVar) {
        enl enlVar = (enl) ((fio) enk.e.a(dp.au, (Object) null));
        enlVar.c();
        enk enkVar = (enk) enlVar.a;
        if (eneVar == null) {
            throw new NullPointerException();
        }
        enkVar.c = eneVar;
        enkVar.b = 10;
        a(eoi.LOCK_SCREEN_SUMMARY, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a((enk) ((fin) enlVar.h())).h()));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void a(Map map, Map map2, int i, boolean z) {
        emr emrVar = (emr) ((fio) emq.b.a(dp.au, (Object) null));
        Set setKeySet = map.keySet();
        emrVar.c();
        emq emqVar = (emq) emrVar.a;
        if (!emqVar.a.a()) {
            emqVar.a = fin.a(emqVar.a);
        }
        List list = emqVar.a;
        fiv.a(setKeySet);
        if (setKeySet instanceof fjo) {
            List listD = ((fjo) setKeySet).d();
            fjo fjoVar = (fjo) list;
            int size = list.size();
            for (Object obj : listD) {
                if (obj == null) {
                    String string = new StringBuilder(37).append("Element at index ").append(fjoVar.size() - size).append(" is null.").toString();
                    for (int size2 = fjoVar.size() - 1; size2 >= size; size2--) {
                        fjoVar.remove(size2);
                    }
                    throw new NullPointerException(string);
                }
                if (obj instanceof fgy) {
                    fjoVar.a((fgy) obj);
                } else {
                    fjoVar.add((String) obj);
                }
            }
        } else if (setKeySet instanceof fkp) {
            list.addAll(setKeySet);
        } else {
            if ((list instanceof ArrayList) && (setKeySet instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(setKeySet.size() + list.size());
            }
            int size3 = list.size();
            for (Object obj2 : setKeySet) {
                if (obj2 == null) {
                    String string2 = new StringBuilder(37).append("Element at index ").append(list.size() - size3).append(" is null.").toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(string2);
                }
                list.add(obj2);
            }
        }
        emq emqVar2 = (emq) ((fin) emrVar.h());
        enl enlVar = (enl) ((fio) enk.e.a(dp.au, (Object) null));
        enlVar.c();
        enk enkVar = (enk) enlVar.a;
        if (emqVar2 == null) {
            throw new NullPointerException();
        }
        enkVar.c = emqVar2;
        enkVar.b = 3;
        a(eoi.APP_ENABLED, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a((enk) ((fin) enlVar.h())).h()));
        String[] strArr = new String[3];
        strArr[0] = "AppEnabled";
        strArr[1] = new StringBuilder(18).append("status-").append(i).toString();
        strArr[2] = z ? "geller" : "non-geller";
        for (Map.Entry entry : map.entrySet()) {
            a("Policy", strArr, "%s enabled - reasons: %s -> %s", entry.getKey(), ((sj) entry.getValue()).a, ((sj) entry.getValue()).b);
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            a("Policy", strArr, "%s disabled - reasons: %s -> %s", entry2.getKey(), ((sj) entry2.getValue()).a, ((sj) entry2.getValue()).b);
        }
    }

    public static void a(boolean z, String str) {
        Object[] objArr = new Object[2];
        objArr[0] = z ? "disable" : "enable";
        objArr[1] = str;
        a("Policy", "AppEnabledFailed", "Failed to %s %s", objArr);
    }

    public static void a(fae faeVar) {
        emw emwVar;
        emv emvVar = (emv) ((fio) emu.c.a(dp.au, (Object) null));
        switch (faeVar.ordinal()) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                emwVar = emw.UNKNOWN;
                break;
            case 1:
                emwVar = emw.OFF;
                break;
            case 2:
                emwVar = emw.HIGH_ACCURACY;
                break;
            case 3:
                emwVar = emw.BATTERY_SAVING;
                break;
            case 4:
                emwVar = emw.DEVICE_ONLY;
                break;
            default:
                emwVar = emw.UNKNOWN;
                break;
        }
        emvVar.c();
        emu emuVar = (emu) emvVar.a;
        if (emwVar == null) {
            throw new NullPointerException();
        }
        emuVar.a |= 1;
        emuVar.b = emwVar.f;
        emu emuVar2 = (emu) ((fin) emvVar.h());
        enl enlVar = (enl) ((fio) enk.e.a(dp.au, (Object) null));
        enlVar.c();
        enk enkVar = (enk) enlVar.a;
        if (emuVar2 == null) {
            throw new NullPointerException();
        }
        enkVar.c = emuVar2;
        enkVar.b = 4;
        a(eoi.LOCATION_MODE_CHANGED, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a((enk) ((fin) enlVar.h())).h()));
    }

    public static void a(String str) {
        eog eogVar;
        switch (str) {
            case "no_add_user":
                eogVar = eog.ALLOW_ADD_REMOVE_USER;
                break;
            case "no_install_unknown_sources":
                eogVar = eog.ALLOW_INSTALL_UNKNOWN_SOURCES;
                break;
            case "no_sms":
                eogVar = eog.ALLOW_SMS;
                break;
            case "no_outgoing_calls":
                eogVar = eog.ALLOW_OUTGOING_CALLS;
                break;
            default:
                eogVar = eog.UNKNOWN;
                break;
        }
        enl enlVar = (enl) ((fio) enk.e.a(dp.au, (Object) null));
        eof eofVar = (eof) ((fio) eoe.c.a(dp.au, (Object) null));
        eofVar.c();
        eoe eoeVar = (eoe) eofVar.a;
        if (eogVar == null) {
            throw new NullPointerException();
        }
        eoeVar.a |= 1;
        eoeVar.b = eogVar.f;
        enlVar.c();
        enk enkVar = (enk) enlVar.a;
        enkVar.c = (fin) eofVar.h();
        enkVar.b = 5;
        a(eoi.USER_MANAGER_RESTRICTION, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a((enk) ((fin) enlVar.h())).h()));
    }

    public static void a(boolean z) {
        a(eoi.ACCOUNT_MANAGEMENT_ENABLED, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a((enk) ((fin) ((enl) ((fio) enk.e.a(dp.au, (Object) null))).a(z).h())).h()));
    }

    public static void g() {
        a(eoi.FORCE_ENABLE_LOCKBOX_SET, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a((enk) ((fin) ((enl) ((fio) enk.e.a(dp.au, (Object) null))).a(true).h())).h()));
    }

    public static void h() {
        a(eoi.SET_SCREEN_LOCK, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a(enk.e).h()));
    }

    public static void i() {
        a(eoi.BOOT_COMPLETED, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a(enk.e).h()));
    }

    public static void j() {
        a(eoi.APP_INSTALLED, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a((enk) ((fin) ((enl) ((fio) enk.e.a(dp.au, (Object) null))).a(true).h())).h()));
    }

    public static void k() {
        a(eoi.APP_INSTALLED, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a((enk) ((fin) ((enl) ((fio) enk.e.a(dp.au, (Object) null))).a(false).h())).h()));
    }

    public static void l() {
        a(eoi.SUPERVISION_RESTARTED, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a(enk.e).h()));
    }

    public static void m() {
        a(eoi.NON_UNICORN_ACCOUNT_REMOVED, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a(enk.e).h()));
    }

    public static void n() {
        a(eoi.OTHER_UNICORN_ACCOUNT_REMOVED, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a(enk.e).h()));
    }

    public static void o() {
        String strA;
        enk enkVar;
        try {
            strA = bts.a(bts.b());
        } catch (alt | IOException e) {
            btv.c("Clearcut", e, "Failed to get supervised account ID", new Object[0]);
            strA = null;
        }
        if (strA != null) {
            enl enlVar = (enl) ((fio) enk.e.a(dp.au, (Object) null));
            emt emtVar = (emt) ((fio) ems.d.a(dp.au, (Object) null));
            emtVar.c();
            ems emsVar = (ems) emtVar.a;
            if (strA == null) {
                throw new NullPointerException();
            }
            emsVar.b = 1;
            emsVar.c = strA;
            enlVar.c();
            enk enkVar2 = (enk) enlVar.a;
            enkVar2.d = (ems) ((fin) emtVar.h());
            enkVar2.a |= 512;
            enkVar = (enk) ((fin) enlVar.h());
        } else {
            enkVar = enk.e;
        }
        a(eoi.SUPERVISED_ACCOUNT_REMOVED_BY_USER, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a(enkVar).h()));
    }

    public static void p() {
        a(eoi.SECONDARY_ACCOUNT_ADDED_BY_USER, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a(enk.e).h()));
    }

    public static void q() {
        a(eoi.SECONDARY_ACCOUNT_REMOVED_BY_USER, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a(enk.e).h()));
    }

    public static void r() {
        a(eoi.MISSING_CONSENT_STATUSES, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a(enk.e).h()));
    }

    public static void s() {
        a(eoi.HAS_SECONDARY_ACCOUNT_WITH_CONSENT, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a(enk.e).h()));
    }

    public static void a(Integer num, int i) {
        a("Policy", "SupervisionStateChanged", "Supervision state changed: %s => %s", num, Integer.valueOf(i));
    }

    public static void a(int i, elz elzVar, String str, long j, long j2) {
        Object[] objArr = {Integer.valueOf(i), str};
        aog aogVarA = u().a(elzVar);
        aogVarA.e = "KIDS_SUPERVISION";
        aog aogVarA2 = aogVarA.a(i).a(str);
        aogVarA2.i.a(j);
        aogVarA2.i.b(j2);
        fnh fnhVar = aogVarA2.i;
        aoj aojVar = aogVarA2.a.m;
        fnhVar.c(aoj.a(aogVarA2.i.a()));
        aogVarA2.a();
    }

    private static void a(eoi eoiVar, elz elzVar) {
        new Object[1][0] = eoiVar;
        aog aogVarA = u().a(elzVar);
        aogVarA.e = "KIDS_SUPERVISION";
        aog aogVarA2 = aogVarA.a(eoiVar.ah);
        List listA = bts.a();
        Account account = listA.isEmpty() ? null : (Account) listA.get(0);
        aogVarA2.a(account == null ? null : account.name).a();
    }

    private static void a(eoi eoiVar, emf emfVar) {
        elx elxVar = (elx) ((fio) elw.c.a(dp.au, (Object) null));
        elxVar.c();
        elw elwVar = (elw) elxVar.a;
        if (emfVar == null) {
            throw new NullPointerException();
        }
        elwVar.b = emfVar;
        elwVar.a |= 1;
        a(eoiVar, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a((elw) ((fin) elxVar.h())).h()));
    }

    private static void a(eoi eoiVar, String str) {
        a(eoiVar, (emf) ((fin) ((emg) ((fio) emf.e.a(dp.au, (Object) null))).a(str).h()));
    }

    private static void a(eoi eoiVar, String str, String str2, Throwable th) {
        emc emcVarB = ((emc) ((fio) emb.e.a(dp.au, (Object) null))).a("Location").b("error");
        String stackTraceString = Log.getStackTraceString(th);
        a(eoiVar, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a((elw) ((fin) ((elx) ((fio) elw.c.a(dp.au, (Object) null))).a(((emg) ((fio) emf.e.a(dp.au, (Object) null))).a(str)).h())).a((emb) ((fin) emcVarB.c(new StringBuilder(String.valueOf(str2).length() + 12 + String.valueOf(stackTraceString).length()).append(str2).append("\nBackTrace:\n").append(stackTraceString).toString()).h())).h()));
    }

    private static void a(eoi eoiVar, String str, String str2, String str3, String... strArr) {
        emc emcVarA = ((emc) ((fio) emb.e.a(dp.au, (Object) null))).a("Location").b("gms_status").a(Arrays.asList(strArr));
        String strValueOf = String.valueOf(str2);
        String strValueOf2 = String.valueOf(str3);
        a(eoiVar, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a((elw) ((fin) ((elx) ((fio) elw.c.a(dp.au, (Object) null))).a(((emg) ((fio) emf.e.a(dp.au, (Object) null))).a(str)).h())).a((emb) ((fin) emcVarA.c(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf)).h())).h()));
    }

    public static void b(String str) {
        a(eoi.LOCATION_REFRESHER_NOTIFICATION_REACHED, str);
    }

    public static void c(String str) {
        a(eoi.LOCATION_REFRESHER_NOTIFICATION_HANDLED, str);
    }

    public static void d(String str) {
        a(eoi.LOCATION_REFRESHER_NOTIFICATION_SUPPRESSED, str);
    }

    public static void a(String str, ctf ctfVar) {
        emg emgVarA = ((emg) ((fio) emf.e.a(dp.au, (Object) null))).a(str);
        epi epiVar = (epi) ((fio) eph.d.a(dp.au, (Object) null));
        boolean zA = ctfVar.a();
        epiVar.c();
        eph ephVar = (eph) epiVar.a;
        ephVar.a |= 1;
        ephVar.b = zA;
        boolean zC = ctfVar.c();
        epiVar.c();
        eph ephVar2 = (eph) epiVar.a;
        ephVar2.a |= 2;
        ephVar2.c = zC;
        emgVarA.c();
        emf emfVar = (emf) emgVarA.a;
        emfVar.c = (eph) ((fin) epiVar.h());
        emfVar.a |= 2;
        a(eoi.LOCATION_REFRESHER_ULR_CHECK_RESULT, (emf) ((fin) emgVarA.h()));
    }

    public static void e(String str) {
        a(eoi.LOCATION_REFRESHER_ULR_FORCE_SYNC, str);
    }

    public static void f(String str) {
        a(eoi.LOCATION_REFRESHER_ULR_CHECK_SUCCEEDED, str);
    }

    public static void g(String str) {
        a(eoi.LOCATION_REFRESHER_ULR_CHECK_FAILED, str);
    }

    public static void a(String str, Status status) {
        a(eoi.LOCATION_REFRESHER_ULR_CHECK_ERROR, str, "Error while checking reporting setting results.", status.toString(), new String[0]);
    }

    public static void a(String str, Exception exc) {
        a(eoi.LOCATION_REFRESHER_ULR_CHECK_ERROR, str, "Exception while force syncing reporting settings.", exc);
    }

    public static void a(String str, apx apxVar) {
        a(eoi.LOCATION_REFRESHER_ULR_CHECK_ERROR, str, "Error while connected to Google API client.", apxVar.toString(), new String[0]);
    }

    public static void a(String str, Location location) {
        emg emgVarA = ((emg) ((fio) emf.e.a(dp.au, (Object) null))).a(str);
        eme emeVar = (eme) ((fio) emd.g.a(dp.au, (Object) null));
        long time = location.getTime();
        emeVar.c();
        emd emdVar = (emd) emeVar.a;
        emdVar.a |= 1;
        emdVar.b = time;
        int iRound = Math.round(location.getAccuracy());
        emeVar.c();
        emd emdVar2 = (emd) emeVar.a;
        emdVar2.a |= 2;
        emdVar2.c = iRound;
        float speed = location.getSpeed();
        emeVar.c();
        emd emdVar3 = (emd) emeVar.a;
        emdVar3.a |= 4;
        emdVar3.d = speed;
        String provider = location.getProvider();
        emeVar.c();
        emd emdVar4 = (emd) emeVar.a;
        if (provider == null) {
            throw new NullPointerException();
        }
        emdVar4.a |= 8;
        emdVar4.e = provider;
        boolean zIsFromMockProvider = location.isFromMockProvider();
        emeVar.c();
        emd emdVar5 = (emd) emeVar.a;
        emdVar5.a |= 16;
        emdVar5.f = zIsFromMockProvider;
        emgVarA.c();
        emf emfVar = (emf) emgVarA.a;
        emfVar.d = (emd) ((fin) emeVar.h());
        emfVar.a |= 4;
        a(eoi.LOCATION_REFRESHER_LOCATION_FIX_RESULT, (emf) ((fin) emgVarA.h()));
    }

    public static void h(String str) {
        a(eoi.LOCATION_REFRESHER_LOCATION_FIX_SUCCEEDED, str);
    }

    public static void a(String str, Throwable th) {
        a(eoi.LOCATION_REFRESHER_LOCATION_FIX_ERROR, str, "Exception while obtaining location fixes.", th);
    }

    public static void i(String str) {
        a(eoi.LOCATION_REFRESHER_UPLOAD_SUCCEEDED, str);
    }

    public static void b(String str, Status status) {
        a(eoi.LOCATION_REFRESHER_UPLOAD_ERROR, str, "Error while uploading location.", status.toString(), new String[0]);
    }

    public static void a(ena enaVar) {
        ema emaVar = (ema) ((fio) elz.e.a(dp.au, (Object) null));
        enl enlVar = (enl) ((fio) enk.e.a(dp.au, (Object) null));
        enlVar.c();
        enk enkVar = (enk) enlVar.a;
        if (enaVar == null) {
            throw new NullPointerException();
        }
        enkVar.c = enaVar;
        enkVar.b = 8;
        emaVar.a((enk) ((fin) enlVar.h()));
        a(eoi.LOCK_SCREEN_OBSERVER_DETERMINATION, (elz) ((fin) emaVar.h()));
    }

    public static void a(eoi eoiVar, elp elpVar) {
        a(eoiVar, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a(elpVar).h()));
    }

    public static void t() {
        a(eoi.PERSISTENT_NOTIFICATION_DISPLAYED, elz.e);
    }

    public static void a(elp elpVar, Throwable th, String str, Object... objArr) {
        a(eoi.JOB_FAILED, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a(elpVar).a((emb) ((fin) ((emc) ((fio) emb.e.a(dp.au, (Object) null))).a("Job").c(String.format("%s\n%s", String.format(str, objArr), Log.getStackTraceString(th))).h())).h()));
    }

    static final /* synthetic */ eng a(fda fdaVar) {
        fdc fdcVarA = fdc.a(fdaVar.b);
        if (fdcVarA == null) {
            fdcVarA = fdc.TYPE_UNKNOWN;
        }
        return a(fdcVarA, fdaVar.c);
    }
}
