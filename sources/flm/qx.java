package flm;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class qx implements rh {
    private final /* synthetic */ String a;

    qx(String str) {
        this.a = str;
    }

    @Override // flm.rh
    public final /* synthetic */ void a(Object obj) {
        rb rbVar = (rb) obj;
        synchronized (qu.b) {
            ArrayList arrayList = (ArrayList) qu.c.get(this.a);
            if (arrayList == null) {
                return;
            }
            qu.c.remove(this.a);
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= arrayList.size()) {
                    return;
                }
                ((rh) arrayList.get(i2)).a(rbVar);
                i = i2 + 1;
            }
        }
    }
}
