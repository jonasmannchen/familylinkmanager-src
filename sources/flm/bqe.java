package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bqe {
    public static final bqe a = new bqe(0, 30, 3600);
    public final int b;
    public final int c = 30;
    public final int d = 3600;

    private bqe(int i, int i2, int i3) {
        this.b = i;
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        return new StringBuilder(74).append("policy=").append(i).append(" initial_backoff=").append(i2).append(" maximum_backoff=").append(this.d).toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqe)) {
            return false;
        }
        bqe bqeVar = (bqe) obj;
        return bqeVar.b == this.b && bqeVar.c == this.c && bqeVar.d == this.d;
    }

    public final int hashCode() {
        return (((((this.b + 1) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    static {
        new bqe(1, 30, 3600);
    }
}
