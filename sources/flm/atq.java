package flm;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class atq {
    public Account a;
    private String d;
    private String e;
    private final Context h;
    private Looper k;
    private final Set b = new HashSet();
    private final Set c = new HashSet();
    private final Map f = new rt();
    private boolean g = false;
    private final Map i = new rt();
    private int j = -1;
    private aqd l = aqd.a;
    private asx m = czl.a;
    private final ArrayList n = new ArrayList();
    private final ArrayList o = new ArrayList();
    private boolean p = false;

    public atq(Context context) {
        this.h = context;
        this.k = context.getMainLooper();
        this.d = context.getPackageName();
        this.e = context.getClass().getName();
    }

    public final atq a(asw aswVar) {
        bdi.checkNotNull(aswVar, "Api must not be null");
        this.i.put(aswVar, null);
        List impliedScopes = aswVar.a().getImpliedScopes(null);
        this.c.addAll(impliedScopes);
        this.b.addAll(impliedScopes);
        return this;
    }

    public final bba a() {
        czq czqVar = czq.a;
        if (this.i.containsKey(czl.b)) {
            czqVar = (czq) this.i.get(czl.b);
        }
        return new bba(this.a, this.b, this.f, 0, null, this.d, this.e, czqVar, false);
    }

    public final atp b() {
        boolean z;
        bdi.checkArgument(!this.i.isEmpty(), "must call addApi() to add at least one API");
        bba bbaVarA = a();
        asw aswVar = null;
        Map optionalApiSettings = bbaVarA.getOptionalApiSettings();
        rt rtVar = new rt();
        rt rtVar2 = new rt();
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (asw aswVar2 : this.i.keySet()) {
            Object obj = this.i.get(aswVar2);
            boolean z3 = optionalApiSettings.get(aswVar2) != null;
            rtVar.put(aswVar2, Boolean.valueOf(z3));
            avg avgVar = new avg(aswVar2, z3);
            arrayList.add(avgVar);
            asx asxVarB = aswVar2.b();
            ate ateVarBuildClient = asxVarB.buildClient(this.h, this.k, bbaVarA, obj, avgVar, avgVar);
            rtVar2.put(aswVar2.c(), ateVarBuildClient);
            if (asxVarB.getPriority() == 1) {
                z = obj != null;
            } else {
                z = z2;
            }
            if (!ateVarBuildClient.providesSignIn()) {
                aswVar2 = aswVar;
            } else if (aswVar != null) {
                String str = aswVar2.a;
                String str2 = aswVar.a;
                throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length()).append(str).append(" cannot be used with ").append(str2).toString());
            }
            z2 = z;
            aswVar = aswVar2;
        }
        if (aswVar != null) {
            if (z2) {
                String str3 = aswVar.a;
                throw new IllegalStateException(new StringBuilder(String.valueOf(str3).length() + 82).append("With using ").append(str3).append(", GamesOptions can only be specified within GoogleSignInOptions.Builder").toString());
            }
            bdi.checkState(this.a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", aswVar.a);
            bdi.checkState(this.b.equals(this.c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", aswVar.a);
        }
        awk awkVar = new awk(this.h, new ReentrantLock(), this.k, bbaVarA, this.l, this.m, rtVar, this.n, this.o, rtVar2, this.j, awk.a((Iterable) rtVar2.values(), true), arrayList, false);
        synchronized (atp.a) {
            atp.a.add(awkVar);
        }
        if (this.j >= 0) {
            axm axmVarA = auq.a((axl) null);
            auq auqVar = (auq) axmVarA.a("AutoManageHelper", auq.class);
            auq auqVar2 = auqVar != null ? auqVar : new auq(axmVarA);
            int i = this.j;
            bdi.checkNotNull(awkVar, "GoogleApiClient instance cannot be null");
            bdi.checkState(auqVar2.a.indexOfKey(i) < 0, new StringBuilder(54).append("Already managing a GoogleApiClient with id ").append(i).toString());
            auy auyVar = (auy) auqVar2.c.get();
            boolean z4 = auqVar2.b;
            String strValueOf = String.valueOf(auyVar);
            new StringBuilder(String.valueOf(strValueOf).length() + 49).append("starting AutoManage for client ").append(i).append(" ").append(z4).append(" ").append(strValueOf);
            auqVar2.a.put(i, new aur(auqVar2, i, awkVar, null));
            if (auqVar2.b && auyVar == null) {
                String strValueOf2 = String.valueOf(awkVar);
                new StringBuilder(String.valueOf(strValueOf2).length() + 11).append("connecting ").append(strValueOf2);
                awkVar.b();
            }
        }
        return awkVar;
    }
}
