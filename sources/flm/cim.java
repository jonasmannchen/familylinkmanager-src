package flm;

import android.os.Bundle;
import com.google.android.chimera.Fragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cim extends Fragment {
    public bh a;
    private bl b;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            setRetainInstance(true);
            a();
            this.b = new bl();
            this.a = new bh(this.b, new bi(getActivity().getApplication()));
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        a();
    }

    private final void a() {
        String name;
        if (this.b != null) {
            if (getParentFragment() != null) {
                name = getParentFragment().getClass().getName();
            } else {
                name = getActivity() != null ? getActivity().getClass().getName() : null;
            }
            btv.c("KidSetup", "Clearing view model store for %s.", name);
            this.b.a();
            this.b = null;
        }
    }
}
