package flm;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.InitializeDeviceSetupFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cke extends cgw {
    private final /* synthetic */ InitializeDeviceSetupFragment a;

    public cke(InitializeDeviceSetupFragment initializeDeviceSetupFragment) {
        this.a = initializeDeviceSetupFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        if (exc instanceof cgf) {
            cce.a(this.a).c(R.id.kidsetup_action_reject_sign_in);
            return;
        }
        final InitializeDeviceSetupFragment initializeDeviceSetupFragment = this.a;
        cij cijVarD = initializeDeviceSetupFragment.e.d();
        if (cijVarD.g) {
            cia ciaVarA = cia.a(cijVarD.b);
            if (ciaVarA == null) {
                ciaVarA = cia.UNSPECIFIED;
            }
            if (ciaVarA == cia.ADD_ACCOUNT_FLOW) {
                vw vwVarA = new vx(initializeDeviceSetupFragment.getActivity()).a(R.string.remove_account_title_text).a(initializeDeviceSetupFragment.getString(R.string.remove_account_content_text, new Object[]{cijVarD.e})).a(R.string.close_button_label, new DialogInterface.OnClickListener(initializeDeviceSetupFragment) { // from class: flm.ckc
                    private final InitializeDeviceSetupFragment a;

                    {
                        this.a = initializeDeviceSetupFragment;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.a.k();
                    }
                }).a();
                vwVarA.setCancelable(false);
                vwVarA.setCanceledOnTouchOutside(false);
                vwVarA.show();
                return;
            }
        }
        initializeDeviceSetupFragment.a(new DialogInterface.OnClickListener(initializeDeviceSetupFragment) { // from class: flm.ckd
            private final InitializeDeviceSetupFragment a;

            {
                this.a = initializeDeviceSetupFragment;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.i();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final /* synthetic */ void b(Object obj) {
        this.a.a((Bundle) null);
    }
}
