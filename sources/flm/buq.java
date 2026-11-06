package flm;

import android.accounts.Account;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class buq implements dvc {
    public static final dvc a = new buq();

    private buq() {
    }

    @Override // flm.dvc
    public final Object a(Object obj) {
        return new Account((String) obj, "com.google");
    }
}
