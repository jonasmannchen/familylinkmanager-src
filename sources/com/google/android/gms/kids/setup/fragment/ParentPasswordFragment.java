package com.google.android.gms.kids.setup.fragment;

import android.content.Intent;
import android.net.Uri;
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
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.ParentPasswordFragment;
import com.google.android.gms.kids.setup.widget.EnhancedNetworkImageView;
import flm.aja;
import flm.as;
import flm.bg;
import flm.chr;
import flm.cia;
import flm.cij;
import flm.cin;
import flm.ckt;
import flm.ckw;
import flm.coi;
import flm.coj;
import flm.coo;
import flm.cox;
import flm.dvi;
import flm.dvl;
import flm.epf;
import flm.exj;
import flm.exm;
import flm.exo;
import flm.fin;
import flm.fjg;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public class ParentPasswordFragment extends KidSetupFragment implements TextWatcher, TextView.OnEditorActionListener {
    public TextInputLayout a;
    public TextInputEditText o;
    private exj p;
    private Button q;

    /* JADX INFO: compiled from: PG */
    public final class FragmentViewModel extends bg {
        public final as a = new as();
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        dvl.b(getArguments().containsKey("parent"));
        try {
            this.p = (exj) fin.b(exj.g, getArguments().getByteArray("parent"));
            ((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a.a(this, new ckw(this));
            this.e.a(ckt.a).a(this, new cox(this) { // from class: flm.cku
                private final ParentPasswordFragment a;

                {
                    this.a = this;
                }

                @Override // flm.cox
                public final void a(Object obj) {
                    String string;
                    ParentPasswordFragment parentPasswordFragment = this.a;
                    exj exjVar = (exj) obj;
                    exm exmVar = exjVar.d == null ? exm.h : exjVar.d;
                    cia ciaVarA = cia.a(parentPasswordFragment.e.d().b);
                    if (ciaVarA == null) {
                        ciaVarA = cia.UNSPECIFIED;
                    }
                    switch (ciaVarA.ordinal()) {
                        case 11:
                            exo exoVarA = exo.a(exmVar.g);
                            if (exoVarA == null) {
                                exoVarA = exo.UNKNOWN_GENDER;
                            }
                            string = parentPasswordFragment.getString(coi.a(exoVarA, R.string.parent_password_secondary_account_remove_subheading_male, R.string.parent_password_secondary_account_remove_subheading_female, R.string.parent_password_secondary_account_remove_subheading_other), new Object[]{exmVar.c});
                            break;
                        case 12:
                            exo exoVarA2 = exo.a(exmVar.g);
                            if (exoVarA2 == null) {
                                exoVarA2 = exo.UNKNOWN_GENDER;
                            }
                            string = parentPasswordFragment.getString(coi.a(exoVarA2, R.string.parent_password_secondary_account_add_subheading_male, R.string.parent_password_secondary_account_add_subheading_female, R.string.parent_password_secondary_account_add_subheading_other), new Object[]{exmVar.c});
                            break;
                        default:
                            string = parentPasswordFragment.getResources().getString(R.string.parent_password_subheading);
                            break;
                    }
                    if (parentPasswordFragment.d) {
                        parentPasswordFragment.c.a(string);
                    } else {
                        parentPasswordFragment.b(string);
                    }
                }
            });
        } catch (fjg e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        exm exmVar;
        String str;
        exj exjVar;
        exm exmVar2;
        String string;
        super.onCreateView(layoutInflater, viewGroup, bundle);
        exj exjVar2 = (exj) dvl.a(this.p);
        if (exjVar2.d == null) {
            exmVar = exm.h;
        } else {
            exmVar = exjVar2.d;
        }
        if (this.d) {
            this.c.a(R.layout.kid_setup_content_parent_password);
            ((aja) this.c.b.a(aja.class)).a(exmVar.f);
        } else {
            h(R.layout.kidsetup_content_parent_password);
            a(exmVar.f);
            this.i.setVisibility(8);
            this.j.setDefaultImageResId(R.drawable.quantum_logo_avatar_circle_blue_color_192);
            this.j.setVisibility(0);
            EnhancedNetworkImageView enhancedNetworkImageView = this.j;
            if (!exmVar.d.isEmpty()) {
                str = exmVar.d;
            } else {
                str = exmVar.e;
            }
            coj.a(enhancedNetworkImageView, coj.a(str));
        }
        cij cijVarD = this.e.d();
        if (cijVarD.h == null) {
            exjVar = exj.g;
        } else {
            exjVar = cijVarD.h;
        }
        if (exjVar.d == null) {
            exmVar2 = exm.h;
        } else {
            exmVar2 = exjVar.d;
        }
        cia ciaVarA = cia.a(this.e.d().b);
        if (ciaVarA == null) {
            ciaVarA = cia.UNSPECIFIED;
        }
        switch (ciaVarA.ordinal()) {
            case 11:
                exo exoVarA = exo.a(exmVar2.g);
                if (exoVarA == null) {
                    exoVarA = exo.UNKNOWN_GENDER;
                }
                string = getString(coi.a(exoVarA, R.string.parent_password_secondary_account_remove_subheading_male, R.string.parent_password_secondary_account_remove_subheading_female, R.string.parent_password_secondary_account_remove_subheading_other), new Object[]{exmVar2.c});
                break;
            case 12:
                exo exoVarA2 = exo.a(exmVar2.g);
                if (exoVarA2 == null) {
                    exoVarA2 = exo.UNKNOWN_GENDER;
                }
                string = getString(coi.a(exoVarA2, R.string.parent_password_secondary_account_add_subheading_male, R.string.parent_password_secondary_account_add_subheading_female, R.string.parent_password_secondary_account_add_subheading_other), new Object[]{exmVar2.c});
                break;
            default:
                string = getResources().getString(R.string.parent_password_subheading);
                break;
        }
        if (this.d) {
            this.c.a(string);
        } else {
            b(string);
        }
        this.a = (TextInputLayout) this.g.findViewById(R.id.kidsetup_parent_password_input_layout);
        this.o = (TextInputEditText) this.g.findViewById(R.id.kidsetup_parent_password_edit_text);
        this.q = (Button) this.g.findViewById(R.id.kidsetup_parent_forgot_password_button);
        this.q.setOnClickListener(new View.OnClickListener(this) { // from class: flm.ckv
            private final ParentPasswordFragment a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ParentPasswordFragment parentPasswordFragment = this.a;
                parentPasswordFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(parentPasswordFragment.getString(R.string.forgot_password_support_url))));
            }
        });
        if (this.d) {
            this.c.b().setEnabled(false);
        } else {
            this.n.b.setEnabled(false);
        }
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
        this.a = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void e() {
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
        if (this.d) {
            this.c.b().setEnabled(TextUtils.isEmpty(editable) ? false : this.c.e);
        } else {
            this.n.b.setEnabled(TextUtils.isEmpty(editable) ? false : this.n.isEnabled());
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6 && (keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 1)) {
            return false;
        }
        i();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final dvi b() {
        return coo.a(this.e.d(), epf.PARENT_PASSWORD);
    }

    public final void i() {
        if (!TextUtils.isEmpty((Editable) this.o.getText())) {
            new chr(this.e, ((exj) dvl.a(this.p)).b, ((Editable) this.o.getText()).toString()).a(((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a);
        }
    }
}
