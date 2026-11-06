package flm;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.widget.TextView;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.features.timelimit.LockScreenAccountInterceptorFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bya implements LoaderManager.LoaderCallbacks {
    private final /* synthetic */ LockScreenAccountInterceptorFragment a;

    public bya(LockScreenAccountInterceptorFragment lockScreenAccountInterceptorFragment) {
        this.a = lockScreenAccountInterceptorFragment;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new byb(this.a.getActivity());
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        dvi dviVar = (dvi) obj;
        if (dviVar.a()) {
            String str = (String) dviVar.b();
            String string = this.a.getString(R.string.kids_time_limit_account_interceptor_desc, new Object[]{str});
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int iIndexOf = string.indexOf(str);
            spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf, str.length() + iIndexOf, 17);
            ((TextView) this.a.getView().findViewById(R.id.kids_time_limit_account_interceptor_desc_txt)).setText(spannableStringBuilder);
        }
    }
}
