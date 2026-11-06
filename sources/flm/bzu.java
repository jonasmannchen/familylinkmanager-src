package flm;

import android.os.CountDownTimer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bzu extends CountDownTimer {
    private final /* synthetic */ bzt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bzu(bzt bztVar, long j, long j2) {
        super(j, j2);
        this.a = bztVar;
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        this.a.deliverResult(Long.valueOf(j));
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.a.deliverResult(0L);
    }
}
