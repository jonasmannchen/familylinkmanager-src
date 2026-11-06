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
import android.view.View;
import android.widget.EditText;
import com.google.android.chimeraresources.R;
import flm.dvl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class PinCodeEditor extends EditText {
    private final int a;
    private final String b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final int h;
    private final int i;
    private final int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private boolean v;
    private long w;

    public PinCodeEditor(Context context) {
        this(context, null);
    }

    public PinCodeEditor(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public PinCodeEditor(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PinCodeEditor(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.t = false;
        this.u = true;
        this.v = true;
        this.w = System.currentTimeMillis();
        this.a = getResources().getInteger(R.integer.pin_code_editor_cursor_duration_millis);
        this.b = getResources().getString(R.string.pin_code_editor_code_mask);
        this.c = getResources().getFraction(R.fraction.pin_code_editor_bar_width_fraction, 1, 1);
        this.d = getResources().getFraction(R.fraction.pin_code_editor_bar_spacing_fraction, 1, 1);
        this.e = getResources().getFraction(R.fraction.pin_code_editor_bar_height_fraction, 1, 1);
        this.f = getResources().getFraction(R.fraction.pin_code_editor_focused_bar_height_fraction, 1, 1);
        this.g = getResources().getFraction(R.fraction.pin_code_editor_bar_top_margin_fraction, 1, 1);
        this.k = getResources().getInteger(R.integer.pin_code_editor_pin_code_length);
        this.h = a(context, attributeSet, R.attr.colorControlNormal);
        this.i = a(context, attributeSet, R.attr.colorControlActivated);
        this.j = a(context, attributeSet, R.attr.colorError);
        super.setCursorVisible(false);
        setLongClickable(false);
        setBackground(null);
        setGravity(0);
        setLayoutDirection(0);
        setMaxLines(1);
        setImeOptions(6);
        setImeOptions(33554432);
        b();
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("super_state", super.onSaveInstanceState());
        bundle.putBoolean("error_state", this.t);
        bundle.putBoolean("cursor_visible", this.u);
        return bundle;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super_state"));
        this.t = bundle.getBoolean("error_state", false);
        this.u = bundle.getBoolean("cursor_visible", true);
    }

    @Override // android.widget.TextView
    public void setCursorVisible(boolean z) {
        this.u = z;
    }

    @Override // android.widget.TextView
    public boolean isCursorVisible() {
        return this.u;
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(inputFilterArr);
        b();
    }

    public final void a(boolean z) {
        this.t = z;
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        a();
        this.n = this.m;
        this.p = (int) (this.l * this.d);
        if (mode == 1073741824 || mode == Integer.MIN_VALUE) {
            this.o = (((size - getPaddingStart()) - getPaddingEnd()) - ((this.k - 1) * this.p)) / this.k;
        } else {
            this.o = (int) (this.l * this.c);
        }
        this.q = (int) (this.m * this.e);
        this.r = (int) (this.m * this.f);
        this.s = (int) (this.m * this.g);
        int paddingStart = getPaddingStart() + getPaddingEnd() + (this.k * this.o) + ((this.k - 1) * this.p);
        int paddingTop = this.r + getPaddingTop() + getPaddingBottom() + this.m + this.s;
        int iMax = Math.max(paddingStart, getMinimumWidth());
        int iMax2 = Math.max(paddingTop, getMinimumHeight());
        if (mode == 1073741824 || mode == Integer.MIN_VALUE) {
            iMax = size;
        }
        if (mode2 != 1073741824) {
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(iMax2, size2) : iMax2;
        }
        setMeasuredDimension(iMax, size2);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Rect rect;
        canvas.save();
        canvas.clipRect(getPaddingStart(), getPaddingTop(), canvas.getWidth() - getPaddingEnd(), canvas.getHeight() - getPaddingBottom());
        canvas.translate(getPaddingStart(), getPaddingTop());
        int i = this.o + this.p;
        Paint paint = new Paint(getPaint());
        paint.setStyle(Paint.Style.FILL);
        String string = getText().toString();
        int inputType = getInputType();
        if ((inputType & 16) != 0 || (inputType & 128) != 0) {
            String str = this.b;
            int length = string.length();
            dvl.a(str);
            if (length <= 1) {
                dvl.a(length >= 0, "invalid count: %s", length);
                string = length == 0 ? "" : str;
            } else {
                int length2 = str.length();
                long j = ((long) length2) * ((long) length);
                int i2 = (int) j;
                if (i2 != j) {
                    throw new ArrayIndexOutOfBoundsException(new StringBuilder(51).append("Required array size too large: ").append(j).toString());
                }
                char[] cArr = new char[i2];
                str.getChars(0, length2, cArr, 0);
                while (length2 < i2 - length2) {
                    System.arraycopy(cArr, 0, cArr, length2, length2);
                    length2 <<= 1;
                }
                System.arraycopy(cArr, 0, cArr, length2, i2 - length2);
                string = new String(cArr);
            }
        }
        a();
        float f = this.m;
        float[] fArr = new float[string.length()];
        paint.getTextWidths(string, fArr);
        paint.setColor(getCurrentTextColor());
        for (int i3 = 0; i3 < string.length(); i3++) {
            canvas.drawText(string.substring(i3, i3 + 1), (i3 * i) + ((this.o - fArr[i3]) / 2.0f), f, paint);
        }
        if (this.u && isFocused() && string.length() < this.k) {
            int length3 = (string.length() * i) + (this.o / 2);
            paint.setColor(this.i);
            int i4 = (int) f;
            int i5 = this.n;
            if (System.currentTimeMillis() - this.w > this.a) {
                this.v = this.v ? false : true;
                this.w = System.currentTimeMillis();
            }
            if (this.v) {
                canvas.drawRect(length3 - this.q, i4 - i5, length3, i4, paint);
            }
            postInvalidateDelayed(this.a);
        }
        if (this.t) {
            paint.setColor(this.j);
        } else if (isFocused()) {
            paint.setColor(this.i);
        } else {
            paint.setColor(this.h);
        }
        if (isFocused()) {
            rect = new Rect(0, 0, this.o, this.r);
            rect.offset(0, ((int) f) + this.s);
        } else {
            rect = new Rect(0, 0, this.o, this.q);
            rect.offset(0, ((((int) f) + this.s) + this.r) - this.q);
        }
        for (int i6 = 0; i6 < this.k; i6++) {
            canvas.drawRect(rect, paint);
            rect.offset(i, 0);
        }
        canvas.restore();
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i, int i2) {
        if (isCursorVisible()) {
            this.v = true;
            this.w = System.currentTimeMillis();
        }
        int length = getText().length();
        if (i != length || i2 != length) {
            setSelection(length, length);
        } else {
            super.onSelectionChanged(i, i2);
        }
    }

    private static int a(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    private final void a() {
        Rect rect = new Rect();
        getPaint().getTextBounds("0", 0, 1, rect);
        this.l = rect.width();
        this.m = rect.height();
    }

    private final void b() {
        InputFilter[] filters = getFilters();
        int max = this.k;
        for (int length = filters.length - 1; length >= 0; length--) {
            if (filters[length] instanceof InputFilter.LengthFilter) {
                max = ((InputFilter.LengthFilter) filters[length]).getMax();
                break;
            }
        }
        if (this.k != max && max > 0) {
            this.k = max;
            invalidate();
        }
    }
}
