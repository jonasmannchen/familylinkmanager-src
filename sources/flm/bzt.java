package flm;

import android.content.Context;
import android.os.CountDownTimer;
import com.google.android.chimera.AsyncTaskLoader;
import com.google.android.gms.kids.features.timelimit.geller.MemberSvExitCooldownFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bzt extends AsyncTaskLoader {
    private Long a;
    private CountDownTimer b;

    bzt(Context context) {
        super(context);
    }

    protected final void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }

    protected final void onStopLoading() {
        super.onStopLoading();
        if (this.b != null) {
            this.b.cancel();
            this.b = null;
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void deliverResult(Long l) {
        super.deliverResult(l);
        if (l != null && l.longValue() > 0 && this.b == null && fqc.c()) {
            this.b = new bzu(this, l.longValue(), MemberSvExitCooldownFragment.a).start();
        }
    }

    public final /* synthetic */ Object loadInBackground() {
        if (!fqc.c()) {
            return Long.valueOf(fqc.d());
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.a == null) {
            this.a = Long.valueOf(fqc.d() + jCurrentTimeMillis);
        }
        return Long.valueOf(this.a.longValue() - jCurrentTimeMillis);
    }
}
