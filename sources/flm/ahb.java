package flm;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ahb extends ContextWrapper {
    private static final Object a = new Object();
    private static ArrayList b;
    private final Resources c;
    private final Resources.Theme d;

    public static Context a(Context context) {
        if (!(context instanceof ahb) && !(context.getResources() instanceof ahd) && !(context.getResources() instanceof ahv)) {
            ahv.a();
        }
        return context;
    }

    private ahb(Context context) {
        super(context);
        ahv.a();
        this.c = new ahd(this, context.getResources());
        this.d = null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        return this.d == null ? super.getTheme() : this.d;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.d == null) {
            super.setTheme(i);
        } else {
            this.d.applyStyle(i, true);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return this.c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return this.c.getAssets();
    }
}
