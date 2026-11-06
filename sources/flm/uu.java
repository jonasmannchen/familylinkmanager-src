package flm;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class uu extends ud {
    private final /* synthetic */ ur b;

    uu(ur urVar) {
        this.b = urVar;
    }

    @Override // flm.ud
    public final ua a(int i) {
        return ua.a(AccessibilityNodeInfo.obtain(this.b.b(i).a));
    }

    @Override // flm.ud
    public final boolean a(int i, int i2, Bundle bundle) {
        ur urVar = this.b;
        switch (i) {
            case -1:
                return ti.a(urVar.c, i2, bundle);
            default:
                switch (i2) {
                    case 1:
                        if ((urVar.c.isFocused() || urVar.c.requestFocus()) && urVar.e != i) {
                            if (urVar.e != Integer.MIN_VALUE) {
                                urVar.d(urVar.e);
                            }
                            urVar.e = i;
                            urVar.a(i, 8);
                            return true;
                        }
                        return false;
                    case 2:
                        return urVar.d(i);
                    case 64:
                        if (!urVar.b.isEnabled() || !urVar.b.isTouchExplorationEnabled()) {
                            return false;
                        }
                        if (urVar.d == i) {
                            return false;
                        }
                        if (urVar.d != Integer.MIN_VALUE) {
                            urVar.c(urVar.d);
                        }
                        urVar.d = i;
                        urVar.c.invalidate();
                        urVar.a(i, 32768);
                        return true;
                    case 128:
                        return urVar.c(i);
                    default:
                        return urVar.b(i, i2);
                }
        }
    }

    @Override // flm.ud
    public final ua b(int i) {
        int i2 = i == 2 ? this.b.d : this.b.e;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i2);
    }
}
