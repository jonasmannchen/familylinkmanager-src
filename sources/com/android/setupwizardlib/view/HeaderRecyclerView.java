package com.android.setupwizardlib.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import flm.afm;
import flm.afw;
import flm.aio;
import flm.ajl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class HeaderRecyclerView extends RecyclerView {
    public View M;
    private int N;

    public HeaderRecyclerView(Context context) {
        super(context);
        a((AttributeSet) null, 0);
    }

    public HeaderRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet, 0);
    }

    public HeaderRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet, i);
    }

    private final void a(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, aio.x, i, 0);
        this.N = typedArrayObtainStyledAttributes.getResourceId(aio.y, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        int i = this.M != null ? 1 : 0;
        accessibilityEvent.setItemCount(accessibilityEvent.getItemCount() - i);
        accessibilityEvent.setFromIndex(Math.max(accessibilityEvent.getFromIndex() - i, 0));
        accessibilityEvent.setToIndex(Math.max(accessibilityEvent.getToIndex() - i, 0));
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void a(afw afwVar) {
        super.a(afwVar);
        if (afwVar != null && this.M == null && this.N != 0) {
            this.M = LayoutInflater.from(getContext()).inflate(this.N, (ViewGroup) this, false);
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void a(afm afmVar) {
        if (this.M != null && afmVar != null) {
            ajl ajlVar = new ajl(afmVar);
            ajlVar.c = this.M;
            afmVar = ajlVar;
        }
        super.a(afmVar);
    }
}
