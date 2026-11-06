package flm;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class auj extends aui {
    public final dbk a;

    public auj(int i, dbk dbkVar) {
        super(i);
        this.a = dbkVar;
    }

    protected abstract void d(awv awvVar);

    @Override // flm.auh
    public void a(Status status) {
        this.a.b(new atj(status));
    }

    @Override // flm.auh
    public void a(RuntimeException runtimeException) {
        this.a.b(runtimeException);
    }

    @Override // flm.auh
    public void a(avp avpVar, boolean z) {
    }

    @Override // flm.auh
    public final void a(awv awvVar) throws DeadObjectException {
        try {
            d(awvVar);
        } catch (DeadObjectException e) {
            StringBuilder sb = new StringBuilder();
            if (e instanceof TransactionTooLargeException) {
                sb.append("TransactionTooLargeException: ");
            }
            sb.append(e.getLocalizedMessage());
            a(new Status(8, sb.toString()));
            throw e;
        } catch (RemoteException e2) {
            StringBuilder sb2 = new StringBuilder();
            if (e2 instanceof TransactionTooLargeException) {
                sb2.append("TransactionTooLargeException: ");
            }
            sb2.append(e2.getLocalizedMessage());
            a(new Status(8, sb2.toString()));
        } catch (RuntimeException e3) {
            a(e3);
        }
    }
}
