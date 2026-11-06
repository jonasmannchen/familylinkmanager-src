package flm;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dpc {
    static long a(File[] fileArr) {
        long j = 0;
        try {
            long jA = 0;
            for (File file : fileArr) {
                try {
                    if (!a(file)) {
                        if (file.isFile()) {
                            jA += file.length();
                        } else if (file.isDirectory()) {
                            jA += a(file.listFiles());
                        } else {
                            dkm.a(5, "DirStatsCapture", "not a link / dir / regular file: %s", file);
                        }
                    }
                } catch (IOException e) {
                    j = jA;
                    e = e;
                    dkm.b("DirStatsCapture", "failure computing subtree size", e, new Object[0]);
                    return j;
                } catch (SecurityException e2) {
                    j = jA;
                    e = e2;
                    dkm.b("DirStatsCapture", "failure computing subtree size", e, new Object[0]);
                    return j;
                }
            }
            return jA;
        } catch (IOException e3) {
            e = e3;
        } catch (SecurityException e4) {
            e = e4;
        }
    }

    static boolean a(File file) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Files.isSymbolicLink(file.toPath());
        }
        try {
            File file2 = new File(file.getParentFile().getCanonicalFile(), file.getName());
            return !file2.getCanonicalFile().equals(file2.getAbsoluteFile());
        } catch (IOException e) {
            dkm.a(5, "DirStatsCapture", "Could not check symlink for file: %s, assuming symlink.", file);
            return true;
        }
    }

    public static List a(Context context, int i, Pattern... patternArr) {
        File parentFile;
        ArrayList arrayList = new ArrayList();
        dsg.b();
        try {
            try {
                parentFile = new File(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).dataDir);
            } catch (Exception e) {
                String strValueOf = String.valueOf(e);
                dkm.a(5, "DirStatsCapture", new StringBuilder(String.valueOf(strValueOf).length() + 29).append("Failed to retrieve DirStats: ").append(strValueOf).toString(), new Object[0]);
                return Collections.emptyList();
            }
        } catch (PackageManager.NameNotFoundException e2) {
            dkm.a(5, "DirStatsCapture", "Failed to use package manager getting data directory from context instead.", new Object[0]);
            File filesDir = context.getFilesDir();
            if (filesDir == null) {
                parentFile = null;
            } else {
                parentFile = filesDir.getParentFile();
            }
        }
        if (parentFile == null) {
            return Collections.emptyList();
        }
        dpd dpdVar = new dpd(parentFile, arrayList, i, patternArr);
        dpdVar.a(new dpe(dpdVar));
        return arrayList;
    }
}
