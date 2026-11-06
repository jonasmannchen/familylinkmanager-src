package flm;

import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class foa {
    public static String a(String str, String str2) {
        try {
            return "Basic " + guf.a((str + ":" + str2).getBytes("ISO-8859-1")).b();
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError();
        }
    }
}
