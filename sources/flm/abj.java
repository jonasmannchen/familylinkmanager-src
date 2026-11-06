package flm;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class abj extends AutoCompleteTextView {
    private static final int[] a = {R.attr.popupBackground};
    private final abk b;
    private final acn c;

    public abj(Context context) {
        this(context, null);
    }

    public abj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.chimeraresources.R.attr.autoCompleteTextViewStyle);
    }

    public abj(Context context, AttributeSet attributeSet, int i) {
        super(ahb.a(context), attributeSet, i);
        ahe aheVarA = ahe.a(getContext(), attributeSet, a, i, 0);
        if (aheVarA.f(0)) {
            setDropDownBackgroundDrawable(aheVarA.a(0));
        }
        aheVarA.b.recycle();
        this.b = new abk(this);
        this.b.a(attributeSet, i);
        this.c = new acn(this);
        this.c.a(attributeSet, i);
        this.c.a();
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(xn.b(getContext(), i));
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.b != null) {
            this.b.a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.b != null) {
            this.b.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.b != null) {
            this.b.d();
        }
        if (this.c != null) {
            this.c.a();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.c != null) {
            this.c.a(context, i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return abv.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(vc.a(this, callback));
    }
}
