package flm;

import android.graphics.Rect;
import android.transition.Transition;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class na extends Transition.EpicenterCallback {
    private final /* synthetic */ Rect a;

    na(mz mzVar, Rect rect) {
        this.a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        return this.a;
    }
}
