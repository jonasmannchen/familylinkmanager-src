package flm;

import android.os.IBinder;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.lang.ref.WeakReference;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ayq implements IBinder.DeathRecipient, ayr {
    private final WeakReference a;
    private final WeakReference b;
    private final WeakReference c;

    ayq(BasePendingResult basePendingResult, aub aubVar, IBinder iBinder) {
        this.b = new WeakReference(aubVar);
        this.a = new WeakReference(basePendingResult);
        this.c = new WeakReference(iBinder);
    }

    @Override // flm.ayr
    public final void a(BasePendingResult basePendingResult) {
        a();
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        a();
    }

    private final void a() {
        BasePendingResult basePendingResult = (BasePendingResult) this.a.get();
        aub aubVar = (aub) this.b.get();
        if (aubVar != null && basePendingResult != null) {
            basePendingResult.getResultId().intValue();
            aubVar.b();
        }
        IBinder iBinder = (IBinder) this.c.get();
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this, 0);
            } catch (NoSuchElementException e) {
            }
        }
    }
}
