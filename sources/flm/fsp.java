package flm;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fsp {
    public final Map b;
    public final byte[] c;
    private static final dvd d = new dvd(bdp.WHITELIST_DELIMITER);
    public static final fsp a = new fsp().a(new frw(), true).a(frx.a, false);

    private final fsp a(fso fsoVar, boolean z) {
        return new fsp(fsoVar, z, this);
    }

    private fsp(fso fsoVar, boolean z, fsp fspVar) {
        String strA = fsoVar.a();
        dvl.a(!strA.contains(bdp.WHITELIST_DELIMITER), "Comma is currently not allowed in message encoding");
        int size = fspVar.b.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(fspVar.b.containsKey(fsoVar.a()) ? size : size + 1);
        for (fsq fsqVar : fspVar.b.values()) {
            String strA2 = fsqVar.a.a();
            if (!strA2.equals(strA)) {
                linkedHashMap.put(strA2, new fsq(fsqVar.a, fsqVar.b));
            }
        }
        linkedHashMap.put(strA, new fsq(fsoVar, z));
        this.b = Collections.unmodifiableMap(linkedHashMap);
        dvd dvdVar = d;
        HashSet hashSet = new HashSet(this.b.size());
        for (Map.Entry entry : this.b.entrySet()) {
            if (((fsq) entry.getValue()).b) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.c = dvdVar.a((Iterable) Collections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }

    private fsp() {
        this.b = new LinkedHashMap(0);
        this.c = new byte[0];
    }
}
