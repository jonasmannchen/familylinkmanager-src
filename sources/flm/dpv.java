package flm;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class dpv implements Comparator {
    public static final Comparator a = new dpv();

    private dpv() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return (int) (((dps) obj).c - ((dps) obj2).c);
    }
}
