package flm;

import android.util.Log;
import android.util.LruCache;
import android.util.SparseArray;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bpc implements dsz {
    private final dfh a;
    private int b = 0;
    private int c = 0;
    private final LruCache d = new bpd(50);

    bpc(dfh dfhVar) {
        this.a = dfhVar;
    }

    public final synchronized void a(int i, int i2) {
        this.b = i;
        this.c = i2;
        if (!a()) {
            this.d.evictAll();
        }
    }

    private final boolean a() {
        return this.b > 0 || this.c > 0;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x01b4  */
    @Override // flm.dsz
    public final synchronized void a(duf dufVar, SparseArray sparseArray) {
        String str;
        String str2;
        String str3;
        bof bofVar;
        boh bohVar;
        bob bobVar;
        String str4;
        if (a()) {
            Iterator it = dufVar.d.iterator();
            int i = 0;
            while (it.hasNext()) {
                i = ((dtf) it.next()).g + i;
            }
            String strA = a(dufVar);
            bpe bpeVar = (bpe) this.d.get(Integer.valueOf(strA.hashCode()));
            long j = dufVar.e;
            bpeVar.c = i + bpeVar.c;
            bpeVar.d++;
            bpeVar.a = Math.min(bpeVar.a, j);
            bpeVar.b = Math.max(bpeVar.b, j);
            LruCache lruCache = this.d;
            if (bpeVar.c >= this.b || bpeVar.d >= this.c) {
                long j2 = (bpeVar.b - bpeVar.a) / 1000;
                Object[] objArr = new Object[5];
                objArr[0] = strA;
                objArr[1] = Integer.valueOf(bpeVar.c);
                objArr[2] = Integer.valueOf(bpeVar.d);
                objArr[3] = Long.valueOf(j2);
                long jA = this.a.a();
                StringBuilder sb = new StringBuilder();
                long j3 = (jA - dufVar.e) / 1000;
                Object[] objArr2 = new Object[3];
                objArr2[0] = a(dufVar);
                dtf dtfVarB = b(dufVar);
                if (dtfVarB == null) {
                    str3 = "<no root>";
                } else {
                    dtn dtnVar = (dtn) sparseArray.get(dtfVarB.c);
                    if (dtnVar == null) {
                        str3 = "<no context>";
                    } else {
                        dtl dtlVarA = dtn.a(duq.a, dtnVar, duo.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
                        String str5 = null;
                        if (!dtlVarA.b()) {
                            str = null;
                            str2 = null;
                        } else {
                            gpr gprVar = (gpr) dtlVarA.a();
                            if (gprVar.b == null) {
                                bofVar = bof.f;
                            } else {
                                bofVar = gprVar.b;
                            }
                            if (bofVar == null) {
                                str = null;
                                str2 = null;
                            } else {
                                if ((bofVar.a & 1) == 1) {
                                    if (bofVar.b == null) {
                                        bobVar = bob.g;
                                    } else {
                                        bobVar = bofVar.b;
                                    }
                                    if ((bobVar.a & 1) == 1) {
                                        str4 = bobVar.b;
                                    } else {
                                        str4 = null;
                                    }
                                    str5 = str4;
                                }
                                if (bofVar.d == null) {
                                    bohVar = boh.d;
                                } else {
                                    bohVar = bofVar.d;
                                }
                                if ((bohVar.a & 1) != 1) {
                                    str = null;
                                    str2 = str5;
                                } else {
                                    str = bohVar.b;
                                    str2 = str5;
                                }
                            }
                        }
                        str3 = String.format("module=%s, caller=%s", str, str2);
                    }
                }
                objArr2[1] = str3;
                objArr2[2] = Long.valueOf(j3);
                sb.append(String.format("%s, %s, age: %ds, spans:", objArr2));
                for (dtf dtfVar : dufVar.d) {
                    int i2 = dtfVar.g;
                    int i3 = (int) dtfVar.f;
                    if (i2 >= 3 || i3 >= 3) {
                        sb.append(String.format(" (%s: %dms CPU, %dms real)", dtfVar.b, Integer.valueOf(i2), Integer.valueOf(i3)));
                    }
                }
                objArr[4] = sb.toString();
                Log.e("GmsTraceAlert", String.format("%s used %dms CPU over %d traces spanning %ds. Recent sample: %s", objArr));
                lruCache.remove(Integer.valueOf(strA.hashCode()));
            }
        }
    }

    private final String a(duf dufVar) {
        dtf dtfVarB = b(dufVar);
        return dtfVarB == null ? "UNKNOWN" : dtfVarB.b;
    }

    private static dtf b(duf dufVar) {
        for (dtf dtfVar : dufVar.d) {
            if (dtfVar.d == -1) {
                return dtfVar;
            }
        }
        return null;
    }
}
