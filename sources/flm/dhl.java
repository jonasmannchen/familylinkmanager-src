package flm;

import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dhl implements Callable {
    private final /* synthetic */ File a;
    private final /* synthetic */ dhj b;

    dhl(dhj dhjVar, File file) {
        this.b = dhjVar;
        this.a = file;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Throwable {
        int i;
        dnx dnxVar = this.b.a;
        dod dodVarA = dod.a(this.a);
        dof dofVarA = dnx.a(dodVarA);
        dnx.b(dofVarA, dodVarA);
        doh dohVar = new doh(dofVarA.c);
        new aie(dnr.a(dodVarA, dofVarA)).a(dohVar);
        dnt.a(dohVar, dodVarA);
        PriorityQueue priorityQueue = new PriorityQueue(10, new dns());
        don donVar = new don(Arrays.asList(dofVarA.b.b(), dofVarA.a.b()).iterator());
        while (donVar.a()) {
            dnt dntVar = (dnt) donVar.b();
            if (dntVar.t instanceof doh) {
                priorityQueue.offer(dntVar);
                if (priorityQueue.size() > 10) {
                    priorityQueue.poll();
                }
            }
        }
        ArrayList arrayList = new ArrayList(priorityQueue);
        HashSet hashSet = new HashSet();
        dom domVarB = dofVarA.b.b();
        while (domVarB.a()) {
            if ((domVarB.b instanceof dnw) && ((dnt) domVarB.b).a(dodVarA) > 10000) {
                hashSet.add((dnt) domVarB.b);
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayDeque.addLast((dnt) it.next());
        }
        while (!arrayDeque.isEmpty()) {
            dnt dntVar2 = (dnt) arrayDeque.removeFirst();
            int i2 = 0;
            Iterator it2 = dntVar2.s.iterator();
            while (true) {
                i = i2;
                if (!it2.hasNext()) {
                    break;
                }
                dnt dntVar3 = (dnt) it2.next();
                if (dntVar3.r >= ((double) dntVar2.r) * 0.75d || dntVar3.r >= 1048576) {
                    arrayDeque.addFirst(dntVar3);
                    i2 = i + 1;
                } else {
                    i2 = i;
                }
            }
            if (i == 0) {
                hashSet.add(dntVar2);
            }
        }
        ArrayList<dnt> arrayList2 = new ArrayList(hashSet);
        dok dokVar = new dok();
        for (dnt dntVar4 : arrayList2) {
            ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque2.addLast(dntVar4);
            dntVar4.n = true;
            while (!arrayDeque2.isEmpty()) {
                dnt dntVar5 = (dnt) arrayDeque2.removeFirst();
                if (dnx.a(dntVar5)) {
                    dokVar.a(dntVar5.e(dodVarA), dntVar5);
                }
                Iterator it3 = dntVar5.s.iterator();
                while (it3.hasNext()) {
                    arrayDeque2.addLast((dnt) it3.next());
                }
            }
        }
        dny.a(dofVarA.b, dofVarA.a);
        dny.a(dodVarA, dofVarA.b, dofVarA.a, dny.a(dofVarA.c), new doa());
        dny.a(dofVarA.b, dofVarA.a);
        for (dnt dntVar6 : arrayList2) {
            ArrayDeque arrayDeque3 = new ArrayDeque();
            arrayDeque3.addLast(dntVar6);
            dntVar6.n = true;
            while (!arrayDeque3.isEmpty()) {
                dnt dntVar7 = (dnt) arrayDeque3.removeFirst();
                if (dnx.a(dntVar7)) {
                    dokVar.a(dntVar7.e(dodVarA), dntVar7);
                }
                for (dnt dntVar8 : dntVar7.m) {
                    if (dntVar8 != null && !dntVar8.n) {
                        dntVar8.n = true;
                        arrayDeque3.addLast(dntVar8);
                    }
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (dnt dntVar9 : dofVarA.c) {
            if (dntVar9 instanceof dnp) {
                arrayList3.add(dntVar9);
            }
        }
        dom domVarB2 = dokVar.b();
        while (domVarB2.a()) {
            if (dnt.b((dnt) domVarB2.b)) {
                arrayList3.add((dnt) domVarB2.b);
            }
        }
        return dnxVar.a(new dof(dofVarA.a, dokVar, arrayList3, dofVarA.d), dodVarA);
    }
}
