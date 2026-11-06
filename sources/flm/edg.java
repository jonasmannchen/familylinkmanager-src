package flm;

import dalvik.system.VMStack;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class edg extends ecm {
    edg() {
    }

    @Override // flm.ecm
    public String a(Class cls) {
        StackTraceElement stackTraceElementA;
        if (edf.e) {
            try {
                Class clsL = edf.l();
                if (cls.equals(clsL)) {
                    return VMStack.getStackClass2().getName();
                }
                String strValueOf = String.valueOf(cls);
                String strValueOf2 = String.valueOf(clsL);
                throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf).length() + 43 + String.valueOf(strValueOf2).length()).append("Unexpected stack depth, expected: ").append(strValueOf).append(" but was ").append(strValueOf2).toString());
            } catch (Throwable th) {
            }
        }
        if (!edf.f || (stackTraceElementA = eek.a(cls, new Throwable(), 1)) == null) {
            return null;
        }
        return stackTraceElementA.getClassName();
    }

    @Override // flm.ecm
    public ebj a(Class cls, int i) {
        return ebj.a;
    }
}
