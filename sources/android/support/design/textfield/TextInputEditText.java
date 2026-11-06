package android.support.design.textfield;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.chimeraresources.R;
import flm.abu;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class TextInputEditText extends abu {
    public TextInputEditText(Context context) {
        this(context, null);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutA = a();
        return (textInputLayoutA == null || !textInputLayoutA.e) ? super.getHint() : textInputLayoutA.a();
    }

    @Override // flm.abu, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            TextInputLayout textInputLayoutA = a();
            editorInfo.hintText = textInputLayoutA != null ? textInputLayoutA.a() : null;
        }
        return inputConnectionOnCreateInputConnection;
    }

    private final TextInputLayout a() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }
}
