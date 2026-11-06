package flm;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.app.BaseApplicationContext;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class cal {
    private static volatile car a;
    private static volatile cak b;
    private static volatile cap c;

    private cal() {
    }

    public static car a() {
        if (a == null) {
            synchronized (cal.class) {
                if (a == null) {
                    BaseApplicationContext baseApplicationContextA = ayt.a();
                    String strH = ((fqg) fqf.a.a()).h();
                    int i = (int) ((fqg) fqf.a.a()).i();
                    Context applicationContext = baseApplicationContextA.getApplicationContext();
                    caq caqVar = new caq(applicationContext, strH, i);
                    caqVar.a("X-Device-ID", Long.toHexString(bhq.a(applicationContext)));
                    caqVar.a("User-Agent", bfn.a(applicationContext, "Kids/1.0"));
                    Locale localeA = qm.a(applicationContext.getResources().getConfiguration()).a(0);
                    String string = (localeA == null || TextUtils.isEmpty(localeA.toString())) ? "" : localeA.toString();
                    if (!TextUtils.isEmpty(string)) {
                        caqVar.a("Accept-Language", string);
                    }
                    a = new car(caqVar);
                }
            }
        }
        return a;
    }

    public static cak b() {
        if (b == null) {
            synchronized (cal.class) {
                if (b == null) {
                    b = new cak(new caq(ayt.a(), ((fqg) fqf.a.a()).c(), (int) ((fqg) fqf.a.a()).d()));
                }
            }
        }
        return b;
    }

    public static baw c() {
        return e().addGrantedScope(((fqg) fqf.a.a()).e());
    }

    public static baw a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("reauth_proof_token", str2);
        bundle.putInt("delegation_type", 2);
        bundle.putString("delegatee_user_id", str);
        Account accountC = bts.c();
        return a(accountC).setExtra(baw.KEY_EXTRAS_AUTH_TOKEN, f().a(ayt.a(), accountC, ((fqg) fqf.a.a()).f(), bundle));
    }

    public static baw a(final String str) {
        dvi dviVarC = dyk.c(bts.a(), new dvm(str) { // from class: flm.cam
            private final String a;

            {
                this.a = str;
            }

            @Override // flm.dvm
            public final boolean a(Object obj) {
                return this.a.equals(((Account) obj).name);
            }
        });
        dvl.a(dviVarC.a(), "No account found with name %s", str);
        return a((Account) dviVarC.b()).addGrantedScope(fqf.c()).addGrantedScope(fqf.b());
    }

    public static baw d() {
        return e().addGrantedScope(fqf.c()).addGrantedScope(fqf.b());
    }

    public static baw a(boolean z) {
        return z ? c() : d();
    }

    private static baw e() {
        Account accountC = bts.c();
        btv.b("KidsService", "Using account %s to make a gRPC request", accountC);
        if (accountC == null) {
            btv.e("KidsService", "No account found to make a gRPC request", new Object[0]);
        }
        return a(accountC);
    }

    public static baw a(Account account) {
        return new baw().setCallingUid(Process.myUid()).setRequestedAccount(account).setResolvedAccount(account).setAuthPackageName("com.google.android.gms").setCallingPackageName("com.google.android.gms");
    }

    private static cap f() {
        if (c == null) {
            synchronized (cal.class) {
                if (c == null) {
                    c = new cao();
                }
            }
        }
        return c;
    }
}
