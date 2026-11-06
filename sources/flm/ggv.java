package flm;

import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ggv {
    private static final long a = TimeUnit.SECONDS.toNanos(1);

    static ggh a(Map map) {
        if (map == null || !map.containsKey("retryThrottling")) {
            return null;
        }
        Map mapB = b(map, "retryThrottling");
        float fFloatValue = c(mapB, "maxTokens").floatValue();
        float fFloatValue2 = c(mapB, "tokenRatio").floatValue();
        dvl.b(fFloatValue > 0.0f, "maxToken should be greater than zero");
        dvl.b(fFloatValue2 > 0.0f, "tokenRatio should be greater than zero");
        return new ggh(fFloatValue, fFloatValue2);
    }

    static Integer b(Map map) {
        if (map.containsKey("maxAttempts")) {
            return Integer.valueOf(c(map, "maxAttempts").intValue());
        }
        return null;
    }

    static Long c(Map map) {
        if (!map.containsKey("initialBackoff")) {
            return null;
        }
        try {
            return Long.valueOf(a(d(map, "initialBackoff")));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    static Long d(Map map) {
        if (!map.containsKey("maxBackoff")) {
            return null;
        }
        try {
            return Long.valueOf(a(d(map, "maxBackoff")));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    static Double e(Map map) {
        if (map.containsKey("backoffMultiplier")) {
            return c(map, "backoffMultiplier");
        }
        return null;
    }

    static List f(Map map) {
        if (map.containsKey("retryableStatusCodes")) {
            return a(a(map, "retryableStatusCodes"));
        }
        return null;
    }

    static Integer g(Map map) {
        if (map.containsKey("maxAttempts")) {
            return Integer.valueOf(c(map, "maxAttempts").intValue());
        }
        return null;
    }

    static Long h(Map map) {
        if (!map.containsKey("hedgingDelay")) {
            return null;
        }
        try {
            return Long.valueOf(a(d(map, "hedgingDelay")));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    static List i(Map map) {
        if (map.containsKey("nonFatalStatusCodes")) {
            return a(a(map, "nonFatalStatusCodes"));
        }
        return null;
    }

    static String j(Map map) {
        if (map.containsKey("service")) {
            return d(map, "service");
        }
        return null;
    }

    static String k(Map map) {
        if (map.containsKey("method")) {
            return d(map, "method");
        }
        return null;
    }

    static Map l(Map map) {
        if (map.containsKey("retryPolicy")) {
            return b(map, "retryPolicy");
        }
        return null;
    }

    static Map m(Map map) {
        if (map.containsKey("hedgingPolicy")) {
            return b(map, "hedgingPolicy");
        }
        return null;
    }

    static List n(Map map) {
        if (map.containsKey("name")) {
            return b(a(map, "name"));
        }
        return null;
    }

    static Long o(Map map) {
        if (!map.containsKey("timeout")) {
            return null;
        }
        try {
            return Long.valueOf(a(d(map, "timeout")));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    static Boolean p(Map map) {
        if (!map.containsKey("waitForReady")) {
            return null;
        }
        Object objA = dvl.a(map.get("waitForReady"), "no such key %s", "waitForReady");
        if (objA instanceof Boolean) {
            return (Boolean) objA;
        }
        throw new ClassCastException(String.format("value %s for key %s in %s is not Boolean", objA, "waitForReady", map));
    }

    static Integer q(Map map) {
        if (map.containsKey("maxRequestMessageBytes")) {
            return Integer.valueOf(c(map, "maxRequestMessageBytes").intValue());
        }
        return null;
    }

    static Integer r(Map map) {
        if (map.containsKey("maxResponseMessageBytes")) {
            return Integer.valueOf(c(map, "maxResponseMessageBytes").intValue());
        }
        return null;
    }

    static List s(Map map) {
        if (map.containsKey("methodConfig")) {
            return b(a(map, "methodConfig"));
        }
        return null;
    }

    public static String t(Map map) {
        if (map.containsKey("loadBalancingPolicy")) {
            return d(map, "loadBalancingPolicy");
        }
        return null;
    }

    static List a(Map map, String str) {
        Object objA = dvl.a(map.get(str), "no such key %s", str);
        if (objA instanceof List) {
            return (List) objA;
        }
        throw new ClassCastException(String.format("value %s for key %s in %s is not List", objA, str, map));
    }

    static Map b(Map map, String str) {
        Object objA = dvl.a(map.get(str), "no such key %s", str);
        if (objA instanceof Map) {
            return (Map) objA;
        }
        throw new ClassCastException(String.format("value %s for key %s in %s is not object", objA, str, map));
    }

    static Double c(Map map, String str) {
        Object objA = dvl.a(map.get(str), "no such key %s", str);
        if (objA instanceof Double) {
            return (Double) objA;
        }
        throw new ClassCastException(String.format("value %s for key %s in %s is not Double", objA, str, map));
    }

    private static String d(Map map, String str) {
        Object objA = dvl.a(map.get(str), "no such key %s", str);
        if (objA instanceof String) {
            return (String) objA;
        }
        throw new ClassCastException(String.format("value %s for key %s in %s is not String", objA, str, map));
    }

    private static List b(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) instanceof Map)) {
                throw new ClassCastException(String.format("value %s for idx %d in %s is not object", list.get(i), Integer.valueOf(i), list));
            }
        }
        return list;
    }

    static List a(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) instanceof String)) {
                throw new ClassCastException(String.format("value %s for idx %d in %s is not string", list.get(i), Integer.valueOf(i), list));
            }
        }
        return list;
    }

    private static long a(String str) throws ParseException {
        boolean z;
        int i;
        int i2;
        long jA;
        int i3;
        if (str.isEmpty() || str.charAt(str.length() - 1) != 's') {
            String strValueOf = String.valueOf(str);
            throw new ParseException(strValueOf.length() != 0 ? "Invalid duration string: ".concat(strValueOf) : new String("Invalid duration string: "), 0);
        }
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            z = true;
        } else {
            z = false;
        }
        String strSubstring = str.substring(0, str.length() - 1);
        String strSubstring2 = "";
        int iIndexOf = strSubstring.indexOf(46);
        if (iIndexOf != -1) {
            strSubstring2 = strSubstring.substring(iIndexOf + 1);
            strSubstring = strSubstring.substring(0, iIndexOf);
        }
        long j = Long.parseLong(strSubstring);
        if (strSubstring2.isEmpty()) {
            i = 0;
        } else {
            int iCharAt = 0;
            for (int i4 = 0; i4 < 9; i4++) {
                iCharAt *= 10;
                if (i4 < strSubstring2.length()) {
                    if (strSubstring2.charAt(i4) < '0' || strSubstring2.charAt(i4) > '9') {
                        throw new ParseException("Invalid nanoseconds.", 0);
                    }
                    iCharAt += strSubstring2.charAt(i4) - '0';
                }
            }
            i = iCharAt;
        }
        if (j < 0) {
            String strValueOf2 = String.valueOf(str);
            throw new ParseException(strValueOf2.length() != 0 ? "Invalid duration string: ".concat(strValueOf2) : new String("Invalid duration string: "), 0);
        }
        if (z) {
            jA = -j;
            i2 = -i;
        } else {
            i2 = i;
            jA = j;
        }
        try {
            if (i2 <= (-a) || i2 >= a) {
                jA = efv.a(jA, ((long) i2) / a);
                i2 = (int) (((long) i2) % a);
            }
            if (jA > 0 && i2 < 0) {
                i2 = (int) (((long) i2) + a);
                jA--;
            }
            if (jA >= 0 || i2 <= 0) {
                i3 = i2;
            } else {
                jA++;
                i3 = (int) (((long) i2) - a);
            }
            boolean z2 = (jA < -315576000000L || jA > 315576000000L || i3 < -999999999 || i3 >= a) ? false : (jA >= 0 && i3 >= 0) || (jA <= 0 && i3 <= 0);
            if (!z2) {
                throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(jA), Integer.valueOf(i3)));
            }
            long nanos = TimeUnit.SECONDS.toNanos(jA);
            long j2 = i3;
            long j3 = nanos + j2;
            return (((j2 ^ nanos) > 0L ? 1 : ((j2 ^ nanos) == 0L ? 0 : -1)) < 0) | ((nanos ^ j3) >= 0) ? j3 : Long.MAX_VALUE + ((j3 >>> 63) ^ 1);
        } catch (IllegalArgumentException e) {
            throw new ParseException("Duration value is out of range.", 0);
        }
    }
}
