package flm;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class drj extends drf {
    drj(drn drnVar, String str, Double d) {
        super(drnVar, str, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.drf
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Double a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException e) {
            }
        }
        String strA = super.a();
        String strValueOf = String.valueOf(obj);
        Log.e("PhenotypeFlag", new StringBuilder(String.valueOf(strA).length() + 27 + String.valueOf(strValueOf).length()).append("Invalid double value for ").append(strA).append(": ").append(strValueOf).toString());
        return null;
    }
}
