package flm;

import java.net.InetAddress;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
enum gaq implements gap {
    INSTANCE;

    @Override // flm.gap
    public final List a(String str) {
        return Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
    }
}
