package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class dvu extends dus {
    public final CharSequence b;
    private final duu c;
    private final boolean d;
    private int e = 0;
    private int f;

    protected dvu(dvo dvoVar, CharSequence charSequence) {
        this.c = dvoVar.a;
        this.d = dvoVar.b;
        this.f = dvoVar.d;
        this.b = charSequence;
    }

    abstract int a(int i);

    abstract int b(int i);

    @Override // flm.dus
    protected final /* synthetic */ Object a() {
        int i = this.e;
        while (this.e != -1) {
            int iA = a(this.e);
            if (iA == -1) {
                iA = this.b.length();
                this.e = -1;
            } else {
                this.e = b(iA);
            }
            if (this.e == i) {
                this.e++;
                if (this.e > this.b.length()) {
                    this.e = -1;
                }
            } else {
                int i2 = i;
                while (i2 < iA && this.c.a(this.b.charAt(i2))) {
                    i2++;
                }
                int length = iA;
                while (length > i2 && this.c.a(this.b.charAt(length - 1))) {
                    length--;
                }
                if (this.d && i2 == length) {
                    i = this.e;
                } else {
                    if (this.f == 1) {
                        length = this.b.length();
                        this.e = -1;
                        while (length > i2 && this.c.a(this.b.charAt(length - 1))) {
                            length--;
                        }
                    } else {
                        this.f--;
                    }
                    return this.b.subSequence(i2, length).toString();
                }
            }
        }
        this.a = dp.ai;
        return null;
    }
}
