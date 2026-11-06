package flm;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class gmx {
    private static final Set c;
    private final Set a = c;
    public final gnb b;

    protected gmx(gnb gnbVar, EnumSet enumSet) {
        this.b = (gnb) gkx.a((Object) gnbVar, "context");
        gkx.a(!((gnbVar.a.b & 1) != 0) || this.a.contains(gmy.RECORD_EVENTS), "Span is sampled, but does not have RECORD_EVENTS set.");
    }

    public abstract void a(gmp gmpVar);

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public void a(gmu gmuVar) {
        gmt gmtVar;
        gmr gmrVarA;
        gkx.a((Object) gmuVar, "event");
        if (gmuVar instanceof gmr) {
            gmrVarA = (gmr) gmuVar;
        } else {
            gmu gmuVar2 = gmuVar;
            if (gmuVar2.b() == gmw.RECV) {
                gmtVar = gmt.RECEIVED;
            } else {
                gmtVar = gmt.SENT;
            }
            gmrVarA = gmr.a(gmtVar, gmuVar2.c()).b(gmuVar2.d()).c(gmuVar2.e()).a();
        }
        a(gmrVarA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(gmr gmrVar) {
        gmw gmwVar;
        gmu gmuVarA;
        gkx.a((Object) gmrVar, "messageEvent");
        gkx.a((Object) gmrVar, "event");
        if (gmrVar instanceof gmu) {
            gmuVarA = (gmu) gmrVar;
        } else {
            gmr gmrVar2 = gmrVar;
            if (gmrVar2.a() == gmt.RECEIVED) {
                gmwVar = gmw.RECV;
            } else {
                gmwVar = gmw.SENT;
            }
            gmuVarA = new gml().a((gmw) gkx.a((Object) gmwVar, "type")).a(gmrVar2.b()).b(0L).c(0L).b(gmrVar2.c()).c(gmrVar2.d()).a();
        }
        a(gmuVarA);
    }

    static {
        Collections.emptyMap();
        c = Collections.unmodifiableSet(EnumSet.noneOf(gmy.class));
    }
}
