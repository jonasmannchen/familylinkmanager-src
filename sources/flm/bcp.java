package flm;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bcp implements bcn {
    public final IBinder mRemote;

    bcp(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.mRemote;
    }

    public final String getInterfaceDescriptor() {
        return bco.DESCRIPTOR;
    }

    @Override // flm.bcn
    public final void getService(bck bckVar, bbn bbnVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(bco.DESCRIPTOR);
            parcelObtain.writeStrongBinder(bckVar != null ? bckVar.asBinder() : null);
            if (bbnVar != null) {
                parcelObtain.writeInt(1);
                bbnVar.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.mRemote.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
