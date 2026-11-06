package flm;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fjr extends fjp {
    fjr() {
    }

    @Override // flm.fjp
    final List a(Object obj, long j) {
        fjf fjfVarC = c(obj, j);
        if (fjfVarC.a()) {
            return fjfVarC;
        }
        int size = fjfVarC.size();
        fjf fjfVarA = fjfVarC.a(size == 0 ? 10 : size << 1);
        flw.a(obj, j, fjfVarA);
        return fjfVarA;
    }

    @Override // flm.fjp
    final void b(Object obj, long j) {
        c(obj, j).b();
    }

    @Override // flm.fjp
    final void a(Object obj, Object obj2, long j) {
        fjf fjfVarC = c(obj, j);
        fjf fjfVarC2 = c(obj2, j);
        int size = fjfVarC.size();
        int size2 = fjfVarC2.size();
        if (size > 0 && size2 > 0) {
            if (!fjfVarC.a()) {
                fjfVarC = fjfVarC.a(size2 + size);
            }
            fjfVarC.addAll(fjfVarC2);
        }
        if (size <= 0) {
            fjfVarC = fjfVarC2;
        }
        flw.a(obj, j, fjfVarC);
    }

    private static fjf c(Object obj, long j) {
        return (fjf) flw.f(obj, j);
    }
}
