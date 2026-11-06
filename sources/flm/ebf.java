package flm;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ebf implements ebq, ecf {
    private static final String a = new String();
    private final Level b;
    private final long c;
    private ebh d;
    private ebj e;
    private ecx f;
    private Object[] g;

    protected ebf(Level level, boolean z) {
        this(level, z, eck.e());
    }

    protected abstract eeh a();

    public abstract eaw b();

    public abstract ebq c();

    private ebf(Level level, boolean z, long j) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.b = (Level) eel.a(level, "level");
        this.c = j;
        if (z) {
            a(ebg.e, Boolean.TRUE);
        }
    }

    @Override // flm.ecf
    public final Level d() {
        return this.b;
    }

    @Override // flm.ecf
    public final long e() {
        return this.c;
    }

    @Override // flm.ecf
    public final String f() {
        return b().b.a();
    }

    @Override // flm.ecf
    public final ebj g() {
        if (this.e == null) {
            throw new IllegalStateException("cannot request log site information prior to postProcess()");
        }
        return this.e;
    }

    @Override // flm.ecf
    public final ecx h() {
        return this.f;
    }

    @Override // flm.ecf
    public final Object[] i() {
        if (this.f == null) {
            throw new IllegalStateException("cannot get arguments unless a template context exists");
        }
        return this.g;
    }

    @Override // flm.ecf
    public final Object j() {
        if (this.f != null) {
            throw new IllegalStateException("cannot get literal argument if a template context exists");
        }
        return this.g[0];
    }

    @Override // flm.ecf
    public final boolean k() {
        return this.d != null && Boolean.TRUE.equals(this.d.b(ebg.e));
    }

    @Override // flm.ecf
    public final eci l() {
        return this.d != null ? this.d : ecj.a;
    }

    protected final void a(ebs ebsVar, Object obj) {
        int iA;
        if (this.d == null) {
            this.d = new ebh();
        }
        ebh ebhVar = this.d;
        if (!ebsVar.b && (iA = ebhVar.a(ebsVar)) != -1) {
            ebhVar.a[(iA * 2) + 1] = eel.a(obj, "metadata value");
            return;
        }
        if ((ebhVar.b + 1) * 2 > ebhVar.a.length) {
            ebhVar.a = Arrays.copyOf(ebhVar.a, ebhVar.a.length * 2);
        }
        ebhVar.a[ebhVar.b * 2] = eel.a(ebsVar, "metadata key");
        ebhVar.a[(ebhVar.b * 2) + 1] = eel.a(obj, "metadata value");
        ebhVar.b++;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00eb A[LOOP:1: B:44:0x00e9->B:45:0x00eb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00dd A[SYNTHETIC] */
    private final boolean m() {
        Object ebiVar;
        ebt ebtVar;
        boolean z;
        ebs ebsVar;
        ebh ebhVar;
        int iA;
        int i;
        int i2;
        Object obj;
        if (this.e == null) {
            this.e = (ebj) eel.a(eck.a().a(ebf.class, 1), "logger backend must not return a null LogSite");
        }
        if (this.e != ebj.a) {
            ebj ebjVar = this.e;
            String str = (String) l().b(ebg.d);
            ebiVar = str != null ? new ebi(this.e, str) : ebjVar;
        } else {
            ebiVar = null;
        }
        if (this.d != null && ebiVar != null) {
            Integer num = (Integer) this.d.b(ebg.b);
            ebo eboVar = (ebo) this.d.b(ebg.c);
            ebp ebpVar = ebn.a;
            ebn ebnVar = (ebn) ebpVar.a.get(ebiVar);
            if (ebnVar == null) {
                ebn ebnVar2 = new ebn();
                ebnVar = (ebn) ebpVar.a.putIfAbsent(ebiVar, ebnVar2);
                if (ebnVar == null) {
                    ebnVar = ebnVar2;
                }
            }
            if (num != null) {
                if (!(ebnVar.b.getAndIncrement() % ((long) num.intValue()) == 0)) {
                    z = false;
                }
            }
            if (eboVar != null) {
                long j = this.c;
                ebnVar.c.get();
                throw new NoSuchMethodError();
            }
            ebtVar = (ebt) l().b(ebg.g);
            if (ebtVar != null) {
                ebsVar = ebg.g;
                if (this.d != null) {
                    i = iA * 2;
                    i2 = i + 2;
                    while (i2 < ebhVar.b * 2) {
                        obj = ebhVar.a[i2];
                        if (!obj.equals(ebsVar)) {
                            ebhVar.a[i] = obj;
                            ebhVar.a[i + 1] = ebhVar.a[i2 + 1];
                            i += 2;
                        }
                        i2 += 2;
                    }
                    ebhVar.b -= (i2 - i) >> 1;
                    while (i < i2) {
                        ebhVar.a[i] = null;
                        i++;
                    }
                }
                a(ebg.a, new ebm((Throwable) l().b(ebg.a), ebtVar, eek.b(ebf.class, new Throwable(), ebtVar.a)));
            }
            z = true;
        } else {
            ebtVar = (ebt) l().b(ebg.g);
            if (ebtVar != null) {
                ebsVar = ebg.g;
                if (this.d != null && (iA = (ebhVar = this.d).a(ebsVar)) >= 0) {
                    i = iA * 2;
                    i2 = i + 2;
                    while (i2 < ebhVar.b * 2) {
                        obj = ebhVar.a[i2];
                        if (!obj.equals(ebsVar)) {
                            ebhVar.a[i] = obj;
                            ebhVar.a[i + 1] = ebhVar.a[i2 + 1];
                            i += 2;
                        }
                        i2 += 2;
                    }
                    ebhVar.b -= (i2 - i) >> 1;
                    while (i < i2) {
                        ebhVar.a[i] = null;
                        i++;
                    }
                }
                a(ebg.a, new ebm((Throwable) l().b(ebg.a), ebtVar, eek.b(ebf.class, new Throwable(), ebtVar.a)));
            }
            z = true;
        }
        if (!z) {
            return false;
        }
        ecq ecqVarC = eck.c();
        if (!ecqVarC.b.isEmpty()) {
            a(ebg.f, ecqVarC);
        }
        return true;
    }

    private final void a(String str, Object... objArr) {
        this.g = objArr;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= objArr.length) {
                break;
            }
            if (objArr[i2] instanceof ebe) {
                objArr[i2] = ((ebe) objArr[i2]).a();
            }
            i = i2 + 1;
        }
        if (str != a) {
            this.f = new ecx(a(), str);
        }
        eaw eawVarB = b();
        eel.a(this, "data");
        try {
            eawVarB.b.a(this);
        } catch (RuntimeException e) {
            try {
                eawVarB.b.a(e, this);
            } catch (ech e2) {
                throw e2;
            } catch (RuntimeException e3) {
                PrintStream printStream = System.err;
                String strValueOf = String.valueOf(e3.getMessage());
                printStream.println(strValueOf.length() != 0 ? "logging error: ".concat(strValueOf) : new String("logging error: "));
                ehh.a(e3, System.err);
            }
        }
    }

    @Override // flm.ebq
    public final ebq a(String str, String str2, int i, String str3) {
        ebj ebjVarA = ebj.a(str, str2, i, str3);
        if (this.e == null) {
            this.e = (ebj) eel.a(ebjVarA, "log site");
        }
        return c();
    }

    @Override // flm.ebq
    public final ebq a(Throwable th) {
        if (th != null) {
            a(ebg.a, th);
        }
        return c();
    }

    @Override // flm.ebq
    public final void a(String str, Object obj) {
        if (m()) {
            a(str, obj);
        }
    }

    @Override // flm.ebq
    public final void a(String str, Object obj, Object obj2, Object obj3) {
        if (m()) {
            a(str, obj, obj2, obj3);
        }
    }
}
