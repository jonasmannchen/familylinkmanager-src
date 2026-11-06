package flm;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aqt extends aqs {
    private final Callable c;

    aqt(Callable callable) {
        super(false, null, null);
        this.c = callable;
    }

    @Override // flm.aqs
    final String a() {
        try {
            return (String) this.c.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
