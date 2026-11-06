package com.google.android.gms.kids.setup.fragment;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import flm.aek;
import flm.aja;
import flm.ak;
import flm.as;
import flm.at;
import flm.bg;
import flm.cfh;
import flm.cin;
import flm.ckz;
import flm.clb;
import flm.coo;
import flm.dvi;
import flm.epf;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public class ParentPickerFragment extends KidSetupFragment {
    private final clb a = new clb(this);

    /* JADX INFO: compiled from: PG */
    public final class FragmentViewModel extends bg {
        public final as a = new as();
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a.a(this, new ckz(this));
        if (bundle == null) {
            i();
        }
        ak akVar = this.e.c;
        final clb clbVar = this.a;
        clbVar.getClass();
        akVar.a(this, new at(clbVar) { // from class: flm.cky
            private final clb a;

            {
                this.a = clbVar;
            }

            @Override // flm.at
            public final void a(Object obj) {
                clb clbVar2 = this.a;
                List listEmptyList = (List) obj;
                if (listEmptyList == null) {
                    listEmptyList = Collections.emptyList();
                }
                clbVar2.c = listEmptyList;
                clbVar2.a.b();
                View viewFindViewById = clbVar2.d.getView().findViewById(R.id.kidsetup_parent_picker_recycler_view);
                if (viewFindViewById != null) {
                    viewFindViewById.setImportantForAccessibility(clbVar2.c.isEmpty() ? 2 : 1);
                }
            }
        });
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.d) {
            this.c.a(R.layout.kid_setup_content_parent_picker);
            ((aja) this.c.b.a(aja.class)).a(R.string.parent_picker_title);
            this.c.b(R.string.parent_picker_header_subheading);
            this.c.b().setVisibility(8);
        } else {
            h(R.layout.kidsetup_content_parent_picker);
            c(R.string.parent_picker_title);
            d(R.string.parent_picker_header_subheading);
            this.n.b.setVisibility(8);
        }
        RecyclerView recyclerView = (RecyclerView) this.g.findViewById(R.id.kidsetup_parent_picker_recycler_view);
        recyclerView.a(new aek(getActivity()));
        recyclerView.a(this.a);
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final dvi b() {
        return coo.a(this.e.d(), epf.PARENT_PICKER);
    }

    public final void i() {
        new cfh(this.e, false).a(((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a);
    }
}
