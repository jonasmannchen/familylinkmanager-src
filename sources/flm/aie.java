package flm;

import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class aie {
    private final aif a;
    private aim b = new ail();
    private long c = 0;

    public aie(aif aifVar) {
        this.a = aifVar;
    }

    public final void a(Object obj) {
        boolean z;
        ArrayDeque arrayDeque = new ArrayDeque();
        aii aiiVar = new aii();
        aiiVar.a = obj;
        aiiVar.b = 0L;
        aiiVar.i = 0L;
        this.a.a(obj, aiiVar);
        ArrayDeque arrayDeque2 = new ArrayDeque();
        arrayDeque2.push(new aih(aiiVar));
        Iterator it = this.a.b(obj).iterator();
        while (it.hasNext()) {
            arrayDeque2.push(new aih(aiiVar, it.next()));
        }
        long j = 1;
        while (!arrayDeque2.isEmpty()) {
            aih aihVar = (aih) arrayDeque2.pop();
            if (aihVar.b == null) {
                aihVar.a.c = j - 1;
            } else {
                aii aiiVar2 = (aii) this.a.a(aihVar.b);
                if (aiiVar2 == null) {
                    aii aiiVar3 = new aii();
                    this.a.a(aihVar.b, aiiVar3);
                    aiiVar3.a = aihVar.b;
                    long j2 = 1 + j;
                    aiiVar3.b = j;
                    aiiVar3.d.a(aihVar.a.b);
                    aiiVar3.e = aihVar.a;
                    aiiVar3.e.g.a(aiiVar3);
                    aiiVar3.f = aihVar.a;
                    aiiVar3.i = aihVar.a.i + 1;
                    arrayDeque2.push(new aih(aiiVar3));
                    Iterator it2 = this.a.b(aihVar.b).iterator();
                    while (it2.hasNext()) {
                        arrayDeque2.push(new aih(aiiVar3, it2.next()));
                    }
                    j = j2;
                } else {
                    aig aigVar = aiiVar2.d;
                    long j3 = aigVar.b[aigVar.a - 1];
                    aiiVar2.d.a(aihVar.a.b);
                    aii aiiVar4 = aihVar.a;
                    while (aiiVar4.b > j3) {
                        aiiVar4 = aiiVar4.e;
                    }
                    long j4 = aiiVar4.b;
                    if (aiiVar2.e.b > j4) {
                        if (aiiVar2.e == aiiVar2.f) {
                            if (aiiVar2.f.h == null) {
                                aiiVar2.f.h = new aij();
                                arrayDeque.add(aiiVar2.f);
                            }
                            aiiVar2.f.h.a(aiiVar2);
                        }
                        aij aijVar = aiiVar2.e.g;
                        for (int i = 0; i < aijVar.a; i++) {
                            if (aijVar.b[i] == aiiVar2) {
                                aijVar.a(i);
                                break;
                            }
                        }
                        do {
                            aiiVar2.e = aiiVar2.e.e;
                        } while (aiiVar2.e.b > j4);
                        aiiVar2.e.g.a(aiiVar2);
                    }
                }
            }
        }
        while (!arrayDeque.isEmpty()) {
            aii aiiVar5 = (aii) arrayDeque.poll();
            aij aijVar2 = aiiVar5.h;
            aiiVar5.h = null;
            int i2 = 0;
            while (i2 < aiiVar5.g.a) {
                aii aiiVar6 = aiiVar5.g.b[i2];
                for (int i3 = 0; i3 < aijVar2.a; i3++) {
                    aii aiiVar7 = aijVar2.b[i3];
                    if (aiiVar6.b < aiiVar7.b) {
                        aig aigVar2 = aiiVar6.d;
                        long j5 = aiiVar7.b;
                        long j6 = aiiVar7.c;
                        int i4 = 0;
                        while (true) {
                            if (i4 < aigVar2.a) {
                                if (j5 <= aigVar2.b[i4] && aigVar2.b[i4] <= j6) {
                                    z = true;
                                    break;
                                }
                                i4++;
                            } else {
                                z = false;
                                break;
                            }
                        }
                    } else {
                        z = aiiVar6.b <= aiiVar7.c;
                    }
                    if (z) {
                        if (aiiVar6.e == aiiVar6.f) {
                            if (aiiVar6.f.h == null) {
                                aiiVar6.f.h = new aij();
                                arrayDeque.add(aiiVar6.f);
                            }
                            aiiVar6.f.h.a(aiiVar6);
                        }
                        aiiVar5.g.a(i2);
                        aiiVar6.e = aiiVar7.e;
                        aiiVar6.e.g.a(aiiVar6);
                        i2--;
                        break;
                    }
                }
                i2++;
            }
            for (int i5 = 0; i5 < aijVar2.a; i5++) {
                aii aiiVar8 = aijVar2.b[i5];
                aiiVar8.f = aiiVar5.f;
                if (aiiVar8.f != aiiVar8.e) {
                    if (aiiVar8.f.h == null) {
                        aiiVar8.f.h = new aij();
                        arrayDeque.add(aiiVar8.f);
                    }
                    aiiVar8.f.h.a(aiiVar8);
                }
            }
        }
        arrayDeque.add(aiiVar);
        while (!arrayDeque.isEmpty()) {
            aii aiiVar9 = (aii) arrayDeque.poll();
            this.a.a(aiiVar9.a, null);
            for (int i6 = 0; i6 < aiiVar9.g.a; i6++) {
                aii aiiVar10 = aiiVar9.g.b[i6];
                this.a.b(aiiVar10.a, aiiVar9.a);
                arrayDeque.add(aiiVar10);
            }
        }
    }
}
