package flm;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class uf extends ue {
    uf(ud udVar) {
        super(udVar);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        ua uaVarB = this.a.b(i);
        if (uaVarB == null) {
            return null;
        }
        return uaVarB.a;
    }
}
