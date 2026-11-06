package flm;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dk {
    public ArrayList a = new ArrayList();

    public final void a(dl dlVar) {
        this.a.clear();
        for (int i = 1; i < dlVar.c; i++) {
            C0000do c0000do = dlVar.e.c[i];
            for (int i2 = 0; i2 < 6; i2++) {
                c0000do.e[i2] = 0.0f;
            }
            c0000do.e[c0000do.c] = 1.0f;
            if (c0000do.f == dp.c) {
                this.a.add(c0000do);
            }
        }
        int size = this.a.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0000do c0000do2 = (C0000do) this.a.get(i3);
            if (c0000do2.b != -1) {
                dh dhVar = dlVar.b[c0000do2.b].c;
                int i4 = dhVar.a;
                for (int i5 = 0; i5 < i4; i5++) {
                    C0000do c0000doA = dhVar.a(i5);
                    if (c0000doA != null) {
                        float fB = dhVar.b(i5);
                        for (int i6 = 0; i6 < 6; i6++) {
                            float[] fArr = c0000doA.e;
                            fArr[i6] = fArr[i6] + (c0000do2.e[i6] * fB);
                        }
                        if (!this.a.contains(c0000doA)) {
                            this.a.add(c0000doA);
                        }
                    }
                }
                for (int i7 = 0; i7 < 6; i7++) {
                    c0000do2.e[i7] = 0.0f;
                }
            }
        }
    }

    public final String toString() {
        int size = this.a.size();
        String string = "Goal: ";
        for (int i = 0; i < size; i++) {
            C0000do c0000do = (C0000do) this.a.get(i);
            StringBuilder sbAppend = new StringBuilder().append(string);
            String str = c0000do + "[";
            for (int i2 = 0; i2 < c0000do.e.length; i2++) {
                String str2 = str + c0000do.e[i2];
                if (i2 < c0000do.e.length - 1) {
                    str = str2 + ", ";
                } else {
                    str = str2 + "] ";
                }
            }
            string = sbAppend.append(str).toString();
        }
        return string;
    }
}
