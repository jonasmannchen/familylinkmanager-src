package flm;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class uc {
    public final Object a;

    public static uc a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        return new uc(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, false));
    }

    private uc(Object obj) {
        this.a = obj;
    }
}
