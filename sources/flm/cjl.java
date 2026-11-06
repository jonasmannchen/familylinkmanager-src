package flm;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.AppUpdateFragment;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cjl extends cgw {
    public final /* synthetic */ AppUpdateFragment a;

    public cjl(AppUpdateFragment appUpdateFragment) {
        this.a = appUpdateFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.cjm
            private final cjl a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.a.h();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final /* synthetic */ void b(Object obj) {
        eta etaVar;
        eta etaVar2;
        ete eteVar;
        ete eteVar2;
        List<chv> list = (List) obj;
        ((AppUpdateFragment.FragmentViewModel) cin.a(this.a).a(AppUpdateFragment.FragmentViewModel.class)).a.b((Object) null);
        if (list.isEmpty()) {
            this.a.a((Bundle) null);
            return;
        }
        if (this.a.d) {
            ((aja) this.a.c.b.a(aja.class)).a(R.string.kidsetup_app_update_title);
            this.a.c.a(false);
            this.a.c.b(true);
        } else {
            this.a.j(10);
        }
        LinearLayout linearLayout = (LinearLayout) this.a.g.findViewById(R.id.kidsetup_app_update_app_list);
        boolean z = true;
        for (chv chvVar : list) {
            if (chvVar.b == null) {
                etaVar = eta.f;
            } else {
                etaVar = chvVar.b;
            }
            String str = etaVar.b;
            chx chxVarA = chx.a(chvVar.c);
            if (chxVarA == null) {
                chxVarA = chx.NORMAL;
            }
            if (chxVarA == chx.DISABLED) {
                if (this.a.a.containsKey(str)) {
                    linearLayout.removeView((View) this.a.a.get(str));
                    this.a.a.remove(str);
                }
            } else {
                if (!this.a.a.containsKey(str)) {
                    cpl cplVar = new cpl(this.a.getActivity());
                    if (chvVar.b == null) {
                        etaVar2 = eta.f;
                    } else {
                        etaVar2 = chvVar.b;
                    }
                    coj.a(cplVar.g, etaVar2);
                    TextView textView = cplVar.h;
                    if (etaVar2.c == null) {
                        eteVar = ete.t;
                    } else {
                        eteVar = etaVar2.c;
                    }
                    textView.setText(eteVar.c);
                    TextView textView2 = cplVar.i;
                    if (etaVar2.c == null) {
                        eteVar2 = ete.t;
                    } else {
                        eteVar2 = etaVar2.c;
                    }
                    textView2.setText(eteVar2.e);
                    cplVar.j.setText(R.string.kidsetup_app_update_status_pending);
                    linearLayout.addView(cplVar);
                    this.a.a.put(str, cplVar);
                }
                chx chxVarA2 = chx.a(chvVar.c);
                if (chxVarA2 == null) {
                    chxVarA2 = chx.NORMAL;
                }
                if (chxVarA2 == chx.UPDATING) {
                    z = false;
                } else {
                    cpl cplVar2 = (cpl) this.a.a.get(str);
                    cplVar2.j.setText(R.string.kidsetup_app_update_status_done);
                    cplVar2.k.setVisibility(8);
                }
            }
        }
        if (z) {
            this.a.a((Bundle) null);
        }
    }
}
