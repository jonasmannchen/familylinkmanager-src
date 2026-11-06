package flm;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface axm {
    Activity a();

    LifecycleCallback a(String str, Class cls);

    void a(String str, LifecycleCallback lifecycleCallback);

    void startActivityForResult(Intent intent, int i);
}
