package flm;

import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eay extends eaw {
    private static final ebb a = new ebb();

    @Deprecated
    public static eay a(String str) {
        if (!str.isEmpty()) {
            return new eay(eck.a(str.replace('/', '.')));
        }
        throw new IllegalArgumentException("injected class name is empty");
    }

    private eay(ecg ecgVar) {
        super(ecgVar);
    }

    @Override // flm.eaw
    public final /* synthetic */ ebq a(Level level) {
        boolean zA = this.b.a(level);
        boolean zA2 = eck.a(this.b.a(), level, zA);
        if (zA || zA2) {
            return new eba(this, level, zA2);
        }
        return a;
    }
}
