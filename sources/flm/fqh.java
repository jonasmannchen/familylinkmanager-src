package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fqh implements fqg {
    private static final drf a;
    private static final drf b;
    private static final drf c;
    private static final drf d;
    private static final drf e;
    private static final drf f;
    private static final drf g;
    private static final drf h;
    private static final drf i;

    @Override // flm.fqg
    public final String a() {
        return (String) a.b();
    }

    @Override // flm.fqg
    public final String b() {
        return (String) b.b();
    }

    @Override // flm.fqg
    public final String c() {
        return (String) c.b();
    }

    @Override // flm.fqg
    public final long d() {
        return ((Long) d.b()).longValue();
    }

    @Override // flm.fqg
    public final String e() {
        return (String) e.b();
    }

    @Override // flm.fqg
    public final String f() {
        return (String) f.b();
    }

    @Override // flm.fqg
    public final String g() {
        return (String) g.b();
    }

    @Override // flm.fqg
    public final String h() {
        return (String) h.b();
    }

    @Override // flm.fqg
    public final long i() {
        return ((Long) i.b()).longValue();
    }

    static {
        drn drnVarA = new drn(dre.a("com.google.android.gms.kids")).a();
        a = drnVarA.a("gms:kids:kidsmanagement_reauth_scope", "https://www.googleapis.com/auth/accounts.reauth");
        b = drnVarA.a("gms:kids:familymanagement_auth_scope", "https://www.googleapis.com/auth/kid.family");
        c = drnVarA.a("gms:kids:familymanagement_server_host", "familymanagement-pa.googleapis.com");
        d = drnVarA.a("gms:kids:familymanagement_server_port", 443L);
        e = drnVarA.a("gms:kids:kidsmanagement_bootstrap_scope", "https://www.googleapis.com/auth/kid.management.bootstrap");
        f = drnVarA.a("gms:kids:kidsmanagement_privileged_scope", "oauth2:https://www.googleapis.com/auth/kid.management.privileged");
        g = drnVarA.a("gms:kids:kidsmanagement_auth_scope", "https://www.googleapis.com/auth/kid.management");
        h = drnVarA.a("gms:kids:kidsmanagement_server_host", "kidsmanagement-pa.googleapis.com");
        i = drnVarA.a("gms:kids:kidsmanagement_server_port", 443L);
    }
}
