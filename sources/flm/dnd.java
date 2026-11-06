package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dnd {
    public final gpa a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final gok f;
    public final String g;
    public final Boolean h;
    public final gpr i;

    public dnd(gpa gpaVar, Long l, Long l2, Long l3, Long l4, gok gokVar, String str, Boolean bool, gpr gprVar) {
        this.a = gpaVar;
        this.b = l;
        this.c = l2;
        this.d = l3;
        this.e = l4;
        this.f = gokVar;
        this.g = str;
        this.h = bool;
        this.i = gprVar;
    }

    public final String a() {
        return this.g;
    }

    public final Boolean b() {
        return this.h;
    }

    public final gpr c() {
        return this.i;
    }

    public final String toString() {
        return String.format("StatsRecord:\n  elapsed: %d\n  current: %d\n  Primes version: %d\n  version name #: %d\n  customName: %s\n", this.b, this.c, this.d, this.e, this.g);
    }
}
