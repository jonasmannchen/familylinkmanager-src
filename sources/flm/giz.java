package flm;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class giz {
    public final gin a;
    public final gjy b;
    public int c;
    public final gja d;

    giz(gin ginVar, gjy gjyVar, int i) {
        this.a = (gin) dvl.a(ginVar, "transport");
        this.b = (gjy) dvl.a(gjyVar, "frameWriter");
        this.c = i;
        this.d = new gja(this, 0, i);
    }

    final int a(gij gijVar, int i) {
        if (gijVar == null) {
            int iA = this.d.a(i);
            b();
            return iA;
        }
        gja gjaVarA = a(gijVar);
        int iA2 = gjaVarA.a(i);
        gjc gjcVar = new gjc();
        gjaVarA.a(gjaVarA.b(), gjcVar);
        if (gjcVar.b()) {
            a();
            return iA2;
        }
        return iA2;
    }

    final void a(boolean z, int i, guc gucVar, boolean z2) {
        dvl.a(gucVar, "source");
        gij gijVarB = this.a.b(i);
        if (gijVarB != null) {
            gja gjaVarA = a(gijVarB);
            int iB = gjaVarA.b();
            boolean zC = gjaVarA.c();
            gjb gjbVar = new gjb(gjaVarA, gucVar, z);
            if (!zC && iB >= gjbVar.a()) {
                gjbVar.b();
                if (z2) {
                    a();
                    return;
                }
                return;
            }
            if (!gjbVar.a) {
                gjbVar.a = true;
                gjbVar.b.a.offer(gjbVar);
                gjbVar.b.c += gjbVar.a();
            }
            if (zC || iB <= 0) {
                if (z2) {
                    a();
                }
            } else {
                gjbVar.a(iB).b();
                if (z2) {
                    a();
                }
            }
        }
    }

    final void a() {
        try {
            this.b.b();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private final gja a(gij gijVar) {
        gja gjaVar = (gja) gijVar.f;
        if (gjaVar == null) {
            gja gjaVar2 = new gja(this, gijVar, this.c);
            gijVar.f = gjaVar2;
            return gjaVar2;
        }
        return gjaVar;
    }

    final void b() {
        int i;
        gij[] gijVarArrD = this.a.d();
        int i2 = this.d.d;
        int length = gijVarArrD.length;
        while (length > 0 && i2 > 0) {
            int iCeil = (int) Math.ceil(i2 / length);
            int i3 = 0;
            int i4 = 0;
            while (i3 < length && i2 > 0) {
                gij gijVar = gijVarArrD[i3];
                gja gjaVarA = a(gijVar);
                int iMin = Math.min(i2, Math.min(gjaVarA.a(), iCeil));
                if (iMin > 0) {
                    gjaVarA.e += iMin;
                    i2 -= iMin;
                }
                if (gjaVarA.a() > 0) {
                    i = i4 + 1;
                    gijVarArrD[i4] = gijVar;
                } else {
                    i = i4;
                }
                i3++;
                i4 = i;
            }
            length = i4;
        }
        gjc gjcVar = new gjc();
        for (gij gijVar2 : this.a.d()) {
            gja gjaVarA2 = a(gijVar2);
            gjaVarA2.a(gjaVarA2.e, gjcVar);
            gjaVarA2.e = 0;
        }
        if (gjcVar.b()) {
            a();
        }
    }
}
