package flm;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dvd {
    private final String a;

    public static dvd a(String str) {
        return new dvd(str);
    }

    public dvd(String str) {
        this.a = (String) dvl.a(str);
    }

    public final StringBuilder a(StringBuilder sb, Iterator it) {
        try {
            dvl.a(sb);
            if (it.hasNext()) {
                sb.append(a(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.a);
                    sb.append(a(it.next()));
                }
            }
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final String a(Iterable iterable) {
        return a(new StringBuilder(), iterable.iterator()).toString();
    }

    private static CharSequence a(Object obj) {
        dvl.a(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
