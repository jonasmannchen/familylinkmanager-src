package flm;

import android.support.v7.widget.SwitchCompat;
import android.util.Property;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class agy extends Property {
    public agy(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((SwitchCompat) obj).a);
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((SwitchCompat) obj).a(((Float) obj2).floatValue());
    }
}
