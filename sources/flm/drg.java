package flm;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class drg extends drf {
    drg(drn drnVar, String str, Long l) {
        super(drnVar, str, l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.drf
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException e) {
            }
        }
        String strA = super.a();
        String strValueOf = String.valueOf(obj);
        Log.e("PhenotypeFlag", new StringBuilder(String.valueOf(strA).length() + 25 + String.valueOf(strValueOf).length()).append("Invalid long value for ").append(strA).append(": ").append(strValueOf).toString());
        return null;
    }
}
