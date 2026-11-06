package flm;

import android.app.ApplicationErrorReport;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bne extends bnd {
    public String d;

    public bne() {
        this.c = new ApplicationErrorReport();
        this.c.crashInfo = new ApplicationErrorReport.CrashInfo();
        this.c.crashInfo.throwLineNumber = -1;
    }

    public bne(Throwable th) {
        this();
        this.c.crashInfo = new ApplicationErrorReport.CrashInfo(th);
    }

    @Override // flm.bnd
    public final bnc a() {
        bdi.checkNotNull(this.c.crashInfo.exceptionClassName);
        bdi.checkNotNull(this.c.crashInfo.throwClassName);
        bdi.checkNotNull(this.c.crashInfo.throwMethodName);
        bdi.checkNotNull(this.c.crashInfo.stackTrace);
        if (TextUtils.isEmpty(this.c.crashInfo.throwFileName)) {
            this.c.crashInfo.throwFileName = "unknown";
        }
        bnc bncVarA = super.a();
        bncVarA.d.crashInfo = this.c.crashInfo;
        bncVarA.g = this.d;
        return bncVarA;
    }
}
