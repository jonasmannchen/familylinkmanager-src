package flm;

import android.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nc implements Transition.TransitionListener {
    private final /* synthetic */ Object a;
    private final /* synthetic */ ArrayList b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ ArrayList d;
    private final /* synthetic */ Object e;
    private final /* synthetic */ ArrayList f;
    private final /* synthetic */ mz g;

    nc(mz mzVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.g = mzVar;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
        this.e = obj3;
        this.f = arrayList3;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        if (this.a != null) {
            this.g.b(this.a, this.b, (ArrayList) null);
        }
        if (this.c != null) {
            this.g.b(this.c, this.d, (ArrayList) null);
        }
        if (this.e != null) {
            this.g.b(this.e, this.f, (ArrayList) null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}
