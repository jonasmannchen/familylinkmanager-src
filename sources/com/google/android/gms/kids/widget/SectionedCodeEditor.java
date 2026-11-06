package com.google.android.gms.kids.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.EditText;
import com.google.android.chimeraresources.R;
import flm.cec;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class SectionedCodeEditor extends EditText {
    private final int a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final int g;
    private final int h;
    private final int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private boolean x;
    private long y;

    public SectionedCodeEditor(Context context) {
        this(context, null);
    }

    public SectionedCodeEditor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.v = false;
        this.x = true;
        this.y = System.currentTimeMillis();
        this.a = getResources().getInteger(R.integer.section_code_editor_cursor_duration_millis);
        this.b = getResources().getFraction(R.fraction.section_code_editor_character_spacing_fraction, 1, 1);
        this.c = getResources().getFraction(R.fraction.section_code_editor_section_spacing_fraction, 1, 1);
        this.d = getResources().getFraction(R.fraction.section_code_editor_separator_width_fraction, 1, 1);
        this.e = getResources().getFraction(R.fraction.section_code_editor_bar_height_fraction, 1, 1);
        this.f = getResources().getFraction(R.fraction.section_code_editor_bar_top_margin_fraction, 1, 1);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.textColor, typedValue, true);
        int i = typedValue.data;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cec.i);
        this.j = typedArrayObtainStyledAttributes.getInt(cec.j, 3);
        this.k = typedArrayObtainStyledAttributes.getInt(cec.n, 3);
        this.g = typedArrayObtainStyledAttributes.getColor(cec.k, i);
        this.h = typedArrayObtainStyledAttributes.getColor(cec.m, this.g);
        this.i = typedArrayObtainStyledAttributes.getColor(cec.l, this.g);
        typedArrayObtainStyledAttributes.recycle();
        this.w = attributeSet.getAttributeBooleanValue(android.R.attr.cursorVisible, true);
        super.setCursorVisible(false);
        setLongClickable(false);
        setBackground(null);
        setGravity(0);
        setLayoutDirection(0);
        setMaxLines(1);
        setImeOptions(6);
        setImeOptions(33554432);
        int i2 = this.j * this.k;
        if (this.l != i2) {
            this.l = i2;
            invalidate();
        }
        setFilters(getFilters());
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("super_state", super.onSaveInstanceState());
        bundle.putBoolean("error_state", this.v);
        bundle.putBoolean("cursor_visible", this.w);
        return bundle;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super_state"));
        this.v = bundle.getBoolean("error_state", false);
        this.w = bundle.getBoolean("cursor_visible", true);
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        InputFilter[] inputFilterArr2;
        boolean z;
        boolean z2 = false;
        InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(this.l);
        int i = 0;
        while (i < inputFilterArr.length && !z2) {
            if (inputFilterArr[i] instanceof InputFilter.LengthFilter) {
                z = true;
                if (((InputFilter.LengthFilter) inputFilterArr[i]).getMax() != this.l) {
                    inputFilterArr[i] = lengthFilter;
                }
            } else {
                z = z2;
            }
            i++;
            z2 = z;
        }
        if (z2) {
            inputFilterArr2 = inputFilterArr;
        } else {
            inputFilterArr2 = (InputFilter[]) Arrays.copyOf(inputFilterArr, inputFilterArr.length + 1);
            inputFilterArr2[inputFilterArr.length] = lengthFilter;
        }
        super.setFilters(inputFilterArr2);
    }

    @Override // android.widget.TextView
    public final void setCursorVisible(boolean z) {
        this.w = z;
    }

    @Override // android.widget.TextView
    public final boolean isCursorVisible() {
        return this.w;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        a();
        this.o = this.n;
        this.p = (int) (this.m * (1.0f + this.b));
        this.q = this.p * this.k;
        this.r = (int) (this.n * this.e);
        this.s = (int) (this.n * this.f);
        this.t = (int) (this.p * this.c);
        this.u = (int) (this.t * this.d);
        int paddingStart = getPaddingStart() + getPaddingEnd() + (this.j * this.q) + ((this.j - 1) * this.t);
        int paddingTop = this.r + getPaddingTop() + getPaddingBottom() + this.n + this.s;
        int iMax = Math.max(paddingStart, getMinimumWidth());
        int iMax2 = Math.max(paddingTop, getMinimumHeight());
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(iMax, size) : iMax;
        }
        if (mode2 != 1073741824) {
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(iMax2, size2) : iMax2;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingStart(), getPaddingTop(), canvas.getWidth() - getPaddingEnd(), canvas.getHeight() - getPaddingBottom());
        canvas.translate(getPaddingStart(), getPaddingTop());
        Paint paint = new Paint(getPaint());
        paint.setColor(getTextColors().getDefaultColor());
        paint.setStyle(Paint.Style.FILL);
        String string = getText().toString();
        a();
        float[] fArr = new float[string.length()];
        paint.getTextWidths(string, fArr);
        for (int i = 0; i < string.length(); i++) {
            canvas.drawText(string.substring(i, i + 1), (this.p * i) + ((i / this.k) * this.t) + ((this.p - fArr[i]) / 2.0f), this.n, paint);
        }
        if (this.j > 1) {
            Rect rect = new Rect(0, 0, this.u, this.r);
            rect.offset(this.q + ((this.t - this.u) / 2), this.n / 2);
            for (int i2 = 0; i2 < this.j - 1; i2++) {
                canvas.drawRect(rect, paint);
                rect.offset(this.q + this.t, 0);
            }
        }
        if (isCursorVisible() && isFocused() && string.length() < this.l) {
            int length = (string.length() * this.p) + ((string.length() / this.k) * this.t) + (this.p / 2);
            int i3 = this.n;
            int i4 = this.o;
            if (System.currentTimeMillis() - this.y > this.a) {
                this.x = !this.x;
                this.y = System.currentTimeMillis();
            }
            if (this.x) {
                canvas.drawRect(length - this.r, i3 - i4, length, i3, paint);
            }
            postInvalidateDelayed(this.a);
        }
        Rect rect2 = new Rect(0, 0, this.q, this.r);
        rect2.offset(0, this.n + this.s);
        for (int i5 = 0; i5 < this.j; i5++) {
            if (this.v) {
                paint.setColor(this.i);
            } else if (isFocused() && string.length() / this.k == i5) {
                paint.setColor(this.h);
            } else {
                paint.setColor(this.g);
            }
            canvas.drawRect(rect2, paint);
            rect2.offset(this.q + this.t, 0);
        }
        canvas.restore();
    }

    @Override // android.widget.TextView
    protected final void onSelectionChanged(int i, int i2) {
        if (isCursorVisible()) {
            this.x = true;
            this.y = System.currentTimeMillis();
        }
        int length = getText().length();
        if (i != length || i2 != length) {
            setSelection(length, length);
        } else {
            super.onSelectionChanged(i, i2);
        }
    }

    private final void a() {
        Rect rect = new Rect();
        getPaint().getTextBounds("m", 0, 1, rect);
        this.m = rect.width();
        getPaint().getTextBounds("0", 0, 1, rect);
        this.n = rect.height();
    }
}
