package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bsl {
    private static bsl a;

    public abstract bsm a(String str, boolean z);

    public static synchronized bsl a() {
        if (a == null) {
            if (bav.IS_PACKAGE_SIDE) {
                a = new bsi();
            } else {
                a = new bsg();
            }
        }
        return a;
    }
}
