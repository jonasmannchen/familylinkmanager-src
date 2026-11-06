package com.google.android.gms.kids.setup.fragment.geller;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.geller.ErrorFragment;
import com.google.android.gms.kids.widget.TextViewWithActionLink;
import flm.cor;
import flm.dyu;
import flm.epf;
import flm.faq;
import flm.faw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class ErrorFragment extends BaseOnboardingFragment {
    private TextViewWithActionLink a;

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null && getArguments().getBoolean("clear_pairing_state", false)) {
            this.e.a(cor.a);
        }
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        h(R.layout.kidsetup_content_error);
        this.a = (TextViewWithActionLink) this.g.findViewById(R.id.error_description);
        b(R.drawable.quantum_ic_error_outline_grey600_24);
        a(getString(getArguments().getInt("error_title", R.string.generic_error_title)));
        if (getArguments().containsKey("error_help_link")) {
            this.a.a(getString(R.string.common_learn_more), getString(getArguments().getInt("error_help_link")), null);
        }
        if (getArguments().containsKey("error_description_args")) {
            a(getArguments().getInt("error_description", R.string.generic_error_description), getArguments().getStringArrayList("error_description_args").toArray());
        } else {
            a(getArguments().getInt("error_description", R.string.generic_error_description), new Object[0]);
        }
        f(R.drawable.kidsetup_error);
        this.n.b.setVisibility(8);
        a(this.n.c, getArguments().getInt("nav_next_type", 1));
        a(this.n.a, getArguments().getInt("nav_back_type", 0));
        return this.g;
    }

    @Override // com.google.android.gms.kids.setup.fragment.geller.BaseOnboardingFragment
    protected final epf j() {
        return epf.ERROR;
    }

    private final void a(int i, Object... objArr) {
        this.a.setText(getString(i, objArr));
    }

    private final void a(Button button, int i) {
        switch (i) {
            case 1:
                button.setVisibility(0);
                button.setText(R.string.generic_error_start_over_label);
                button.setOnClickListener(new View.OnClickListener(this) { // from class: flm.cmo
                    private final ErrorFragment a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.k();
                    }
                });
                break;
            case 2:
                button.setVisibility(0);
                button.setText(R.string.switch_account_label);
                button.setOnClickListener(new View.OnClickListener(this) { // from class: flm.cmp
                    private final ErrorFragment a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.k();
                    }
                });
                break;
            case 3:
                button.setVisibility(0);
                button.setText(R.string.view_family_group_label);
                button.setOnClickListener(new View.OnClickListener(this) { // from class: flm.cmq
                    private final ErrorFragment a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ErrorFragment errorFragment = this.a;
                        errorFragment.startActivityForResult(bmq.a(new bms(errorFragment.e.d().e, "com.google.android.gms")), 1);
                    }
                });
                break;
            default:
                button.setVisibility(8);
                break;
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            k();
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public static Bundle a(faq faqVar, faw fawVar) {
        switch (faqVar.ordinal()) {
            case 1:
            case 3:
                Bundle bundle = new Bundle();
                bundle.putInt("error_title", R.string.canceled_error_title);
                bundle.putInt("error_description", R.string.canceled_error_description);
                bundle.putInt("nav_back_type", 0);
                bundle.putInt("nav_next_type", 1);
                bundle.putBoolean("clear_pairing_state", true);
                return bundle;
            case 2:
            case 4:
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putInt("error_title", R.string.generic_error_title);
                bundle2.putInt("error_description", R.string.generic_error_description);
                bundle2.putInt("nav_back_type", 0);
                bundle2.putInt("nav_next_type", 1);
                bundle2.putBoolean("clear_pairing_state", true);
                return bundle2;
            case 5:
                Bundle bundle3 = new Bundle();
                bundle3.putInt("error_title", R.string.generic_error_title);
                bundle3.putInt("error_description", R.string.play_country_mismatch_error_description);
                bundle3.putStringArrayList("error_description_args", dyu.a(fawVar.c));
                bundle3.putInt("error_help_link", R.string.play_country_learn_more_url);
                bundle3.putInt("nav_back_type", 2);
                bundle3.putInt("nav_next_type", 3);
                bundle3.putBoolean("clear_pairing_state", true);
                return bundle3;
            case 6:
                Bundle bundle4 = new Bundle();
                bundle4.putInt("error_title", R.string.switch_limit_error_title);
                bundle4.putInt("error_description", R.string.switch_limit_error_description);
                bundle4.putStringArrayList("error_description_args", dyu.a(fawVar.c, fawVar.d));
                bundle4.putInt("nav_back_type", 0);
                bundle4.putInt("nav_next_type", 1);
                bundle4.putBoolean("clear_pairing_state", true);
                return bundle4;
            case 7:
                Bundle bundle5 = new Bundle();
                bundle5.putInt("error_title", R.string.already_in_family_error_title);
                bundle5.putInt("error_description", R.string.already_in_family_error_description);
                bundle5.putInt("nav_back_type", 2);
                bundle5.putInt("nav_next_type", 3);
                bundle5.putBoolean("clear_pairing_state", true);
                return bundle5;
            case 8:
                Bundle bundle6 = new Bundle();
                bundle6.putInt("error_title", R.string.generic_error_title);
                bundle6.putInt("error_description", R.string.blocked_parent_error_description);
                bundle6.putStringArrayList("error_description_args", dyu.a(fawVar.d));
                bundle6.putInt("error_help_link", R.string.unblock_account_learn_more_url);
                bundle6.putInt("nav_back_type", 0);
                bundle6.putInt("nav_next_type", 1);
                bundle6.putBoolean("clear_pairing_state", true);
                return bundle6;
        }
    }
}
