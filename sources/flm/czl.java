package flm;

import com.google.android.gms.common.api.Scope;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class czl {
    public static final asw b;
    private static final atf c = new atf();
    private static final atf d = new atf();
    public static final asx a = new czm();
    private static final asx e = new czn();

    static {
        new Scope("profile");
        new Scope("email");
        b = new asw("SignIn.API", a, c);
        new asw("SignIn.INTERNAL_API", e, d);
    }
}
