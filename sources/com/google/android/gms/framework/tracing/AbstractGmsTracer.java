package com.google.android.gms.framework.tracing;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimera.config.ModuleManager;
import flm.bie;
import flm.bnu;
import flm.bnv;
import flm.bnw;
import flm.bnx;
import flm.bny;
import flm.bnz;
import flm.bob;
import flm.bof;
import flm.bog;
import flm.boh;
import flm.boi;
import flm.bpa;
import flm.bpb;
import flm.bpj;
import flm.cqw;
import flm.dp;
import flm.dtn;
import flm.duj;
import flm.duo;
import flm.dvz;
import flm.fib;
import flm.fin;
import flm.fio;
import flm.fjg;
import flm.fkq;
import flm.flp;
import flm.fpt;
import flm.fpu;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public class AbstractGmsTracer {
    private static final AtomicBoolean a = new AtomicBoolean(true);
    private static final AtomicBoolean b = new AtomicBoolean(true);
    private static final ConcurrentMap c = new ConcurrentHashMap(10);
    private static boolean d = true;
    private final ClassLoader e;
    private final bnz f;
    private final int g;
    private final String h;
    private final String i;

    AbstractGmsTracer(ClassLoader classLoader, bnz bnzVar, Context context, String str) {
        this.e = classLoader;
        this.f = bnzVar;
        if (bie.a) {
            ModuleManager.BasicModuleInfo basicModuleInfo = ModuleManager.getBasicModuleInfo(context);
            if ((d || basicModuleInfo != null) && basicModuleInfo.moduleId != null) {
                this.h = bie.a(basicModuleInfo.moduleId);
                this.g = basicModuleInfo.moduleVersion;
            } else {
                this.h = "unknown";
                this.g = -1;
            }
        } else {
            this.h = "unknown";
            this.g = -1;
        }
        this.i = str == null ? "" : a(str);
    }

    AbstractGmsTracer(ClassLoader classLoader, bnz bnzVar, String str, String str2) {
        this.e = classLoader;
        this.f = bnzVar;
        this.h = str;
        this.g = -1;
        this.i = a(str2);
    }

    public AbstractGmsTracer(ClassLoader classLoader, bnz bnzVar, Context context) {
        this(classLoader, bnzVar, context, (String) null);
    }

    final StringBuilder a(int i) {
        return new StringBuilder(this.i.length() + i).append(this.i);
    }

    public final cqw a(String str, dvz dvzVar) {
        int i;
        bof bofVar;
        bob bobVar;
        final Closeable closeableA;
        if (((fpu) fpt.a.a()).r()) {
            bog bogVar = (bog) ((fio) bof.f.a(dp.au, (Object) null));
            bny bnyVar = (bny) ((fio) bnx.d.a(dp.au, (Object) null));
            bnyVar.c();
            bnx bnxVar = (bnx) bnyVar.a;
            if (str == null) {
                throw new NullPointerException();
            }
            bnxVar.a |= 2;
            bnxVar.c = str;
            bnz bnzVar = this.f;
            bnyVar.c();
            bnx bnxVar2 = (bnx) bnyVar.a;
            if (bnzVar == null) {
                throw new NullPointerException();
            }
            bnxVar2.a |= 1;
            bnxVar2.b = bnzVar.f;
            bogVar.c();
            bof bofVar2 = (bof) bogVar.a;
            bofVar2.c = (bnx) ((fin) bnyVar.h());
            bofVar2.a |= 2;
            if (!TextUtils.isEmpty(this.h)) {
                boi boiVar = (boi) ((fio) boh.d.a(dp.au, (Object) null));
                String str2 = this.h;
                boiVar.c();
                boh bohVar = (boh) boiVar.a;
                if (str2 == null) {
                    throw new NullPointerException();
                }
                bohVar.a |= 1;
                bohVar.b = str2;
                if (this.g != -1) {
                    int i2 = this.g;
                    boiVar.c();
                    boh bohVar2 = (boh) boiVar.a;
                    bohVar2.a |= 2;
                    bohVar2.c = i2;
                }
                bogVar.c();
                bof bofVar3 = (bof) bogVar.a;
                bofVar3.d = (boh) ((fin) boiVar.h());
                bofVar3.a |= 4;
            }
            if (dvzVar != null && !duj.c(duo.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS) && (bobVar = (bob) dvzVar.a()) != null) {
                bogVar.c();
                bof bofVar4 = (bof) bogVar.a;
                if (bobVar == null) {
                    throw new NullPointerException();
                }
                bofVar4.b = bobVar;
                bofVar4.a |= 1;
            }
            bpa bpaVar = bpb.a;
            if (!bpaVar.a || bpaVar.b == null || bpaVar.c == null || bpaVar.d == null) {
                i = bnw.STATE_UNINITIALIZED.g;
            } else {
                i = (bpaVar.e ? bnw.STATE_DEVICE_IDLE_MODE.g : 0) + (bpaVar.c.booleanValue() ? bnw.STATE_INTERACTIVE.g : 0) + (bpaVar.b.booleanValue() ? bnw.STATE_POWER_CONNECTED.g : 0) + (bpaVar.d.booleanValue() ? bnw.STATE_BATTERY_LOW.g : 0) + (bpaVar.f ? bnw.STATE_POWER_SAVE_MODE.g : 0);
            }
            if (i != bnw.STATE_UNINITIALIZED.g) {
                bnv bnvVar = (bnv) ((fio) bnu.c.a(dp.au, (Object) null));
                bnvVar.c();
                bnu bnuVar = (bnu) bnvVar.a;
                bnuVar.a |= 1;
                bnuVar.b = i;
                bogVar.c();
                bof bofVar5 = (bof) bogVar.a;
                bofVar5.e = (bnu) ((fin) bnvVar.h());
                bofVar5.a |= 8;
            }
            bofVar = (bof) ((fin) bogVar.h());
        } else {
            bofVar = null;
        }
        if (this.e == AbstractGmsTracer.class.getClassLoader()) {
            closeableA = a(str, bofVar);
        } else {
            Method methodA = a(this.e);
            if (methodA != null) {
                try {
                    Object[] objArr = new Object[2];
                    objArr[0] = str;
                    objArr[1] = bofVar == null ? null : bofVar.b();
                    closeableA = (Closeable) methodA.invoke(null, objArr);
                } catch (IllegalAccessException e) {
                    b(e);
                    closeableA = null;
                } catch (InvocationTargetException e2) {
                    b(e2);
                    closeableA = null;
                }
            } else {
                closeableA = null;
            }
        }
        if (closeableA == null) {
            return null;
        }
        return new cqw(closeableA) { // from class: flm.box
            private final Closeable a;

            {
                this.a = closeableA;
            }

            @Override // flm.cqw, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                this.a.close();
            }
        };
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @UsedByReflection
    static Closeable beginTraceInternalUsingReflection(String str, byte[] bArr) {
        bof bofVar;
        boolean zD;
        if (bArr != null) {
            try {
                fin finVarA = fin.a(bof.f, bArr, fib.b());
                if (finVarA != null) {
                    boolean zBooleanValue = Boolean.TRUE.booleanValue();
                    byte bByteValue = ((Byte) finVarA.a(dp.aq, (Object) null)).byteValue();
                    if (bByteValue == 1) {
                        zD = true;
                    } else if (bByteValue == 0) {
                        zD = false;
                    } else {
                        zD = fkq.a.a(finVarA).d(finVarA);
                        if (zBooleanValue) {
                            finVarA.a(dp.ar, zD ? finVarA : null);
                        }
                    }
                    if (!zD) {
                        fjg fjgVarA = new flp().a();
                        if (fjgVarA == null) {
                            throw null;
                        }
                        throw fjgVarA;
                    }
                }
                bofVar = (bof) finVarA;
            } catch (fjg e) {
                Log.e("AbstractGmsTracer", "Invalid GCoreClientInfo bytes.");
                bofVar = null;
            }
        } else {
            bofVar = null;
        }
        return a(str, bofVar);
    }

    private static Method a(ClassLoader classLoader) {
        Class<?> cls;
        Method declaredMethod = (Method) c.get(classLoader);
        if (declaredMethod == null) {
            try {
                try {
                    cls = Class.forName(AbstractGmsTracer.class.getCanonicalName(), true, classLoader);
                } catch (NoSuchMethodException e) {
                    a(e);
                    return declaredMethod;
                }
            } catch (ClassNotFoundException e2) {
                try {
                    cls = Class.forName(GmsTracer.class.getCanonicalName(), true, classLoader);
                } catch (ClassNotFoundException e3) {
                    a(e3);
                    return declaredMethod;
                }
            }
            declaredMethod = cls.getDeclaredMethod("beginTraceInternalUsingReflection", String.class, byte[].class);
            declaredMethod.setAccessible(true);
            c.put(classLoader, declaredMethod);
            return declaredMethod;
        }
        return declaredMethod;
    }

    private static void a(Exception exc) {
        if (a.getAndSet(false)) {
            String strValueOf = String.valueOf(exc.getMessage());
            if (strValueOf.length() != 0) {
                "Reflection failed: ".concat(strValueOf);
            } else {
                new String("Reflection failed: ");
            }
        }
    }

    private static void b(Exception exc) {
        if (b.getAndSet(false)) {
            String strValueOf = String.valueOf(exc.getMessage());
            Log.e("AbstractGmsTracer", strValueOf.length() != 0 ? "Reflection failed: ".concat(strValueOf) : new String("Reflection failed: "));
            throw new RuntimeException(exc);
        }
    }

    private static Closeable a(String str, bof bofVar) {
        dtn dtnVarA = bpj.a(bofVar);
        if (duj.c(duo.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS)) {
            return duj.a(str, duo.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS, dtnVarA);
        }
        return bpj.b.a(str, dtnVarA, duo.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
    }

    private final String a(String str) {
        StringBuilder sb = new StringBuilder(this.h.length() + str.length() + 2);
        sb.append(this.h);
        sb.append('-');
        sb.append(str);
        sb.append('_');
        return sb.toString();
    }
}
