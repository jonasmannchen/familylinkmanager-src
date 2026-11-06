package flm;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dkj {
    static File a(Context context) {
        dse.a(context);
        File cacheDir = context.getCacheDir();
        String strD = d(context);
        return new File(cacheDir, new StringBuilder(String.valueOf(strD).length() + 12).append(strD).append("_primeshprof").toString());
    }

    static File b(Context context) {
        dse.a(context);
        File cacheDir = context.getCacheDir();
        String strD = d(context);
        return new File(cacheDir, new StringBuilder(String.valueOf(strD).length() + 17).append(strD).append("_primes_mhd.hprof").toString());
    }

    static void c(Context context) {
        File fileB = b(context);
        if (fileB.exists()) {
            fileB.delete();
        }
    }

    private static String d(Context context) {
        String strE = dpl.e(context);
        if (strE != null) {
            String strReplaceAll = strE.replaceAll("[^a-zA-Z0-9\\._]", "_");
            return strReplaceAll.substring(0, Math.min(32, strReplaceAll.length()));
        }
        return "";
    }
}
