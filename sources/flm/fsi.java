package flm;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fsi implements fse {
    private final /* synthetic */ fsc a;

    fsi(fsc fscVar) {
        this.a = fscVar;
    }

    @Override // flm.fse
    public final void a(fsc fscVar) {
        if (this.a instanceof fsd) {
            fscVar.e();
            fsd.g();
            return;
        }
        fsc fscVar2 = this.a;
        if (fscVar2.b()) {
            synchronized (fscVar2) {
                if (fscVar2.b != null) {
                    ArrayList arrayList = fscVar2.b;
                    fscVar2.b = null;
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (!(((fsg) arrayList.get(i)).a instanceof fsi)) {
                            ((fsg) arrayList.get(i)).a();
                        }
                    }
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (((fsg) arrayList.get(i2)).a instanceof fsi) {
                            ((fsg) arrayList.get(i2)).a();
                        }
                    }
                    if (fscVar2.d != null) {
                        fscVar2.d.a(fscVar2.c);
                    }
                }
            }
        }
    }
}
