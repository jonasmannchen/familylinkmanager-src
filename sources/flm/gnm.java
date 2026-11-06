package flm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gnm {
    public static final gnl b;
    public final gnl a;
    private ArrayList c;

    gnm(gnl gnlVar) {
        gkx.a((Object) gnlVar, "parent");
        this.a = gnlVar;
        this.c = null;
    }

    static {
        List listEmptyList = Collections.emptyList();
        if (!(listEmptyList.size() <= 32)) {
            throw new IllegalStateException("Invalid size");
        }
        b = new gmm(Collections.unmodifiableList(listEmptyList));
    }
}
