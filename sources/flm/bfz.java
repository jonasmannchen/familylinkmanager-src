package flm;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class bfz implements drm {
    public static final drm a = new bfz();

    private bfz() {
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
    @Override // flm.drm
    public final Object a(byte[] bArr) throws fjg {
        boolean z;
        fin finVarA = fin.a(bfa.a, bArr);
        if (finVarA != null) {
            boolean zBooleanValue = Boolean.TRUE.booleanValue();
            byte bByteValue = ((Byte) finVarA.a(dp.aq, (Object) null)).byteValue();
            if (bByteValue == 1) {
                z = true;
            } else if (bByteValue == 0) {
                z = false;
            } else {
                boolean zD = fkq.a.a(finVarA).d(finVarA);
                if (zBooleanValue) {
                    finVarA.a(dp.ar, zD ? finVarA : null);
                }
                z = zD;
            }
            if (!z) {
                fjg fjgVarA = new flp().a();
                if (fjgVarA == null) {
                    throw null;
                }
                throw fjgVarA;
            }
        }
        return (bfa) finVarA;
    }
}
