package flm;

import android.content.Context;
import android.view.View;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aau extends zw {
    private final /* synthetic */ aat d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aau(aat aatVar, Context context, aai aaiVar, View view) {
        super(context, aaiVar, view, false, R.attr.actionOverflowMenuStyle);
        this.d = aatVar;
        if (!((zm) aaiVar.getItem()).f()) {
            this.a = aatVar.f == null ? (View) aatVar.e : aatVar.f;
        }
        a(aatVar.l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.zw
    public final void d() {
        this.d.j = null;
        super.d();
    }
}
