package flm;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aji extends su {
    public final su b;

    public aji(TextView textView) {
        this(Build.VERSION.SDK_INT >= 26 ? new su() : new ajj(textView));
    }

    private aji(su suVar) {
        this.b = suVar;
    }

    @Override // flm.su
    public final void a(View view, int i) {
        this.b.a(view, i);
    }

    @Override // flm.su
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        this.b.c(view, accessibilityEvent);
    }

    @Override // flm.su
    public final boolean d(View view, AccessibilityEvent accessibilityEvent) {
        return this.b.d(view, accessibilityEvent);
    }

    @Override // flm.su
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        this.b.b(view, accessibilityEvent);
    }

    @Override // flm.su
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        this.b.a(view, accessibilityEvent);
    }

    @Override // flm.su
    public final void a(View view, ua uaVar) {
        this.b.a(view, uaVar);
    }

    @Override // flm.su
    public final boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.b.a(viewGroup, view, accessibilityEvent);
    }

    @Override // flm.su
    public final ud a(View view) {
        return this.b.a(view);
    }

    @Override // flm.su
    public final boolean a(View view, int i, Bundle bundle) {
        return this.b.a(view, i, bundle);
    }
}
