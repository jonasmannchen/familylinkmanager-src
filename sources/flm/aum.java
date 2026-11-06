package flm;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aum extends aui {
    private final ayi a;
    private final dbk b;
    private final aye c;

    public aum(int i, ayi ayiVar, dbk dbkVar, aye ayeVar) {
        super(i);
        this.b = dbkVar;
        this.a = ayiVar;
        this.c = ayeVar;
    }

    @Override // flm.auh
    public final void a(awv awvVar) throws DeadObjectException {
        try {
            this.a.a(awvVar.b, this.b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            StringBuilder sb = new StringBuilder();
            if (e2 instanceof TransactionTooLargeException) {
                sb.append("TransactionTooLargeException: ");
            }
            sb.append(e2.getLocalizedMessage());
            a(new Status(8, sb.toString()));
        } catch (RuntimeException e3) {
            a(e3);
        }
    }

    @Override // flm.auh
    public final void a(Status status) {
        this.b.b(this.c.a(status));
    }

    @Override // flm.auh
    public final void a(RuntimeException runtimeException) {
        this.b.b(runtimeException);
    }

    @Override // flm.auh
    public final void a(avp avpVar, boolean z) {
        dbk dbkVar = this.b;
        avpVar.b.put(dbkVar, Boolean.valueOf(z));
        dbkVar.a.a((daz) new avr(avpVar, dbkVar));
    }

    @Override // flm.aui
    public final aqb[] b(awv awvVar) {
        return this.a.a();
    }

    @Override // flm.aui
    public final boolean c(awv awvVar) {
        ayi ayiVar = this.a;
        return false;
    }
}
