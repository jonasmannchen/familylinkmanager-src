package flm;

import android.os.Bundle;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bbp extends bcl {
    public final bck callbacks;
    public final bbe connectionInfo;
    public final List postProcessorList;
    public final bbn request;

    public bbp(bck bckVar, bbn bbnVar) {
        this(bckVar, bbnVar, null);
    }

    public bbp(bck bckVar, bbn bbnVar, bbe bbeVar) {
        this.callbacks = bckVar;
        this.request = bbnVar;
        this.postProcessorList = new ArrayList();
        this.connectionInfo = bbeVar == null ? new bbe() : bbeVar;
    }

    public final bbp addPostProcessors(bbl... bblVarArr) {
        addPostProcessors(Arrays.asList(bblVarArr));
        return this;
    }

    public final bbp addPostProcessors(Collection collection) {
        this.postProcessorList.addAll(collection);
        return this;
    }

    public final boolean isProxy() {
        return this.callbacks.asBinder() != this.callbacks;
    }

    @Override // flm.akl, android.os.IInterface
    public final IBinder asBinder() {
        return this.callbacks.asBinder();
    }

    @Override // flm.bck
    public final void onPostInitComplete(int i, IBinder iBinder, Bundle bundle) {
        this.connectionInfo.setResolutionBundle(bundle);
        onPostInitCompleteWithConnectionInfo(i, iBinder, this.connectionInfo);
    }

    @Override // flm.bck
    public final void onPostInitCompleteWithConnectionInfo(int i, IBinder iBinder, bbe bbeVar) {
        bbe bbeVar2 = bbeVar == null ? this.connectionInfo : bbeVar;
        Iterator it = this.postProcessorList.iterator();
        while (it.hasNext()) {
            if (!((bbl) it.next()).process(this.callbacks, this.request, i, iBinder, bbeVar2)) {
                return;
            }
        }
        if (this.request.isRequestingConnectionInfo()) {
            this.callbacks.onPostInitCompleteWithConnectionInfo(i, iBinder, bbeVar2);
        } else {
            this.callbacks.onPostInitComplete(i, iBinder, bbeVar2.getResolutionBundle());
        }
    }

    @Override // flm.bck
    public final void onAccountValidationComplete(int i, Bundle bundle) {
        this.callbacks.onAccountValidationComplete(i, bundle);
    }
}
