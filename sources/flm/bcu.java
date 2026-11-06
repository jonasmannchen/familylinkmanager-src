package flm;

import android.content.Context;
import android.os.IBinder;
import android.os.Process;
import android.system.Os;
import android.util.Log;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bcu implements bbl, bbm {
    public final Context mContext;
    public final Map mLatchMap = new ConcurrentHashMap();

    public bcu(Context context) {
        this.mContext = context;
    }

    @Override // flm.bbl
    public final boolean process(bck bckVar, bbn bbnVar, int i, IBinder iBinder, bbe bbeVar) {
        CountDownLatch countDownLatch = (CountDownLatch) this.mLatchMap.remove(bbnVar);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        log(bbnVar, i);
        return true;
    }

    @Override // flm.bbm
    public final apx process(bbn bbnVar, bbe bbeVar) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.mLatchMap.put(bbnVar, countDownLatch);
        try {
            bgy.a(10).execute(new bcv(this, countDownLatch, bbnVar));
            return apx.a;
        } catch (OutOfMemoryError e) {
            if (((Boolean) aze.a.b()).booleanValue()) {
                String strA = bix.a();
                new StringBuilder(String.valueOf(strA).length() + 29).append("=== Listing open FDs for ").append(strA).append(" ===");
                String string = new StringBuilder(21).append("/proc/").append(Process.myPid()).append("/fd/").toString();
                int i = 0;
                for (int i2 = 0; i2 < 1024; i2++) {
                    try {
                        File file = new File(new StringBuilder(String.valueOf(string).length() + 11).append(string).append(i2).toString());
                        if (file.exists()) {
                            String str = Os.readlink(file.getAbsolutePath());
                            new StringBuilder(String.valueOf(str).length() + 15).append(i2).append(" -> ").append(str);
                            i++;
                        }
                    } catch (Exception e2) {
                        String strValueOf = String.valueOf(e2);
                        Log.w("CommonFileUtils", new StringBuilder(String.valueOf(strValueOf).length() + 15).append(i2).append(" -> ").append(strValueOf).toString());
                    }
                }
                new StringBuilder(29).append("Listed ").append(i).append(" open files");
                throw e;
            }
            throw e;
        }
    }

    private final boolean shouldLog(bbn bbnVar) {
        return bbnVar.serviceId > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void log(bbn bbnVar, int i) {
        if (shouldLog(bbnVar)) {
            new bdn(bbnVar.clientLibraryVersion, bbnVar.callingPackage, bbnVar.serviceId).logOnce(this.mContext, i);
        }
    }
}
