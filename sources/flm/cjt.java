package flm;

import android.accounts.Account;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.kids.setup.fragment.GoogleServicesFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cjt extends cgw {
    public final /* synthetic */ GoogleServicesFragment a;

    public cjt(GoogleServicesFragment googleServicesFragment) {
        this.a = googleServicesFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.cju
            private final cjt a;

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
        String str;
        cfa cfaVar = (cfa) obj;
        ((GoogleServicesFragment.FragmentViewModel) cin.a(this.a).a(GoogleServicesFragment.FragmentViewModel.class)).a.b((Object) null);
        if (cfaVar.b) {
            this.a.a((Bundle) null);
            return;
        }
        GoogleServicesFragment googleServicesFragment = this.a;
        Account account = cfaVar.a;
        if (!googleServicesFragment.a) {
            googleServicesFragment.a = true;
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            cid cidVarA = cid.a(googleServicesFragment.e.d().c);
            if (cidVarA == null) {
                cidVarA = cid.UNDEFINED;
            }
            switch (cidVarA.ordinal()) {
                case 2:
                case 5:
                case 8:
                    str = "glif_light";
                    break;
                case 3:
                case 9:
                    str = "glif_v2_light";
                    break;
                case 4:
                case 10:
                    str = "glif_v3_light";
                    break;
                case 6:
                case 7:
                default:
                    str = "material_light";
                    break;
            }
            bundle.putParcelable("account", account);
            bundle.putBoolean("is_new_account", false);
            bundle.putBoolean("is_setup_wizard", true);
            bundle.putBoolean("use_immersive_mode", false);
            bundle.putString("variant", "kids");
            bundle.putString("theme", str);
            bundle2.putString("theme", str);
            bundle.putParcelable("uiParameters", bundle2);
            googleServicesFragment.startActivityForResult(new Intent("com.google.android.gms.auth.GOOGLE_SERVICES").putExtras(bundle), 1);
            cih.a(googleServicesFragment.getActivity()).d = true;
        }
    }
}
