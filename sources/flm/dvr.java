package flm;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dvr implements dvv {
    public final /* synthetic */ String a;

    dvr(String str) {
        this.a = str;
    }

    @Override // flm.dvv
    public final /* synthetic */ Iterator a(dvo dvoVar, CharSequence charSequence) {
        return new dvs(this, dvoVar, charSequence);
    }
}
