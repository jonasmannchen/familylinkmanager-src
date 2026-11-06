package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fks implements fkc {
    public final fke a;
    public final String b;
    public final Object[] c;
    private final int d;

    public fks(fke fkeVar, String str, Object[] objArr) {
        this.a = fkeVar;
        this.b = str;
        this.c = objArr;
        int i = 1;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.d = cCharAt;
            return;
        }
        int i2 = cCharAt & 8191;
        int i3 = 13;
        while (true) {
            int i4 = i + 1;
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 55296) {
                this.d = (cCharAt2 << i3) | i2;
                return;
            } else {
                i2 |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i = i4;
            }
        }
    }

    @Override // flm.fkc
    public final fke c() {
        return this.a;
    }

    @Override // flm.fkc
    public final int a() {
        return (this.d & 1) == 1 ? dp.ay : dp.az;
    }

    @Override // flm.fkc
    public final boolean b() {
        return (this.d & 2) == 2;
    }
}
