package flm;

import android.content.Context;
import com.google.android.gms.googlehelp.GoogleHelp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class brx implements bry {
    brx() {
    }

    @Override // flm.bry
    public final Thread a(Runnable runnable) {
        return new Thread(runnable, "PsdCollector");
    }

    @Override // flm.bry
    public final bqy a(GoogleHelp googleHelp, bql bqlVar, bra braVar) {
        return new bqy(googleHelp, bqlVar, braVar);
    }

    @Override // flm.bry
    public final bqx a(Context context, GoogleHelp googleHelp, bql bqlVar, long j) {
        return new bqx(context, googleHelp, bqlVar, j);
    }

    @Override // flm.bry
    public final bqw a(Context context, GoogleHelp googleHelp, bmt bmtVar, long j) {
        return new bqw(context, googleHelp, bmtVar, j);
    }

    @Override // flm.bry
    public final bqv b(Context context, GoogleHelp googleHelp, bmt bmtVar, long j) {
        return new bqv(context, googleHelp, bmtVar, j);
    }
}
