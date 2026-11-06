package flm;

import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ag extends x {
    private final WeakReference c;
    private f a = new f();
    private int d = 0;
    private boolean e = false;
    private boolean f = false;
    private ArrayList g = new ArrayList();
    private z b = z.INITIALIZED;

    public ag(af afVar) {
        this.c = new WeakReference(afVar);
    }

    public final void a(y yVar) {
        a(b(yVar));
    }

    public final void a(z zVar) {
        if (this.b != zVar) {
            this.b = zVar;
            if (this.e || this.d != 0) {
                this.f = true;
                return;
            }
            this.e = true;
            c();
            this.e = false;
        }
    }

    private final z c(ae aeVar) {
        f fVar = this.a;
        j jVar = fVar.c(aeVar) ? ((j) fVar.a.get(aeVar)).d : null;
        return a(a(this.b, jVar != null ? ((ah) jVar.getValue()).a : null), !this.g.isEmpty() ? (z) this.g.get(this.g.size() - 1) : null);
    }

    @Override // flm.x
    public final void a(ae aeVar) {
        af afVar;
        ah ahVar = new ah(aeVar, this.b == z.DESTROYED ? z.DESTROYED : z.INITIALIZED);
        if (((ah) this.a.a(aeVar, ahVar)) == null && (afVar = (af) this.c.get()) != null) {
            boolean z = this.d != 0 || this.e;
            z zVarC = c(aeVar);
            this.d++;
            while (ahVar.a.compareTo(zVarC) < 0 && this.a.c(aeVar)) {
                b(ahVar.a);
                ahVar.a(afVar, c(ahVar.a));
                b();
                zVarC = c(aeVar);
            }
            if (!z) {
                c();
            }
            this.d--;
        }
    }

    private final void b() {
        this.g.remove(this.g.size() - 1);
    }

    private final void b(z zVar) {
        this.g.add(zVar);
    }

    @Override // flm.x
    public final void b(ae aeVar) {
        this.a.b(aeVar);
    }

    @Override // flm.x
    public final z a() {
        return this.b;
    }

    static z b(y yVar) {
        switch (yVar.ordinal()) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
            case 4:
                return z.CREATED;
            case 1:
            case 3:
                return z.STARTED;
            case 2:
                return z.RESUMED;
            case 5:
                return z.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + yVar);
        }
    }

    private static y c(z zVar) {
        switch (zVar.ordinal()) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
            case 1:
                return y.ON_CREATE;
            case 2:
                return y.ON_START;
            case 3:
                return y.ON_RESUME;
            case 4:
                throw new IllegalArgumentException();
            default:
                throw new IllegalArgumentException("Unexpected state value " + zVar);
        }
    }

    private final void c() {
        boolean z;
        y yVar;
        af afVar = (af) this.c.get();
        if (afVar == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (true) {
            if (this.a.e == 0) {
                z = true;
            } else {
                z zVar = ((ah) this.a.b.getValue()).a;
                z zVar2 = ((ah) this.a.c.getValue()).a;
                z = zVar == zVar2 && this.b == zVar2;
            }
            if (!z) {
                this.f = false;
                if (this.b.compareTo(((ah) this.a.b.getValue()).a) < 0) {
                    f fVar = this.a;
                    i iVar = new i(fVar.c, fVar.b);
                    fVar.d.put(iVar, false);
                    while (iVar.hasNext() && !this.f) {
                        Map.Entry entry = (Map.Entry) iVar.next();
                        ah ahVar = (ah) entry.getValue();
                        while (ahVar.a.compareTo(this.b) > 0 && !this.f && this.a.c(entry.getKey())) {
                            z zVar3 = ahVar.a;
                            switch (zVar3.ordinal()) {
                                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                                    throw new IllegalArgumentException();
                                case 1:
                                    throw new IllegalArgumentException();
                                case 2:
                                    yVar = y.ON_DESTROY;
                                    break;
                                case 3:
                                    yVar = y.ON_STOP;
                                    break;
                                case 4:
                                    yVar = y.ON_PAUSE;
                                    break;
                                default:
                                    throw new IllegalArgumentException("Unexpected state value " + zVar3);
                            }
                            b(b(yVar));
                            ahVar.a(afVar, yVar);
                            b();
                        }
                    }
                }
                j jVar = this.a.c;
                if (!this.f && jVar != null && this.b.compareTo(((ah) jVar.getValue()).a) > 0) {
                    k kVarA = this.a.a();
                    while (kVarA.hasNext() && !this.f) {
                        Map.Entry entry2 = (Map.Entry) kVarA.next();
                        ah ahVar2 = (ah) entry2.getValue();
                        while (ahVar2.a.compareTo(this.b) < 0 && !this.f && this.a.c(entry2.getKey())) {
                            b(ahVar2.a);
                            ahVar2.a(afVar, c(ahVar2.a));
                            b();
                        }
                    }
                }
            } else {
                this.f = false;
                return;
            }
        }
    }

    static z a(z zVar, z zVar2) {
        return (zVar2 == null || zVar2.compareTo(zVar) >= 0) ? zVar : zVar2;
    }
}
