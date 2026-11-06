package flm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class brb implements bqn {
    public static final Status a = new Status(13);

    @Override // flm.bqn
    public final att a(atp atpVar, Activity activity, Intent intent) {
        return atpVar.a(new brc(this, atpVar, intent, null, new WeakReference(activity)));
    }

    static String a(Activity activity) {
        ViewGroup viewGroup;
        String string = activity.getTitle().toString();
        int identifier = activity.getResources().getIdentifier("action_bar", bbz.MARKET_URI_PARAM_ID, activity.getPackageName());
        if (identifier != 0 && (viewGroup = (ViewGroup) activity.findViewById(identifier)) != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= viewGroup.getChildCount()) {
                    return string;
                }
                View childAt = viewGroup.getChildAt(i2);
                if (childAt instanceof TextView) {
                    return ((TextView) childAt).getText().toString();
                }
                i = i2 + 1;
            }
        }
        return string;
    }

    @Override // flm.bqn
    public final att a(atp atpVar, GoogleHelp googleHelp, Bundle bundle, long j) {
        return atpVar.a(new brj(atpVar, bundle, j, googleHelp));
    }

    @Override // flm.bqn
    public final att b(atp atpVar, GoogleHelp googleHelp, Bundle bundle, long j) {
        return atpVar.a(new bre(atpVar, bundle, j, googleHelp));
    }

    @Override // flm.bqn
    public final att a(atp atpVar, GoogleHelp googleHelp, bnc bncVar, Bundle bundle, long j) {
        return atpVar.a(new brg(atpVar, bncVar, bundle, j, googleHelp));
    }
}
