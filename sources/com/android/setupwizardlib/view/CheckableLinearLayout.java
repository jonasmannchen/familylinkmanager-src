package com.android.setupwizardlib.view;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CheckableLinearLayout extends LinearLayout implements Checkable {
    private boolean a;

    public CheckableLinearLayout(Context context) {
        super(context);
        this.a = false;
        setFocusable(true);
    }

    public CheckableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
        setFocusable(true);
    }

    @TargetApi(11)
    public CheckableLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = false;
        setFocusable(true);
    }

    @TargetApi(21)
    public CheckableLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = false;
        setFocusable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        return this.a ? mergeDrawableStates(super.onCreateDrawableState(i + 1), new int[]{R.attr.state_checked}) : super.onCreateDrawableState(i);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.a = z;
        refreshDrawableState();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.a;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }
}
