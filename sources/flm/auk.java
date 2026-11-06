package flm;

import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class auk extends auh {
    private final auv a;

    public auk(int i, auv auvVar) {
        super(i);
        this.a = auvVar;
    }

    @Override // flm.auh
    public final void a(awv awvVar) throws DeadObjectException {
        try {
            this.a.run(awvVar.b);
        } catch (RuntimeException e) {
            a(e);
        }
    }

    @Override // flm.auh
    public final void a(Status status) {
        this.a.setFailedResult(status);
    }

    @Override // flm.auh
    public final void a(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        this.a.setFailedResult(new Status(10, new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length()).append(simpleName).append(": ").append(localizedMessage).toString()));
    }

    @Override // flm.auh
    public final void a(avp avpVar, boolean z) {
        auv auvVar = this.a;
        avpVar.a.put(auvVar, Boolean.valueOf(z));
        auvVar.addStatusListener(new avq(avpVar, auvVar));
    }
}
