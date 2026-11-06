package flm;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fze {
    public String a = "unknown-authority";
    public frd b = frd.b;
    public String c;
    public gex d;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fze)) {
            return false;
        }
        fze fzeVar = (fze) obj;
        return this.a.equals(fzeVar.a) && this.b.equals(fzeVar.b) && dvh.a(this.c, fzeVar.c) && dvh.a(this.d, fzeVar.d);
    }
}
