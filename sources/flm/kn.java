package flm;

import android.util.Property;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kn extends Property {
    kn(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(km.a.a((View) obj));
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        km.a((View) obj, ((Float) obj2).floatValue());
    }
}
