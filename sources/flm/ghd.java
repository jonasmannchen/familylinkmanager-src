package flm;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ghd {
    private static final ghd c = new ghd(new fvi[0]);
    public final fvi[] a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public static ghd a(frj frjVar, ftv ftvVar) {
        List list = frjVar.g;
        if (list.isEmpty()) {
            return c;
        }
        fvi[] fviVarArr = new fvi[list.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= fviVarArr.length) {
                return new ghd(fviVarArr);
            }
            fviVarArr[i2] = ((fru) list.get(i2)).a(ftvVar);
            i = i2 + 1;
        }
    }

    private ghd(fvi[] fviVarArr) {
        this.a = fviVarArr;
    }

    public final void a(int i) {
        for (fvi fviVar : this.a) {
            fviVar.b();
        }
    }

    public final void a(int i, long j, long j2) {
        for (fvi fviVar : this.a) {
            fviVar.a(i, j, j2);
        }
    }

    public final void a(long j) {
        for (fvi fviVar : this.a) {
            fviVar.b(j);
        }
    }

    public final void b(long j) {
        for (fvi fviVar : this.a) {
            fviVar.a(j);
        }
    }

    public final void c(long j) {
        for (fvi fviVar : this.a) {
            fviVar.d(j);
        }
    }

    public final void d(long j) {
        for (fvi fviVar : this.a) {
            fviVar.c(j);
        }
    }
}
