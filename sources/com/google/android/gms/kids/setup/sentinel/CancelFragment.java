package com.google.android.gms.kids.setup.sentinel;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.KidSetupFragment;
import flm.aja;
import flm.as;
import flm.bg;
import flm.cev;
import flm.chi;
import flm.cia;
import flm.cin;
import flm.cny;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public class CancelFragment extends KidSetupFragment {

    /* JADX INFO: compiled from: PG */
    public final class FragmentViewModel extends bg {
        public final as a = new as();
        public final as b = new as();
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentViewModel fragmentViewModel = (FragmentViewModel) cin.a(this).a(FragmentViewModel.class);
        cny cnyVar = new cny(this);
        fragmentViewModel.a.a(this, cnyVar);
        fragmentViewModel.b.a(this, cnyVar);
        if (bundle == null) {
            cia ciaVarA = cia.a(this.e.d().b);
            if (ciaVarA == null) {
                ciaVarA = cia.UNSPECIFIED;
            }
            switch (ciaVarA.ordinal()) {
                case 5:
                    new chi(this.e, true).a(fragmentViewModel.a);
                    break;
                case 6:
                case 7:
                default:
                    i();
                    break;
                case 8:
                    new cev(this.e).a(fragmentViewModel.b);
                    break;
            }
        }
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.d) {
            ((aja) this.c.b.a(aja.class)).a(R.string.please_wait);
            this.c.a(true);
            this.c.b(false);
        } else {
            i(-1);
            this.n.b.setVisibility(8);
            this.n.a.setVisibility(8);
        }
        return this.g;
    }

    public final void i() {
        cia ciaVarA = cia.a(this.e.d().b);
        if (ciaVarA == null) {
            ciaVarA = cia.UNSPECIFIED;
        }
        if (ciaVarA == cia.SYNC_TAIL_FLOW) {
            getActivity().setResult(-1);
        } else {
            Intent intent = new Intent();
            intent.putExtra("intentionally_canceled", true);
            getActivity().setResult(0, intent);
        }
        getActivity().finish();
    }
}
