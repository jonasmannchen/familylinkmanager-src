package flm;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aco extends pk {
    private final /* synthetic */ WeakReference a;
    private final /* synthetic */ acn b;

    aco(acn acnVar, WeakReference weakReference) {
        this.b = acnVar;
        this.a = weakReference;
    }

    @Override // flm.pk
    public final void a(Typeface typeface) {
        acn acnVar = this.b;
        WeakReference weakReference = this.a;
        if (acnVar.d) {
            acnVar.c = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, acnVar.b);
            }
        }
    }

    @Override // flm.pk
    public final void a(int i) {
    }
}
