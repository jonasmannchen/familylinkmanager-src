package com.google.android.gms.chimera;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import flm.azl;
import flm.czf;
import flm.dfe;
import flm.drf;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FlmModuleInitializer {
    private static boolean a = false;

    @UsedByReflection
    public static void initNonGmscoreState(Context context) {
        if (a) {
            return;
        }
        azl.a(context, (HashSet) null);
        dfe.a = context.getContentResolver();
        drf.a(context);
        czf.a(context);
        a = true;
    }
}
