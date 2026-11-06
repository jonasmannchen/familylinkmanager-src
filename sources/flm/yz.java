package flm;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.chimeraresources.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class yz extends zv implements View.OnKeyListener, PopupWindow.OnDismissListener, zy {
    private static final int h = R.layout.abc_cascading_menu_item_layout;
    private zz A;
    private PopupWindow.OnDismissListener B;
    public final Handler a;
    public View d;
    public ViewTreeObserver e;
    public boolean f;
    private final Context i;
    private final int j;
    private final int k;
    private final int l;
    private final boolean m;
    private View s;
    private boolean u;
    private boolean v;
    private int w;
    private int x;
    private boolean z;
    private final List n = new ArrayList();
    public final List b = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener c = new za(this);
    private final View.OnAttachStateChangeListener o = new zb(this);
    private final aey p = new zc(this);
    private int q = 0;
    private int r = 0;
    private boolean y = false;
    private int t = g();

    public yz(Context context, View view, int i, int i2, boolean z) {
        this.i = context;
        this.s = view;
        this.k = i;
        this.l = i2;
        this.m = z;
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.a = new Handler();
    }

    @Override // flm.zv
    public final void b(boolean z) {
        this.y = z;
    }

    @Override // flm.aae
    public final void b() {
        if (!d()) {
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                c((zi) it.next());
            }
            this.n.clear();
            this.d = this.s;
            if (this.d != null) {
                boolean z = this.e == null;
                this.e = this.d.getViewTreeObserver();
                if (z) {
                    this.e.addOnGlobalLayoutListener(this.c);
                }
                this.d.addOnAttachStateChangeListener(this.o);
            }
        }
    }

    @Override // flm.aae
    public final void c() {
        int size = this.b.size();
        if (size > 0) {
            ze[] zeVarArr = (ze[]) this.b.toArray(new ze[size]);
            for (int i = size - 1; i >= 0; i--) {
                ze zeVar = zeVarArr[i];
                if (zeVar.a.s.isShowing()) {
                    zeVar.a.c();
                }
            }
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        c();
        return true;
    }

    private final int g() {
        return ti.f(this.s) == 1 ? 0 : 1;
    }

    @Override // flm.zv
    public final void a(zi ziVar) {
        ziVar.a(this, this.i);
        if (d()) {
            c(ziVar);
        } else {
            this.n.add(ziVar);
        }
    }

    private final void c(zi ziVar) {
        View view;
        ze zeVar;
        int i;
        int i2;
        int i3;
        int width;
        MenuItem menuItem;
        int headersCount;
        zh zhVar;
        int i4;
        int firstVisiblePosition;
        View childAt;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.i);
        zh zhVar2 = new zh(ziVar, layoutInflaterFrom, this.m, h);
        if (!d() && this.y) {
            zhVar2.b = true;
        } else if (d()) {
            zhVar2.b = zv.b(ziVar);
        }
        int iA = a(zhVar2, null, this.i, this.j);
        aez aezVar = new aez(this.i, null, this.k, this.l);
        aezVar.b = this.p;
        aezVar.n = this;
        aezVar.a(this);
        aezVar.m = this.s;
        aezVar.j = this.r;
        aezVar.a(true);
        aezVar.c(2);
        aezVar.a(zhVar2);
        aezVar.b(iA);
        aezVar.j = this.r;
        if (this.b.size() > 0) {
            ze zeVar2 = (ze) this.b.get(this.b.size() - 1);
            zi ziVar2 = zeVar2.b;
            int size = ziVar2.size();
            int i5 = 0;
            while (true) {
                if (i5 < size) {
                    MenuItem item = ziVar2.getItem(i5);
                    if (item.hasSubMenu() && ziVar == item.getSubMenu()) {
                        menuItem = item;
                        break;
                    }
                    i5++;
                } else {
                    menuItem = null;
                    break;
                }
            }
            if (menuItem == null) {
                childAt = null;
            } else {
                ado adoVar = zeVar2.a.e;
                ListAdapter adapter = adoVar.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    zhVar = (zh) headerViewListAdapter.getWrappedAdapter();
                } else {
                    headersCount = 0;
                    zhVar = (zh) adapter;
                }
                int i6 = 0;
                int count = zhVar.getCount();
                while (true) {
                    if (i6 >= count) {
                        i4 = -1;
                        break;
                    } else {
                        if (menuItem == ((zm) zhVar.getItem(i6))) {
                            i4 = i6;
                            break;
                        }
                        i6++;
                    }
                }
                if (i4 == -1 || (firstVisiblePosition = (i4 + headersCount) - adoVar.getFirstVisiblePosition()) < 0 || firstVisiblePosition >= adoVar.getChildCount()) {
                    childAt = null;
                } else {
                    childAt = adoVar.getChildAt(firstVisiblePosition);
                }
            }
            view = childAt;
            zeVar = zeVar2;
        } else {
            view = null;
            zeVar = null;
        }
        if (view != null) {
            if (aez.a != null) {
                try {
                    aez.a.invoke(aezVar.s, false);
                } catch (Exception e) {
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                aezVar.s.setEnterTransition(null);
            }
            ado adoVar2 = ((ze) this.b.get(this.b.size() - 1)).a.e;
            int[] iArr = new int[2];
            adoVar2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.d.getWindowVisibleDisplayFrame(rect);
            if (this.t == 1) {
                if (adoVar2.getWidth() + iArr[0] + iA > rect.right) {
                    i = 0;
                } else {
                    i = 1;
                }
            } else if (iArr[0] - iA < 0) {
                i = 1;
            } else {
                i = 0;
            }
            boolean z = i == 1;
            this.t = i;
            if (Build.VERSION.SDK_INT >= 26) {
                aezVar.m = view;
                i2 = 0;
                i3 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.s.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                view.getLocationOnScreen(iArr3);
                if ((this.r & 7) == 5) {
                    iArr2[0] = iArr2[0] + this.s.getWidth();
                    iArr3[0] = iArr3[0] + view.getWidth();
                }
                i2 = iArr3[0] - iArr2[0];
                i3 = iArr3[1] - iArr2[1];
            }
            if ((this.r & 5) == 5) {
                if (z) {
                    width = i2 + iA;
                } else {
                    width = i2 - view.getWidth();
                }
            } else if (z) {
                width = view.getWidth() + i2;
            } else {
                width = i2 - iA;
            }
            aezVar.g = width;
            aezVar.i = true;
            aezVar.h = true;
            aezVar.a(i3);
        } else {
            if (this.u) {
                aezVar.g = this.w;
            }
            if (this.v) {
                aezVar.a(this.x);
            }
            aezVar.q = this.g;
        }
        this.b.add(new ze(aezVar, ziVar, this.t));
        aezVar.b();
        ado adoVar3 = aezVar.e;
        adoVar3.setOnKeyListener(this);
        if (zeVar == null && this.z && ziVar.f != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) adoVar3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(ziVar.f);
            adoVar3.addHeaderView(frameLayout, null, false);
            aezVar.b();
        }
    }

    @Override // flm.aae
    public final boolean d() {
        return this.b.size() > 0 && ((ze) this.b.get(0)).a.s.isShowing();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ze zeVar;
        int size = this.b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                zeVar = null;
                break;
            }
            zeVar = (ze) this.b.get(i);
            if (!zeVar.a.s.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (zeVar != null) {
            zeVar.b.a(false);
        }
    }

    @Override // flm.zy
    public final void a(boolean z) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            a(((ze) it.next()).a.e.getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // flm.zy
    public final void a(zz zzVar) {
        this.A = zzVar;
    }

    @Override // flm.zy
    public final boolean a(aai aaiVar) {
        for (ze zeVar : this.b) {
            if (aaiVar == zeVar.b) {
                zeVar.a.e.requestFocus();
                return true;
            }
        }
        if (aaiVar.hasVisibleItems()) {
            a((zi) aaiVar);
            if (this.A != null) {
                this.A.a(aaiVar);
            }
            return true;
        }
        return false;
    }

    @Override // flm.zy
    public final void a(zi ziVar, boolean z) {
        int size = this.b.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (ziVar == ((ze) this.b.get(i)).b) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < this.b.size()) {
                ((ze) this.b.get(i2)).b.a(false);
            }
            ze zeVar = (ze) this.b.remove(i);
            zeVar.b.b(this);
            if (this.f) {
                aez aezVar = zeVar.a;
                if (Build.VERSION.SDK_INT >= 23) {
                    aezVar.s.setExitTransition(null);
                }
                zeVar.a.s.setAnimationStyle(0);
            }
            zeVar.a.c();
            int size2 = this.b.size();
            if (size2 > 0) {
                this.t = ((ze) this.b.get(size2 - 1)).c;
            } else {
                this.t = g();
            }
            if (size2 == 0) {
                c();
                if (this.A != null) {
                    this.A.a(ziVar, true);
                }
                if (this.e != null) {
                    if (this.e.isAlive()) {
                        this.e.removeGlobalOnLayoutListener(this.c);
                    }
                    this.e = null;
                }
                this.d.removeOnAttachStateChangeListener(this.o);
                this.B.onDismiss();
                return;
            }
            if (z) {
                ((ze) this.b.get(0)).b.a(false);
            }
        }
    }

    @Override // flm.zy
    public final boolean a() {
        return false;
    }

    @Override // flm.zv
    public final void a(int i) {
        if (this.q != i) {
            this.q = i;
            this.r = sz.a(i, ti.f(this.s));
        }
    }

    @Override // flm.zv
    public final void a(View view) {
        if (this.s != view) {
            this.s = view;
            this.r = sz.a(this.q, ti.f(this.s));
        }
    }

    @Override // flm.zv
    public final void a(PopupWindow.OnDismissListener onDismissListener) {
        this.B = onDismissListener;
    }

    @Override // flm.aae
    public final ListView e() {
        if (this.b.isEmpty()) {
            return null;
        }
        return ((ze) this.b.get(this.b.size() - 1)).a.e;
    }

    @Override // flm.zv
    public final void b(int i) {
        this.u = true;
        this.w = i;
    }

    @Override // flm.zv
    public final void c(int i) {
        this.v = true;
        this.x = i;
    }

    @Override // flm.zv
    public final void c(boolean z) {
        this.z = z;
    }

    @Override // flm.zv
    protected final boolean f() {
        return false;
    }
}
