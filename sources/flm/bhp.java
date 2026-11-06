package flm;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bhp {
    @TargetApi(18)
    public static List a(Context context, String str) {
        return a(context, str, "com.google");
    }

    @TargetApi(18)
    private static List a(Context context, String str, String str2) {
        String strA;
        int iA = -1;
        AccountManager accountManager = AccountManager.get(context);
        beo beoVarA = beo.a(context, new baw().setCallingPackageName(context.getPackageName()).setCallingUid(Process.myUid()));
        int callingPid = beoVarA.c.getCallingPid();
        if (callingPid >= 0) {
            iA = bjj.a.a(beoVarA.b).a("android.permission.INTERACT_ACROSS_USERS", callingPid, beoVarA.c.getCallingUid(), beoVarA.c.getCallingPackageName());
        } else {
            String callingPackageName = beoVarA.c.getCallingPackageName();
            if (bjj.a.a(beoVarA.b).a("android.permission.INTERACT_ACROSS_USERS", callingPackageName) != -1) {
                iA = (!biw.a() || (strA = beoVarA.a.a("android.permission.INTERACT_ACROSS_USERS")) == null || beoVarA.a.a(strA, beoVarA.c.getCallingUid(), callingPackageName) == 0) ? 0 : -2;
            }
        }
        Account[] accountsByTypeForPackage = iA == 0 ? accountManager.getAccountsByTypeForPackage(str2, str) : accountManager.getAccountsByType(str2);
        ArrayList arrayList = new ArrayList();
        for (Account account : accountsByTypeForPackage) {
            if (account.name != null && account.type != null) {
                arrayList.add(account);
            }
        }
        return arrayList;
    }

    @Deprecated
    public static boolean b(Context context, String str) {
        return b(context, str, "uca");
    }

    public static List a(Context context) {
        return d(context, "usm");
    }

    public static boolean c(Context context, String str) {
        return b(context, str, "usm");
    }

    private static List d(Context context, String str) {
        Account[] result;
        AccountManager accountManager = AccountManager.get(context);
        String strA = dew.a(str);
        Account[] accountArr = new Account[0];
        try {
            result = accountManager.getAccountsByTypeAndFeatures("com.google", new String[]{strA}, null, null).getResult();
            try {
                String.format("%d accounts found with %s service flag | %s feature", Integer.valueOf(result.length), str, strA);
            } catch (AuthenticatorException e) {
                accountArr = result;
                e = e;
                Log.w("AccountUtils", "Unable to get accounts by type and service flag/feature", e);
                result = accountArr;
            } catch (OperationCanceledException e2) {
                accountArr = result;
                e = e2;
                Log.w("AccountUtils", "Unable to get accounts by type and service flag/feature", e);
                result = accountArr;
            } catch (IOException e3) {
                accountArr = result;
                e = e3;
                Log.w("AccountUtils", "Unable to get accounts by type and service flag/feature", e);
                result = accountArr;
            }
        } catch (AuthenticatorException e4) {
            e = e4;
        } catch (OperationCanceledException e5) {
            e = e5;
        } catch (IOException e6) {
            e = e6;
        }
        return Arrays.asList(result);
    }

    private static boolean b(Context context, String str, String str2) {
        Iterator it = d(context, str2).iterator();
        while (it.hasNext()) {
            if (str.equals(((Account) it.next()).name)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Context context, Account account, String str) {
        Iterator it = a(context, str, account.type).iterator();
        while (it.hasNext()) {
            if (((Account) it.next()).name.equals(account.name)) {
                return true;
            }
        }
        return false;
    }

    @TargetApi(17)
    public static boolean b(Context context) {
        return ((UserManager) context.getSystemService("user")).getSerialNumberForUser(Process.myUserHandle()) == 0;
    }

    public static String[] a(List list) {
        int size = list.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((Account) list.get(i)).name;
        }
        return strArr;
    }

    public static boolean a(Account account, String str) {
        return account != null && account.name.equals(bai.DEFAULT_ACCOUNT) && account.type.equals(str);
    }

    static {
        new bca("AccountUtils");
    }
}
