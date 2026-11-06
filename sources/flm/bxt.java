package flm;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.kids.database.SupervisionDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bxt {
    private final Context d = ayt.a();
    public final atp a = new atq(this.d).a(cti.a).b();
    public final cte b = cti.b;
    public final SupervisionDatabase c = SupervisionDatabase.h();

    bxt() {
    }

    final boolean a(fag fagVar) {
        ctf ctfVar = (ctf) this.b.a(this.a, bts.c()).await(10L, TimeUnit.SECONDS);
        if (ctfVar.b().a()) {
            btt.a(fagVar.b, ctfVar);
            btv.c("Location", "[%s] Location reporting state -- opted in: %b, active: %b", "LocationReporter", Boolean.valueOf(ctfVar.c()), Boolean.valueOf(ctfVar.a()));
            return ctfVar.c();
        }
        btt.a(fagVar.b, ctfVar.b());
        btv.d("Location", "[%s] Error while getting reporting state: %s", "LocationReporter", ctfVar.b());
        return false;
    }

    final boolean b(final fag fagVar) {
        btt.e(fagVar.b);
        Intent intent = new Intent("com.google.android.gms.gcm.REGISTERED");
        intent.setPackage("com.google.android.gms");
        this.d.sendBroadcast(intent);
        try {
            return ((Boolean) bur.a.schedule(new Callable(this, fagVar) { // from class: flm.bxu
                private final bxt a;
                private final fag b;

                {
                    this.a = this;
                    this.b = fagVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(this.a.a(this.b));
                }
            }, fagVar.j, TimeUnit.MILLISECONDS).get()).booleanValue();
        } catch (InterruptedException e) {
            e = e;
            btt.a(fagVar.b, e);
            btv.c("Location", e, "[%s] Delay after syncing reporting settings was cancelled or interrupted", "LocationReporter");
            return false;
        } catch (CancellationException e2) {
            e = e2;
            btt.a(fagVar.b, e);
            btv.c("Location", e, "[%s] Delay after syncing reporting settings was cancelled or interrupted", "LocationReporter");
            return false;
        } catch (ExecutionException e3) {
            btt.a(fagVar.b, (Exception) e3);
            btv.c("Location", e3, "[%s] Error checking reporting settings after force syncing", "LocationReporter");
            return false;
        }
    }
}
