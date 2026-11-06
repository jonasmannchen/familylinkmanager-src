package flm;

import android.view.View;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hz implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        float fX = ti.x((View) obj);
        float fX2 = ti.x((View) obj2);
        if (fX > fX2) {
            return -1;
        }
        return fX < fX2 ? 1 : 0;
    }
}
