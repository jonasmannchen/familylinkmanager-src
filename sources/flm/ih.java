package flm;

import android.animation.TypeEvaluator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ih implements TypeEvaluator {
    private pr[] a;

    ih() {
    }

    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        pr[] prVarArr = (pr[]) obj;
        pr[] prVarArr2 = (pr[]) obj2;
        if (!pp.a(prVarArr, prVarArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (this.a == null || !pp.a(this.a, prVarArr)) {
            this.a = pp.a(prVarArr);
        }
        for (int i = 0; i < prVarArr.length; i++) {
            pr prVar = this.a[i];
            pr prVar2 = prVarArr[i];
            pr prVar3 = prVarArr2[i];
            for (int i2 = 0; i2 < prVar2.b.length; i2++) {
                prVar.b[i2] = (prVar2.b[i2] * (1.0f - f)) + (prVar3.b[i2] * f);
            }
        }
        return this.a;
    }
}
