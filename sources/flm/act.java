package flm;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class act implements acv {
    act() {
    }

    @Override // flm.acv
    public final void a(acu acuVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        acuVar.a(new agq(colorStateList, f));
        View viewD = acuVar.d();
        viewD.setClipToOutline(true);
        viewD.setElevation(f2);
        c(acuVar, f3);
    }

    @Override // flm.acv
    public final void a(acu acuVar, float f) {
        agq agqVarE = e(acuVar);
        if (f != agqVarE.a) {
            agqVarE.a = f;
            agqVarE.a(null);
            agqVarE.invalidateSelf();
        }
    }

    private final void c(acu acuVar, float f) {
        agq agqVarE = e(acuVar);
        boolean zA = acuVar.a();
        boolean zB = acuVar.b();
        if (f != agqVarE.b || agqVarE.c != zA || agqVarE.d != zB) {
            agqVarE.b = f;
            agqVarE.c = zA;
            agqVarE.d = zB;
            agqVarE.a(null);
            agqVarE.invalidateSelf();
        }
        if (!acuVar.a()) {
            acuVar.a(0, 0, 0, 0);
            return;
        }
        float f2 = e(acuVar).b;
        float f3 = e(acuVar).a;
        int iCeil = (int) Math.ceil(agr.b(f2, f3, acuVar.b()));
        int iCeil2 = (int) Math.ceil(agr.a(f2, f3, acuVar.b()));
        acuVar.a(iCeil, iCeil2, iCeil, iCeil2);
    }

    private final float d(acu acuVar) {
        return e(acuVar).b;
    }

    @Override // flm.acv
    public final float a(acu acuVar) {
        return e(acuVar).a * 2.0f;
    }

    @Override // flm.acv
    public final float b(acu acuVar) {
        return e(acuVar).a * 2.0f;
    }

    @Override // flm.acv
    public final void b(acu acuVar, float f) {
        acuVar.d().setElevation(f);
    }

    @Override // flm.acv
    public final void c(acu acuVar) {
        c(acuVar, d(acuVar));
    }

    private static agq e(acu acuVar) {
        return (agq) acuVar.c();
    }
}
