package flm;

import android.app.PendingIntent;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ns {
    public final Bundle a;
    public final of[] b;
    public final of[] c;
    public boolean d;
    public boolean e;
    public final int f;
    public int g;
    public CharSequence h;
    public PendingIntent i;

    public ns(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true);
    }

    private ns(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, of[] ofVarArr, of[] ofVarArr2, boolean z, int i2, boolean z2) {
        this.e = true;
        this.g = i;
        this.h = nu.a(charSequence);
        this.i = pendingIntent;
        this.a = bundle;
        this.b = null;
        this.c = null;
        this.d = true;
        this.f = 0;
        this.e = true;
    }
}
