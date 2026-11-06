package flm;

import android.support.design.textfield.TextInputLayout;
import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hh implements TextWatcher {
    private final /* synthetic */ TextInputLayout a;

    public hh(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.a(!this.a.g, false);
        if (this.a.b) {
            this.a.b(editable.length());
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
