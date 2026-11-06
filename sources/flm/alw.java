package flm;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.auth.TokenData;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class alw implements aly {
    private final /* synthetic */ Account a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Bundle c;

    alw(Account account, String str, Bundle bundle) {
        this.a = account;
        this.b = str;
        this.c = bundle;
    }

    @Override // flm.aly
    public final /* synthetic */ Object a(IBinder iBinder) throws IOException, alt {
        Bundle bundle = (Bundle) alv.a(akp.a(iBinder).a(this.a, this.b, this.c));
        TokenData tokenDataA = TokenData.a(bundle, "tokenDetails");
        if (tokenDataA != null) {
            return tokenDataA;
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        amk amkVarA = amk.a(string);
        if (amk.BAD_AUTHENTICATION.equals(amkVarA) || amk.CAPTCHA.equals(amkVarA) || amk.NEED_PERMISSION.equals(amkVarA) || amk.NEED_REMOTE_CONSENT.equals(amkVarA) || amk.NEEDS_BROWSER.equals(amkVarA) || amk.USER_CANCEL.equals(amkVarA) || amk.DEVICE_MANAGEMENT_REQUIRED.equals(amkVarA) || amk.DM_INTERNAL_ERROR.equals(amkVarA) || amk.DM_SYNC_DISABLED.equals(amkVarA) || amk.DM_ADMIN_BLOCKED.equals(amkVarA) || amk.DM_ADMIN_PENDING_APPROVAL.equals(amkVarA) || amk.DM_STALE_SYNC_REQUIRED.equals(amkVarA) || amk.DM_DEACTIVATED.equals(amkVarA) || amk.DM_REQUIRED.equals(amkVarA) || amk.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(amkVarA) || amk.DM_SCREENLOCK_REQUIRED.equals(amkVarA)) {
            beb bebVar = alv.d;
            String strValueOf = String.valueOf(amkVarA);
            bebVar.a("GoogleAuthUtil", new StringBuilder(String.valueOf(strValueOf).length() + 31).append("isUserRecoverableError status: ").append(strValueOf).toString());
            throw new amb(string, intent);
        }
        if (amk.NETWORK_ERROR.equals(amkVarA) || amk.SERVICE_UNAVAILABLE.equals(amkVarA) || amk.INTNERNAL_ERROR.equals(amkVarA)) {
            throw new IOException(string);
        }
        throw new alt(string);
    }
}
