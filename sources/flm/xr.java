package flm;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class xr extends yc {
    private sp D;
    public sa a;

    xr(xr xrVar, xp xpVar, Resources resources) {
        super(xrVar, xpVar, resources);
        if (xrVar != null) {
            this.a = xrVar.a;
            this.D = xrVar.D;
        } else {
            this.a = new sa();
            this.D = new sp();
        }
    }

    @Override // flm.yc, flm.xz
    final void a() {
        this.a = (sa) this.a.clone();
        this.D = (sp) this.D.clone();
    }

    final int a(int i, int i2, Drawable drawable, boolean z) {
        int iA = super.a(drawable);
        long jA = a(i, i2);
        long j = 0;
        if (z) {
            j = 8589934592L;
        }
        this.a.c(jA, Long.valueOf(((long) iA) | j));
        if (z) {
            this.a.c(a(i2, i), Long.valueOf(j | ((long) iA) | 4294967296L));
        }
        return iA;
    }

    final int a(int[] iArr, Drawable drawable, int i) {
        int iA = super.a(iArr, drawable);
        this.D.b(iA, Integer.valueOf(i));
        return iA;
    }

    final int a(int[] iArr) {
        int iB = super.b(iArr);
        return iB >= 0 ? iB : super.b(StateSet.WILD_CARD);
    }

    final int a(int i) {
        if (i < 0) {
            return 0;
        }
        return ((Integer) this.D.a(i, 0)).intValue();
    }

    @Override // flm.yc, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new xp(this, null);
    }

    @Override // flm.yc, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new xp(this, resources);
    }

    static long a(int i, int i2) {
        return (((long) i) << 32) | ((long) i2);
    }
}
