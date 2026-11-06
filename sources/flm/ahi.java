package flm;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ahi implements zy {
    public zm a;
    private zi b;
    private final /* synthetic */ Toolbar c;

    ahi(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // flm.zy
    public final void a(Context context, zi ziVar) {
        if (this.b != null && this.a != null) {
            this.b.b(this.a);
        }
        this.b = ziVar;
    }

    @Override // flm.zy
    public final void a(boolean z) {
        boolean z2 = false;
        if (this.a != null) {
            if (this.b != null) {
                int size = this.b.size();
                for (int i = 0; i < size; i++) {
                    if (this.b.getItem(i) == this.a) {
                        z2 = true;
                        break;
                    }
                }
            }
            if (!z2) {
                c(this.a);
            }
        }
    }

    @Override // flm.zy
    public final void a(zz zzVar) {
    }

    @Override // flm.zy
    public final boolean a(aai aaiVar) {
        return false;
    }

    @Override // flm.zy
    public final void a(zi ziVar, boolean z) {
    }

    @Override // flm.zy
    public final boolean a() {
        return false;
    }

    @Override // flm.zy
    public final boolean b(zm zmVar) {
        Toolbar toolbar = this.c;
        if (toolbar.f == null) {
            toolbar.f = new abw(toolbar.getContext(), null, R.attr.toolbarNavigationButtonStyle);
            toolbar.f.setImageDrawable(toolbar.d);
            toolbar.f.setContentDescription(toolbar.e);
            ahj ahjVarH = Toolbar.h();
            ahjVarH.a = (toolbar.l & 112) | 8388611;
            ahjVarH.b = 2;
            toolbar.f.setLayoutParams(ahjVarH);
            toolbar.f.setOnClickListener(new ahh(toolbar));
        }
        ViewParent parent = this.c.f.getParent();
        if (parent != this.c) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.c.f);
            }
            this.c.addView(this.c.f);
        }
        this.c.g = zmVar.getActionView();
        this.a = zmVar;
        ViewParent parent2 = this.c.g.getParent();
        if (parent2 != this.c) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(this.c.g);
            }
            ahj ahjVarH2 = Toolbar.h();
            ahjVarH2.a = (this.c.l & 112) | 8388611;
            ahjVarH2.b = 2;
            this.c.g.setLayoutParams(ahjVarH2);
            this.c.addView(this.c.g);
        }
        Toolbar toolbar2 = this.c;
        for (int childCount = toolbar2.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar2.getChildAt(childCount);
            if (((ahj) childAt.getLayoutParams()).b != 2 && childAt != toolbar2.a) {
                toolbar2.removeViewAt(childCount);
                toolbar2.p.add(childAt);
            }
        }
        this.c.requestLayout();
        zmVar.e(true);
        if (this.c.g instanceof yi) {
            ((yi) this.c.g).a();
        }
        return true;
    }

    @Override // flm.zy
    public final boolean c(zm zmVar) {
        if (this.c.g instanceof yi) {
            ((yi) this.c.g).b();
        }
        this.c.removeView(this.c.g);
        this.c.removeView(this.c.f);
        this.c.g = null;
        Toolbar toolbar = this.c;
        for (int size = toolbar.p.size() - 1; size >= 0; size--) {
            toolbar.addView((View) toolbar.p.get(size));
        }
        toolbar.p.clear();
        this.a = null;
        this.c.requestLayout();
        zmVar.e(false);
        return true;
    }
}
