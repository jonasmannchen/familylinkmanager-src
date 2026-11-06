package flm;

import android.os.Bundle;
import com.google.android.chimera.FragmentActivity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class akx extends FragmentActivity implements af {
    private final ag a = new ag(this);

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.a(z.CREATED);
    }

    public void onStart() {
        super.onStart();
        this.a.a(z.STARTED);
    }

    public void onResume() {
        super.onResume();
        this.a.a(z.RESUMED);
    }

    public void onPause() {
        this.a.a(z.STARTED);
        super.onPause();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.a.a(z.CREATED);
        super.onSaveInstanceState(bundle);
    }

    public void onStop() {
        this.a.a(z.CREATED);
        super.onStop();
    }

    public void onDestroy() {
        this.a.a(z.DESTROYED);
        super.onDestroy();
    }

    public x getLifecycle() {
        return this.a;
    }
}
