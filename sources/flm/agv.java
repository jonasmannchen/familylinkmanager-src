package flm;

import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class agv {
    public Method a;
    private Method b;
    private Method c;

    public agv() {
        try {
            this.b = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
            this.b.setAccessible(true);
        } catch (NoSuchMethodException e) {
        }
        try {
            this.c = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
            this.c.setAccessible(true);
        } catch (NoSuchMethodException e2) {
        }
        try {
            this.a = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            this.a.setAccessible(true);
        } catch (NoSuchMethodException e3) {
        }
    }
}
