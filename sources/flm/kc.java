package flm;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class kc extends jq {
    public int s;
    public ArrayList q = new ArrayList();
    public boolean r = true;
    public boolean t = false;
    private int u = 0;

    public final kc a(jq jqVar) {
        this.q.add(jqVar);
        jqVar.h = this;
        if (this.b >= 0) {
            jqVar.a(this.b);
        }
        if ((this.u & 1) != 0) {
            jqVar.a(this.c);
        }
        if ((this.u & 2) != 0) {
            jqVar.a(this.n);
        }
        if ((this.u & 4) != 0) {
            jqVar.a(this.p);
        }
        if ((this.u & 8) != 0) {
            jqVar.a(this.o);
        }
        return this;
    }

    public final jq a(int i) {
        if (i < 0 || i >= this.q.size()) {
            return null;
        }
        return (jq) this.q.get(i);
    }

    @Override // flm.jq
    public final void a(jn jnVar) {
        super.a(jnVar);
        this.u |= 4;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.q.size()) {
                ((jq) this.q.get(i2)).a(jnVar);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    @Override // flm.jq
    protected final void a(ViewGroup viewGroup, kh khVar, kh khVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.a;
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            jq jqVar = (jq) this.q.get(i);
            if (j > 0 && (this.r || i == 0)) {
                long j2 = jqVar.a;
                if (j2 > 0) {
                    jqVar.b(j2 + j);
                } else {
                    jqVar.b(j);
                }
            }
            jqVar.a(viewGroup, khVar, khVar2, arrayList, arrayList2);
        }
    }

    @Override // flm.jq
    protected final void c() {
        if (this.q.isEmpty()) {
            d();
            e();
            return;
        }
        ke keVar = new ke(this);
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((jq) obj).a(keVar);
        }
        this.s = this.q.size();
        if (!this.r) {
            int i2 = 1;
            while (true) {
                int i3 = i2;
                if (i3 >= this.q.size()) {
                    break;
                }
                ((jq) this.q.get(i3 - 1)).a(new kd(this, (jq) this.q.get(i3)));
                i2 = i3 + 1;
            }
            jq jqVar = (jq) this.q.get(0);
            if (jqVar != null) {
                jqVar.c();
                return;
            }
            return;
        }
        ArrayList arrayList2 = this.q;
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            ((jq) obj2).c();
        }
    }

    @Override // flm.jq
    public final void a(kg kgVar) {
        if (a(kgVar.b)) {
            ArrayList arrayList = this.q;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jq jqVar = (jq) obj;
                if (jqVar.a(kgVar.b)) {
                    jqVar.a(kgVar);
                    kgVar.c.add(jqVar);
                }
            }
        }
    }

    @Override // flm.jq
    public final void b(kg kgVar) {
        if (a(kgVar.b)) {
            ArrayList arrayList = this.q;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jq jqVar = (jq) obj;
                if (jqVar.a(kgVar.b)) {
                    jqVar.b(kgVar);
                    kgVar.c.add(jqVar);
                }
            }
        }
    }

    @Override // flm.jq
    final void c(kg kgVar) {
        super.c(kgVar);
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            ((jq) this.q.get(i)).c(kgVar);
        }
    }

    @Override // flm.jq
    public final void d(View view) {
        super.d(view);
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            ((jq) this.q.get(i)).d(view);
        }
    }

    @Override // flm.jq
    public final void e(View view) {
        super.e(view);
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            ((jq) this.q.get(i)).e(view);
        }
    }

    @Override // flm.jq
    public final void a(kb kbVar) {
        super.a(kbVar);
        this.u |= 2;
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            ((jq) this.q.get(i)).a(kbVar);
        }
    }

    @Override // flm.jq
    public final void a(jv jvVar) {
        super.a(jvVar);
        this.u |= 8;
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            ((jq) this.q.get(i)).a(jvVar);
        }
    }

    @Override // flm.jq
    final String a(String str) {
        String strA = super.a(str);
        int i = 0;
        while (i < this.q.size()) {
            String str2 = strA + "\n" + ((jq) this.q.get(i)).a(str + "  ");
            i++;
            strA = str2;
        }
        return strA;
    }

    @Override // flm.jq
    /* JADX INFO: renamed from: f */
    public final jq clone() {
        kc kcVar = (kc) super.clone();
        kcVar.q = new ArrayList();
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            kcVar.a((jq) ((jq) this.q.get(i)).clone());
        }
        return kcVar;
    }

    @Override // flm.jq
    public final /* synthetic */ jq b(jw jwVar) {
        return (kc) super.b(jwVar);
    }

    @Override // flm.jq
    public final /* synthetic */ jq a(jw jwVar) {
        return (kc) super.a(jwVar);
    }

    @Override // flm.jq
    public final /* synthetic */ jq c(View view) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.q.size()) {
                ((jq) this.q.get(i2)).c(view);
                i = i2 + 1;
            } else {
                return (kc) super.c(view);
            }
        }
    }

    @Override // flm.jq
    public final /* synthetic */ jq b(View view) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.q.size()) {
                ((jq) this.q.get(i2)).b(view);
                i = i2 + 1;
            } else {
                return (kc) super.b(view);
            }
        }
    }

    @Override // flm.jq
    public final /* synthetic */ jq a(TimeInterpolator timeInterpolator) {
        this.u |= 1;
        if (this.q != null) {
            int size = this.q.size();
            for (int i = 0; i < size; i++) {
                ((jq) this.q.get(i)).a(timeInterpolator);
            }
        }
        return (kc) super.a(timeInterpolator);
    }

    @Override // flm.jq
    public final /* synthetic */ jq b(long j) {
        return (kc) super.b(j);
    }

    @Override // flm.jq
    public final /* synthetic */ jq a(long j) {
        super.a(j);
        if (this.b >= 0) {
            int size = this.q.size();
            for (int i = 0; i < size; i++) {
                ((jq) this.q.get(i)).a(j);
            }
        }
        return this;
    }

    @Override // flm.jq
    public /* synthetic */ Object clone() {
        return clone();
    }
}
