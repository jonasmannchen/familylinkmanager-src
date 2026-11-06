package flm;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class atd {
    public static final int API_PRIORITY_GAMES = 1;
    public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
    public static final int API_PRIORITY_PLUS = 2;

    public int getPriority() {
        return Integer.MAX_VALUE;
    }

    public List getImpliedScopes(Object obj) {
        return Collections.emptyList();
    }
}
