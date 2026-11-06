package flm;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aow implements aoi {
    private final byte[] a;
    private final Integer b;
    private final ArrayList c;
    private final /* synthetic */ aon d;

    aow(aon aonVar, byte[] bArr) {
        this.d = aonVar;
        this.a = bArr;
        this.b = (Integer) aonVar.l.get(this.a);
        Integer num = this.b;
        ArrayList arrayList = new ArrayList(this.d.i.size());
        for (aoq aoqVar : this.d.i.values()) {
            if (aoqVar.b.containsKey(num)) {
                arrayList.add(aoqVar);
            }
        }
        this.c = arrayList;
    }

    private final fnq b() {
        fnr fnrVar = (fnr) ((fio) fnq.e.a(dp.au, (Object) null));
        long j = this.d.g;
        fnrVar.c();
        fnq fnqVar = (fnq) fnrVar.a;
        fnqVar.a |= 1;
        fnqVar.b = j;
        if (this.a != null) {
            fgy fgyVarA = fgy.a(this.a);
            fnrVar.c();
            fnq fnqVar2 = (fnq) fnrVar.a;
            if (fgyVarA == null) {
                throw new NullPointerException();
            }
            fnqVar2.a |= 4;
            fnqVar2.d = fgyVarA;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            aoq aoqVar = (aoq) arrayList.get(i);
            Map map = (Map) aoqVar.b.get(this.b);
            fnp fnpVar = (fnp) ((fio) fno.d.a(dp.au, (Object) null));
            long jA = aon.a(aoqVar.a);
            fnpVar.c();
            fno fnoVar = (fno) fnpVar.a;
            fnoVar.a |= 1;
            fnoVar.b = jA;
            map.size();
            for (Map.Entry entry : map.entrySet()) {
                fnn fnnVar = (fnn) ((fio) fnm.d.a(dp.au, (Object) null));
                long jLongValue = ((Long) entry.getKey()).longValue();
                fnnVar.c();
                fnm fnmVar = (fnm) fnnVar.a;
                fnmVar.a |= 1;
                fnmVar.b = jLongValue;
                long j2 = ((long[]) entry.getValue())[0];
                fnnVar.c();
                fnm fnmVar2 = (fnm) fnnVar.a;
                fnmVar2.a |= 2;
                fnmVar2.c = j2;
                fnpVar.c();
                fno fnoVar2 = (fno) fnpVar.a;
                if (!fnoVar2.c.a()) {
                    fnoVar2.c = fin.a(fnoVar2.c);
                }
                fnoVar2.c.add((fnm) ((fin) fnnVar.h()));
            }
            fno fnoVar3 = (fno) ((fin) fnpVar.h());
            fnrVar.c();
            fnq fnqVar3 = (fnq) fnrVar.a;
            if (fnoVar3 == null) {
                throw new NullPointerException();
            }
            if (!fnqVar3.c.a()) {
                fnqVar3.c = fin.a(fnqVar3.c);
            }
            fnqVar3.c.add(fnoVar3);
            i = i2;
        }
        return (fnq) ((fin) fnrVar.h());
    }

    @Override // flm.aoi
    public final byte[] a() {
        return b().b();
    }

    public final String toString() {
        return b().toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aow)) {
            return false;
        }
        return b().equals(((aow) obj).b());
    }

    public final int hashCode() {
        return 1;
    }
}
