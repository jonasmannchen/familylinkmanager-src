package com.google.android.gms.chimera;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.app.BaseApplicationContext;
import flm.anw;
import flm.ayt;
import flm.ayy;
import flm.azd;
import flm.aze;
import flm.azl;
import flm.bep;
import flm.beq;
import flm.bet;
import flm.bhs;
import flm.biw;
import flm.bjj;
import flm.czf;
import flm.der;
import flm.deu;
import flm.dfe;
import flm.drf;
import flm.edd;
import flm.ede;
import flm.edm;
import flm.eio;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class GmsModuleInitializer {
    private static boolean a = false;

    public static void initializeModuleV0(Context context, BaseApplicationContext baseApplicationContext) {
        if (a) {
            return;
        }
        new ayt(context, baseApplicationContext);
        azl.a(context, !(Build.VERSION.SDK_INT >= 24 ? ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked() : true) ? new HashSet(Arrays.asList(aze.a())) : null);
        dfe.a = context.getContentResolver();
        drf.a(context);
        czf.a(context);
        bjj.a(new deu());
        bhs.a(new der());
        if (biw.a()) {
            context.getPackageManager().addOnPermissionsChangeListener(new beq(bep.a));
        }
        try {
            bet.a(baseApplicationContext);
        } catch (Throwable th) {
            Log.w("KidsModuleInitializer", "Failed to initialize Primes", th);
        }
        try {
            if (azd.a.compareAndSet(null, new azd())) {
                try {
                    ede edeVar = new ede();
                    edeVar.a = new eio(new ayy(context), new edm());
                    if (!edd.a.compareAndSet(false, true)) {
                        throw new IllegalStateException("Logger backend configuration may only occur once.");
                    }
                    edd.a(edeVar.a);
                } catch (IllegalStateException e) {
                    Log.w("FloggerConfig", "Attempted to configure logger more than once.");
                } catch (NoSuchMethodError e2) {
                    Log.w("FloggerConfig", "Flogger not available in this version of GMS Core.");
                }
            } else {
                Log.w("FloggerConfig", "Logger already initialized.");
            }
        } catch (Throwable th2) {
            Log.w("KidsModuleInitializer", "Failed to initialize Flogger", th2);
        }
        anw.a(context);
        a = true;
    }
}
