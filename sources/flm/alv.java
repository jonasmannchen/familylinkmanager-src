package flm;

import android.accounts.Account;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.auth.TokenData;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class alv {
    private static final String[] a = {"com.google", "com.google.work", "cn.google"};

    @SuppressLint({"InlinedApi"})
    public static final String b = "callerUid";

    @SuppressLint({"InlinedApi"})
    public static final String c = "androidPackageName";
    private static final ComponentName e = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    public static final beb d = new beb("Auth", "GoogleAuthUtil");

    public static String b(Context context, Account account, String str) {
        return b(context, account, str, new Bundle());
    }

    public static String b(Context context, Account account, String str, Bundle bundle) throws alt {
        a(account);
        bdi.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        bdi.checkNotEmpty(str, "Scope cannot be empty or null.");
        a(account);
        a(context, 8400000);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        String str2 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str2);
        if (TextUtils.isEmpty(bundle2.getString(c))) {
            bundle2.putString(c, str2);
        }
        bundle2.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        return ((TokenData) a(context, e, new alw(account, str, bundle2))).b;
    }

    public static void c(Context context, String str) throws IOException, alt {
        bdi.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        a(context, 8400000);
        Bundle bundle = new Bundle();
        String str2 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str2);
        if (!bundle.containsKey(c)) {
            bundle.putString(c, str2);
        }
        a(context, e, new alx(str, bundle));
    }

    public static String d(Context context, String str) throws alt {
        bdi.checkNotEmpty(str, "accountName must be provided");
        bdi.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        a(context, 8400000);
        return b(context, new Account(str, "com.google"), "^^_account_id_^^", new Bundle());
    }

    private static void a(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        for (String str : a) {
            if (str.equals(account.type)) {
                return;
            }
        }
        throw new IllegalArgumentException("Account type not supported");
    }

    private static void a(Context context, int i) throws alt {
        try {
            aqx.b(context.getApplicationContext(), 8400000);
        } catch (aqu e2) {
            throw new alt(e2.getMessage());
        } catch (aqv e3) {
            throw new alz(e3.a, e3.getMessage(), new Intent(e3.b));
        }
    }

    static Object a(Object obj) throws IOException {
        if (obj == null) {
            d.a("GoogleAuthUtil", "Binder call returned null.");
            throw new IOException("Service unavailable.");
        }
        return obj;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private static Object a(Context context, ComponentName componentName, aly alyVar) throws IOException {
        aps apsVar = new aps();
        bbv bbvVar = bbv.getInstance(context);
        try {
            if (bbvVar.bindService(componentName, apsVar, "GoogleAuthUtil")) {
                try {
                    Object objA = alyVar.a(apsVar.a());
                    bbvVar.unbindService(componentName, apsVar, "GoogleAuthUtil");
                    return objA;
                } catch (RemoteException | InterruptedException e2) {
                    d.b("GoogleAuthUtil", "Error on service connection.", e2);
                    throw new IOException("Error on service connection.", e2);
                }
            }
            throw new IOException("Could not bind to service.");
        } catch (Throwable th) {
            bbvVar.unbindService(componentName, apsVar, "GoogleAuthUtil");
            throw th;
        }
    }
}
