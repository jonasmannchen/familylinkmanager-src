package flm;

import com.google.android.gms.gcm.OneoffTask;
import com.google.android.gms.gcm.Task;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bqa extends bqi {
    public long a = -1;
    public long b = -1;

    public bqa() {
        this.g = false;
    }

    @Override // flm.bqi
    protected final void a() {
        super.a();
        if (this.a == -1 || this.b == -1) {
            throw new IllegalArgumentException("Must specify an execution window using setExecutionWindow.");
        }
        if (this.a >= this.b) {
            throw new IllegalArgumentException("Window start must be shorter than window end.");
        }
    }

    @Override // flm.bqi
    public final /* synthetic */ Task b() {
        a();
        return new OneoffTask(this);
    }
}
