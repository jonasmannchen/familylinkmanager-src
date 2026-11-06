package com.google.android.gms.kids.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.libraries.material.baselinetextview.BaselineTextView;
import flm.cec;
import flm.cqj;
import flm.cqk;
import flm.cql;
import flm.cqm;
import flm.dvj;
import flm.dvl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class TextViewWithActionLink extends BaselineTextView {
    private CharSequence a;
    private String b;
    private String c;
    private String d;
    private boolean e;

    public TextViewWithActionLink(Context context) {
        super(context);
        a(context, (AttributeSet) null);
    }

    public TextViewWithActionLink(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public TextViewWithActionLink(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        this.a = getText();
        setMovementMethod(new cqj(this, context));
        a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cec.o);
        for (int i = 0; i < typedArrayObtainStyledAttributes.getIndexCount(); i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == cec.r) {
                this.b = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == cec.s) {
                this.c = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == cec.p) {
                this.d = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == cec.q) {
                this.e = typedArrayObtainStyledAttributes.getBoolean(index, false);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        setText(this.a);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        Object uRLSpan;
        this.a = charSequence;
        dvl.b(TextUtils.isEmpty(this.b) == TextUtils.isEmpty(this.c), "Action link text and URL must both be either set or unset");
        if (!TextUtils.isEmpty(this.b) && !TextUtils.isEmpty(this.c)) {
            if (charSequence == null) {
                charSequence = "";
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            if (!TextUtils.isEmpty(charSequence)) {
                spannableStringBuilder.append(this.e ? '\n' : ' ');
            }
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) this.b);
            int length2 = spannableStringBuilder.length();
            if (!TextUtils.isEmpty(this.d)) {
                Context context = getContext();
                String str = this.d;
                String str2 = this.c;
                dvl.a(TextUtils.isEmpty(str) ? false : true);
                uRLSpan = new cqk(this, new Intent("com.google.android.gms.kids.action.LAUNCH_GOOGLE_HELP").setPackage(context.getPackageName()).putExtra("help_topic", str).putExtra("fallback_url", dvj.b(str2)));
            } else {
                uRLSpan = new URLSpan(this.c);
            }
            spannableStringBuilder.setSpan(uRLSpan, length, length2, 0);
            for (ClickableSpan clickableSpan : (ClickableSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class)) {
                spannableStringBuilder.setSpan(new cql(), spannableStringBuilder.getSpanStart(clickableSpan), spannableStringBuilder.getSpanEnd(clickableSpan), 0);
            }
            charSequence = spannableStringBuilder;
        }
        super.setText(charSequence, bufferType);
    }

    public final void a(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = null;
        setText(this.a);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        cqm cqmVar = new cqm(super.onSaveInstanceState());
        cqmVar.a = this.a;
        cqmVar.b = this.b;
        cqmVar.c = this.c;
        cqmVar.d = this.e;
        return cqmVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
        if (!(parcelable instanceof cqm)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        cqm cqmVar = (cqm) parcelable;
        super.onRestoreInstanceState(cqmVar.getSuperState());
        a();
        this.b = cqmVar.b;
        this.c = cqmVar.c;
        this.e = cqmVar.d;
        setText(cqmVar.a);
    }

    private final void a() {
        setClickable(false);
        setLongClickable(false);
    }
}
