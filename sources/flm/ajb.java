package flm;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.setupwizardlib.TemplateLayout;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ajb implements ajc {
    private final TemplateLayout a;

    public ajb(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        this.a = templateLayout;
        TypedArray typedArrayObtainStyledAttributes = templateLayout.getContext().obtainStyledAttributes(attributeSet, aio.z, i, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(aio.A, 0);
        if (resourceId != 0) {
            a(resourceId);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(Drawable drawable) {
        ImageView imageViewA = a();
        if (imageViewA != null) {
            imageViewA.setImageDrawable(drawable);
            imageViewA.setVisibility(drawable != null ? 0 : 8);
        }
    }

    public final void a(int i) {
        ImageView imageViewA = a();
        if (imageViewA != null) {
            imageViewA.setImageResource(i);
            imageViewA.setVisibility(i != 0 ? 0 : 8);
        }
    }

    private final ImageView a() {
        return (ImageView) this.a.findViewById(R.id.suw_layout_icon);
    }
}
