package flm;

import android.content.Context;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ajh extends ContextThemeWrapper {
    public ajh(Context context, int i) {
        super(context, i);
    }

    @Override // android.view.ContextThemeWrapper
    protected final void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, false);
    }
}
