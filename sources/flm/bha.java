package flm;

import android.os.Message;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bha implements Runnable {
    private final Message a;
    private final /* synthetic */ bgz b;

    public bha(bgz bgzVar, Message message) {
        this.b = bgzVar;
        this.a = Message.obtain(message);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.a != null && this.b.a.handleMessage(this.a)) {
            this.a.recycle();
        } else {
            this.b.handleMessage(this.a);
            this.a.recycle();
        }
    }

    public final String toString() {
        return this.b.toString();
    }
}
