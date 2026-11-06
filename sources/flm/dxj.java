package flm;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class dxj extends dxk {
    public Object[] a;
    public int b;
    public boolean c;

    dxj(int i) {
        dwq.a(i, "initialCapacity");
        this.a = new Object[i];
        this.b = 0;
    }

    private final void a(int i) {
        if (this.a.length < i) {
            this.a = Arrays.copyOf(this.a, a(this.a.length, i));
            this.c = false;
        } else if (this.c) {
            this.a = (Object[]) this.a.clone();
            this.c = false;
        }
    }

    @Override // flm.dxk
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public dxj b(Object obj) {
        dvl.a(obj);
        a(this.b + 1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
        return this;
    }

    @Override // flm.dxk
    public dxk a(Object... objArr) {
        dzn.a(objArr, objArr.length);
        a(this.b + objArr.length);
        System.arraycopy(objArr, 0, this.a, this.b, objArr.length);
        this.b += objArr.length;
        return this;
    }
}
