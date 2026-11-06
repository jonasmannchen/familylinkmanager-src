package flm;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.gcm.Task;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bqf implements bqg {
    private final Context a;
    private final PendingIntent b;

    bqf(Context context) {
        this.a = context;
        this.b = PendingIntent.getBroadcast(context, 0, new Intent().setPackage("com.google.example.invalidpackage"), 0);
    }

    @Override // flm.bqg
    public final boolean a(Task task) {
        Intent intentA = a("SCHEDULE_TASK");
        Bundle bundle = new Bundle();
        task.a(bundle);
        intentA.putExtras(bundle);
        this.a.sendBroadcast(intentA);
        return true;
    }

    @Override // flm.bqg
    public final boolean a(ComponentName componentName) {
        Intent intentA = a("CANCEL_ALL");
        intentA.putExtra("component", componentName);
        this.a.sendBroadcast(intentA);
        return true;
    }

    private final Intent a(String str) {
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("app", this.b);
        intent.putExtra("source", 4);
        intent.putExtra("source_version", bav.JAR_BUILD_VERSION_CODE);
        intent.putExtra("scheduler_action", str);
        return intent;
    }
}
