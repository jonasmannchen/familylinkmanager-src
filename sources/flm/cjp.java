package flm;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.AuthAddAccountPreCheckFragment;
import com.google.android.gms.kids.setup.widget.NonScrollableListView;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cjp extends cgw {
    private final /* synthetic */ AuthAddAccountPreCheckFragment a;

    public cjp(AuthAddAccountPreCheckFragment authAddAccountPreCheckFragment) {
        this.a = authAddAccountPreCheckFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a() {
        if (!this.a.d) {
            this.a.i(-1);
            return;
        }
        this.a.c.a(true);
        this.a.c.b(false);
        ((aja) this.a.c.b.a(aja.class)).a(R.string.please_wait);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a((DialogInterface.OnClickListener) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final /* synthetic */ void b(Object obj) {
        cex cexVar = (cex) obj;
        if (cexVar.a()) {
            this.a.a((Bundle) null);
            return;
        }
        if (cexVar.b()) {
            AuthAddAccountPreCheckFragment authAddAccountPreCheckFragment = this.a;
            if (authAddAccountPreCheckFragment.d) {
                authAddAccountPreCheckFragment.c.a(false);
                authAddAccountPreCheckFragment.c.b(true);
                ((aja) authAddAccountPreCheckFragment.c.b.a(aja.class)).a(R.string.cant_add_account_title);
                authAddAccountPreCheckFragment.c.a(R.layout.kid_setup_content_cant_add_account);
                authAddAccountPreCheckFragment.c.b().setVisibility(8);
                authAddAccountPreCheckFragment.c.c().setVisibility(0);
            } else {
                authAddAccountPreCheckFragment.j(-1);
                authAddAccountPreCheckFragment.c(R.string.cant_add_account_title);
                authAddAccountPreCheckFragment.h(R.layout.kid_setup_content_cant_add_account);
                authAddAccountPreCheckFragment.n.b.setVisibility(8);
                authAddAccountPreCheckFragment.n.a.setVisibility(0);
            }
            String str = authAddAccountPreCheckFragment.e.d().e;
            TextView textView = (TextView) authAddAccountPreCheckFragment.g.findViewById(R.id.cant_add_account_how_to_add_body);
            NonScrollableListView nonScrollableListView = (NonScrollableListView) authAddAccountPreCheckFragment.g.findViewById(R.id.cant_add_account_how_to_add_list);
            textView.setText(authAddAccountPreCheckFragment.getString(R.string.cant_add_account_how_to_add_body, new Object[]{str}));
            nonScrollableListView.setAdapter((ListAdapter) new cjo(authAddAccountPreCheckFragment.getActivity(), Arrays.asList(authAddAccountPreCheckFragment.getString(R.string.cant_add_account_how_to_item_1, new Object[]{str}), authAddAccountPreCheckFragment.getString(R.string.cant_add_account_how_to_item_2))));
            return;
        }
        this.a.k();
    }
}
