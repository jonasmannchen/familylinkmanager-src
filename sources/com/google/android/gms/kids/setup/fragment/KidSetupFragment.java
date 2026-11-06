package com.google.android.gms.kids.setup.fragment;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.setupwizardlib.GlifLayout;
import com.android.setupwizardlib.TemplateLayout;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.KidSetupChimeraActivity;
import com.google.android.gms.kids.setup.fragment.KidSetupFragment;
import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;
import com.google.android.gms.kids.setup.widget.EnhancedNetworkImageView;
import com.google.android.gms.kids.setup.widget.KidSetupNavBar;
import flm.aja;
import flm.ajb;
import flm.aje;
import flm.as;
import flm.btr;
import flm.cce;
import flm.cha;
import flm.chj;
import flm.chz;
import flm.cia;
import flm.cic;
import flm.cid;
import flm.cif;
import flm.cil;
import flm.cin;
import flm.ckn;
import flm.cko;
import flm.ckp;
import flm.dur;
import flm.dvi;
import flm.dvl;
import flm.elz;
import flm.eoi;
import flm.oo;
import flm.vw;
import flm.vx;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public class KidSetupFragment extends cil {
    private TextView a;
    public KidSetupViewModel e;
    public LayoutInflater f;
    public View g;
    public ViewGroup h;
    public ImageView i;
    public EnhancedNetworkImageView j;
    public ImageView k;
    public TextView l;
    public View m;
    public KidSetupNavBar n;
    private TextView o;
    private ViewGroup p;
    public final ckp c = new ckp(this);
    public boolean d = false;
    private final Set q = new HashSet();
    public boolean b = false;

    @Override // flm.cil
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.e = (KidSetupViewModel) cin.a(getActivity()).a(KidSetupViewModel.class);
        if (bundle != null) {
            this.q.addAll(bundle.getIntegerArrayList("interstitial_tags"));
            this.b = bundle.getBoolean("reached_bottom");
        } else {
            a(eoi.FRAGMENT_DISPLAYED);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate;
        View viewInflate2;
        int i;
        this.f = layoutInflater;
        cid cidVarA = cid.a(this.e.d().c);
        cid cidVar = cidVarA == null ? cid.UNDEFINED : cidVarA;
        cia ciaVarA = cia.a(this.e.d().b);
        if (ciaVarA == null) {
            ciaVarA = cia.UNSPECIFIED;
        }
        this.d = chz.a(ciaVarA);
        if (this.d) {
            ckp ckpVar = this.c;
            ckpVar.d = cif.a(cidVar);
            KidSetupFragment kidSetupFragment = ckpVar.a;
            if (ckpVar.d) {
                viewInflate2 = layoutInflater.inflate(R.layout.kid_setup_fragment_suw_glif, viewGroup, false);
            } else {
                viewInflate2 = layoutInflater.inflate(R.layout.kid_setup_fragment_suw_material, viewGroup, false);
            }
            kidSetupFragment.g = viewInflate2;
            ckpVar.b = (TemplateLayout) ckpVar.a.g.findViewById(R.id.kid_setup_fragment_suw_layout);
            ckpVar.c = (ViewGroup) ckpVar.a.g.findViewById(R.id.kid_setup_fragment_content_frame);
            if (ckpVar.d) {
                GlifLayout glifLayout = (GlifLayout) ckpVar.b;
                ajb ajbVar = (ajb) glifLayout.a(ajb.class);
                if (cidVar == cid.GLIF || cidVar == cid.SUW_GLIF) {
                    i = R.drawable.kidsetup_ic_google;
                } else {
                    i = R.drawable.product_logo_googleg_color_48;
                }
                ajbVar.a(i);
                glifLayout.b(R.layout.kid_setup_footer_glif);
            }
            ckpVar.e = true;
            this.c.b().setOnClickListener(new View.OnClickListener(this) { // from class: flm.ckf
                private final KidSetupFragment a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.e();
                }
            });
            this.c.c().setOnClickListener(new View.OnClickListener(this) { // from class: flm.ckg
                private final KidSetupFragment a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.c();
                }
            });
            return this.g;
        }
        if (cif.a(cidVar)) {
            viewInflate = layoutInflater.inflate(R.layout.kidsetup_fragment_glif, viewGroup, false);
        } else {
            viewInflate = layoutInflater.inflate(R.layout.kidsetup_fragment, viewGroup, false);
        }
        this.g = viewInflate;
        this.h = (ViewGroup) this.g.findViewById(R.id.kidsetup_header_container);
        this.i = (ImageView) this.g.findViewById(R.id.kidsetup_header_icon);
        this.j = (EnhancedNetworkImageView) this.g.findViewById(R.id.kidsetup_network_header_icon);
        this.a = (TextView) this.g.findViewById(R.id.kidsetup_headline);
        this.k = (ImageView) this.g.findViewById(R.id.kidsetup_illustration);
        this.o = (TextView) this.g.findViewById(R.id.kidsetup_subheading);
        this.l = (TextView) this.g.findViewById(R.id.kidsetup_description);
        this.p = (ViewGroup) this.g.findViewById(R.id.kidsetup_content_container);
        this.m = this.g.findViewById(R.id.kidsetup_interstitial);
        this.n = (KidSetupNavBar) this.g.findViewById(R.id.kidsetup_nav_bar);
        this.n.a.setOnClickListener(new View.OnClickListener(this) { // from class: flm.ckh
            private final KidSetupFragment a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.c();
            }
        });
        this.n.b.setOnClickListener(new View.OnClickListener(this) { // from class: flm.cki
            private final KidSetupFragment a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.e();
            }
        });
        this.n.c.setOnClickListener(new View.OnClickListener(this) { // from class: flm.ckj
            private final KidSetupFragment a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.e();
            }
        });
        this.n.d.setOnClickListener(new View.OnClickListener(this) { // from class: flm.ckk
            private final KidSetupFragment a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.d_();
            }
        });
        this.n.d.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: flm.ckl
            private final KidSetupFragment a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.a.g();
            }
        });
        TypedValue typedValue = new TypedValue();
        if (getActivity().getTheme().resolveAttribute(R.attr.defaultHeaderIcon, typedValue, true) && typedValue.resourceId != 0) {
            b(typedValue.resourceId);
        }
        if (cif.a(cidVar)) {
            this.n.a.setVisibility(8);
        }
        if (l() && !this.b) {
            this.n.d.setVisibility(0);
            this.n.b.setVisibility(8);
            this.g.getViewTreeObserver().addOnGlobalLayoutListener(new cko(this, new ckn(this)));
        }
        return this.g;
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (!this.d) {
            this.m.setVisibility(this.q.isEmpty() ? 8 : 0);
        }
    }

    @Override // flm.cil
    public void onStart() {
        super.onStart();
        cia ciaVarA = cia.a(this.e.d().b);
        if (ciaVarA == null) {
            ciaVarA = cia.UNSPECIFIED;
        }
        if (cic.b(ciaVarA) || ciaVarA == cia.GELLER_FLOW) {
            new cha(this.e, false).a((as) null);
        }
        i();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.n = null;
        this.m = null;
        this.p = null;
        this.o = null;
        this.l = null;
        this.k = null;
        this.a = null;
        this.i = null;
        this.j = null;
        this.h = null;
        this.g = null;
        this.f = null;
    }

    @Override // flm.cil
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putIntegerArrayList("interstitial_tags", new ArrayList<>(this.q));
        if (l()) {
            bundle.putBoolean("reached_bottom", this.b);
        }
    }

    public final int a(int i) {
        return oo.c(getActivity(), i);
    }

    public void a(Bundle bundle) {
        cce.a(this).a(R.id.kidsetup_action_next, bundle);
    }

    public void d() {
        cce.a(this).a();
    }

    public void k() {
        a(eoi.FLOW_CANCELLED);
        cce.a(this).c(R.id.kidsetup_destination_cancel);
    }

    public void e_() {
    }

    public boolean l() {
        return false;
    }

    public final void b(int i) {
        this.i.setImageResource(i);
        this.i.setVisibility(0);
    }

    public final void a(Drawable drawable) {
        this.i.setImageDrawable(drawable);
        this.i.setVisibility(0);
    }

    public final void c(int i) {
        this.a.setText(i);
    }

    public final void a(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final void d(int i) {
        this.o.setText(i);
        this.o.setVisibility(0);
    }

    public final void b(CharSequence charSequence) {
        this.o.setText(charSequence);
        this.o.setVisibility(0);
    }

    public final void e(int i) {
        this.l.setText(i);
        this.l.setVisibility(0);
    }

    public final void f(int i) {
        this.k.setImageResource(i);
        this.k.setVisibility(0);
    }

    protected final void g(int i) {
        this.k.setImageBitmap(btr.a(getActivity(), i));
        this.k.setVisibility(0);
    }

    public final void h(int i) {
        dvl.a(this.p.getChildCount() == 0);
        this.f.inflate(i, this.p, true);
    }

    public final void i(int i) {
        this.q.add(Integer.valueOf(i));
        if (this.q.size() == 1) {
            this.m.setBackgroundColor(a(android.R.color.background_light));
            this.m.setVisibility(0);
            this.n.setEnabled(false);
        }
    }

    public final void j(int i) {
        this.q.remove(Integer.valueOf(i));
        if (this.q.isEmpty()) {
            this.m.setVisibility(8);
            this.n.setEnabled(true);
            i();
        }
    }

    public final ScrollView m() {
        return (ScrollView) this.g.findViewById(R.id.scroll_view);
    }

    public void c() {
        d();
    }

    public void e() {
        a((Bundle) null);
    }

    public void d_() {
        if (l()) {
            m().arrowScroll(130);
        }
    }

    public boolean g() {
        if (!l()) {
            return false;
        }
        m().fullScroll(130);
        return true;
    }

    public final void n() {
        if (getActivity() instanceof KidSetupChimeraActivity) {
            getActivity().focusDefaultTouchResponder();
        }
    }

    public final void a(DialogInterface.OnClickListener onClickListener) {
        vx vxVarA = new vx(getActivity()).a(R.string.common_something_went_wrong).a(R.string.close_button_label, new DialogInterface.OnClickListener(this) { // from class: flm.ckm
            private final KidSetupFragment a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.k();
            }
        });
        if (onClickListener != null) {
            vxVarA.b(R.string.common_retry, onClickListener);
        }
        vw vwVarA = vxVarA.a();
        vwVarA.setCancelable(false);
        vwVarA.setCanceledOnTouchOutside(false);
        vwVarA.show();
    }

    public dvi b() {
        return dur.a;
    }

    private final void i() {
        boolean zA;
        if (this.d) {
            ckp ckpVar = this.c;
            View viewFindViewById = ckpVar.b.findViewById(R.id.kid_setup_circular_progress_bar);
            if (viewFindViewById != null && viewFindViewById.getVisibility() == 0) {
                zA = true;
            } else {
                zA = ((aje) ckpVar.b.a(aje.class)).a();
            }
            if (!zA) {
                ((aja) this.c.b.a(aja.class)).a().sendAccessibilityEvent(8);
                return;
            }
            return;
        }
        if (this.q.isEmpty()) {
            this.a.sendAccessibilityEvent(8);
        }
    }

    public final void a(eoi eoiVar) {
        dvi dviVarB = b();
        if (dviVarB.a()) {
            new chj(this.e, eoiVar, (elz) dviVarB.b()).a((as) null);
        }
    }
}
