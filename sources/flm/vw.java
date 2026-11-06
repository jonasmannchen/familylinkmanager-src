package flm;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AlertController;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class vw extends ws implements DialogInterface {
    public final AlertController a;

    protected vw(Context context, int i) {
        super(context, a(context, i));
        this.a = new AlertController(getContext(), this, getWindow());
    }

    static int a(Context context, int i) {
        if ((i >>> 24) <= 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
    }

    @Override // flm.ws, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.a.a(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.ws, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        View viewInflate;
        View viewFindViewById;
        View viewFindViewById2;
        super.onCreate(bundle);
        AlertController alertController = this.a;
        if (alertController.K == 0) {
            i = alertController.J;
        } else {
            i = alertController.J;
        }
        alertController.b.setContentView(i);
        View viewFindViewById3 = alertController.c.findViewById(R.id.parentPanel);
        View viewFindViewById4 = viewFindViewById3.findViewById(R.id.topPanel);
        View viewFindViewById5 = viewFindViewById3.findViewById(R.id.contentPanel);
        View viewFindViewById6 = viewFindViewById3.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(R.id.customPanel);
        if (alertController.h != null) {
            viewInflate = alertController.h;
        } else if (alertController.i != 0) {
            viewInflate = LayoutInflater.from(alertController.a).inflate(alertController.i, viewGroup, false);
        } else {
            viewInflate = null;
        }
        boolean z = viewInflate != null;
        if (!z || !AlertController.a(viewInflate)) {
            alertController.c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) alertController.c.findViewById(R.id.custom);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.n) {
                frameLayout.setPadding(alertController.j, alertController.k, alertController.l, alertController.m);
            }
            if (alertController.g != null) {
                ((aej) viewGroup.getLayoutParams()).g = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById7 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById9 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupA = AlertController.a(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupA2 = AlertController.a(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupA3 = AlertController.a(viewFindViewById9, viewFindViewById6);
        alertController.A = (NestedScrollView) alertController.c.findViewById(R.id.scrollView);
        alertController.A.setFocusable(false);
        alertController.A.setNestedScrollingEnabled(false);
        alertController.F = (TextView) viewGroupA2.findViewById(android.R.id.message);
        if (alertController.F != null) {
            if (alertController.f != null) {
                alertController.F.setText(alertController.f);
            } else {
                alertController.F.setVisibility(8);
                alertController.A.removeView(alertController.F);
                if (alertController.g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.A.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(alertController.A);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(alertController.g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupA2.setVisibility(8);
                }
            }
        }
        int i2 = 0;
        alertController.o = (Button) viewGroupA3.findViewById(android.R.id.button1);
        alertController.o.setOnClickListener(alertController.R);
        if (TextUtils.isEmpty(alertController.p) && alertController.r == null) {
            alertController.o.setVisibility(8);
        } else {
            alertController.o.setText(alertController.p);
            if (alertController.r != null) {
                alertController.r.setBounds(0, 0, alertController.d, alertController.d);
                alertController.o.setCompoundDrawables(alertController.r, null, null, null);
            }
            alertController.o.setVisibility(0);
            i2 = 1;
        }
        alertController.s = (Button) viewGroupA3.findViewById(android.R.id.button2);
        alertController.s.setOnClickListener(alertController.R);
        if (TextUtils.isEmpty(alertController.t) && alertController.v == null) {
            alertController.s.setVisibility(8);
        } else {
            alertController.s.setText(alertController.t);
            if (alertController.v != null) {
                alertController.v.setBounds(0, 0, alertController.d, alertController.d);
                alertController.s.setCompoundDrawables(alertController.v, null, null, null);
            }
            alertController.s.setVisibility(0);
            i2 |= 2;
        }
        alertController.w = (Button) viewGroupA3.findViewById(android.R.id.button3);
        alertController.w.setOnClickListener(alertController.R);
        if (TextUtils.isEmpty(alertController.x) && alertController.z == null) {
            alertController.w.setVisibility(8);
        } else {
            alertController.w.setText(alertController.x);
            if (alertController.r != null) {
                alertController.r.setBounds(0, 0, alertController.d, alertController.d);
                alertController.o.setCompoundDrawables(alertController.r, null, null, null);
            }
            alertController.w.setVisibility(0);
            i2 |= 4;
        }
        Context context = alertController.a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i2 == 1) {
                AlertController.a(alertController.o);
            } else if (i2 == 2) {
                AlertController.a(alertController.s);
            } else if (i2 == 4) {
                AlertController.a(alertController.w);
            }
        }
        if (!(i2 != 0)) {
            viewGroupA3.setVisibility(8);
        }
        if (alertController.G != null) {
            viewGroupA.addView(alertController.G, 0, new ViewGroup.LayoutParams(-1, -2));
            alertController.c.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.D = (ImageView) alertController.c.findViewById(android.R.id.icon);
            if ((!TextUtils.isEmpty(alertController.e)) && alertController.P) {
                alertController.E = (TextView) alertController.c.findViewById(R.id.alertTitle);
                alertController.E.setText(alertController.e);
                if (alertController.B != 0) {
                    alertController.D.setImageResource(alertController.B);
                } else if (alertController.C != null) {
                    alertController.D.setImageDrawable(alertController.C);
                } else {
                    alertController.E.setPadding(alertController.D.getPaddingLeft(), alertController.D.getPaddingTop(), alertController.D.getPaddingRight(), alertController.D.getPaddingBottom());
                    alertController.D.setVisibility(8);
                }
            } else {
                alertController.c.findViewById(R.id.title_template).setVisibility(8);
                alertController.D.setVisibility(8);
                viewGroupA.setVisibility(8);
            }
        }
        boolean z2 = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z3 = (viewGroupA == null || viewGroupA.getVisibility() == 8) ? false : true;
        boolean z4 = (viewGroupA3 == null || viewGroupA3.getVisibility() == 8) ? false : true;
        if (!z4 && viewGroupA2 != null && (viewFindViewById2 = viewGroupA2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z3) {
            if (alertController.A != null) {
                alertController.A.setClipToPadding(true);
            }
            View viewFindViewById10 = null;
            if (alertController.f != null || alertController.g != null) {
                viewFindViewById10 = viewGroupA.findViewById(R.id.titleDividerNoCustom);
            }
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupA2 != null && (viewFindViewById = viewGroupA2.findViewById(R.id.textSpacerNoTitle)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (alertController.g instanceof AlertController.RecycleListView) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) alertController.g;
            if (!z4 || !z3) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), z3 ? recycleListView.getPaddingTop() : recycleListView.a, recycleListView.getPaddingRight(), z4 ? recycleListView.getPaddingBottom() : recycleListView.b);
            }
        }
        if (!z2) {
            View view = alertController.g != null ? alertController.g : alertController.A;
            if (view != null) {
                int i3 = (z3 ? 1 : 0) | (z4 ? 2 : 0);
                View viewFindViewById11 = alertController.c.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = alertController.c.findViewById(R.id.scrollIndicatorDown);
                if (Build.VERSION.SDK_INT >= 23) {
                    ti.a(view, i3, 3);
                    if (viewFindViewById11 != null) {
                        viewGroupA2.removeView(viewFindViewById11);
                    }
                    if (viewFindViewById12 != null) {
                        viewGroupA2.removeView(viewFindViewById12);
                    }
                } else {
                    if (viewFindViewById11 != null && (i3 & 1) == 0) {
                        viewGroupA2.removeView(viewFindViewById11);
                        viewFindViewById11 = null;
                    }
                    if (viewFindViewById12 != null && (i3 & 2) == 0) {
                        viewGroupA2.removeView(viewFindViewById12);
                        viewFindViewById12 = null;
                    }
                    if (viewFindViewById11 != null || viewFindViewById12 != null) {
                        if (alertController.f != null) {
                            alertController.A.a = new vo(alertController, viewFindViewById11, viewFindViewById12);
                            alertController.A.post(new vp(alertController, viewFindViewById11, viewFindViewById12));
                        } else if (alertController.g != null) {
                            alertController.g.setOnScrollListener(new vq(alertController, viewFindViewById11, viewFindViewById12));
                            alertController.g.post(new vr(alertController, viewFindViewById11, viewFindViewById12));
                        } else {
                            if (viewFindViewById11 != null) {
                                viewGroupA2.removeView(viewFindViewById11);
                            }
                            if (viewFindViewById12 != null) {
                                viewGroupA2.removeView(viewFindViewById12);
                            }
                        }
                    }
                }
            }
        }
        ListView listView = alertController.g;
        if (listView != null && alertController.H != null) {
            listView.setAdapter(alertController.H);
            int i4 = alertController.I;
            if (i4 >= 0) {
                listView.setItemChecked(i4, true);
                listView.setSelection(i4);
            }
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        AlertController alertController = this.a;
        if (alertController.A != null && alertController.A.a(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        AlertController alertController = this.a;
        if (alertController.A != null && alertController.A.a(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }
}
