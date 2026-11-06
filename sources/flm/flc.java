package flm;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class flc extends flb {
    flc(int i) {
        super(i, (byte) 0);
    }

    @Override // flm.flb
    public final void a() {
        if (!this.c) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= b()) {
                    break;
                }
                Map.Entry entryB = b(i2);
                if (((fih) entryB.getKey()).d()) {
                    entryB.setValue(Collections.unmodifiableList((List) entryB.getValue()));
                }
                i = i2 + 1;
            }
            for (Map.Entry entry : c()) {
                if (((fih) entry.getKey()).d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
