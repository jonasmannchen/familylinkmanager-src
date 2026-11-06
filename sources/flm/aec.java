package flm;

import android.support.v7.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aec implements afz {
    public int a;
    public int b;
    public int[] c;
    public int d;

    final void a(RecyclerView recyclerView, boolean z) {
        this.d = 0;
        if (this.c != null) {
            Arrays.fill(this.c, -1);
        }
        afw afwVar = recyclerView.k;
        if (recyclerView.j == null || afwVar == null || !afwVar.k) {
            return;
        }
        if (z) {
            if (!recyclerView.e.d()) {
                afwVar.a(recyclerView.j.a(), this);
            }
        } else if (!recyclerView.n()) {
            afwVar.a(this.a, this.b, recyclerView.C, this);
        }
        if (this.d > afwVar.l) {
            afwVar.l = this.d;
            afwVar.m = z;
            recyclerView.d.b();
        }
    }

    @Override // flm.afz
    public final void a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.d << 1;
        if (this.c == null) {
            this.c = new int[4];
            Arrays.fill(this.c, -1);
        } else if (i3 >= this.c.length) {
            int[] iArr = this.c;
            this.c = new int[i3 << 1];
            System.arraycopy(iArr, 0, this.c, 0, iArr.length);
        }
        this.c[i3] = i;
        this.c[i3 + 1] = i2;
        this.d++;
    }

    final boolean a(int i) {
        if (this.c == null) {
            return false;
        }
        int i2 = this.d << 1;
        for (int i3 = 0; i3 < i2; i3 += 2) {
            if (this.c[i3] == i) {
                return true;
            }
        }
        return false;
    }

    final void a() {
        if (this.c != null) {
            Arrays.fill(this.c, -1);
        }
        this.d = 0;
    }
}
