package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class sl implements sk {
    private final Object[] a;
    private int b;

    public sl(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.a = new Object[i];
    }

    @Override // flm.sk
    public Object a() {
        if (this.b <= 0) {
            return null;
        }
        int i = this.b - 1;
        Object obj = this.a[i];
        this.a[i] = null;
        this.b--;
        return obj;
    }

    @Override // flm.sk
    public boolean a(Object obj) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.b) {
                z = false;
                break;
            }
            if (this.a[i] == obj) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        }
        if (this.b >= this.a.length) {
            return false;
        }
        this.a[this.b] = obj;
        this.b++;
        return true;
    }
}
