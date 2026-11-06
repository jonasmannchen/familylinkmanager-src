package flm;

import android.os.Build;
import android.util.Log;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class edl extends ecy implements ecp {
    private final String b;

    public edl(String str, String str2, boolean z) {
        String strSubstring;
        super(str2);
        if (str.length() + str2.length() <= 23) {
            String strValueOf = String.valueOf(str);
            String strValueOf2 = String.valueOf(str2);
            this.b = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
            return;
        }
        String strReplace = str2.replace('$', '.');
        String strSubstring2 = strReplace.substring(strReplace.lastIndexOf(46) + 1);
        if (z || Build.VERSION.SDK_INT < 26) {
            String strValueOf3 = String.valueOf(str);
            String strValueOf4 = String.valueOf(strSubstring2);
            String strConcat = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
            strSubstring = strConcat.substring(0, Math.min(strConcat.length(), 23));
        } else {
            String strValueOf5 = String.valueOf(str);
            String strValueOf6 = String.valueOf(strSubstring2);
            strSubstring = strValueOf6.length() != 0 ? strValueOf5.concat(strValueOf6) : new String(strValueOf5);
        }
        this.b = strSubstring;
    }

    @Override // flm.ecg
    public final boolean a(Level level) {
        return Log.isLoggable(this.b, b(level)) || Log.isLoggable("all", b(level));
    }

    @Override // flm.ecg
    public final void a(ecf ecfVar) {
        eco.a(ecfVar, this);
    }

    private static int b(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue >= 1000) {
            return 6;
        }
        if (iIntValue >= 900) {
            return 5;
        }
        if (iIntValue >= 800) {
            return 4;
        }
        if (iIntValue >= 700) {
            return 3;
        }
        return 2;
    }

    @Override // flm.ecp
    public final void a(Level level, String str, Throwable th) {
        switch (b(level)) {
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                Log.w(this.b, str, th);
                break;
            case 6:
                Log.e(this.b, str, th);
                break;
            default:
                Log.wtf(this.b, String.format("Level \"%d\" is not a valid level", Integer.valueOf(level.intValue())));
                break;
        }
    }
}
