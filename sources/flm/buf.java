package flm;

import android.annotation.TargetApi;
import android.app.admin.DevicePolicyManager;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import com.google.android.gms.kids.database.SupervisionDatabase;
import java.security.SecureRandom;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class buf {
    private static final SecureRandom a = new SecureRandom();

    @TargetApi(26)
    public static synchronized byte[] a() {
        boolean z;
        boolean resetPasswordToken;
        byte[] bArr;
        byte[] bArrB = null;
        synchronized (buf.class) {
            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) dvl.a(ayt.a().getSystemService("device_policy"));
            SupervisionDatabase supervisionDatabaseH = SupervisionDatabase.h();
            supervisionDatabaseH.d();
            try {
                bvp bvpVarK = supervisionDatabaseH.k();
                bvj bvjVarM = supervisionDatabaseH.m();
                String strA = bvpVarK.a("key_unlock_token");
                if (strA == null) {
                    btv.c("Policy", "Setting up password token", new Object[0]);
                    byte[] bArr2 = new byte[32];
                    a.nextBytes(bArr2);
                    try {
                        resetPasswordToken = devicePolicyManager.setResetPasswordToken(btb.a, bArr2);
                        try {
                            btv.c("Policy", "set new token. token active:%s", Boolean.valueOf(devicePolicyManager.isResetPasswordTokenActive(btb.a)));
                            bArr = bArr2;
                        } catch (SecurityException e) {
                            z = resetPasswordToken;
                            resetPasswordToken = z;
                            bArr = null;
                        }
                    } catch (SecurityException e2) {
                        z = false;
                    }
                    if (resetPasswordToken) {
                        bvpVarK.a("key_unlock_token", bArr == null ? "" : Base64.encodeToString(btn.a(bArr), 0));
                        bvjVarM.a(16, btj.b());
                        bArrB = bArr;
                    } else {
                        btt.a("Policy", "SetPasswordTokenFailed", "setResetPasswordToken failed", new Object[0]);
                    }
                } else {
                    bArrB = strA.isEmpty() ? null : btn.b(Base64.decode(strA, 0));
                }
                supervisionDatabaseH.f();
            } finally {
                supervisionDatabaseH.e();
            }
        }
        return bArrB;
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        try {
            if (ayt.a().getPackageManager().getApplicationInfo("com.google.android.gms", 0).targetSdkVersion >= 26) {
                return true;
            }
        } catch (PackageManager.NameNotFoundException e) {
            btv.c("Policy", e, "Cannot find GMSCore package.", new Object[0]);
        }
        return ((Boolean) buw.e.b()).booleanValue();
    }
}
