package flm;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class atm {
    public final asw a;
    public final aup b;
    public final Looper c;
    public final int d;
    public final atp e;
    public final awt f;
    private final Context g;
    private final ata h;
    private final aye i;

    public atm(Context context, asw aswVar, Looper looper) {
        bdi.checkNotNull(context, "Null context is not permitted.");
        bdi.checkNotNull(aswVar, "Api must not be null.");
        bdi.checkNotNull(looper, "Looper must not be null.");
        this.g = context.getApplicationContext();
        this.a = aswVar;
        this.h = null;
        this.c = looper;
        this.b = new aup(aswVar);
        this.e = new axe(this);
        this.f = awt.a(this.g);
        this.d = this.f.j.getAndIncrement();
        this.i = new auo();
    }

    public atm(Activity activity, asw aswVar, ata ataVar, atn atnVar) {
        bdi.checkNotNull(activity, "Null activity is not permitted.");
        bdi.checkNotNull(aswVar, "Api must not be null.");
        bdi.checkNotNull(atnVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.g = activity.getApplicationContext();
        this.a = aswVar;
        this.h = null;
        this.c = atnVar.c;
        this.b = aup.a(this.a, this.h);
        this.e = new axe(this);
        this.f = awt.a(this.g);
        this.d = this.f.j.getAndIncrement();
        this.i = atnVar.b;
        if (!(activity instanceof GoogleApiActivity)) {
            awt awtVar = this.f;
            aup aupVar = this.b;
            axm axmVarA = LifecycleCallback.a(new axl(activity));
            avs avsVar = (avs) axmVarA.a("ConnectionlessLifecycleHelper", avs.class);
            avsVar = avsVar == null ? new avs(axmVarA) : avsVar;
            avsVar.e = awtVar;
            bdi.checkNotNull(aupVar, "ApiKey cannot be null");
            avsVar.a.add(aupVar);
            awtVar.a(avsVar);
        }
        this.f.a(this);
    }

    public atm(Context context, asw aswVar, ata ataVar, atn atnVar) {
        bdi.checkNotNull(context, "Null context is not permitted.");
        bdi.checkNotNull(aswVar, "Api must not be null.");
        bdi.checkNotNull(atnVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.g = context.getApplicationContext();
        this.a = aswVar;
        this.h = ataVar;
        this.c = atnVar.c;
        this.b = aup.a(this.a, this.h);
        this.e = new axe(this);
        this.f = awt.a(this.g);
        this.d = this.f.j.getAndIncrement();
        this.i = atnVar.b;
        this.f.a(this);
    }

    @Deprecated
    public atm(Context context, asw aswVar, ata ataVar, aye ayeVar) {
        ato atoVar = new ato();
        bdi.checkNotNull(ayeVar, "StatusExceptionMapper must not be null.");
        atoVar.a = ayeVar;
        this(context, aswVar, ataVar, atoVar.a());
    }

    public final auv a(int i, auv auvVar) {
        auvVar.maybeMarkChain();
        awt awtVar = this.f;
        awtVar.o.sendMessage(awtVar.o.obtainMessage(4, new axu(new auk(i, auvVar), awtVar.k.get(), this)));
        return auvVar;
    }

    public final dbh a(int i, ayi ayiVar) {
        dbk dbkVar = new dbk();
        awt awtVar = this.f;
        awtVar.o.sendMessage(awtVar.o.obtainMessage(4, new axu(new aum(i, ayiVar, dbkVar, this.i), awtVar.k.get(), this)));
        return dbkVar.a;
    }

    public ate a(Looper looper, awv awvVar) {
        bba bbaVarBuild = a().build();
        asw aswVar = this.a;
        return this.a.b().buildClient(this.g, looper, bbaVarBuild, this.h, awvVar, awvVar);
    }

    private final bbb a() {
        Account accountA;
        Set setEmptySet;
        GoogleSignInAccount googleSignInAccountA;
        GoogleSignInAccount googleSignInAccountA2;
        bbb bbbVar = new bbb();
        if ((this.h instanceof atc) && (googleSignInAccountA2 = ((atc) this.h).a()) != null) {
            accountA = googleSignInAccountA2.d == null ? null : new Account(googleSignInAccountA2.d, "com.google");
        } else {
            accountA = this.h instanceof atb ? ((atb) this.h).a() : null;
        }
        bbb account = bbbVar.setAccount(accountA);
        if (!(this.h instanceof atc) || (googleSignInAccountA = ((atc) this.h).a()) == null) {
            setEmptySet = Collections.emptySet();
        } else {
            setEmptySet = googleSignInAccountA.a();
        }
        return account.addAllRequiredScopes(setEmptySet).setRealClientClassName(this.g.getClass().getName()).setRealClientPackageName(this.g.getPackageName());
    }

    public aya a(Context context, Handler handler) {
        return new aya(context, handler, a().build());
    }
}
