package flm;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gka {
    public static final gjz[] a = {new gjz(gjz.e, ""), new gjz(gjz.b, "GET"), new gjz(gjz.b, "POST"), new gjz(gjz.c, "/"), new gjz(gjz.c, "/index.html"), new gjz(gjz.d, "http"), new gjz(gjz.d, "https"), new gjz(gjz.a, "200"), new gjz(gjz.a, "204"), new gjz(gjz.a, "206"), new gjz(gjz.a, "304"), new gjz(gjz.a, "400"), new gjz(gjz.a, "404"), new gjz(gjz.a, "500"), new gjz("accept-charset", ""), new gjz("accept-encoding", "gzip, deflate"), new gjz("accept-language", ""), new gjz("accept-ranges", ""), new gjz("accept", ""), new gjz("access-control-allow-origin", ""), new gjz("age", ""), new gjz("allow", ""), new gjz("authorization", ""), new gjz("cache-control", ""), new gjz("content-disposition", ""), new gjz("content-encoding", ""), new gjz("content-language", ""), new gjz("content-length", ""), new gjz("content-location", ""), new gjz("content-range", ""), new gjz("content-type", ""), new gjz("cookie", ""), new gjz("date", ""), new gjz("etag", ""), new gjz("expect", ""), new gjz("expires", ""), new gjz("from", ""), new gjz("host", ""), new gjz("if-match", ""), new gjz("if-modified-since", ""), new gjz("if-none-match", ""), new gjz("if-range", ""), new gjz("if-unmodified-since", ""), new gjz("last-modified", ""), new gjz("link", ""), new gjz("location", ""), new gjz("max-forwards", ""), new gjz("proxy-authenticate", ""), new gjz("proxy-authorization", ""), new gjz("range", ""), new gjz("referer", ""), new gjz("refresh", ""), new gjz("retry-after", ""), new gjz("server", ""), new gjz("set-cookie", ""), new gjz("strict-transport-security", ""), new gjz("transfer-encoding", ""), new gjz("user-agent", ""), new gjz("vary", ""), new gjz("via", ""), new gjz("www-authenticate", "")};
    public static final Map b;

    static guf a(guf gufVar) throws IOException {
        int iE = gufVar.e();
        for (int i = 0; i < iE; i++) {
            byte bA = gufVar.a(i);
            if (bA >= 65 && bA <= 90) {
                String strValueOf = String.valueOf(gufVar.a());
                throw new IOException(strValueOf.length() != 0 ? "PROTOCOL_ERROR response malformed: mixed case name: ".concat(strValueOf) : new String("PROTOCOL_ERROR response malformed: mixed case name: "));
            }
        }
        return gufVar;
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(a.length);
        for (int i = 0; i < a.length; i++) {
            if (!linkedHashMap.containsKey(a[i].f)) {
                linkedHashMap.put(a[i].f, Integer.valueOf(i));
            }
        }
        b = Collections.unmodifiableMap(linkedHashMap);
    }
}
