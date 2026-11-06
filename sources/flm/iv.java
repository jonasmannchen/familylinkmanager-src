package flm;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class iv extends Property {
    private Rect a;

    iv(Class cls, String str) {
        super(cls, str);
        this.a = new Rect();
    }

    @Override // android.util.Property
    public final /* synthetic */ Object get(Object obj) {
        ((Drawable) obj).copyBounds(this.a);
        return new PointF(this.a.left, this.a.top);
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        PointF pointF = (PointF) obj2;
        drawable.copyBounds(this.a);
        this.a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
        drawable.setBounds(this.a);
    }
}
