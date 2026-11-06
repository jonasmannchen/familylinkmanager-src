package android.arch.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import flm.bg;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AndroidViewModel extends bg {

    @SuppressLint({"StaticFieldLeak"})
    public Application a;

    public AndroidViewModel(Application application) {
        this.a = application;
    }
}
