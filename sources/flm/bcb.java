package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bcb {
    public final int mBindFlags;
    public final boolean mLocalService;
    public final String mPackageName;
    public final String mStartAction;

    public bcb(String str, String str2, boolean z, int i) {
        this.mPackageName = str;
        this.mStartAction = str2;
        this.mLocalService = z;
        this.mBindFlags = i;
    }

    final String getStartAction() {
        return this.mStartAction;
    }

    final String getPackageName() {
        return this.mPackageName;
    }

    final boolean isLocalService() {
        return this.mLocalService;
    }

    final int getBindFlags() {
        return this.mBindFlags;
    }
}
