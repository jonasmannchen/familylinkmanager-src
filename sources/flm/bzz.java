package flm;

import android.os.CountDownTimer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bzz extends CountDownTimer {
    private final /* synthetic */ bzg a;
    private final /* synthetic */ bzx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bzz(bzx bzxVar, long j, long j2, bzg bzgVar) {
        super(j, j2);
        this.b = bzxVar;
        this.a = bzgVar;
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        bzx bzxVar = this.b;
        bzg bzgVar = this.a;
        fio fioVar = (fio) bzgVar.a(dp.au, (Object) null);
        fioVar.a((fin) bzgVar);
        bzxVar.deliverResult((bzg) ((fin) ((bzh) fioVar).a(j).h()));
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        bzx bzxVar = this.b;
        bzg bzgVar = this.a;
        fio fioVar = (fio) bzgVar.a(dp.au, (Object) null);
        fioVar.a((fin) bzgVar);
        bzxVar.deliverResult((bzg) ((fin) ((bzh) fioVar).a(0L).h()));
    }
}
