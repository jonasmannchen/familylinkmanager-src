package flm;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qn {
    private qp a;

    private qn(qp qpVar) {
        this.a = qpVar;
    }

    public static qn a(LocaleList localeList) {
        return new qn(new qq(localeList));
    }

    public static qn a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? a(new LocaleList(localeArr)) : new qn(new qo(localeArr));
    }

    public final Locale a(int i) {
        return this.a.a(0);
    }

    static Locale a(String str) {
        if (str.contains("-")) {
            String[] strArrSplit = str.split("-", -1);
            if (strArrSplit.length > 2) {
                return new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            }
            if (strArrSplit.length > 1) {
                return new Locale(strArrSplit[0], strArrSplit[1]);
            }
            if (strArrSplit.length == 1) {
                return new Locale(strArrSplit[0]);
            }
        } else if (str.contains("_")) {
            String[] strArrSplit2 = str.split("_", -1);
            if (strArrSplit2.length > 2) {
                return new Locale(strArrSplit2[0], strArrSplit2[1], strArrSplit2[2]);
            }
            if (strArrSplit2.length > 1) {
                return new Locale(strArrSplit2[0], strArrSplit2[1]);
            }
            if (strArrSplit2.length == 1) {
                return new Locale(strArrSplit2[0]);
            }
        } else {
            return new Locale(str);
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qn) && this.a.equals(((qn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    static {
        a(new Locale[0]);
    }
}
