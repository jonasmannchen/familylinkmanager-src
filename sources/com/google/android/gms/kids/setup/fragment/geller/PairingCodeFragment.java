package com.google.android.gms.kids.setup.fragment.geller;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.textfield.TextInputLayout;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ProgressBar;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.widget.SectionedCodeEditor;
import flm.as;
import flm.bg;
import flm.btm;
import flm.cce;
import flm.chn;
import flm.cin;
import flm.cng;
import flm.eoi;
import flm.epf;
import flm.fqc;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class PairingCodeFragment extends BaseOnboardingFragment implements TextWatcher {
    public TextInputLayout a;
    public SectionedCodeEditor o;
    public ProgressBar p;

    /* JADX INFO: compiled from: PG */
    public final class FragmentViewModel extends bg {
        public final as a = new as();
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a.a(this, new cng(this));
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        a(btm.b(getActivity(), R.drawable.quantum_ic_compare_arrows_black_24));
        c(R.string.pairing_code_title);
        if (fqc.b()) {
            d(R.string.pairing_code_description_v2);
        } else {
            d(R.string.pairing_code_description);
        }
        h(R.layout.kidsetup_content_pairing_code);
        this.a = (TextInputLayout) this.g.findViewById(R.id.pairing_code_input_layout);
        this.o = (SectionedCodeEditor) this.g.findViewById(R.id.pairing_code_editor);
        this.p = (ProgressBar) this.g.findViewById(R.id.pairing_code_progress_bar);
        InputFilter[] filters = this.o.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[inputFilterArr.length - 1] = new InputFilter.AllCaps();
        this.o.setFilters(inputFilterArr);
        this.n.b.setVisibility(8);
        this.n.c.setText(R.string.need_help_button_label);
        this.n.c.setVisibility(0);
        return this.g;
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        this.o.addTextChangedListener(this);
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public final void onStart() {
        super.onStart();
        if (TextUtils.isEmpty(this.a.c())) {
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void e() {
        a(eoi.NEED_HELP_BUTTON_CLICKED);
        if (fqc.b()) {
            cce.a(this).c(R.id.kidsetup_action_need_help);
        } else {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getString(R.string.connect_devices_need_help_url))));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable.length() > 0) {
            this.a.b((CharSequence) null);
        }
        if (editable.length() == 9) {
            o();
        }
    }

    public final void i() {
        if (this.o.isEnabled()) {
            this.o.requestFocus();
            ((InputMethodManager) getActivity().getSystemService("input_method")).showSoftInput(this.o, 1);
        }
    }

    public final void o() {
        String string = this.o.getText().toString();
        if (string.length() == 9) {
            new chn(this.e, string).a(((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a);
        }
    }

    @Override // com.google.android.gms.kids.setup.fragment.geller.BaseOnboardingFragment
    protected final epf j() {
        return epf.PAIRING_CODE;
    }
}
