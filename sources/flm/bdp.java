package flm;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bdp {
    public static final String WHITELIST_DELIMITER = ",";

    private bdp() {
    }

    public static boolean shouldBlock(Context context, int i, Account account) {
        if (!aqw.b(context)) {
            return false;
        }
        String str = account != null ? account.type : null;
        if (str == null) {
            return !isServiceWhitelisted((String) aze.d.b(), i);
        }
        boolean zA = bhp.a(account, "com.google");
        if (("cn.google".equals(str) || zA) && !isServiceWhitelisted((String) aze.c.b(), i)) {
            return true;
        }
        return false;
    }

    private static boolean isServiceWhitelisted(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strValueOf = String.valueOf(i);
        for (String str2 : str.split(WHITELIST_DELIMITER)) {
            if (strValueOf.equals(str2)) {
                return true;
            }
        }
        return false;
    }
}
