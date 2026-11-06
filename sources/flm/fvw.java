package flm;

import java.net.InetSocketAddress;
import org.chromium.net.CronetEngine;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fvw extends fwp {
    private boolean A;
    private int B;
    public boolean a;
    public int b;
    public boolean c;
    public int d;
    private final CronetEngine z;

    public static fvw a(String str, int i, CronetEngine cronetEngine) {
        dvl.a(cronetEngine, "cronetEngine");
        return new fvw(str, i, cronetEngine);
    }

    private fvw(String str, int i, CronetEngine cronetEngine) {
        super(InetSocketAddress.createUnresolved(str, i), gbh.a(str, i));
        this.A = false;
        this.B = 4194304;
        this.z = (CronetEngine) dvl.a(cronetEngine, "cronetEngine");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fwp
    public final fzd a() {
        return new fvx(new fvz(this.z, this.a, this.b, this.c, this.d), egn.INSTANCE, null, this.B, false, this.w.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fwp
    public final frd d() {
        return frd.a().a(fuj.a, 443).a();
    }

    @Override // flm.ftu
    public final /* synthetic */ ftu a(boolean z) {
        throw new IllegalArgumentException("Plaintext not currently supported");
    }
}
