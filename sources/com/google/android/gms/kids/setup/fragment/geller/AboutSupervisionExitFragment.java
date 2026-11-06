package com.google.android.gms.kids.setup.fragment.geller;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.KidSetupFragment;
import com.google.android.gms.kids.setup.fragment.geller.AboutSupervisionExitFragment;
import com.google.android.gms.kids.widget.CollapsibleInfoSectionView;
import flm.as;
import flm.bg;
import flm.cfh;
import flm.cfs;
import flm.chj;
import flm.cin;
import flm.clt;
import flm.clw;
import flm.cly;
import flm.clz;
import flm.coh;
import flm.cox;
import flm.dp;
import flm.dvi;
import flm.elf;
import flm.elg;
import flm.elz;
import flm.ema;
import flm.emh;
import flm.emi;
import flm.eoi;
import flm.epd;
import flm.epf;
import flm.fin;
import flm.fio;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class AboutSupervisionExitFragment extends KidSetupFragment {
    public final ClickableSpan a = new clz(this, new View.OnClickListener(this) { // from class: flm.cls
        private final AboutSupervisionExitFragment a;

        {
            this.a = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.a(new Bundle());
        }
    });
    public String o;

    /* JADX INFO: compiled from: PG */
    public final class FragmentViewModel extends bg {
        public final as a = new as();
        public final as b = new as();
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        FragmentViewModel fragmentViewModel = (FragmentViewModel) cin.a(this).a(FragmentViewModel.class);
        fragmentViewModel.a.a(this, new clw(this));
        fragmentViewModel.b.a(this, new cly(this));
        if (bundle == null) {
            new cfs(this.e).a(((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).b);
            i();
        }
        this.e.a(clt.a).a(this, new cox(this) { // from class: flm.clu
            private final AboutSupervisionExitFragment a;

            {
                this.a = this;
            }

            @Override // flm.cox
            public final void a(Object obj) {
                AboutSupervisionExitFragment aboutSupervisionExitFragment = this.a;
                String str = aboutSupervisionExitFragment.e.d().e;
                dur durVar = dur.a;
                dvi dviVarB = dur.a;
                dvi dviVarB2 = durVar;
                for (exj exjVar : ((ezu) obj).b) {
                    exq exqVarA = exq.a(exjVar.c);
                    if (exqVarA == null) {
                        exqVarA = exq.UNKNOWN_FAMILY_ROLE;
                    }
                    if (exqVarA == exq.HEAD_OF_HOUSEHOLD) {
                        dviVarB2 = dvi.b(exjVar);
                    } else {
                        dviVarB = str.equals((exjVar.d == null ? exm.h : exjVar.d).f) ? dvi.b(exjVar) : dviVarB;
                    }
                }
                if (dviVarB2.a()) {
                    exj exjVar2 = (exj) dviVarB2.b();
                    aboutSupervisionExitFragment.g.findViewById(R.id.family_manager_progress_bar).setVisibility(8);
                    TextView textView = (TextView) aboutSupervisionExitFragment.g.findViewById(R.id.family_manager_email);
                    textView.setText((exjVar2.d == null ? exm.h : exjVar2.d).f);
                    textView.setVisibility(0);
                }
                if (dviVarB.a()) {
                    exj exjVar3 = (exj) dviVarB.b();
                    if ((exjVar3.f == null ? fak.c : exjVar3.f).b) {
                        return;
                    }
                    dvi dviVarA = dviVarB2.a(clv.a);
                    aboutSupervisionExitFragment.g.findViewById(R.id.set_up_without_knowledge_heading).setVisibility(0);
                    TextView textView2 = (TextView) aboutSupervisionExitFragment.g.findViewById(R.id.set_up_without_knowledge_content);
                    textView2.setVisibility(0);
                    String string = dviVarA.a() ? aboutSupervisionExitFragment.getString(R.string.set_up_without_knowledge_description_v2, new Object[]{aboutSupervisionExitFragment.o, dviVarA.b()}) : aboutSupervisionExitFragment.getString(R.string.set_up_without_knowledge_description_no_parent_name_v2, new Object[]{aboutSupervisionExitFragment.o});
                    SpannableString spannableString = new SpannableString(string);
                    AboutSupervisionExitFragment.a(spannableString, string, aboutSupervisionExitFragment.o, aboutSupervisionExitFragment.a);
                    textView2.setMovementMethod(LinkMovementMethod.getInstance());
                    textView2.setText(spannableString);
                    bss.a(textView2);
                    aboutSupervisionExitFragment.g.findViewById(R.id.dont_want_supervision_heading).setVisibility(0);
                    TextView textView3 = (TextView) aboutSupervisionExitFragment.g.findViewById(R.id.dont_want_supervision_content);
                    textView3.setVisibility(0);
                    String string2 = aboutSupervisionExitFragment.getString(R.string.dont_want_supervision_description, new Object[]{aboutSupervisionExitFragment.o});
                    SpannableString spannableString2 = new SpannableString(string2);
                    AboutSupervisionExitFragment.a(spannableString2, string2, aboutSupervisionExitFragment.o, aboutSupervisionExitFragment.a);
                    textView3.setMovementMethod(LinkMovementMethod.getInstance());
                    textView3.setText(spannableString2);
                    bss.a(textView3);
                }
            }
        });
        c(R.string.about_supervision_title);
        h(R.layout.kidsetup_content_about_supervision_exit);
        int iA = a(R.color.quantum_black_secondary_text);
        a(R.id.about_supervision_account_info_section, iA, R.string.account_settings_section_bullet_1, R.string.account_settings_section_bullet_2);
        a(R.id.apps_info_section, iA, R.string.apps_section_bullet_1, R.string.apps_section_bullet_2);
        a(R.id.location_info_section, iA, R.string.location_section_bullet_1);
        a(R.id.screen_time_info_section, iA, R.string.screen_time_section_bullet_1, R.string.screen_time_section_bullet_2, R.string.screen_time_section_bullet_3);
        a(R.id.google_info_section, iA, R.string.google_section_bullet_1, R.string.google_section_bullet_2, R.string.google_section_bullet_3);
        b(R.id.not_enough_screen_time_section, R.string.not_enough_screen_time_description, R.string.not_enough_screen_time_bullet_1, R.string.not_enough_screen_time_bullet_2);
        b(R.id.apps_are_blocked_section, R.string.apps_are_blocked_description, R.string.apps_are_blocked_bullet_1, R.string.apps_are_blocked_bullet_2);
        b(R.id.location_tracking_section, R.string.location_tracking_description, R.string.location_tracking_bullet_1, R.string.location_tracking_bullet_2);
        this.o = getString(R.string.stop_supervision_link_text);
        this.n.setVisibility(8);
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void c() {
        k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void a(Bundle bundle) {
        new chj(this.e, eoi.ABOUT_SUPERVISION_STOP_SUPERVISION_CLICKED, (elz) b().b()).a((as) null);
        super.a(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final dvi b() {
        return dvi.b((elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a(((emi) ((fio) emh.h.a(dp.au, (Object) null))).a(epd.MEMBER_SV_ABOUT_SUPERVISION).a(this.e.d().d).a(((elg) ((fio) elf.c.a(dp.au, (Object) null))).a(epf.ABOUT_SUPERVISION))).h()));
    }

    public final void i() {
        new cfh(this.e, false).a(((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a);
    }

    private final void a(int i, int i2, int... iArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CollapsibleInfoSectionView collapsibleInfoSectionView = (CollapsibleInfoSectionView) this.g.findViewById(i);
        collapsibleInfoSectionView.a().setTextColor(i2);
        int length = iArr.length;
        boolean z = true;
        int i3 = 0;
        while (i3 < length) {
            int i4 = iArr[i3];
            if (!z) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            spannableStringBuilder.append((CharSequence) coh.a(getString(i4), i2));
            i3++;
            z = false;
        }
        collapsibleInfoSectionView.a(spannableStringBuilder);
    }

    private final void b(int i, int i2, int... iArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CollapsibleInfoSectionView collapsibleInfoSectionView = (CollapsibleInfoSectionView) this.g.findViewById(i);
        collapsibleInfoSectionView.b = null;
        collapsibleInfoSectionView.a.removeAllViews();
        View viewInflate = View.inflate(collapsibleInfoSectionView.getContext(), R.layout.about_supervision_collapsible_info_section, collapsibleInfoSectionView.a);
        ((TextView) viewInflate.findViewById(R.id.about_supervision_section_description)).setText(i2);
        TextView textView = (TextView) viewInflate.findViewById(R.id.about_supervision_section_bullets);
        int length = iArr.length;
        boolean z = true;
        int i3 = 0;
        while (i3 < length) {
            int i4 = iArr[i3];
            if (!z) {
                spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) "\n");
            }
            spannableStringBuilder.append((CharSequence) coh.a(getString(i4), textView.getCurrentTextColor()));
            i3++;
            z = false;
        }
        textView.setText(spannableStringBuilder);
    }

    public static void a(SpannableString spannableString, String str, String str2, ClickableSpan clickableSpan) {
        int iLastIndexOf = str.lastIndexOf(str2);
        spannableString.setSpan(clickableSpan, iLastIndexOf, str2.length() + iLastIndexOf, 0);
    }
}
