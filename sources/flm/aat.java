package flm;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimeraresources.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aat extends yw implements sx {
    public aax f;
    public int g;
    public boolean h;
    public aaz i;
    public aau j;
    public aaw k;
    public final aba l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private final SparseBooleanArray r;
    private View s;
    private aav t;

    public aat(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
        this.r = new SparseBooleanArray();
        this.l = new aba(this);
    }

    @Override // flm.yw, flm.zy
    public final void a(Context context, zi ziVar) {
        super.a(context, ziVar);
        Resources resources = context.getResources();
        yf yfVarA = yf.a(context);
        if (!this.n) {
            this.m = true;
        }
        this.o = yfVarA.a.getResources().getDisplayMetrics().widthPixels / 2;
        this.g = yfVarA.a();
        int measuredWidth = this.o;
        if (this.m) {
            if (this.f == null) {
                this.f = new aax(this, this.a);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f.getMeasuredWidth();
        } else {
            this.f = null;
        }
        this.p = measuredWidth;
        this.q = (int) (56.0f * resources.getDisplayMetrics().density);
        this.s = null;
    }

    public final void b(boolean z) {
        this.m = true;
        this.n = true;
    }

    @Override // flm.yw
    public final aaa a(ViewGroup viewGroup) {
        aaa aaaVar = this.e;
        aaa aaaVarA = super.a(viewGroup);
        if (aaaVar != aaaVarA) {
            ((ActionMenuView) aaaVarA).a(this);
        }
        return aaaVarA;
    }

    @Override // flm.yw
    public final View a(zm zmVar, View view, ViewGroup viewGroup) {
        View actionView = zmVar.getActionView();
        if (actionView == null || zmVar.i()) {
            actionView = super.a(zmVar, view, viewGroup);
        }
        actionView.setVisibility(zmVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // flm.yw
    public final void a(zm zmVar, aab aabVar) {
        aabVar.a(zmVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aabVar;
        actionMenuItemView.c = (ActionMenuView) this.e;
        if (this.t == null) {
            this.t = new aav(this);
        }
        actionMenuItemView.d = this.t;
    }

    @Override // flm.yw
    public final boolean a(zm zmVar) {
        return zmVar.f();
    }

    @Override // flm.yw, flm.zy
    public final void a(boolean z) {
        boolean z2 = false;
        super.a(z);
        ((View) this.e).requestLayout();
        if (this.c != null) {
            zi ziVar = this.c;
            ziVar.j();
            ArrayList arrayList = ziVar.d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                sw swVar = ((zm) arrayList.get(i)).f;
                if (swVar != null) {
                    swVar.a = this;
                }
            }
        }
        ArrayList arrayListK = this.c != null ? this.c.k() : null;
        if (this.m && arrayListK != null) {
            int size2 = arrayListK.size();
            if (size2 == 1) {
                z2 = !((zm) arrayListK.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f == null) {
                this.f = new aax(this, this.a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f.getParent();
            if (viewGroup != this.e) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.e;
                aax aaxVar = this.f;
                abd abdVarA = ActionMenuView.a();
                abdVarA.a = true;
                actionMenuView.addView(aaxVar, abdVarA);
            }
        } else if (this.f != null && this.f.getParent() == this.e) {
            ((ViewGroup) this.e).removeView(this.f);
        }
        ((ActionMenuView) this.e).b = this.m;
    }

    @Override // flm.yw
    public final boolean a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f) {
            return false;
        }
        return super.a(viewGroup, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // flm.yw, flm.zy
    public final boolean a(aai aaiVar) {
        View childAt;
        boolean z;
        if (!aaiVar.hasVisibleItems()) {
            return false;
        }
        aai aaiVar2 = aaiVar;
        while (aaiVar2.k != this.c) {
            aaiVar2 = (aai) aaiVar2.k;
        }
        MenuItem item = aaiVar2.getItem();
        ViewGroup viewGroup = (ViewGroup) this.e;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    childAt = 0;
                    break;
                }
                childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof aab) && ((aab) childAt).a() == item) {
                    break;
                }
                i++;
            }
        } else {
            childAt = 0;
        }
        if (childAt == 0) {
            return false;
        }
        aaiVar.getItem().getItemId();
        int size = aaiVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = false;
                break;
            }
            MenuItem item2 = aaiVar.getItem(i2);
            if (item2.isVisible() && item2.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        this.j = new aau(this, this.b, aaiVar, childAt);
        this.j.a(z);
        if (!this.j.b()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        super.a(aaiVar);
        return true;
    }

    public final boolean b() {
        if (!this.m || f() || this.c == null || this.e == null || this.k != null || this.c.k().isEmpty()) {
            return false;
        }
        this.k = new aaw(this, new aaz(this, this.b, this.c, this.f, true));
        ((View) this.e).post(this.k);
        super.a((aai) null);
        return true;
    }

    public final boolean c() {
        if (this.k != null && this.e != null) {
            ((View) this.e).removeCallbacks(this.k);
            this.k = null;
            return true;
        }
        aaz aazVar = this.i;
        if (aazVar != null) {
            aazVar.c();
            return true;
        }
        return false;
    }

    public final boolean d() {
        return c() | e();
    }

    public final boolean e() {
        if (this.j == null) {
            return false;
        }
        this.j.c();
        return true;
    }

    public final boolean f() {
        return this.i != null && this.i.e();
    }

    @Override // flm.yw, flm.zy
    public final boolean a() {
        int size;
        ArrayList arrayList;
        int measuredWidth;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        if (this.c != null) {
            ArrayList arrayListI = this.c.i();
            size = arrayListI.size();
            arrayList = arrayListI;
        } else {
            size = 0;
            arrayList = null;
        }
        int i6 = this.g;
        int i7 = this.p;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.e;
        int i8 = 0;
        int i9 = 0;
        boolean z2 = false;
        int i10 = 0;
        while (i10 < size) {
            zm zmVar = (zm) arrayList.get(i10);
            if (zmVar.h()) {
                i8++;
            } else if (zmVar.g()) {
                i9++;
            } else {
                z2 = true;
            }
            i10++;
            i6 = (this.h && zmVar.isActionViewExpanded()) ? 0 : i6;
        }
        if (this.m && (z2 || i8 + i9 > i6)) {
            i6--;
        }
        int i11 = i6 - i8;
        SparseBooleanArray sparseBooleanArray = this.r;
        sparseBooleanArray.clear();
        int i12 = 0;
        int i13 = i7;
        int i14 = i11;
        int i15 = 0;
        while (i12 < size) {
            zm zmVar2 = (zm) arrayList.get(i12);
            if (zmVar2.h()) {
                View viewA = a(zmVar2, this.s, viewGroup);
                if (this.s == null) {
                    this.s = viewA;
                }
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                measuredWidth = viewA.getMeasuredWidth();
                int i16 = i13 - measuredWidth;
                if (i15 != 0) {
                    measuredWidth = i15;
                }
                int groupId = zmVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                zmVar2.d(true);
                i = i16;
                i2 = i14;
            } else if (zmVar2.g()) {
                int groupId2 = zmVar2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i14 > 0 || z3) && i13 > 0;
                if (z4) {
                    View viewA2 = a(zmVar2, this.s, viewGroup);
                    if (this.s == null) {
                        this.s = viewA2;
                    }
                    viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    int i17 = i13 - measuredWidth2;
                    i4 = i15 == 0 ? measuredWidth2 : i15;
                    boolean z5 = (i17 + i4 > 0) & z4;
                    i3 = i17;
                    z = z5;
                } else {
                    z = z4;
                    i3 = i13;
                    i4 = i15;
                }
                if (z && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                    i5 = i14;
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    int i18 = i14;
                    for (int i19 = 0; i19 < i12; i19++) {
                        zm zmVar3 = (zm) arrayList.get(i19);
                        if (zmVar3.getGroupId() == groupId2) {
                            if (zmVar3.f()) {
                                i18++;
                            }
                            zmVar3.d(false);
                        }
                    }
                    i5 = i18;
                } else {
                    i5 = i14;
                }
                if (z) {
                    i5--;
                }
                zmVar2.d(z);
                i = i3;
                i2 = i5;
                measuredWidth = i4;
            } else {
                zmVar2.d(false);
                measuredWidth = i15;
                i = i13;
                i2 = i14;
            }
            i12++;
            i14 = i2;
            i13 = i;
            i15 = measuredWidth;
        }
        return true;
    }

    @Override // flm.yw, flm.zy
    public final void a(zi ziVar, boolean z) {
        d();
        super.a(ziVar, z);
    }

    public final void a(ActionMenuView actionMenuView) {
        this.e = actionMenuView;
        actionMenuView.a = this.c;
    }
}
