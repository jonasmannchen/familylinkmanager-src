package flm;

import com.google.android.gms.gcm.PeriodicTask;
import com.google.android.gms.gcm.Task;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bqd extends bqi {
    public long a = -1;
    public long b = -1;

    public bqd() {
        this.g = true;
    }

    @Override // flm.bqi
    protected final void a() {
        super.a();
        if (this.a == -1) {
            throw new IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
        }
        if (this.a <= 0) {
            throw new IllegalArgumentException(new StringBuilder(66).append("Period set cannot be less than or equal to 0: ").append(this.a).toString());
        }
        if (this.b == -1) {
            this.b = (long) (this.a * 0.1f);
        } else if (this.b > this.a) {
            this.b = this.a;
        }
    }

    @Override // flm.bqi
    public final /* synthetic */ Task b() {
        a();
        return new PeriodicTask(this);
    }
}
