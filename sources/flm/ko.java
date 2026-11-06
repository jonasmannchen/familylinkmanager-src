package flm;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ko extends Property {
    ko(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public final /* synthetic */ Object get(Object obj) {
        return ti.y((View) obj);
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        ti.a((View) obj, (Rect) obj2);
    }
}
