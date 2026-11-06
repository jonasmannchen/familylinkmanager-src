package flm;

import android.util.Log;
import android.widget.ScrollView;
import com.android.setupwizardlib.view.BottomScrollView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ajg {
    private final ajf a;

    public ajg(ajf ajfVar, ScrollView scrollView) {
        this.a = ajfVar;
        if (scrollView instanceof BottomScrollView) {
            return;
        }
        String strValueOf = String.valueOf(scrollView);
        Log.w("ScrollViewDelegate", new StringBuilder(String.valueOf(strValueOf).length() + 39).append("Cannot set non-BottomScrollView. Found=").append(strValueOf).toString());
    }
}
