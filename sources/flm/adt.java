package flm;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class adt extends agc {
    private final /* synthetic */ adr a;

    adt(adr adrVar) {
        this.a = adrVar;
    }

    @Override // flm.agc
    public final void a(RecyclerView recyclerView) {
        adr adrVar = this.a;
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int iComputeVerticalScrollRange = adrVar.j.computeVerticalScrollRange();
        int i = adrVar.i;
        adrVar.k = iComputeVerticalScrollRange - i > 0 && adrVar.i >= adrVar.a;
        int iComputeHorizontalScrollRange = adrVar.j.computeHorizontalScrollRange();
        int i2 = adrVar.h;
        adrVar.l = iComputeHorizontalScrollRange - i2 > 0 && adrVar.h >= adrVar.a;
        if (!adrVar.k && !adrVar.l) {
            if (adrVar.m != 0) {
                adrVar.a(0);
                return;
            }
            return;
        }
        if (adrVar.k) {
            adrVar.e = (int) (((iComputeVerticalScrollOffset + (i / 2.0f)) * i) / iComputeVerticalScrollRange);
            adrVar.d = Math.min(i, (i * i) / iComputeVerticalScrollRange);
        }
        if (adrVar.l) {
            adrVar.g = (int) (((iComputeHorizontalScrollOffset + (i2 / 2.0f)) * i2) / iComputeHorizontalScrollRange);
            adrVar.f = Math.min(i2, (i2 * i2) / iComputeHorizontalScrollRange);
        }
        if (adrVar.m == 0 || adrVar.m == 1) {
            adrVar.a(1);
        }
    }
}
