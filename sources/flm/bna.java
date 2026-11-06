package flm;

import android.content.Context;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bna extends atm {
    public bna(Context context) {
        super(context, bmw.a, (ata) null, atn.a);
        dfe.a = context.getApplicationContext().getContentResolver();
    }

    public final dbh a(bnc bncVar) {
        try {
            if (((Boolean) bns.a.a()).booleanValue()) {
                return super.a(1, new bnb(bncVar));
            }
        } catch (SecurityException e) {
            Log.e("fb_FeedbackClient", e.getMessage());
        }
        return bda.toVoidTask(bmw.a(this.e, bncVar));
    }
}
