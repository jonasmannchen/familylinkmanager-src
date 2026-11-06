package flm;

import android.content.pm.IPackageStatsObserver;
import com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dph extends PackageStatsCapture.PackageStatsInvocation {
    public dph(String str, Class[] clsArr) {
        super(str, clsArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture.PackageStatsInvocation
    public final Object[] a(String str, int i, IPackageStatsObserver iPackageStatsObserver) {
        return new Object[]{str, iPackageStatsObserver};
    }
}
