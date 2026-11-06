package flm;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class atk extends Exception {
    public final rt a;

    public atk(rt rtVar) {
        this.a = rtVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (aup aupVar : this.a.keySet()) {
            apx apxVar = (apx) this.a.get(aupVar);
            if (apxVar.b()) {
                z = false;
            }
            String str = aupVar.a.a;
            String strValueOf = String.valueOf(apxVar);
            arrayList.add(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(strValueOf).length()).append(str).append(": ").append(strValueOf).toString());
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }
}
