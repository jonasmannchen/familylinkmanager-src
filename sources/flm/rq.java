package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class rq implements rl {
    private final rp a;

    rq(rp rpVar) {
        this.a = rpVar;
    }

    protected abstract boolean a();

    @Override // flm.rl
    public final boolean a(CharSequence charSequence, int i, int i2) {
        if (charSequence == null || i2 < 0 || charSequence.length() - i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (this.a == null) {
            return a();
        }
        switch (this.a.a(charSequence, 0, i2)) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return true;
            case 1:
                return false;
            default:
                return a();
        }
    }
}
