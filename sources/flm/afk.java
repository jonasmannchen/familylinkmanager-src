package flm;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class afk implements acy {
    private final /* synthetic */ RecyclerView a;

    public afk(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // flm.acy
    public final int a() {
        return this.a.getChildCount();
    }

    @Override // flm.acy
    public final void a(View view, int i) {
        this.a.addView(view, i);
        RecyclerView recyclerView = this.a;
        RecyclerView.c(view);
    }

    @Override // flm.acy
    public final int a(View view) {
        return this.a.indexOfChild(view);
    }

    @Override // flm.acy
    public final void a(int i) {
        View childAt = this.a.getChildAt(i);
        if (childAt != null) {
            RecyclerView recyclerView = this.a;
            RecyclerView.c(childAt);
            childAt.clearAnimation();
        }
        this.a.removeViewAt(i);
    }

    @Override // flm.acy
    public final View b(int i) {
        return this.a.getChildAt(i);
    }

    @Override // flm.acy
    public final void b() {
        int childCount = this.a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewB = b(i);
            RecyclerView recyclerView = this.a;
            RecyclerView.c(viewB);
            viewB.clearAnimation();
        }
        this.a.removeAllViews();
    }

    @Override // flm.acy
    public final agm b(View view) {
        return RecyclerView.c(view);
    }

    @Override // flm.acy
    public final void a(View view, int i, ViewGroup.LayoutParams layoutParams) {
        agm agmVarC = RecyclerView.c(view);
        if (agmVarC != null) {
            if (!agmVarC.n() && !agmVarC.b()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + agmVarC + this.a.a());
            }
            agmVarC.i();
        }
        this.a.attachViewToParent(view, i, layoutParams);
    }

    @Override // flm.acy
    public final void c(int i) {
        agm agmVarC;
        View viewB = b(i);
        if (viewB != null && (agmVarC = RecyclerView.c(viewB)) != null) {
            if (agmVarC.n() && !agmVarC.b()) {
                throw new IllegalArgumentException("called detach on an already detached child " + agmVarC + this.a.a());
            }
            agmVarC.b(256);
        }
        this.a.detachViewFromParent(i);
    }

    @Override // flm.acy
    public final void c(View view) {
        agm agmVarC = RecyclerView.c(view);
        if (agmVarC != null) {
            RecyclerView recyclerView = this.a;
            if (agmVarC.n != -1) {
                agmVarC.m = agmVarC.n;
            } else {
                agmVarC.m = ti.e(agmVarC.a);
            }
            recyclerView.a(agmVarC, 4);
        }
    }

    @Override // flm.acy
    public final void d(View view) {
        agm agmVarC = RecyclerView.c(view);
        if (agmVarC != null) {
            this.a.a(agmVarC, agmVarC.m);
            agmVarC.m = 0;
        }
    }
}
