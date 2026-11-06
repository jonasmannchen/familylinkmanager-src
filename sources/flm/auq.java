package flm;

import android.util.Log;
import android.util.SparseArray;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class auq extends aux {
    public final SparseArray a;

    public auq(axm axmVar) {
        super(axmVar);
        this.a = new SparseArray();
        this.f.a("AutoManageHelper", this);
    }

    @Override // flm.aux, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void a() {
        super.a();
        boolean z = this.b;
        String strValueOf = String.valueOf(this.a);
        new StringBuilder(String.valueOf(strValueOf).length() + 14).append("onStart ").append(z).append(" ").append(strValueOf);
        if (this.c.get() == null) {
            for (int i = 0; i < this.a.size(); i++) {
                aur aurVarA = a(i);
                if (aurVarA != null) {
                    aurVarA.b.b();
                }
            }
        }
    }

    @Override // flm.aux, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void b() {
        super.b();
        for (int i = 0; i < this.a.size(); i++) {
            aur aurVarA = a(i);
            if (aurVarA != null) {
                aurVarA.b.d();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.a.size(); i++) {
            aur aurVarA = a(i);
            if (aurVarA != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(aurVarA.a);
                printWriter.println(":");
                aurVarA.b.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // flm.aux
    protected final void a(apx apxVar, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        aur aurVar = (aur) this.a.get(i);
        if (aurVar != null) {
            aur aurVar2 = (aur) this.a.get(i);
            this.a.remove(i);
            if (aurVar2 != null) {
                aurVar2.b.b(aurVar2);
                aurVar2.b.d();
            }
            ats atsVar = aurVar.c;
            if (atsVar != null) {
                atsVar.a(apxVar);
            }
        }
    }

    @Override // flm.aux
    protected final void c() {
        for (int i = 0; i < this.a.size(); i++) {
            aur aurVarA = a(i);
            if (aurVarA != null) {
                aurVarA.b.b();
            }
        }
    }

    private final aur a(int i) {
        if (this.a.size() <= i) {
            return null;
        }
        return (aur) this.a.get(this.a.keyAt(i));
    }
}
