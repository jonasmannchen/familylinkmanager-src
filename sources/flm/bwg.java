package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwg {
    public fdc a;
    public String b;
    public long c;
    public String d;
    public int e = 0;
    public byte[] f;

    public bwg(fdc fdcVar, String str, long j, String str2, byte[] bArr) {
        this.a = fdcVar;
        this.b = dvj.b(str);
        this.c = j;
        this.d = str2;
        this.f = bArr;
    }

    public final String toString() {
        return String.format("PolicyEntity((%s, %s), %s, %s, %s, [%s])", Integer.valueOf(this.a.z), this.b, Long.valueOf(this.c), this.d, Integer.valueOf(this.e), Integer.valueOf(this.f.length));
    }
}
