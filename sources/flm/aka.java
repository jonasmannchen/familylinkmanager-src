package flm;

import com.android.volley.Cache;
import com.android.volley.Header;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.DiskBasedCache;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aka {
    public long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;

    private aka(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.b = str;
        this.c = "".equals(str2) ? null : str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public aka(String str, Cache.Entry entry) {
        List arrayList;
        String str2 = entry.etag;
        long j = entry.serverDate;
        long j2 = entry.lastModified;
        long j3 = entry.ttl;
        long j4 = entry.softTtl;
        if (entry.allResponseHeaders != null) {
            arrayList = entry.allResponseHeaders;
        } else {
            Map map = entry.responseHeaders;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry2 : map.entrySet()) {
                arrayList.add(new Header((String) entry2.getKey(), (String) entry2.getValue()));
            }
        }
        this(str, str2, j, j2, j3, j4, arrayList);
    }

    public static aka a(akb akbVar) throws IOException {
        if (DiskBasedCache.a((InputStream) akbVar) != 538247942) {
            throw new IOException();
        }
        String strA = DiskBasedCache.a(akbVar);
        String strA2 = DiskBasedCache.a(akbVar);
        long jB = DiskBasedCache.b(akbVar);
        long jB2 = DiskBasedCache.b(akbVar);
        long jB3 = DiskBasedCache.b(akbVar);
        long jB4 = DiskBasedCache.b(akbVar);
        int iA = DiskBasedCache.a((InputStream) akbVar);
        if (iA < 0) {
            throw new IOException(new StringBuilder(31).append("readHeaderList size=").append(iA).toString());
        }
        List listEmptyList = iA == 0 ? Collections.emptyList() : new ArrayList();
        for (int i = 0; i < iA; i++) {
            listEmptyList.add(new Header(DiskBasedCache.a(akbVar).intern(), DiskBasedCache.a(akbVar).intern()));
        }
        return new aka(strA, strA2, jB, jB2, jB3, jB4, listEmptyList);
    }

    public final boolean a(OutputStream outputStream) {
        try {
            DiskBasedCache.a(outputStream, 538247942);
            DiskBasedCache.a(outputStream, this.b);
            DiskBasedCache.a(outputStream, this.c == null ? "" : this.c);
            DiskBasedCache.a(outputStream, this.d);
            DiskBasedCache.a(outputStream, this.e);
            DiskBasedCache.a(outputStream, this.f);
            DiskBasedCache.a(outputStream, this.g);
            List<Header> list = this.h;
            if (list != null) {
                DiskBasedCache.a(outputStream, list.size());
                for (Header header : list) {
                    DiskBasedCache.a(outputStream, header.getName());
                    DiskBasedCache.a(outputStream, header.getValue());
                }
            } else {
                DiskBasedCache.a(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e) {
            VolleyLog.d("%s", e.toString());
            return false;
        }
    }
}
