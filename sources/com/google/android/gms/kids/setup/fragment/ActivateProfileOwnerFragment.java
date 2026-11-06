package com.google.android.gms.kids.setup.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import flm.aja;
import flm.cih;
import flm.cqh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class ActivateProfileOwnerFragment extends KidSetupFragment {
    private boolean a = false;

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = bundle.getBoolean("activity_started");
        }
        if (!this.a) {
            this.a = true;
            startActivityForResult(new Intent("com.google.android.gms.kids.action.PROFILE_OWNER_CONSENT").setPackage("com.google.android.gms"), 1);
            cih.a(getActivity()).d = true;
        }
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.d) {
            ((aja) this.c.b.a(aja.class)).a(R.string.please_wait);
            this.c.a(true);
            this.c.b(false);
        } else {
            i(-1);
            this.n.b.setVisibility(8);
        }
        return this.g;
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("activity_started", this.a);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            this.a = false;
            if (i2 == -1) {
                a((Bundle) null);
            } else {
                new cqh(getActivity().getSupportFragmentManager()).b(R.string.device_policy_dialog_message_2).c(R.string.common_got_it).a(false).a();
                d();
            }
        }
    }
}
