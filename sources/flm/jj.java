package flm;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jj implements jw {
    private final /* synthetic */ View a;
    private final /* synthetic */ ArrayList b;

    jj(jh jhVar, View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    @Override // flm.jw
    public final void c() {
    }

    @Override // flm.jw
    public final void a(jq jqVar) {
        jqVar.b(this);
        this.a.setVisibility(8);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.b.get(i)).setVisibility(0);
        }
    }

    @Override // flm.jw
    public final void a() {
    }

    @Override // flm.jw
    public final void b() {
    }
}
