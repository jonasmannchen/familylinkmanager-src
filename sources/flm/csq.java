package flm;

import android.content.Context;
import android.util.Log;
import com.google.android.chimera.ModuleContext;
import com.google.android.chimera.config.ModuleManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class csq {
    public final ctb a;
    public final Context b;
    public boolean c = false;
    public final Map d = new HashMap();
    public final Map e = new HashMap();
    public final Map f = new HashMap();

    public csq(Context context, ctb ctbVar) {
        this.b = context;
        this.a = ctbVar;
    }

    public final csr a(axp axpVar) {
        csr csrVar;
        synchronized (this.f) {
            csrVar = (csr) this.f.get(axpVar.b);
            if (csrVar == null) {
                csrVar = new csr(axpVar);
            }
            this.f.put(axpVar.b, csrVar);
        }
        return csrVar;
    }

    public final void a(axr axrVar, csk cskVar) {
        this.a.a();
        bdi.checkNotNull(axrVar, "Invalid null listener key");
        synchronized (this.f) {
            csr csrVar = (csr) this.f.remove(axrVar);
            if (csrVar != null) {
                csrVar.a();
                ((csn) this.a.b()).a(csz.a(csrVar, cskVar));
            }
        }
    }

    public final void a(csx csxVar) {
        ModuleManager.ModuleInfo currentModule;
        if (bav.IS_PACKAGE_SIDE && bif.a()) {
            try {
                if (csxVar.h == null && ModuleContext.getModuleContext(this.b) != null && (currentModule = ModuleManager.get(this.b).getCurrentModule()) != null) {
                    csxVar.h = currentModule.moduleId;
                }
            } catch (IllegalStateException e) {
                Log.e("LocationClientHelper", "exception when setting module id", e);
            }
        }
    }
}
