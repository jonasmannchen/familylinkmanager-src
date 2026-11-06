package com.google.android.gms.kids.setup.fragment;

import android.os.Bundle;
import android.support.design.textfield.TextInputLayout;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.widget.PinCodeEditor;
import flm.aja;
import flm.as;
import flm.bg;
import flm.chq;
import flm.cin;
import flm.ckq;
import flm.ckr;
import flm.coo;
import flm.cqd;
import flm.cqg;
import flm.cqi;
import flm.dvi;
import flm.epf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public class LocalUnlockFragment extends KidSetupFragment implements TextWatcher, View.OnClickListener, TextView.OnEditorActionListener, cqi {
    public TextInputLayout a;
    public PinCodeEditor o;
    private final ckq p = new ckq(this);

    /* JADX INFO: compiled from: PG */
    public final class FragmentViewModel extends bg {
        public final as a = new as();
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a.a(this, new ckr(this));
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.d) {
            this.c.a(R.layout.kid_setup_content_local_unlock);
            ((aja) this.c.b.a(aja.class)).a(R.string.local_unlock_title);
            this.c.b(R.string.local_unlock_subheading);
            this.c.b().setVisibility(8);
        } else {
            h(R.layout.kidsetup_content_local_unlock);
            c(R.string.local_unlock_title);
            d(R.string.local_unlock_subheading);
            this.n.b.setVisibility(8);
        }
        this.a = (TextInputLayout) this.g.findViewById(R.id.kidsetup_local_unlock_editor_input_layout);
        this.o = (PinCodeEditor) this.g.findViewById(R.id.kidsetup_local_unlock_pin_code_editor);
        this.g.findViewById(R.id.kidsetup_local_unlock_need_help_button).setOnClickListener(this);
        return this.g;
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        this.o.setOnEditorActionListener(this);
        this.o.addTextChangedListener(this);
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public void onDestroyView() {
        super.onDestroyView();
        this.o.setOnEditorActionListener(null);
        this.o.removeTextChangedListener(this);
        this.o = null;
        this.a = null;
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public void onStart() {
        super.onStart();
        i();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (editable.length() == 6) {
            j();
        } else {
            this.o.a(false);
            this.a.b("");
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return keyEvent != null && keyEvent.getKeyCode() == 66 && keyEvent.getAction() == 1;
        }
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        cqd.a(this).a(R.string.local_unlock_need_help_dialog_title).c(R.string.close_button_label).a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final dvi b() {
        return coo.a(this.e.d(), epf.LOCAL_UNLOCK);
    }

    public final void i() {
        if (this.o.isEnabled()) {
            this.o.requestFocus();
            ((InputMethodManager) getActivity().getSystemService("input_method")).showSoftInput(this.o, 1);
        }
    }

    public final void j() {
        if (this.o.getText().length() == 6) {
            new chq(this.e, this.o.getText().toString()).a(((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a);
        }
    }

    @Override // flm.cqi
    public final cqg f_() {
        return this.p;
    }
}
