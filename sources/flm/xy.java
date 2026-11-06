package flm;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class xy implements Drawable.Callback {
    public Drawable.Callback a;

    xy() {
    }

    public final Drawable.Callback a() {
        Drawable.Callback callback = this.a;
        this.a = null;
        return callback;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (this.a != null) {
            this.a.scheduleDrawable(drawable, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (this.a != null) {
            this.a.unscheduleDrawable(drawable, runnable);
        }
    }
}
