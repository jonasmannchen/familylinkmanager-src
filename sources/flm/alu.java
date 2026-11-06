package flm;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class alu extends alv {
    public static final String a = alv.c;

    public static String a(Context context, Account account, String str) {
        return alv.b(context, account, str);
    }

    public static String a(Context context, Account account, String str, Bundle bundle) {
        return alv.b(context, account, str, bundle);
    }

    public static void a(Context context, String str) throws IOException, alt {
        alv.c(context, str);
    }

    public static String b(Context context, String str) {
        return alv.d(context, str);
    }
}
