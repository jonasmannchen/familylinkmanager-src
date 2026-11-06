package flm;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dou extends PhantomReference {
    public final String a;
    public dou b;
    public dou c;

    public dou(Object obj, String str, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.a = str;
    }

    public final void a(dou douVar) {
        dse.a(douVar);
        this.b = douVar;
        this.c = douVar.c;
        if (this.c != null) {
            this.c.b = this;
        }
        douVar.c = this;
    }

    public final dou a() {
        if (this.b != null) {
            this.b.c = this.c;
        }
        if (this.c != null) {
            this.c.b = this.b;
        }
        this.c = null;
        this.b = null;
        return this;
    }
}
