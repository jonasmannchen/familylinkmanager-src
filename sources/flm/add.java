package flm;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class add implements Runnable {
    private final /* synthetic */ ArrayList a;
    private final /* synthetic */ adc b;

    add(adc adcVar, ArrayList arrayList) {
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
            adm admVar = (adm) arrayList.get(i);
            adc adcVar = this.b;
            agm agmVar = admVar.a;
            int i3 = admVar.b;
            int i4 = admVar.c;
            int i5 = admVar.d;
            int i6 = admVar.e;
            View view = agmVar.a;
            int i7 = i5 - i3;
            int i8 = i6 - i4;
            if (i7 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i8 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            adcVar.e.add(agmVar);
            viewPropertyAnimatorAnimate.setDuration(adcVar.k).setListener(new adi(adcVar, agmVar, i7, view, i8, viewPropertyAnimatorAnimate)).start();
            i = i2;
        }
        this.a.clear();
        this.b.b.remove(this.a);
    }
}
