package flm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dmt {
    private static final Pattern a = Pattern.compile("^(\\*[a-z]+\\*).*");
    private final ConcurrentHashMap b = new ConcurrentHashMap();

    private static String a(String str) {
        String[] strArrSplit = str.split("/");
        if (strArrSplit != null && strArrSplit.length == 3) {
            return strArrSplit[0];
        }
        dkm.a(3, "HashingNameSanitizer", "malformed sync name: %s", str);
        return "MALFORMED";
    }

    dmt() {
    }

    final List a(dmu dmuVar, List list) {
        goq goqVar;
        goq goqVar2;
        String strA;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                goy goyVar = (goy) it.next();
                if (goyVar.d == null) {
                    goqVar = goq.d;
                } else {
                    goqVar = goyVar.d;
                }
                if ((goqVar.a & 2) == 2) {
                    if (goyVar.d == null) {
                        goqVar2 = goq.d;
                    } else {
                        goqVar2 = goyVar.d;
                    }
                    fio fioVar = (fio) goqVar2.a(dp.au, (Object) null);
                    fioVar.a((fin) goqVar2);
                    gor gorVar = (gor) fioVar;
                    fio fioVar2 = (fio) goyVar.a(dp.au, (Object) null);
                    fioVar2.a((fin) goyVar);
                    goz gozVar = (goz) fioVar2;
                    String str = ((goq) gorVar.a).c;
                    long jLongValue = dhi.a(str).longValue();
                    if (!this.b.containsKey(Long.valueOf(jLongValue))) {
                        switch (dmuVar.ordinal()) {
                            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                                Matcher matcher = a.matcher(str);
                                if (matcher.matches()) {
                                    if (str.startsWith("*sync*/")) {
                                        String strValueOf = String.valueOf("*sync*/");
                                        String strValueOf2 = String.valueOf(a(str.substring(7)));
                                        strA = strValueOf2.length() == 0 ? new String(strValueOf) : strValueOf.concat(strValueOf2);
                                    } else {
                                        strA = matcher.group(1);
                                        dkm.a(3, "HashingNameSanitizer", "non-sync system task wakelock: %s", strA);
                                    }
                                } else {
                                    dkm.a(3, "HashingNameSanitizer", "wakelock: %s", str);
                                    strA = str;
                                }
                                break;
                            case 1:
                                strA = a(str);
                                break;
                            case 2:
                                strA = "--";
                                break;
                            default:
                                strA = str;
                                break;
                        }
                        Long lA = dhi.a(strA);
                        dkm.a(3, "HashingNameSanitizer", "Sanitized Hash: [%s] %s -> %s", dmuVar, strA, lA);
                        dkm.a(2, "HashingNameSanitizer", "Raw Hash: [%s] %s -> %s", dmuVar, str, Long.valueOf(jLongValue));
                        this.b.putIfAbsent(Long.valueOf(jLongValue), lA);
                    }
                    gor gorVarA = gorVar.a(jLongValue);
                    gorVarA.c();
                    goq goqVar3 = (goq) gorVarA.a;
                    goqVar3.a &= -3;
                    goqVar3.c = goq.d.c;
                    goyVar = (goy) ((fin) gozVar.a(gorVarA).h());
                }
                arrayList.add(goyVar);
            }
            return arrayList;
        }
        return list;
    }

    public final List a(List list) {
        goq goqVar;
        goq goqVar2;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                goy goyVar = (goy) it.next();
                if (goyVar.d == null) {
                    goqVar = goq.d;
                } else {
                    goqVar = goyVar.d;
                }
                if ((goqVar.a & 1) == 1) {
                    if (goyVar.d == null) {
                        goqVar2 = goq.d;
                    } else {
                        goqVar2 = goyVar.d;
                    }
                    fio fioVar = (fio) goqVar2.a(dp.au, (Object) null);
                    fioVar.a((fin) goqVar2);
                    gor gorVar = (gor) fioVar;
                    fio fioVar2 = (fio) goyVar.a(dp.au, (Object) null);
                    fioVar2.a((fin) goyVar);
                    goyVar = (goy) ((fin) ((goz) fioVar2).a(gorVar.a(((Long) this.b.get(Long.valueOf(((goq) gorVar.a).b))).longValue())).h());
                }
                arrayList.add(goyVar);
            }
            return arrayList;
        }
        return list;
    }
}
