package com.google.android.gms.kids.features.timelimit.geller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimera.Fragment;
import com.google.android.chimeraresources.R;
import flm.byu;
import flm.bzv;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class MemberSvExitInitialFragment extends Fragment implements byu {
    private final bzv a = new bzv(this);

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getLoaderManager().initLoader(1, new Bundle(), this.a).forceLoad();
        return layoutInflater.inflate(R.layout.member_sv_exit_progress_bar_only, viewGroup, false);
    }

    @Override // flm.byu
    public final boolean a() {
        return true;
    }
}
