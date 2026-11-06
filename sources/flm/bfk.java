package flm;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bfk {
    private static volatile bfk a;

    private bfk() {
    }

    static bfk a() {
        if (a == null) {
            synchronized (bfk.class) {
                if (a == null) {
                    a = new bfk();
                }
            }
        }
        return a;
    }

    public static frl a(Context context, frl frlVar, String str, String str2, ftv ftvVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(new fvs(context, str, z));
        }
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new fvq(str2));
        }
        if (ftvVar != null) {
            arrayList.add(new gkp(ftvVar));
        }
        if (!arrayList.isEmpty()) {
            return frp.a(frlVar, arrayList);
        }
        return frlVar;
    }

    public static Object a(frl frlVar, fuf fufVar, Object obj, frj frjVar) {
        try {
            frm frmVarA = frlVar.a(fufVar, frjVar);
            bfl bflVar = new bfl();
            frmVarA.a(bflVar, new ftv());
            frmVarA.a(2);
            try {
                frmVarA.a(obj);
                frmVarA.a();
                bflVar.c.await();
                if (!bflVar.a.a()) {
                    throw bflVar.a.b();
                }
                return bflVar.b;
            } catch (Throwable th) {
                frmVarA.a("send failed", th);
                throw th;
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}
