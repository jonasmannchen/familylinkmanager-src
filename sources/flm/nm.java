package flm;

import android.os.Bundle;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nm extends as implements oq {
    public final int g;
    public final Bundle h;
    public final op i;
    public nn j;
    private af k;
    private op l;

    public nm(int i, Bundle bundle, op opVar, op opVar2) {
        this.g = i;
        this.h = bundle;
        this.i = opVar;
        this.l = opVar2;
        op opVar3 = this.i;
        if (opVar3.d != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        opVar3.d = this;
        opVar3.c = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.ak
    public final void b() {
        op opVar = this.i;
        opVar.f = true;
        opVar.h = false;
        opVar.g = false;
        opVar.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.ak
    public final void c() {
        op opVar = this.i;
        opVar.f = false;
        opVar.f();
    }

    public final op a(af afVar, nl nlVar) {
        nn nnVar = new nn(this.i, nlVar);
        a(afVar, nnVar);
        if (this.j != null) {
            a(this.j);
        }
        this.k = afVar;
        this.j = nnVar;
        return this.i;
    }

    public final void e() {
        af afVar = this.k;
        nn nnVar = this.j;
        if (afVar != null && nnVar != null) {
            super.a((at) nnVar);
            a(afVar, nnVar);
        }
    }

    @Override // flm.ak
    public final void a(at atVar) {
        super.a(atVar);
        this.k = null;
        this.j = null;
    }

    public final op a(boolean z) {
        this.i.b();
        this.i.g = true;
        nn nnVar = this.j;
        if (nnVar != null) {
            a((at) nnVar);
            if (nnVar.b) {
                nnVar.a.b();
            }
        }
        op opVar = this.i;
        if (opVar.d == null) {
            throw new IllegalStateException("No listener register");
        }
        if (opVar.d != this) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        opVar.d = null;
        this.i.g();
        return this.l;
    }

    @Override // flm.oq
    public final void c(Object obj) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            b(obj);
        } else {
            a(obj);
        }
    }

    @Override // flm.ak
    public final void b(Object obj) {
        super.b(obj);
        if (this.l != null) {
            this.l.g();
            this.l = null;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.g);
        sb.append(" : ");
        ry.a(this.i, sb);
        sb.append("}}");
        return sb.toString();
    }
}
