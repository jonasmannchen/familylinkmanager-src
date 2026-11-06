package flm;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.ComponentCallbacks2;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class az extends Fragment {
    public ba a;

    public static void a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new az(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ba baVar = this.a;
        if (baVar != null) {
            baVar.a();
        }
        a(y.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        ba baVar = this.a;
        if (baVar != null) {
            baVar.b();
        }
        a(y.ON_START);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        ba baVar = this.a;
        if (baVar != null) {
            baVar.c();
        }
        a(y.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(y.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(y.ON_STOP);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(y.ON_DESTROY);
        this.a = null;
    }

    private final void a(y yVar) {
        ComponentCallbacks2 activity = getActivity();
        if (activity instanceof ai) {
            ((ai) activity).a().a(yVar);
        } else if (activity instanceof af) {
            x lifecycle = ((af) activity).getLifecycle();
            if (lifecycle instanceof ag) {
                ((ag) lifecycle).a(yVar);
            }
        }
    }
}
