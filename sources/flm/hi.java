package flm;

import android.support.design.textfield.TextInputLayout;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hi implements View.OnClickListener {
    private final /* synthetic */ TextInputLayout a;

    public hi(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.c(false);
    }
}
