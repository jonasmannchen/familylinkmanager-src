package flm;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class blz implements bmh {
    @Override // flm.bmh
    public final bmj a(Context context, String str, bmi bmiVar) {
        bmj bmjVar = new bmj();
        bmjVar.a = bmiVar.a(context, str);
        bmjVar.b = bmiVar.a(context, str, true);
        if (bmjVar.a == 0 && bmjVar.b == 0) {
            bmjVar.c = 0;
        } else if (bmjVar.a >= bmjVar.b) {
            bmjVar.c = -1;
        } else {
            bmjVar.c = 1;
        }
        return bmjVar;
    }
}
