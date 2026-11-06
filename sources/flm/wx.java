package flm;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class wx extends vj {
    public adb a;
    public boolean b;
    public Window.Callback c;
    private boolean d;
    private boolean e;
    private ArrayList f = new ArrayList();
    private final Runnable g = new wy(this);
    private final ahk h = new wz(this);

    wx(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.a = new ahn(toolbar, false);
        this.c = new xc(this, callback);
        this.a.a(this.c);
        toolbar.q = this.h;
        this.a.a(charSequence);
    }

    @Override // flm.vj
    public final void a(Drawable drawable) {
        this.a.a((Drawable) null);
    }

    @Override // flm.vj
    public final void c(boolean z) {
    }

    @Override // flm.vj
    public final void a(float f) {
        ti.a(this.a.a(), f);
    }

    @Override // flm.vj
    public final Context b() {
        return this.a.b();
    }

    @Override // flm.vj
    public final void e(boolean z) {
    }

    @Override // flm.vj
    public final void f(boolean z) {
    }

    @Override // flm.vj
    public final void a(CharSequence charSequence) {
        this.a.b(charSequence);
    }

    @Override // flm.vj
    public final void b(CharSequence charSequence) {
        this.a.a(charSequence);
    }

    private final void a(int i, int i2) {
        this.a.a((this.a.n() & (i2 ^ (-1))) | (i & i2));
    }

    @Override // flm.vj
    public final void a(boolean z) {
        a(2, 2);
    }

    @Override // flm.vj
    public final void b(boolean z) {
        a(z ? 4 : 0, 4);
    }

    @Override // flm.vj
    public final int a() {
        return this.a.n();
    }

    @Override // flm.vj
    public final boolean c() {
        return this.a.j();
    }

    @Override // flm.vj
    public final boolean d() {
        return this.a.k();
    }

    @Override // flm.vj
    public final boolean e() {
        this.a.a().removeCallbacks(this.g);
        ti.a(this.a.a(), this.g);
        return true;
    }

    @Override // flm.vj
    public final boolean f() {
        if (!this.a.c()) {
            return false;
        }
        this.a.d();
        return true;
    }

    @Override // flm.vj
    public final boolean a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            c();
        }
        return true;
    }

    @Override // flm.vj
    public final boolean a(int i, KeyEvent keyEvent) {
        Menu menuH = h();
        if (menuH == null) {
            return false;
        }
        menuH.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuH.performShortcut(i, keyEvent, 0);
    }

    @Override // flm.vj
    final void g() {
        this.a.a().removeCallbacks(this.g);
    }

    @Override // flm.vj
    public final void g(boolean z) {
        if (z != this.e) {
            this.e = z;
            int size = this.f.size();
            for (int i = 0; i < size; i++) {
                ((vl) this.f.get(i)).a();
            }
        }
    }

    final Menu h() {
        if (!this.d) {
            this.a.a(new xa(this), new xb(this));
            this.d = true;
        }
        return this.a.q();
    }
}
