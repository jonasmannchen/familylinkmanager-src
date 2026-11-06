package flm;

import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cwr extends azw implements cxm {
    public cwr(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    @Override // flm.cxm
    public final String a() {
        return a("account_name");
    }

    @Override // flm.cxm
    public final String b() {
        return !TextUtils.isEmpty(a("display_name")) ? a("display_name") : a("account_name");
    }

    @Override // flm.cxm
    public final String c() {
        return !TextUtils.isEmpty(a("given_name")) ? a("given_name") : "null";
    }

    @Override // flm.cxm
    public final String d() {
        return a("gaia_id");
    }

    @Override // flm.cxm
    public final String e() {
        return cys.a.a(a("avatar"));
    }
}
