package com.google.android.gms.kids.setup.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.snackbar.Snackbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.AppDetailFragment;
import com.google.android.gms.kids.setup.widget.AppDetailDescriptionView;
import com.google.android.gms.kids.setup.widget.AppDetailHeaderView;
import com.google.android.gms.kids.setup.widget.AppDetailInfoView;
import com.google.android.gms.kids.setup.widget.AppDetailRatingView;
import com.google.android.gms.kids.setup.widget.EnhancedNetworkImageView;
import flm.aja;
import flm.bbx;
import flm.bbz;
import flm.chu;
import flm.cij;
import flm.coj;
import flm.coo;
import flm.cpp;
import flm.dvd;
import flm.dvi;
import flm.dvl;
import flm.epf;
import flm.eta;
import flm.ete;
import flm.etg;
import flm.ewz;
import flm.exj;
import flm.exm;
import flm.ezh;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public class AppDetailFragment extends KidSetupFragment {
    public String a;
    private chu o;

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = getArguments().getString("package_name");
        dvl.a(!TextUtils.isEmpty(this.a));
        this.o = (chu) dvl.a((chu) this.e.d.get(this.a));
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        exj exjVar;
        exm exmVar;
        ete eteVar;
        ewz ewzVar;
        ewz ewzVar2;
        ete eteVar2;
        ewz ewzVar3;
        ewz ewzVar4;
        ewz ewzVar5;
        ete eteVar3;
        ete eteVar4;
        String strConcat;
        ete eteVar5;
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.d) {
            this.c.a(R.layout.kid_setup_content_app_detail);
            this.c.e();
            ((aja) this.c.b.a(aja.class)).a(R.string.kidsetup_app_detail_title);
            this.c.b().setVisibility(8);
        } else {
            h(R.layout.kidsetup_content_app_detail);
            c(R.string.kidsetup_app_detail_title);
            this.n.setVisibility(8);
        }
        final AppDetailHeaderView appDetailHeaderView = (AppDetailHeaderView) this.g.findViewById(R.id.kidsetup_app_detail_header_view);
        final AppDetailDescriptionView appDetailDescriptionView = (AppDetailDescriptionView) this.g.findViewById(R.id.kidsetup_app_detail_description_view);
        TextView textView = (TextView) this.g.findViewById(R.id.kidsetup_app_detail_non_play_app_text_view);
        AppDetailRatingView appDetailRatingView = (AppDetailRatingView) this.g.findViewById(R.id.kidsetup_app_detail_rating_view);
        AppDetailInfoView appDetailInfoView = (AppDetailInfoView) this.g.findViewById(R.id.kidsetup_app_detail_info_view);
        View viewFindViewById = this.g.findViewById(R.id.kidsetup_app_detail_review_permissions);
        final chu chuVar = this.o;
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
        String str = exmVar.c;
        eta etaVar = chuVar.a;
        if (etaVar.c == null) {
            eteVar = ete.t;
        } else {
            eteVar = etaVar.c;
        }
        coj.a(appDetailHeaderView.a, chuVar.a);
        appDetailHeaderView.b.setText(eteVar.c);
        appDetailHeaderView.c.setText(eteVar.e);
        if (eteVar.m == null) {
            ewzVar = ewz.g;
        } else {
            ewzVar = eteVar.m;
        }
        String string = ewzVar.d;
        if (TextUtils.isEmpty(string)) {
            string = appDetailHeaderView.getContext().getString(R.string.kidsetup_app_selector_unknown_rating);
        }
        appDetailHeaderView.e.setText(string);
        if (eteVar.m == null) {
            ewzVar2 = ewz.g;
        } else {
            ewzVar2 = eteVar.m;
        }
        String str2 = ewzVar2.f;
        if (TextUtils.isEmpty(str2)) {
            appDetailHeaderView.d.setVisibility(8);
        } else {
            appDetailHeaderView.d.setVisibility(0);
            coj.a(appDetailHeaderView.d, str2);
        }
        appDetailHeaderView.g.setOnCheckedChangeListener(null);
        appDetailHeaderView.f.setOnClickListener(null);
        appDetailHeaderView.g.setChecked(chuVar.c);
        appDetailHeaderView.g.setContentDescription(eteVar.c);
        switch (chuVar.b - 1) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                appDetailHeaderView.g.setEnabled(true);
                appDetailHeaderView.g.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(chuVar) { // from class: flm.cpc
                    private final chu a;

                    {
                        this.a = chuVar;
                    }

                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        this.a.c = z;
                    }
                });
                appDetailHeaderView.f.setVisibility(0);
                appDetailHeaderView.f.setOnClickListener(new View.OnClickListener(appDetailHeaderView) { // from class: flm.cpd
                    private final AppDetailHeaderView a;

                    {
                        this.a = appDetailHeaderView;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.g.toggle();
                    }
                });
                break;
            case 1:
                appDetailHeaderView.g.setEnabled(false);
                appDetailHeaderView.f.setVisibility(8);
                break;
            case 2:
                appDetailHeaderView.g.setEnabled(false);
                appDetailHeaderView.f.setVisibility(0);
                final String string2 = appDetailHeaderView.getContext().getString(R.string.kidsetup_app_selector_enable_app_not_allowed, eteVar.c, str);
                appDetailHeaderView.f.setOnClickListener(new View.OnClickListener(string2) { // from class: flm.cpb
                    private final String a;

                    {
                        this.a = string2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Snackbar.a(view, this.a, 0).e();
                    }
                });
                break;
        }
        eta etaVar2 = this.o.a;
        if (etaVar2.c == null) {
            eteVar2 = ete.t;
        } else {
            eteVar2 = etaVar2.c;
        }
        if (eteVar2.m == null) {
            ewzVar3 = ewz.g;
        } else {
            ewzVar3 = eteVar2.m;
        }
        if (TextUtils.isEmpty(ewzVar3.f)) {
            appDetailRatingView.a.setVisibility(8);
        } else {
            appDetailRatingView.a.setVisibility(0);
            EnhancedNetworkImageView enhancedNetworkImageView = appDetailRatingView.a;
            if (eteVar2.m == null) {
                ewzVar4 = ewz.g;
            } else {
                ewzVar4 = eteVar2.m;
            }
            coj.a(enhancedNetworkImageView, ewzVar4.f);
        }
        if (eteVar2.m == null) {
            ewzVar5 = ewz.g;
        } else {
            ewzVar5 = eteVar2.m;
        }
        String string3 = ewzVar5.d;
        if (TextUtils.isEmpty(string3)) {
            string3 = appDetailRatingView.getContext().getString(R.string.kidsetup_app_selector_unknown_rating);
        }
        appDetailRatingView.b.setText(string3);
        String string4 = appDetailRatingView.getContext().getString(R.string.kidsetup_app_detail_rating_separator);
        if (eteVar2.q.size() == 0) {
            appDetailRatingView.c.setVisibility(8);
        } else {
            appDetailRatingView.c.setVisibility(0);
            appDetailRatingView.c.setText(dvd.a(string4).a((Iterable) eteVar2.q));
        }
        if (eteVar2.l.size() == 0) {
            appDetailRatingView.d.setVisibility(8);
        } else {
            appDetailRatingView.d.setVisibility(0);
            ArrayList arrayList = new ArrayList();
            Iterator it = eteVar2.l.iterator();
            while (it.hasNext()) {
                arrayList.add(((ezh) it.next()).b);
            }
            appDetailRatingView.d.setText(dvd.a(string4).a((Iterable) arrayList));
        }
        eta etaVar3 = this.o.a;
        if (etaVar3.c == null) {
            eteVar3 = ete.t;
        } else {
            eteVar3 = etaVar3.c;
        }
        etg etgVarA = etg.a(eteVar3.r);
        if (etgVarA == null) {
            etgVarA = etg.UNKNOWN_APP_SOURCE;
        }
        if (etgVarA != etg.GOOGLE_PLAY) {
            textView.setVisibility(0);
            appDetailDescriptionView.setVisibility(8);
            appDetailInfoView.setVisibility(8);
            viewFindViewById.setVisibility(8);
            this.g.findViewById(R.id.kidsetup_app_detail_info_divider).setVisibility(8);
            this.g.findViewById(R.id.kidsetup_app_detail_review_permissions_divider).setVisibility(8);
        } else {
            eta etaVar4 = this.o.a;
            if (etaVar4.c == null) {
                eteVar4 = ete.t;
            } else {
                eteVar4 = etaVar4.c;
            }
            TextView textView2 = appDetailInfoView.a;
            long j = eteVar4.k;
            if (j <= 10) {
                strConcat = NumberFormat.getInstance().format(j);
            } else {
                long jPow = (long) Math.pow(10.0d, (int) Math.log10(j));
                long j2 = jPow * (j / jPow);
                strConcat = NumberFormat.getInstance().format(j2);
                if (j > j2) {
                    strConcat = String.valueOf(strConcat).concat("+");
                }
            }
            textView2.setText(strConcat);
            appDetailInfoView.b.setText(eteVar4.e);
            appDetailInfoView.c.setText(eteVar4.f);
            if (!eteVar4.p.isEmpty()) {
                appDetailInfoView.d.setVisibility(0);
                appDetailInfoView.e.setVisibility(0);
                appDetailInfoView.e.setText(eteVar4.p);
            } else {
                appDetailInfoView.d.setVisibility(4);
                appDetailInfoView.e.setVisibility(4);
            }
            final chu chuVar2 = this.o;
            eta etaVar5 = chuVar2.a;
            if (etaVar5.c == null) {
                eteVar5 = ete.t;
            } else {
                eteVar5 = etaVar5.c;
            }
            appDetailDescriptionView.a.setText(eteVar5.h);
            if (eteVar5.g.isEmpty()) {
                appDetailDescriptionView.b.setVisibility(8);
            } else {
                appDetailDescriptionView.b.setVisibility(0);
                appDetailDescriptionView.b.setOnClickListener(new View.OnClickListener(appDetailDescriptionView, chuVar2) { // from class: flm.cpa
                    private final AppDetailDescriptionView a;
                    private final chu b;

                    {
                        this.a = appDetailDescriptionView;
                        this.b = chuVar2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AppDetailDescriptionView appDetailDescriptionView2 = this.a;
                        chu chuVar3 = this.b;
                        cbt cbtVarA = cce.a(appDetailDescriptionView2);
                        String str3 = chuVar3.a.b;
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("package_name", str3);
                        cbtVarA.a(R.id.kidsetup_action_show_app_detail_read_more, bundle2);
                    }
                });
            }
            if (eteVar5.n.size() == 0) {
                appDetailDescriptionView.c.setVisibility(8);
            } else {
                appDetailDescriptionView.c.setVisibility(0);
                appDetailDescriptionView.c.removeAllViews();
                Resources resources = appDetailDescriptionView.getContext().getResources();
                int dimension = (int) resources.getDimension(R.dimen.app_detail_description_preview_image_height);
                int dimension2 = (int) resources.getDimension(R.dimen.app_detail_description_preview_image_margin);
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 < eteVar5.n.size()) {
                        EnhancedNetworkImageView enhancedNetworkImageView2 = new EnhancedNetworkImageView(appDetailDescriptionView.getContext());
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, dimension);
                        if (i2 > 0) {
                            layoutParams.setMarginStart(dimension2);
                        }
                        enhancedNetworkImageView2.setLayoutParams(layoutParams);
                        enhancedNetworkImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        enhancedNetworkImageView2.setAdjustViewBounds(true);
                        enhancedNetworkImageView2.setImportantForAccessibility(2);
                        coj.a(enhancedNetworkImageView2, (String) eteVar5.n.get(i2));
                        appDetailDescriptionView.c.addView(enhancedNetworkImageView2);
                        i = i2 + 1;
                    }
                }
            }
            if (eteVar5.j > 0) {
                appDetailDescriptionView.d.setVisibility(0);
                String str3 = String.format("%.1f", Float.valueOf(eteVar5.i));
                appDetailDescriptionView.e.setText(str3);
                appDetailDescriptionView.e.setContentDescription(appDetailDescriptionView.getContext().getString(R.string.kidsetup_app_detail_rating_number_content_description, str3));
                appDetailDescriptionView.f.setRating(eteVar5.i);
                String str4 = NumberFormat.getInstance().format(eteVar5.j);
                appDetailDescriptionView.g.setText(str4);
                appDetailDescriptionView.g.setContentDescription(appDetailDescriptionView.getContext().getString(R.string.kidsetup_app_detail_number_of_ratings_content_description, str4));
            } else {
                appDetailDescriptionView.d.setVisibility(8);
            }
            if (bbz.GOOGLE_NOW_PACKAGE_NAME.equals(this.o.a.b)) {
                this.g.findViewById(R.id.kidsetup_app_detail_google_search_switch_container).setVisibility(0);
                this.g.findViewById(R.id.kidsetup_app_detail_google_search_switch_divider).setVisibility(0);
                if (getChildFragmentManager().findFragmentByTag("GoogleSearchSwitchFragment") == null) {
                    getChildFragmentManager().beginTransaction().add(R.id.kidsetup_app_detail_google_search_switch_container, new cpp(), "GoogleSearchSwitchFragment").commit();
                }
            }
            viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: flm.ciz
                private final AppDetailFragment a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppDetailFragment appDetailFragment = this.a;
                    cbt cbtVarA = cce.a(appDetailFragment);
                    String str5 = appDetailFragment.a;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("package_name", str5);
                    cbtVarA.a(R.id.kidsetup_action_show_app_permisison, bundle2);
                }
            });
        }
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final dvi b() {
        return coo.a(this.e.d(), epf.APP_DETAILS);
    }
}
