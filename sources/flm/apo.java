package flm;

import android.content.Context;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class apo implements aoh {
    private static final Charset a = Charset.forName("UTF-8");
    private static final drn b = new drn(czc.a("com.google.android.gms.clearcut.public")).a("gms:playlog:service:samplingrules_").b("LogSamplingRules__");
    private static final ConcurrentHashMap d = new ConcurrentHashMap();
    private static Boolean e = null;
    private static Long f = null;
    private final Context c;

    public apo(Context context) {
        this.c = context;
        if (this.c != null) {
            drf.b(this.c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00b4  */
    @Override // flm.aoh
    public final boolean a(String str, int i, int i2) {
        List<fnv> listEmptyList;
        long jLongValue;
        long jA;
        boolean z;
        long j;
        if (str == null || str.isEmpty()) {
            if (i < 0) {
                str = null;
            } else {
                str = String.valueOf(i);
            }
        }
        if (str == null) {
            return true;
        }
        if (this.c == null) {
            listEmptyList = Collections.emptyList();
        } else {
            drf drfVar = (drf) d.get(str);
            if (drfVar == null) {
                drf drfVarA = drf.a(b, str, fnt.b, app.a);
                drfVar = (drf) d.putIfAbsent(str, drfVarA);
                if (drfVar == null) {
                    drfVar = drfVarA;
                }
            }
            listEmptyList = ((fnt) drfVar.b()).a;
        }
        for (fnv fnvVar : listEmptyList) {
            if ((fnvVar.a & 1) != 1 || fnvVar.b == 0 || fnvVar.b == i2) {
                String str2 = fnvVar.c;
                Context context = this.c;
                if (f == null) {
                    if (context != null) {
                        if (e == null) {
                            e = Boolean.valueOf(bjj.a.a(context).a("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
                        }
                        if (e.booleanValue()) {
                            f = Long.valueOf(dfc.a(context.getContentResolver(), "android_id", 0L));
                        } else {
                            f = 0L;
                        }
                        jLongValue = f.longValue();
                    } else {
                        jLongValue = 0;
                    }
                } else {
                    jLongValue = f.longValue();
                }
                if (str2 == null || str2.isEmpty()) {
                    jA = api.a(ByteBuffer.allocate(8).putLong(jLongValue).array());
                } else {
                    byte[] bytes = str2.getBytes(a);
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length + 8);
                    byteBufferAllocate.put(bytes);
                    byteBufferAllocate.putLong(jLongValue);
                    jA = api.a(byteBufferAllocate.array());
                }
                long j2 = fnvVar.d;
                long j3 = fnvVar.e;
                if (j2 < 0 || j3 <= 0) {
                    z = true;
                } else {
                    if (jA >= 0) {
                        j = jA % j3;
                    } else {
                        j = (((jA & Long.MAX_VALUE) % j3) + ((Long.MAX_VALUE % j3) + 1)) % j3;
                    }
                    if (j < j2) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }
}
