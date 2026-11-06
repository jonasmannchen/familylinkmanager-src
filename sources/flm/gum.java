package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gum {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public gum f;
    public gum g;

    gum() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public gum(gum gumVar) {
        this(gumVar.a, gumVar.b, gumVar.c);
        gumVar.d = true;
    }

    gum(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.e = false;
        this.d = true;
    }

    public final gum a() {
        gum gumVar = this.f != this ? this.f : null;
        this.g.f = this.f;
        this.f.g = this.g;
        this.f = null;
        this.g = null;
        return gumVar;
    }

    public final gum a(gum gumVar) {
        gumVar.g = this;
        gumVar.f = this.f;
        this.f.g = gumVar;
        this.f = gumVar;
        return gumVar;
    }

    public final void a(gum gumVar, int i) {
        if (!gumVar.e) {
            throw new IllegalArgumentException();
        }
        if (gumVar.c + i > 8192) {
            if (gumVar.d) {
                throw new IllegalArgumentException();
            }
            if ((gumVar.c + i) - gumVar.b > 8192) {
                throw new IllegalArgumentException();
            }
            System.arraycopy(gumVar.a, gumVar.b, gumVar.a, 0, gumVar.c - gumVar.b);
            gumVar.c -= gumVar.b;
            gumVar.b = 0;
        }
        System.arraycopy(this.a, this.b, gumVar.a, gumVar.c, i);
        gumVar.c += i;
        this.b += i;
    }
}
