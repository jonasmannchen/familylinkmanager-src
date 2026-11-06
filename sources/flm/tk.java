package flm;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tk extends to {
    tk(int i, Class cls, int i2) {
        super(i, cls, 28);
    }

    @Override // flm.to
    final /* synthetic */ Object a(View view) {
        return Boolean.valueOf(view.isScreenReaderFocusable());
    }
}
