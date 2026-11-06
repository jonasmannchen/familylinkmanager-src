package flm;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.geller.PairingCodeFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cng extends cgw {
    public final /* synthetic */ PairingCodeFragment a;

    public cng(PairingCodeFragment pairingCodeFragment) {
        this.a = pairingCodeFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a() {
        this.a.o.setEnabled(false);
        this.a.p.setVisibility(0);
        this.a.n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        vw vwVarA = new vx(this.a.getActivity()).a(R.string.common_something_went_wrong).a(R.string.common_cancel, new DialogInterface.OnClickListener(this) { // from class: flm.cnh
            private final cng a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                cng cngVar = this.a;
                PairingCodeFragment pairingCodeFragment = cngVar.a;
                pairingCodeFragment.p.setVisibility(8);
                pairingCodeFragment.o.setText("");
                pairingCodeFragment.o.setEnabled(true);
                cngVar.a.i();
            }
        }).b(R.string.common_retry, new DialogInterface.OnClickListener(this) { // from class: flm.cni
            private final cng a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.a.o();
            }
        }).a();
        vwVarA.setCancelable(false);
        vwVarA.setCanceledOnTouchOutside(false);
        vwVarA.show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final /* synthetic */ void b(Object obj) {
        ((PairingCodeFragment.FragmentViewModel) cin.a(this.a).a(PairingCodeFragment.FragmentViewModel.class)).a.b((Object) null);
        this.a.p.setVisibility(8);
        if (((Boolean) obj).booleanValue()) {
            this.a.a(Bundle.EMPTY);
            return;
        }
        this.a.a.b(this.a.getString(R.string.pairing_code_error_message));
        PairingCodeFragment pairingCodeFragment = this.a;
        pairingCodeFragment.p.setVisibility(8);
        pairingCodeFragment.o.setText("");
        pairingCodeFragment.o.setEnabled(true);
    }
}
