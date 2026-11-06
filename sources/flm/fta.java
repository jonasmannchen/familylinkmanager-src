package flm;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fta {
    private final String a;
    private final ftc b;
    private final long c;
    private final ftk d;
    private final ftk e;

    fta(String str, ftc ftcVar, long j, ftk ftkVar, ftk ftkVar2) {
        this.a = str;
        this.b = (ftc) dvl.a(ftcVar, "severity");
        this.c = j;
        this.d = ftkVar;
        this.e = ftkVar2;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), this.d, this.e});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fta)) {
            return false;
        }
        fta ftaVar = (fta) obj;
        return dvh.a(this.a, ftaVar.a) && dvh.a(this.b, ftaVar.b) && this.c == ftaVar.c && dvh.a(this.d, ftaVar.d) && dvh.a(this.e, ftaVar.e);
    }

    public final String toString() {
        return dve.a(this).a("description", this.a).a("severity", this.b).a("timestampNanos", this.c).a("channelRef", this.d).a("subchannelRef", this.e).toString();
    }
}
