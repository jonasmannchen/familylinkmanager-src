package com.google.android.gms.kids.features.timelimit;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimera.Fragment;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.features.timelimit.WhitelistAppsListFragment;
import flm.adc;
import flm.aee;
import flm.bzd;
import flm.fjf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class WhitelistAppsListFragment extends Fragment {
    private bzd a;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.kids_time_limit_whitelist_apps, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.kids_time_limit_whitelist_apps_list);
        int dimensionPixelSize = getResources().getDisplayMetrics().widthPixels / getResources().getDimensionPixelSize(R.dimen.kids_time_limit_whitelist_app_item_width);
        this.a = new bzd(this);
        aee aeeVar = new aee(getActivity(), dimensionPixelSize);
        recyclerView.a(this.a);
        recyclerView.a(aeeVar);
        adc adcVar = new adc();
        if (recyclerView.y != null) {
            recyclerView.y.d();
            recyclerView.y.h = null;
        }
        recyclerView.y = adcVar;
        if (recyclerView.y != null) {
            recyclerView.y.h = recyclerView.G;
        }
        ((Toolbar) viewInflate.findViewById(R.id.kids_time_limit_whitelist_apps_toolbar)).a(new View.OnClickListener(this) { // from class: flm.bzc
            private final WhitelistAppsListFragment a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.getActivity().onBackPressed();
            }
        });
        return viewInflate;
    }

    public final void onResume() {
        super.onResume();
        LockScreenChimeraActivity lockScreenChimeraActivity = (LockScreenChimeraActivity) getActivity();
        bzd bzdVar = this.a;
        fjf fjfVar = lockScreenChimeraActivity.getState().h;
        bzdVar.c.clear();
        bzdVar.c.addAll(fjfVar);
        bzdVar.a.b();
    }
}
