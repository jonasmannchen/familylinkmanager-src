package flm;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class frp {
    public static final frm a = new frq();

    public static frl a(frl frlVar, fro... froVarArr) {
        return a(frlVar, Arrays.asList(froVarArr));
    }

    public static frl a(frl frlVar, List list) {
        dvl.a(frlVar, "channel");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            frlVar = new frs(frlVar, (fro) it.next());
        }
        return frlVar;
    }
}
