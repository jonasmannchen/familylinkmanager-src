package flm;

import com.google.android.chimera.FragmentManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cbo implements FragmentManager.OnBackStackChangedListener {
    private final /* synthetic */ cbn a;

    cbo(cbn cbnVar) {
        this.a = cbnVar;
    }

    public final void onBackStackChanged() {
        int i;
        int backStackEntryCount = this.a.a.getBackStackEntryCount();
        if (backStackEntryCount < this.a.b) {
            i = 2;
        } else {
            i = backStackEntryCount > this.a.b ? 1 : 0;
        }
        this.a.b = backStackEntryCount;
        cbr cbrVarC = this.a.c();
        this.a.a(cbrVarC != null ? cbrVarC.a : 0, i);
    }
}
