package com.google.android.gms.kids.setup.fragment;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListAdapter;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.AppSelectorFragment;
import com.google.android.gms.kids.setup.widget.StickyHeaderListView;
import flm.aja;
import flm.ajb;
import flm.as;
import flm.bg;
import flm.btm;
import flm.ces;
import flm.chk;
import flm.cia;
import flm.cij;
import flm.cin;
import flm.cjd;
import flm.cjg;
import flm.cji;
import flm.coo;
import flm.dvi;
import flm.epf;
import flm.exj;
import flm.exm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public class AppSelectorFragment extends KidSetupFragment {
    public final cjd a = new cjd(this);
    public boolean b = false;
    private StickyHeaderListView o;

    /* JADX INFO: compiled from: PG */
    public class FragmentViewModel extends bg {
        public final as a = new as();
        public final as b = new as();
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentViewModel fragmentViewModel = (FragmentViewModel) cin.a(this).a(FragmentViewModel.class);
        fragmentViewModel.a.a(this, new cjg(this));
        fragmentViewModel.b.a(this, new cji(this));
        if (bundle == null) {
            h();
        } else {
            this.b = bundle.getBoolean("reached_bottom", false);
        }
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        exj exjVar;
        exm exmVar;
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.d) {
            this.c.a(R.layout.kid_setup_content_app_selector);
            this.c.e();
            this.c.f();
        } else {
            h(R.layout.kid_setup_content_app_selector);
        }
        cia ciaVarA = cia.a(this.e.d().b);
        if (ciaVarA == null) {
            ciaVarA = cia.UNSPECIFIED;
        }
        if (ciaVarA == cia.GELLER_FLOW) {
            Drawable drawableB = btm.b(getActivity(), R.drawable.quantum_ic_smartphone_black_24);
            Object[] objArr = new Object[1];
            cij cijVarD = this.e.d();
            if (cijVarD.h == null) {
                exjVar = exj.g;
            } else {
                exjVar = cijVarD.h;
            }
            if (exjVar.d == null) {
                exmVar = exm.h;
            } else {
                exmVar = exjVar.d;
            }
            objArr[0] = exmVar.c;
            String string = getString(R.string.kidsetup_supervisee_app_selector_title, objArr);
            if (this.d) {
                ((ajb) this.c.b.a(ajb.class)).a(drawableB);
                ((aja) this.c.b.a(aja.class)).a(string);
            } else {
                a(drawableB);
                a(string);
            }
        } else if (this.d) {
            ((aja) this.c.b.a(aja.class)).a(R.string.kidsetup_app_selector_title);
        } else {
            c(R.string.kidsetup_app_selector_title);
        }
        this.o = (StickyHeaderListView) this.g.findViewById(R.id.kid_setup_app_selector_list_view);
        StickyHeaderListView stickyHeaderListView = this.o;
        cjd cjdVar = this.a;
        stickyHeaderListView.e = cjdVar;
        stickyHeaderListView.g.setAdapter((ListAdapter) cjdVar);
        View viewA = cjdVar.a(stickyHeaderListView.g);
        if (viewA != null) {
            stickyHeaderListView.g.addHeaderView(viewA, null, false);
        }
        stickyHeaderListView.f = cjdVar.c();
        if (stickyHeaderListView.f != null) {
            stickyHeaderListView.f.setElevation(stickyHeaderListView.a);
        }
        stickyHeaderListView.d = -1;
        if (!this.b) {
            String string2 = getString(R.string.kidsetup_app_selector_review_more_content_description);
            if (this.d) {
                this.c.b().setVisibility(8);
                Button buttonD = this.c.d();
                buttonD.setVisibility(0);
                buttonD.setContentDescription(string2);
                buttonD.setOnClickListener(new View.OnClickListener(this) { // from class: flm.cjb
                    private final AppSelectorFragment a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.d_();
                    }
                });
                buttonD.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: flm.cjc
                    private final AppSelectorFragment a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        return this.a.g();
                    }
                });
            } else {
                this.n.d.setVisibility(0);
                this.n.d.setContentDescription(string2);
                this.n.b.setVisibility(8);
            }
        }
        return this.g;
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("reached_bottom", this.b);
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public void onDestroyView() {
        super.onDestroyView();
        this.o = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final dvi b() {
        return coo.a(this.e.d(), epf.APP_SELECTOR);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void d_() {
        StickyHeaderListView stickyHeaderListView = this.o;
        int firstVisiblePosition = stickyHeaderListView.g.getFirstVisiblePosition();
        int count = stickyHeaderListView.g.getCount() - 1;
        for (int i = firstVisiblePosition + 1; i <= count; i++) {
            if (stickyHeaderListView.e.c(i - stickyHeaderListView.g.getHeaderViewsCount())) {
                stickyHeaderListView.g.smoothScrollToPositionFromTop(i, 0, stickyHeaderListView.b);
                return;
            }
        }
        stickyHeaderListView.g.smoothScrollToPositionFromTop(stickyHeaderListView.g.getCount() - 1, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final boolean g() {
        StickyHeaderListView stickyHeaderListView = this.o;
        stickyHeaderListView.g.smoothScrollToPositionFromTop(stickyHeaderListView.g.getCount() - 1, 0, stickyHeaderListView.c);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void e() {
        i();
    }

    public final void h() {
        new ces(this.e, getResources()).a(((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a);
    }

    public final void i() {
        cia ciaVarA = cia.a(this.e.d().b);
        if (ciaVarA == null) {
            ciaVarA = cia.UNSPECIFIED;
        }
        new chk(this.e, ciaVarA != cia.GELLER_FLOW).a(((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).b);
    }
}
