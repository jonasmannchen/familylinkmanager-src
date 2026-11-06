package flm;

import android.annotation.TargetApi;
import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dgr extends dfm implements dkz {
    public final AtomicBoolean c;
    public final int d;
    public final int e;
    public final int f;
    public final double g;
    public final int h;
    public final IntentFilter i;
    public final dfh j;
    public ScheduledFuture k;
    private final dgu l;
    private WifiManager m;

    dgr(dpz dpzVar, Application application, dmb dmbVar, dmb dmbVar2, int i, int i2, int i3, int i4, double d, dfh dfhVar) {
        super(dpzVar, application, dmbVar, dmbVar2, dp.K);
        this.c = new AtomicBoolean(false);
        this.i = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.h = i4;
        this.g = d;
        this.j = dfhVar;
        this.l = new dgu(dfhVar, d, i3, dpl.a(), this.a);
    }

    @TargetApi(21)
    final synchronized void g() {
        if (!this.c.get()) {
            for (int i = 0; i < 5; i++) {
                dgu dguVar = this.l;
                long jA = dguVar.a.a();
                Long lA = dguVar.a(jA - (jA % 31557600000L));
                if (lA == null) {
                    break;
                }
                long jLongValue = lA.longValue() - this.j.a();
                if (jLongValue > 0) {
                    long jLongValue2 = lA.longValue() + ((long) this.f);
                    this.c.set(true);
                    this.k = c().schedule(new dgt(this, jLongValue2), jLongValue, TimeUnit.MILLISECONDS);
                    break;
                }
            }
        }
    }

    @TargetApi(21)
    final gpo a(Intent intent) {
        gpp gppVar = (gpp) ((fio) gpo.f.a(dp.au, (Object) null));
        if (this.m == null) {
            this.m = (WifiManager) this.a.getSystemService("wifi");
        }
        boolean zIsWifiEnabled = this.m.isWifiEnabled();
        gppVar.c();
        gpo gpoVar = (gpo) gppVar.a;
        gpoVar.a |= 4;
        gpoVar.d = zIsWifiEnabled;
        if (oo.a(this.a, "android.permission.BLUETOOTH") == 0) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            boolean z = defaultAdapter != null && defaultAdapter.isEnabled();
            gppVar.c();
            gpo gpoVar2 = (gpo) gppVar.a;
            gpoVar2.a |= 8;
            gpoVar2.e = z;
        }
        boolean zC = dpl.c(this.a);
        gppVar.c();
        gpo gpoVar3 = (gpo) gppVar.a;
        gpoVar3.a |= 1;
        gpoVar3.b = zC;
        int intExtra = intent.getIntExtra("status", -1);
        boolean z2 = intExtra == 2 || intExtra == 5;
        gppVar.c();
        gpo gpoVar4 = (gpo) gppVar.a;
        gpoVar4.a |= 2;
        gpoVar4.c = z2;
        return (gpo) ((fin) gppVar.h());
    }

    private final synchronized void a(boolean z) {
        if (this.k != null) {
            this.k.cancel(true);
            this.k = null;
        }
    }

    @Override // flm.dfm
    final synchronized void d() {
        a(true);
    }

    @Override // flm.dkz
    public final void e() {
        i();
        g();
    }

    @Override // flm.dkz
    public final void f() {
    }

    final synchronized File h() {
        File file;
        String strA = dpl.a();
        String strConcat = String.valueOf(strA).concat(".trace");
        File filesDir = this.a.getFilesDir();
        String strValueOf = String.valueOf("primes_profiling_");
        String strValueOf2 = String.valueOf(strA);
        File file2 = new File(filesDir, strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
        if (!file2.exists() && !file2.mkdir()) {
            file = null;
        } else {
            file = new File(file2, strConcat);
        }
        return file;
    }

    final void i() {
        File fileH = h();
        try {
            if (fileH.exists()) {
                fileH.delete();
            }
        } catch (Exception e) {
        }
    }

    static byte[] a(File file, int i) throws Throwable {
        FileInputStream fileInputStream;
        try {
            long length = file.length();
            if (length > 0 && length <= i) {
                int i2 = (int) length;
                byte[] bArr = new byte[i2];
                fileInputStream = new FileInputStream(file);
                for (int i3 = 0; i3 < i2; i3 += fileInputStream.read(bArr, i3, i2 - i3)) {
                    try {
                    } catch (Throwable th) {
                        th = th;
                    }
                }
                fileInputStream.close();
                fileInputStream.close();
                return bArr;
            }
            return new byte[0];
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
        if (fileInputStream != null) {
            fileInputStream.close();
        }
        throw th;
    }
}
