package com.google.android.gms.kids.setup.fragment;

import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import flm.aja;
import flm.ajb;
import flm.btm;
import flm.cia;
import flm.cij;
import flm.cjs;
import flm.coi;
import flm.coo;
import flm.coy;
import flm.cqd;
import flm.cqg;
import flm.cqi;
import flm.dvi;
import flm.dvl;
import flm.epf;
import flm.exj;
import flm.exm;
import flm.exo;
import flm.ri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public class DeviceNameFragment extends KidSetupFragment implements TextWatcher, TextView.OnEditorActionListener, cqi {
    private final cjs a = new cjs(this);
    private EditText o;

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        exj exjVar;
        exm exmVar;
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.d) {
            this.c.a(R.layout.kid_setup_content_device_name);
            cia ciaVarA = cia.a(this.e.d().b);
            if (ciaVarA == null) {
                ciaVarA = cia.UNSPECIFIED;
            }
            if (ciaVarA == cia.GELLER_FLOW) {
                if (this.c.d) {
                    ((ajb) this.c.b.a(ajb.class)).a(btm.b(getActivity(), R.drawable.quantum_ic_smartphone_black_24));
                }
                ((aja) this.c.b.a(aja.class)).a(R.string.supervisee_device_name_title);
                this.c.b(R.string.supervisee_device_name_subheading);
            } else {
                ((aja) this.c.b.a(aja.class)).a(R.string.device_name_title);
                this.c.b(R.string.device_name_subheading);
            }
        } else {
            h(R.layout.kidsetup_content_device_name);
            cia ciaVarA2 = cia.a(this.e.d().b);
            if (ciaVarA2 == null) {
                ciaVarA2 = cia.UNSPECIFIED;
            }
            if (ciaVarA2 == cia.GELLER_FLOW) {
                a(btm.b(getActivity(), R.drawable.quantum_ic_smartphone_black_24));
                c(R.string.supervisee_device_name_title);
                d(R.string.supervisee_device_name_subheading);
            } else {
                c(R.string.device_name_title);
                d(R.string.device_name_subheading);
            }
        }
        this.o = (EditText) this.g.findViewById(R.id.kidsetup_device_name_edit_text);
        if (this.e.d().k.isEmpty()) {
            ri riVarA = ri.a();
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
            exo exoVarA = exo.a(exmVar.g);
            if (exoVarA == null) {
                exoVarA = exo.UNKNOWN_GENDER;
            }
            final String string = getString(coi.a(exoVarA, R.string.device_name_suggestion_male, R.string.device_name_suggestion_female, R.string.device_name_suggestion_other), new Object[]{riVarA.a(exmVar.c), riVarA.a(Build.MODEL)});
            this.e.a(new coy(string) { // from class: flm.cjq
                private final String a;

                {
                    this.a = string;
                }

                @Override // flm.coy
                public final Object a(Object obj) {
                    String str = this.a;
                    cij cijVar = (cij) obj;
                    fio fioVar = (fio) cijVar.a(dp.au, (Object) null);
                    fioVar.a((fin) cijVar);
                    return (cij) ((fin) ((cik) fioVar).b(str).h());
                }
            });
        }
        this.o.setText(this.e.d().k);
        this.o.setSelection(this.o.getText().length());
        this.o.setOnEditorActionListener(this);
        this.o.addTextChangedListener(this);
        return this.g;
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public void onDestroyView() {
        super.onDestroyView();
        this.o.setOnEditorActionListener(null);
        this.o.removeTextChangedListener(this);
        this.o = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final dvi b() {
        return coo.a(this.e.d(), epf.DEVICE_NAME);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void c() {
        cqd.a(this).a(R.string.device_name_backtrap_dialog_title).b(R.string.device_name_backtrap_dialog_message).c(R.string.common_button_quit).d(R.string.common_cancel).a(false).a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void a(Bundle bundle) {
        final String string = ((EditText) dvl.a(this.o)).getText().toString();
        if (!TextUtils.isEmpty(string)) {
            this.e.a(new coy(string) { // from class: flm.cjr
                private final String a;

                {
                    this.a = string;
                }

                @Override // flm.coy
                public final Object a(Object obj) {
                    String str = this.a;
                    cij cijVar = (cij) obj;
                    fio fioVar = (fio) cijVar.a(dp.au, (Object) null);
                    fioVar.a((fin) cijVar);
                    return (cij) ((fin) ((cik) fioVar).b(str).h());
                }
            });
            super.a(bundle);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (this.d) {
            this.c.b().setEnabled(TextUtils.isEmpty(editable.toString()) ? false : true);
        } else {
            this.n.b.setEnabled(TextUtils.isEmpty(editable.toString()) ? false : true);
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6 && (keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 1)) {
            return false;
        }
        a((Bundle) null);
        return true;
    }

    @Override // flm.cqi
    public final cqg f_() {
        return this.a;
    }
}
