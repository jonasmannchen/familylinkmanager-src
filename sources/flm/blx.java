package flm;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class blx implements bmh {
    @Override // flm.bmh
    public final bmj a(Context context, String str, bmi bmiVar) {
        bmj bmjVar = new bmj();
        bmjVar.b = bmiVar.a(context, str, true);
        if (bmjVar.b != 0) {
            bmjVar.c = 1;
        } else {
            bmjVar.a = bmiVar.a(context, str);
            if (bmjVar.a != 0) {
                bmjVar.c = -1;
            }
        }
        return bmjVar;
    }
}
