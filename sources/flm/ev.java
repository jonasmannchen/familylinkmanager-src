package flm;

import android.R;
import android.content.res.TypedArray;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ev implements View.OnClickListener {
    private final /* synthetic */ eu a;

    ev(eu euVar) {
        this.a = euVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.a.a && this.a.isShowing()) {
            eu euVar = this.a;
            if (!euVar.c) {
                TypedArray typedArrayObtainStyledAttributes = euVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                euVar.b = typedArrayObtainStyledAttributes.getBoolean(0, true);
                typedArrayObtainStyledAttributes.recycle();
                euVar.c = true;
            }
            if (euVar.b) {
                this.a.cancel();
            }
        }
    }
}
