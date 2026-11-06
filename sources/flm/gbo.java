package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum gbo {
    NO_ERROR(0, fvc.j),
    PROTOCOL_ERROR(1, fvc.i),
    INTERNAL_ERROR(2, fvc.i),
    FLOW_CONTROL_ERROR(3, fvc.i),
    SETTINGS_TIMEOUT(4, fvc.i),
    STREAM_CLOSED(5, fvc.i),
    FRAME_SIZE_ERROR(6, fvc.i),
    REFUSED_STREAM(7, fvc.j),
    CANCEL(8, fvc.c),
    COMPRESSION_ERROR(9, fvc.i),
    CONNECT_ERROR(10, fvc.i),
    ENHANCE_YOUR_CALM(11, fvc.h.a("Bandwidth exhausted")),
    INADEQUATE_SECURITY(12, fvc.f.a("Permission denied as protocol is not secure enough to call")),
    HTTP_1_1_REQUIRED(13, fvc.d);

    private static final gbo[] o;
    private final int p;
    private final fvc q;

    gbo(int i, fvc fvcVar) {
        this.p = i;
        String strValueOf = String.valueOf(name());
        this.q = fvcVar.b(strValueOf.length() != 0 ? "HTTP/2 error code: ".concat(strValueOf) : new String("HTTP/2 error code: "));
    }

    public static fvc a(long j) {
        gbo gboVar;
        if (j >= o.length || j < 0) {
            gboVar = null;
        } else {
            gboVar = o[(int) j];
        }
        if (gboVar == null) {
            return fvc.a(INTERNAL_ERROR.q.m.r).a(new StringBuilder(52).append("Unrecognized HTTP/2 error code: ").append(j).toString());
        }
        return gboVar.q;
    }

    static {
        gbo[] gboVarArrValues = values();
        gbo[] gboVarArr = new gbo[gboVarArrValues[gboVarArrValues.length - 1].p + 1];
        for (gbo gboVar : gboVarArrValues) {
            gboVarArr[gboVar.p] = gboVar;
        }
        o = gboVarArr;
    }
}
