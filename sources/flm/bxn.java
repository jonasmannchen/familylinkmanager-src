package flm;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import com.google.android.gms.kids.database.SupervisionDatabase;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxn {
    public static fdp a(boolean z, euz euzVar, boolean z2) throws bxj {
        btv.c("Report", "Start reporting states:%s, %s", Boolean.valueOf(z), euzVar);
        bvj bvjVarM = SupervisionDatabase.h().m();
        bvn[] bvnVarArrA = bvjVarM.a();
        if (!z) {
            for (bvn bvnVar : bvnVarArrA) {
                if (3 == bvnVar.b) {
                    z = true;
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList = new ArrayList();
        if (z) {
            hashSet.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
        }
        for (bvn bvnVar2 : bvnVarArrA) {
            switch (bvnVar2.b) {
                case 1:
                    if (bvnVar2.e.length > 0) {
                        arrayList.add(a(ewt.APP_INSTALLED, bvnVar2.c, a(bvnVar2)));
                    }
                    break;
                case 2:
                case 9:
                    break;
                case 3:
                    continue;
                    break;
                case 4:
                    hashSet.add(4);
                    continue;
                    break;
                case 5:
                case 6:
                case 7:
                    hashSet.add(6);
                    continue;
                    break;
                case 8:
                    hashSet.add(7);
                    continue;
                    break;
                case 10:
                    hashSet.add(2);
                    hashSet.add(5);
                    hashSet.add(6);
                    continue;
                    break;
                case 11:
                    hashSet.add(8);
                    continue;
                    break;
                case 12:
                    ewr ewrVarA = a(bvnVar2);
                    if (ewrVarA != null && ewrVarA.b == 1) {
                        fcu fcuVar = ewrVarA.b == 1 ? (fcu) ewrVarA.c : fcu.d;
                        fdc fdcVarA = fdc.a((fcuVar.b == null ? fda.d : fcuVar.b).b);
                        if (fdcVarA == null) {
                            fdcVarA = fdc.TYPE_UNKNOWN;
                        }
                        switch (fdcVarA.ordinal()) {
                            case 3:
                            case 4:
                            case 5:
                            case 12:
                                hashSet.add(10);
                                break;
                            case 22:
                                hashSet.add(9);
                                break;
                        }
                    }
                    arrayList.add(a(ewt.POLICY_APPLIED, bvnVar2.c, ewrVarA));
                    continue;
                    break;
                case 13:
                    arrayList.add(a(ewt.TIME_LIMIT_LOCAL_OVERRIDE, bvnVar2.c, a(bvnVar2)));
                    continue;
                    break;
                case 14:
                    arrayList.add(a(ewt.PARENT_ACCESS_CODE_USED, bvnVar2.c, a(bvnVar2)));
                    continue;
                    break;
                case 15:
                    hashSet.add(12);
                    continue;
                    break;
                case 16:
                    hashSet.add(2);
                    continue;
                    break;
                default:
                    btv.d("Report", "Unexpected event type:%s", Integer.valueOf(bvnVar2.b));
                    btt.a("Report", "", "Unexpected event type:%s", Integer.valueOf(bvnVar2.b));
                    continue;
                    break;
            }
            hashSet2.add(bvnVar2.d);
            if ("com.google.android.gms".equals(bvnVar2.d)) {
                hashSet.add(3);
            }
        }
        fdp fdpVarA = a(euzVar, z ? ewl.FULL_REPORT : ewl.PARTIAL_REPORT, a(hashSet, a(z, hashSet2)), arrayList, z2);
        bvjVarM.b(bvnVarArrA);
        btv.c("Report", "Successfully report states:%s, %s", Boolean.valueOf(z), euzVar);
        return fdpVarA;
    }

    private static ewr a(bvn bvnVar) {
        try {
            return (ewr) fin.b(ewr.d, bvnVar.e, fib.b());
        } catch (fjg e) {
            btv.c("Report", e, "Failed to get event data:%s", Integer.valueOf(bvnVar.b));
            btt.a("Report", e, "Failed to get event data:%s", Integer.valueOf(bvnVar.b));
            return null;
        }
    }

    private static ewp a(ewt ewtVar, long j, ewr ewrVar) {
        ewq ewqVar = (ewq) ((fio) ewp.e.a(dp.au, (Object) null));
        ewqVar.c();
        ewp ewpVar = (ewp) ewqVar.a;
        if (ewtVar == null) {
            throw new NullPointerException();
        }
        ewpVar.a |= 1;
        ewpVar.b = ewtVar.e;
        ewqVar.c();
        ewp ewpVar2 = (ewp) ewqVar.a;
        ewpVar2.a |= 2;
        ewpVar2.c = j;
        ewqVar.c();
        ewp ewpVar3 = (ewp) ewqVar.a;
        if (ewrVar == null) {
            throw new NullPointerException();
        }
        ewpVar3.d = ewrVar;
        ewpVar3.a |= 4;
        return (ewp) ((fin) ewqVar.h());
    }

    private static List a(boolean z, Set set) {
        PackageManager packageManager = ayt.a().getPackageManager();
        int i = btb.c | 64 | 4096;
        if (z) {
            return packageManager.getInstalledPackages(i);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                arrayList.add(packageManager.getPackageInfo(str, i));
            } catch (PackageManager.NameNotFoundException e) {
                btv.c("Report", e, "Can't get package info of %s", str);
                btt.a("Report", e, "Can't get package info of %s", str);
            }
        }
        return arrayList;
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
    private static List a(Set set, List list) {
        List listEmptyList;
        ewh ewhVar;
        List listEmptyList2;
        ewj ewjVar;
        List listEmptyList3;
        exu exuVar;
        ArrayList arrayList = new ArrayList();
        bxl bxlVar = new bxl();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            switch (iIntValue) {
                case 1:
                    List listA = bts.a();
                    ewy ewyVar = (ewy) ((fio) ewx.d.a(dp.au, (Object) null));
                    eyl eylVar = (eyl) ((fio) eyk.b.a(dp.au, (Object) null));
                    List listAsList = Arrays.asList(bhp.a(listA));
                    eylVar.c();
                    eyk eykVar = (eyk) eylVar.a;
                    if (!eykVar.a.a()) {
                        eykVar.a = fin.a(eykVar.a);
                    }
                    List list2 = eykVar.a;
                    fiv.a(listAsList);
                    if (listAsList instanceof fjo) {
                        List listD = ((fjo) listAsList).d();
                        fjo fjoVar = (fjo) list2;
                        int size = list2.size();
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
                    } else if (listAsList instanceof fkp) {
                        list2.addAll(listAsList);
                    } else {
                        if ((list2 instanceof ArrayList) && (listAsList instanceof Collection)) {
                            ((ArrayList) list2).ensureCapacity(listAsList.size() + list2.size());
                        }
                        int size3 = list2.size();
                        for (Object obj2 : listAsList) {
                            if (obj2 == null) {
                                String string2 = new StringBuilder(37).append("Element at index ").append(list2.size() - size3).append(" is null.").toString();
                                for (int size4 = list2.size() - 1; size4 >= size3; size4--) {
                                    list2.remove(size4);
                                }
                                throw new NullPointerException(string2);
                            }
                            list2.add(obj2);
                        }
                    }
                    ewyVar.c();
                    ewx ewxVar = (ewx) ewyVar.a;
                    ewxVar.c = (fin) eylVar.h();
                    ewxVar.b = 5;
                    arrayList.add((ewx) ((fin) ewyVar.h()));
                    ewy ewyVar2 = (ewy) ((fio) ewx.d.a(dp.au, (Object) null));
                    fdh fdhVar = (fdh) ((fio) fdg.c.a(dp.au, (Object) null));
                    if (bhp.b(bxlVar.a)) {
                        ewjVar = ewj.PRIMARY;
                    } else {
                        ewjVar = ewj.SECONDARY;
                    }
                    fdhVar.c();
                    fdg fdgVar = (fdg) fdhVar.a;
                    if (ewjVar == null) {
                        throw new NullPointerException();
                    }
                    fdgVar.a |= 1;
                    fdgVar.b = ewjVar.c;
                    ewyVar2.c();
                    ewx ewxVar2 = (ewx) ewyVar2.a;
                    ewxVar2.c = (fin) fdhVar.h();
                    ewxVar2.b = 9;
                    arrayList.add((ewx) ((fin) ewyVar2.h()));
                    break;
                    break;
                case 2:
                    ewy ewyVar3 = (ewy) ((fio) ewx.d.a(dp.au, (Object) null));
                    esx esxVar = (esx) ((fio) esw.f.a(dp.au, (Object) null));
                    String str = Build.TYPE;
                    esxVar.c();
                    esw eswVar = (esw) esxVar.a;
                    if (str == null) {
                        throw new NullPointerException();
                    }
                    eswVar.a |= 1;
                    eswVar.b = str;
                    String str2 = Build.ID;
                    esxVar.c();
                    esw eswVar2 = (esw) esxVar.a;
                    if (str2 == null) {
                        throw new NullPointerException();
                    }
                    eswVar2.a |= 2;
                    eswVar2.c = str2;
                    String str3 = Build.FINGERPRINT;
                    esxVar.c();
                    esw eswVar3 = (esw) esxVar.a;
                    if (str3 == null) {
                        throw new NullPointerException();
                    }
                    eswVar3.a |= 4;
                    eswVar3.d = str3;
                    int i = Build.VERSION.SDK_INT;
                    esxVar.c();
                    esw eswVar4 = (esw) esxVar.a;
                    eswVar4.a |= 8;
                    eswVar4.e = i;
                    ewyVar3.c();
                    ewx ewxVar3 = (ewx) ewyVar3.a;
                    ewxVar3.c = (fin) esxVar.h();
                    ewxVar3.b = 1;
                    arrayList.add((ewx) ((fin) ewyVar3.h()));
                    feb febVar = (feb) ((fio) fdz.b.a(dp.au, (Object) null));
                    if (bxlVar.c.getPhoneType() != 0) {
                        febVar.a(fdx.SUPPORT_VOICE);
                    }
                    if (bxlVar.c.isSmsCapable()) {
                        febVar.a(fdx.SUPPORT_SMS);
                    }
                    if (!buf.b() || buf.a() != null) {
                        febVar.a(fdx.SUPPORTS_PASSWORD_CHANGE);
                    }
                    ewy ewyVar4 = (ewy) ((fio) ewx.d.a(dp.au, (Object) null));
                    ewyVar4.c();
                    ewx ewxVar4 = (ewx) ewyVar4.a;
                    ewxVar4.c = (fin) febVar.h();
                    ewxVar4.b = 3;
                    arrayList.add((ewx) ((fin) ewyVar4.h()));
                    break;
                    break;
                case 3:
                    arrayList.addAll(bxlVar.a());
                    break;
                case 4:
                    fdw fdwVar = (fdw) ((fio) fdv.f.a(dp.au, (Object) null));
                    bvs bvsVarA = SupervisionDatabase.h().n().a();
                    if (bvsVarA != null) {
                        String str4 = bvsVarA.b;
                        fdwVar.c();
                        fdv fdvVar = (fdv) fdwVar.a;
                        if (str4 == null) {
                            throw new NullPointerException();
                        }
                        fdvVar.a |= 2;
                        fdvVar.c = str4;
                        int i2 = bvsVarA.c;
                        fdwVar.c();
                        fdv fdvVar2 = (fdv) fdwVar.a;
                        fdvVar2.a |= 4;
                        fdvVar2.d = i2;
                        int i3 = bvsVarA.d;
                        fdwVar.c();
                        fdv fdvVar3 = (fdv) fdwVar.a;
                        fdvVar3.a |= 1;
                        fdvVar3.b = i3;
                        if (bte.f(bxlVar.d)) {
                            fdwVar.a(!bxlVar.d.isUninstallBlocked(btb.a, ((fdv) fdwVar.a).c));
                        } else {
                            fdwVar.a(true);
                        }
                    }
                    ewy ewyVar5 = (ewy) ((fio) ewx.d.a(dp.au, (Object) null));
                    ewyVar5.c();
                    ewx ewxVar5 = (ewx) ewyVar5.a;
                    ewxVar5.c = (fin) fdwVar.h();
                    ewxVar5.b = 11;
                    arrayList.addAll(Collections.singletonList((ewx) ((fin) ewyVar5.h())));
                    break;
                case 5:
                    ewy ewyVar6 = (ewy) ((fio) ewx.d.a(dp.au, (Object) null));
                    fdk fdkVar = (fdk) ((fio) fdj.c.a(dp.au, (Object) null));
                    long jB = btj.b() - btj.c();
                    fdkVar.c();
                    fdj fdjVar = (fdj) fdkVar.a;
                    fdjVar.a |= 1;
                    fdjVar.b = jB;
                    ewyVar6.c();
                    ewx ewxVar6 = (ewx) ewyVar6.a;
                    ewxVar6.c = (fin) fdkVar.h();
                    ewxVar6.b = 10;
                    arrayList.add((ewx) ((fin) ewyVar6.h()));
                    break;
                case 6:
                    ewy ewyVar7 = (ewy) ((fio) ewx.d.a(dp.au, (Object) null));
                    evc evcVar = (evc) ((fio) evb.e.a(dp.au, (Object) null));
                    long jB2 = btj.b();
                    evcVar.c();
                    evb evbVar = (evb) evcVar.a;
                    evbVar.a |= 2;
                    evbVar.c = jB2;
                    long jA = btj.a();
                    evcVar.c();
                    evb evbVar2 = (evb) evcVar.a;
                    evbVar2.a |= 4;
                    evbVar2.d = jA;
                    String id = TimeZone.getDefault().getID();
                    evcVar.c();
                    evb evbVar3 = (evb) evcVar.a;
                    if (id == null) {
                        throw new NullPointerException();
                    }
                    evbVar3.a |= 1;
                    evbVar3.b = id;
                    ewyVar7.c();
                    ewx ewxVar7 = (ewx) ewyVar7.a;
                    ewxVar7.c = (fin) evcVar.h();
                    ewxVar7.b = 4;
                    arrayList.add((ewx) ((fin) ewyVar7.h()));
                    break;
                    break;
                case 7:
                    int i4 = Settings.Secure.getInt(bxlVar.a.getContentResolver(), "location_mode", 0);
                    ewy ewyVar8 = (ewy) ((fio) ewx.d.a(dp.au, (Object) null));
                    faj fajVar = (faj) ((fio) fai.c.a(dp.au, (Object) null));
                    int i5 = btw.a(i4).f;
                    fajVar.c();
                    fai faiVar = (fai) fajVar.a;
                    faiVar.a |= 1;
                    faiVar.b = i5;
                    ewyVar8.c();
                    ewx ewxVar8 = (ewx) ewyVar8.a;
                    ewxVar8.c = (fin) fajVar.h();
                    ewxVar8.b = 6;
                    arrayList.add((ewx) ((fin) ewyVar8.h()));
                    break;
                case 8:
                    long jB3 = btj.b();
                    long jA2 = new bzb().a(btj.c());
                    SupervisionDatabase.h().p().a("last_reported_usage_ms", jA2);
                    ewy ewyVar9 = (ewy) ((fio) ewx.d.a(dp.au, (Object) null));
                    fdu fduVar = (fdu) ((fio) fdt.d.a(dp.au, (Object) null));
                    fduVar.c();
                    fdt fdtVar = (fdt) fduVar.a;
                    fdtVar.a |= 1;
                    fdtVar.b = jB3;
                    fduVar.c();
                    fdt fdtVar2 = (fdt) fduVar.a;
                    fdtVar2.a |= 2;
                    fdtVar2.c = jA2;
                    ewyVar9.c();
                    ewx ewxVar9 = (ewx) ewyVar9.a;
                    ewxVar9.c = (fin) fduVar.h();
                    ewxVar9.b = 13;
                    arrayList.add((ewx) ((fin) ewyVar9.h()));
                    break;
                case 9:
                    ewy ewyVar10 = (ewy) ((fio) ewx.d.a(dp.au, (Object) null));
                    if (bte.f(bxlVar.d)) {
                        exv exvVar = (exv) ((fio) exu.b.a(dp.au, (Object) null));
                        List listAsList2 = Arrays.asList(bte.b(bxlVar.d));
                        exvVar.c();
                        exu exuVar2 = (exu) exvVar.a;
                        if (!exuVar2.a.a()) {
                            exuVar2.a = fin.a(exuVar2.a);
                        }
                        List list3 = exuVar2.a;
                        fiv.a(listAsList2);
                        if (listAsList2 instanceof fjo) {
                            List listD2 = ((fjo) listAsList2).d();
                            fjo fjoVar2 = (fjo) list3;
                            int size5 = list3.size();
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
                        } else if (listAsList2 instanceof fkp) {
                            list3.addAll(listAsList2);
                        } else {
                            if ((list3 instanceof ArrayList) && (listAsList2 instanceof Collection)) {
                                ((ArrayList) list3).ensureCapacity(listAsList2.size() + list3.size());
                            }
                            int size7 = list3.size();
                            for (Object obj4 : listAsList2) {
                                if (obj4 == null) {
                                    String string4 = new StringBuilder(37).append("Element at index ").append(list3.size() - size7).append(" is null.").toString();
                                    for (int size8 = list3.size() - 1; size8 >= size7; size8--) {
                                        list3.remove(size8);
                                    }
                                    throw new NullPointerException(string4);
                                }
                                list3.add(obj4);
                            }
                        }
                        exuVar = (exu) ((fin) exvVar.h());
                    } else {
                        exuVar = exu.b;
                    }
                    ewyVar10.c();
                    ewx ewxVar10 = (ewx) ewyVar10.a;
                    if (exuVar == null) {
                        throw new NullPointerException();
                    }
                    ewxVar10.c = exuVar;
                    ewxVar10.b = 12;
                    arrayList.add((ewx) ((fin) ewyVar10.h()));
                    break;
                    break;
                case 10:
                    Bundle userRestrictions = bxlVar.e.getUserRestrictions();
                    if (userRestrictions == null) {
                        listEmptyList3 = Collections.emptyList();
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        for (String str5 : userRestrictions.keySet()) {
                            ffl fflVar = (ffl) ((fio) ffk.d.a(dp.au, (Object) null));
                            fflVar.c();
                            ffk ffkVar = (ffk) fflVar.a;
                            if (str5 == null) {
                                throw new NullPointerException();
                            }
                            ffkVar.a |= 1;
                            ffkVar.b = str5;
                            boolean z = userRestrictions.getBoolean(str5);
                            fflVar.c();
                            ffk ffkVar2 = (ffk) fflVar.a;
                            ffkVar2.a |= 2;
                            ffkVar2.c = z;
                            ffk ffkVar3 = (ffk) ((fin) fflVar.h());
                            ewy ewyVar11 = (ewy) ((fio) ewx.d.a(dp.au, (Object) null));
                            ewyVar11.c();
                            ewx ewxVar11 = (ewx) ewyVar11.a;
                            if (ffkVar3 == null) {
                                throw new NullPointerException();
                            }
                            ewxVar11.c = ffkVar3;
                            ewxVar11.b = 14;
                            arrayList2.add((ewx) ((fin) ewyVar11.h()));
                        }
                        listEmptyList3 = arrayList2;
                    }
                    arrayList.addAll(listEmptyList3);
                    break;
                case 11:
                    int i6 = Settings.Secure.getInt(bxlVar.a.getContentResolver(), "development_settings_enabled", 0);
                    ewy ewyVar12 = (ewy) ((fio) ewx.d.a(dp.au, (Object) null));
                    ewc ewcVar = (ewc) ((fio) ewb.c.a(dp.au, (Object) null));
                    boolean z2 = i6 != 0;
                    ewcVar.c();
                    ewb ewbVar = (ewb) ewcVar.a;
                    ewbVar.a |= 1;
                    ewbVar.b = z2;
                    ewyVar12.c();
                    ewx ewxVar12 = (ewx) ewyVar12.a;
                    ewxVar12.c = (fin) ewcVar.h();
                    ewxVar12.b = 8;
                    arrayList.add((ewx) ((fin) ewyVar12.h()));
                    break;
                case 12:
                    ewy ewyVar13 = (ewy) ((fio) ewx.d.a(dp.au, (Object) null));
                    fds fdsVar = (fds) ((fio) fdr.c.a(dp.au, (Object) null));
                    String strA = bpp.a(bxlVar.a);
                    fdsVar.c();
                    fdr fdrVar = (fdr) fdsVar.a;
                    if (strA == null) {
                        throw new NullPointerException();
                    }
                    fdrVar.a |= 1;
                    fdrVar.b = strA;
                    ewyVar13.c();
                    ewx ewxVar13 = (ewx) ewyVar13.a;
                    ewxVar13.c = (fin) fdsVar.h();
                    ewxVar13.b = 7;
                    arrayList.add((ewx) ((fin) ewyVar13.h()));
                    break;
                    break;
                default:
                    try {
                        btv.d("Report", "Unexpected report source:%s", Integer.valueOf(iIntValue));
                    } catch (Exception e) {
                        btv.c("Report", e, "Failed to collect information for source %s.", Integer.valueOf(iIntValue));
                        btt.a("Report", e, "Failed to collect information for source %s.", Integer.valueOf(iIntValue));
                    }
                    break;
            }
        }
        if (list.isEmpty()) {
            listEmptyList = Collections.emptyList();
        } else {
            MessageDigest messageDigestB = bxl.b();
            List<ResolveInfo> listQueryIntentActivities = bxlVar.b.queryIntentActivities(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER"), 0);
            HashSet hashSet = new HashSet(listQueryIntentActivities.size());
            Iterator<ResolveInfo> it2 = listQueryIntentActivities.iterator();
            while (it2.hasNext()) {
                hashSet.add(it2.next().activityInfo.packageName);
            }
            List<ResolveInfo> listQueryIntentActivities2 = bxlVar.b.queryIntentActivities(new Intent("android.intent.action.DIAL").addCategory("android.intent.category.DEFAULT"), 0);
            HashSet hashSet2 = new HashSet(listQueryIntentActivities2.size());
            Iterator<ResolveInfo> it3 = listQueryIntentActivities2.iterator();
            while (it3.hasNext()) {
                hashSet2.add(it3.next().activityInfo.packageName);
            }
            HashSet hashSet3 = new HashSet();
            List<ComponentName> activeAdmins = bxlVar.d.getActiveAdmins();
            if (activeAdmins != null) {
                Iterator<ComponentName> it4 = activeAdmins.iterator();
                while (it4.hasNext()) {
                    hashSet3.add(it4.next().getPackageName());
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                PackageInfo packageInfo = (PackageInfo) it5.next();
                String str6 = packageInfo.packageName;
                final ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                eze ezeVar = (eze) ((fio) eza.l.a(dp.au, (Object) null));
                ezeVar.c();
                eza ezaVar = (eza) ezeVar.a;
                if (str6 == null) {
                    throw new NullPointerException();
                }
                ezaVar.a |= 1;
                ezaVar.b = str6;
                String string5 = applicationInfo.loadLabel(bxlVar.b).toString();
                ezeVar.c();
                eza ezaVar2 = (eza) ezeVar.a;
                if (string5 == null) {
                    throw new NullPointerException();
                }
                ezaVar2.a |= 2;
                ezaVar2.c = string5;
                int i7 = packageInfo.versionCode;
                ezeVar.c();
                eza ezaVar3 = (eza) ezeVar.a;
                ezaVar3.a |= 16;
                ezaVar3.g = i7;
                String strB = dvj.b(packageInfo.versionName);
                ezeVar.c();
                eza ezaVar4 = (eza) ezeVar.a;
                if (strB == null) {
                    throw new NullPointerException();
                }
                ezaVar4.a |= 8;
                ezaVar4.f = strB;
                long j = packageInfo.firstInstallTime;
                ezeVar.c();
                eza ezaVar5 = (eza) ezeVar.a;
                ezaVar5.a |= 64;
                ezaVar5.k = j;
                boolean zContains = hashSet3.contains(str6);
                ezeVar.c();
                eza ezaVar6 = (eza) ezeVar.a;
                ezaVar6.a |= 32;
                ezaVar6.i = zContains;
                if (bte.f(bxlVar.d) && bxlVar.d.isApplicationHidden(btb.a, str6)) {
                    ewhVar = ewh.HIDDEN;
                } else {
                    ewhVar = ewh.VISIBLE;
                }
                ezeVar.c();
                eza ezaVar7 = (eza) ezeVar.a;
                if (ewhVar == null) {
                    throw new NullPointerException();
                }
                ezaVar7.a |= 4;
                ezaVar7.e = ewhVar.c;
                if (messageDigestB == null || packageInfo.signatures == null) {
                    listEmptyList2 = Collections.emptyList();
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    listEmptyList2 = new ArrayList(signatureArr.length);
                    for (Signature signature : signatureArr) {
                        listEmptyList2.add(fgy.a(messageDigestB.digest(signature.toByteArray())));
                    }
                }
                ezeVar.c();
                eza ezaVar8 = (eza) ezeVar.a;
                if (!ezaVar8.d.a()) {
                    ezaVar8.d = fin.a(ezaVar8.d);
                }
                List list4 = ezaVar8.d;
                fiv.a(listEmptyList2);
                if (listEmptyList2 instanceof fjo) {
                    List listD3 = ((fjo) listEmptyList2).d();
                    fjo fjoVar3 = (fjo) list4;
                    int size9 = list4.size();
                    for (Object obj5 : listD3) {
                        if (obj5 == null) {
                            String string6 = new StringBuilder(37).append("Element at index ").append(fjoVar3.size() - size9).append(" is null.").toString();
                            for (int size10 = fjoVar3.size() - 1; size10 >= size9; size10--) {
                                fjoVar3.remove(size10);
                            }
                            throw new NullPointerException(string6);
                        }
                        if (obj5 instanceof fgy) {
                            fjoVar3.a((fgy) obj5);
                        } else {
                            fjoVar3.add((String) obj5);
                        }
                    }
                } else if (listEmptyList2 instanceof fkp) {
                    list4.addAll(listEmptyList2);
                } else {
                    if ((list4 instanceof ArrayList) && (listEmptyList2 instanceof Collection)) {
                        ((ArrayList) list4).ensureCapacity(listEmptyList2.size() + list4.size());
                    }
                    int size11 = list4.size();
                    for (Object obj6 : listEmptyList2) {
                        if (obj6 == null) {
                            String string7 = new StringBuilder(37).append("Element at index ").append(list4.size() - size11).append(" is null.").toString();
                            for (int size12 = list4.size() - 1; size12 >= size11; size12--) {
                                list4.remove(size12);
                            }
                            throw new NullPointerException(string7);
                        }
                        list4.add(obj6);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                if ((applicationInfo.flags & 1) != 0) {
                    arrayList4.add(ezf.FLAG_SYSTEM_APP);
                }
                if ((applicationInfo.flags & 128) != 0) {
                    arrayList4.add(ezf.FLAG_UPDATED_SYSTEM_APP);
                }
                if (hashSet.contains(applicationInfo.packageName)) {
                    arrayList4.add(ezf.FLAG_HAS_LAUNCHER_ACTIVITY);
                }
                if (hashSet2.contains(applicationInfo.packageName)) {
                    arrayList4.add(ezf.FLAG_IS_DIALER);
                }
                ezeVar.c();
                eza ezaVar9 = (eza) ezeVar.a;
                if (!ezaVar9.h.a()) {
                    ezaVar9.h = fin.a(ezaVar9.h);
                }
                Iterator it6 = arrayList4.iterator();
                while (it6.hasNext()) {
                    ezaVar9.h.d(((ezf) it6.next()).f);
                }
                if (packageInfo.requestedPermissions != null) {
                    Collection collectionA = dxm.a(dyk.a((Iterable) bxlVar.a(packageInfo).entrySet(), new dvc(applicationInfo) { // from class: flm.bxm
                        private final ApplicationInfo a;

                        {
                            this.a = applicationInfo;
                        }

                        @Override // flm.dvc
                        public final Object a(Object obj7) {
                            etq etqVar;
                            ApplicationInfo applicationInfo2 = this.a;
                            Map.Entry entry = (Map.Entry) obj7;
                            ezd ezdVar = (ezd) ((fio) ezc.d.a(dp.au, (Object) null));
                            String strB2 = dvj.b((String) entry.getKey());
                            ezdVar.c();
                            ezc ezcVar = (ezc) ezdVar.a;
                            if (strB2 == null) {
                                throw new NullPointerException();
                            }
                            ezcVar.a |= 1;
                            ezcVar.b = strB2;
                            if (Build.VERSION.SDK_INT < 23 || applicationInfo2.targetSdkVersion < 23) {
                                etqVar = etq.STATE_UNAVAILABLE;
                            } else {
                                etqVar = ((Boolean) entry.getValue()).booleanValue() ? etq.STATE_ON : etq.STATE_OFF;
                            }
                            ezdVar.c();
                            ezc ezcVar2 = (ezc) ezdVar.a;
                            if (etqVar == null) {
                                throw new NullPointerException();
                            }
                            ezcVar2.a |= 2;
                            ezcVar2.c = etqVar.f;
                            return (ezc) ((fin) ezdVar.h());
                        }
                    }));
                    ezeVar.c();
                    eza ezaVar10 = (eza) ezeVar.a;
                    if (!ezaVar10.j.a()) {
                        ezaVar10.j = fin.a(ezaVar10.j);
                    }
                    List list5 = ezaVar10.j;
                    fiv.a(collectionA);
                    if (collectionA instanceof fjo) {
                        List listD4 = ((fjo) collectionA).d();
                        fjo fjoVar4 = (fjo) list5;
                        int size13 = list5.size();
                        for (Object obj7 : listD4) {
                            if (obj7 == null) {
                                String string8 = new StringBuilder(37).append("Element at index ").append(fjoVar4.size() - size13).append(" is null.").toString();
                                for (int size14 = fjoVar4.size() - 1; size14 >= size13; size14--) {
                                    fjoVar4.remove(size14);
                                }
                                throw new NullPointerException(string8);
                            }
                            if (obj7 instanceof fgy) {
                                fjoVar4.a((fgy) obj7);
                            } else {
                                fjoVar4.add((String) obj7);
                            }
                        }
                    } else if (collectionA instanceof fkp) {
                        list5.addAll(collectionA);
                    } else {
                        if ((list5 instanceof ArrayList) && (collectionA instanceof Collection)) {
                            ((ArrayList) list5).ensureCapacity(collectionA.size() + list5.size());
                        }
                        int size15 = list5.size();
                        for (Object obj8 : collectionA) {
                            if (obj8 == null) {
                                String string9 = new StringBuilder(37).append("Element at index ").append(list5.size() - size15).append(" is null.").toString();
                                for (int size16 = list5.size() - 1; size16 >= size15; size16--) {
                                    list5.remove(size16);
                                }
                                throw new NullPointerException(string9);
                            }
                            list5.add(obj8);
                        }
                    }
                }
                ewy ewyVar14 = (ewy) ((fio) ewx.d.a(dp.au, (Object) null));
                ewyVar14.c();
                ewx ewxVar14 = (ewx) ewyVar14.a;
                ewxVar14.c = (fin) ezeVar.h();
                ewxVar14.b = 15;
                arrayList3.add((ewx) ((fin) ewyVar14.h()));
            }
            listEmptyList = arrayList3;
        }
        arrayList.addAll(listEmptyList);
        return arrayList;
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
    private static fdp a(euz euzVar, ewl ewlVar, List list, List list2, boolean z) throws bxj {
        String strA;
        baw bawVarD;
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        if (z) {
            try {
                strA = bts.a(bts.b());
            } catch (alt | IOException e) {
                throw new bxj("Failed to retrieve obfuscated Gaia ID for the Unicorn account.", e);
            }
        } else {
            strA = "me";
        }
        fdo fdoVar = (fdo) ((fio) fdn.h.a(dp.au, (Object) null));
        fdoVar.c();
        fdn fdnVar = (fdn) fdoVar.a;
        if (strA == null) {
            throw new NullPointerException();
        }
        fdnVar.a |= 4;
        fdnVar.c = strA;
        String strA2 = btl.a();
        fdoVar.c();
        fdn fdnVar2 = (fdn) fdoVar.a;
        if (strA2 == null) {
            throw new NullPointerException();
        }
        fdnVar2.a |= 8;
        fdnVar2.d = strA2;
        euy euyVarA = ((euy) ((fio) eux.c.a(dp.au, (Object) null))).a(euzVar);
        fdoVar.c();
        fdn fdnVar3 = (fdn) fdoVar.a;
        fdnVar3.b = (eux) ((fin) euyVarA.h());
        fdnVar3.a |= 2;
        fdoVar.c();
        fdn fdnVar4 = (fdn) fdoVar.a;
        if (ewlVar == null) {
            throw new NullPointerException();
        }
        fdnVar4.a |= 32;
        fdnVar4.f = ewlVar.c;
        ewo ewoVar = (ewo) ((fio) ewn.b.a(dp.au, (Object) null));
        ewoVar.c();
        ewn ewnVar = (ewn) ewoVar.a;
        if (!ewnVar.a.a()) {
            ewnVar.a = fin.a(ewnVar.a);
        }
        List list3 = ewnVar.a;
        fiv.a(list2);
        if (list2 instanceof fjo) {
            List listD = ((fjo) list2).d();
            fjo fjoVar = (fjo) list3;
            int size = list3.size();
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
        } else if (list2 instanceof fkp) {
            list3.addAll(list2);
        } else {
            if ((list3 instanceof ArrayList) && (list2 instanceof Collection)) {
                ((ArrayList) list3).ensureCapacity(list2.size() + list3.size());
            }
            int size3 = list3.size();
            for (Object obj2 : list2) {
                if (obj2 == null) {
                    String string2 = new StringBuilder(37).append("Element at index ").append(list3.size() - size3).append(" is null.").toString();
                    for (int size4 = list3.size() - 1; size4 >= size3; size4--) {
                        list3.remove(size4);
                    }
                    throw new NullPointerException(string2);
                }
                list3.add(obj2);
            }
        }
        fdoVar.c();
        fdn fdnVar5 = (fdn) fdoVar.a;
        fdnVar5.e = (ewn) ((fin) ewoVar.h());
        fdnVar5.a |= 16;
        fdoVar.c();
        fdn fdnVar6 = (fdn) fdoVar.a;
        if (!fdnVar6.g.a()) {
            fdnVar6.g = fin.a(fdnVar6.g);
        }
        List list4 = fdnVar6.g;
        fiv.a(list);
        if (list instanceof fjo) {
            List listD2 = ((fjo) list).d();
            fjo fjoVar2 = (fjo) list4;
            int size5 = list4.size();
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
        } else if (list instanceof fkp) {
            list4.addAll(list);
        } else {
            if ((list4 instanceof ArrayList) && (list instanceof Collection)) {
                ((ArrayList) list4).ensureCapacity(list.size() + list4.size());
            }
            int size7 = list4.size();
            for (Object obj4 : list) {
                if (obj4 == null) {
                    String string4 = new StringBuilder(37).append("Element at index ").append(list4.size() - size7).append(" is null.").toString();
                    for (int size8 = list4.size() - 1; size8 >= size7; size8--) {
                        list4.remove(size8);
                    }
                    throw new NullPointerException(string4);
                }
                list4.add(obj4);
            }
        }
        fdn fdnVar7 = (fdn) ((fin) fdoVar.h());
        try {
            if (z) {
                bawVarD = cal.c();
            } else {
                bawVarD = cal.d();
            }
            car carVarA = cal.a();
            if (car.e == null) {
                car.e = fuf.a(fuh.UNARY, "google.kidsmanagement.v1.KidsManagementService/ReportDeviceStates", gkn.a(fdn.h), gkn.a(fdp.a));
            }
            fdp fdpVar = (fdp) carVarA.a.a(car.e, bawVarD, fdnVar7, 10000L, TimeUnit.MILLISECONDS);
            btt.b();
            return fdpVar;
        } catch (alt | fvg e2) {
            throw new bxj("Auth/gRPC exception during report device states!", e2);
        }
    }
}
