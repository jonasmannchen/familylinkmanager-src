package flm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gkg implements gjw {
    private final gue a;
    private final gke b;
    private final gkb c;

    gkg(gue gueVar, int i, boolean z) {
        this.a = gueVar;
        this.b = new gke(this.a);
        this.c = new gkb(4096, this.b);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:152:0x017a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0191  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // flm.gjw
    public final boolean a(gjx gjxVar) throws IOException {
        int i;
        try {
            this.a.a(9L);
            int iA = gkd.a(this.a);
            if (iA < 0 || iA > 16384) {
                throw gkd.b("FRAME_SIZE_ERROR: %s", Integer.valueOf(iA));
            }
            byte bC = this.a.c();
            byte bC2 = this.a.c();
            int iE = this.a.e() & Integer.MAX_VALUE;
            if (gkd.a.isLoggable(Level.FINE)) {
                gkd.a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Reader", "nextFrame", gkf.a(true, iE, iA, bC, bC2));
            }
            switch (bC) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    boolean z = (bC2 & 1) != 0;
                    if (((bC2 & 32) != 0) != false) {
                        throw gkd.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                    }
                    short sC = (bC2 & 8) != 0 ? (short) (this.a.c() & 255) : (short) 0;
                    gjxVar.a(z, iE, this.a, gkd.a(iA, bC2, sC));
                    this.a.f(sC);
                    return true;
                case 1:
                    if (iE == 0) {
                        throw gkd.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                    }
                    boolean z2 = (bC2 & 1) != 0;
                    short sC2 = (bC2 & 8) != 0 ? (short) (this.a.c() & 255) : (short) 0;
                    if ((bC2 & 32) != 0) {
                        a(gjxVar, iE);
                        i = iA - 5;
                    } else {
                        i = iA;
                    }
                    gjxVar.a(z2, iE, a(gkd.a(i, bC2, sC2), sC2, bC2, iE));
                    return true;
                case 2:
                    if (iA != 5) {
                        throw gkd.b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iA));
                    }
                    if (iE == 0) {
                        throw gkd.b("TYPE_PRIORITY streamId == 0", new Object[0]);
                    }
                    a(gjxVar, iE);
                    return true;
                case 3:
                    if (iA != 4) {
                        throw gkd.b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(iA));
                    }
                    if (iE == 0) {
                        throw gkd.b("TYPE_RST_STREAM streamId == 0", new Object[0]);
                    }
                    int iE2 = this.a.e();
                    gjv gjvVarA = gjv.a(iE2);
                    if (gjvVarA == null) {
                        throw gkd.b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(iE2));
                    }
                    gjxVar.a(iE, gjvVarA);
                    return true;
                case 4:
                    if (iE != 0) {
                        throw gkd.b("TYPE_SETTINGS streamId != 0", new Object[0]);
                    }
                    if ((bC2 & 1) != 0) {
                        if (iA != 0) {
                            throw gkd.b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                        }
                        gjxVar.a();
                        return true;
                    }
                    if (iA % 6 != 0) {
                        throw gkd.b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(iA));
                    }
                    gkk gkkVar = new gkk();
                    for (int i2 = 0; i2 < iA; i2 += 6) {
                        short sD = this.a.d();
                        int iE3 = this.a.e();
                        switch (sD) {
                            case 1:
                            case 6:
                                if (sD < gkkVar.d.length) {
                                    int i3 = 1 << sD;
                                    gkkVar.a |= i3;
                                    gkkVar.b &= i3 ^ (-1);
                                    gkkVar.c = (i3 ^ (-1)) & gkkVar.c;
                                    gkkVar.d[sD] = iE3;
                                }
                                break;
                            case 2:
                                if (iE3 != 0 && iE3 != 1) {
                                    throw gkd.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                }
                                if (sD < gkkVar.d.length) {
                                    int i4 = 1 << sD;
                                    gkkVar.a |= i4;
                                    gkkVar.b &= i4 ^ (-1);
                                    gkkVar.c = (i4 ^ (-1)) & gkkVar.c;
                                    gkkVar.d[sD] = iE3;
                                }
                                break;
                            case 3:
                                sD = 4;
                                if (sD < gkkVar.d.length) {
                                    int i5 = 1 << sD;
                                    gkkVar.a |= i5;
                                    gkkVar.b &= i5 ^ (-1);
                                    gkkVar.c = (i5 ^ (-1)) & gkkVar.c;
                                    gkkVar.d[sD] = iE3;
                                }
                                break;
                            case 4:
                                sD = 7;
                                if (iE3 < 0) {
                                    throw gkd.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                }
                                if (sD < gkkVar.d.length) {
                                    int i6 = 1 << sD;
                                    gkkVar.a |= i6;
                                    gkkVar.b &= i6 ^ (-1);
                                    gkkVar.c = (i6 ^ (-1)) & gkkVar.c;
                                    gkkVar.d[sD] = iE3;
                                }
                                break;
                            case 5:
                                if (iE3 < 16384 || iE3 > 16777215) {
                                    throw gkd.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(iE3));
                                }
                                if (sD < gkkVar.d.length) {
                                    int i7 = 1 << sD;
                                    gkkVar.a |= i7;
                                    gkkVar.b &= i7 ^ (-1);
                                    gkkVar.c = (i7 ^ (-1)) & gkkVar.c;
                                    gkkVar.d[sD] = iE3;
                                }
                                break;
                        }
                    }
                    gjxVar.a(gkkVar);
                    if (gkkVar.a() < 0) {
                        return true;
                    }
                    gkb gkbVar = this.c;
                    int iA2 = gkkVar.a();
                    gkbVar.c = iA2;
                    gkbVar.d = iA2;
                    gkbVar.a();
                    return true;
                case 5:
                    if (iE == 0) {
                        throw gkd.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                    }
                    short sC3 = (bC2 & 8) != 0 ? (short) (this.a.c() & 255) : (short) 0;
                    this.a.e();
                    a(gkd.a(iA - 4, bC2, sC3), sC3, bC2, iE);
                    gjxVar.a(iE);
                    return true;
                case 6:
                    if (iA != 8) {
                        throw gkd.b("TYPE_PING length != 8: %s", Integer.valueOf(iA));
                    }
                    if (iE != 0) {
                        throw gkd.b("TYPE_PING streamId != 0", new Object[0]);
                    }
                    gjxVar.a((bC2 & 1) != 0, this.a.e(), this.a.e());
                    return true;
                case 7:
                    if (iA < 8) {
                        throw gkd.b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(iA));
                    }
                    if (iE != 0) {
                        throw gkd.b("TYPE_GOAWAY streamId != 0", new Object[0]);
                    }
                    int iE4 = this.a.e();
                    int iE5 = this.a.e();
                    int i8 = iA - 8;
                    gjv gjvVarA2 = gjv.a(iE5);
                    if (gjvVarA2 == null) {
                        throw gkd.b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(iE5));
                    }
                    guf gufVarC = guf.a;
                    if (i8 > 0) {
                        gufVarC = this.a.c(i8);
                    }
                    gjxVar.a(iE4, gjvVarA2, gufVarC);
                    return true;
                case 8:
                    if (iA != 4) {
                        throw gkd.b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iA));
                    }
                    long jE = ((long) this.a.e()) & 2147483647L;
                    if (jE == 0) {
                        throw gkd.b("windowSizeIncrement was 0", Long.valueOf(jE));
                    }
                    gjxVar.a(iE, jE);
                    return true;
                default:
                    this.a.f(iA);
                    return true;
            }
        } catch (IOException e) {
            return false;
        }
    }

    private final List a(int i, short s, byte b, int i2) throws IOException {
        gke gkeVar = this.b;
        this.b.d = i;
        gkeVar.a = i;
        this.b.e = s;
        this.b.b = b;
        this.b.c = i2;
        gkb gkbVar = this.c;
        while (!gkbVar.b.b()) {
            int iC = gkbVar.b.c() & 255;
            if (iC == 128) {
                throw new IOException("index == 0");
            }
            if ((iC & 128) == 128) {
                int iA = gkbVar.a(iC, 127) - 1;
                if (gkb.c(iA)) {
                    gkbVar.a.add(gka.a[iA]);
                } else {
                    int iA2 = gkbVar.a(iA - gka.a.length);
                    if (iA2 < 0 || iA2 > gkbVar.e.length - 1) {
                        throw new IOException(new StringBuilder(34).append("Header index too large ").append(iA + 1).toString());
                    }
                    gkbVar.a.add(gkbVar.e[iA2]);
                }
            } else if (iC == 64) {
                gkbVar.a(-1, new gjz(gka.a(gkbVar.b()), gkbVar.b()));
            } else if ((iC & 64) == 64) {
                gkbVar.a(-1, new gjz(gkbVar.b(gkbVar.a(iC, 63) - 1), gkbVar.b()));
            } else if ((iC & 32) == 32) {
                gkbVar.d = gkbVar.a(iC, 31);
                if (gkbVar.d < 0 || gkbVar.d > gkbVar.c) {
                    throw new IOException(new StringBuilder(45).append("Invalid dynamic table size update ").append(gkbVar.d).toString());
                }
                gkbVar.a();
            } else if (iC == 16 || iC == 0) {
                gkbVar.a.add(new gjz(gka.a(gkbVar.b()), gkbVar.b()));
            } else {
                gkbVar.a.add(new gjz(gkbVar.b(gkbVar.a(iC, 15) - 1), gkbVar.b()));
            }
        }
        gkb gkbVar2 = this.c;
        ArrayList arrayList = new ArrayList(gkbVar2.a);
        gkbVar2.a.clear();
        return arrayList;
    }

    private final void a(gjx gjxVar, int i) {
        this.a.e();
        this.a.c();
        gjxVar.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
