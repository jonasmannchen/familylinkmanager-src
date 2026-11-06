package flm;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tj implements View.OnApplyWindowInsetsListener {
    private final /* synthetic */ th a;

    tj(th thVar) {
        this.a = thVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return (WindowInsets) tz.a(this.a.a(view, tz.a(windowInsets)));
    }
}
