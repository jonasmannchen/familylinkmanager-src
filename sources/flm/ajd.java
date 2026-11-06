package flm;

import android.view.View;
import com.android.setupwizardlib.TemplateLayout;
import com.android.setupwizardlib.view.NavigationBar;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ajd implements ajc {
    private final TemplateLayout a;

    public ajd(TemplateLayout templateLayout) {
        this.a = templateLayout;
    }

    public final NavigationBar a() {
        View viewFindViewById = this.a.findViewById(R.id.suw_layout_navigation_bar);
        if (viewFindViewById instanceof NavigationBar) {
            return (NavigationBar) viewFindViewById;
        }
        return null;
    }
}
