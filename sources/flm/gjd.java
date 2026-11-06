package flm;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class gjd {
    public static ftv a(List list) {
        return fth.a(c(list));
    }

    public static ftv b(List list) {
        return fth.a(c(list));
    }

    private static byte[][] c(List list) {
        byte[][] bArr = new byte[list.size() << 1][];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            gjz gjzVar = (gjz) it.next();
            int i2 = i + 1;
            bArr[i] = gjzVar.f.f();
            i = i2 + 1;
            bArr[i2] = gjzVar.g.f();
        }
        return ghj.a(bArr);
    }

    private gjd() {
    }

    static {
        Logger.getLogger(gjd.class.getName());
    }
}
