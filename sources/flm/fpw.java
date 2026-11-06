package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fpw {
    public static final drf a;
    public static final drf b;
    public static final drf c;
    public static final drf d;

    static {
        drn drnVarA = new drn("direct_boot:gms_chimera_phenotype_flags").a("gms:common:");
        a = drnVarA.a("UncertifiedDevice__enable_uncertified_device_check", true);
        b = drnVarA.a("UncertifiedDevice__uncertified_exceptions_whitelist", "130,151");
        c = drnVarA.a("UncertifiedDevice__uncertified_feature_exceptions_whitelist", "googlecertificates");
        d = drnVarA.a("UncertifiedDevice__uncertified_logging_sample_percentage", 0.01d);
    }
}
