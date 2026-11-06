package flm;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class asx extends atd {
    public static final int API_PRIORITY_GAMES = 1;
    public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
    public static final int API_PRIORITY_PLUS = 2;

    public abstract ate buildClient(Context context, Looper looper, bba bbaVar, Object obj, atr atrVar, ats atsVar);
}
