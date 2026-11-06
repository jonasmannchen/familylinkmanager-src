package flm;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ftp {
    public static final ftp a = new ftp(null, null, fvc.b, false);
    public final ftr b;
    public final fru c;
    public final fvc d;
    public final boolean e;

    private ftp(ftr ftrVar, fru fruVar, fvc fvcVar, boolean z) {
        this.b = ftrVar;
        this.c = fruVar;
        this.d = (fvc) dvl.a(fvcVar, "status");
        this.e = z;
    }

    public static ftp a(ftr ftrVar) {
        return new ftp((ftr) dvl.a(ftrVar, "subchannel"), null, fvc.b, false);
    }

    public static ftp a(fvc fvcVar) {
        dvl.a(!fvcVar.a(), "error status shouldn't be OK");
        return new ftp(null, null, fvcVar, false);
    }

    public static ftp b(fvc fvcVar) {
        dvl.a(!fvcVar.a(), "drop status shouldn't be OK");
        return new ftp(null, null, fvcVar, true);
    }

    public final String toString() {
        return dve.a(this).a("subchannel", this.b).a("streamTracerFactory", this.c).a("status", this.d).a("drop", this.e).toString();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.d, this.c, Boolean.valueOf(this.e)});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ftp)) {
            return false;
        }
        ftp ftpVar = (ftp) obj;
        return dvh.a(this.b, ftpVar.b) && dvh.a(this.d, ftpVar.d) && dvh.a(this.c, ftpVar.c) && this.e == ftpVar.e;
    }
}
