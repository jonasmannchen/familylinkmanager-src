package flm;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fss {
    public final List a;
    public final frd b;
    private final int c;

    private fss(List list, frd frdVar) {
        dvl.a(!list.isEmpty(), "addrs is empty");
        this.a = Collections.unmodifiableList(new ArrayList(list));
        this.b = (frd) dvl.a(frdVar, "attrs");
        this.c = this.a.hashCode();
    }

    public fss(SocketAddress socketAddress) {
        this(socketAddress, frd.b);
    }

    private fss(SocketAddress socketAddress, frd frdVar) {
        this(Collections.singletonList(socketAddress), frdVar);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        return new StringBuilder(String.valueOf(strValueOf).length() + 16 + String.valueOf(strValueOf2).length()).append("[addrs=").append(strValueOf).append(", attrs=").append(strValueOf2).append("]").toString();
    }

    public final int hashCode() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fss)) {
            return false;
        }
        fss fssVar = (fss) obj;
        if (this.a.size() != fssVar.a.size()) {
            return false;
        }
        for (int i = 0; i < this.a.size(); i++) {
            if (!((SocketAddress) this.a.get(i)).equals(fssVar.a.get(i))) {
                return false;
            }
        }
        return this.b.equals(fssVar.b);
    }
}
