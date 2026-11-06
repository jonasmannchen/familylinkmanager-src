package flm;

import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.HideAppFailedFragment;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cka extends cgw {
    public final /* synthetic */ HideAppFailedFragment a;

    public cka(HideAppFailedFragment hideAppFailedFragment) {
        this.a = hideAppFailedFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a() {
        if (!this.a.d) {
            this.a.i(9);
        } else {
            ((aje) this.a.c.b.a(aje.class)).a(true);
            this.a.c.b(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.ckb
            private final cka a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.a.i();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final /* synthetic */ void b(Object obj) {
        ete eteVar;
        ete eteVar2;
        Map map = (Map) obj;
        if (this.a.d) {
            ((aje) this.a.c.b.a(aje.class)).a(false);
            this.a.c.b(true);
        } else {
            this.a.j(9);
        }
        LinearLayout linearLayout = (LinearLayout) this.a.g.findViewById(R.id.kid_setup_hide_app_failed_list);
        for (String str : this.a.a) {
            eta etaVar = (eta) map.get(str);
            cpn cpnVar = new cpn(this.a.getActivity());
            if (etaVar == null) {
                etaVar = (eta) ((fin) ((etb) ((fio) eta.f.a(dp.au, (Object) null))).a(str).a(((eti) ((fio) ete.t.a(dp.au, (Object) null))).a(str)).h());
            }
            coj.a(cpnVar.g, etaVar);
            PackageManager packageManager = cpnVar.getContext().getPackageManager();
            try {
                cpnVar.h.setText(packageManager.getApplicationLabel(packageManager.getPackageInfo(etaVar.b, btb.c).applicationInfo));
            } catch (PackageManager.NameNotFoundException e) {
                TextView textView = cpnVar.h;
                if (etaVar.c == null) {
                    eteVar = ete.t;
                } else {
                    eteVar = etaVar.c;
                }
                textView.setText(eteVar.c);
            }
            TextView textView2 = cpnVar.i;
            if (etaVar.c == null) {
                eteVar2 = ete.t;
            } else {
                eteVar2 = etaVar.c;
            }
            textView2.setText(eteVar2.e);
            linearLayout.addView(cpnVar);
        }
    }
}
