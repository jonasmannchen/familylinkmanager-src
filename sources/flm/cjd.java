package flm;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.snackbar.Snackbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.AppSelectorFragment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cjd extends cqc {
    public List a = new ArrayList();
    public final /* synthetic */ AppSelectorFragment b;

    public cjd(AppSelectorFragment appSelectorFragment) {
        this.b = appSelectorFragment;
    }

    @Override // flm.cqc
    public final void a() {
        this.b.b = true;
        if (this.b.d) {
            this.b.c.d().setVisibility(8);
            this.b.c.b().setVisibility(0);
        } else {
            this.b.n.d.setVisibility(8);
            this.b.n.b.setVisibility(0);
        }
    }

    @Override // flm.cqc
    public final int b() {
        return this.a.size();
    }

    @Override // flm.cqc
    public final int a(int i) {
        return ((cig) this.a.get(i)).b.size();
    }

    @Override // flm.cqc
    public final View c() {
        return this.b.h;
    }

    @Override // flm.cqc
    public final View a(ViewGroup viewGroup) {
        View viewInflate;
        int i;
        int i2;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.b.getActivity());
        if (this.b.d) {
            if (this.b.c.d) {
                i2 = R.layout.suw_app_selector_list_header_glif;
            } else {
                i2 = R.layout.suw_app_selector_list_header;
            }
            viewInflate = layoutInflaterFrom.inflate(i2, viewGroup, false);
        } else {
            viewInflate = layoutInflaterFrom.inflate(R.layout.view_app_selector_list_header, viewGroup, false);
        }
        AppSelectorFragment appSelectorFragment = this.b;
        cia ciaVarA = cia.a(this.b.e.d().b);
        if (ciaVarA == null) {
            ciaVarA = cia.UNSPECIFIED;
        }
        if (ciaVarA == cia.GELLER_FLOW) {
            i = R.string.kidsetup_supervisee_app_selector_description;
        } else {
            i = R.string.kidsetup_app_selector_description;
        }
        String string = appSelectorFragment.getString(i, new Object[]{this.b.e.d().k});
        TextView textView = (TextView) viewInflate.findViewById(R.id.kidsetup_app_selector_intro_text_view);
        textView.setText(string);
        com.a(this.b.getActivity(), textView, new View.OnClickListener(this) { // from class: flm.cje
            private final cjd a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cjd cjdVar = this.a;
                cia ciaVarA2 = cia.a(cjdVar.b.e.d().b);
                if (ciaVarA2 == null) {
                    ciaVarA2 = cia.UNSPECIFIED;
                }
                if (ciaVarA2 == cia.GELLER_FLOW) {
                    cjdVar.b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(cjdVar.b.getString(R.string.apps_review_learn_more_url))));
                } else {
                    cqd.a(cjdVar.b).b(R.string.kidsetup_app_selector_dialog_message).d(R.string.common_ok).a();
                }
            }
        });
        return viewInflate;
    }

    @Override // flm.cqc
    public final View a(int i, View view) {
        cpf cpfVar;
        if (view != null) {
            cpfVar = (cpf) view;
        } else {
            cpfVar = new cpf(this.b.getActivity());
        }
        final ewz ewzVar = (ewz) b(i);
        final FragmentManager childFragmentManager = this.b.getChildFragmentManager();
        if (TextUtils.isEmpty(ewzVar.f)) {
            cpfVar.a.setVisibility(8);
        } else {
            cpfVar.a.setVisibility(0);
            coj.a(cpfVar.a, ewzVar.f);
        }
        cpfVar.b.setText(ewzVar.d);
        if (TextUtils.isEmpty(ewzVar.e)) {
            cpfVar.c.setVisibility(8);
            cpfVar.c.setContentDescription(null);
            cpfVar.c.setOnClickListener(null);
        } else {
            cpfVar.c.setVisibility(0);
            cpfVar.c.setContentDescription(cpfVar.getContext().getString(R.string.kidsetup_app_selector_rating_info_content_description, ewzVar.d));
            cpfVar.c.setOnClickListener(new View.OnClickListener(ewzVar, childFragmentManager) { // from class: flm.cpg
                private final ewz a;
                private final FragmentManager b;

                {
                    this.a = ewzVar;
                    this.b = childFragmentManager;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ewz ewzVar2 = this.a;
                    FragmentManager fragmentManager = this.b;
                    coz cozVar = new coz();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("display_category", ewzVar2.b());
                    cozVar.setArguments(bundle);
                    cozVar.show(fragmentManager, null);
                }
            });
        }
        return cpfVar;
    }

    @Override // flm.cqc
    public final View a(int i, int i2, View view) {
        final cph cphVar;
        exj exjVar;
        exm exmVar;
        ete eteVar;
        int i3;
        final chu chuVar = (chu) a(i, i2);
        if (view != null) {
            cphVar = (cph) view;
        } else {
            cphVar = new cph(this.b.getActivity());
        }
        cij cijVarD = this.b.e.d();
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
        coj.a(cphVar.a, chuVar.a);
        cphVar.b.setText(eteVar.c);
        cphVar.b.setContentDescription(cphVar.getContext().getString(R.string.kidsetup_app_selector_view_details_content_description, eteVar.c));
        cphVar.e.setOnCheckedChangeListener(null);
        cphVar.d.setOnClickListener(null);
        cphVar.e.setChecked(chuVar.c);
        cphVar.e.setContentDescription(eteVar.c);
        switch (chuVar.b - 1) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                cphVar.e.setEnabled(true);
                cphVar.e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(chuVar) { // from class: flm.cpj
                    private final chu a;

                    {
                        this.a = chuVar;
                    }

                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        this.a.c = z;
                    }
                });
                cphVar.d.setVisibility(0);
                cphVar.d.setOnClickListener(new View.OnClickListener(cphVar) { // from class: flm.cpk
                    private final cph a;

                    {
                        this.a = cphVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.a.e.toggle();
                    }
                });
                break;
            case 1:
                cphVar.e.setEnabled(false);
                cphVar.d.setVisibility(8);
                break;
            case 2:
                cphVar.e.setEnabled(false);
                cphVar.d.setVisibility(0);
                final String string = cphVar.getContext().getString(R.string.kidsetup_app_selector_enable_app_not_allowed, eteVar.c, str);
                cphVar.d.setOnClickListener(new View.OnClickListener(string) { // from class: flm.cpi
                    private final String a;

                    {
                        this.a = string;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Snackbar.a(view2, this.a, 0).e();
                    }
                });
                break;
        }
        if (chuVar.a()) {
            TextView textView = cphVar.c;
            if (chuVar.b()) {
                i3 = R.string.kidsetup_app_selector_google_search_on;
            } else {
                i3 = R.string.kidsetup_app_selector_google_search_off;
            }
            textView.setText(i3);
            cphVar.c.setVisibility(0);
            cphVar.f.setVisibility(0);
        } else {
            cphVar.c.setVisibility(8);
            cphVar.f.setVisibility(8);
        }
        cphVar.setOnClickListener(new View.OnClickListener(this, chuVar) { // from class: flm.cjf
            private final cjd a;
            private final chu b;

            {
                this.a = this;
                this.b = chuVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                cjd cjdVar = this.a;
                chu chuVar2 = this.b;
                AppSelectorFragment appSelectorFragment = cjdVar.b;
                if ("com.google.android.youtube".equals(chuVar2.a.b) && chuVar2.b == dp.G && !chuVar2.c) {
                    new cpo().show(appSelectorFragment.getChildFragmentManager(), null);
                    return;
                }
                cbt cbtVarA = cce.a(appSelectorFragment);
                String str2 = chuVar2.a.b;
                Bundle bundle = new Bundle();
                bundle.putString("package_name", str2);
                cbtVarA.a(R.id.kidsetup_action_show_app_detail, bundle);
            }
        });
        return cphVar;
    }

    @Override // flm.cqc
    public final /* synthetic */ Object a(int i, int i2) {
        return (chu) ((cig) this.a.get(i)).b.get(i2);
    }

    @Override // flm.cqc
    public final /* synthetic */ Object b(int i) {
        return ((cig) this.a.get(i)).a;
    }
}
