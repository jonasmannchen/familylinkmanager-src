package flm;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class yc extends xz {
    private int[][] a;

    yc(yc ycVar, yb ybVar, Resources resources) {
        super(ycVar, ybVar, resources);
        if (ycVar != null) {
            this.a = ycVar.a;
        } else {
            this.a = new int[this.d.length][];
        }
    }

    @Override // flm.xz
    void a() {
        int[][] iArr = new int[this.a.length][];
        for (int length = this.a.length - 1; length >= 0; length--) {
            iArr[length] = this.a[length] != null ? (int[]) this.a[length].clone() : null;
        }
        this.a = iArr;
    }

    final int a(int[] iArr, Drawable drawable) {
        int iA = a(drawable);
        this.a[iA] = iArr;
        return iA;
    }

    final int b(int[] iArr) {
        int[][] iArr2 = this.a;
        int i = this.e;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return new yb(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new yb(this, resources);
    }

    @Override // flm.xz
    public final void b(int i, int i2) {
        super.b(i, i2);
        int[][] iArr = new int[i2][];
        System.arraycopy(this.a, 0, iArr, 0, i);
        this.a = iArr;
    }
}
