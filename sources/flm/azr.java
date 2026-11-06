package flm;

import android.content.ContentResolver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class azr implements azq {
    private final ContentResolver a;

    public azr(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    @Override // flm.azq
    public final Boolean a(String str, Boolean bool) {
        return Boolean.valueOf(dfc.a(this.a, str, bool.booleanValue()));
    }

    @Override // flm.azq
    public final Integer a(String str, Integer num) {
        return Integer.valueOf(dfc.a(this.a, str, num.intValue()));
    }

    @Override // flm.azq
    public final Long a(String str, Long l) {
        return Long.valueOf(dfc.a(this.a, str, l.longValue()));
    }

    @Override // flm.azq
    public final String a(String str, String str2) {
        return dfc.a(this.a, str, str2);
    }
}
