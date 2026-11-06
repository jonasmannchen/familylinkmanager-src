package flm;

import android.os.Bundle;
import com.google.android.chimera.Fragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class cil extends Fragment implements af {
    private final ag a = new ag(this);

    @Override // flm.af
    public x getLifecycle() {
        return this.a;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (a() == null) {
            getChildFragmentManager().beginTransaction().add(new cim(), "ViewModelHolderFragment").commitNow();
        }
        this.a.a(y.ON_CREATE);
    }

    public void onStart() {
        super.onStart();
        this.a.a(y.ON_START);
    }

    public void onResume() {
        super.onResume();
        this.a.a(y.ON_RESUME);
    }

    public void onPause() {
        this.a.a(y.ON_PAUSE);
        super.onPause();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.a.a(y.ON_STOP);
        super.onSaveInstanceState(bundle);
    }

    public void onStop() {
        this.a.a(y.ON_STOP);
        super.onStop();
    }

    public void onDestroy() {
        this.a.a(y.ON_DESTROY);
        super.onDestroy();
    }

    final cim a() {
        return (cim) getChildFragmentManager().findFragmentByTag("ViewModelHolderFragment");
    }
}
