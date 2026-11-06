package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fqa implements fpz {
    private static final drf a;
    private static final drf b;
    private static final drf c;
    private static final drf d;

    @Override // flm.fpz
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // flm.fpz
    public final String b() {
        return (String) b.b();
    }

    @Override // flm.fpz
    public final boolean c() {
        return ((Boolean) c.b()).booleanValue();
    }

    @Override // flm.fpz
    public final boolean d() {
        return ((Boolean) d.b()).booleanValue();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    static {
        boolean zD;
        drn drnVarA = new drn(dre.a("com.google.android.gms.kids")).a();
        a = drnVarA.a("Coexistence__coexistence_enabled", false);
        try {
            fin finVarA = fin.a(but.b, new byte[]{10, 26, 10, 18, 99, 111, 109, 46, 97, 110, 100, 114, 111, 105, 100, 46, 99, 104, 114, 111, 109, 101, 16, -76, -19, -58, -98, 1, 10, 47, 10, 39, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 103, 111, 111, 103, 108, 101, 113, 117, 105, 99, 107, 115, 101, 97, 114, 99, 104, 98, 111, 120, 16, -128, -67, -75, -113, 1});
            if (finVarA != null) {
                boolean zBooleanValue = Boolean.TRUE.booleanValue();
                byte bByteValue = ((Byte) finVarA.a(dp.aq, (Object) null)).byteValue();
                if (bByteValue == 1) {
                    zD = true;
                } else if (bByteValue == 0) {
                    zD = false;
                } else {
                    zD = fkq.a.a(finVarA).d(finVarA);
                    if (zBooleanValue) {
                        finVarA.a(dp.ar, zD ? finVarA : null);
                    }
                }
                if (!zD) {
                    fjg fjgVarA = new flp().a();
                    if (fjgVarA != null) {
                        throw fjgVarA;
                    }
                    throw null;
                }
            }
            drnVarA.a("Coexistence__coexistence_min_package_version_codes", (but) finVarA, fqb.a);
            b = drnVarA.a("Coexistence__coexistence_min_package_version_codes_string", "com.android.chrome:332510900,com.google.android.googlequicksearchbox:300768896");
            c = drnVarA.a("Coexistence__coexistence_secondary_account_sign_in_enabled", false);
            d = drnVarA.a("CoexistenceFeature__should_ignore_user_recoverable_error_on_secondary_account_server_check", false);
        } catch (fjg e) {
            throw new AssertionError("Could not parse proto flag \"Coexistence__coexistence_min_package_version_codes\"", e);
        }
    }
}
