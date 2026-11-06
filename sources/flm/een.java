package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class een extends ebj {
    private final StackTraceElement b;

    public een(StackTraceElement stackTraceElement) {
        this.b = (StackTraceElement) eel.a(stackTraceElement, "stack element");
    }

    @Override // flm.ebj
    public final String a() {
        return this.b.getClassName();
    }

    @Override // flm.ebj
    public final String b() {
        return this.b.getMethodName();
    }

    @Override // flm.ebj
    public final int c() {
        return Math.max(this.b.getLineNumber(), 0);
    }

    @Override // flm.ebj
    public final String d() {
        return this.b.getFileName();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof een) && this.b.equals(((een) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
