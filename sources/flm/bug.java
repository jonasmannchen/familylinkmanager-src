package flm;

import android.accounts.Account;
import android.content.Context;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bug {
    private static volatile bug a;

    protected bug() {
    }

    private static bug a() {
        if (a == null) {
            synchronized (bug.class) {
                if (a == null) {
                    a = new bug();
                }
            }
        }
        return a;
    }

    public static Collection a(Context context) {
        a();
        cvf cvfVar = new cvf();
        cvfVar.a = 639;
        bdi.checkArgument(cvfVar.a >= 0, "Must provide valid client application ID!");
        cve cveVar = new cve(cvfVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Account account : bhp.a(context, context.getPackageName())) {
            linkedHashMap.put(account.name, new buh(alu.b(context, account.name), account.name, null, null, null));
        }
        cva cvaVarA = cvb.a(context, cveVar);
        cuy cuyVar = new cuy();
        cuyVar.b = false;
        cuz cuzVar = (cuz) cvb.b.a(cvaVarA.e, cuyVar).await(10L, TimeUnit.SECONDS);
        if (cuzVar.b().a()) {
            for (cxm cxmVar : (Iterable) dvi.c(cuzVar.c()).a(Collections.emptyList())) {
                if (linkedHashMap.containsKey(cxmVar.a())) {
                    linkedHashMap.put(cxmVar.a(), new buh(cxmVar.d(), cxmVar.a(), cxmVar.b(), cxmVar.c(), cxmVar.e()));
                }
            }
        }
        cuzVar.a();
        return linkedHashMap.values();
    }
}
