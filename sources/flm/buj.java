package flm;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class buj {
    private static volatile buj a;

    public static buj a() {
        if (a == null) {
            synchronized (buj.class) {
                if (a == null) {
                    a = new buj();
                }
            }
        }
        return a;
    }

    public static dvi a(Context context, String str, String str2, String str3, List list) throws JSONException, IOException {
        JSONObject jSONObjectA = btz.a(context, String.format("https://www.googleapis.com/reauth/v1beta/users/%s/reauthProofTokens", str2), "POST", list, dyu.a(Pair.create("Authorization", String.format("Bearer %s", a(context, str)))), new JSONObject().put("credentialType", "password").put("credential", str3));
        String strOptString = jSONObjectA.optString("encodedRapt");
        if (!TextUtils.isEmpty(strOptString)) {
            return dvi.b(strOptString);
        }
        JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject("error");
        if (jSONObjectOptJSONObject == null) {
            throw new IOException("Reauth failed but the response does not contain any error messages.");
        }
        int iOptInt = jSONObjectOptJSONObject.optInt("code");
        String strOptString2 = jSONObjectOptJSONObject.optString("message");
        if ("INVALID_GRANT".equals(strOptString2)) {
            return dur.a;
        }
        throw new IOException(String.format("Failed to reauth: %s (error code %s).", strOptString2, Integer.valueOf(iOptInt)));
    }

    private static String a(Context context, String str) throws IOException {
        Account account = new Account(str, "com.google");
        try {
            String strValueOf = String.valueOf(((fqg) fqf.a.a()).a());
            return alu.a(context, account, strValueOf.length() != 0 ? "oauth2:".concat(strValueOf) : new String("oauth2:"));
        } catch (alt e) {
            throw new IOException(e);
        }
    }

    private buj() {
    }
}
