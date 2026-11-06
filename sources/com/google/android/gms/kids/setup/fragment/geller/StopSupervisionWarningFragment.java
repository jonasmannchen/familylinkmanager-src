package com.google.android.gms.kids.setup.fragment.geller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.KidSetupFragment;
import com.google.android.gms.kids.setup.fragment.geller.StopSupervisionWarningFragment;
import flm.as;
import flm.bg;
import flm.cgj;
import flm.chb;
import flm.cin;
import flm.cnp;
import flm.cnr;
import flm.cpm;
import flm.dp;
import flm.dvi;
import flm.elf;
import flm.elg;
import flm.elz;
import flm.ema;
import flm.emh;
import flm.emi;
import flm.epd;
import flm.epf;
import flm.ewd;
import flm.exd;
import flm.eyq;
import flm.fin;
import flm.fio;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class StopSupervisionWarningFragment extends KidSetupFragment {
    public CheckBox a;
    private TextView o;
    private boolean p = false;

    /* JADX INFO: compiled from: PG */
    public final class FragmentViewModel extends bg {
        public final as a = new as();
        public final as b = new as();
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentViewModel fragmentViewModel = (FragmentViewModel) cin.a(this).a(FragmentViewModel.class);
        fragmentViewModel.a.a(this, new cnp(this));
        fragmentViewModel.b.a(this, new cnr(this));
        if (bundle == null) {
            i();
        }
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        c(R.string.stop_supervision_title);
        d(R.string.stop_supervision_subtitle);
        h(R.layout.kidsetup_content_stop_supervision);
        this.n.a.setText(R.string.common_cancel);
        this.n.a.setVisibility(0);
        this.n.b.setText(R.string.stop_supervision_button_label);
        this.n.b.setVisibility(0);
        this.a = (CheckBox) this.g.findViewById(R.id.stop_supervision_checkbox);
        this.a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: flm.cnn
            private final StopSupervisionWarningFragment a;

            {
                this.a = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.g.findViewById(R.id.stop_supervision_checkbox_error).setVisibility(4);
            }
        });
        this.o = (TextView) this.g.findViewById(R.id.stop_supervision_checkbox_text);
        this.g.findViewById(R.id.stop_supervision_checkbox_container).setOnClickListener(new View.OnClickListener(this) { // from class: flm.cno
            private final StopSupervisionWarningFragment a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.toggle();
            }
        });
        if (bundle != null) {
            this.p = bundle.getBoolean("error_shown", false);
        }
        this.g.findViewById(R.id.stop_supervision_checkbox_error).setVisibility(this.p ? 0 : 4);
        return this.g;
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("error_shown", this.p);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void e() {
        if (this.a.isChecked()) {
            j();
            return;
        }
        this.g.findViewById(R.id.stop_supervision_checkbox_error).setVisibility(0);
        this.a.announceForAccessibility(getString(R.string.stop_supervision_checkbox_error_a11y_announcement));
        this.p = true;
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.a = null;
        this.o = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final dvi b() {
        return dvi.b((elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a(((emi) ((fio) emh.h.a(dp.au, (Object) null))).a(epd.MEMBER_SV_ABOUT_SUPERVISION).a(this.e.d().d).a(((elg) ((fio) elf.c.a(dp.au, (Object) null))).a(epf.STOP_SUPERVISION_WARNING))).h()));
    }

    public final void i() {
        new cgj(this.e).a(((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a);
    }

    public final void j() {
        new chb(this.e).a(((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i, int i2, int i3, int i4, List list) {
        exd exdVar;
        eyq eyqVar;
        TextView textView = (TextView) this.g.findViewById(i);
        textView.setVisibility(0);
        this.g.findViewById(i2).setVisibility(0);
        if (list.size() == 1) {
            textView.setText(i3);
            this.o.setText(R.string.stop_supervision_checkbox_label_v2_singular);
        } else {
            textView.setText(i4);
            this.o.setText(R.string.stop_supervision_checkbox_label_v2_plural);
        }
        LinearLayout linearLayout = (LinearLayout) this.g.findViewById(i2);
        linearLayout.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ewd ewdVar = (ewd) it.next();
            if (ewdVar.b == null) {
                exdVar = exd.e;
            } else {
                exdVar = ewdVar.b;
            }
            cpm cpmVarA = new cpm(getActivity()).a(exdVar.b);
            if (exdVar.c == null) {
                eyqVar = eyq.c;
            } else {
                eyqVar = exdVar.c;
            }
            linearLayout.addView(cpmVarA.b(eyqVar.b).a(exdVar.d));
        }
    }
}
