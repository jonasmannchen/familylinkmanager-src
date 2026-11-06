package flm;

import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eda extends ecy {
    private final edl b;

    eda(String str, String str2, boolean z) {
        super(str2);
        this.b = new edl(str, str2, z);
    }

    @Override // flm.ecg
    public final boolean a(Level level) {
        return true;
    }

    @Override // flm.ecg
    public final void a(ecf ecfVar) {
        this.b.a(ecfVar);
    }
}
