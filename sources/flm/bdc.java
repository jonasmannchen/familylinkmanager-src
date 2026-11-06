package flm;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bdc implements atu {
    public final /* synthetic */ att val$pendingResult;
    public final /* synthetic */ bdf val$resultConverter;
    public final /* synthetic */ dbk val$source;
    public final /* synthetic */ bdg val$statusConverter;

    bdc(att attVar, dbk dbkVar, bdf bdfVar, bdg bdgVar) {
        this.val$pendingResult = attVar;
        this.val$source = dbkVar;
        this.val$resultConverter = bdfVar;
        this.val$statusConverter = bdgVar;
    }

    @Override // flm.atu
    public final void onComplete(Status status) {
        if (!status.a()) {
            this.val$source.a((Exception) this.val$statusConverter.convert(status));
        } else {
            this.val$source.a(this.val$resultConverter.convert(this.val$pendingResult.await(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
