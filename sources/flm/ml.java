package flm;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ml implements mk {
    private final String a = null;
    private final int b;
    private final int c;
    private final /* synthetic */ lw d;

    ml(lw lwVar, String str, int i, int i2) {
        this.d = lwVar;
        this.b = i;
        this.c = i2;
    }

    @Override // flm.mk
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        lw lwVar;
        if (this.d.i == null || this.b >= 0 || this.a != null || (lwVar = this.d.i.v) == null || !lwVar.b()) {
            return this.d.a(arrayList, arrayList2, this.a, this.b, this.c);
        }
        return false;
    }
}
