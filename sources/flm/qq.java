package flm;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class qq implements qp {
    private final LocaleList a;

    qq(LocaleList localeList) {
        this.a = localeList;
    }

    @Override // flm.qp
    public final Object a() {
        return this.a;
    }

    @Override // flm.qp
    public final Locale a(int i) {
        return this.a.get(i);
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((qp) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
