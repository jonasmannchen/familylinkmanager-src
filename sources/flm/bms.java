package flm;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bms implements bmr {
    private static final String a = bmq.a("FamilyApiMessage");
    private final Bundle b = new Bundle(13);

    public bms(String str, String str2) {
        bdi.checkNotEmpty(str);
        bdi.checkNotEmpty(str2);
        this.b.putString(a, "ManageFamilyV2");
        this.b.putString("accountName", str);
        this.b.putString("appId", str2);
    }

    @Override // flm.bmr
    public final Bundle a() {
        return new Bundle(this.b);
    }

    static {
        bmq.a("isDirectAddInvitations");
    }
}
