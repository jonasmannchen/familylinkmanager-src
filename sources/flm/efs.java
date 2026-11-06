package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class efs {
    public static efn a(Throwable th, boolean z) {
        efn efnVar = (efn) ((fio) efm.e.a(dp.au, (Object) null));
        String name = th.getClass().getName();
        efnVar.c();
        efm efmVar = (efm) efnVar.a;
        if (name == null) {
            throw new NullPointerException();
        }
        efmVar.a |= 1;
        efmVar.b = name;
        if (z && th.getMessage() != null) {
            String message = th.getMessage();
            efnVar.c();
            efm efmVar2 = (efm) efnVar.a;
            if (message == null) {
                throw new NullPointerException();
            }
            efmVar2.a |= 2;
            efmVar2.c = message;
        }
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            efp efpVar = (efp) ((fio) efo.f.a(dp.au, (Object) null));
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                efpVar.c();
                efo efoVar = (efo) efpVar.a;
                if (className == null) {
                    throw new NullPointerException();
                }
                efoVar.a |= 1;
                efoVar.b = className;
                String methodName = stackTraceElement.getMethodName();
                efpVar.c();
                efo efoVar2 = (efo) efpVar.a;
                if (methodName == null) {
                    throw new NullPointerException();
                }
                efoVar2.a |= 2;
                efoVar2.c = methodName;
                int lineNumber = stackTraceElement.getLineNumber();
                efpVar.c();
                efo efoVar3 = (efo) efpVar.a;
                efoVar3.a |= 8;
                efoVar3.e = lineNumber;
                if (stackTraceElement.getFileName() != null) {
                    String fileName = stackTraceElement.getFileName();
                    efpVar.c();
                    efo efoVar4 = (efo) efpVar.a;
                    if (fileName == null) {
                        throw new NullPointerException();
                    }
                    efoVar4.a |= 4;
                    efoVar4.d = fileName;
                }
            }
            efnVar.c();
            efm efmVar3 = (efm) efnVar.a;
            if (!efmVar3.d.a()) {
                fjf fjfVar = efmVar3.d;
                int size = fjfVar.size();
                efmVar3.d = fjfVar.a(size == 0 ? 10 : size << 1);
            }
            efmVar3.d.add((efo) ((fin) efpVar.h()));
        }
        return efnVar;
    }
}
