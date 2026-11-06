package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ro implements rp {
    public static final ro a = new ro();

    @Override // flm.rp
    public final int a(CharSequence charSequence, int i, int i2) {
        int i3 = i + i2;
        int iB = 2;
        while (i < i3 && iB == 2) {
            iB = rm.b(Character.getDirectionality(charSequence.charAt(i)));
            i++;
        }
        return iB;
    }

    private ro() {
    }
}
