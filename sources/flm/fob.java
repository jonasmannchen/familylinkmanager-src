package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fob {
    public final String[] a;

    fob(foc focVar) {
        this.a = (String[]) focVar.a.toArray(new String[focVar.a.size()]);
    }

    public final String a(int i) {
        int i2 = i << 1;
        if (i2 < 0 || i2 >= this.a.length) {
            return null;
        }
        return this.a[i2];
    }

    public final String b(int i) {
        int i2 = (i << 1) + 1;
        if (i2 < 0 || i2 >= this.a.length) {
            return null;
        }
        return this.a[i2];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.a.length / 2;
        for (int i = 0; i < length; i++) {
            sb.append(a(i)).append(": ").append(b(i)).append("\n");
        }
        return sb.toString();
    }
}
