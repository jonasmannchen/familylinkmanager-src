package flm;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gis implements gjx, Runnable {
    private gjw a;
    private boolean b = true;
    private final /* synthetic */ gin c;

    gis(gin ginVar, gjw gjwVar) {
        this.c = ginVar;
        this.a = gjwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        if (!gbh.a) {
            Thread.currentThread().setName("OkHttpClientTransport");
        }
        while (this.a.a(this)) {
            try {
                try {
                    if (this.c.v != null) {
                        this.c.v.b();
                    }
                } catch (Throwable th) {
                    try {
                        this.a.close();
                    } catch (IOException e) {
                        gin.a.logp(Level.INFO, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "run", "Exception closing frame reader", (Throwable) e);
                    }
                    this.c.e.b();
                    if (gbh.a) {
                        throw th;
                    }
                    Thread.currentThread().setName(name);
                    throw th;
                }
            } catch (Throwable th2) {
                this.c.a(0, gjv.PROTOCOL_ERROR, fvc.j.a("error in frame handler").b(th2));
                try {
                    this.a.close();
                } catch (IOException e2) {
                    gin.a.logp(Level.INFO, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "run", "Exception closing frame reader", (Throwable) e2);
                }
                this.c.e.b();
                if (!gbh.a) {
                    Thread.currentThread().setName(name);
                    return;
                }
                return;
            }
        }
        this.c.a(0, gjv.INTERNAL_ERROR, fvc.j.a("End of stream or IOException"));
        try {
            this.a.close();
        } catch (IOException e3) {
            gin.a.logp(Level.INFO, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "run", "Exception closing frame reader", (Throwable) e3);
        }
        this.c.e.b();
        if (!gbh.a) {
            Thread.currentThread().setName(name);
        }
    }

    @Override // flm.gjx
    public final void a(boolean z, int i, gue gueVar, int i2) {
        gij gijVarB = this.c.b(i);
        if (gijVarB == null) {
            if (this.c.a(i)) {
                this.c.f.a(i, gjv.INVALID_STREAM);
                gueVar.f(i2);
            } else {
                this.c.a(gjv.PROTOCOL_ERROR, new StringBuilder(45).append("Received data for unknown stream: ").append(i).toString());
                return;
            }
        } else {
            gueVar.a(i2);
            guc gucVar = new guc();
            gucVar.a_(gueVar.a(), i2);
            synchronized (this.c.h) {
                gijVarB.h.a(gucVar, z);
            }
        }
        this.c.k += i2;
        if (this.c.k >= this.c.d * 0.5f) {
            this.c.f.a(0, this.c.k);
            this.c.k = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e1  */
    @Override // flm.gjx
    public final void a(boolean z, int i, List list) {
        fvc fvcVarA;
        boolean z2 = false;
        if (this.c.B == Integer.MAX_VALUE) {
            fvcVarA = null;
        } else {
            long jE = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                gjz gjzVar = (gjz) list.get(i2);
                jE += (long) (gjzVar.g.e() + gjzVar.f.e() + 32);
            }
            int iMin = (int) Math.min(jE, 2147483647L);
            if (iMin <= this.c.B) {
                fvcVarA = null;
            } else {
                fvc fvcVar = fvc.h;
                Object[] objArr = new Object[3];
                objArr[0] = z ? "trailer" : "header";
                objArr[1] = Integer.valueOf(this.c.B);
                objArr[2] = Integer.valueOf(iMin);
                fvcVarA = fvcVar.a(String.format("Response %s metadata larger than %d: %d", objArr));
            }
        }
        synchronized (this.c.h) {
            gij gijVar = (gij) this.c.i.get(Integer.valueOf(i));
            if (gijVar == null) {
                if (this.c.a(i)) {
                    this.c.f.a(i, gjv.INVALID_STREAM);
                } else {
                    z2 = true;
                }
            } else if (fvcVarA == null) {
                gim gimVar = gijVar.h;
                if (z) {
                    gimVar.b(gjd.b(list));
                } else {
                    gimVar.a(gjd.a(list));
                }
            } else {
                if (!z) {
                    this.c.f.a(i, gjv.CANCEL);
                }
                gijVar.h.b(fvcVarA, false, new ftv());
            }
        }
        if (z2) {
            this.c.a(gjv.PROTOCOL_ERROR, new StringBuilder(47).append("Received header for unknown stream: ").append(i).toString());
        }
    }

    @Override // flm.gjx
    public final void a(int i, gjv gjvVar) {
        fvc fvcVarB = gin.a(gjvVar).b("Rst Stream");
        this.c.a(i, fvcVarB, gjvVar == gjv.REFUSED_STREAM ? dp.aL : dp.aK, fvcVarB.m == fvd.CANCELLED || fvcVarB.m == fvd.DEADLINE_EXCEEDED, null, null);
    }

    @Override // flm.gjx
    public final void a(gkk gkkVar) {
        boolean z;
        synchronized (this.c.h) {
            if (gkkVar.a(4)) {
                this.c.s = gkkVar.d[4];
            }
            if (gkkVar.a(7)) {
                int i = gkkVar.d[7];
                giz gizVar = this.c.g;
                if (i < 0) {
                    throw new IllegalArgumentException(new StringBuilder(40).append("Invalid initial window size: ").append(i).toString());
                }
                int i2 = i - gizVar.c;
                gizVar.c = i;
                for (gij gijVar : gizVar.a.d()) {
                    gja gjaVar = (gja) gijVar.f;
                    if (gjaVar == null) {
                        gijVar.f = new gja(gizVar, gijVar, gizVar.c);
                    } else {
                        gjaVar.a(i2);
                    }
                }
                z = i2 > 0;
            } else {
                z = false;
            }
            if (this.b) {
                this.c.e.a();
                this.b = false;
            }
            this.c.f.a(gkkVar);
            if (z) {
                this.c.g.b();
            }
            this.c.c();
        }
    }

    @Override // flm.gjx
    public final void a(boolean z, int i, int i2) {
        if (!z) {
            this.c.f.a(true, i, i2);
            return;
        }
        gbx gbxVar = null;
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        synchronized (this.c.h) {
            if (this.c.o == null) {
                gin.a.logp(Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "ping", "Received unexpected ping ack. No ping outstanding");
            } else if (this.c.o.a == j) {
                gbxVar = this.c.o;
                this.c.o = null;
            } else {
                gin.a.logp(Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "ping", String.format("Received unexpected ping ack. Expecting %d, got %d", Long.valueOf(this.c.o.a), Long.valueOf(j)));
            }
        }
        if (gbxVar != null) {
            gbxVar.a();
        }
    }

    @Override // flm.gjx
    public final void a() {
    }

    @Override // flm.gjx
    public final void a(int i, gjv gjvVar, guf gufVar) {
        if (gjvVar == gjv.ENHANCE_YOUR_CALM) {
            String strA = gufVar.a();
            gin.a.logp(Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "goAway", String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", this, strA));
            if ("too_many_pings".equals(strA)) {
                this.c.A.run();
            }
        }
        fvc fvcVarB = gbo.a(gjvVar.n).b("Received Goaway");
        if (gufVar.e() > 0) {
            fvcVarB = fvcVarB.b(gufVar.a());
        }
        this.c.a(i, (gjv) null, fvcVarB);
    }

    @Override // flm.gjx
    public final void a(int i) {
        this.c.f.a(i, gjv.PROTOCOL_ERROR);
    }

    @Override // flm.gjx
    public final void a(int i, long j) {
        boolean z = false;
        if (j == 0) {
            if (i == 0) {
                this.c.a(gjv.PROTOCOL_ERROR, "Received 0 flow control window increment.");
                return;
            } else {
                this.c.a(i, fvc.i.a("Received 0 flow control window increment."), dp.aK, false, gjv.PROTOCOL_ERROR, null);
                return;
            }
        }
        synchronized (this.c.h) {
            try {
                if (i == 0) {
                    this.c.g.a(null, (int) j);
                    return;
                }
                gij gijVar = (gij) this.c.i.get(Integer.valueOf(i));
                if (gijVar != null) {
                    this.c.g.a(gijVar, (int) j);
                } else if (!this.c.a(i)) {
                    z = true;
                }
                if (z) {
                    this.c.a(gjv.PROTOCOL_ERROR, new StringBuilder(54).append("Received window_update for unknown stream: ").append(i).toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // flm.gjx
    public final void b() {
    }
}
