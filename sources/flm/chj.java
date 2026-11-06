package flm;

import android.database.CursorWindow;
import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class chj extends cep {
    private final eoi c;
    private final elz d;
    private final long e;
    private final long f;

    public chj(KidSetupViewModel kidSetupViewModel, eoi eoiVar, elz elzVar) {
        super(kidSetupViewModel);
        this.c = eoiVar;
        this.d = elzVar;
        bij bijVar = bij.a;
        this.e = bijVar.a();
        this.f = bijVar.b();
    }

    @Override // flm.cep
    protected final String a() {
        return "UiLoggingTask";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x002e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:22:0x0030 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    @Override // flm.cep
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Void b() throws Throwable {
        Throwable th;
        CursorWindow cursorWindowA = btc.a(this.d);
        try {
            this.b.b().logToClearcutFromUi(this.c.ah, cursorWindowA, this.b.d().e, this.e, this.f);
            if (cursorWindowA != null) {
                cursorWindowA.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            th = null;
            if (cursorWindowA != null) {
                throw th;
            }
            if (th == null) {
                cursorWindowA.close();
                throw th;
            }
            cursorWindowA.close();
            throw th;
        }
    }
}
