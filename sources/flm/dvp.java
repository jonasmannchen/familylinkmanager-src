package flm;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dvp implements dvv {
    public final /* synthetic */ duu a;

    public dvp(duu duuVar) {
        this.a = duuVar;
    }

    @Override // flm.dvv
    public final /* synthetic */ Iterator a(dvo dvoVar, CharSequence charSequence) {
        return new dvq(this, dvoVar, charSequence);
    }
}
