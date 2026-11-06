package com.google.android.gms.kids.internal;

import android.database.CursorWindow;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import flm.akk;
import flm.akl;
import flm.akm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface IKidsService extends IInterface {

    /* JADX INFO: compiled from: PG */
    public abstract class Stub extends akl implements IKidsService {
        public static final int TRANSACTION_getAppliedTimeLimit = 3001;
        public static final int TRANSACTION_getAppliedTimeLimitAsync = 3002;

        public Stub() {
            super("com.google.android.gms.kids.internal.IKidsService");
        }

        /* JADX INFO: compiled from: PG */
        public class Proxy extends akk implements IKidsService {
            Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.kids.internal.IKidsService");
            }

            @Override // com.google.android.gms.kids.internal.IKidsService
            public CursorWindow getAppliedTimeLimit() {
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_getAppliedTimeLimit, obtainAndWriteInterfaceToken());
                CursorWindow cursorWindow = (CursorWindow) akm.a(parcelTransactAndReadException, CursorWindow.CREATOR);
                parcelTransactAndReadException.recycle();
                return cursorWindow;
            }

            @Override // com.google.android.gms.kids.internal.IKidsService
            public void getAppliedTimeLimitAsync(IKidsCursorWindowCallback iKidsCursorWindowCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                akm.a(parcelObtainAndWriteInterfaceToken, iKidsCursorWindowCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getAppliedTimeLimitAsync, parcelObtainAndWriteInterfaceToken);
            }
        }

        public static IKidsService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.kids.internal.IKidsService");
            if (iInterfaceQueryLocalInterface instanceof IKidsService) {
                return (IKidsService) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // flm.akl
        public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case TRANSACTION_getAppliedTimeLimit /* 3001 */:
                    CursorWindow appliedTimeLimit = getAppliedTimeLimit();
                    parcel2.writeNoException();
                    akm.b(parcel2, appliedTimeLimit);
                    return true;
                case TRANSACTION_getAppliedTimeLimitAsync /* 3002 */:
                    getAppliedTimeLimitAsync(IKidsCursorWindowCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    @Deprecated
    CursorWindow getAppliedTimeLimit();

    void getAppliedTimeLimitAsync(IKidsCursorWindowCallback iKidsCursorWindowCallback);
}
