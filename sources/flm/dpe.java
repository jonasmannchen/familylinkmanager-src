package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dpe {
    public final String a;
    public final int b;
    public final /* synthetic */ dpd c;

    dpe(dpd dpdVar) {
        this.c = dpdVar;
        this.a = "";
        this.b = 0;
    }

    dpe(dpd dpdVar, dpe dpeVar, String str) {
        this.c = dpdVar;
        if (dpeVar.b != 0) {
            String str2 = dpeVar.a;
            str = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length()).append(str2).append('/').append(str).toString();
        }
        this.a = str;
        this.b = dpeVar.b + 1;
    }
}
