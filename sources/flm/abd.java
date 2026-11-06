package flm;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class abd extends aej {

    @ViewDebug.ExportedProperty
    public boolean a;

    @ViewDebug.ExportedProperty
    public int b;

    @ViewDebug.ExportedProperty
    public int c;

    @ViewDebug.ExportedProperty
    public boolean d;

    @ViewDebug.ExportedProperty
    public boolean e;
    public boolean f;

    public abd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public abd(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public abd(abd abdVar) {
        super(abdVar);
        this.a = abdVar.a;
    }

    public abd(int i, int i2) {
        super(-2, -2);
        this.a = false;
    }
}
