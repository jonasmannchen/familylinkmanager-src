package com.android.volley.toolbox;

import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyLog;
import flm.bdp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class HttpHeaderParser {
    public static Cache.Entry parseCacheHeaders(NetworkResponse networkResponse) {
        boolean z;
        boolean z2;
        long j;
        long j2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = networkResponse.headers;
        long j3 = 0;
        long j4 = 0;
        String str = (String) map.get("Date");
        long dateAsEpoch = str != null ? parseDateAsEpoch(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        if (str2 != null) {
            String[] strArrSplit = str2.split(bdp.WHITELIST_DELIMITER, 0);
            z = false;
            long j5 = 0;
            long j6 = 0;
            for (String str3 : strArrSplit) {
                String strTrim = str3.trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j6 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception e) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    try {
                        j5 = Long.parseLong(strTrim.substring(23));
                    } catch (Exception e2) {
                    }
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z = true;
                }
            }
            j3 = j6;
            j4 = j5;
            z2 = true;
        } else {
            z = false;
            z2 = false;
        }
        String str4 = (String) map.get("Expires");
        long dateAsEpoch2 = str4 != null ? parseDateAsEpoch(str4) : 0L;
        String str5 = (String) map.get("Last-Modified");
        long dateAsEpoch3 = str5 != null ? parseDateAsEpoch(str5) : 0L;
        String str6 = (String) map.get("ETag");
        if (z2) {
            j2 = jCurrentTimeMillis + (1000 * j3);
            j = z ? j2 : (1000 * j4) + j2;
        } else if (dateAsEpoch <= 0 || dateAsEpoch2 < dateAsEpoch) {
            j = 0;
            j2 = 0;
        } else {
            j = (dateAsEpoch2 - dateAsEpoch) + jCurrentTimeMillis;
            j2 = j;
        }
        Cache.Entry entry = new Cache.Entry();
        entry.data = networkResponse.data;
        entry.etag = str6;
        entry.softTtl = j2;
        entry.ttl = j;
        entry.serverDate = dateAsEpoch;
        entry.lastModified = dateAsEpoch3;
        entry.responseHeaders = map;
        entry.allResponseHeaders = networkResponse.allHeaders;
        return entry;
    }

    public static long parseDateAsEpoch(String str) {
        try {
            return a().parse(str).getTime();
        } catch (ParseException e) {
            VolleyLog.e(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    static SimpleDateFormat a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    public static String parseCharset(Map map, String str) {
        String str2 = (String) map.get("Content-Type");
        if (str2 != null) {
            String[] strArrSplit = str2.split(";", 0);
            for (int i = 1; i < strArrSplit.length; i++) {
                String[] strArrSplit2 = strArrSplit[i].trim().split("=", 0);
                if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                    return strArrSplit2[1];
                }
            }
            return str;
        }
        return str;
    }
}
