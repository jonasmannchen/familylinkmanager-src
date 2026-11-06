package flm;

import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eba extends eax implements eaz {
    private final /* synthetic */ eay a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    eba(eay eayVar, Level level, boolean z) {
        super(level, z);
        this.a = eayVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.ebf
    public final /* synthetic */ eaw b() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.ebf
    public final /* bridge */ /* synthetic */ ebq c() {
        if (this == null) {
            throw null;
        }
        return this;
    }
}
