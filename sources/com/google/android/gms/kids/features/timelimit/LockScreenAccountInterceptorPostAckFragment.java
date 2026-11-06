package com.google.android.gms.kids.features.timelimit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.features.timelimit.LockScreenAccountInterceptorPostAckFragment;
import flm.bye;
import flm.byh;
import flm.byl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public class LockScreenAccountInterceptorPostAckFragment extends Fragment {
    public final byh a = new byh(this);
    public final bye b = new bye(this);
    public byl c;

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.c = (byl) activity;
    }

    public void onDetach() {
        super.onDetach();
        this.c = null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.kids_time_limit_account_interceptor_post_ack, viewGroup, false);
        viewInflate.findViewById(R.id.kids_time_limit_account_removed_ack_close_btn).setOnClickListener(new View.OnClickListener(this) { // from class: flm.byc
            private final LockScreenAccountInterceptorPostAckFragment a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LockScreenAccountInterceptorPostAckFragment lockScreenAccountInterceptorPostAckFragment = this.a;
                lockScreenAccountInterceptorPostAckFragment.c.showInterstitial(true);
                lockScreenAccountInterceptorPostAckFragment.getLoaderManager().initLoader(1, (Bundle) null, lockScreenAccountInterceptorPostAckFragment.a).forceLoad();
            }
        });
        viewInflate.findViewById(R.id.kids_time_limit_account_removed_ack_add_account_btn).setOnClickListener(new View.OnClickListener(this) { // from class: flm.byd
            private final LockScreenAccountInterceptorPostAckFragment a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LockScreenAccountInterceptorPostAckFragment lockScreenAccountInterceptorPostAckFragment = this.a;
                lockScreenAccountInterceptorPostAckFragment.c.showInterstitial(true);
                lockScreenAccountInterceptorPostAckFragment.getLoaderManager().initLoader(2, (Bundle) null, lockScreenAccountInterceptorPostAckFragment.b).forceLoad();
            }
        });
        return viewInflate;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getLoaderManager().initLoader(1, (Bundle) null, this.a);
        getLoaderManager().initLoader(2, (Bundle) null, this.b);
    }
}
