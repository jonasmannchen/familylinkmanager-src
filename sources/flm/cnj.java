package flm;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.geller.PasswordConfirmationFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cnj extends cgw {
    public final /* synthetic */ PasswordConfirmationFragment a;

    public cnj(PasswordConfirmationFragment passwordConfirmationFragment) {
        this.a = passwordConfirmationFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a() {
        this.a.i(15);
        this.a.o.setEnabled(false);
        this.a.n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.cnk
            private final cnj a;

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
        ((PasswordConfirmationFragment.FragmentViewModel) cin.a(this.a).a(PasswordConfirmationFragment.FragmentViewModel.class)).a.b((Object) null);
        if (((dvi) obj).a()) {
            this.a.a((Bundle) null);
            return;
        }
        this.a.j(15);
        this.a.o.setText("");
        this.a.a.b(this.a.getString(R.string.parent_password_wrong));
        this.a.o.setEnabled(true);
        PasswordConfirmationFragment passwordConfirmationFragment = this.a;
        if (passwordConfirmationFragment.o.isEnabled()) {
            passwordConfirmationFragment.o.requestFocus();
            ((InputMethodManager) passwordConfirmationFragment.getActivity().getSystemService("input_method")).showSoftInput(passwordConfirmationFragment.o, 1);
        }
    }
}
