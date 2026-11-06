package flm;

import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lb extends ms implements mk {
    public final lw a;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public String j;
    public boolean k;
    public int m;
    public CharSequence n;
    public int o;
    public CharSequence p;
    public ArrayList q;
    public ArrayList r;
    public ArrayList b = new ArrayList();
    public int l = -1;
    public boolean s = false;

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.l >= 0) {
            sb.append(" #");
            sb.append(this.l);
        }
        if (this.j != null) {
            sb.append(" ");
            sb.append(this.j);
        }
        sb.append("}");
        return sb.toString();
    }

    public lb(lw lwVar) {
        this.a = lwVar;
    }

    final void a(lc lcVar) {
        this.b.add(lcVar);
        lcVar.c = this.c;
        lcVar.d = this.d;
        lcVar.e = this.e;
        lcVar.f = this.f;
    }

    @Override // flm.ms
    public final ms a(lg lgVar, String str) {
        a(0, lgVar, str, 1);
        return this;
    }

    @Override // flm.ms
    public final ms a(int i, lg lgVar) {
        a(i, lgVar, null, 1);
        return this;
    }

    private final void a(int i, lg lgVar, String str, int i2) {
        Class<?> cls = lgVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        lgVar.t = this.a;
        if (str != null) {
            if (lgVar.B != null && !str.equals(lgVar.B)) {
                throw new IllegalStateException("Can't change tag of fragment " + lgVar + ": was " + lgVar.B + " now " + str);
            }
            lgVar.B = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + lgVar + " with tag " + str + " to container view with no id");
            }
            if (lgVar.z != 0 && lgVar.z != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + lgVar + ": was " + lgVar.z + " now " + i);
            }
            lgVar.z = i;
            lgVar.A = i;
        }
        a(new lc(1, lgVar));
    }

    @Override // flm.ms
    public final ms a(lg lgVar) {
        a(new lc(3, lgVar));
        return this;
    }

    final void a(int i) {
        if (this.i) {
            int size = this.b.size();
            for (int i2 = 0; i2 < size; i2++) {
                lc lcVar = (lc) this.b.get(i2);
                if (lcVar.b != null) {
                    lcVar.b.s += i;
                }
            }
        }
    }

    @Override // flm.ms
    public final int a() {
        return b(false);
    }

    @Override // flm.ms
    public final int b() {
        return b(true);
    }

    @Override // flm.ms
    public final void c() {
        if (this.i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        lw lwVar = this.a;
        lwVar.a(false);
        if (a(lwVar.j, lwVar.k)) {
            lwVar.b = true;
            try {
                lwVar.a(lwVar.j, lwVar.k);
                lwVar.f();
            } catch (Throwable th) {
                lwVar.f();
                throw th;
            }
        }
        lwVar.h();
        lwVar.j();
    }

    private final int b(boolean z) {
        if (this.k) {
            throw new IllegalStateException("commit already called");
        }
        this.k = true;
        if (this.i) {
            this.l = this.a.a(this);
        } else {
            this.l = -1;
        }
        this.a.a(this, z);
        return this.l;
    }

    @Override // flm.mk
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.add(this);
        arrayList2.add(false);
        if (this.i) {
            lw lwVar = this.a;
            if (lwVar.e == null) {
                lwVar.e = new ArrayList();
            }
            lwVar.e.add(this);
            return true;
        }
        return true;
    }

    final boolean b(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            lc lcVar = (lc) this.b.get(i2);
            int i3 = lcVar.b != null ? lcVar.b.A : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    final boolean a(ArrayList arrayList, int i, int i2) {
        int i3;
        if (i2 == i) {
            return false;
        }
        int size = this.b.size();
        int i4 = -1;
        int i5 = 0;
        while (i5 < size) {
            lc lcVar = (lc) this.b.get(i5);
            int i6 = lcVar.b != null ? lcVar.b.A : 0;
            if (i6 == 0 || i6 == i4) {
                i3 = i4;
            } else {
                for (int i7 = i; i7 < i2; i7++) {
                    lb lbVar = (lb) arrayList.get(i7);
                    int size2 = lbVar.b.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        lc lcVar2 = (lc) lbVar.b.get(i8);
                        if ((lcVar2.b != null ? lcVar2.b.A : 0) == i6) {
                            return true;
                        }
                    }
                }
                i3 = i6;
            }
            i5++;
            i4 = i3;
        }
        return false;
    }

    final void d() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            lc lcVar = (lc) this.b.get(i);
            lg lgVar = lcVar.b;
            if (lgVar != null) {
                lgVar.a(this.g, this.h);
            }
            switch (lcVar.a) {
                case 1:
                    lgVar.a(lcVar.c);
                    this.a.a(lgVar, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + lcVar.a);
                case 3:
                    lgVar.a(lcVar.d);
                    this.a.c(lgVar);
                    break;
                case 4:
                    lgVar.a(lcVar.d);
                    lw.d(lgVar);
                    break;
                case 5:
                    lgVar.a(lcVar.c);
                    lw.e(lgVar);
                    break;
                case 6:
                    lgVar.a(lcVar.d);
                    this.a.f(lgVar);
                    break;
                case 7:
                    lgVar.a(lcVar.c);
                    this.a.g(lgVar);
                    break;
                case 8:
                    this.a.h(lgVar);
                    break;
                case 9:
                    this.a.h(null);
                    break;
            }
            if (!this.s && lcVar.a != 1 && lgVar != null) {
                this.a.a(lgVar);
            }
        }
        if (!this.s) {
            this.a.a(this.a.f, true);
        }
    }

    final void a(boolean z) {
        for (int size = this.b.size() - 1; size >= 0; size--) {
            lc lcVar = (lc) this.b.get(size);
            lg lgVar = lcVar.b;
            if (lgVar != null) {
                lgVar.a(lw.c(this.g), this.h);
            }
            switch (lcVar.a) {
                case 1:
                    lgVar.a(lcVar.f);
                    this.a.c(lgVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + lcVar.a);
                case 3:
                    lgVar.a(lcVar.e);
                    this.a.a(lgVar, false);
                    break;
                case 4:
                    lgVar.a(lcVar.e);
                    lw.e(lgVar);
                    break;
                case 5:
                    lgVar.a(lcVar.f);
                    lw.d(lgVar);
                    break;
                case 6:
                    lgVar.a(lcVar.e);
                    this.a.g(lgVar);
                    break;
                case 7:
                    lgVar.a(lcVar.f);
                    this.a.f(lgVar);
                    break;
                case 8:
                    this.a.h(null);
                    break;
                case 9:
                    this.a.h(lgVar);
                    break;
            }
            if (!this.s && lcVar.a != 3 && lgVar != null) {
                this.a.a(lgVar);
            }
        }
        if (!this.s && z) {
            this.a.a(this.a.f, true);
        }
    }

    static boolean b(lc lcVar) {
        lg lgVar = lcVar.b;
        return (lgVar == null || !lgVar.m || lgVar.K == null || lgVar.D || lgVar.C || !lgVar.J()) ? false : true;
    }
}
