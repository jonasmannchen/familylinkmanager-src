package com.google.android.gms.kids.features.timelimit;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.widget.PinCodeEditor;
import flm.btv;
import flm.byl;
import flm.byo;
import flm.byq;
import flm.cqd;
import flm.cqg;
import flm.cqi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class LockScreenLocalUnlockFragment extends Fragment implements TextWatcher, View.OnClickListener, TextView.OnEditorActionListener, cqi {
    public byl a;
    public TextInputLayout b;
    public PinCodeEditor c;
    private final byq d = new byq(this);
    private final byo e = new byo(this);
    private TextView f;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.a = (byl) activity;
    }

    public final void onDetach() {
        super.onDetach();
        this.a = null;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.kids_time_limit_local_unlock, viewGroup, false);
        this.b = (TextInputLayout) viewInflate.findViewById(R.id.kids_time_limit_local_unlock_editor_layout);
        this.c = (PinCodeEditor) viewInflate.findViewById(R.id.kids_time_limit_local_unlock_pin_code_editor);
        this.f = (TextView) viewInflate.findViewById(R.id.kids_time_limit_local_unlock_need_help);
        return viewInflate;
    }

    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        this.c.addTextChangedListener(this);
        this.c.setOnEditorActionListener(this);
        this.f.setOnClickListener(this);
        getLoaderManager().initLoader(1, (Bundle) null, this.d);
    }

    public final void onStart() {
        super.onStart();
        a();
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.b = null;
        this.c = null;
        this.f = null;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        btv.a("TimeLimit", "beforeTextChanged", new Object[0]);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        btv.a("TimeLimit", "onTextChanged", new Object[0]);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable.length() == 6) {
            getLoaderManager().restartLoader(1, Bundle.EMPTY, this.d).forceLoad();
        } else {
            this.c.a(false);
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
        if (view.getId() == R.id.kids_time_limit_local_unlock_need_help) {
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
