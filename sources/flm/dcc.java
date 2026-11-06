package flm;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dcc {
    private static final atf b = new atf();
    private static final asx c = new dcd();
    public static final asw a = new asw("Udc.API", c, b);

    public static dcn a(Context context, dce dceVar) {
        bdi.checkNotNull(dceVar, "Must provide non-null UDC options!");
        return new dcn(context, dceVar);
    }

    static {
        new dcz();
    }
}
