package com.google.android.gms.kids.setup.fragment.geller;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.textfield.TextInputEditText;
import android.support.design.textfield.TextInputLayout;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.widget.EnhancedNetworkImageView;
import flm.as;
import flm.bg;
import flm.btm;
import flm.cht;
import flm.cij;
import flm.cin;
import flm.cnj;
import flm.coj;
import flm.epf;
import flm.exj;
import flm.exm;
import flm.ik;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class PasswordConfirmationFragment extends BaseOnboardingFragment implements TextWatcher, TextView.OnEditorActionListener {
    public TextInputLayout a;
    public TextInputEditText o;

    /* JADX INFO: compiled from: PG */
    public final class FragmentViewModel extends bg {
        public final as a = new as();
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a.a(this, new cnj(this));
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        exj exjVar;
        exm exmVar;
        super.onCreateView(layoutInflater, viewGroup, bundle);
        cij cijVarD = this.e.d();
        if (cijVarD.h == null) {
            exjVar = exj.g;
        } else {
            exjVar = cijVarD.h;
        }
        if (exjVar.d == null) {
            exmVar = exm.h;
        } else {
            exmVar = exjVar.d;
        }
        a(btm.a((Context) getActivity(), (Drawable) ik.a(getResources(), R.drawable.kidsetup_ic_loveshack, null)));
        a(getString(R.string.password_confirmation_title, new Object[]{exmVar.c}));
        h(R.layout.kidsetup_content_password_confirmation);
        ((TextView) this.g.findViewById(R.id.password_confirmation_email_view)).setText(this.e.d().e);
        EnhancedNetworkImageView enhancedNetworkImageView = (EnhancedNetworkImageView) this.g.findViewById(R.id.password_confirmation_avatar);
        enhancedNetworkImageView.setDefaultImageResId(R.drawable.product_logo_avatar_circle_blue_color_48);
        coj.a(enhancedNetworkImageView, coj.a(exmVar.d));
        this.a = (TextInputLayout) this.g.findViewById(R.id.kidsetup_password_confirmation_input_layout);
        this.o = (TextInputEditText) this.g.findViewById(R.id.kidsetup_password_confirmation_edit_text);
        this.n.a.setText(R.string.common_cancel);
        this.n.a.setVisibility(0);
        this.n.b.setVisibility(0);
        this.n.b.setEnabled(false);
        this.o.setOnEditorActionListener(this);
        this.o.addTextChangedListener(this);
        return this.g;
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.a = null;
        this.o = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void e() {
        i();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.n.b.setEnabled(!TextUtils.isEmpty(editable) && this.n.isEnabled());
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6 && (keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 1)) {
            return false;
        }
        i();
        return true;
    }

    @Override // com.google.android.gms.kids.setup.fragment.geller.BaseOnboardingFragment
    protected final epf j() {
        return epf.PASSWORD_VERIFICATION;
    }

    public final void i() {
        String string = ((Editable) this.o.getText()).toString();
        if (!TextUtils.isEmpty(string)) {
            new cht(this.e, string).a(((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a);
        }
    }
}
