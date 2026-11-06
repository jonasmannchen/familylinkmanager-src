package flm;

import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ecr implements Comparator {
    ecr() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ecs ecsVarA = ecs.a(obj);
        ecs ecsVarA2 = ecs.a(obj2);
        return ecsVarA == ecsVarA2 ? ecsVarA.a(obj, obj2) : ecsVarA.compareTo(ecsVarA2);
    }
}
