package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bvj {
    public abstract void a(bvn... bvnVarArr);

    public abstract bvn[] a();

    public abstract void b(bvn[] bvnVarArr);

    public final void a(int i, long j) {
        a(new bvn(i, j, null, new byte[0]));
    }

    public final void a(int i, long j, ewr... ewrVarArr) {
        bvn[] bvnVarArr = new bvn[ewrVarArr.length];
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < ewrVarArr.length) {
                bvnVarArr[i3] = new bvn(i, j, null, ewrVarArr[i3].b());
                i2 = i3 + 1;
            } else {
                a(bvnVarArr);
                return;
            }
        }
    }

    public final void a(int i, long j, String str) {
        a(new bvn(i, j, str, new byte[0]));
    }
}
