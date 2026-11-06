package com.google.android.gms.kids.setup.fragment.geller;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.geller.WaitingForParentFragment;
import flm.as;
import flm.bg;
import flm.btm;
import flm.cfp;
import flm.cin;
import flm.cnu;
import flm.cnx;
import flm.epf;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class WaitingForParentFragment extends BaseOnboardingFragment {
    public static final long a = TimeUnit.SECONDS.toMillis(5);
    public FutureTask o;
    private final cnx p = new cnx(this);

    /* JADX INFO: compiled from: PG */
    public final class FragmentViewModel extends bg {
        public final as a = new as();
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a.a(this, new cnu(this));
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        a(btm.b(getActivity(), R.drawable.quantum_ic_schedule_black_24));
        c(R.string.waiting_for_parent_title);
        h(R.layout.kidsetup_content_waiting_for_parent);
        this.n.a.setText(R.string.common_cancel);
        this.n.a.setVisibility(0);
        this.n.b.setVisibility(8);
        this.n.c.setText(R.string.need_help_button_label);
        this.n.c.setOnClickListener(new View.OnClickListener(this) { // from class: flm.cnt
            private final WaitingForParentFragment a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WaitingForParentFragment waitingForParentFragment = this.a;
                waitingForParentFragment.a(eoi.NEED_HELP_BUTTON_CLICKED);
                waitingForParentFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(waitingForParentFragment.getString(R.string.waiting_for_parent_need_help_url))));
            }
        });
        this.n.c.setVisibility(0);
        return this.g;
    }

    @Override // flm.cil
    public final void onResume() {
        super.onResume();
        i();
        getActivity().registerReceiver(this.p, new IntentFilter("com.google.android.gms.kids.common.ACTION_REFRESH_SUPERVISION_ONBOARDING_STATE"));
    }

    @Override // flm.cil
    public final void onPause() {
        super.onPause();
        getActivity().unregisterReceiver(this.p);
        if (this.o != null) {
            this.o.cancel(true);
            this.o = null;
        }
    }

    @Override // com.google.android.gms.kids.setup.fragment.geller.BaseOnboardingFragment
    protected final epf j() {
        return epf.WAITING_FOR_PARENT;
    }

    public final void i() {
        new cfp(this.e).a(((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a);
    }
}
