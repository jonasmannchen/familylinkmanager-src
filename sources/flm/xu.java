package flm;

import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class xu implements TimeInterpolator {
    public int a;
    private int[] b;
    private int c;

    xu(AnimationDrawable animationDrawable, boolean z) {
        int i = 0;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        this.c = numberOfFrames;
        if (this.b == null || this.b.length < numberOfFrames) {
            this.b = new int[numberOfFrames];
        }
        int[] iArr = this.b;
        int i2 = 0;
        while (i < numberOfFrames) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames - i) - 1 : i);
            iArr[i] = duration;
            i++;
            i2 = duration + i2;
        }
        this.a = i2;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2;
        int i = (int) ((this.a * f) + 0.5f);
        int i2 = this.c;
        int[] iArr = this.b;
        int i3 = i;
        int i4 = 0;
        while (i4 < i2 && i3 >= iArr[i4]) {
            int i5 = i3 - iArr[i4];
            i4++;
            i3 = i5;
        }
        if (i4 < i2) {
            f2 = i3 / this.a;
        } else {
            f2 = 0.0f;
        }
        return f2 + (i4 / i2);
    }
}
