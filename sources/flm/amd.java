package flm;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class amd {
    private static final Lock a = new ReentrantLock();
    private static amd b;
    private final Lock c = new ReentrantLock();
    private final SharedPreferences d;

    public static amd a(Context context) {
        bdi.checkNotNull(context);
        a.lock();
        try {
            if (b == null) {
                b = new amd(context.getApplicationContext());
            }
            return b;
        } finally {
            a.unlock();
        }
    }

    private amd(Context context) {
        this.d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final GoogleSignInAccount a(String str) {
        String strB;
        if (TextUtils.isEmpty(str) || (strB = b(new StringBuilder(String.valueOf("googleSignInAccount").length() + 1 + String.valueOf(str).length()).append("googleSignInAccount").append(":").append(str).toString())) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.a(strB);
        } catch (JSONException e) {
            return null;
        }
    }

    public final String b(String str) {
        this.c.lock();
        try {
            return this.d.getString(str, null);
        } finally {
            this.c.unlock();
        }
    }
}
