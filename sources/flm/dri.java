package flm;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dri extends drf {
    dri(drn drnVar, String str, Boolean bool) {
        super(drnVar, str, bool);
    }

    @Override // flm.drf
    final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (dfc.b.matcher(str).matches()) {
                return true;
            }
            if (dfc.c.matcher(str).matches()) {
                return false;
            }
        }
        String strA = super.a();
        String strValueOf = String.valueOf(obj);
        Log.e("PhenotypeFlag", new StringBuilder(String.valueOf(strA).length() + 28 + String.valueOf(strValueOf).length()).append("Invalid boolean value for ").append(strA).append(": ").append(strValueOf).toString());
        return null;
    }
}
