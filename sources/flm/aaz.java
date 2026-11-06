package flm;

import android.content.Context;
import android.view.View;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aaz extends zw {
    private final /* synthetic */ aat d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaz(aat aatVar, Context context, zi ziVar, View view, boolean z) {
        super(context, ziVar, view, true, R.attr.actionOverflowMenuStyle);
        this.d = aatVar;
        this.b = 8388613;
        a(aatVar.l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.zw
    public final void d() {
        if (this.d.c != null) {
            this.d.c.close();
        }
        this.d.i = null;
        super.d();
    }
}
