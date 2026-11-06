package flm;

import android.support.design.snackbar.BaseTransientBottomBar;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gm implements em {
    private final /* synthetic */ BaseTransientBottomBar a;

    gm(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // flm.em
    public final void a(View view) {
        view.setVisibility(8);
        this.a.a(0);
    }

    @Override // flm.em
    public final void a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                gz.a().b(this.a.h);
                break;
            case 1:
            case 2:
                gz.a().a(this.a.h);
                break;
        }
    }
}
