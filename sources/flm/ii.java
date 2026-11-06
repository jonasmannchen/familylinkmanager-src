package flm;

import android.animation.TypeEvaluator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ii implements TypeEvaluator {
    public static final ii a = new ii();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        float f2 = (iIntValue >>> 24) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = fPow3 + ((((float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d)) - fPow3) * f);
        float fPow7 = ((float) Math.pow(fPow + ((fPow4 - fPow) * f), 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fPow2 + ((fPow5 - fPow2) * f), 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fPow6, 0.45454545454545453d)) * 255.0f) | (Math.round((f2 + ((((iIntValue2 >>> 24) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(fPow7) << 16) | (Math.round(fPow8) << 8));
    }
}
