package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class duu implements dvm {
    protected duu() {
    }

    public abstract boolean a(char c);

    public int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException(dvl.a(i, length, "index"));
        }
        for (int i2 = i; i2 < length; i2++) {
            if (a(charSequence.charAt(i2))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // flm.dvm
    @Deprecated
    public final /* synthetic */ boolean a(Object obj) {
        return a(((Character) obj).charValue());
    }
}
