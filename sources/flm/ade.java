package flm;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ade implements Runnable {
    private final /* synthetic */ ArrayList a;
    private final /* synthetic */ adc b;

    ade(adc adcVar, ArrayList arrayList) {
        this.b = adcVar;
        this.a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            adl adlVar = (adl) arrayList.get(i);
            adc adcVar = this.b;
            agm agmVar = adlVar.a;
            View view = agmVar == null ? null : agmVar.a;
            agm agmVar2 = adlVar.b;
            View view2 = agmVar2 != null ? agmVar2.a : null;
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(adcVar.l);
                adcVar.g.add(adlVar.a);
                duration.translationX(adlVar.e - adlVar.c);
                duration.translationY(adlVar.f - adlVar.d);
                duration.alpha(0.0f).setListener(new adj(adcVar, adlVar, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                adcVar.g.add(adlVar.b);
                viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(adcVar.l).alpha(1.0f).setListener(new adk(adcVar, adlVar, viewPropertyAnimatorAnimate, view2)).start();
            }
            i = i2;
        }
        this.a.clear();
        this.b.c.remove(this.a);
    }
}
