package flm;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class adf implements Runnable {
    private final /* synthetic */ ArrayList a;
    private final /* synthetic */ adc b;

    adf(adc adcVar, ArrayList arrayList) {
        this.b = adcVar;
        this.a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            agm agmVar = (agm) obj;
            adc adcVar = this.b;
            View view = agmVar.a;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            adcVar.d.add(agmVar);
            viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(adcVar.i).setListener(new adh(adcVar, agmVar, view, viewPropertyAnimatorAnimate)).start();
        }
        this.a.clear();
        this.b.a.remove(this.a);
    }
}
