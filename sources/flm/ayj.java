package flm;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ayj {
    public static void a(Status status, Object obj, dbk dbkVar) {
        if (status.a()) {
            dbkVar.a(obj);
        } else {
            dbkVar.a((Exception) new atj(status));
        }
    }
}
