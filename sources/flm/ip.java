package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class ip extends io {
    public pr[] n;
    public String o;
    public int p;

    public ip() {
        super((byte) 0);
        this.n = null;
    }

    public ip(ip ipVar) {
        super((byte) 0);
        this.n = null;
        this.o = ipVar.o;
        this.p = ipVar.p;
        this.n = pp.a(ipVar.n);
    }

    public String getPathName() {
        return this.o;
    }

    public boolean a() {
        return false;
    }

    public pr[] getPathData() {
        return this.n;
    }

    public void setPathData(pr[] prVarArr) {
        if (!pp.a(this.n, prVarArr)) {
            this.n = pp.a(prVarArr);
            return;
        }
        pr[] prVarArr2 = this.n;
        for (int i = 0; i < prVarArr.length; i++) {
            prVarArr2[i].a = prVarArr[i].a;
            for (int i2 = 0; i2 < prVarArr[i].b.length; i2++) {
                prVarArr2[i].b[i2] = prVarArr[i].b[i2];
            }
        }
    }
}
