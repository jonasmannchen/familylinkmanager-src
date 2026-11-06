package flm;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class abm extends CheckedTextView {
    private static final int[] a = {R.attr.checkMark};
    private final acn b;

    public abm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    private abm(Context context, AttributeSet attributeSet, int i) {
        super(ahb.a(context), attributeSet, R.attr.checkedTextViewStyle);
        this.b = new acn(this);
        this.b.a(attributeSet, R.attr.checkedTextViewStyle);
        this.b.a();
        ahe aheVarA = ahe.a(getContext(), attributeSet, a, R.attr.checkedTextViewStyle, 0);
        setCheckMarkDrawable(aheVarA.a(0));
        aheVarA.b.recycle();
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(xn.b(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.b != null) {
            this.b.a(context, i);
        }
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.b != null) {
            this.b.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return abv.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(vc.a(this, callback));
    }
}
