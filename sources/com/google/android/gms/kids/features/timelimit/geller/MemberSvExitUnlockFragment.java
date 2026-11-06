package com.google.android.gms.kids.features.timelimit.geller;

import android.os.Bundle;
import android.support.design.textfield.TextInputEditText;
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
import com.google.android.chimera.Fragment;
import com.google.android.chimeraresources.R;
import flm.cah;
import flm.cai;
import flm.cqd;
import flm.cqg;
import flm.cqi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class MemberSvExitUnlockFragment extends Fragment implements TextWatcher, View.OnClickListener, TextView.OnEditorActionListener, cqi {
    public View a;
    public TextInputLayout b;
    public TextInputEditText c;
    private final cai d = new cai(this);
    private final cah e = new cah(this);

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.a = layoutInflater.inflate(R.layout.member_sv_exit_unlock, viewGroup, false);
        this.b = (TextInputLayout) this.a.findViewById(R.id.member_sv_exit_unlock_editor_layout);
        this.c = (TextInputEditText) this.a.findViewById(R.id.member_sv_exit_unlock_pin_code_editor);
        this.c.addTextChangedListener(this);
        this.c.setOnEditorActionListener(this);
        this.a.findViewById(R.id.member_sv_exit_unlock_need_help_button).setOnClickListener(this);
        getLoaderManager().initLoader(1, (Bundle) null, this.d);
        return this.a;
    }

    public final void onStart() {
        super.onStart();
        a();
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.a = null;
        this.b = null;
        this.c = null;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable.length() == 6) {
            getLoaderManager().restartLoader(1, new Bundle(), this.d).forceLoad();
        } else {
            this.b.b("");
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return keyEvent != null && keyEvent.getKeyCode() == 66 && keyEvent.getAction() == 1;
        }
        return true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.member_sv_exit_unlock_need_help_button) {
            cqd.a(this).a(R.string.local_unlock_need_help_dialog_title).c(R.string.close_button_label).a();
        }
    }

    public final void a() {
        if (this.c.isEnabled()) {
            this.c.requestFocus();
            ((InputMethodManager) getActivity().getSystemService("input_method")).showSoftInput(this.c, 1);
        }
    }

    @Override // flm.cqi
    public final /* synthetic */ cqg f_() {
        return this.e;
    }
}
