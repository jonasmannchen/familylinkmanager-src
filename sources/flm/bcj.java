package flm;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bcj extends akk implements bch {
    bcj(IBinder iBinder) {
        super(iBinder, bci.DESCRIPTOR);
    }

    @Override // flm.bch
    public final blq getBytesWrapped() {
        Parcel parcelTransactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
        blq blqVarA = blr.a(parcelTransactAndReadException.readStrongBinder());
        parcelTransactAndReadException.recycle();
        return blqVarA;
    }

    @Override // flm.bch
    public final int getHashCode() {
        Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
        int i = parcelTransactAndReadException.readInt();
        parcelTransactAndReadException.recycle();
        return i;
    }
}
