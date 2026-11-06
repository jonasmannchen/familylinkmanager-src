package flm;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class boo implements LifecycleSynchronizer.Callback {
    public static List a;
    public static List b;
    public static egy c;
    public Context d;
    public LifecycleSynchronizer e;
    public ExecutorService f;
    public List g;
    public List h;
    public bpf i;
    private boolean j;

    @Deprecated
    private boo() {
        this.g = dxm.g();
        this.h = dxm.g();
        this.j = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boo(Context context, LifecycleSynchronizer lifecycleSynchronizer, ExecutorService executorService) {
        this.g = dxm.g();
        this.h = dxm.g();
        this.j = false;
        this.d = context;
        this.e = lifecycleSynchronizer;
        this.f = executorService;
        this.e.registerCallback(this);
        bnz bnzVar = bnz.UNKNOWN;
        if (context instanceof boj) {
            bnz bnzVar2 = bnz.PROVIDENCE;
            this.j = ((boj) context).e[0] == 40;
            bnzVar = bnzVar2;
        }
        this.i = new bpf(context, context.getClass(), bnzVar);
    }

    public final void onServiceDestroy() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((bov) it.next()).b();
        }
        Iterator it2 = this.h.iterator();
        while (it2.hasNext()) {
            ((bou) it2.next()).a();
        }
        if (!this.j || !((fpk) fpj.a.a()).b()) {
            Iterator it3 = a.iterator();
            while (it3.hasNext()) {
                ((bov) it3.next()).b();
            }
            Iterator it4 = b.iterator();
            while (it4.hasNext()) {
                ((bou) it4.next()).a();
            }
        }
    }

    static final /* synthetic */ bob a() {
        bob bobVar = (bob) bow.a.get(Integer.valueOf(Binder.getCallingUid()));
        if (bobVar == null) {
            bhq.b();
        }
        return bobVar;
    }

    static {
        dxm dxmVarG = dxm.g();
        dxm dxmVarA = dxm.a(new bom());
        bhl bhlVarA = bgy.a(4, 10);
        a = dxmVarG;
        b = dxmVarA;
        c = bhlVarA;
    }
}
