package flm;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.setupwizardlib.TemplateLayout;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class aja implements ajc {
    private final TemplateLayout a;

    public aja(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        this.a = templateLayout;
        TypedArray typedArrayObtainStyledAttributes = templateLayout.getContext().obtainStyledAttributes(attributeSet, aio.v, i, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(aio.w);
        if (text != null) {
            a(text);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final TextView a() {
        return (TextView) this.a.findViewById(R.id.suw_layout_title);
    }

    public final void a(int i) {
        TextView textViewA = a();
        if (textViewA != null) {
            textViewA.setText(i);
        }
    }

    public final void a(CharSequence charSequence) {
        TextView textViewA = a();
        if (textViewA != null) {
            textViewA.setText(charSequence);
        }
    }
}
