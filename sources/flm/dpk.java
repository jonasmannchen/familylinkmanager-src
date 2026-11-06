package flm;

import android.annotation.TargetApi;
import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.os.Process;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(26)
public final class dpk {
    public static PackageStats a(Context context) {
        UUID uuidA;
        dsg.b();
        StorageManager storageManager = (StorageManager) context.getSystemService(StorageManager.class);
        if (storageManager == null) {
            dkm.a("PackageStatsO", "StorageManager is not available", new Object[0]);
            return null;
        }
        try {
            try {
                StorageStatsManager storageStatsManager = (StorageStatsManager) context.getSystemService(StorageStatsManager.class);
                String packageName = context.getPackageName();
                PackageStats packageStats = new PackageStats(packageName);
                for (StorageVolume storageVolume : storageManager.getStorageVolumes()) {
                    if (storageVolume.getState().equals("mounted") && (uuidA = a(storageVolume)) != null) {
                        try {
                            StorageStats storageStatsQueryStatsForPackage = storageStatsManager.queryStatsForPackage(uuidA, packageName, Process.myUserHandle());
                            if (StorageManager.UUID_DEFAULT.equals(uuidA)) {
                                packageStats.codeSize += storageStatsQueryStatsForPackage.getAppBytes();
                                packageStats.dataSize += storageStatsQueryStatsForPackage.getDataBytes() - storageStatsQueryStatsForPackage.getCacheBytes();
                                packageStats.cacheSize = storageStatsQueryStatsForPackage.getCacheBytes() + packageStats.cacheSize;
                            } else {
                                packageStats.externalCodeSize += storageStatsQueryStatsForPackage.getAppBytes();
                                packageStats.externalDataSize += storageStatsQueryStatsForPackage.getDataBytes() - storageStatsQueryStatsForPackage.getCacheBytes();
                                packageStats.externalCacheSize = storageStatsQueryStatsForPackage.getCacheBytes() + packageStats.externalCacheSize;
                            }
                        } catch (PackageManager.NameNotFoundException | IOException | RuntimeException e) {
                            dkm.c("PackageStatsO", "queryStatsForPackage() call failed", e, new Object[0]);
                        }
                    }
                }
                return packageStats;
            } catch (RuntimeException e2) {
                e = e2;
                dkm.b("PackageStatsO", "StorageStatsManager is not available", e, new Object[0]);
                return null;
            }
        } catch (Error e3) {
            e = e3;
            dkm.b("PackageStatsO", "StorageStatsManager is not available", e, new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object[]] */
    private static UUID a(StorageVolume storageVolume) {
        ?? uuid = storageVolume.getUuid();
        try {
            dkm.a(3, "PackageStatsO", "UUID for %s", (Object[]) new Object[]{uuid});
            uuid = uuid == 0 ? StorageManager.UUID_DEFAULT : UUID.fromString(uuid);
            return uuid;
        } catch (IllegalArgumentException e) {
            dkm.a("PackageStatsO", "Invalid UUID format: '%s'", new Object[]{uuid});
            return null;
        }
    }
}
