package flm;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dqm {
    public static Long a(Context context) {
        try {
            String string = context.getResources().getString(R.string.primes_version);
            try {
                return Long.valueOf(Long.parseLong(string));
            } catch (NumberFormatException e) {
                String strValueOf = String.valueOf(string);
                dkm.a(5, "PrimesVersion", strValueOf.length() != 0 ? "Couldn't parse Primes version number from ".concat(strValueOf) : new String("Couldn't parse Primes version number from "), new Object[0]);
                return null;
            }
        } catch (Resources.NotFoundException e2) {
            dkm.a(5, "PrimesVersion", "Primes version number string not found", new Object[0]);
            return null;
        }
    }
}
