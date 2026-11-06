package flm;

import android.content.Context;
import android.content.ContextWrapper;
import com.google.android.chimera.ModuleContext;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.kids.database.SupervisionDatabase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bty {
    public static void a(Context context) {
        ModuleContext moduleContext;
        if (bus.a(context) >= 8600000) {
            if (bus.a(context) >= 9800000) {
                moduleContext = ModuleContext.getModuleContext(context);
            } else {
                for (Context baseContext = context; baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
                    if (baseContext instanceof ModuleContext) {
                        moduleContext = (ModuleContext) baseContext;
                    }
                }
                moduleContext = null;
            }
            dvl.a(moduleContext);
            ModuleManager.ModuleInfo currentModule = ModuleManager.get(context).getCurrentModule();
            bvs bvsVar = new bvs();
            bvsVar.b = currentModule.moduleApk.apkPackageName;
            bvsVar.c = currentModule.moduleApk.apkVersionCode;
            bvsVar.d = currentModule.moduleVersion;
            SupervisionDatabase.h().n().a(bvsVar);
        }
    }
}
