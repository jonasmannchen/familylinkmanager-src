package flm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class yw implements zy {
    public Context a;
    public Context b;
    public zi c;
    public zz d;
    public aaa e;
    private LayoutInflater f;
    private int g;
    private int h;

    public yw(Context context, int i, int i2) {
        this.a = context;
        this.f = LayoutInflater.from(context);
        this.g = i;
        this.h = i2;
    }

    public abstract void a(zm zmVar, aab aabVar);

    @Override // flm.zy
    public void a(Context context, zi ziVar) {
        this.b = context;
        LayoutInflater.from(this.b);
        this.c = ziVar;
    }

    public aaa a(ViewGroup viewGroup) {
        if (this.e == null) {
            this.e = (aaa) this.f.inflate(this.g, viewGroup, false);
            this.e.a(this.c);
            a(true);
        }
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // flm.zy
    public void a(boolean z) {
        int i;
        int i2;
        ViewGroup viewGroup = (ViewGroup) this.e;
        if (viewGroup != null) {
            if (this.c != null) {
                this.c.j();
                ArrayList arrayListI = this.c.i();
                int size = arrayListI.size();
                int i3 = 0;
                i = 0;
                while (i3 < size) {
                    zm zmVar = (zm) arrayListI.get(i3);
                    if (a(zmVar)) {
                        View childAt = viewGroup.getChildAt(i);
                        zm zmVarA = childAt instanceof aab ? ((aab) childAt).a() : null;
                        View viewA = a(zmVar, childAt, viewGroup);
                        if (zmVar != zmVarA) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.e).addView(viewA, i);
                        }
                        i2 = i + 1;
                    } else {
                        i2 = i;
                    }
                    i3++;
                    i = i2;
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (!a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    public boolean a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    @Override // flm.zy
    public final void a(zz zzVar) {
        this.d = zzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View a(zm zmVar, View view, ViewGroup viewGroup) {
        aab aabVar;
        if (view instanceof aab) {
            aabVar = (aab) view;
        } else {
            aabVar = (aab) this.f.inflate(this.h, viewGroup, false);
        }
        a(zmVar, aabVar);
        return (View) aabVar;
    }

    public boolean a(zm zmVar) {
        return true;
    }

    @Override // flm.zy
    public void a(zi ziVar, boolean z) {
        if (this.d != null) {
            this.d.a(ziVar, z);
        }
    }

    @Override // flm.zy
    public boolean a(aai aaiVar) {
        if (this.d != null) {
            return this.d.a(aaiVar);
        }
        return false;
    }

    @Override // flm.zy
    public boolean a() {
        return false;
    }

    @Override // flm.zy
    public final boolean b(zm zmVar) {
        return false;
    }

    @Override // flm.zy
    public final boolean c(zm zmVar) {
        return false;
    }
}
