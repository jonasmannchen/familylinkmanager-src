package com.google.android.gms.kids.setup.fragment.geller;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimera.Activity;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.geller.AboutSupervisionFragment;
import com.google.android.gms.kids.setup.widget.EnhancedNetworkImageView;
import com.google.android.gms.kids.widget.CollapsibleInfoSectionView;
import flm.alh;
import flm.bgr;
import flm.btm;
import flm.btv;
import flm.bur;
import flm.cij;
import flm.cma;
import flm.cmj;
import flm.cmm;
import flm.cog;
import flm.coh;
import flm.cox;
import flm.coy;
import flm.cpt;
import flm.cpw;
import flm.dp;
import flm.dvl;
import flm.egt;
import flm.egv;
import flm.ejs;
import flm.ejt;
import flm.eoi;
import flm.epf;
import flm.fac;
import flm.fgy;
import flm.fin;
import flm.fio;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class AboutSupervisionFragment extends BaseOnboardingFragment implements cmm, cpw {
    private int a;

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.e.a(cma.a).a(this, new cox(this) { // from class: flm.cmb
            private final AboutSupervisionFragment a;

            {
                this.a = this;
            }

            @Override // flm.cox
            public final void a(Object obj) {
                exj exjVar = (exj) obj;
                coj.a((EnhancedNetworkImageView) this.a.g.findViewById(R.id.supervisee_avatar), coj.a((exjVar.d == null ? exm.h : exjVar.d).d));
            }
        });
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        a(btm.b(getActivity(), R.drawable.quantum_ic_supervisor_account_black_24));
        c(R.string.what_parents_can_supervise_title);
        h(R.layout.kidsetup_content_about_supervision);
        ((EnhancedNetworkImageView) this.g.findViewById(R.id.supervisee_avatar)).setDefaultImageResId(R.drawable.product_logo_avatar_circle_blue_color_48);
        ((TextView) this.g.findViewById(R.id.supervisee_email)).setText(this.e.d().e);
        this.n.a.setText(R.string.common_cancel);
        this.n.a.setVisibility(0);
        this.n.b.setVisibility(0);
        this.a = a(R.color.quantum_black_secondary_text);
        a(R.id.about_supervision_account_info_section, R.string.account_settings_section_bullet_1, R.string.account_settings_section_bullet_2);
        a(R.id.about_supervision_apps_info_section, R.string.apps_section_bullet_1, R.string.apps_section_bullet_2);
        a(R.id.about_supervision_location_info_section, R.string.location_section_bullet_1);
        a(R.id.about_supervision_screen_time_info_section, R.string.screen_time_section_bullet_1, R.string.screen_time_section_bullet_2, R.string.screen_time_section_bullet_3);
        a(R.id.about_supervision_google_info_section, R.string.google_section_bullet_1, R.string.google_section_bullet_2, R.string.google_section_bullet_3);
        TextView textView = (TextView) this.g.findViewById(R.id.what_parents_cant_do_bullets);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        Iterator it = Arrays.asList(Integer.valueOf(R.string.cant_do_bullet_1), Integer.valueOf(R.string.cant_do_bullet_2), Integer.valueOf(R.string.cant_do_bullet_3), Integer.valueOf(R.string.cant_do_bullet_4), Integer.valueOf(R.string.cant_do_bullet_5), Integer.valueOf(R.string.cant_do_bullet_6), Integer.valueOf(R.string.cant_do_bullet_7), Integer.valueOf(R.string.cant_do_bullet_8)).iterator();
        while (true) {
            String str2 = str;
            if (it.hasNext()) {
                spannableStringBuilder.append((CharSequence) str2).append((CharSequence) coh.a(getString(((Integer) it.next()).intValue()), textView.getCurrentTextColor()));
                str = "\n";
            } else {
                textView.setText(spannableStringBuilder);
                return this.g;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final boolean l() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void e() {
        fac facVar;
        cij cijVarD = this.e.d();
        if (cijVarD.z == null) {
            facVar = fac.d;
        } else {
            facVar = cijVarD.z;
        }
        if (facVar.c) {
            a(eoi.PERMALOCK_DIALOG_DISPLAYED);
            new cpt().show(getChildFragmentManager(), "PERMA_LOCK_DIALOG");
        } else {
            a(eoi.ALLOW_SUPERVISION_DIALOG_DISPLAYED);
            new cmj().show(getChildFragmentManager(), "ALLOW_SUPERVISION_DIALOG");
        }
        getChildFragmentManager().executePendingTransactions();
    }

    @Override // flm.cpw
    public final void a(cpt cptVar) {
        cptVar.dismiss();
        getChildFragmentManager().executePendingTransactions();
    }

    @Override // flm.cpw
    public final void b(cpt cptVar) {
        a(eoi.PERMALOCK_I_UNDERSTAND_CLICKED);
        a(eoi.ALLOW_SUPERVISION_DIALOG_DISPLAYED);
        new cmj().show(getChildFragmentManager(), "ALLOW_SUPERVISION_DIALOG");
        cptVar.dismiss();
        getChildFragmentManager().executePendingTransactions();
    }

    @Override // flm.cmm
    public final void i() {
        btv.b("MemberSpvsn", "onAllowSupervisionClicked", new Object[0]);
        a(eoi.ALLOW_SUPERVISION_ALLOW_CLICKED);
        final Activity activity = getActivity();
        final String str = this.e.d().e;
        List listAsList = Arrays.asList(Integer.valueOf(R.string.join_family_group_title), Integer.valueOf(R.string.join_family_group_description), Integer.valueOf(R.string.join_family_group_disclaimer), Integer.valueOf(R.string.join_button_label), Integer.valueOf(R.string.what_parents_can_supervise_title), Integer.valueOf(R.string.what_parents_can_supervise_description), Integer.valueOf(R.string.what_parents_cant_supervise_title), Integer.valueOf(R.string.what_parents_cant_supervise_description), Integer.valueOf(R.string.cant_do_bullet_1), Integer.valueOf(R.string.cant_do_bullet_2), Integer.valueOf(R.string.cant_do_bullet_3), Integer.valueOf(R.string.cant_do_bullet_4), Integer.valueOf(R.string.cant_do_bullet_5), Integer.valueOf(R.string.cant_do_bullet_6), Integer.valueOf(R.string.cant_do_bullet_7), Integer.valueOf(R.string.cant_do_bullet_8), Integer.valueOf(R.string.stop_supervision_disclaimer_text), Integer.valueOf(R.string.stop_supervision_disclaimer_title), Integer.valueOf(R.string.account_supervised_by), Integer.valueOf(R.string.named_account_supervised_by), Integer.valueOf(R.string.what_parents_can_manage_heading), Integer.valueOf(R.string.about_supervision_title), Integer.valueOf(R.string.account_settings_section_heading), Integer.valueOf(R.string.account_settings_section_bullet_1), Integer.valueOf(R.string.account_settings_section_bullet_2), Integer.valueOf(R.string.apps_section_heading), Integer.valueOf(R.string.apps_section_bullet_1), Integer.valueOf(R.string.apps_section_bullet_2), Integer.valueOf(R.string.location_section_heading), Integer.valueOf(R.string.location_section_bullet_1), Integer.valueOf(R.string.screen_time_section_heading), Integer.valueOf(R.string.screen_time_section_bullet_1), Integer.valueOf(R.string.screen_time_section_bullet_2), Integer.valueOf(R.string.screen_time_section_bullet_3), Integer.valueOf(R.string.google_section_heading), Integer.valueOf(R.string.google_section_bullet_1), Integer.valueOf(R.string.google_section_bullet_2), Integer.valueOf(R.string.google_section_bullet_3), Integer.valueOf(R.string.allow_supervision_title), Integer.valueOf(R.string.allow_supervision_description), Integer.valueOf(R.string.common_allow), Integer.valueOf(R.string.dont_allow_supervision));
        btv.b("MemberSpvsn", "Creating audit token", new Object[0]);
        ejt ejtVar = (ejt) ((fio) ejs.c.a(dp.au, (Object) null));
        fgy fgyVarA = fgy.a(alh.a());
        ejtVar.c();
        ejs ejsVar = (ejs) ejtVar.a;
        if (fgyVarA == null) {
            throw new NullPointerException();
        }
        ejsVar.a |= 1;
        ejsVar.b = fgyVarA;
        ejs ejsVar2 = (ejs) ((fin) ejtVar.h());
        egv egvVarA = bur.a.submit(new Callable(activity, str) { // from class: flm.cof
            private final Context a;
            private final String b;

            {
                this.a = activity;
                this.b = str;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context = this.a;
                String str2 = this.b;
                btv.b("MemberSpvsn", "Retrieved account id for audit logging", new Object[0]);
                return alv.d(context, str2);
            }
        });
        cog cogVar = new cog(activity, str, ejsVar2, listAsList);
        bgr bgrVar = bur.a;
        dvl.a(cogVar);
        egvVarA.a(new egt(egvVarA, cogVar), bgrVar);
        final String strEncodeToString = Base64.encodeToString(ejsVar2.b(), 2);
        this.e.a(new coy(strEncodeToString) { // from class: flm.cmc
            private final String a;

            {
                this.a = strEncodeToString;
            }

            @Override // flm.coy
            public final Object a(Object obj) {
                String str2 = this.a;
                cij cijVar = (cij) obj;
                fio fioVar = (fio) cijVar.a(dp.au, (Object) null);
                fioVar.a((fin) cijVar);
                cik cikVar = (cik) fioVar;
                cikVar.c();
                cij cijVar2 = (cij) cikVar.a;
                if (str2 == null) {
                    throw new NullPointerException();
                }
                cijVar2.a |= 8192;
                cijVar2.o = str2;
                return (cij) ((fin) cikVar.h());
            }
        });
        a(new Bundle());
    }

    @Override // flm.cmm
    public final void a(cmj cmjVar) {
        cmjVar.dismiss();
        getChildFragmentManager().executePendingTransactions();
    }

    @Override // com.google.android.gms.kids.setup.fragment.geller.BaseOnboardingFragment
    protected final epf j() {
        return epf.SUPERVISION_DISCLAIMER;
    }

    private final void a(int i, int... iArr) {
        CollapsibleInfoSectionView collapsibleInfoSectionView = (CollapsibleInfoSectionView) this.g.findViewById(i);
        collapsibleInfoSectionView.a().setTextColor(this.a);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        for (int i2 : iArr) {
            spannableStringBuilder.append((CharSequence) str).append((CharSequence) coh.a(getString(i2), this.a));
            str = "\n";
        }
        collapsibleInfoSectionView.a(spannableStringBuilder);
    }
}
