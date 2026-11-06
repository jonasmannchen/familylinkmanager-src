package flm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import com.google.android.chimera.Fragment;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cpp extends Fragment implements View.OnClickListener, cqi {
    public KidSetupViewModel a;
    public Switch b;
    private final cpr c = new cpr(this);
    private View d;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = (KidSetupViewModel) cin.a(getActivity()).a(KidSetupViewModel.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.d = layoutInflater.inflate(R.layout.view_app_detail_google_switch, viewGroup, false);
        this.d.setOnClickListener(this);
        this.b = (Switch) this.d.findViewById(R.id.kidsetup_app_detail_google_search_switch);
        this.b.setChecked(a().b());
        return this.d;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.d = null;
        this.b = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        this.b.toggle();
        if (this.b.isChecked()) {
            i = R.string.kidsetup_app_detail_google_search_on_dialog_title;
        } else {
            i = R.string.kidsetup_app_detail_google_search_off_dialog_title;
        }
        cqd.a(this).a(i).c(R.string.common_button_yes).d(R.string.common_button_no).a();
    }

    final chu a() {
        return (chu) dyk.b(this.a.d.values(), cpq.a);
    }

    @Override // flm.cqi
    public final /* synthetic */ cqg f_() {
        return this.c;
    }
}
