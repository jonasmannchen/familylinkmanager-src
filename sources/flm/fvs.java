package flm;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fvs implements fro {
    public static final fuc a = fuc.a("Authorization", ftv.a);
    public String b;
    public final Context c;
    public final boolean d;

    public fvs(Context context, String str, boolean z) {
        this.c = context;
        this.b = str;
        this.d = z;
    }

    @Override // flm.fro
    public final frm a(fuf fufVar, frj frjVar, frl frlVar) {
        return new fvt(this, frlVar.a(fufVar, frjVar));
    }
}
