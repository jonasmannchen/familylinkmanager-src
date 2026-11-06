package flm;

import android.content.pm.PackageStats;
import android.os.SystemClock;
import com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class diq implements Runnable {
    private final /* synthetic */ dip a;

    diq(dip dipVar) {
        this.a = dipVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        if (dip.a(this.a.c)) {
            return;
        }
        dip dipVar = this.a;
        PackageStats packageStats = PackageStatsCapture.getPackageStats(dipVar.a);
        if (packageStats == null) {
            dkm.a(5, "PackageMetricService", "PackageStats capture failed.", new Object[0]);
            return;
        }
        gts gtsVar = (gts) ((fio) gtr.y.a(dp.au, (Object) null));
        dse.a(packageStats);
        gsu gsuVar = (gsu) ((fio) gst.k.a(dp.au, (Object) null));
        long j = packageStats.cacheSize;
        gsuVar.c();
        gst gstVar = (gst) gsuVar.a;
        gstVar.a |= 1;
        gstVar.b = j;
        long j2 = packageStats.codeSize;
        gsuVar.c();
        gst gstVar2 = (gst) gsuVar.a;
        gstVar2.a |= 2;
        gstVar2.c = j2;
        long j3 = packageStats.dataSize;
        gsuVar.c();
        gst gstVar3 = (gst) gsuVar.a;
        gstVar3.a |= 4;
        gstVar3.d = j3;
        long j4 = packageStats.externalCacheSize;
        gsuVar.c();
        gst gstVar4 = (gst) gsuVar.a;
        gstVar4.a |= 8;
        gstVar4.e = j4;
        long j5 = packageStats.externalCodeSize;
        gsuVar.c();
        gst gstVar5 = (gst) gsuVar.a;
        gstVar5.a |= 16;
        gstVar5.f = j5;
        long j6 = packageStats.externalDataSize;
        gsuVar.c();
        gst gstVar6 = (gst) gsuVar.a;
        gstVar6.a |= 32;
        gstVar6.g = j6;
        long j7 = packageStats.externalMediaSize;
        gsuVar.c();
        gst gstVar7 = (gst) gsuVar.a;
        gstVar7.a |= 64;
        gstVar7.h = j7;
        long j8 = packageStats.externalObbSize;
        gsuVar.c();
        gst gstVar8 = (gst) gsuVar.a;
        gstVar8.a |= 128;
        gstVar8.i = j8;
        gst gstVar9 = (gst) ((fin) gsuVar.h());
        fio fioVar = (fio) gstVar9.a(dp.au, (Object) null);
        fioVar.a((fin) gstVar9);
        gsu gsuVar2 = (gsu) fioVar;
        if (dipVar.d) {
            gsuVar2.c();
            ((gst) gsuVar2.a).j = gst.j();
            List listA = dpc.a(dipVar.a, dipVar.e, dipVar.f);
            gsuVar2.c();
            gst gstVar10 = (gst) gsuVar2.a;
            if (!gstVar10.j.a()) {
                gstVar10.j = fin.a(gstVar10.j);
            }
            List list = gstVar10.j;
            fiv.a(listA);
            if (listA instanceof fjo) {
                List listD = ((fjo) listA).d();
                fjo fjoVar = (fjo) list;
                int size = list.size();
                for (Object obj : listD) {
                    if (obj == null) {
                        String string = new StringBuilder(37).append("Element at index ").append(fjoVar.size() - size).append(" is null.").toString();
                        for (int size2 = fjoVar.size() - 1; size2 >= size; size2--) {
                            fjoVar.remove(size2);
                        }
                        throw new NullPointerException(string);
                    }
                    if (obj instanceof fgy) {
                        fjoVar.a((fgy) obj);
                    } else {
                        fjoVar.add((String) obj);
                    }
                }
            } else if (listA instanceof fkp) {
                list.addAll(listA);
            } else {
                if ((list instanceof ArrayList) && (listA instanceof Collection)) {
                    ((ArrayList) list).ensureCapacity(listA.size() + list.size());
                }
                int size3 = list.size();
                for (Object obj2 : listA) {
                    if (obj2 == null) {
                        String string2 = new StringBuilder(37).append("Element at index ").append(list.size() - size3).append(" is null.").toString();
                        for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                            list.remove(size4);
                        }
                        throw new NullPointerException(string2);
                    }
                    list.add(obj2);
                }
            }
        }
        gtsVar.a(gsuVar2);
        dipVar.a((gtr) ((fin) gtsVar.h()));
        if (!dipVar.c.edit().putLong("primes.packageMetric.lastSendTime", SystemClock.elapsedRealtime()).commit()) {
            dkm.a(3, "PackageMetricService", "Failure storing timestamp persistently", new Object[0]);
        }
    }
}
