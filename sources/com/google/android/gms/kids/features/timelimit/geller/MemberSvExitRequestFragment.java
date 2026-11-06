package com.google.android.gms.kids.features.timelimit.geller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimera.Fragment;
import com.google.android.chimeraresources.R;
import flm.byu;
import flm.caf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class MemberSvExitRequestFragment extends Fragment implements byu {
    private final caf a = new caf(this);

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.member_sv_exit_progress_bar_only, viewGroup, false);
        getLoaderManager().initLoader(1, new Bundle(), this.a).forceLoad();
        return viewInflate;
    }

    @Override // flm.byu
    public final boolean a() {
        return true;
    }
}
