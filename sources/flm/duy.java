package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class duy extends dux {
    public static final duy a = new duy();

    private duy() {
        super("CharMatcher.none()");
    }

    @Override // flm.duu
    public final boolean a(char c) {
        return false;
    }

    @Override // flm.duu
    public final int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException(dvl.a(i, length, "index"));
        }
        return -1;
    }
}
