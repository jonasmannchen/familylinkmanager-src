package flm;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.AccountRemovedConfirmationFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cir extends cgw {
    public final /* synthetic */ AccountRemovedConfirmationFragment a;

    public cir(AccountRemovedConfirmationFragment accountRemovedConfirmationFragment) {
        this.a = accountRemovedConfirmationFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a() {
        if (!this.a.d) {
            this.a.i(17);
            return;
        }
        ((aja) this.a.c.b.a(aja.class)).a(R.string.please_wait);
        this.a.c.a(true);
        this.a.c.b(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.cis
            private final cir a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.a.b_();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final /* synthetic */ void b(Object obj) {
        String str = this.a.e.d().e;
        String string = this.a.getString(R.string.account_removed_confirmation_subheading, new Object[]{str});
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int iIndexOf = string.indexOf(str);
        spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf, str.length() + iIndexOf, 18);
        if (this.a.d) {
            this.a.c.a(false);
            this.a.c.b(true);
            ((aja) this.a.c.b.a(aja.class)).a(R.string.account_removed_title);
            this.a.c.a(spannableStringBuilder);
            this.a.c.b().setVisibility(0);
            return;
        }
        this.a.j(17);
        this.a.n.b.setVisibility(0);
        this.a.b(spannableStringBuilder);
    }
}
