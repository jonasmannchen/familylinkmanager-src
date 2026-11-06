package flm;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dpn {
    public static File a(Context context) {
        String strSubstring;
        dse.a(context);
        File cacheDir = context.getCacheDir();
        String strE = dpl.e(context);
        if (strE != null) {
            String strReplaceAll = strE.replaceAll("[^a-zA-Z0-9\\._]", "_");
            strSubstring = strReplaceAll.substring(0, Math.min(32, strReplaceAll.length()));
        } else {
            strSubstring = "";
        }
        return new File(cacheDir, new StringBuilder(String.valueOf(strSubstring).length() + 11).append(strSubstring).append("_primes_mhd").toString());
    }
}
