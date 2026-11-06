package com.google.android.gms.kids.setup.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.AccountRemovedFragment;
import com.google.android.gms.kids.setup.sentinel.DoneFragment;
import flm.aja;
import flm.as;
import flm.bg;
import flm.cce;
import flm.cgy;
import flm.cin;
import flm.cit;
import flm.civ;
import flm.coo;
import flm.cox;
import flm.dvi;
import flm.epf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public class AccountRemovedFragment extends KidSetupFragment {

    /* JADX INFO: compiled from: PG */
    public final class FragmentViewModel extends bg {
        public final as a = new as();
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a.a(this, new civ(this));
        if (bundle == null) {
            c_();
        }
        this.e.a(cit.a).a(this, new cox(this) { // from class: flm.ciu
            private final AccountRemovedFragment a;

            {
                this.a = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // flm.cox
            public final void a(Object obj) {
                AccountRemovedFragment accountRemovedFragment = this.a;
                exj exjVar = (exj) obj;
                exm exmVar = exjVar.d == null ? exm.h : exjVar.d;
                String str = exmVar.f;
                exo exoVarA = exo.a(exmVar.g);
                if (exoVarA == null) {
                    exoVarA = exo.UNKNOWN_GENDER;
                }
                String string = accountRemovedFragment.getString(coi.a(exoVarA, R.string.account_removed_subheading_male, R.string.account_removed_subheading_female, R.string.account_removed_subheading_other), new Object[]{str, exmVar.c});
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int iIndexOf = string.indexOf(str);
                spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf, str.length() + iIndexOf, 18);
                if (accountRemovedFragment.d) {
                    accountRemovedFragment.c.a(spannableStringBuilder);
                } else {
                    accountRemovedFragment.b(spannableStringBuilder);
                }
            }
        });
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.d) {
            ((aja) this.c.b.a(aja.class)).a(R.string.please_wait);
            this.c.a(true);
            this.c.b(false);
            this.c.b().setVisibility(8);
            this.c.c().setVisibility(8);
        } else {
            i(17);
            this.n.b.setVisibility(8);
            this.n.a.setVisibility(8);
        }
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final dvi b() {
        return coo.a(this.e.d(), epf.ACCOUNT_REMOVED);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void c() {
        cce.a(this).c(R.id.kidsetup_action_next);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void e() {
        cce.a(this).a(R.id.kidsetup_action_next, DoneFragment.a(new Intent("android.settings.ADD_ACCOUNT_SETTINGS").setFlags(268435456).putExtra("account_types", "com.google")));
    }

    public final void c_() {
        new cgy(this.e, false).a(((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a);
    }
}
