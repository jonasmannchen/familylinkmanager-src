package flm;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.feedback.ErrorReport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bnp extends akk implements bnn {
    bnp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.feedback.internal.IFeedbackService");
    }

    @Override // flm.bnn
    public final boolean a(ErrorReport errorReport) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, errorReport);
        Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
        boolean zA = akm.a(parcelTransactAndReadException);
        parcelTransactAndReadException.recycle();
        return zA;
    }

    @Override // flm.bnn
    public final boolean a(bnc bncVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, bncVar);
        Parcel parcelTransactAndReadException = transactAndReadException(7, parcelObtainAndWriteInterfaceToken);
        boolean zA = akm.a(parcelTransactAndReadException);
        parcelTransactAndReadException.recycle();
        return zA;
    }
}
