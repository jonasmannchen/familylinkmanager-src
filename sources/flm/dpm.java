package flm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dpm {
    private final dpo b;
    private final int d;
    private final Random e;
    public final ArrayList a = new ArrayList();
    private final double c = 1.2d;

    public dpm(dpo dpoVar, dqs dqsVar, double d, int i, Random random) {
        this.b = dpoVar;
        this.d = i;
        this.e = random;
        if (dqsVar != null) {
            for (dqq dqqVar : dqsVar.b) {
                this.a.add((dqqVar.a & 1) == 1 ? Integer.valueOf(dqqVar.b) : null);
            }
        }
    }

    public final synchronized void a(int i) {
        if (this.a.size() + 1 > 100) {
            this.a.remove(this.e.nextInt(this.a.size()));
        }
        this.a.add(Integer.valueOf(i));
        dqt dqtVar = (dqt) ((fio) dqs.d.a(dp.au, (Object) null));
        int i2 = this.d;
        dqtVar.c();
        dqs dqsVar = (dqs) dqtVar.a;
        dqsVar.a |= 1;
        dqsVar.c = i2;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            dqr dqrVar = (dqr) ((fio) dqq.c.a(dp.au, (Object) null));
            int iIntValue = ((Integer) this.a.get(i3)).intValue();
            dqrVar.c();
            dqq dqqVar = (dqq) dqrVar.a;
            dqqVar.a |= 1;
            dqqVar.b = iIntValue;
            dqq dqqVar2 = (dqq) ((fin) dqrVar.h());
            dqtVar.c();
            dqs dqsVar2 = (dqs) dqtVar.a;
            if (dqqVar2 == null) {
                throw new NullPointerException();
            }
            if (!dqsVar2.b.a()) {
                dqsVar2.b = fin.a(dqsVar2.b);
            }
            dqsVar2.b.add(dqqVar2);
        }
        if (!this.b.a("primes.miniheapdump.memorySamples", (dqs) ((fin) dqtVar.h()))) {
            dkm.a(3, "MhdMemorySampler", "Failed to save mini heap dump memory samples.", new Object[0]);
        }
    }

    public final double b(int i) {
        double d = 0.0d;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (i >= ((Integer) obj).intValue()) {
                d += 1.0d;
            }
        }
        return d / ((double) this.a.size());
    }

    public final boolean a() {
        return this.a.size() == 100 && this.c * ((double) ((Integer) Collections.min(this.a)).intValue()) <= ((double) ((Integer) Collections.max(this.a)).intValue());
    }
}
