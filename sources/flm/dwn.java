package flm;

import java.util.Iterator;
import java.util.NavigableMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dwn extends dzc {
    private final /* synthetic */ dwm a;

    dwn(dwm dwmVar) {
        this.a = dwmVar;
    }

    @Override // flm.dzc
    final NavigableMap a() {
        return this.a;
    }

    @Override // flm.dzc
    final Iterator k_() {
        return this.a.a();
    }
}
