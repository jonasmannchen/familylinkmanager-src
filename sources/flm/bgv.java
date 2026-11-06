package flm;

import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import com.google.android.chimera.Service;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bgv extends Service {
    private volatile bhb a;
    private volatile bgw b;
    private boolean c;
    private final int d;

    public bgv() {
        this.d = 10;
    }

    public abstract void onHandleIntent(Intent intent);

    public bgv(int i) {
        this.d = i;
    }

    public void setIntentRedelivery(boolean z) {
        this.c = z;
    }

    public void onCreate() {
        this.a = new bhb(this.d);
        this.a.start();
        this.b = new bgw(this, this.a);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        Message messageObtain = Message.obtain();
        messageObtain.arg1 = i2;
        messageObtain.obj = intent;
        this.b.sendMessage(messageObtain);
        return this.c ? 3 : 2;
    }

    public void onDestroy() {
        this.a.quit();
    }

    public IBinder onBind(Intent intent) {
        return null;
    }
}
