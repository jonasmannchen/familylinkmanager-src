package flm;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class auv extends BasePendingResult implements auw {
    public final asw mApi;
    public final asz mClientKey;

    @Deprecated
    protected auv(asz aszVar, atp atpVar) {
        super((atp) bdi.checkNotNull(atpVar, "GoogleApiClient must not be null"));
        this.mClientKey = (asz) bdi.checkNotNull(aszVar);
        this.mApi = null;
    }

    public abstract void doExecute(asy asyVar);

    public auv(asw aswVar, atp atpVar) {
        super((atp) bdi.checkNotNull(atpVar, "GoogleApiClient must not be null"));
        bdi.checkNotNull(aswVar, "Api must not be null");
        this.mClientKey = aswVar.c();
        this.mApi = aswVar;
    }

    protected auv(avc avcVar) {
        super(avcVar);
        this.mClientKey = null;
        this.mApi = null;
    }

    public final asz getClientKey() {
        return this.mClientKey;
    }

    public final asw getApi() {
        return this.mApi;
    }

    public final void run(asy asyVar) throws DeadObjectException {
        if (asyVar instanceof bdr) {
            asyVar = ((bdr) asyVar).getClient();
        }
        try {
            doExecute(asyVar);
        } catch (DeadObjectException e) {
            setFailedResult(e);
            throw e;
        } catch (RemoteException e2) {
            setFailedResult(e2);
        }
    }

    public final void setFailedResult(Status status) {
        bdi.checkArgument(!status.a(), "Failed result must not be success");
        aty atyVarCreateFailedResult = createFailedResult(status);
        setResult(atyVarCreateFailedResult);
        onSetFailedResult(atyVarCreateFailedResult);
    }

    protected void onSetFailedResult(aty atyVar) {
    }

    private void setFailedResult(RemoteException remoteException) {
        setFailedResult(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    public /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((aty) obj);
    }
}
