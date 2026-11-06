package flm;

import android.support.design.internal.CheckableImageButton;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fi extends su {
    private final /* synthetic */ CheckableImageButton b;

    public fi(CheckableImageButton checkableImageButton) {
        this.b = checkableImageButton;
    }

    @Override // flm.su
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.b.isChecked());
    }

    @Override // flm.su
    public final void a(View view, ua uaVar) {
        super.a(view, uaVar);
        uaVar.a(true);
        uaVar.a.setChecked(this.b.isChecked());
    }
}
