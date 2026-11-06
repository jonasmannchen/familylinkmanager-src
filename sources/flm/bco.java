package flm;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.kids.aidl.IKidsInternalService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bco extends Binder implements bcn {
    public static final String DESCRIPTOR = "com.google.android.gms.common.internal.IGmsServiceBroker";
    public static final int TRANSACTION_GET_ACCOUNT_DATA_SERVICE = 17;
    public static final int TRANSACTION_GET_ADDRESS_SERVICE = 24;
    public static final int TRANSACTION_GET_ADMOB_SERVICE = 12;
    public static final int TRANSACTION_GET_APP_DATA_SEARCH_SERVICE = 3;
    public static final int TRANSACTION_GET_APP_STATE_SERVICE = 10;
    public static final int TRANSACTION_GET_AUTH_SERVICE_DEPRECATED = 28;
    public static final int TRANSACTION_GET_AUTO_BACKUP_SERVICE = 23;
    public static final int TRANSACTION_GET_CAR_SERVICE = 25;
    public static final int TRANSACTION_GET_CAST_MIRRORING_SERVICE = 15;
    public static final int TRANSACTION_GET_CAST_SERVICE = 19;
    public static final int TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE = 41;
    public static final int TRANSACTION_GET_CLOUD_SAVE_SERVICE = 33;
    public static final int TRANSACTION_GET_COMMON_SERVICE = 40;
    public static final int TRANSACTION_GET_DEVICE_CONNECTION_SERVICE = 44;
    public static final int TRANSACTION_GET_DEVICE_MANAGER_SERVICE = 36;
    public static final int TRANSACTION_GET_DRIVE_SERVICE = 20;
    public static final int TRANSACTION_GET_DROID_GUARD_SERVICE = 13;
    public static final int TRANSACTION_GET_FEEDBACK_SERVICE = 18;
    public static final int TRANSACTION_GET_FITNESS_SERVICE = 30;
    public static final int TRANSACTION_GET_GAMES_SERVICE = 9;
    public static final int TRANSACTION_GET_GLOBAL_SEARCH_ADMIN_SERVICE = 32;
    public static final int TRANSACTION_GET_GOOGLE_LOCATION_MANAGER_SERVICE = 8;
    public static final int TRANSACTION_GET_IDENTITY_SERVICE = 27;
    public static final int TRANSACTION_GET_KIDS_SERVICE = 45;
    public static final int TRANSACTION_GET_LIGHTWEIGHT_APP_DATA_SEARCH_SERVICE = 21;
    public static final int TRANSACTION_GET_LOCATION_SERVICE = 7;
    public static final int TRANSACTION_GET_LOCKBOX_SERVICE = 14;
    public static final int TRANSACTION_GET_NETWORK_QUALITY_SERVICE = 16;
    public static final int TRANSACTION_GET_PANORAMA_SERVICE = 2;
    public static final int TRANSACTION_GET_PEOPLE_SERVICE = 5;
    public static final int TRANSACTION_GET_PLAY_LOG_SERVICE = 11;
    public static final int TRANSACTION_GET_PLUS_SERVICE = 1;
    public static final int TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE = 37;
    public static final int TRANSACTION_GET_REMINDERS_SERVICE = 38;
    public static final int TRANSACTION_GET_REPORTING_SERVICE = 6;
    public static final int TRANSACTION_GET_SEARCH_ADMINISTRATION_SERVICE = 22;
    public static final int TRANSACTION_GET_SEARCH_CORPORA_SERVICE = 35;
    public static final int TRANSACTION_GET_SEARCH_QUERIES_SERVICE = 31;
    public static final int TRANSACTION_GET_SERVICE = 46;
    public static final int TRANSACTION_GET_UDC_SERVICE = 34;
    public static final int TRANSACTION_GET_USAGE_REPORTING_SERVICE = 43;
    public static final int TRANSACTION_GET_WALLET_SERVICE = 4;
    public static final int TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE = 42;
    public static final int TRANSACTION_GET_WEARABLE_SERVICE = 26;
    public static final int TRANSACTION_VALIDATE_ACCOUNT = 47;

    public bco() {
        attachInterface(this, DESCRIPTOR);
    }

    public void getLegacyService(int i, bck bckVar, int i2, String str, String str2, String[] strArr, Bundle bundle, IBinder iBinder, String str3, String str4) {
        throw new UnsupportedOperationException();
    }

    protected void validateAccount(bck bckVar, bdt bdtVar) {
        throw new UnsupportedOperationException();
    }

    public static bcn asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof bcn)) {
            return (bcn) iInterfaceQueryLocalInterface;
        }
        return new bcp(iBinder);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String string;
        String string2;
        IBinder strongBinder;
        Bundle bundle;
        String[] strArrCreateStringArray;
        String string3;
        if (i > 16777215) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface(DESCRIPTOR);
        bck bckVarAsInterface = bcl.asInterface(parcel.readStrongBinder());
        if (i == 46) {
            getService(bckVarAsInterface, parcel.readInt() != 0 ? (bbn) bbn.CREATOR.createFromParcel(parcel) : null);
        } else if (i == 47) {
            validateAccount(bckVarAsInterface, parcel.readInt() != 0 ? (bdt) bdt.CREATOR.createFromParcel(parcel) : null);
        } else {
            int i3 = parcel.readInt();
            String string4 = i != 4 ? parcel.readString() : null;
            switch (i) {
                case 1:
                    string2 = parcel.readString();
                    strArrCreateStringArray = parcel.createStringArray();
                    string3 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        string = null;
                        strongBinder = null;
                        bundle = null;
                    } else {
                        string = null;
                        strongBinder = null;
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    break;
                case 2:
                case 5:
                case 6:
                case 7:
                case 8:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 23:
                case 25:
                case 27:
                case 37:
                case 38:
                case 41:
                case 43:
                    if (parcel.readInt() != 0) {
                        string = null;
                        string2 = null;
                        strongBinder = null;
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        strArrCreateStringArray = null;
                        string3 = null;
                        break;
                    }
                case 3:
                case 4:
                case 21:
                case 22:
                case 24:
                case 26:
                case 28:
                case IKidsInternalService.Stub.TRANSACTION_verifyParentAccessCode /* 29 */:
                case 31:
                case 32:
                case 33:
                case 35:
                case 36:
                case IKidsInternalService.Stub.TRANSACTION_startService /* 39 */:
                case 40:
                case 42:
                default:
                    string = null;
                    string2 = null;
                    strongBinder = null;
                    bundle = null;
                    strArrCreateStringArray = null;
                    string3 = null;
                    break;
                case 9:
                    string3 = parcel.readString();
                    strArrCreateStringArray = parcel.createStringArray();
                    string2 = parcel.readString();
                    strongBinder = parcel.readStrongBinder();
                    string = parcel.readString();
                    bundle = parcel.readInt() == 0 ? null : (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    break;
                case 10:
                    string3 = parcel.readString();
                    strArrCreateStringArray = parcel.createStringArray();
                    string = null;
                    string2 = null;
                    strongBinder = null;
                    bundle = null;
                    break;
                case 19:
                    strongBinder = parcel.readStrongBinder();
                    if (parcel.readInt() == 0) {
                        string = null;
                        string2 = null;
                        bundle = null;
                        strArrCreateStringArray = null;
                        string3 = null;
                    } else {
                        string = null;
                        string2 = null;
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        strArrCreateStringArray = null;
                        string3 = null;
                    }
                    break;
                case 20:
                case 30:
                    strArrCreateStringArray = parcel.createStringArray();
                    string3 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        string = null;
                        string2 = null;
                        strongBinder = null;
                        bundle = null;
                    } else {
                        string = null;
                        string2 = null;
                        strongBinder = null;
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    break;
                case 34:
                    string3 = parcel.readString();
                    string = null;
                    string2 = null;
                    strongBinder = null;
                    bundle = null;
                    strArrCreateStringArray = null;
                    break;
            }
            getLegacyService(i, bckVarAsInterface, i3, string4, string3, strArrCreateStringArray, bundle, strongBinder, string2, string);
        }
        parcel2.writeNoException();
        return true;
    }
}
