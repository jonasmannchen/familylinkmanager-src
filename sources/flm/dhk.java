package flm;

import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dhk implements Callable {
    private final /* synthetic */ File a;
    private final /* synthetic */ dhj b;

    dhk(dhj dhjVar, File file) {
        this.b = dhjVar;
        this.a = file;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Throwable {
        dnx dnxVar = this.b.a;
        dod dodVarA = dod.a(this.a);
        dof dofVarA = dnx.a(dodVarA);
        dnx.b(dofVarA, dodVarA);
        return dnxVar.a(dofVarA, dodVarA);
    }
}
