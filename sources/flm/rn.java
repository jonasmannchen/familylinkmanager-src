package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class rn implements rp {
    public static final rn a = new rn(true);
    private final boolean b = true;

    @Override // flm.rp
    public final int a(CharSequence charSequence, int i, int i2) {
        int i3 = i + i2;
        boolean z = false;
        while (i < i3) {
            switch (rm.a(Character.getDirectionality(charSequence.charAt(i)))) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    if (this.b) {
                        return 0;
                    }
                    z = true;
                    break;
                case 1:
                    if (!this.b) {
                        return 1;
                    }
                    z = true;
                    break;
                    break;
            }
            i++;
        }
        if (z) {
            return !this.b ? 0 : 1;
        }
        return 2;
    }

    private rn(boolean z) {
    }
}
