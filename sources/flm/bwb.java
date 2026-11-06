package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bwb {
    private final bw a;

    bwb(cn cnVar) {
        this.a = cnVar.a("INSERT OR REPLACE INTO PolicyEntity(type,subKey,generation,version,value,status) VALUES (?1,?2,?3,?4,?5,(CASE (SELECT version FROM PolicyEntity WHERE type = ?1 AND subKey = ?2)  WHEN ?4 THEN (SELECT status FROM PolicyEntity WHERE type = ?1 AND subKey = ?2) WHEN NULL THEN 0 ELSE 0 END))");
    }

    public abstract int a(fdc fdcVar, String str, int i);

    public abstract void a(long j);

    public abstract void a(fdc fdcVar, String... strArr);

    public abstract bwg[] a(fdc fdcVar);

    public abstract fdc[] a();

    public abstract bwg b(fdc fdcVar, String str);

    public abstract void b(bwg bwgVar);

    public abstract bwg[] b();

    public abstract bwg[] b(fdc fdcVar);

    public abstract long c();

    public abstract bwg[] c(fdc fdcVar);

    public abstract bwg[] c(fdc fdcVar, String str);

    public final void a(bwg bwgVar) {
        this.a.b();
        this.a.a(1, bwgVar.a.z);
        this.a.a(2, bwgVar.b);
        this.a.a(3, bwgVar.c);
        this.a.a(4, bwgVar.d);
        this.a.a(5, bwgVar.f);
        this.a.a();
    }

    public final boolean a(fdc fdcVar, String str) {
        return a(fdcVar, str, 0) > 0;
    }
}
