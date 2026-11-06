package flm;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.ViewStub;
import android.widget.ProgressBar;
import com.android.setupwizardlib.TemplateLayout;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class aje implements ajc {
    private final TemplateLayout a;
    private ColorStateList b;

    public aje(TemplateLayout templateLayout) {
        this.a = templateLayout;
    }

    public final boolean a() {
        View viewFindViewById = this.a.findViewById(R.id.suw_layout_progress);
        return viewFindViewById != null && viewFindViewById.getVisibility() == 0;
    }

    public final void a(boolean z) {
        if (z) {
            if (b() == null) {
                ViewStub viewStub = (ViewStub) this.a.findViewById(R.id.suw_layout_progress_stub);
                if (viewStub != null) {
                    viewStub.inflate();
                }
                a(this.b);
            }
            ProgressBar progressBarB = b();
            if (progressBarB != null) {
                progressBarB.setVisibility(0);
                return;
            }
            return;
        }
        ProgressBar progressBarB2 = b();
        if (progressBarB2 != null) {
            progressBarB2.setVisibility(8);
        }
    }

    private final ProgressBar b() {
        return (ProgressBar) this.a.findViewById(R.id.suw_layout_progress);
    }

    public final void a(ColorStateList colorStateList) {
        this.b = colorStateList;
        ProgressBar progressBarB = b();
        if (progressBarB != null) {
            progressBarB.setIndeterminateTintList(colorStateList);
            if (Build.VERSION.SDK_INT >= 23 || colorStateList != null) {
                progressBarB.setProgressBackgroundTintList(colorStateList);
            }
        }
    }
}
