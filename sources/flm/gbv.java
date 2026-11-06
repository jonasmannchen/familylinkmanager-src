package flm;

import java.nio.charset.Charset;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class gbv extends fwn {
    private static final fti a = new gbw();
    private static final fuc b = fth.a(":status", a);
    private fvc c;
    private ftv d;
    private Charset e;
    private boolean f;

    public gbv(int i, ghd ghdVar, ghk ghkVar) {
        super(i, ghdVar, ghkVar);
        this.e = dva.b;
    }

    public abstract void a(fvc fvcVar, boolean z, ftv ftvVar);

    /* JADX WARN: Code duplicated, block: B:39:0x0153 A[Catch: all -> 0x01d8, TryCatch #0 {all -> 0x01d8, blocks: (B:6:0x0035, B:8:0x0039, B:12:0x0079, B:14:0x0083, B:16:0x008b, B:23:0x00cb, B:28:0x010e, B:31:0x0116, B:34:0x012b, B:36:0x0133, B:48:0x01b6, B:50:0x01be, B:37:0x0149, B:39:0x0153, B:41:0x015f, B:43:0x0163, B:58:0x0212, B:61:0x0218, B:62:0x0230, B:63:0x0235), top: B:65:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x015f A[Catch: all -> 0x01d8, TryCatch #0 {all -> 0x01d8, blocks: (B:6:0x0035, B:8:0x0039, B:12:0x0079, B:14:0x0083, B:16:0x008b, B:23:0x00cb, B:28:0x010e, B:31:0x0116, B:34:0x012b, B:36:0x0133, B:48:0x01b6, B:50:0x01be, B:37:0x0149, B:39:0x0153, B:41:0x015f, B:43:0x0163, B:58:0x0212, B:61:0x0218, B:62:0x0230, B:63:0x0235), top: B:65:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0163 A[Catch: all -> 0x01d8, TRY_LEAVE, TryCatch #0 {all -> 0x01d8, blocks: (B:6:0x0035, B:8:0x0039, B:12:0x0079, B:14:0x0083, B:16:0x008b, B:23:0x00cb, B:28:0x010e, B:31:0x0116, B:34:0x012b, B:36:0x0133, B:48:0x01b6, B:50:0x01be, B:37:0x0149, B:39:0x0153, B:41:0x015f, B:43:0x0163, B:58:0x0212, B:61:0x0218, B:62:0x0230, B:63:0x0235), top: B:65:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x020f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0212 A[Catch: all -> 0x01d8, TRY_ENTER, TryCatch #0 {all -> 0x01d8, blocks: (B:6:0x0035, B:8:0x0039, B:12:0x0079, B:14:0x0083, B:16:0x008b, B:23:0x00cb, B:28:0x010e, B:31:0x0116, B:34:0x012b, B:36:0x0133, B:48:0x01b6, B:50:0x01be, B:37:0x0149, B:39:0x0153, B:41:0x015f, B:43:0x0163, B:58:0x0212, B:61:0x0218, B:62:0x0230, B:63:0x0235), top: B:65:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0216 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0218 A[Catch: all -> 0x01d8, TryCatch #0 {all -> 0x01d8, blocks: (B:6:0x0035, B:8:0x0039, B:12:0x0079, B:14:0x0083, B:16:0x008b, B:23:0x00cb, B:28:0x010e, B:31:0x0116, B:34:0x012b, B:36:0x0133, B:48:0x01b6, B:50:0x01be, B:37:0x0149, B:39:0x0153, B:41:0x015f, B:43:0x0163, B:58:0x0212, B:61:0x0218, B:62:0x0230, B:63:0x0235), top: B:65:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0230 A[Catch: all -> 0x01d8, TryCatch #0 {all -> 0x01d8, blocks: (B:6:0x0035, B:8:0x0039, B:12:0x0079, B:14:0x0083, B:16:0x008b, B:23:0x00cb, B:28:0x010e, B:31:0x0116, B:34:0x012b, B:36:0x0133, B:48:0x01b6, B:50:0x01be, B:37:0x0149, B:39:0x0153, B:41:0x015f, B:43:0x0163, B:58:0x0212, B:61:0x0218, B:62:0x0230, B:63:0x0235), top: B:65:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0235 A[Catch: all -> 0x01d8, TRY_LEAVE, TryCatch #0 {all -> 0x01d8, blocks: (B:6:0x0035, B:8:0x0039, B:12:0x0079, B:14:0x0083, B:16:0x008b, B:23:0x00cb, B:28:0x010e, B:31:0x0116, B:34:0x012b, B:36:0x0133, B:48:0x01b6, B:50:0x01be, B:37:0x0149, B:39:0x0153, B:41:0x015f, B:43:0x0163, B:58:0x0212, B:61:0x0218, B:62:0x0230, B:63:0x0235), top: B:65:0x0035 }] */
    public final void a(ftv ftvVar) {
        String str;
        fsq fsqVar;
        fso fsoVar;
        fvc fvcVar;
        boolean z = false;
        dvl.a(ftvVar, "headers");
        if (this.c != null) {
            fvc fvcVar2 = this.c;
            String strValueOf = String.valueOf(ftvVar);
            this.c = fvcVar2.b(new StringBuilder(String.valueOf(strValueOf).length() + 9).append("headers: ").append(strValueOf).toString());
            return;
        }
        try {
            if (this.f) {
                this.c = fvc.i.a("Received headers twice");
                if (fvcVar != null) {
                    return;
                } else {
                    return;
                }
            }
            Integer num = (Integer) ftvVar.a(b);
            if (num != null && num.intValue() >= 100 && num.intValue() < 200) {
                if (fvcVar != null) {
                    return;
                } else {
                    return;
                }
            }
            this.f = true;
            this.c = c(ftvVar);
            if (this.c != null) {
                if (fvcVar != null) {
                    return;
                } else {
                    return;
                }
            }
            e(ftvVar);
            dvl.b(!this.n, "Received headers on closed stream");
            ghd ghdVar = this.i;
            String str2 = (String) ftvVar.a(gbh.e);
            if (this.k && str2 != null) {
                if (str2.equalsIgnoreCase("gzip")) {
                    this.q.a(new gbq());
                    this.q = new fww(this, this, (gee) this.q);
                    z = true;
                } else if (!str2.equalsIgnoreCase("identity")) {
                    a(fvc.i.a(String.format("Can't find full stream decompressor for %s", str2)).b());
                }
                str = (String) ftvVar.a(gbh.c);
                if (str == null) {
                    fsqVar = (fsq) this.l.b.get(str);
                    if (fsqVar != null) {
                        fsoVar = fsqVar.a;
                    } else {
                        fsoVar = null;
                    }
                    if (fsoVar == null) {
                        a(fvc.i.a(String.format("Can't find decompressor for %s", str)).b());
                    } else if (fsoVar == frx.a) {
                        if (z) {
                            a(fvc.i.a(String.format("Full stream and gRPC message encoding cannot both be set", new Object[0])).b());
                        } else {
                            this.q.a(fsoVar);
                            this.j.a(ftvVar);
                        }
                    } else {
                        this.j.a(ftvVar);
                    }
                } else {
                    this.j.a(ftvVar);
                }
            } else {
                str = (String) ftvVar.a(gbh.c);
                if (str == null) {
                    fsqVar = (fsq) this.l.b.get(str);
                    if (fsqVar != null) {
                        fsoVar = fsqVar.a;
                    } else {
                        fsoVar = null;
                    }
                    if (fsoVar == null) {
                        a(fvc.i.a(String.format("Can't find decompressor for %s", str)).b());
                    } else if (fsoVar == frx.a) {
                        if (z) {
                            a(fvc.i.a(String.format("Full stream and gRPC message encoding cannot both be set", new Object[0])).b());
                        } else {
                            this.q.a(fsoVar);
                            this.j.a(ftvVar);
                        }
                    } else {
                        this.j.a(ftvVar);
                    }
                } else {
                    this.j.a(ftvVar);
                }
            }
        } finally {
            if (this.c != null) {
                fvc fvcVar3 = this.c;
                String strValueOf2 = String.valueOf(ftvVar);
                this.c = fvcVar3.b(new StringBuilder(String.valueOf(strValueOf2).length() + 9).append("headers: ").append(strValueOf2).toString());
                this.d = ftvVar;
                this.e = d(ftvVar);
            }
        }
    }

    public final void a(gez gezVar, boolean z) {
        if (this.c != null) {
            fvc fvcVar = this.c;
            String strValueOf = String.valueOf(gfa.a(gezVar, this.e));
            this.c = fvcVar.b(strValueOf.length() != 0 ? "DATA-----------------------------\n".concat(strValueOf) : new String("DATA-----------------------------\n"));
            gezVar.close();
            if (this.c.n.length() > 1000 || z) {
                a(this.c, false, this.d);
                return;
            }
            return;
        }
        if (!this.f) {
            a(fvc.i.a("headers not received before payload"), false, new ftv());
            return;
        }
        dvl.a(gezVar, "frame");
        boolean z2 = true;
        try {
            try {
                if (this.n) {
                    fwk.p.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundDataReceived", "Received data on closed stream");
                    gezVar.close();
                } else {
                    try {
                        this.q.a(gezVar);
                    } catch (Throwable th) {
                        a(th);
                    }
                }
                if (z) {
                    this.c = fvc.i.a("Received unexpected EOS on DATA frame from server.");
                    this.d = new ftv();
                    b(this.c, false, this.d);
                }
            } catch (Throwable th2) {
                th = th2;
                z2 = false;
                if (z2) {
                    gezVar.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void b(ftv ftvVar) {
        fvc fvcVarA;
        fvc fvcVarB;
        dvl.a(ftvVar, "trailers");
        if (this.c == null && !this.f) {
            this.c = c(ftvVar);
            if (this.c != null) {
                this.d = ftvVar;
            }
        }
        if (this.c != null) {
            fvc fvcVar = this.c;
            String strValueOf = String.valueOf(ftvVar);
            this.c = fvcVar.b(new StringBuilder(String.valueOf(strValueOf).length() + 10).append("trailers: ").append(strValueOf).toString());
            a(this.c, false, this.d);
            return;
        }
        fvc fvcVar2 = (fvc) ftvVar.a(ftj.b);
        if (fvcVar2 != null) {
            fvcVarB = fvcVar2.a((String) ftvVar.a(ftj.a));
        } else if (this.f) {
            fvcVarB = fvc.d.a("missing GRPC status in response");
        } else {
            Integer num = (Integer) ftvVar.a(b);
            if (num != null) {
                fvcVarA = gbh.a(num.intValue());
            } else {
                fvcVarA = fvc.i.a("missing HTTP status code");
            }
            fvcVarB = fvcVarA.b("missing GRPC status, inferred error from HTTP status code");
        }
        e(ftvVar);
        dvl.a(fvcVarB, "status");
        dvl.a(ftvVar, "trailers");
        if (this.n) {
            fwk.p.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundTrailersReceived", "Received trailers on closed stream:\n {1}\n {2}", new Object[]{fvcVarB, ftvVar});
            return;
        }
        this.o = ftvVar;
        this.p = fvcVarB;
        b(false);
    }

    private static fvc c(ftv ftvVar) {
        Integer num = (Integer) ftvVar.a(b);
        if (num == null) {
            return fvc.i.a("Missing HTTP status code");
        }
        String str = (String) ftvVar.a(gbh.g);
        if (!gbh.a(str)) {
            fvc fvcVarA = gbh.a(num.intValue());
            String strValueOf = String.valueOf(str);
            return fvcVarA.b(strValueOf.length() != 0 ? "invalid content-type: ".concat(strValueOf) : new String("invalid content-type: "));
        }
        return null;
    }

    private static Charset d(ftv ftvVar) {
        String str = (String) ftvVar.a(gbh.g);
        if (str != null) {
            String[] strArrSplit = str.split("charset=", 2);
            try {
                return Charset.forName(strArrSplit[strArrSplit.length - 1].trim());
            } catch (Exception e) {
            }
        }
        return dva.b;
    }

    private static void e(ftv ftvVar) {
        ftvVar.b(b);
        ftvVar.b(ftj.b);
        ftvVar.b(ftj.a);
    }
}
