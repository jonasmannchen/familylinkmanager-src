package flm;

import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class qo implements qp {
    private static final Locale[] b = new Locale[0];
    private final Locale[] a;

    @Override // flm.qp
    public final Object a() {
        return null;
    }

    @Override // flm.qp
    public final Locale a(int i) {
        if (i < 0 || i >= this.a.length) {
            return null;
        }
        return this.a[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qo)) {
            return false;
        }
        Locale[] localeArr = ((qo) obj).a;
        if (this.a.length != localeArr.length) {
            return false;
        }
        for (int i = 0; i < this.a.length; i++) {
            if (!this.a[i].equals(localeArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i = 0; i < this.a.length; i++) {
            iHashCode = (iHashCode * 31) + this.a[i].hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.a.length; i++) {
            sb.append(this.a[i]);
            if (i < this.a.length - 1) {
                sb.append(',');
            }
        }
        sb.append("]");
        return sb.toString();
    }

    qo(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.a = b;
            return;
        }
        Locale[] localeArr2 = new Locale[localeArr.length];
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < localeArr.length) {
                Locale locale = localeArr[i2];
                if (locale == null) {
                    throw new NullPointerException("list[" + i2 + "] is null");
                }
                if (hashSet.contains(locale)) {
                    throw new IllegalArgumentException("list[" + i2 + "] is a repetition");
                }
                Locale locale2 = (Locale) locale.clone();
                localeArr2[i2] = locale2;
                sb.append(locale2.getLanguage());
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    sb.append('-');
                    sb.append(locale2.getCountry());
                }
                if (i2 < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
                i = i2 + 1;
            } else {
                this.a = localeArr2;
                return;
            }
        }
    }

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        qn.a("en-Latn");
    }
}
