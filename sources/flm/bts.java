package flm;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SyncAdapterType;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.app.BaseApplicationContext;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bts {
    private static volatile bts a;

    public static List a() {
        d();
        BaseApplicationContext baseApplicationContextA = ayt.a();
        return bhp.a((Context) baseApplicationContextA, baseApplicationContextA.getPackageName());
    }

    public static String b() {
        Account accountC = c();
        if (accountC == null) {
            return null;
        }
        return accountC.name;
    }

    public static Account c() {
        d();
        List listA = bhp.a((Context) ayt.a());
        if (!listA.isEmpty()) {
            return (Account) listA.get(0);
        }
        return null;
    }

    public static boolean a(Account account) {
        d();
        BaseApplicationContext baseApplicationContextA = ayt.a();
        dvl.a(account, "Account not specified.");
        return bhp.c(baseApplicationContextA, account.name) && !bhp.b(baseApplicationContextA, account.name);
    }

    public static boolean b(Account account) {
        d();
        return a(ayt.a(), account);
    }

    public static void a(Account... accountArr) throws IOException, alt {
        d();
        BaseApplicationContext baseApplicationContextA = ayt.a();
        for (Account account : Arrays.asList(accountArr)) {
            new Object[1][0] = account.name;
            alv.c(baseApplicationContextA, alv.b(baseApplicationContextA, account, "ac2dm", new Bundle()));
            alv.b(baseApplicationContextA, account, "ac2dm", new Bundle());
        }
    }

    static bts d() {
        if (a == null) {
            synchronized (bts.class) {
                if (a == null) {
                    a = new bts();
                }
            }
        }
        return a;
    }

    protected bts() {
    }

    public static String a(String str) {
        d();
        return alu.b(ayt.a(), str);
    }

    private static boolean a(Context context, Account account) {
        new Object[1][0] = account.name;
        SyncAdapterType[] syncAdapterTypes = ContentResolver.getSyncAdapterTypes();
        if (syncAdapterTypes != null) {
            for (SyncAdapterType syncAdapterType : syncAdapterTypes) {
                ContentResolver.setSyncAutomatically(account, syncAdapterType.authority, false);
            }
        }
        ContentResolver.cancelSync(account, null);
        AccountManager accountManager = AccountManager.get(context);
        if (Build.VERSION.SDK_INT >= 22) {
            return accountManager.removeAccountExplicitly(account);
        }
        try {
            return accountManager.removeAccount(account, null, null).getResult().booleanValue();
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            btv.c(null, e, "Failed to get remove account result", new Object[0]);
            return false;
        }
    }

    protected static String a(Context context, Account account, String str) {
        new Object[1][0] = account.name;
        long jC = btj.c();
        try {
            String strB = alv.b(context, account, str);
            btt.a("System", "getTokenTime", "getToken() took %s ms", Long.valueOf(btj.c() - jC));
            return strB;
        } catch (alt | IOException e) {
            btt.a("System", e, "getToken() took %s ms", Long.valueOf(btj.c() - jC));
            throw e;
        }
    }
}
