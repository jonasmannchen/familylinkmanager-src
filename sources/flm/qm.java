package flm;

import android.content.res.Configuration;
import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qm {
    public static qn a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? qn.a(configuration.getLocales()) : qn.a(configuration.locale);
    }
}
