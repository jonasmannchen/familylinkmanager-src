package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dhf implements dhh {
    private final /* synthetic */ dhm a;
    private final /* synthetic */ dhe b;

    dhf(dhe dheVar, dhm dhmVar) {
        this.b = dheVar;
        this.a = dhmVar;
    }

    @Override // flm.dhh
    public final void a(String str) {
        dhe dheVar = this.b;
        synchronized (dheVar.d) {
            if (dheVar.d.containsKey(str)) {
                dkm.a(5, "FrameMetricService", "measurement already started: %s", str);
                return;
            }
            if (dheVar.d.size() >= 25) {
                dkm.a(5, "FrameMetricService", "Too many concurrent measurements, ignoring %s", str);
                return;
            }
            dheVar.d.put(str, dheVar.f.a());
            if (dheVar.d.size() == 1 && !dheVar.e) {
                dkm.a(3, "FrameMetricService", "measuring start", new Object[0]);
                dhg dhgVar = dheVar.c;
                synchronized (dhgVar) {
                    dhgVar.b = true;
                    if (dhgVar.a != null) {
                        dhgVar.a();
                    } else {
                        dkm.a(3, "FrameMetricService", "No activity", new Object[0]);
                    }
                }
            }
        }
    }

    @Override // flm.dhh
    public final void b(String str) {
        dos dosVar;
        dhe dheVar = this.b;
        gpr gprVarA = this.a.a();
        synchronized (dheVar.d) {
            dosVar = (dos) dheVar.d.remove(str);
            if (dheVar.d.isEmpty() && !dheVar.e) {
                dheVar.c.b();
            }
        }
        if (dosVar != null) {
            if (dosVar.a()) {
                gts gtsVar = (gts) ((fio) gtr.y.a(dp.au, (Object) null));
                gsh gshVarB = dosVar.b();
                fio fioVar = (fio) gshVarB.a(dp.au, (Object) null);
                fioVar.a((fin) gshVarB);
                gsi gsiVar = (gsi) fioVar;
                int iB = dpf.b(dheVar.a);
                gsiVar.c();
                gsh gshVar = (gsh) gsiVar.a;
                gshVar.a |= 16;
                gshVar.g = iB;
                gtsVar.c();
                gtr gtrVar = (gtr) gtsVar.a;
                gtrVar.l = (gsh) ((fin) gsiVar.h());
                gtrVar.a |= 2048;
                if (gprVarA == null && dheVar.g != null) {
                    try {
                        dheVar.g.a();
                    } catch (Exception e) {
                        dkm.b("FrameMetricService", "Exception while getting jank metric extension!", e, new Object[0]);
                    }
                } else if (gprVarA != null) {
                    gtsVar.a(gprVarA);
                }
                dheVar.a(str, true, (gtr) ((fin) gtsVar.h()), null, null);
                return;
            }
            return;
        }
        dkm.a(5, "FrameMetricService", "Measurement not found: %s", str);
    }

    @Override // flm.dhh
    public final void a(int i) {
        this.b.a(i);
    }
}
