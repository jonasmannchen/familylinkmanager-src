package flm;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gee implements fzm, Closeable {
    public gef a;
    public int b;
    private final ghd d;
    private final ghk e;
    private fso f;
    private gbq g;
    private byte[] h;
    private int i;
    private boolean l;
    private fzf m;
    private long o;
    private int r;
    private gei j = gei.HEADER;
    private int k = 5;
    private fzf n = new fzf();
    private boolean p = false;
    private int q = -1;
    private boolean s = false;
    public volatile boolean c = false;

    public gee(gef gefVar, fso fsoVar, int i, ghd ghdVar, ghk ghkVar) {
        this.a = (gef) dvl.a(gefVar, "sink");
        this.f = (fso) dvl.a(fsoVar, "decompressor");
        this.b = i;
        this.d = (ghd) dvl.a(ghdVar, "statsTraceCtx");
        this.e = (ghk) dvl.a(ghkVar, "transportTracer");
    }

    @Override // flm.fzm
    public final void b(int i) {
        this.b = i;
    }

    @Override // flm.fzm
    public final void a(fso fsoVar) {
        dvl.b(this.g == null, "Already set full stream decompressor");
        this.f = (fso) dvl.a(fsoVar, "Can't pass an empty decompressor");
    }

    @Override // flm.fzm
    public final void a(gbq gbqVar) {
        dvl.b(this.f == frx.a, "per-message decompressor already set");
        dvl.b(this.g == null, "full stream decompressor already set");
        this.g = (gbq) dvl.a(gbqVar, "Can't pass a null full stream decompressor");
        this.n = null;
    }

    @Override // flm.fzm
    public final void c(int i) {
        dvl.a(i > 0, "numMessages must be > 0");
        if (!b()) {
            this.o += (long) i;
            d();
        }
    }

    @Override // flm.fzm
    public final void a(gez gezVar) throws Throwable {
        boolean z = true;
        boolean z2 = false;
        dvl.a(gezVar, "data");
        try {
            if (b() || this.s) {
                z2 = true;
            } else {
                if (this.g != null) {
                    gbq gbqVar = this.g;
                    dvl.b(!gbqVar.i, "GzipInflatingBuffer is closed");
                    gbqVar.a.a(gezVar);
                    gbqVar.n = false;
                } else {
                    this.n.a(gezVar);
                }
                try {
                    d();
                } catch (Throwable th) {
                    th = th;
                    z = false;
                    if (z) {
                        gezVar.close();
                    }
                    throw th;
                }
            }
            if (z2) {
                gezVar.close();
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // flm.fzm
    public final void a() {
        if (!b()) {
            if (c()) {
                close();
            } else {
                this.s = true;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0038  */
    @Override // flm.fzm
    public final void close() {
        if (!b()) {
            boolean z = this.m != null && this.m.a > 0;
            try {
                if (this.g != null) {
                    if (z) {
                        z = true;
                    } else {
                        gbq gbqVar = this.g;
                        dvl.b(!gbqVar.i, "GzipInflatingBuffer is closed");
                        if ((gbqVar.c.b() == 0 && gbqVar.h == gbs.HEADER) ? false : true) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    this.g.close();
                }
                if (this.n != null) {
                    this.n.close();
                }
                if (this.m != null) {
                    this.m.close();
                }
                this.g = null;
                this.n = null;
                this.m = null;
                this.a.a(z);
            } catch (Throwable th) {
                this.g = null;
                this.n = null;
                this.m = null;
                throw th;
            }
        }
    }

    public final boolean b() {
        return this.n == null && this.g == null;
    }

    private final boolean c() {
        if (this.g == null) {
            return this.n.a == 0;
        }
        gbq gbqVar = this.g;
        dvl.b(gbqVar.i ? false : true, "GzipInflatingBuffer is closed");
        return gbqVar.n;
    }

    private final void d() {
        InputStream inputStreamA;
        if (!this.p) {
            this.p = true;
            while (!this.c && this.o > 0 && e()) {
                try {
                    switch (this.j.ordinal()) {
                        case bbx.MSG_UNBIND_SERVICE /* 0 */:
                            int iB = this.m.b();
                            if ((iB & 254) != 0) {
                                throw fvc.i.a("gRPC frame header malformed: reserved bits not zero").b();
                            }
                            this.l = (iB & 1) != 0;
                            fzf fzfVar = this.m;
                            fzfVar.a(4);
                            this.k = fzfVar.b() | (fzfVar.b() << 24) | (fzfVar.b() << 16) | (fzfVar.b() << 8);
                            if (this.k < 0 || this.k > this.b) {
                                throw fvc.h.a(String.format("gRPC message exceeds maximum size %d: %d", Integer.valueOf(this.b), Integer.valueOf(this.k))).b();
                            }
                            this.q++;
                            ghd ghdVar = this.d;
                            int i = this.q;
                            fvi[] fviVarArr = ghdVar.a;
                            for (fvi fviVar : fviVarArr) {
                                fviVar.c();
                            }
                            ghk ghkVar = this.e;
                            ghkVar.h.a(1L);
                            ghkVar.i = ghkVar.b.a();
                            this.j = gei.BODY;
                            break;
                            break;
                        case 1:
                            ghd ghdVar2 = this.d;
                            int i2 = this.q;
                            long j = this.r;
                            for (fvi fviVar2 : ghdVar2.a) {
                                fviVar2.b(i2, j, -1L);
                            }
                            this.r = 0;
                            if (this.l) {
                                inputStreamA = f();
                            } else {
                                this.d.c(this.m.a);
                                inputStreamA = gfa.a((gez) this.m, true);
                            }
                            this.m = null;
                            this.a.a(new geg(inputStreamA));
                            this.j = gei.HEADER;
                            this.k = 5;
                            this.o--;
                            break;
                        default:
                            String strValueOf = String.valueOf(this.j);
                            throw new AssertionError(new StringBuilder(String.valueOf(strValueOf).length() + 15).append("Invalid state: ").append(strValueOf).toString());
                    }
                } catch (Throwable th) {
                    this.p = false;
                    throw th;
                }
            }
            if (this.c) {
                close();
                this.p = false;
            } else {
                if (this.s && c()) {
                    close();
                }
                this.p = false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0314  */
    /* JADX WARN: Code duplicated, block: B:151:0x032b  */
    /* JADX WARN: Code duplicated, block: B:153:0x0336  */
    /* JADX WARN: Code duplicated, block: B:155:0x033a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0349  */
    /* JADX WARN: Code duplicated, block: B:160:0x0355 A[Catch: IOException -> 0x0087, all -> 0x008e, DataFormatException -> 0x00cd, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x0087, DataFormatException -> 0x00cd, blocks: (B:10:0x001a, B:12:0x001e, B:15:0x0032, B:18:0x0047, B:20:0x0051, B:22:0x0055, B:23:0x005b, B:24:0x005e, B:25:0x0086, B:38:0x00ae, B:41:0x00ba, B:43:0x00c5, B:44:0x00cc, B:48:0x00d4, B:50:0x00de, B:51:0x00e5, B:52:0x00e6, B:54:0x00fc, B:56:0x0119, B:58:0x0120, B:59:0x013a, B:60:0x0146, B:62:0x014d, B:63:0x0154, B:66:0x0160, B:67:0x016f, B:70:0x017c, B:72:0x018b, B:74:0x01a8, B:76:0x01af, B:77:0x01c9, B:78:0x01d5, B:80:0x01dd, B:81:0x01e4, B:82:0x01e6, B:84:0x01ec, B:90:0x01fa, B:91:0x0201, B:93:0x0209, B:94:0x0210, B:95:0x0212, B:97:0x0218, B:103:0x0226, B:104:0x022d, B:106:0x0234, B:107:0x023b, B:110:0x0247, B:112:0x025a, B:113:0x0261, B:114:0x0262, B:115:0x0269, B:117:0x026d, B:118:0x0275, B:120:0x0281, B:123:0x0297, B:122:0x0291, B:124:0x029c, B:126:0x02aa, B:128:0x02b5, B:131:0x02ba, B:134:0x02c6, B:139:0x02de, B:140:0x02fc, B:142:0x0304, B:144:0x030a, B:147:0x0315, B:160:0x0355, B:14:0x0025), top: B:186:0x001a, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:194:0x0329 A[SYNTHETIC] */
    private final boolean e() {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        int i3 = 0;
        int i4 = 0;
        try {
            if (this.m == null) {
                this.m = new fzf();
            }
            while (true) {
                int i5 = this.k - this.m.a;
                if (i5 > 0) {
                    if (this.g != null) {
                        try {
                            if (this.h == null || this.i == this.h.length) {
                                this.h = new byte[Math.min(i5, 2097152)];
                                this.i = 0;
                            }
                            int iMin = Math.min(i5, this.h.length - this.i);
                            gbq gbqVar = this.g;
                            byte[] bArr = this.h;
                            int i6 = this.i;
                            dvl.b(!gbqVar.i, "GzipInflatingBuffer is closed");
                            boolean zA = true;
                            int i7 = 0;
                            while (zA) {
                                int i8 = iMin - i7;
                                if (i8 > 0) {
                                    switch (gbqVar.h.ordinal()) {
                                        case bbx.MSG_UNBIND_SERVICE /* 0 */:
                                            if (gbqVar.c.b() < 10) {
                                                zA = false;
                                            } else {
                                                if (gbqVar.c.c() != 35615) {
                                                    throw new ZipException("Not in GZIP format");
                                                }
                                                if (gbqVar.c.a() != 8) {
                                                    throw new ZipException("Unsupported compression method");
                                                }
                                                gbqVar.j = gbqVar.c.a();
                                                gbr gbrVar = gbqVar.c;
                                                int i9 = gbrVar.a.f - gbrVar.a.e;
                                                if (i9 > 0) {
                                                    int iMin2 = Math.min(i9, 6);
                                                    gbrVar.a.b.update(gbrVar.a.d, gbrVar.a.e, iMin2);
                                                    gbq.a(gbrVar.a, iMin2);
                                                    i = 6 - iMin2;
                                                } else {
                                                    i = 6;
                                                }
                                                if (i > 0) {
                                                    byte[] bArr2 = new byte[512];
                                                    int i10 = 0;
                                                    while (i10 < i) {
                                                        int iMin3 = Math.min(i - i10, 512);
                                                        gbrVar.a.a.a(bArr2, 0, iMin3);
                                                        gbrVar.a.b.update(bArr2, 0, iMin3);
                                                        i10 += iMin3;
                                                    }
                                                }
                                                gbq.b(gbrVar.a, 6);
                                                gbqVar.h = gbs.HEADER_EXTRA_LEN;
                                                zA = true;
                                            }
                                            break;
                                        case 1:
                                            if ((gbqVar.j & 4) != 4) {
                                                gbqVar.h = gbs.HEADER_NAME;
                                                zA = true;
                                            } else if (gbqVar.c.b() < 2) {
                                                zA = false;
                                            } else {
                                                gbqVar.k = gbqVar.c.c();
                                                gbqVar.h = gbs.HEADER_EXTRA;
                                                zA = true;
                                            }
                                            break;
                                        case 2:
                                            if (gbqVar.c.b() < gbqVar.k) {
                                                zA = false;
                                            } else {
                                                gbr gbrVar2 = gbqVar.c;
                                                int i11 = gbqVar.k;
                                                int i12 = gbrVar2.a.f - gbrVar2.a.e;
                                                if (i12 > 0) {
                                                    int iMin4 = Math.min(i12, i11);
                                                    gbrVar2.a.b.update(gbrVar2.a.d, gbrVar2.a.e, iMin4);
                                                    gbq.a(gbrVar2.a, iMin4);
                                                    i2 = i11 - iMin4;
                                                } else {
                                                    i2 = i11;
                                                }
                                                if (i2 > 0) {
                                                    byte[] bArr3 = new byte[512];
                                                    int i13 = 0;
                                                    while (i13 < i2) {
                                                        int iMin5 = Math.min(i2 - i13, 512);
                                                        gbrVar2.a.a.a(bArr3, 0, iMin5);
                                                        gbrVar2.a.b.update(bArr3, 0, iMin5);
                                                        i13 += iMin5;
                                                    }
                                                }
                                                gbq.b(gbrVar2.a, i11);
                                                gbqVar.h = gbs.HEADER_NAME;
                                                zA = true;
                                            }
                                            break;
                                        case 3:
                                            if ((gbqVar.j & 8) != 8) {
                                                gbqVar.h = gbs.HEADER_COMMENT;
                                                zA = true;
                                            } else {
                                                gbr gbrVar3 = gbqVar.c;
                                                while (true) {
                                                    if (gbrVar3.b() > 0) {
                                                        if (gbrVar3.a() == 0) {
                                                            z3 = true;
                                                        }
                                                    } else {
                                                        z3 = false;
                                                    }
                                                }
                                                if (!z3) {
                                                    zA = false;
                                                } else {
                                                    gbqVar.h = gbs.HEADER_COMMENT;
                                                    zA = true;
                                                }
                                            }
                                            break;
                                        case 4:
                                            if ((gbqVar.j & 16) != 16) {
                                                gbqVar.h = gbs.HEADER_CRC;
                                                zA = true;
                                            } else {
                                                gbr gbrVar4 = gbqVar.c;
                                                while (true) {
                                                    if (gbrVar4.b() > 0) {
                                                        if (gbrVar4.a() == 0) {
                                                            z2 = true;
                                                        }
                                                    } else {
                                                        z2 = false;
                                                    }
                                                }
                                                if (!z2) {
                                                    zA = false;
                                                } else {
                                                    gbqVar.h = gbs.HEADER_CRC;
                                                    zA = true;
                                                }
                                            }
                                            break;
                                        case 5:
                                            if ((gbqVar.j & 2) != 2) {
                                                gbqVar.h = gbs.INITIALIZE_INFLATER;
                                                zA = true;
                                            } else if (gbqVar.c.b() < 2) {
                                                zA = false;
                                            } else {
                                                if ((((int) gbqVar.b.getValue()) & 65535) != gbqVar.c.c()) {
                                                    throw new ZipException("Corrupt GZIP header");
                                                }
                                                gbqVar.h = gbs.INITIALIZE_INFLATER;
                                                zA = true;
                                            }
                                            break;
                                        case 6:
                                            if (gbqVar.g == null) {
                                                gbqVar.g = new Inflater(true);
                                            } else {
                                                gbqVar.g.reset();
                                            }
                                            gbqVar.b.reset();
                                            int i14 = gbqVar.f - gbqVar.e;
                                            if (i14 > 0) {
                                                gbqVar.g.setInput(gbqVar.d, gbqVar.e, i14);
                                                gbqVar.h = gbs.INFLATING;
                                            } else {
                                                gbqVar.h = gbs.INFLATER_NEEDS_INPUT;
                                            }
                                            zA = true;
                                            break;
                                        case 7:
                                            int iA = i7 + gbqVar.a(bArr, i6 + i7, i8);
                                            if (gbqVar.h == gbs.TRAILER) {
                                                zA = gbqVar.a();
                                                i7 = iA;
                                            } else {
                                                zA = true;
                                                i7 = iA;
                                            }
                                            break;
                                        case 8:
                                            dvl.b(gbqVar.g != null, "inflater is null");
                                            dvl.b(gbqVar.e == gbqVar.f, "inflaterInput has unconsumed bytes");
                                            int iMin6 = Math.min(gbqVar.a.a, 512);
                                            if (iMin6 == 0) {
                                                zA = false;
                                            } else {
                                                gbqVar.e = 0;
                                                gbqVar.f = iMin6;
                                                gbqVar.a.a(gbqVar.d, gbqVar.e, iMin6);
                                                gbqVar.g.setInput(gbqVar.d, gbqVar.e, iMin6);
                                                gbqVar.h = gbs.INFLATING;
                                                zA = true;
                                            }
                                            break;
                                        case 9:
                                            zA = gbqVar.a();
                                            break;
                                        default:
                                            String strValueOf = String.valueOf(gbqVar.h);
                                            throw new AssertionError(new StringBuilder(String.valueOf(strValueOf).length() + 15).append("Invalid state: ").append(strValueOf).toString());
                                    }
                                } else {
                                    if (zA || (gbqVar.h == gbs.HEADER && gbqVar.c.b() < 10)) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    gbqVar.n = z;
                                    gbq gbqVar2 = this.g;
                                    int i15 = gbqVar2.l;
                                    gbqVar2.l = 0;
                                    i3 += i15;
                                    gbq gbqVar3 = this.g;
                                    int i16 = gbqVar3.m;
                                    gbqVar3.m = 0;
                                    i4 += i16;
                                    if (i7 == 0) {
                                        if (i3 > 0) {
                                            this.a.a(i3);
                                            if (this.j == gei.BODY) {
                                                if (this.g != null) {
                                                    this.d.d(i4);
                                                    this.r += i4;
                                                } else {
                                                    this.d.d(i3);
                                                    this.r += i3;
                                                }
                                            }
                                        }
                                        return false;
                                    }
                                    this.m.a(gfa.a(this.h, this.i, i7));
                                    this.i += i7;
                                }
                            }
                            if (zA) {
                                z = true;
                            } else {
                                z = true;
                            }
                            gbqVar.n = z;
                            gbq gbqVar4 = this.g;
                            int i17 = gbqVar4.l;
                            gbqVar4.l = 0;
                            i3 += i17;
                            gbq gbqVar5 = this.g;
                            int i18 = gbqVar5.m;
                            gbqVar5.m = 0;
                            i4 += i18;
                            if (i7 == 0) {
                                if (i3 > 0) {
                                    this.a.a(i3);
                                    if (this.j == gei.BODY) {
                                        if (this.g != null) {
                                            this.d.d(i4);
                                            this.r += i4;
                                        } else {
                                            this.d.d(i3);
                                            this.r += i3;
                                        }
                                    }
                                }
                                return false;
                            }
                            this.m.a(gfa.a(this.h, this.i, i7));
                            this.i += i7;
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        } catch (DataFormatException e2) {
                            throw new RuntimeException(e2);
                        }
                    } else {
                        if (this.n.a == 0) {
                            if (i3 > 0) {
                                this.a.a(i3);
                                if (this.j == gei.BODY) {
                                    if (this.g != null) {
                                        this.d.d(i4);
                                        this.r += i4;
                                    } else {
                                        this.d.d(i3);
                                        this.r += i3;
                                    }
                                }
                            }
                            return false;
                        }
                        int iMin7 = Math.min(i5, this.n.a);
                        i3 += iMin7;
                        this.m.a((fzf) this.n.b(iMin7));
                    }
                } else {
                    if (i3 > 0) {
                        this.a.a(i3);
                        if (this.j == gei.BODY) {
                            if (this.g != null) {
                                this.d.d(i4);
                                this.r += i4;
                            } else {
                                this.d.d(i3);
                                this.r += i3;
                            }
                        }
                    }
                    return true;
                }
            }
        } catch (Throwable th) {
            if (i3 > 0) {
                this.a.a(i3);
                if (this.j == gei.BODY) {
                    if (this.g != null) {
                        this.d.d(i4);
                        this.r = i4 + this.r;
                    } else {
                        this.d.d(i3);
                        this.r += i3;
                    }
                }
            }
            throw th;
        }
    }

    private final InputStream f() {
        if (this.f == frx.a) {
            throw fvc.i.a("Can't decode compressed gRPC message as compression not configured").b();
        }
        try {
            return new geh(this.f.a(gfa.a((gez) this.m, true)), this.b, this.d);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
