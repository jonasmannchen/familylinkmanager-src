package com.google.android.gms.kids.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import flm.akk;
import flm.akl;
import flm.akm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface IKidsCallback extends IInterface {

    /* JADX INFO: compiled from: PG */
    public abstract class Stub extends akl implements IKidsCallback {
        public static final int TRANSACTION_onStatus = 1;

        public Stub() {
            super("com.google.android.gms.kids.internal.IKidsCallback");
        }

        /* JADX INFO: compiled from: PG */
        public class Proxy extends akk implements IKidsCallback {
            Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.kids.internal.IKidsCallback");
            }

            @Override // com.google.android.gms.kids.internal.IKidsCallback
            public void onStatus(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                akm.a(parcelObtainAndWriteInterfaceToken, status);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public static IKidsCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.kids.internal.IKidsCallback");
            if (iInterfaceQueryLocalInterface instanceof IKidsCallback) {
                return (IKidsCallback) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // flm.akl
        public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            onStatus((Status) akm.a(parcel, Status.CREATOR));
            return true;
        }
    }

    void onStatus(Status status);
}
