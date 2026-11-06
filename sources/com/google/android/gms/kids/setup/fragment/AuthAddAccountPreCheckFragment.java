package com.google.android.gms.kids.setup.fragment;

import android.os.Bundle;
import com.google.android.apps.common.proguard.UsedByReflection;
import flm.as;
import flm.bg;
import flm.cew;
import flm.cin;
import flm.cjp;
import flm.coo;
import flm.dvi;
import flm.epf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class AuthAddAccountPreCheckFragment extends KidSetupFragment {

    /* JADX INFO: compiled from: PG */
    public final class FragmentViewModel extends bg {
        public final as a = new as();
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a.a(this, new cjp(this));
        if (bundle == null) {
            new cew(this.e).a(((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void c() {
        k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final dvi b() {
        return coo.a(this.e.d(), epf.AUTH_ADD_PRE);
    }
}
