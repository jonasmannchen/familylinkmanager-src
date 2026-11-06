package flm;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class vj {
    public abstract int a();

    public abstract void a(Drawable drawable);

    public abstract void a(CharSequence charSequence);

    public abstract void a(boolean z);

    public abstract void b(boolean z);

    public void c(boolean z) {
    }

    public Context b() {
        return null;
    }

    public void d(boolean z) {
        throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
    }

    public void a(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    public void e(boolean z) {
    }

    public void f(boolean z) {
    }

    public void a(Configuration configuration) {
    }

    public void g(boolean z) {
    }

    public yg a(yh yhVar) {
        return null;
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public boolean a(KeyEvent keyEvent) {
        return false;
    }

    public boolean a(int i, KeyEvent keyEvent) {
        return false;
    }

    public boolean f() {
        return false;
    }

    public void b(CharSequence charSequence) {
    }

    void g() {
    }
}
