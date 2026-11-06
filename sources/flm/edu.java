package flm;

import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class edu extends edp {
    public static final edp a = new edu();

    private edu() {
    }

    @Override // flm.edp
    public final ecg a(String str) {
        return new edw(Logger.getLogger(str.replace('$', '.')));
    }

    public final String toString() {
        return "Default logger backend factory";
    }
}
