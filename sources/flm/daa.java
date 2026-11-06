package flm;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class daa extends bbq implements czp {
    private final boolean a;
    private final bba b;
    private final Bundle c;
    private Integer d;

    public daa(Context context, Looper looper, boolean z, bba bbaVar, Bundle bundle, atr atrVar, ats atsVar) {
        super(context, looper, 44, bbaVar, atrVar, atsVar);
        this.a = z;
        this.b = bbaVar;
        this.c = bundle;
        this.d = bbaVar.getClientSessionId();
    }

    public daa(Context context, Looper looper, boolean z, bba bbaVar, atr atrVar, ats atsVar) {
        czq signInOptions = bbaVar.getSignInOptions();
        Integer clientSessionId = bbaVar.getClientSessionId();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", bbaVar.getAccount());
        if (clientSessionId != null) {
            bundle.putInt(bba.KEY_CLIENT_SESSION_ID, clientSessionId.intValue());
        }
        if (signInOptions != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", signInOptions.b);
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", signInOptions.c);
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", signInOptions.d);
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", signInOptions.e);
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", signInOptions.f);
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", signInOptions.g);
            if (signInOptions.h != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", signInOptions.h.longValue());
            }
            if (signInOptions.i != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", signInOptions.i.longValue());
            }
        }
        this(context, looper, true, bbaVar, bundle, atrVar, atsVar);
    }

    @Override // flm.bai, flm.ate
    public final boolean requiresSignIn() {
        return this.a;
    }

    @Override // flm.czp
    public final void a(bcd bcdVar, boolean z) {
        try {
            ((czx) getService()).a(bcdVar, this.d.intValue(), z);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override // flm.czp
    public final void a() {
        try {
            ((czx) getService()).a(this.d.intValue());
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // flm.czp
    public final void a(czv czvVar) {
        bdi.checkNotNull(czvVar, "Expecting a valid ISignInCallbacks");
        try {
            Account accountOrDefault = this.b.getAccountOrDefault();
            GoogleSignInAccount googleSignInAccountA = null;
            if (bai.DEFAULT_ACCOUNT.equals(accountOrDefault.name)) {
                amd amdVarA = amd.a(getContext());
                googleSignInAccountA = amdVarA.a(amdVarA.b("defaultGoogleSignInAccount"));
            }
            ((czx) getService()).a(new dab(new bdj(accountOrDefault, this.d.intValue(), googleSignInAccountA)), czvVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                czvVar.a(new dad(8));
            } catch (RemoteException e2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.b.getRealClientPackageName())) {
            this.c.putString("com.google.android.gms.signin.internal.realClientPackageName", this.b.getRealClientPackageName());
        }
        return this.c;
    }

    @Override // flm.czp
    public final void b() {
        connect(new bar(this));
    }

    @Override // flm.bbq, flm.bai, flm.ate
    public final int getMinApkVersion() {
        return 12451000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return czy.a(iBinder);
    }
}
