package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fpc implements fpb {
    private static final drf a;
    private static final drf b;

    @Override // flm.fpb
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // flm.fpb
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }

    static {
        drn drnVar = new drn(dre.a("com.google.android.gms"));
        a = drnVar.a("Grpc__enable_android_channel_builder", false);
        b = drnVar.a("Grpc__enable_android_channel_network_monitoring", false);
    }
}
