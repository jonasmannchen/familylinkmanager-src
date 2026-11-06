package flm;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bas extends baj {
    public final IBinder service;
    public final /* synthetic */ bai this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bas(bai baiVar, int i, IBinder iBinder, Bundle bundle) {
        super(baiVar, i, bundle);
        this.this$0 = baiVar;
        this.service = iBinder;
    }

    @Override // flm.baj
    protected final void handleServiceFailure(apx apxVar) {
        if (this.this$0.mConnectionFailedListener != null) {
            this.this$0.mConnectionFailedListener.onConnectionFailed(apxVar);
        }
        this.this$0.onConnectionFailed(apxVar);
    }

    @Override // flm.baj
    protected final boolean handleServiceSuccess() {
        try {
            String interfaceDescriptor = this.service.getInterfaceDescriptor();
            if (!this.this$0.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = this.this$0.getServiceDescriptor();
                Log.e(bai.TAG, new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length()).append("service descriptor mismatch: ").append(serviceDescriptor).append(" vs. ").append(interfaceDescriptor).toString());
                return false;
            }
            IInterface iInterfaceCreateServiceInterface = this.this$0.createServiceInterface(this.service);
            if (iInterfaceCreateServiceInterface == null) {
                return false;
            }
            if (!this.this$0.compareAndSetConnectState(2, 4, iInterfaceCreateServiceInterface) && !this.this$0.compareAndSetConnectState(3, 4, iInterfaceCreateServiceInterface)) {
                return false;
            }
            this.this$0.mRemoteServiceFailedResult = null;
            Bundle connectionHint = this.this$0.getConnectionHint();
            if (this.this$0.mConnectionCallbacks != null) {
                this.this$0.mConnectionCallbacks.onConnected(connectionHint);
            }
            return true;
        } catch (RemoteException e) {
            Log.w(bai.TAG, "service probably died");
            return false;
        }
    }
}
