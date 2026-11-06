package flm;

import android.content.Context;
import java.util.HashSet;
import java.util.TimeZone;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ccm extends bjq implements t {
    private final Context a;
    private final bfr b;

    public ccm(Context context) {
        this.a = context;
        this.b = new bfr(context);
    }

    @Override // flm.t
    public final void a(af afVar) {
    }

    @Override // flm.t
    public final void b(af afVar) {
    }

    @Override // flm.t
    public final void c(af afVar) {
    }

    @Override // flm.t
    public final void d(af afVar) {
    }

    @Override // flm.t
    public final void a() {
        bjp bjpVar = new bjp();
        bju bjuVar = new bju();
        if (0 < 0 && alc.a(3)) {
            alc.a("TimeFilter.Builder", "startTimeMillis must be >= 0.  Clamping to 0.", new Object[0]);
        }
        bjuVar.a.add(new blm(0L, Long.MAX_VALUE));
        bll bllVar = new bll(bjuVar.a, null);
        if (bjpVar.a == null) {
            bjpVar.a = new HashSet();
        }
        bjpVar.a.add(new bkc(-1, 10007, bllVar, null));
        bda.toVoidTask(bjr.a(aml.a(this.a, amn.a("com.google.android.gms.kids", null)).e, new bkb(bjpVar.a, (HashSet) null, new blf(0, bjpVar.b.a, null)), this)).a(ccn.a);
    }

    @Override // flm.t
    public final void b() {
        bda.toVoidTask(bjr.a(aml.a(this.a, amn.a("com.google.android.gms.kids", null)).e, this));
    }

    @Override // flm.bjq
    public final void a(bjk bjkVar) {
        try {
            fgk fgkVar = (fgk) fnb.a(new fgk(), bjkVar.b());
            if (fgkVar == null) {
                btv.c("Persistent", "LocaleBasedTimeModel state is NULL", new Object[0]);
                return;
            }
            String str = fgkVar.a;
            if (bui.a("Persistent", "android.permission.SET_TIME_ZONE") && ("GMT".equals(str) || !"GMT".equals(TimeZone.getTimeZone(str).getID()))) {
                try {
                    this.b.e.setTimeZone(str);
                } catch (IllegalArgumentException e) {
                    btv.d("Persistent", "Invalid location based timezone id:%s", str);
                    btt.a("Persistent", "Timezone", "Invalid location based timezone id:%s", str);
                }
            }
            btv.c("Persistent", "data received, id = %s, timezoneId = %s", bjkVar.a(), fgkVar.a);
        } catch (fna e2) {
            btv.c("Persistent", e2, "Could not deserialize LocaleBasedTimeModel proto.", new Object[0]);
        }
    }
}
