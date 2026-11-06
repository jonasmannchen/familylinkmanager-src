package flm;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ayk implements dap {
    @Override // flm.dap
    public final /* synthetic */ Object a(dbh dbhVar) throws atj {
        if (!((Boolean) dbhVar.d()).booleanValue()) {
            throw new atj(new Status(13, "listener already unregistered"));
        }
        return null;
    }
}
