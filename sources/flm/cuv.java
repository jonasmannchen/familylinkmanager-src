package flm;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;
import org.chromium.net.ApiVersion;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class cuv {
    private static final String a = cuv.class.getSimpleName();
    private static final aqf b = aqf.d;
    private static final Object c = new Object();
    private static DynamiteModule d = null;
    private static String e = "0";

    @Deprecated
    public static void a(Context context) {
        synchronized (c) {
            if (a()) {
                return;
            }
            bdi.checkNotNull(context, "Context must not be null");
            try {
                cuv.class.getClassLoader().loadClass("org.chromium.net.CronetEngine");
                int apiLevel = ApiVersion.getApiLevel();
                aqf.b(context, 11925000);
                try {
                    DynamiteModule dynamiteModuleA = DynamiteModule.a(context, DynamiteModule.a, "com.google.android.gms.cronet_dynamite");
                    try {
                        Class<?> clsLoadClass = dynamiteModuleA.c.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                        if (clsLoadClass.getClassLoader() == cuv.class.getClassLoader()) {
                            Log.e(a, "ImplVersion class is missing from Cronet module.");
                            throw new aqu(8);
                        }
                        Method method = clsLoadClass.getMethod("getApiLevel", new Class[0]);
                        Method method2 = clsLoadClass.getMethod("getCronetVersion", new Class[0]);
                        int iIntValue = ((Integer) method.invoke(null, new Object[0])).intValue();
                        e = (String) method2.invoke(null, new Object[0]);
                        if (apiLevel <= iIntValue) {
                            d = dynamiteModuleA;
                        } else {
                            Intent intentA = b.a(context, 2, "cr");
                            String str = e;
                            throw new aqv(2, new StringBuilder(String.valueOf(str).length() + 174).append("Google Play Services update is required. The API Level of the client is ").append(apiLevel).append(". The API Level of the implementation is ").append(iIntValue).append(". The Cronet implementation version is ").append(str).toString(), intentA);
                        }
                    } catch (Exception e2) {
                        Log.e(a, "Unable to read Cronet version from the Cronet module ", e2);
                        throw ((aqu) new aqu(8).initCause(e2));
                    }
                } catch (bmg e3) {
                    Log.e(a, "Unable to load Cronet module", e3);
                    throw ((aqu) new aqu(8).initCause(e3));
                }
            } catch (ClassNotFoundException e4) {
                Log.e(a, "Cronet API is not available. Have you included all required dependencies?");
                throw ((aqu) new aqu(10).initCause(e4));
            }
        }
    }

    public static boolean a() {
        return b() != null;
    }

    public static DynamiteModule b() {
        DynamiteModule dynamiteModule;
        synchronized (c) {
            dynamiteModule = d;
        }
        return dynamiteModule;
    }

    public static String c() {
        String str;
        synchronized (c) {
            str = e;
        }
        return str;
    }

    private cuv() {
    }
}
