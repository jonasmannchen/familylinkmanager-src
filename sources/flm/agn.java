package flm;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class agn extends su {
    public final RecyclerView b;
    public final su c = new ago(this);

    public agn(RecyclerView recyclerView) {
        this.b = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0093 A[PHI: r0
  0x0093: PHI (r0v19 int) = (r0v14 int), (r0v24 int) binds: [B:27:0x0081, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // flm.su
    public final boolean a(View view, int i, Bundle bundle) {
        int iQ;
        int i2;
        int iP;
        if (super.a(view, i, bundle)) {
            return true;
        }
        if (this.b.n() || this.b.k == null) {
            return false;
        }
        afw afwVar = this.b.k;
        agf agfVar = afwVar.f.d;
        agk agkVar = afwVar.f.C;
        if (afwVar.f == null) {
            return false;
        }
        switch (i) {
            case 4096:
                iQ = afwVar.f.canScrollVertically(1) ? (afwVar.q - afwVar.q()) - afwVar.s() : 0;
                if (!afwVar.f.canScrollHorizontally(1)) {
                    i2 = iQ;
                    iP = 0;
                } else {
                    i2 = iQ;
                    iP = (afwVar.p - afwVar.p()) - afwVar.r();
                }
                break;
            case 8192:
                iQ = afwVar.f.canScrollVertically(-1) ? -((afwVar.q - afwVar.q()) - afwVar.s()) : 0;
                if (!afwVar.f.canScrollHorizontally(-1)) {
                    i2 = iQ;
                    iP = 0;
                } else {
                    i2 = iQ;
                    iP = -((afwVar.p - afwVar.p()) - afwVar.r());
                }
                break;
            default:
                iP = 0;
                i2 = 0;
                break;
        }
        if (i2 == 0 && iP == 0) {
            return false;
        }
        afwVar.f.a(iP, i2);
        return true;
    }

    @Override // flm.su
    public final void a(View view, ua uaVar) {
        super.a(view, uaVar);
        uaVar.a((CharSequence) RecyclerView.class.getName());
        if (!this.b.n() && this.b.k != null) {
            afw afwVar = this.b.k;
            agf agfVar = afwVar.f.d;
            agk agkVar = afwVar.f.C;
            if (afwVar.f.canScrollVertically(-1) || afwVar.f.canScrollHorizontally(-1)) {
                uaVar.a(8192);
                uaVar.d(true);
            }
            if (afwVar.f.canScrollVertically(1) || afwVar.f.canScrollHorizontally(1)) {
                uaVar.a(4096);
                uaVar.d(true);
            }
            ub ubVar = new ub(AccessibilityNodeInfo.CollectionInfo.obtain(afwVar.a(agfVar, agkVar), afwVar.b(agfVar, agkVar), false, 0));
            uaVar.a.setCollectionInfo(ubVar == null ? null : (AccessibilityNodeInfo.CollectionInfo) ubVar.a);
        }
    }

    @Override // flm.su
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !this.b.n()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.k != null) {
                recyclerView.k.a(accessibilityEvent);
            }
        }
    }
}
