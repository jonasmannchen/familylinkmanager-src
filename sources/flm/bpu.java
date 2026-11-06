package flm;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bpu implements Runnable {
    private final String a;
    private final Bundle b;
    private final List c;
    private final long d;
    private final bpw e;
    private final Messenger f;
    private final /* synthetic */ bpr g;

    bpu(bpr bprVar, String str, IBinder iBinder, Bundle bundle, long j, List list) {
        this.g = bprVar;
        this.a = str;
        this.e = bpx.a(iBinder);
        this.b = bundle;
        this.d = j;
        this.c = list;
        this.f = null;
    }

    bpu(bpr bprVar, String str, Messenger messenger, Bundle bundle, long j, List list) {
        this.g = bprVar;
        this.a = str;
        this.f = messenger;
        this.b = bundle;
        this.d = j;
        this.c = list;
        this.e = null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0056 A[Catch: Throwable -> 0x005a, all -> 0x0063, TRY_ENTER, TryCatch #6 {all -> 0x0063, Throwable -> 0x005a, blocks: (B:6:0x001c, B:10:0x003e, B:11:0x0041, B:20:0x0056, B:21:0x0059), top: B:36:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:39:? A[Catch: Throwable -> 0x005a, all -> 0x0063, SYNTHETIC, TRY_LEAVE, TryCatch #6 {all -> 0x0063, Throwable -> 0x005a, blocks: (B:6:0x001c, B:10:0x003e, B:11:0x0041, B:20:0x0056, B:21:0x0059), top: B:36:0x001c }] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th;
        Throwable th2;
        Throwable th3 = null;
        String strValueOf = String.valueOf("nts:client:onRunTask:");
        String strValueOf2 = String.valueOf(this.a);
        bqk bqkVar = new bqk(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
        try {
            bqj bqjVar = new bqj(this.a, this.b, this.d, this.c);
            cqw cqwVarA = this.g.g.a("onRunTask");
            try {
                int iOnRunTask = this.g.onRunTask(bqjVar);
                if (cqwVarA != null) {
                    a((Throwable) null, cqwVarA);
                }
                a(iOnRunTask);
                a((Throwable) null, bqkVar);
            } catch (Throwable th4) {
                th = th4;
                th2 = null;
                if (cqwVarA != null) {
                    throw th;
                }
                a(th2, cqwVarA);
                throw th;
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                th3 = th5;
                th = th6;
                a(th3, bqkVar);
                throw th;
            }
        }
    }

    final void a(int i) {
        synchronized (this.g.a) {
            try {
                try {
                    if (!this.g.f.c(this.a, this.g.e.getClassName())) {
                        if (a()) {
                            Messenger messenger = this.f;
                            Message messageObtain = Message.obtain();
                            messageObtain.what = 3;
                            messageObtain.arg1 = i;
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("component", this.g.e);
                            bundle.putString("tag", this.a);
                            messageObtain.setData(bundle);
                            messenger.send(messageObtain);
                        } else {
                            this.e.a(i);
                        }
                        this.g.f.b(this.a, this.g.e.getClassName());
                        if (!a() && !this.g.f.b(this.g.e.getClassName())) {
                            this.g.stopSelf(this.g.b);
                        }
                        return;
                    }
                    this.g.f.b(this.a, this.g.e.getClassName());
                    if (!a() && !this.g.f.b(this.g.e.getClassName())) {
                        this.g.stopSelf(this.g.b);
                    }
                } catch (Throwable th) {
                    this.g.f.b(this.a, this.g.e.getClassName());
                    if (!a() && !this.g.f.b(this.g.e.getClassName())) {
                        this.g.stopSelf(this.g.b);
                    }
                    throw th;
                }
            } catch (RemoteException e) {
                String strValueOf = String.valueOf(this.a);
                Log.e("GcmTaskChimeraService", strValueOf.length() != 0 ? "Error reporting result of operation to scheduler for ".concat(strValueOf) : new String("Error reporting result of operation to scheduler for "));
                this.g.f.b(this.a, this.g.e.getClassName());
                if (!a() && !this.g.f.b(this.g.e.getClassName())) {
                    this.g.stopSelf(this.g.b);
                }
            }
        }
    }

    private final boolean a() {
        return this.f != null;
    }

    private static /* synthetic */ void a(Throwable th, cqw cqwVar) {
        if (th == null) {
            cqwVar.close();
            return;
        }
        try {
            cqwVar.close();
        } catch (Throwable th2) {
            ehh.a(th, th2);
        }
    }

    private static /* synthetic */ void a(Throwable th, bqk bqkVar) {
        if (th == null) {
            bqkVar.close();
            return;
        }
        try {
            bqkVar.close();
        } catch (Throwable th2) {
            ehh.a(th, th2);
        }
    }
}
