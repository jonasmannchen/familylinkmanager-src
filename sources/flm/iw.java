package flm;

import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class iw extends Property {
    iw(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        jd jdVar = (jd) obj;
        PointF pointF = (PointF) obj2;
        jdVar.a = Math.round(pointF.x);
        jdVar.b = Math.round(pointF.y);
        jdVar.e++;
        if (jdVar.e == jdVar.f) {
            jdVar.a();
        }
    }
}
