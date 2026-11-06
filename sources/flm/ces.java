package flm;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ces extends cep {
    private final ewz c;

    public ces(KidSetupViewModel kidSetupViewModel, Resources resources) {
        super(kidSetupViewModel);
        exa exaVar = (exa) ((fio) ewz.g.a(dp.au, (Object) null));
        exaVar.c();
        ewz ewzVar = (ewz) exaVar.a;
        ewzVar.a |= 4;
        ewzVar.c = Integer.MAX_VALUE;
        String string = resources.getString(R.string.kidsetup_app_selector_unknown_rating);
        exaVar.c();
        ewz ewzVar2 = (ewz) exaVar.a;
        if (string == null) {
            throw new NullPointerException();
        }
        ewzVar2.a |= 8;
        ewzVar2.d = string;
        this.c = (ewz) ((fin) exaVar.h());
    }

    @Override // flm.cep
    protected final String a() {
        return "BuildAppListTask";
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:58:0x0105  */
    /* JADX WARN: Code duplicated, block: B:60:0x0109  */
    /* JADX WARN: Code duplicated, block: B:64:0x0113  */
    /* JADX WARN: Code duplicated, block: B:65:0x0116  */
    private static chu a(PackageManager packageManager, HashMap map, dvi dviVar, ewz ewzVar, boolean z, eta etaVar) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo;
        ete eteVar;
        int i;
        boolean z2;
        ewz ewzVar2;
        etu etuVar;
        try {
            applicationInfo = packageManager.getApplicationInfo(etaVar.b, 0);
        } catch (PackageManager.NameNotFoundException e) {
            applicationInfo = null;
        }
        int i2 = dp.F;
        if (etaVar.c == null) {
            eteVar = ete.t;
        } else {
            eteVar = etaVar.c;
        }
        fio fioVar = (fio) eteVar.a(dp.au, (Object) null);
        fioVar.a((fin) eteVar);
        eti etiVar = (eti) fioVar;
        if (etiVar.a() == etj.STATUS_ENABLED || etiVar.a() == etj.STATUS_DISABLED) {
            i = dp.G;
            z2 = etiVar.a() == etj.STATUS_ENABLED;
        } else if (applicationInfo != null) {
            if (((applicationInfo.flags & 1) == 0 && (applicationInfo.flags & 128) == 0) ? false : true) {
                if (packageManager.resolveActivity(new Intent("android.intent.action.DIAL").addCategory("android.intent.category.DEFAULT").setPackage(etaVar.b), 0) != null) {
                    int i3 = dp.G;
                    if (dviVar.a()) {
                        etiVar.a((ewz) dviVar.b());
                        z2 = true;
                        i = i3;
                    } else {
                        z2 = true;
                        i = i3;
                    }
                } else if (map.containsKey(etaVar.b)) {
                    chu chuVar = (chu) map.get(etaVar.b);
                    z2 = chuVar.c;
                    i = chuVar.b;
                } else {
                    if (etaVar.d == null) {
                        etuVar = etu.d;
                    } else {
                        etuVar = etaVar.d;
                    }
                    z2 = etuVar.b ? false : true;
                    i = i2;
                }
            } else if (map.containsKey(etaVar.b)) {
                chu chuVar2 = (chu) map.get(etaVar.b);
                z2 = chuVar2.c;
                i = chuVar2.b;
            } else {
                if (etaVar.d == null) {
                    etuVar = etu.d;
                } else {
                    etuVar = etaVar.d;
                }
                z2 = etuVar.b ? false : true;
                i = i2;
            }
        } else if (map.containsKey(etaVar.b)) {
            chu chuVar3 = (chu) map.get(etaVar.b);
            z2 = chuVar3.c;
            i = chuVar3.b;
        } else {
            if (etaVar.d == null) {
                etuVar = etu.d;
            } else {
                etuVar = etaVar.d;
            }
            z2 = etuVar.b ? false : true;
            i = i2;
        }
        ete eteVar2 = (ete) etiVar.a;
        if (eteVar2.m == null) {
            ewzVar2 = ewz.g;
        } else {
            ewzVar2 = eteVar2.m;
        }
        if (ewzVar2.d.isEmpty()) {
            etiVar.a(ewzVar);
        }
        if (applicationInfo != null) {
            String string = packageManager.getApplicationLabel(applicationInfo).toString();
            if (!TextUtils.isEmpty(string) && !string.equals(etaVar.b)) {
                etiVar.a(string);
            }
        }
        if (z && !z2 && i != dp.G) {
            i = dp.H;
        }
        fio fioVar2 = (fio) etaVar.a(dp.au, (Object) null);
        fioVar2.a((fin) etaVar);
        return new chu((eta) ((fin) ((etb) fioVar2).a(etiVar).h()), z2, i);
    }

    @Override // flm.cep
    protected final /* synthetic */ Object b() throws PackageManager.NameNotFoundException {
        ete eteVar;
        ewz ewzVar;
        etu etuVar;
        ete eteVar2;
        ewz ewzVar2;
        Map mapB = new cfb(this.b).b();
        HashMap map = new HashMap();
        HashMap map2 = this.b.d;
        boolean zIsSupervisedAccountNonUnicorn = this.b.b().isSupervisedAccountNonUnicorn();
        dvi dviVarB = dur.a;
        if (mapB.containsKey("com.android.vending")) {
            eta etaVar = (eta) mapB.get("com.android.vending");
            if (etaVar.c == null) {
                eteVar2 = ete.t;
            } else {
                eteVar2 = etaVar.c;
            }
            if (eteVar2.m == null) {
                ewzVar2 = ewz.g;
            } else {
                ewzVar2 = eteVar2.m;
            }
            dviVarB = dvi.b(ewzVar2);
        }
        PackageManager packageManager = this.a.getPackageManager();
        Iterator it = mapB.values().iterator();
        while (it.hasNext()) {
            chu chuVarA = a(packageManager, map2, dviVarB, this.c, zIsSupervisedAccountNonUnicorn, (eta) it.next());
            eta etaVar2 = chuVarA.a;
            if (etaVar2.c == null) {
                eteVar = ete.t;
            } else {
                eteVar = etaVar2.c;
            }
            if (eteVar.m == null) {
                ewzVar = ewz.g;
            } else {
                ewzVar = eteVar.m;
            }
            map2.put(chuVarA.a.b, chuVarA);
            if (chuVarA.a()) {
                eta etaVar3 = chuVarA.a;
                if (etaVar3.d == null) {
                    etuVar = etu.d;
                } else {
                    etuVar = etaVar3.d;
                }
                chuVarA.a(!etuVar.c);
            }
            exb exbVarA = exb.a(ewzVar.b);
            if (exbVarA == null) {
                exbVarA = exb.UNKNOWN_CATEGORY_ID;
            }
            if (!map.containsKey(exbVarA)) {
                exb exbVarA2 = exb.a(ewzVar.b);
                if (exbVarA2 == null) {
                    exbVarA2 = exb.UNKNOWN_CATEGORY_ID;
                }
                map.put(exbVarA2, new cig(ewzVar));
            }
            exb exbVarA3 = exb.a(ewzVar.b);
            if (exbVarA3 == null) {
                exbVarA3 = exb.UNKNOWN_CATEGORY_ID;
            }
            ((cig) map.get(exbVarA3)).b.add(chuVarA);
            coj.a(this.a, chuVarA.a.b);
        }
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            Collections.sort(((cig) it2.next()).b, cet.a);
        }
        ArrayList arrayList = new ArrayList(map.values());
        Collections.sort(arrayList, ceu.a);
        return arrayList;
    }

    static final /* synthetic */ int a(cig cigVar, cig cigVar2) {
        return cigVar.a.c - cigVar2.a.c;
    }

    static final /* synthetic */ int a(chu chuVar, chu chuVar2) {
        ete eteVar;
        ete eteVar2;
        eta etaVar = chuVar.a;
        if (etaVar.c == null) {
            eteVar = ete.t;
        } else {
            eteVar = etaVar.c;
        }
        String str = eteVar.c;
        eta etaVar2 = chuVar2.a;
        if (etaVar2.c == null) {
            eteVar2 = ete.t;
        } else {
            eteVar2 = etaVar2.c;
        }
        return str.compareTo(eteVar2.c);
    }
}
