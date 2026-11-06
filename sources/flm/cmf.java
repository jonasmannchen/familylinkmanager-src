package flm;

import android.content.DialogInterface;
import android.widget.LinearLayout;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.geller.AdditionalAccountsInfoFragment;
import com.google.android.gms.kids.setup.widget.AccountView;
import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cmf extends cgw {
    public final /* synthetic */ AdditionalAccountsInfoFragment a;

    public cmf(AdditionalAccountsInfoFragment additionalAccountsInfoFragment) {
        this.a = additionalAccountsInfoFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.cmg
            private final cmf a;

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
        String str = this.a.e.d().e;
        LinearLayout linearLayout = (LinearLayout) this.a.g.findViewById(R.id.additional_accounts_list);
        linearLayout.removeAllViews();
        for (buh buhVar : (Collection) obj) {
            if (!str.equals(buhVar.b)) {
                AccountView accountView = new AccountView(this.a.getActivity());
                accountView.a(buhVar.b, buhVar.c, buhVar.e);
                linearLayout.addView(accountView);
            }
        }
    }
}
