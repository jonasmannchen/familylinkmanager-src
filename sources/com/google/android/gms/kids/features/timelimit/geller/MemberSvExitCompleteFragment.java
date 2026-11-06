package com.google.android.gms.kids.features.timelimit.geller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimera.Fragment;
import com.google.android.chimeraresources.R;
import flm.byu;
import flm.bzm;
import flm.bzo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class MemberSvExitCompleteFragment extends Fragment implements View.OnClickListener, byu {
    public View a;
    private final bzm b = new bzm(this);
    private final bzo c = new bzo(this);

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        getLoaderManager().initLoader(1, new Bundle(), this.b);
        getLoaderManager().initLoader(2, new Bundle(), this.c);
        this.a = layoutInflater.inflate(R.layout.member_sv_exit_complete, viewGroup, false);
        this.a.findViewById(R.id.member_sv_exit_complete_close_button).setOnClickListener(this);
        return this.a;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.a = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.findViewById(R.id.member_sv_exit_complete_icon).setVisibility(8);
        ((TextView) this.a.findViewById(R.id.member_sv_exit_complete_title)).setText(R.string.one_moment);
        this.a.findViewById(R.id.member_sv_exit_complete_progress_bar).setVisibility(0);
        this.a.findViewById(R.id.member_sv_exit_complete_description).setVisibility(8);
        this.a.findViewById(R.id.member_sv_exit_complete_close_button).setVisibility(8);
        getLoaderManager().getLoader(2).forceLoad();
    }

    @Override // flm.byu
    public final boolean a() {
        getLoaderManager().getLoader(2).forceLoad();
        return true;
    }
}
