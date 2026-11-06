package com.android.setupwizardlib.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;
import flm.acp;
import flm.aiu;
import flm.aiw;
import flm.aix;
import flm.aji;
import flm.ajp;
import flm.ajq;
import flm.ti;
import flm.ur;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class RichTextView extends acp implements aiw {
    private aji b;

    public RichTextView(Context context) {
        super(context);
        a();
    }

    public RichTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    private final void a() {
        this.b = new aji(this);
        ti.a(this, this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.android.setupwizardlib.view.RichTextView, flm.acp] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.text.Spannable, android.text.SpannableString] */
    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        ?? spannableString;
        Context context = getContext();
        if (charSequence instanceof Spanned) {
            spannableString = new SpannableString(charSequence);
            for (Annotation annotation : (Annotation[]) spannableString.getSpans(0, spannableString.length(), Annotation.class)) {
                String key = annotation.getKey();
                if ("textAppearance".equals(key)) {
                    int identifier = context.getResources().getIdentifier(annotation.getValue(), "style", context.getPackageName());
                    if (identifier == 0) {
                        Log.w("RichTextView", new StringBuilder(33).append("Cannot find resource: ").append(identifier).toString());
                    }
                    aix.a(spannableString, annotation, new TextAppearanceSpan(context, identifier));
                } else if ("link".equals(key)) {
                    aix.a(spannableString, annotation, new aiu(annotation.getValue()));
                }
            }
        } else {
            spannableString = charSequence;
        }
        super.setText(spannableString, bufferType);
        boolean z = (spannableString instanceof Spanned) && ((ClickableSpan[]) ((Spanned) spannableString).getSpans(0, spannableString.length(), ClickableSpan.class)).length > 0;
        if (z) {
            setMovementMethod(new ajq());
        } else {
            setMovementMethod(null);
        }
        setFocusable(z);
        if (Build.VERSION.SDK_INT >= 25) {
            setRevealOnFocusHint(false);
            setFocusableInTouchMode(z);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        MovementMethod movementMethod = getMovementMethod();
        if (movementMethod instanceof ajp) {
            ajp ajpVar = (ajp) movementMethod;
            if (ajpVar.a() == motionEvent) {
                return ajpVar.b();
            }
        }
        return zOnTouchEvent;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.b != null) {
            aji ajiVar = this.b;
            if (ajiVar.b instanceof ur) {
                ur urVar = (ur) ajiVar.b;
                if (urVar.b.isEnabled() && urVar.b.isTouchExplorationEnabled()) {
                    switch (motionEvent.getAction()) {
                        case 7:
                        case 9:
                            int iA = urVar.a(motionEvent.getX(), motionEvent.getY());
                            urVar.a(iA);
                            z2 = iA != Integer.MIN_VALUE;
                            break;
                        case 8:
                        default:
                            z2 = false;
                            break;
                        case 10:
                            if (urVar.f == Integer.MIN_VALUE) {
                                z2 = false;
                            } else {
                                urVar.a(Integer.MIN_VALUE);
                                z2 = true;
                            }
                            break;
                    }
                } else {
                    z2 = false;
                }
                if (z2) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.acp, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        for (Drawable drawable : getCompoundDrawablesRelative()) {
            if (drawable != null && drawable.setState(drawableState)) {
                invalidateDrawable(drawable);
            }
        }
    }

    @Override // flm.aiw
    public final boolean a(aiu aiuVar) {
        return false;
    }
}
