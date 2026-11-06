package flm;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cbu implements cch {
    private final /* synthetic */ cbt a;

    cbu(cbt cbtVar) {
        this.a = cbtVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0061 A[LOOP:0: B:9:0x005b->B:11:0x0061, LOOP_END] */
    @Override // flm.cch
    public final void a(ccf ccfVar, int i, int i2) {
        Iterator it;
        if (i != 0) {
            cbw cbwVarB = this.a.b(i);
            if (cbwVarB == null) {
                String strValueOf = String.valueOf(ccfVar);
                String resourceName = this.a.a.getResources().getResourceName(i);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(strValueOf).length() + 57 + String.valueOf(resourceName).length()).append("Navigator ").append(strValueOf).append(" reported navigation to unknown destination id ").append(resourceName).toString());
            }
            switch (i2) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    return;
                case 1:
                    this.a.d.add(cbwVarB);
                    it = this.a.e.iterator();
                    while (it.hasNext()) {
                        ((cbv) it.next()).a();
                    }
                    return;
                case 2:
                    while (!this.a.d.isEmpty() && ((cbw) this.a.d.peekLast()).e != i) {
                        this.a.d.removeLast();
                    }
                    it = this.a.e.iterator();
                    while (it.hasNext()) {
                        ((cbv) it.next()).a();
                    }
                    return;
                default:
                    it = this.a.e.iterator();
                    while (it.hasNext()) {
                        ((cbv) it.next()).a();
                    }
                    return;
            }
        }
    }
}
