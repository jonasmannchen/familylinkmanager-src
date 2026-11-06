package flm;

import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class dsl implements dtq {
    public final dtq a;
    public final String b;
    private final UUID c;

    dsl(String str, UUID uuid) {
        this.b = str;
        this.a = null;
        this.c = uuid;
    }

    dsl(String str, dtq dtqVar) {
        this.b = str;
        this.a = dtqVar;
        this.c = dtqVar.b();
    }

    @Override // flm.dte, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        duj.b(this.b);
    }

    @Override // flm.dtq
    public final dtq a() {
        return this.a;
    }

    @Override // flm.dtq
    public final UUID b() {
        return this.c;
    }

    @Override // flm.dtq
    public final String c() {
        return this.b;
    }

    public final String toString() {
        return duj.c(this);
    }
}
