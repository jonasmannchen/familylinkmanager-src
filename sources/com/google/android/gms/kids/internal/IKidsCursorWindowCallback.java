package com.google.android.gms.kids.internal;

import android.database.CursorWindow;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import flm.akk;
import flm.akl;
import flm.akm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface IKidsCursorWindowCallback extends IInterface {

    /* JADX INFO: compiled from: PG */
    public abstract class Stub extends akl implements IKidsCursorWindowCallback {
        public static final int TRANSACTION_onStatusCursorWindow = 1;

        public Stub() {
            super("com.google.android.gms.kids.internal.IKidsCursorWindowCallback");
        }

        /* JADX INFO: compiled from: PG */
        public class Proxy extends akk implements IKidsCursorWindowCallback {
            Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.kids.internal.IKidsCursorWindowCallback");
            }

            @Override // com.google.android.gms.kids.internal.IKidsCursorWindowCallback
            public void onStatusCursorWindow(Status status, CursorWindow cursorWindow) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                akm.a(parcelObtainAndWriteInterfaceToken, status);
                akm.a(parcelObtainAndWriteInterfaceToken, cursorWindow);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public static IKidsCursorWindowCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.kids.internal.IKidsCursorWindowCallback");
            if (iInterfaceQueryLocalInterface instanceof IKidsCursorWindowCallback) {
                return (IKidsCursorWindowCallback) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // flm.akl
        public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            onStatusCursorWindow((Status) akm.a(parcel, Status.CREATOR), (CursorWindow) akm.a(parcel, CursorWindow.CREATOR));
            return true;
        }
    }

    void onStatusCursorWindow(Status status, CursorWindow cursorWindow);
}
