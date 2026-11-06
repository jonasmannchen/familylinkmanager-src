package flm;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertController;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class vx {
    public final vs a;
    private final int b;

    public vx(Context context) {
        this(context, vw.a(context, 0));
    }

    private vx(Context context, int i) {
        this.a = new vs(new ContextThemeWrapper(context, vw.a(context, i)));
        this.b = i;
    }

    public final vx a(int i) {
        this.a.d = this.a.a.getText(i);
        return this;
    }

    public final vx a(CharSequence charSequence) {
        this.a.f = charSequence;
        return this;
    }

    public final vx a(int i, DialogInterface.OnClickListener onClickListener) {
        this.a.g = this.a.a.getText(i);
        this.a.h = onClickListener;
        return this;
    }

    public final vx b(int i, DialogInterface.OnClickListener onClickListener) {
        this.a.i = this.a.a.getText(i);
        this.a.j = onClickListener;
        return this;
    }

    public final vx a(View view) {
        this.a.r = view;
        this.a.q = 0;
        this.a.s = false;
        return this;
    }

    public final vw a() {
        ListAdapter vvVar;
        vw vwVar = new vw(this.a.a, this.b);
        vs vsVar = this.a;
        AlertController alertController = vwVar.a;
        if (vsVar.e != null) {
            alertController.G = vsVar.e;
        } else {
            if (vsVar.d != null) {
                alertController.a(vsVar.d);
            }
            if (vsVar.c != null) {
                Drawable drawable = vsVar.c;
                alertController.C = drawable;
                alertController.B = 0;
                if (alertController.D != null) {
                    if (drawable != null) {
                        alertController.D.setVisibility(0);
                        alertController.D.setImageDrawable(drawable);
                    } else {
                        alertController.D.setVisibility(8);
                    }
                }
            }
        }
        if (vsVar.f != null) {
            CharSequence charSequence = vsVar.f;
            alertController.f = charSequence;
            if (alertController.F != null) {
                alertController.F.setText(charSequence);
            }
        }
        if (vsVar.g != null) {
            alertController.a(-1, vsVar.g, vsVar.h, null, null);
        }
        if (vsVar.i != null) {
            alertController.a(-2, vsVar.i, vsVar.j, null, null);
        }
        if (vsVar.k != null) {
            alertController.a(-3, vsVar.k, vsVar.l, null, null);
        }
        if (vsVar.o != null) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) vsVar.b.inflate(alertController.L, (ViewGroup) null);
            int i = alertController.O;
            if (vsVar.o != null) {
                vvVar = vsVar.o;
            } else {
                vvVar = new vv(vsVar.a, i, R.id.text1, null);
            }
            alertController.H = vvVar;
            alertController.I = vsVar.t;
            if (vsVar.p != null) {
                recycleListView.setOnItemClickListener(new vt(vsVar, alertController));
            }
            alertController.g = recycleListView;
        }
        if (vsVar.r != null) {
            alertController.h = vsVar.r;
            alertController.i = 0;
            alertController.n = false;
        }
        vwVar.setCancelable(this.a.m);
        if (this.a.m) {
            vwVar.setCanceledOnTouchOutside(true);
        }
        vwVar.setOnCancelListener(null);
        vwVar.setOnDismissListener(null);
        if (this.a.n != null) {
            vwVar.setOnKeyListener(this.a.n);
        }
        return vwVar;
    }

    public final vw b() {
        vw vwVarA = a();
        vwVarA.show();
        return vwVarA;
    }
}
