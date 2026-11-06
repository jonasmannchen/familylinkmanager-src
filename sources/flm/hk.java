package flm;

import android.os.Build;
import android.support.design.textfield.TextInputLayout;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hk extends su {
    private final TextInputLayout b;

    public hk(TextInputLayout textInputLayout) {
        this.b = textInputLayout;
    }

    @Override // flm.su
    public final void a(View view, ua uaVar) {
        CharSequence contentDescription = null;
        boolean z = false;
        super.a(view, uaVar);
        EditText editText = this.b.a;
        Editable text = editText != null ? editText.getText() : null;
        CharSequence charSequenceA = this.b.a();
        CharSequence charSequenceC = this.b.c();
        TextInputLayout textInputLayout = this.b;
        if (textInputLayout.b && textInputLayout.c && textInputLayout.d != null) {
            contentDescription = textInputLayout.d.getContentDescription();
        }
        boolean z2 = !TextUtils.isEmpty(text);
        boolean z3 = !TextUtils.isEmpty(charSequenceA);
        boolean z4 = !TextUtils.isEmpty(charSequenceC);
        boolean z5 = z4 || !TextUtils.isEmpty(contentDescription);
        if (z2) {
            uaVar.b(text);
        } else if (z3) {
            uaVar.b(charSequenceA);
        }
        if (z3) {
            if (Build.VERSION.SDK_INT >= 26) {
                uaVar.a.setHintText(charSequenceA);
            } else {
                uaVar.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequenceA);
            }
            if (!z2 && z3) {
                z = true;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                uaVar.a.setShowingHintText(z);
            } else {
                uaVar.a(4, z);
            }
        }
        if (z5) {
            if (z4) {
                contentDescription = charSequenceC;
            }
            uaVar.a.setError(contentDescription);
            uaVar.a.setContentInvalid(true);
        }
    }

    @Override // flm.su
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        EditText editText = this.b.a;
        CharSequence text = editText != null ? editText.getText() : null;
        if (TextUtils.isEmpty(text)) {
            text = this.b.a();
        }
        if (!TextUtils.isEmpty(text)) {
            accessibilityEvent.getText().add(text);
        }
    }
}
