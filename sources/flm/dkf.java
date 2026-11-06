package flm;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dkf {
    public final ArrayList a = new ArrayList();

    dkf() {
    }

    final dkf a(gtv gtvVar, dgv dgvVar, dgv dgvVar2) {
        if (dgvVar != null && dgvVar2 != null) {
            dgv dgvVar3 = new dgv(dgvVar2.a - dgvVar.a, dgvVar2.b - dgvVar.b);
            gta gtaVar = (gta) ((fio) gsz.d.a(dp.au, (Object) null));
            gsq gsqVar = (gsq) ((fio) gsp.d.a(dp.au, (Object) null));
            long j = dgvVar3.b / 1000;
            gsqVar.c();
            gsp gspVar = (gsp) gsqVar.a;
            gspVar.a |= 1;
            gspVar.b = j;
            long j2 = dgvVar3.a / 1000;
            gsqVar.c();
            gsp gspVar2 = (gsp) gsqVar.a;
            gspVar2.a |= 2;
            gspVar2.c = j2;
            gtaVar.c();
            gsz gszVar = (gsz) gtaVar.a;
            gszVar.c = (gsp) ((fin) gsqVar.h());
            gszVar.a |= 2;
            gtaVar.c();
            gsz gszVar2 = (gsz) gtaVar.a;
            if (gtvVar == null) {
                throw new NullPointerException();
            }
            gszVar2.a |= 1;
            gszVar2.b = gtvVar.e;
            this.a.add((gsz) ((fin) gtaVar.h()));
        }
        return this;
    }
}
