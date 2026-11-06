package flm;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ajl extends afm {
    public View c;
    private final afm d;
    private final afo e = new ajm(this);

    public ajl(afm afmVar) {
        this.d = afmVar;
        this.d.a(this.e);
        boolean z = this.d.b;
        if (this.a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.b = z;
    }

    @Override // flm.afm
    public final agm a(ViewGroup viewGroup, int i) {
        if (i != Integer.MAX_VALUE) {
            return this.d.a(viewGroup, i);
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return new ajn(frameLayout);
    }

    @Override // flm.afm
    public final void a(agm agmVar, int i) {
        if (this.c != null) {
            i--;
        }
        if (agmVar instanceof ajn) {
            if (this.c == null) {
                throw new IllegalStateException("HeaderViewHolder cannot find mHeader");
            }
            if (this.c.getParent() != null) {
                ((ViewGroup) this.c.getParent()).removeView(this.c);
            }
            ((FrameLayout) agmVar.a).addView(this.c);
            return;
        }
        this.d.a(agmVar, i);
    }

    @Override // flm.afm
    public final int a(int i) {
        if (this.c != null) {
            i--;
        }
        if (i < 0) {
            return Integer.MAX_VALUE;
        }
        return this.d.a(i);
    }

    @Override // flm.afm
    public final int a() {
        int iA = this.d.a();
        if (this.c != null) {
            return iA + 1;
        }
        return iA;
    }

    @Override // flm.afm
    public final long b(int i) {
        if (this.c != null) {
            i--;
        }
        if (i < 0) {
            return Long.MAX_VALUE;
        }
        return this.d.b(i);
    }
}
