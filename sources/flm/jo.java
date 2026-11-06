package flm;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jo implements TypeEvaluator {
    jo() {
    }

    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        return new Rect(rect.left + ((int) ((rect2.left - rect.left) * f)), rect.top + ((int) ((rect2.top - rect.top) * f)), rect.right + ((int) ((rect2.right - rect.right) * f)), rect.bottom + ((int) ((rect2.bottom - rect.bottom) * f)));
    }
}
