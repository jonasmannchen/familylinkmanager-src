package flm;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class awb extends awi {
    public final /* synthetic */ avy a;
    private final Map b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awb(avy avyVar, Map map) {
        super(avyVar);
        this.a = avyVar;
        this.b = map;
    }

    @Override // flm.awi
    public final void a() {
        int i = 0;
        bcc bccVar = new bcc(this.a.d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ate ateVar : this.b.keySet()) {
            if (ateVar.requiresGooglePlayServices() && !((awa) this.b.get(ateVar)).a) {
                arrayList.add(ateVar);
            } else {
                arrayList2.add(ateVar);
            }
        }
        int clientAvailability = -1;
        if (arrayList.isEmpty()) {
            ArrayList arrayList3 = arrayList2;
            int size = arrayList3.size();
            while (i < size) {
                Object obj = arrayList3.get(i);
                i++;
                clientAvailability = bccVar.getClientAvailability(this.a.c, (ate) obj);
                if (clientAvailability == 0) {
                    break;
                }
            }
        } else {
            ArrayList arrayList4 = arrayList;
            int size2 = arrayList4.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList4.get(i2);
                i2++;
                clientAvailability = bccVar.getClientAvailability(this.a.c, (ate) obj2);
                if (clientAvailability != 0) {
                    break;
                }
            }
        }
        int i3 = clientAvailability;
        if (i3 != 0) {
            this.a.a.a(new awc(this, this.a, new apx(i3, null)));
            return;
        }
        if (this.a.f && this.a.e != null) {
            this.a.e.b();
        }
        for (ate ateVar2 : this.b.keySet()) {
            bao baoVar = (bao) this.b.get(ateVar2);
            if (ateVar2.requiresGooglePlayServices() && bccVar.getClientAvailability(this.a.c, ateVar2) != 0) {
                this.a.a.a(new awd(this.a, baoVar));
            } else {
                ateVar2.connect(baoVar);
            }
        }
    }
}
