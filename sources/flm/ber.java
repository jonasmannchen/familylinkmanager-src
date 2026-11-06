package flm;

import android.content.Context;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ber extends dqh {
    private volatile aob b;
    private final Context c;
    private final bes d;
    private final int e;
    private final dvz f;

    public ber(Context context, bes besVar, int i, dvz dvzVar) {
        this.c = context;
        this.d = besVar;
        this.e = i;
        this.f = dvzVar;
    }

    private final aob a() {
        fnk fnkVar;
        aob aobVarA = this.b;
        if (aobVarA == null) {
            synchronized (this) {
                aobVarA = this.b;
                if (aobVarA == null) {
                    aob aobVar = new aob(this.c, "GMSCORE_ANDROID_PRIMES", null);
                    if (((fph) fpg.a.a()).l()) {
                        fnkVar = fnk.UNMETERED_ONLY;
                    } else {
                        fnkVar = fnk.DEFAULT;
                    }
                    aobVarA = aobVar.a(fnkVar);
                    this.b = aobVarA;
                }
            }
        }
        return aobVarA;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    @Override // flm.dqh
    public final void a_(gtr gtrVar) {
        boolean z;
        boolean zBooleanValue = false;
        byte[] bArrB = gtrVar.b();
        if (fpg.b()) {
            if ((gtrVar.a & 256) == 256) {
                z = true;
            } else {
                if (((gtrVar.a & 4096) == 4096) || (gtrVar.a & 262144) == 262144) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z) {
                if (bArrB.length > this.e) {
                    Log.w("ClearcutTransmitter", String.format("Too large: %d", Integer.valueOf(bArrB.length)));
                } else if (!this.d.a()) {
                    Log.w("ClearcutTransmitter", "Dropped event; high load or sample rate");
                } else {
                    zBooleanValue = ((Boolean) this.f.a()).booleanValue();
                }
            } else {
                zBooleanValue = ((Boolean) this.f.a()).booleanValue();
            }
        }
        if (zBooleanValue) {
            a().a(bArrB).a();
        }
    }
}
