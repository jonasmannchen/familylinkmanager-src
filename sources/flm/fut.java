package flm;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fut extends ftm {
    private final fto a;
    private ftr b;

    fut(fto ftoVar) {
        this.a = (fto) dvl.a(ftoVar, "helper");
    }

    @Override // flm.ftm
    public final void a(List list, frd frdVar) {
        if (this.b == null) {
            this.b = this.a.a(list, frd.b);
            this.a.a(fsa.CONNECTING, new fuu(ftp.a(this.b)));
            this.b.b();
            return;
        }
        this.a.a(this.b, list);
    }

    @Override // flm.ftm
    public final void a(fvc fvcVar) {
        if (this.b != null) {
            this.b.a();
            this.b = null;
        }
        this.a.a(fsa.TRANSIENT_FAILURE, new fuu(ftp.a(fvcVar)));
    }

    @Override // flm.ftm
    public final void a(ftr ftrVar, fsb fsbVar) {
        fts fuuVar;
        fsa fsaVar = fsbVar.a;
        if (ftrVar == this.b && fsaVar != fsa.SHUTDOWN) {
            switch (fsaVar.ordinal()) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    fuuVar = new fuu(ftp.a);
                    break;
                case 1:
                    fuuVar = new fuu(ftp.a(ftrVar));
                    break;
                case 2:
                    fuuVar = new fuu(ftp.a(fsbVar.b));
                    break;
                case 3:
                    fuuVar = new fuv(ftrVar);
                    break;
                default:
                    String strValueOf = String.valueOf(fsaVar);
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(strValueOf).length() + 18).append("Unsupported state:").append(strValueOf).toString());
            }
            this.a.a(fsaVar, fuuVar);
        }
    }

    @Override // flm.ftm
    public final void a() {
        if (this.b != null) {
            this.b.a();
        }
    }
}
