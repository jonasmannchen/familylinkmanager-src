package flm;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aij {
    public int a = 0;
    public aii[] b = new aii[4];

    aij() {
    }

    public final void a(aii aiiVar) {
        if (this.a == this.b.length) {
            this.b = (aii[]) Arrays.copyOf(this.b, this.a << 1);
        }
        aii[] aiiVarArr = this.b;
        int i = this.a;
        this.a = i + 1;
        aiiVarArr[i] = aiiVar;
    }

    public final void a(int i) {
        aii[] aiiVarArr = this.b;
        aii[] aiiVarArr2 = this.b;
        int i2 = this.a - 1;
        this.a = i2;
        aiiVarArr[i] = aiiVarArr2[i2];
        this.b[this.a] = null;
    }
}
