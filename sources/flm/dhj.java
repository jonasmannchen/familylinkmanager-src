package flm;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dhj {
    public final dnx a;
    private final die b;

    dhj(dnx dnxVar, die dieVar) {
        this.a = dnxVar;
        this.b = dieVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0112 A[Catch: OutOfMemoryError -> 0x0038, Exception -> 0x0075, IOException -> 0x00eb, TRY_LEAVE, TryCatch #6 {IOException -> 0x00eb, blocks: (B:24:0x00cf, B:26:0x00e6, B:38:0x0109, B:39:0x010c, B:42:0x0112, B:41:0x010e), top: B:50:0x00cf, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    final gtd a(Callable callable, gqq gqqVar, File file) throws Throwable {
        Throwable th;
        gte gteVarA = ((gte) ((fio) gtd.e.a(dp.au, (Object) null))).a(gtf.NONE);
        try {
            gqu gquVar = (gqu) callable.call();
            fio fioVar = (fio) gquVar.a(dp.au, (Object) null);
            fioVar.a((fin) gquVar);
            gqv gqvVar = (gqv) fioVar;
            gqvVar.c();
            gqu gquVar2 = (gqu) gqvVar.a;
            if (gqqVar == null) {
                throw new NullPointerException();
            }
            gquVar2.g = gqqVar;
            gquVar2.a |= 2;
            gqu gquVar3 = (gqu) ((fin) gqvVar.h());
            die dieVar = this.b;
            gts gtsVar = (gts) ((fio) gtr.y.a(dp.au, (Object) null));
            gtsVar.c();
            gtr gtrVar = (gtr) gtsVar.a;
            if (gquVar3 == null) {
                throw new NullPointerException();
            }
            gtrVar.u = gquVar3;
            gtrVar.a |= 2097152;
            gtr gtrVarA = dieVar.a((gtr) ((fin) gtsVar.h()));
            if (gtrVarA.F == -1) {
                gtrVarA.F = fkq.a.a(gtrVarA).b(gtrVarA);
            }
            int i = gtrVarA.F / 1024;
            gteVarA.c();
            gtd gtdVar = (gtd) gteVarA.a;
            gtdVar.a |= 2;
            gtdVar.c = i;
            if (((gtd) gteVarA.a).c > 10000) {
                return (gtd) ((fin) gteVarA.a(gtf.SERIALIZED_HEAP_DUMP_TOO_LARGE).h());
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    fhp fhpVarA = fhp.a(fileOutputStream, fhp.a(gtrVarA.g()));
                    gtrVarA.a(fhpVarA);
                    fhpVarA.h();
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th = th2;
                    th = null;
                    if (th == null) {
                        fileOutputStream.close();
                        throw th;
                    }
                    fileOutputStream.close();
                    throw th;
                }
            } catch (IOException e) {
                dkm.a("HeapDumpProcessor", "Failed to write mini heap dump to file.", e, new Object[0]);
                if (file.exists()) {
                    file.delete();
                }
            }
        } catch (Exception e2) {
            gteVarA.a(gtf.UNKNOWN);
        } catch (OutOfMemoryError e3) {
            gteVarA.a(gtf.OUT_OF_MEMORY_SERIALIZING);
        }
        return (gtd) ((fin) gteVarA.h());
    }
}
