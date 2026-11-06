package flm;

import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ayu extends bgv {
    private final String a;
    private String b;
    public daf mWakeLock;

    public ayu(String str) {
        this.a = str;
    }

    public ayu(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public ayu(String str, String str2, int i) {
        super(i);
        this.a = str;
        this.b = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // flm.bgv
    public void onCreate() {
        super.onCreate();
        String str = this.a;
        this.mWakeLock = new daf(this, 1, new StringBuilder(String.valueOf(str).length() + 22).append("WakefulIntentService[").append(str).append("]").toString(), null, "com.google.android.gms", this.b);
        daf dafVar = this.mWakeLock;
        dafVar.k.incrementAndGet();
        dafVar.a((String) null, 0L);
        dafVar.b.acquire();
        if (0 > 0) {
            daf.l.schedule(new dah(dafVar), 0L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // flm.bgv
    public void onDestroy() {
        daf dafVar = this.mWakeLock;
        if (dafVar.k.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(dafVar.g).concat(" release without a matched acquire!"));
        }
        dafVar.a((String) null, 0);
        super.onDestroy();
    }
}
