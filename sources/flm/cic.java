package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cic {
    private static final dxf a = (dxf) ((dxg) ((dxg) ((dxg) ((dxg) ((dxg) ((dxg) ((dxg) ((dxg) ((dxg) ((dxg) ((dxg) ((dxg) ((dxg) ((dxg) new dxg().a(cia.UNSPECIFIED, "Unspecified")).a(cia.ABORT_WITH_RESULT_CANCELED, "AbortWithResultCanceled")).a(cia.ABORT_WITH_RESULT_OK, "AbortWithResultOk")).a(cia.ADD_ACCOUNT_FLOW, "AddAccountFlow")).a(cia.OUT_OF_BOX_FLOW, "OutOfBoxFlow")).a(cia.SYNC_TAIL_FLOW, "SyncTailFlow")).a(cia.DEFERRED_SETUP_FLOW, "DeferredSetupFlow")).a(cia.SIGN_OUT_FLOW, "SignOutFlow")).a(cia.GELLER_FLOW, "GellerFlow")).a(cia.GELLER_EXIT_FLOW, "GellerExitFlow")).a(cia.SECONDARY_SIGN_IN_FLOW, "SecondarySignInFlow")).a(cia.SECONDARY_SIGN_OUT_FLOW, "SecondarySignOutFlow")).a(cia.AUTH_ADD_FLOW, "AuthAddFlow")).a(cia.AUTH_REMOVE_FLOW, "AuthRemoveFlow")).a();

    public static cia a(String str) {
        return (cia) a.a().get(str);
    }

    public static String a(cia ciaVar) {
        return (String) dvl.a((String) a.get(ciaVar));
    }

    public static boolean b(cia ciaVar) {
        return ciaVar == cia.ADD_ACCOUNT_FLOW || ciaVar == cia.OUT_OF_BOX_FLOW || ciaVar == cia.DEFERRED_SETUP_FLOW;
    }
}
