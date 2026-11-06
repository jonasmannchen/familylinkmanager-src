package flm;

import android.content.SharedPreferences;
import android.util.Base64;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dpo {
    public final SharedPreferences a;

    public dpo(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final fke a(String str, fko fkoVar) {
        byte[] bArrDecode = Base64.decode(this.a.getString(str, ""), 0);
        if (bArrDecode == null || bArrDecode.length == 0) {
            dkm.a(5, "PersistStorage", "unknown key", new Object[0]);
            return null;
        }
        if (bArrDecode[0] == 1) {
            try {
                return (fke) fkoVar.a(bArrDecode, 1, bArrDecode.length - 1);
            } catch (fjg e) {
                dkm.b("PersistStorage", "failure reading proto", e, new Object[0]);
            }
        } else {
            dkm.a(5, "PersistStorage", "wrong header", new Object[0]);
        }
        return null;
    }

    public final boolean a(String str, fke fkeVar) {
        byte[] bArrB = ((fke) dse.a(fkeVar)).b();
        byte[] bArr = new byte[bArrB.length + 1];
        bArr[0] = 1;
        System.arraycopy(bArrB, 0, bArr, 1, bArrB.length);
        return this.a.edit().putString(str, Base64.encodeToString(bArr, 0)).commit();
    }
}
