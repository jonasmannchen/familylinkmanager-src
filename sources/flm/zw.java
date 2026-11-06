package flm;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class zw {
    public View a;
    public int b;
    public PopupWindow.OnDismissListener c;
    private final Context d;
    private final zi e;
    private final boolean f;
    private final int g;
    private final int h;
    private boolean i;
    private zz j;
    private zv k;
    private final PopupWindow.OnDismissListener l;

    public zw(Context context, zi ziVar, View view, boolean z, int i) {
        this(context, ziVar, view, z, i, 0);
    }

    public zw(Context context, zi ziVar, View view, boolean z, int i, int i2) {
        this.b = 8388611;
        this.l = new zx(this);
        this.d = context;
        this.e = ziVar;
        this.a = view;
        this.f = z;
        this.g = i;
        this.h = i2;
    }

    public final void a(boolean z) {
        this.i = z;
        if (this.k != null) {
            this.k.b(z);
        }
    }

    public final zv a() {
        zv aafVar;
        if (this.k == null) {
            Display defaultDisplay = ((WindowManager) this.d.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= this.d.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                aafVar = new yz(this.d, this.a, this.g, this.h, this.f);
            } else {
                aafVar = new aaf(this.d, this.e, this.a, this.g, this.h, this.f);
            }
            aafVar.a(this.e);
            aafVar.a(this.l);
            aafVar.a(this.a);
            aafVar.a(this.j);
            aafVar.b(this.i);
            aafVar.a(this.b);
            this.k = aafVar;
        }
        return this.k;
    }

    public final boolean b() {
        if (e()) {
            return true;
        }
        if (this.a == null) {
            return false;
        }
        a(0, 0, false, false);
        return true;
    }

    final void a(int i, int i2, boolean z, boolean z2) {
        zv zvVarA = a();
        zvVarA.c(z2);
        if (z) {
            if ((sz.a(this.b, ti.f(this.a)) & 7) == 5) {
                i -= this.a.getWidth();
            }
            zvVarA.b(i);
            zvVarA.c(i2);
            int i3 = (int) ((this.d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            zvVarA.g = new Rect(i - i3, i2 - i3, i + i3, i3 + i2);
        }
        zvVarA.b();
    }

    public final void c() {
        if (e()) {
            this.k.c();
        }
    }

    public void d() {
        this.k = null;
        if (this.c != null) {
            this.c.onDismiss();
        }
    }

    public final boolean e() {
        return this.k != null && this.k.d();
    }

    public final void a(zz zzVar) {
        this.j = zzVar;
        if (this.k != null) {
            this.k.a(zzVar);
        }
    }
}
