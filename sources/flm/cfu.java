package flm;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cfu extends cep {
    public cfu(KidSetupViewModel kidSetupViewModel) {
        super(kidSetupViewModel);
    }

    @Override // flm.cep
    protected final String a() {
        return "GetUpdatingAppsTask";
    }

    private final chv a(final PackageManager packageManager, Map map, exs exsVar) throws PackageManager.NameNotFoundException {
        eta etaVar;
        PackageInfo packageInfo;
        eta etaVar2;
        ete eteVar;
        String str = exsVar.b;
        coj.a(this.a, str);
        if (map.containsKey(str)) {
            etaVar = (eta) dvl.a((eta) map.get(str));
        } else {
            etb etbVarA = ((etb) ((fio) eta.f.a(dp.au, (Object) null))).a(str);
            eti etiVar = (eti) ((fio) ete.t.a(dp.au, (Object) null));
            etiVar.c();
            ete eteVar2 = (ete) etiVar.a;
            if (str == null) {
                throw new NullPointerException();
            }
            eteVar2.a |= 1;
            eteVar2.b = str;
            etaVar = (eta) ((fin) etbVarA.a(etiVar).h());
        }
        try {
            packageInfo = packageManager.getPackageInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException e) {
            packageInfo = null;
        }
        dvi dviVarA = dvi.c(packageInfo).a(cfw.a);
        packageManager.getClass();
        dvi dviVarA2 = dviVarA.a(new dvc(packageManager) { // from class: flm.cfx
            private final PackageManager a;

            {
                this.a = packageManager;
            }

            @Override // flm.dvc
            public final Object a(Object obj) {
                return this.a.getApplicationLabel((ApplicationInfo) obj);
            }
        }).a(cfy.a);
        if (dviVarA2 != null) {
            fio fioVar = (fio) etaVar.a(dp.au, (Object) null);
            fioVar.a((fin) etaVar);
            etb etbVar = (etb) fioVar;
            if (etaVar.c == null) {
                eteVar = ete.t;
            } else {
                eteVar = etaVar.c;
            }
            fio fioVar2 = (fio) eteVar.a(dp.au, (Object) null);
            fioVar2.a((fin) eteVar);
            etaVar2 = (eta) ((fin) etbVar.a(((eti) fioVar2).a((String) dviVarA2.b())).h());
        } else {
            etaVar2 = etaVar;
        }
        chw chwVar = (chw) ((fio) chv.d.a(dp.au, (Object) null));
        chwVar.c();
        chv chvVar = (chv) chwVar.a;
        if (etaVar2 == null) {
            throw new NullPointerException();
        }
        chvVar.b = etaVar2;
        chvVar.a |= 1;
        chx chxVarA = a(packageInfo, exsVar);
        chwVar.c();
        chv chvVar2 = (chv) chwVar.a;
        if (chxVarA == null) {
            throw new NullPointerException();
        }
        chvVar2.a |= 2;
        chvVar2.c = chxVarA.d;
        return (chv) ((fin) chwVar.h());
    }

    private final chx a(PackageInfo packageInfo, exs exsVar) {
        if (packageInfo == null) {
            return chx.DISABLED;
        }
        if (packageInfo.applicationInfo != null && (packageInfo.applicationInfo.flags & 8388608) == 0) {
            try {
                if (!this.b.b().isAppOnlyDisabledByMinVersion(exsVar.b)) {
                    return chx.DISABLED;
                }
            } catch (Exception e) {
            }
        }
        if (packageInfo.versionCode < exsVar.c) {
            return chx.UPDATING;
        }
        return chx.NORMAL;
    }

    @Override // flm.cep
    protected final /* synthetic */ Object b() {
        eya eyaVar;
        eyu eyuVar;
        cij cijVarD = this.b.d();
        HashMap map = new HashMap();
        if (cijVarD.w == null) {
            eyaVar = eya.c;
        } else {
            eyaVar = cijVarD.w;
        }
        for (eta etaVar : eyaVar.b) {
            map.put(etaVar.b, etaVar);
        }
        PackageManager packageManager = this.a.getPackageManager();
        ArrayList arrayList = new ArrayList();
        if (cijVarD.t == null) {
            eyuVar = eyu.d;
        } else {
            eyuVar = cijVarD.t;
        }
        Iterator it = eyuVar.b.iterator();
        while (it.hasNext()) {
            arrayList.add(a(packageManager, map, (exs) it.next()));
        }
        Collections.sort(arrayList, cfv.a);
        return dxm.a((Collection) arrayList);
    }

    static final /* synthetic */ int a(chv chvVar, chv chvVar2) {
        eta etaVar;
        ete eteVar;
        eta etaVar2;
        ete eteVar2;
        if (chvVar.b == null) {
            etaVar = eta.f;
        } else {
            etaVar = chvVar.b;
        }
        if (etaVar.c == null) {
            eteVar = ete.t;
        } else {
            eteVar = etaVar.c;
        }
        String str = eteVar.c;
        if (chvVar2.b == null) {
            etaVar2 = eta.f;
        } else {
            etaVar2 = chvVar2.b;
        }
        if (etaVar2.c == null) {
            eteVar2 = ete.t;
        } else {
            eteVar2 = etaVar2.c;
        }
        return str.compareTo(eteVar2.c);
    }
}
