package flm;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bmw {
    public static final asw a;
    private static final atf b;
    private static final asx c;

    public static bna a(Context context) {
        return new bna(context);
    }

    @Deprecated
    public static att a(atp atpVar, bnc bncVar) {
        return atpVar.a(new bmy(atpVar, bncVar));
    }

    static {
        new Status(13);
        b = new atf();
        c = new bmx();
        a = new asw("Feedback.API", c, b);
    }
}
