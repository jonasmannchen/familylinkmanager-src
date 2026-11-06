package flm;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.VolleyError;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bff {
    public final Context a;

    public bff(Context context) {
        this.a = context;
    }

    public final String a(baw bawVar) {
        try {
            return new ame(this.a).a(bawVar.getAuthPackageName());
        } catch (alt e) {
            Log.w("AbstractServer", "GoogleAuthException while getting app cert is being ignored.", e);
            return null;
        } catch (IOException e2) {
            Log.w("AbstractServer", "IOException while getting app cert is being ignored.", e2);
            return null;
        }
    }

    public final String b(baw bawVar) throws VolleyError {
        String extra = bawVar.getExtra(baw.KEY_EXTRAS_AUTH_TOKEN);
        if (TextUtils.isEmpty(extra)) {
            if (bawVar.getResolvedAccountName() == null) {
                return null;
            }
            bfo bfoVar = new bfo(bawVar);
            try {
                bfoVar.e = alu.a(this.a, bfoVar.a, bfoVar.c, bfoVar.d);
                bfp.a().a(bfoVar.b);
                return bfoVar.e;
            } catch (IOException e) {
                throw new VolleyError(e);
            }
        }
        return extra;
    }
}
