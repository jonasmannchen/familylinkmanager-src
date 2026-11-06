package flm;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fie extends fid {
    fie() {
    }

    @Override // flm.fid
    final boolean a(fke fkeVar) {
        return fkeVar instanceof fir;
    }

    @Override // flm.fid
    final fig a(Object obj) {
        return ((fir) obj).f;
    }

    @Override // flm.fid
    final void a(Object obj, fig figVar) {
        ((fir) obj).f = figVar;
    }

    @Override // flm.fid
    final fig b(Object obj) {
        fig figVarA = a(obj);
        if (figVarA.b) {
            fig figVar = (fig) figVarA.clone();
            a(obj, figVar);
            return figVar;
        }
        return figVarA;
    }

    @Override // flm.fid
    final void c(Object obj) {
        a(obj).a();
    }

    @Override // flm.fid
    final Object a(fkt fktVar, Object obj, fib fibVar, fig figVar, Object obj2, flq flqVar) {
        throw new NoSuchMethodError();
    }

    @Override // flm.fid
    final int a(Map.Entry entry) {
        throw new NoSuchMethodError();
    }

    @Override // flm.fid
    final void a(fmp fmpVar, Map.Entry entry) {
        throw new NoSuchMethodError();
    }

    @Override // flm.fid
    final Object a(fib fibVar, fke fkeVar, int i) {
        return fibVar.a(fkeVar, i);
    }

    @Override // flm.fid
    final void a(fkt fktVar, Object obj, fib fibVar, fig figVar) {
        throw new NoSuchMethodError();
    }

    @Override // flm.fid
    final void a(fgy fgyVar, Object obj, fib fibVar, fig figVar) {
        throw new NoSuchMethodError();
    }
}
