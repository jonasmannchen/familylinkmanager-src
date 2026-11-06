package android.support.design.internal;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import flm.abw;
import flm.fi;
import flm.ti;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends abw implements Checkable {
    private static final int[] a = {R.attr.state_checked};
    private boolean b;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.chimeraresources.R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ti.a(this, new fi(this));
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.b != z) {
            this.b = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.b;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.b);
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        return this.b ? mergeDrawableStates(super.onCreateDrawableState(a.length + i), a) : super.onCreateDrawableState(i);
    }
}
