package flm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.gms.gcm.PendingCallback;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bpr extends Service {
    public static final int MSG_INIT = 4;
    public static final int MSG_RESULT = 3;
    public static final int MSG_START_EXEC = 1;
    public static final int MSG_STOP_EXEC = 2;
    public static final String SERVICE_ACTION_EXECUTE_TASK = "com.google.android.gms.gcm.ACTION_TASK_READY";
    public static final String SERVICE_ACTION_INITIALIZE = "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE";
    public static final String SERVICE_PERMISSION = "com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE";
    public static final int THREAD_PRIORITY = 4;
    private final Object a = new Object();
    private int b;
    private ExecutorService c;
    private Messenger d;
    private ComponentName e;
    private bpq f;
    private cqt g;

    public abstract int onRunTask(bqj bqjVar);

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate() {
        super.onCreate();
        this.f = bpq.a((Context) this);
        this.c = createExecutorService();
        this.d = new Messenger(new bpt(this, Looper.getMainLooper()));
        this.e = new ComponentName((Context) this, getContainerService().getClass());
        getClass();
        this.g = cqu.a;
    }

    public void onDestroy() {
        super.onDestroy();
        List<Runnable> listShutdownNow = this.c.shutdownNow();
        if (!listShutdownNow.isEmpty()) {
            Log.e("GcmTaskChimeraService", new StringBuilder(79).append("Shutting down, but not all tasks are finished executing. Remaining: ").append(listShutdownNow.size()).toString());
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            a(i2);
        } else {
            try {
                intent.setExtrasClassLoader(PendingCallback.class.getClassLoader());
                String action = intent.getAction();
                if (SERVICE_ACTION_EXECUTE_TASK.equals(action)) {
                    String stringExtra = intent.getStringExtra("tag");
                    Parcelable parcelableExtra = intent.getParcelableExtra("callback");
                    Bundle bundleExtra = intent.getBundleExtra(baw.KEY_EXTRAS);
                    ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("triggered_uris");
                    long longExtra = intent.getLongExtra("max_exec_duration", 180L);
                    if (!(parcelableExtra instanceof PendingCallback)) {
                        String packageName = getPackageName();
                        Log.e("GcmTaskChimeraService", new StringBuilder(String.valueOf(packageName).length() + 47 + String.valueOf(stringExtra).length()).append(packageName).append(" ").append(stringExtra).append(": Could not process request, invalid callback.").toString());
                    } else if (!a(stringExtra)) {
                        a(new bpu(this, stringExtra, ((PendingCallback) parcelableExtra).a, bundleExtra, longExtra, parcelableArrayListExtra));
                    }
                } else if (SERVICE_ACTION_INITIALIZE.equals(action)) {
                    onInitializeTasks();
                } else {
                    Log.e("GcmTaskChimeraService", new StringBuilder(String.valueOf(action).length() + 37).append("Unknown action received ").append(action).append(", terminating").toString());
                }
            } finally {
                a(i2);
            }
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a(String str) {
        boolean z;
        synchronized (this.a) {
            z = !this.f.a(str, this.e.getClassName());
            if (z) {
                String packageName = getPackageName();
                Log.w("GcmTaskChimeraService", new StringBuilder(String.valueOf(packageName).length() + 44 + String.valueOf(str).length()).append(packageName).append(" ").append(str).append(": Task already running, won't start another").toString());
            }
        }
        return z;
    }

    protected ExecutorService createExecutorService() {
        return cqp.a.a(2, new bps());
    }

    private final void a(int i) {
        synchronized (this.a) {
            this.b = i;
            if (!this.f.b(this.e.getClassName())) {
                stopSelf(this.b);
            }
        }
    }

    public IBinder onBind(Intent intent) {
        if (intent == null || !SERVICE_ACTION_EXECUTE_TASK.equals(intent.getAction())) {
            return null;
        }
        return this.d.getBinder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(bpu bpuVar) {
        try {
            this.c.execute(bpuVar);
        } catch (RejectedExecutionException e) {
            Log.e("GcmTaskChimeraService", "Executor is shutdown. onDestroy was called but main looper had an unprocessed start task message. The task will be retried with backoff delay.", e);
            bpuVar.a(1);
        }
    }

    public void onInitializeTasks() {
    }
}
