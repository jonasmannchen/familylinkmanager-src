package com.google.android.gms.kids.setup.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import flm.aja;
import flm.cce;
import flm.cij;
import flm.coo;
import flm.dvi;
import flm.epf;
import flm.exj;
import flm.exq;
import flm.eyu;
import flm.fak;
import flm.fam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class DevicePolicyFragment extends KidSetupFragment {
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.d) {
            ((aja) this.c.b.a(aja.class)).a(R.string.device_policy_title_v2);
            this.c.b(R.string.device_policy_subheading_v2);
            if (i()) {
                this.c.c(R.string.device_policy_description_geller);
            }
        } else {
            c(R.string.device_policy_title_v2);
            d(R.string.device_policy_subheading_v2);
            if (i()) {
                e(R.string.device_policy_description_geller);
            }
        }
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final dvi b() {
        return coo.a(this.e.d(), epf.PROFILE_OWNER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void e() {
        eyu eyuVar;
        cij cijVarD = this.e.d();
        if (cijVarD.t == null) {
            eyuVar = eyu.d;
        } else {
            eyuVar = cijVarD.t;
        }
        if (eyuVar.c) {
            cce.a(this).c(R.id.kidsetup_action_perma_lock);
        } else {
            a(Bundle.EMPTY);
        }
    }

    private final boolean i() {
        exj exjVar;
        fam famVar;
        fak fakVar;
        cij cijVarD = this.e.d();
        if (cijVarD.h == null) {
            exjVar = exj.g;
        } else {
            exjVar = cijVarD.h;
        }
        exq exqVarA = exq.a(exjVar.c);
        if (exqVarA == null) {
            exqVarA = exq.UNKNOWN_FAMILY_ROLE;
        }
        if (exqVarA == exq.MEMBER) {
            if (exjVar.e == null) {
                famVar = fam.c;
            } else {
                famVar = exjVar.e;
            }
            if (famVar.b) {
                if (exjVar.f == null) {
                    fakVar = fak.c;
                } else {
                    fakVar = exjVar.f;
                }
                if (!fakVar.b) {
                    return true;
                }
            }
        }
        return false;
    }
}
