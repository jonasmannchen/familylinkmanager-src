package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fim implements fkd {
    public static final fim a = new fim();

    private fim() {
    }

    @Override // flm.fkd
    public final boolean a(Class cls) {
        return fin.class.isAssignableFrom(cls);
    }

    @Override // flm.fkd
    public final fkc b(Class cls) {
        if (!fin.class.isAssignableFrom(cls)) {
            String strValueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unsupported message type: ".concat(strValueOf) : new String("Unsupported message type: "));
        }
        try {
            return (fkc) fin.a(cls.asSubclass(fin.class)).a(dp.as, (Object) null);
        } catch (Exception e) {
            String strValueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(strValueOf2.length() != 0 ? "Unable to get message info for ".concat(strValueOf2) : new String("Unable to get message info for "), e);
        }
    }
}
