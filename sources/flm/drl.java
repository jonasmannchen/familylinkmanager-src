package flm;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class drl extends drf {
    private final /* synthetic */ drm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    drl(drn drnVar, String str, Object obj, drm drmVar) {
        super(drnVar, str, obj);
        this.b = drmVar;
    }

    @Override // flm.drf
    final Object a(Object obj) {
        if (obj instanceof String) {
            try {
                return this.b.a(Base64.decode((String) obj, 3));
            } catch (IOException e) {
            } catch (IllegalArgumentException e2) {
            }
        }
        String strA = super.a();
        String strValueOf = String.valueOf(obj);
        Log.e("PhenotypeFlag", new StringBuilder(String.valueOf(strA).length() + 27 + String.valueOf(strValueOf).length()).append("Invalid byte[] value for ").append(strA).append(": ").append(strValueOf).toString());
        return null;
    }
}
