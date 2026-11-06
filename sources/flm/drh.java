package flm;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class drh extends drf {
    drh(drn drnVar, String str, Integer num) {
        super(drnVar, str, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.drf
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Integer a(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Long) {
            return Integer.valueOf(((Long) obj).intValue());
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException e) {
            }
        }
        String strA = super.a();
        String strValueOf = String.valueOf(obj);
        Log.e("PhenotypeFlag", new StringBuilder(String.valueOf(strA).length() + 24 + String.valueOf(strValueOf).length()).append("Invalid int value for ").append(strA).append(": ").append(strValueOf).toString());
        return null;
    }
}
