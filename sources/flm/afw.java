package flm;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class afw {
    public acw e;
    public RecyclerView f;
    public int l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;
    private final ahy a = new afx(this);
    private final ahy b = new afy(this);
    public ahw g = new ahw(this.a);
    public ahw h = new ahw(this.b);
    public boolean i = false;
    private boolean c = false;
    public boolean j = true;
    public boolean k = true;

    public abstract aga e();

    public final void a(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f = null;
            this.e = null;
            this.p = 0;
            this.q = 0;
        } else {
            this.f = recyclerView;
            this.e = recyclerView.f;
            this.p = recyclerView.getWidth();
            this.q = recyclerView.getHeight();
        }
        this.n = 1073741824;
        this.o = 1073741824;
    }

    public final void a(int i, int i2) {
        this.p = View.MeasureSpec.getSize(i);
        this.n = View.MeasureSpec.getMode(i);
        if (this.n == 0 && !RecyclerView.b) {
            this.p = 0;
        }
        this.q = View.MeasureSpec.getSize(i2);
        this.o = View.MeasureSpec.getMode(i2);
        if (this.o == 0 && !RecyclerView.b) {
            this.q = 0;
        }
    }

    public final void b(int i, int i2) {
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        int iO = o();
        if (iO == 0) {
            this.f.c(i, i2);
            return;
        }
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iO; i7++) {
            View viewE = e(i7);
            Rect rect = this.f.h;
            RecyclerView.a(viewE, rect);
            if (rect.left < i6) {
                i6 = rect.left;
            }
            if (rect.right > i5) {
                i5 = rect.right;
            }
            if (rect.top < i3) {
                i3 = rect.top;
            }
            if (rect.bottom > i4) {
                i4 = rect.bottom;
            }
        }
        this.f.h.set(i6, i3, i5, i4);
        a(this.f.h, i, i2);
    }

    public void a(Rect rect, int i, int i2) {
        d(a(i, rect.width() + p() + r(), ti.j(this.f)), a(i2, rect.height() + q() + s(), ti.k(this.f)));
    }

    public final void n() {
        if (this.f != null) {
            this.f.requestLayout();
        }
    }

    public static int a(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        switch (mode) {
            case Integer.MIN_VALUE:
                return Math.min(size, Math.max(i2, i3));
            case 1073741824:
                return size;
            default:
                return Math.max(i2, i3);
        }
    }

    public void a(String str) {
        if (this.f != null) {
            this.f.a(str);
        }
    }

    public boolean g() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public void a(int i, int i2, agk agkVar, afz afzVar) {
    }

    public void a(int i, afz afzVar) {
    }

    public void a(RecyclerView recyclerView, agf agfVar) {
    }

    public void c(agf agfVar, agk agkVar) {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    public void a(agk agkVar) {
    }

    public boolean a(aga agaVar) {
        return agaVar != null;
    }

    public aga a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof aga) {
            return new aga((aga) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new aga((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new aga(layoutParams);
    }

    public aga a(Context context, AttributeSet attributeSet) {
        return new aga(context, attributeSet);
    }

    public int a(int i, agf agfVar, agk agkVar) {
        return 0;
    }

    public int b(int i, agf agfVar, agk agkVar) {
        return 0;
    }

    public boolean i() {
        return false;
    }

    public boolean j() {
        return false;
    }

    final void a(View view, int i, boolean z) {
        agm agmVarC = RecyclerView.c(view);
        if (z || agmVarC.m()) {
            this.f.g.b(agmVarC);
        } else {
            this.f.g.c(agmVarC);
        }
        aga agaVar = (aga) view.getLayoutParams();
        if (agmVarC.g() || agmVarC.e()) {
            if (agmVarC.e()) {
                agmVarC.f();
            } else {
                agmVarC.h();
            }
            this.e.a(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.f) {
            int iC = this.e.c(view);
            if (i == -1) {
                i = this.e.a();
            }
            if (iC == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f.indexOfChild(view) + this.f.a());
            }
            if (iC != i) {
                afw afwVar = this.f.k;
                View viewE = afwVar.e(iC);
                if (viewE == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iC + afwVar.f.toString());
                }
                afwVar.d(iC);
                aga agaVar2 = (aga) viewE.getLayoutParams();
                agm agmVarC2 = RecyclerView.c(viewE);
                if (agmVarC2.m()) {
                    afwVar.f.g.b(agmVarC2);
                } else {
                    afwVar.f.g.c(agmVarC2);
                }
                afwVar.e.a(viewE, i, agaVar2, agmVarC2.m());
            }
        } else {
            this.e.a(view, i, false);
            agaVar.e = true;
        }
        if (agaVar.f) {
            agmVarC.a.invalidate();
            agaVar.f = false;
        }
    }

    public final void c(int i) {
        acw acwVar;
        int iA;
        View viewB;
        if (e(i) != null && (viewB = acwVar.a.b((iA = (acwVar = this.e).a(i)))) != null) {
            if (acwVar.b.d(iA)) {
                acwVar.b(viewB);
            }
            acwVar.a.a(iA);
        }
    }

    public static int a(View view) {
        return ((aga) view.getLayoutParams()).c.c();
    }

    public View a(int i) {
        int iO = o();
        for (int i2 = 0; i2 < iO; i2++) {
            View viewE = e(i2);
            agm agmVarC = RecyclerView.c(viewE);
            if (agmVarC != null && agmVarC.c() == i && !agmVarC.b() && (this.f.C.g || !agmVarC.m())) {
                return viewE;
            }
        }
        return null;
    }

    public final void d(int i) {
        e(i);
        this.e.d(i);
    }

    public final void a(int i, agf agfVar) {
        View viewE = e(i);
        c(i);
        agfVar.a(viewE);
    }

    public final int o() {
        if (this.e != null) {
            return this.e.a();
        }
        return 0;
    }

    public final View e(int i) {
        if (this.e != null) {
            return this.e.b(i);
        }
        return null;
    }

    public final int p() {
        if (this.f != null) {
            return this.f.getPaddingLeft();
        }
        return 0;
    }

    public final int q() {
        if (this.f != null) {
            return this.f.getPaddingTop();
        }
        return 0;
    }

    public final int r() {
        if (this.f != null) {
            return this.f.getPaddingRight();
        }
        return 0;
    }

    public final int s() {
        if (this.f != null) {
            return this.f.getPaddingBottom();
        }
        return 0;
    }

    public final View t() {
        View focusedChild;
        if (this.f == null || (focusedChild = this.f.getFocusedChild()) == null || this.e.d(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public final void a(agf agfVar) {
        int size = agfVar.a.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((agm) agfVar.a.get(i)).a;
            agm agmVarC = RecyclerView.c(view);
            if (!agmVarC.b()) {
                agmVarC.a(false);
                if (agmVarC.n()) {
                    this.f.removeDetachedView(view, false);
                }
                if (this.f.y != null) {
                    this.f.y.c(agmVarC);
                }
                agmVarC.a(true);
                agfVar.b(view);
            }
        }
        agfVar.a.clear();
        if (agfVar.b != null) {
            agfVar.b.clear();
        }
        if (size > 0) {
            this.f.invalidate();
        }
    }

    final boolean a(View view, int i, int i2, aga agaVar) {
        return (!view.isLayoutRequested() && this.j && b(view.getWidth(), i, agaVar.width) && b(view.getHeight(), i2, agaVar.height)) ? false : true;
    }

    static boolean b(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        switch (mode) {
            case Integer.MIN_VALUE:
                return size >= i;
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return true;
            case 1073741824:
                return size == i;
            default:
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    public static int a(int i, int i2, int i3, int i4, boolean z) {
        int i5 = 0;
        int iMax = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i2 = 1073741824;
                i5 = i4;
            } else if (i4 == -1) {
                switch (i2) {
                    case Integer.MIN_VALUE:
                    case 1073741824:
                        i5 = iMax;
                        break;
                    case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    default:
                        i2 = 0;
                        break;
                }
            } else if (i4 == -2) {
                i2 = 0;
            } else {
                i2 = 0;
            }
        } else if (i4 >= 0) {
            i2 = 1073741824;
            i5 = i4;
        } else if (i4 == -1) {
            i5 = iMax;
        } else if (i4 != -2) {
            i2 = 0;
        } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
            i2 = Integer.MIN_VALUE;
            i5 = iMax;
        } else {
            i2 = 0;
            i5 = iMax;
        }
        return View.MeasureSpec.makeMeasureSpec(i5, i2);
    }

    public static int b(View view) {
        Rect rect = ((aga) view.getLayoutParams()).d;
        return rect.right + view.getMeasuredWidth() + rect.left;
    }

    public static int c(View view) {
        Rect rect = ((aga) view.getLayoutParams()).d;
        return rect.bottom + view.getMeasuredHeight() + rect.top;
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        aga agaVar = (aga) view.getLayoutParams();
        Rect rect = agaVar.d;
        view.layout(rect.left + i + agaVar.leftMargin, rect.top + i2 + agaVar.topMargin, (i3 - rect.right) - agaVar.rightMargin, (i4 - rect.bottom) - agaVar.bottomMargin);
    }

    public final void a(View view, boolean z, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((aga) view.getLayoutParams()).d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, rect2.bottom + view.getHeight());
        if (this.f != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f.i;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final int d(View view) {
        return view.getLeft() - ((aga) view.getLayoutParams()).d.left;
    }

    public final int e(View view) {
        return view.getTop() - ((aga) view.getLayoutParams()).d.top;
    }

    public final int f(View view) {
        return ((aga) view.getLayoutParams()).d.right + view.getRight();
    }

    public final int g(View view) {
        return ((aga) view.getLayoutParams()).d.bottom + view.getBottom();
    }

    public View a(View view, int i, agf agfVar, agk agkVar) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0087  */
    /* JADX WARN: Code duplicated, block: B:17:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e1  */
    public final boolean a(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int iMin;
        boolean z3;
        int[] iArr = new int[2];
        int iP = p();
        int iQ = q();
        int iR = this.p - r();
        int iS = this.q - s();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = left + rect.width();
        int iHeight = top + rect.height();
        int iMin2 = Math.min(0, left - iP);
        int iMin3 = Math.min(0, top - iQ);
        int iMax = Math.max(0, iWidth - iR);
        int iMax2 = Math.max(0, iHeight - iS);
        if (ti.f(this.f) == 1) {
            if (iMax == 0) {
                iMax = Math.max(iMin2, iWidth - iR);
            }
            iMin = iMax;
        } else {
            iMin = iMin2 != 0 ? iMin2 : Math.min(left - iP, iMax);
        }
        int iMin4 = iMin3 != 0 ? iMin3 : Math.min(top - iQ, iMax2);
        iArr[0] = iMin;
        iArr[1] = iMin4;
        int i = iArr[0];
        int i2 = iArr[1];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                z3 = false;
            } else {
                int iP2 = p();
                int iQ2 = q();
                int iR2 = this.p - r();
                int iS2 = this.q - s();
                Rect rect2 = this.f.h;
                RecyclerView.a(focusedChild, rect2);
                if (rect2.left - i >= iR2 || rect2.right - i <= iP2 || rect2.top - i2 >= iS2 || rect2.bottom - i2 <= iQ2) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            }
            if (z3) {
                if (i == 0) {
                }
                if (z) {
                    recyclerView.scrollBy(i, i2);
                } else {
                    recyclerView.a(i, i2);
                }
                return true;
            }
        } else if (i == 0 || i2 != 0) {
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.a(i, i2);
            }
            return true;
        }
        return false;
    }

    public void b() {
    }

    public void a() {
    }

    public void c() {
    }

    public void a(RecyclerView recyclerView, int i, int i2) {
    }

    public void d() {
    }

    public int d(agk agkVar) {
        return 0;
    }

    public int b(agk agkVar) {
        return 0;
    }

    public int f(agk agkVar) {
        return 0;
    }

    public int e(agk agkVar) {
        return 0;
    }

    public int c(agk agkVar) {
        return 0;
    }

    public int g(agk agkVar) {
        return 0;
    }

    public final void c(int i, int i2) {
        this.f.c(i, i2);
    }

    public final void d(int i, int i2) {
        this.f.setMeasuredDimension(i, i2);
    }

    public Parcelable h() {
        return null;
    }

    public void a(Parcelable parcelable) {
    }

    public final void b(agf agfVar) {
        for (int iO = o() - 1; iO >= 0; iO--) {
            if (!RecyclerView.c(e(iO)).b()) {
                a(iO, agfVar);
            }
        }
    }

    public void a(AccessibilityEvent accessibilityEvent) {
        boolean z = true;
        agf agfVar = this.f.d;
        agk agkVar = this.f.C;
        if (this.f != null && accessibilityEvent != null) {
            if (!this.f.canScrollVertically(1) && !this.f.canScrollVertically(-1) && !this.f.canScrollHorizontally(-1) && !this.f.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            if (this.f.j != null) {
                accessibilityEvent.setItemCount(this.f.j.a());
            }
        }
    }

    final void a(View view, ua uaVar) {
        agm agmVarC = RecyclerView.c(view);
        if (agmVarC != null && !agmVarC.m() && !this.e.d(agmVarC.a)) {
            a(this.f.d, this.f.C, view, uaVar);
        }
    }

    public void a(agf agfVar, agk agkVar, View view, ua uaVar) {
        uaVar.a(uc.a(j() ? a(view) : 0, 1, i() ? a(view) : 0, 1, false, false));
    }

    public int a(agf agfVar, agk agkVar) {
        if (this.f == null || this.f.j == null || !j()) {
            return 1;
        }
        return this.f.j.a();
    }

    public int b(agf agfVar, agk agkVar) {
        if (this.f == null || this.f.j == null || !i()) {
            return 1;
        }
        return this.f.j.a();
    }

    public final void b(RecyclerView recyclerView) {
        a(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public boolean m() {
        return false;
    }
}
