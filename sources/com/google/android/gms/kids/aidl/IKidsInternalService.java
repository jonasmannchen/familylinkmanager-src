package com.google.android.gms.kids.aidl;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.IntentFilter;
import android.database.CursorWindow;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import flm.akk;
import flm.akl;
import flm.akm;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface IKidsInternalService extends IInterface {

    /* JADX INFO: compiled from: PG */
    public abstract class Stub extends akl implements IKidsInternalService {
        public static final int TRANSACTION_acceptInvitation = 44;
        public static final int TRANSACTION_acceptPairing = 41;
        public static final int TRANSACTION_addPersistentPreferredActivity = 15;
        public static final int TRANSACTION_applyAllButHideAppPolicies = 20;
        public static final int TRANSACTION_applyHideAppPolicies = 19;
        public static final int TRANSACTION_batchUpdateApps = 12;
        public static final int TRANSACTION_cancelOnboarding = 43;
        public static final int TRANSACTION_clearLockdownInfo = 51;
        public static final int TRANSACTION_disableBlacklistedApps = 14;
        public static final int TRANSACTION_fetchConsentInfoForSecondaryAccount = 36;
        public static final int TRANSACTION_finishDeviceSetup = 23;
        public static final int TRANSACTION_getAccountId = 4;
        public static final int TRANSACTION_getAppsInfo = 11;
        public static final int TRANSACTION_getLockdownInfo = 55;
        public static final int TRANSACTION_getMemberSvExitState = 48;
        public static final int TRANSACTION_getOnboardingInitiator = 42;
        public static final int TRANSACTION_getStoredSupervisedAccountName = 6;
        public static final int TRANSACTION_getSupervisedAccount = 2;
        public static final int TRANSACTION_getSuwLibraryFlows = 54;
        public static final int TRANSACTION_hasMultipleAccounts = 3;
        public static final int TRANSACTION_initializeDeviceSetup = 9;
        public static final int TRANSACTION_initializeSupervision = 22;
        public static final int TRANSACTION_isAppOnlyDisabledByMinVersion = 21;
        public static final int TRANSACTION_isCoexistenceEnabled = 33;
        public static final int TRANSACTION_isNativeAccountManagementEnabled = 35;
        public static final int TRANSACTION_isSecondaryAccountSignInEnabled = 34;
        public static final int TRANSACTION_isSupervisedAccountNonUnicorn = 5;
        public static final int TRANSACTION_listFamilyMembers = 10;
        public static final int TRANSACTION_listManagedDevices = 52;
        public static final int TRANSACTION_listSupervisableDevices = 40;
        public static final int TRANSACTION_logToClearcutFromUi = 53;
        public static final int TRANSACTION_optInSupervision = 46;
        public static final int TRANSACTION_optOutSupervision = 47;
        public static final int TRANSACTION_reauth = 26;
        public static final int TRANSACTION_reauthWithParentDelegation = 27;
        public static final int TRANSACTION_removeAllAccountsExcept = 45;
        public static final int TRANSACTION_removeSecondaryAccount = 38;
        public static final int TRANSACTION_removeSupervisedAccount = 31;
        public static final int TRANSACTION_reportDeviceInfo = 8;
        public static final int TRANSACTION_revokeSupervision = 32;
        public static final int TRANSACTION_savePartialConsentForSecondaryAccountSignIn = 37;
        public static final int TRANSACTION_scheduleFinishDeviceSetupJob = 25;
        public static final int TRANSACTION_scheduleSafetyNetJob = 24;
        public static final int TRANSACTION_setGoogleServicesActivityEnabled = 13;
        public static final int TRANSACTION_setLockdownInfoForPermalock = 56;
        public static final int TRANSACTION_setMemberSvExitState = 49;
        public static final int TRANSACTION_setPolicyLevel = 7;
        public static final int TRANSACTION_setStatusBarEnabled = 16;
        public static final int TRANSACTION_startService = 39;
        public static final int TRANSACTION_syncPolicies = 18;
        public static final int TRANSACTION_turnOffFamilyLinkSupervision = 17;
        public static final int TRANSACTION_unlockTimeLimit = 28;
        public static final int TRANSACTION_verifyParentAccessCode = 29;
        public static final int TRANSACTION_verifyParentAccessCodeAndUnlockTimeLimit = 30;

        public Stub() {
            super("com.google.android.gms.kids.aidl.IKidsInternalService");
        }

        /* JADX INFO: compiled from: PG */
        public class Proxy extends akk implements IKidsInternalService {
            Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.kids.aidl.IKidsInternalService");
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public Account getSupervisedAccount() {
                Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                Account account = (Account) akm.a(parcelTransactAndReadException, Account.CREATOR);
                parcelTransactAndReadException.recycle();
                return account;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public boolean hasMultipleAccounts() {
                Parcel parcelTransactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                boolean zA = akm.a(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zA;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public String getAccountId(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public boolean isSupervisedAccountNonUnicorn() {
                Parcel parcelTransactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
                boolean zA = akm.a(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zA;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public String getStoredSupervisedAccountName() {
                Parcel parcelTransactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public void setPolicyLevel(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public CursorWindow reportDeviceInfo() {
                Parcel parcelTransactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken());
                CursorWindow cursorWindow = (CursorWindow) akm.a(parcelTransactAndReadException, CursorWindow.CREATOR);
                parcelTransactAndReadException.recycle();
                return cursorWindow;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public CursorWindow initializeDeviceSetup(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(9, parcelObtainAndWriteInterfaceToken);
                CursorWindow cursorWindow = (CursorWindow) akm.a(parcelTransactAndReadException, CursorWindow.CREATOR);
                parcelTransactAndReadException.recycle();
                return cursorWindow;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public CursorWindow listFamilyMembers(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                akm.a(parcelObtainAndWriteInterfaceToken, z);
                Parcel parcelTransactAndReadException = transactAndReadException(10, parcelObtainAndWriteInterfaceToken);
                CursorWindow cursorWindow = (CursorWindow) akm.a(parcelTransactAndReadException, CursorWindow.CREATOR);
                parcelTransactAndReadException.recycle();
                return cursorWindow;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public CursorWindow getAppsInfo(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(11, parcelObtainAndWriteInterfaceToken);
                CursorWindow cursorWindow = (CursorWindow) akm.a(parcelTransactAndReadException, CursorWindow.CREATOR);
                parcelTransactAndReadException.recycle();
                return cursorWindow;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public void batchUpdateApps(String str, Map map, boolean z, boolean z2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeMap(map);
                akm.a(parcelObtainAndWriteInterfaceToken, z);
                akm.a(parcelObtainAndWriteInterfaceToken, z2);
                transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public void setGoogleServicesActivityEnabled(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                akm.a(parcelObtainAndWriteInterfaceToken, z);
                transactAndReadExceptionReturnVoid(13, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public void disableBlacklistedApps() {
                transactAndReadExceptionReturnVoid(14, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public void addPersistentPreferredActivity(IntentFilter intentFilter, ComponentName componentName) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                akm.a(parcelObtainAndWriteInterfaceToken, intentFilter);
                akm.a(parcelObtainAndWriteInterfaceToken, componentName);
                transactAndReadExceptionReturnVoid(15, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public void setStatusBarEnabled(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                akm.a(parcelObtainAndWriteInterfaceToken, z);
                transactAndReadExceptionReturnVoid(16, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public void turnOffFamilyLinkSupervision() {
                transactAndReadExceptionReturnVoid(17, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public boolean syncPolicies() {
                Parcel parcelTransactAndReadException = transactAndReadException(18, obtainAndWriteInterfaceToken());
                boolean zA = akm.a(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zA;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public List applyHideAppPolicies() {
                Parcel parcelTransactAndReadException = transactAndReadException(19, obtainAndWriteInterfaceToken());
                ArrayList<String> arrayListCreateStringArrayList = parcelTransactAndReadException.createStringArrayList();
                parcelTransactAndReadException.recycle();
                return arrayListCreateStringArrayList;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public boolean applyAllButHideAppPolicies() {
                Parcel parcelTransactAndReadException = transactAndReadException(20, obtainAndWriteInterfaceToken());
                boolean zA = akm.a(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zA;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public boolean isAppOnlyDisabledByMinVersion(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(21, parcelObtainAndWriteInterfaceToken);
                boolean zA = akm.a(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zA;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public CursorWindow initializeSupervision(String str, String str2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                Parcel parcelTransactAndReadException = transactAndReadException(22, parcelObtainAndWriteInterfaceToken);
                CursorWindow cursorWindow = (CursorWindow) akm.a(parcelTransactAndReadException, CursorWindow.CREATOR);
                parcelTransactAndReadException.recycle();
                return cursorWindow;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public void finishDeviceSetup() {
                transactAndReadExceptionReturnVoid(23, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public void scheduleSafetyNetJob(int i, String str, String str2, String str3, boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                akm.a(parcelObtainAndWriteInterfaceToken, z);
                transactAndReadExceptionReturnVoid(24, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public void scheduleFinishDeviceSetupJob() {
                transactAndReadExceptionReturnVoid(25, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public String reauth(String str, String str2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                Parcel parcelTransactAndReadException = transactAndReadException(26, parcelObtainAndWriteInterfaceToken);
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public String reauthWithParentDelegation(String str, String str2, String str3) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                Parcel parcelTransactAndReadException = transactAndReadException(27, parcelObtainAndWriteInterfaceToken);
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public void unlockTimeLimit() {
                transactAndReadExceptionReturnVoid(28, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public boolean verifyParentAccessCode(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(29, parcelObtainAndWriteInterfaceToken);
                boolean zA = akm.a(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zA;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public boolean verifyParentAccessCodeAndUnlockTimeLimit(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(30, parcelObtainAndWriteInterfaceToken);
                boolean zA = akm.a(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zA;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public void removeSupervisedAccount(String str, boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                akm.a(parcelObtainAndWriteInterfaceToken, z);
                transactAndReadExceptionReturnVoid(31, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public void revokeSupervision() {
                transactAndReadExceptionReturnVoid(32, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public boolean isCoexistenceEnabled() {
                Parcel parcelTransactAndReadException = transactAndReadException(33, obtainAndWriteInterfaceToken());
                boolean zA = akm.a(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zA;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public boolean isSecondaryAccountSignInEnabled() {
                Parcel parcelTransactAndReadException = transactAndReadException(34, obtainAndWriteInterfaceToken());
                boolean zA = akm.a(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zA;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public boolean isNativeAccountManagementEnabled() {
                Parcel parcelTransactAndReadException = transactAndReadException(35, obtainAndWriteInterfaceToken());
                boolean zA = akm.a(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zA;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public CursorWindow fetchConsentInfoForSecondaryAccount(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(36, parcelObtainAndWriteInterfaceToken);
                CursorWindow cursorWindow = (CursorWindow) akm.a(parcelTransactAndReadException, CursorWindow.CREATOR);
                parcelTransactAndReadException.recycle();
                return cursorWindow;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public void savePartialConsentForSecondaryAccountSignIn(String str, String str2, String str3) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                transactAndReadExceptionReturnVoid(37, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public void removeSecondaryAccount(String str, String str2, String str3) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                transactAndReadExceptionReturnVoid(38, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public void startService(String str, String str2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(39, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public CursorWindow listSupervisableDevices(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(40, parcelObtainAndWriteInterfaceToken);
                CursorWindow cursorWindow = (CursorWindow) akm.a(parcelTransactAndReadException, CursorWindow.CREATOR);
                parcelTransactAndReadException.recycle();
                return cursorWindow;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public String acceptPairing(String str, String str2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                Parcel parcelTransactAndReadException = transactAndReadException(41, parcelObtainAndWriteInterfaceToken);
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public CursorWindow getOnboardingInitiator(String str, String str2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                Parcel parcelTransactAndReadException = transactAndReadException(42, parcelObtainAndWriteInterfaceToken);
                CursorWindow cursorWindow = (CursorWindow) akm.a(parcelTransactAndReadException, CursorWindow.CREATOR);
                parcelTransactAndReadException.recycle();
                return cursorWindow;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public void cancelOnboarding(String str, String str2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(43, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public CursorWindow acceptInvitation(String str, String str2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                Parcel parcelTransactAndReadException = transactAndReadException(44, parcelObtainAndWriteInterfaceToken);
                CursorWindow cursorWindow = (CursorWindow) akm.a(parcelTransactAndReadException, CursorWindow.CREATOR);
                parcelTransactAndReadException.recycle();
                return cursorWindow;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public void removeAllAccountsExcept(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(45, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public CursorWindow optInSupervision(String str, String str2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                Parcel parcelTransactAndReadException = transactAndReadException(46, parcelObtainAndWriteInterfaceToken);
                CursorWindow cursorWindow = (CursorWindow) akm.a(parcelTransactAndReadException, CursorWindow.CREATOR);
                parcelTransactAndReadException.recycle();
                return cursorWindow;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public void optOutSupervision() {
                transactAndReadExceptionReturnVoid(47, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public int getMemberSvExitState() {
                Parcel parcelTransactAndReadException = transactAndReadException(48, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public void setMemberSvExitState(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(49, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public CursorWindow getLockdownInfo() {
                Parcel parcelTransactAndReadException = transactAndReadException(55, obtainAndWriteInterfaceToken());
                CursorWindow cursorWindow = (CursorWindow) akm.a(parcelTransactAndReadException, CursorWindow.CREATOR);
                parcelTransactAndReadException.recycle();
                return cursorWindow;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public void clearLockdownInfo() {
                transactAndReadExceptionReturnVoid(51, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public CursorWindow listManagedDevices() {
                Parcel parcelTransactAndReadException = transactAndReadException(52, obtainAndWriteInterfaceToken());
                CursorWindow cursorWindow = (CursorWindow) akm.a(parcelTransactAndReadException, CursorWindow.CREATOR);
                parcelTransactAndReadException.recycle();
                return cursorWindow;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public void logToClearcutFromUi(int i, CursorWindow cursorWindow, String str, long j, long j2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                akm.a(parcelObtainAndWriteInterfaceToken, cursorWindow);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                parcelObtainAndWriteInterfaceToken.writeLong(j2);
                transactAndReadExceptionReturnVoid(53, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public String getSuwLibraryFlows() {
                Parcel parcelTransactAndReadException = transactAndReadException(54, obtainAndWriteInterfaceToken());
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.gms.kids.aidl.IKidsInternalService
            public void setLockdownInfoForPermalock(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                akm.a(parcelObtainAndWriteInterfaceToken, z);
                transactAndReadExceptionReturnVoid(56, parcelObtainAndWriteInterfaceToken);
            }
        }

        public static IKidsInternalService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.kids.aidl.IKidsInternalService");
            if (iInterfaceQueryLocalInterface instanceof IKidsInternalService) {
                return (IKidsInternalService) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // flm.akl
        public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    Account supervisedAccount = getSupervisedAccount();
                    parcel2.writeNoException();
                    akm.b(parcel2, supervisedAccount);
                    return true;
                case 3:
                    boolean zHasMultipleAccounts = hasMultipleAccounts();
                    parcel2.writeNoException();
                    akm.a(parcel2, zHasMultipleAccounts);
                    return true;
                case 4:
                    String accountId = getAccountId(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(accountId);
                    return true;
                case 5:
                    boolean zIsSupervisedAccountNonUnicorn = isSupervisedAccountNonUnicorn();
                    parcel2.writeNoException();
                    akm.a(parcel2, zIsSupervisedAccountNonUnicorn);
                    return true;
                case 6:
                    String storedSupervisedAccountName = getStoredSupervisedAccountName();
                    parcel2.writeNoException();
                    parcel2.writeString(storedSupervisedAccountName);
                    return true;
                case 7:
                    setPolicyLevel(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    CursorWindow cursorWindowReportDeviceInfo = reportDeviceInfo();
                    parcel2.writeNoException();
                    akm.b(parcel2, cursorWindowReportDeviceInfo);
                    return true;
                case 9:
                    CursorWindow cursorWindowInitializeDeviceSetup = initializeDeviceSetup(parcel.readString());
                    parcel2.writeNoException();
                    akm.b(parcel2, cursorWindowInitializeDeviceSetup);
                    return true;
                case 10:
                    CursorWindow cursorWindowListFamilyMembers = listFamilyMembers(akm.a(parcel));
                    parcel2.writeNoException();
                    akm.b(parcel2, cursorWindowListFamilyMembers);
                    return true;
                case 11:
                    CursorWindow appsInfo = getAppsInfo(parcel.readString());
                    parcel2.writeNoException();
                    akm.b(parcel2, appsInfo);
                    return true;
                case 12:
                    batchUpdateApps(parcel.readString(), akm.b(parcel), akm.a(parcel), akm.a(parcel));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    setGoogleServicesActivityEnabled(akm.a(parcel));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    disableBlacklistedApps();
                    parcel2.writeNoException();
                    return true;
                case 15:
                    addPersistentPreferredActivity((IntentFilter) akm.a(parcel, IntentFilter.CREATOR), (ComponentName) akm.a(parcel, ComponentName.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    setStatusBarEnabled(akm.a(parcel));
                    parcel2.writeNoException();
                    return true;
                case 17:
                    turnOffFamilyLinkSupervision();
                    parcel2.writeNoException();
                    return true;
                case 18:
                    boolean zSyncPolicies = syncPolicies();
                    parcel2.writeNoException();
                    akm.a(parcel2, zSyncPolicies);
                    return true;
                case 19:
                    List<String> listApplyHideAppPolicies = applyHideAppPolicies();
                    parcel2.writeNoException();
                    parcel2.writeStringList(listApplyHideAppPolicies);
                    return true;
                case 20:
                    boolean zApplyAllButHideAppPolicies = applyAllButHideAppPolicies();
                    parcel2.writeNoException();
                    akm.a(parcel2, zApplyAllButHideAppPolicies);
                    return true;
                case 21:
                    boolean zIsAppOnlyDisabledByMinVersion = isAppOnlyDisabledByMinVersion(parcel.readString());
                    parcel2.writeNoException();
                    akm.a(parcel2, zIsAppOnlyDisabledByMinVersion);
                    return true;
                case 22:
                    CursorWindow cursorWindowInitializeSupervision = initializeSupervision(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    akm.b(parcel2, cursorWindowInitializeSupervision);
                    return true;
                case 23:
                    finishDeviceSetup();
                    parcel2.writeNoException();
                    return true;
                case 24:
                    scheduleSafetyNetJob(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), akm.a(parcel));
                    parcel2.writeNoException();
                    return true;
                case 25:
                    scheduleFinishDeviceSetupJob();
                    parcel2.writeNoException();
                    return true;
                case 26:
                    String strReauth = reauth(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strReauth);
                    return true;
                case 27:
                    String strReauthWithParentDelegation = reauthWithParentDelegation(parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strReauthWithParentDelegation);
                    return true;
                case 28:
                    unlockTimeLimit();
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_verifyParentAccessCode /* 29 */:
                    boolean zVerifyParentAccessCode = verifyParentAccessCode(parcel.readString());
                    parcel2.writeNoException();
                    akm.a(parcel2, zVerifyParentAccessCode);
                    return true;
                case 30:
                    boolean zVerifyParentAccessCodeAndUnlockTimeLimit = verifyParentAccessCodeAndUnlockTimeLimit(parcel.readString());
                    parcel2.writeNoException();
                    akm.a(parcel2, zVerifyParentAccessCodeAndUnlockTimeLimit);
                    return true;
                case 31:
                    removeSupervisedAccount(parcel.readString(), akm.a(parcel));
                    parcel2.writeNoException();
                    return true;
                case 32:
                    revokeSupervision();
                    parcel2.writeNoException();
                    return true;
                case 33:
                    boolean zIsCoexistenceEnabled = isCoexistenceEnabled();
                    parcel2.writeNoException();
                    akm.a(parcel2, zIsCoexistenceEnabled);
                    return true;
                case 34:
                    boolean zIsSecondaryAccountSignInEnabled = isSecondaryAccountSignInEnabled();
                    parcel2.writeNoException();
                    akm.a(parcel2, zIsSecondaryAccountSignInEnabled);
                    return true;
                case 35:
                    boolean zIsNativeAccountManagementEnabled = isNativeAccountManagementEnabled();
                    parcel2.writeNoException();
                    akm.a(parcel2, zIsNativeAccountManagementEnabled);
                    return true;
                case 36:
                    CursorWindow cursorWindowFetchConsentInfoForSecondaryAccount = fetchConsentInfoForSecondaryAccount(parcel.readString());
                    parcel2.writeNoException();
                    akm.b(parcel2, cursorWindowFetchConsentInfoForSecondaryAccount);
                    return true;
                case 37:
                    savePartialConsentForSecondaryAccountSignIn(parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 38:
                    removeSecondaryAccount(parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_startService /* 39 */:
                    startService(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    CursorWindow cursorWindowListSupervisableDevices = listSupervisableDevices(parcel.readString());
                    parcel2.writeNoException();
                    akm.b(parcel2, cursorWindowListSupervisableDevices);
                    return true;
                case 41:
                    String strAcceptPairing = acceptPairing(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strAcceptPairing);
                    return true;
                case 42:
                    CursorWindow onboardingInitiator = getOnboardingInitiator(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    akm.b(parcel2, onboardingInitiator);
                    return true;
                case 43:
                    cancelOnboarding(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 44:
                    CursorWindow cursorWindowAcceptInvitation = acceptInvitation(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    akm.b(parcel2, cursorWindowAcceptInvitation);
                    return true;
                case 45:
                    removeAllAccountsExcept(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 46:
                    CursorWindow cursorWindowOptInSupervision = optInSupervision(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    akm.b(parcel2, cursorWindowOptInSupervision);
                    return true;
                case 47:
                    optOutSupervision();
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getMemberSvExitState /* 48 */:
                    int memberSvExitState = getMemberSvExitState();
                    parcel2.writeNoException();
                    parcel2.writeInt(memberSvExitState);
                    return true;
                case TRANSACTION_setMemberSvExitState /* 49 */:
                    setMemberSvExitState(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 50:
                default:
                    return false;
                case TRANSACTION_clearLockdownInfo /* 51 */:
                    clearLockdownInfo();
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_listManagedDevices /* 52 */:
                    CursorWindow cursorWindowListManagedDevices = listManagedDevices();
                    parcel2.writeNoException();
                    akm.b(parcel2, cursorWindowListManagedDevices);
                    return true;
                case TRANSACTION_logToClearcutFromUi /* 53 */:
                    logToClearcutFromUi(parcel.readInt(), (CursorWindow) akm.a(parcel, CursorWindow.CREATOR), parcel.readString(), parcel.readLong(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getSuwLibraryFlows /* 54 */:
                    String suwLibraryFlows = getSuwLibraryFlows();
                    parcel2.writeNoException();
                    parcel2.writeString(suwLibraryFlows);
                    return true;
                case TRANSACTION_getLockdownInfo /* 55 */:
                    CursorWindow lockdownInfo = getLockdownInfo();
                    parcel2.writeNoException();
                    akm.b(parcel2, lockdownInfo);
                    return true;
                case TRANSACTION_setLockdownInfoForPermalock /* 56 */:
                    setLockdownInfoForPermalock(akm.a(parcel));
                    parcel2.writeNoException();
                    return true;
            }
        }
    }

    CursorWindow acceptInvitation(String str, String str2);

    String acceptPairing(String str, String str2);

    void addPersistentPreferredActivity(IntentFilter intentFilter, ComponentName componentName);

    boolean applyAllButHideAppPolicies();

    List applyHideAppPolicies();

    void batchUpdateApps(String str, Map map, boolean z, boolean z2);

    void cancelOnboarding(String str, String str2);

    void clearLockdownInfo();

    void disableBlacklistedApps();

    CursorWindow fetchConsentInfoForSecondaryAccount(String str);

    void finishDeviceSetup();

    String getAccountId(String str);

    CursorWindow getAppsInfo(String str);

    CursorWindow getLockdownInfo();

    int getMemberSvExitState();

    CursorWindow getOnboardingInitiator(String str, String str2);

    String getStoredSupervisedAccountName();

    Account getSupervisedAccount();

    String getSuwLibraryFlows();

    boolean hasMultipleAccounts();

    CursorWindow initializeDeviceSetup(String str);

    CursorWindow initializeSupervision(String str, String str2);

    boolean isAppOnlyDisabledByMinVersion(String str);

    boolean isCoexistenceEnabled();

    boolean isNativeAccountManagementEnabled();

    boolean isSecondaryAccountSignInEnabled();

    boolean isSupervisedAccountNonUnicorn();

    CursorWindow listFamilyMembers(boolean z);

    CursorWindow listManagedDevices();

    CursorWindow listSupervisableDevices(String str);

    void logToClearcutFromUi(int i, CursorWindow cursorWindow, String str, long j, long j2);

    CursorWindow optInSupervision(String str, String str2);

    void optOutSupervision();

    String reauth(String str, String str2);

    String reauthWithParentDelegation(String str, String str2, String str3);

    void removeAllAccountsExcept(String str);

    void removeSecondaryAccount(String str, String str2, String str3);

    void removeSupervisedAccount(String str, boolean z);

    CursorWindow reportDeviceInfo();

    void revokeSupervision();

    void savePartialConsentForSecondaryAccountSignIn(String str, String str2, String str3);

    void scheduleFinishDeviceSetupJob();

    void scheduleSafetyNetJob(int i, String str, String str2, String str3, boolean z);

    void setGoogleServicesActivityEnabled(boolean z);

    void setLockdownInfoForPermalock(boolean z);

    void setMemberSvExitState(int i);

    void setPolicyLevel(int i);

    void setStatusBarEnabled(boolean z);

    void startService(String str, String str2);

    boolean syncPolicies();

    void turnOffFamilyLinkSupervision();

    void unlockTimeLimit();

    boolean verifyParentAccessCode(String str);

    boolean verifyParentAccessCodeAndUnlockTimeLimit(String str);
}
