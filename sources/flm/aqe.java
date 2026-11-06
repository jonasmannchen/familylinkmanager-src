package flm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"HandlerLeak"})
final class aqe extends cqr {
    private final Context a;
    private final /* synthetic */ aqd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqe(aqd aqdVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.b = aqdVar;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                int iA = this.b.a(this.a);
                if (this.b.a(iA)) {
                    aqd aqdVar = this.b;
                    Context context = this.a;
                    aqdVar.a(context, iA, (String) null, aqdVar.a(context, iA, 0, "n"));
                }
                break;
            default:
                Log.w(bbd.TAG, new StringBuilder(50).append("Don't know how to handle this message: ").append(message.what).toString());
                break;
        }
    }
}
