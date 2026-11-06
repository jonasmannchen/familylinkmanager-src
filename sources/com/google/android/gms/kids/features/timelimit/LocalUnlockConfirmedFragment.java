package com.google.android.gms.kids.features.timelimit;

import android.os.Bundle;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.Loader;
import flm.bxw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public class LocalUnlockConfirmedFragment extends Fragment {
    private final bxw a = new bxw(this);

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Loader loaderInitLoader = getLoaderManager().initLoader(1, Bundle.EMPTY, this.a);
        if (bundle == null) {
            loaderInitLoader.forceLoad();
        }
    }

    public void onStart() {
        super.onStart();
        ((LockScreenChimeraActivity) getActivity()).showInterstitial(true);
    }

    public void onStop() {
        super.onStop();
        ((LockScreenChimeraActivity) getActivity()).showInterstitial(false);
    }
}
