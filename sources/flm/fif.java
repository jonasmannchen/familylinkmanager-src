package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fif {
    public static final fid a = new fie();
    private static final fid b = b();

    private static fid b() {
        try {
            return (fid) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }

    static fid a() {
        if (b == null) {
            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
        }
        return b;
    }
}
