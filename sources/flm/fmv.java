package flm;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class fmv extends fnb {
    public fmx g;

    @Override // flm.fnb
    public int a() {
        if (this.g == null) {
            return 0;
        }
        int iA = 0;
        for (int i = 0; i < this.g.d; i++) {
            iA += this.g.c[i].a();
        }
        return iA;
    }

    @Override // flm.fnb
    public void a(fmt fmtVar) {
        if (this.g != null) {
            for (int i = 0; i < this.g.d; i++) {
                this.g.c[i].a(fmtVar);
            }
        }
    }

    public final boolean a(fms fmsVar, int i) {
        byte[] bArr;
        fmy fmyVar;
        fmy fmyVar2;
        Object objA;
        int i2 = fmsVar.i();
        if (!fmsVar.b(i)) {
            return false;
        }
        int i3 = i >>> 3;
        int i4 = fmsVar.i() - i2;
        if (i4 == 0) {
            bArr = fne.d;
        } else {
            bArr = new byte[i4];
            System.arraycopy(fmsVar.a, i2 + fmsVar.b, bArr, 0, i4);
        }
        fnd fndVar = new fnd(i, bArr);
        if (this.g == null) {
            this.g = new fmx();
            fmyVar = null;
        } else {
            fmx fmxVar = this.g;
            int iB = fmxVar.b(i3);
            fmyVar = (iB < 0 || fmxVar.c[iB] == fmx.a) ? null : fmxVar.c[iB];
        }
        if (fmyVar == null) {
            fmy fmyVar3 = new fmy();
            fmx fmxVar2 = this.g;
            int iB2 = fmxVar2.b(i3);
            if (iB2 >= 0) {
                fmxVar2.c[iB2] = fmyVar3;
                fmyVar2 = fmyVar3;
            } else {
                int i5 = iB2 ^ (-1);
                if (i5 < fmxVar2.d && fmxVar2.c[i5] == fmx.a) {
                    fmxVar2.b[i5] = i3;
                    fmxVar2.c[i5] = fmyVar3;
                    fmyVar2 = fmyVar3;
                } else {
                    if (fmxVar2.d >= fmxVar2.b.length) {
                        int iA = fmxVar2.a(fmxVar2.d + 1);
                        int[] iArr = new int[iA];
                        fmy[] fmyVarArr = new fmy[iA];
                        System.arraycopy(fmxVar2.b, 0, iArr, 0, fmxVar2.b.length);
                        System.arraycopy(fmxVar2.c, 0, fmyVarArr, 0, fmxVar2.c.length);
                        fmxVar2.b = iArr;
                        fmxVar2.c = fmyVarArr;
                    }
                    if (fmxVar2.d - i5 != 0) {
                        System.arraycopy(fmxVar2.b, i5, fmxVar2.b, i5 + 1, fmxVar2.d - i5);
                        System.arraycopy(fmxVar2.c, i5, fmxVar2.c, i5 + 1, fmxVar2.d - i5);
                    }
                    fmxVar2.b[i5] = i3;
                    fmxVar2.c[i5] = fmyVar3;
                    fmxVar2.d++;
                    fmyVar2 = fmyVar3;
                }
            }
        } else {
            fmyVar2 = fmyVar;
        }
        if (fmyVar2.c != null) {
            fmyVar2.c.add(fndVar);
        } else {
            if (fmyVar2.b instanceof fnb) {
                byte[] bArr2 = fndVar.b;
                fms fmsVarA = fms.a(bArr2, 0, bArr2.length);
                int iD = fmsVarA.d();
                if (iD != bArr2.length - fmt.a(iD)) {
                    throw fna.a();
                }
                objA = ((fnb) fmyVar2.b).a(fmsVarA);
            } else if (fmyVar2.b instanceof fnb[]) {
                fnb[] fnbVarArr = (fnb[]) fmyVar2.a.a(Collections.singletonList(fndVar));
                fnb[] fnbVarArr2 = (fnb[]) fmyVar2.b;
                objA = (fnb[]) Arrays.copyOf(fnbVarArr2, fnbVarArr2.length + fnbVarArr.length);
                System.arraycopy(fnbVarArr, 0, objA, fnbVarArr2.length, fnbVarArr.length);
            } else if (fmyVar2.b instanceof fke) {
                objA = ((fke) fmyVar2.b).k().a((fke) fmyVar2.a.a(Collections.singletonList(fndVar))).h();
            } else if (fmyVar2.b instanceof fke[]) {
                fke[] fkeVarArr = (fke[]) fmyVar2.a.a(Collections.singletonList(fndVar));
                fke[] fkeVarArr2 = (fke[]) fmyVar2.b;
                objA = (fke[]) Arrays.copyOf(fkeVarArr2, fkeVarArr2.length + fkeVarArr.length);
                System.arraycopy(fkeVarArr, 0, objA, fkeVarArr2.length, fkeVarArr.length);
            } else {
                objA = fmyVar2.a.a(Collections.singletonList(fndVar));
            }
            fmyVar2.a = fmyVar2.a;
            fmyVar2.b = objA;
            fmyVar2.c = null;
        }
        return true;
    }

    @Override // flm.fnb
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fnb clone() {
        return (fmv) clone();
    }

    @Override // flm.fnb
    public /* synthetic */ Object clone() {
        fmv fmvVar = (fmv) super.clone();
        fmz.a(this, fmvVar);
        return fmvVar;
    }
}
