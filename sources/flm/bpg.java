package flm;

import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bpg implements dsz {
    public final bpi b;
    public ScheduledFuture c;
    public boy[] d;
    public long f;
    public boolean g;
    private final ScheduledExecutorService h;
    private boolean j;
    public final Object a = new Object();
    public long e = Long.MAX_VALUE;
    private final long i = ((fpu) fpt.a.a()).a();

    public bpg(ScheduledExecutorService scheduledExecutorService) {
        this.h = scheduledExecutorService;
        a();
        this.b = new bpi();
    }

    final void a() {
        this.d = new boy[8];
        for (int i : boy.a) {
            this.d[i] = new boy();
        }
    }

    final void b() {
        if (this.j && this.c == null) {
            this.f = bij.a.a() / 1000;
            this.c = this.h.schedule(new Runnable(this) { // from class: flm.bph
                private final bpg a;

                {
                    this.a = this;
                }

                /* JADX WARN: Code duplicated, block: B:57:0x018f  */
                /* JADX WARN: Code duplicated, block: B:66:0x01a4 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:73:0x01b8 A[Catch: IOException -> 0x01aa, TRY_LEAVE, TryCatch #2 {IOException -> 0x01aa, blocks: (B:9:0x0021, B:54:0x0189, B:67:0x01a6, B:73:0x01b8, B:72:0x01b4, B:68:0x01a9), top: B:82:0x0021, inners: #3 }] */
                /* JADX WARN: Code duplicated, block: B:83:0x01a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:96:? A[Catch: IOException -> 0x01aa, SYNTHETIC, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x01aa, blocks: (B:9:0x0021, B:54:0x0189, B:67:0x01a6, B:73:0x01b8, B:72:0x01b4, B:68:0x01a9), top: B:82:0x0021, inners: #3 }] */
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    boy[] boyVarArr;
                    long j;
                    long j2;
                    Throwable th;
                    Throwable th2;
                    bpg bpgVar = this.a;
                    synchronized (bpgVar.a) {
                        bpgVar.g = true;
                        boyVarArr = bpgVar.d;
                        bpgVar.a();
                        j = bpgVar.e;
                        bpgVar.e = Long.MAX_VALUE;
                        j2 = bpgVar.f;
                    }
                    bpi bpiVar = bpgVar.b;
                    if (bpiVar.a != null) {
                        try {
                            FileLock fileLockA = bpiVar.a();
                            try {
                                FileChannel channel = bpiVar.a.getChannel();
                                if (channel.size() < channel.position()) {
                                    channel.position(channel.size());
                                }
                                long jA = bij.a.a() / 1000;
                                for (int i : boy.a) {
                                    bgo bgoVar = (bgo) ((fio) bgn.i.a(dp.au, (Object) null));
                                    bgoVar.c();
                                    bgn bgnVar = (bgn) bgoVar.a;
                                    bgnVar.a |= 1;
                                    bgnVar.b = j2;
                                    bgoVar.c();
                                    bgn bgnVar2 = (bgn) bgoVar.a;
                                    bgnVar2.a |= 2;
                                    bgnVar2.c = jA;
                                    bgoVar.c();
                                    bgn bgnVar3 = (bgn) bgoVar.a;
                                    bgnVar3.a |= 4;
                                    bgnVar3.d = j;
                                    bgoVar.c();
                                    bgn bgnVar4 = (bgn) bgoVar.a;
                                    bgnVar4.a |= 8;
                                    bgnVar4.e = i;
                                    SparseArray sparseArray = boyVarArr[i].b;
                                    if (sparseArray != null && sparseArray.size() != 0) {
                                        int i2 = 0;
                                        while (true) {
                                            int i3 = i2;
                                            if (i3 >= sparseArray.size()) {
                                                break;
                                            }
                                            boz bozVar = (boz) sparseArray.valueAt(i3);
                                            int iKeyAt = sparseArray.keyAt(i3);
                                            bgoVar.c();
                                            bgn bgnVar5 = (bgn) bgoVar.a;
                                            if (!bgnVar5.f.a()) {
                                                fjb fjbVar = bgnVar5.f;
                                                int size = fjbVar.size();
                                                bgnVar5.f = fjbVar.a(size == 0 ? 10 : size << 1);
                                            }
                                            bgnVar5.f.d(iKeyAt);
                                            int i4 = bozVar.b;
                                            bgoVar.c();
                                            bgn bgnVar6 = (bgn) bgoVar.a;
                                            if (!bgnVar6.g.a()) {
                                                fjb fjbVar2 = bgnVar6.g;
                                                int size2 = fjbVar2.size();
                                                bgnVar6.g = fjbVar2.a(size2 == 0 ? 10 : size2 << 1);
                                            }
                                            bgnVar6.g.d(i4);
                                            int i5 = bozVar.a;
                                            bgoVar.c();
                                            bgn bgnVar7 = (bgn) bgoVar.a;
                                            if (!bgnVar7.h.a()) {
                                                fjb fjbVar3 = bgnVar7.h;
                                                int size3 = fjbVar3.size();
                                                bgnVar7.h = fjbVar3.a(size3 == 0 ? 10 : size3 << 1);
                                            }
                                            bgnVar7.h.d(i5);
                                            i2 = i3 + 1;
                                        }
                                        byte[] bArrB = ((bgn) ((fin) bgoVar.h())).b();
                                        bpiVar.b.writeInt(1090234222);
                                        bpiVar.b.writeInt(bArrB.length);
                                        bpiVar.b.write(bArrB, 0, bArrB.length);
                                    }
                                }
                                bpiVar.b.flush();
                                if (fileLockA != null) {
                                    fileLockA.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    throw th3;
                                } catch (Throwable th4) {
                                    th = th3;
                                    th2 = th4;
                                    if (fileLockA != null) {
                                        throw th2;
                                    }
                                    if (th == null) {
                                        fileLockA.close();
                                        throw th2;
                                    }
                                    fileLockA.close();
                                    throw th2;
                                    synchronized (bpgVar.a) {
                                        bpgVar.c = null;
                                        bpgVar.b();
                                        bpgVar.g = false;
                                    }
                                }
                            }
                        } catch (IOException e) {
                            Log.w("TracingFileWriter", "Failed to write aggregates to disk.", e);
                        }
                    }
                    synchronized (bpgVar.a) {
                        bpgVar.c = null;
                        bpgVar.b();
                        bpgVar.g = false;
                    }
                }
            }, this.i, TimeUnit.SECONDS);
            this.j = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    @Override // flm.dsz
    public final void a(duf dufVar, SparseArray sparseArray) {
        boz bozVar;
        bof bofVar;
        boh bohVar;
        bnu bnuVar;
        if ((dufVar.a & 8) != 8) {
            int size = dufVar.d.size();
            dtf[] dtfVarArr = new dtf[size];
            for (dtf dtfVar : dufVar.d) {
                dtfVarArr[dtfVar.c] = dtfVar;
            }
            boz[] bozVarArr = new boz[size];
            int size2 = sparseArray.size();
            synchronized (this.a) {
                for (int i = 0; i < size2; i++) {
                    dtn dtnVar = (dtn) sparseArray.valueAt(i);
                    int iKeyAt = sparseArray.keyAt(i);
                    dtl dtlVarA = dtn.a(duq.a, dtnVar, duo.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
                    if (dtlVarA.b()) {
                        gpr gprVar = (gpr) dtlVarA.a();
                        if ((gprVar.a & 128) == 128) {
                            if (gprVar.b == null) {
                                bofVar = bof.f;
                            } else {
                                bofVar = gprVar.b;
                            }
                            if (bofVar.d == null) {
                                bohVar = boh.d;
                            } else {
                                bohVar = bofVar.d;
                            }
                            if ((bohVar.a & 1) == 1) {
                                int iHashCode = bohVar.b.hashCode();
                                if (bofVar.e == null) {
                                    bnuVar = bnu.c;
                                } else {
                                    bnuVar = bofVar.e;
                                }
                                int i2 = (bnuVar.a & 1) == 1 ? bnuVar.b & 7 : arh.STATE_NOT_REPORTED.b;
                                if (this.d[i2] == null) {
                                    Log.e("ReportingTracing", new StringBuilder(49).append("No aggregation found for device state ").append(i2).toString());
                                    bozVar = null;
                                } else {
                                    bozVar = (boz) this.d[i2].b.get(iHashCode);
                                    if (bozVar == null) {
                                        bozVar = new boz();
                                        this.d[i2].b.put(iHashCode, bozVar);
                                    }
                                }
                            } else {
                                bozVar = null;
                            }
                        } else {
                            bozVar = null;
                        }
                    } else {
                        bozVar = null;
                    }
                    if (bozVar != null) {
                        bozVarArr[iKeyAt] = bozVar;
                        bozVar.a++;
                    }
                }
                for (int i3 = 0; i3 < size; i3++) {
                    if (bozVarArr[i3] == null) {
                        if (dtfVarArr[i3].d == -1) {
                            String.format("Span with no extras, GCoreDimensions or moduleId: %s", dtfVarArr[i3].b);
                            return;
                        }
                        bozVarArr[i3] = bozVarArr[dtfVarArr[i3].d];
                    }
                    bozVarArr[i3].b += dtfVarArr[i3].g;
                }
                this.e = Math.min(this.e, dufVar.e / 1000);
                if ((!this.j && this.c == null) || this.g) {
                    this.j = true;
                }
                b();
            }
        }
    }
}
