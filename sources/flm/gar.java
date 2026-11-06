package flm;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gar {
    public final List a;
    public final List b;
    public final List c;

    gar(List list, List list2, List list3) {
        this.a = Collections.unmodifiableList((List) dvl.a(list, "addresses"));
        this.b = Collections.unmodifiableList((List) dvl.a(list2, "txtRecords"));
        this.c = Collections.unmodifiableList((List) dvl.a(list3, "balancerAddresses"));
    }

    public final String toString() {
        return dve.a(this).a("addresses", this.a).a("txtRecords", this.b).a("balancerAddresses", this.c).toString();
    }
}
