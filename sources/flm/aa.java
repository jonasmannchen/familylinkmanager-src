package flm;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aa {
    public static AtomicBoolean a = new AtomicBoolean(false);

    private static void a(lu luVar, z zVar) {
        List<lg> listC = luVar.c();
        if (listC == null) {
            return;
        }
        for (lg lgVar : listC) {
            if (lgVar != null) {
                a(lgVar, zVar);
                if (lgVar.u != null && lgVar.m) {
                    a(lgVar.l(), zVar);
                }
            }
        }
    }

    private static void a(Object obj, z zVar) {
        if (obj instanceof ai) {
            ((ai) obj).a().a(zVar);
        }
    }

    static void a(ln lnVar, z zVar) {
        a((Object) lnVar, zVar);
        a((lu) lnVar.b.a.d, zVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void a(lg lgVar, y yVar) {
        if (lgVar instanceof ai) {
            ((ai) lgVar).a().a(yVar);
        }
    }
}
