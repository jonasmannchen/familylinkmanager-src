package com.google.android.gms.kids.persistent;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Message;
import com.google.android.chimera.Service;
import com.google.android.gms.kids.features.timelimit.LockScreenChimeraActivity;
import com.google.android.gms.kids.features.timelimit.TimeLimitCheckingIntentOperation;
import flm.af;
import flm.bb;
import flm.biw;
import flm.bte;
import flm.btt;
import flm.btv;
import flm.bul;
import flm.bus;
import flm.byr;
import flm.byt;
import flm.cck;
import flm.ccl;
import flm.ccm;
import flm.cco;
import flm.ccp;
import flm.ccs;
import flm.cct;
import flm.ccv;
import flm.dp;
import flm.fin;
import flm.fjg;
import flm.fkq;
import flm.flp;
import flm.fra;
import flm.x;
import flm.y;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class SupervisionChimeraService extends Service implements af {
    public static final String ACTION_LOCKING = "com.google.android.gms.kids.service.ACTION_LOCKING";
    public static final String V8_OR_BELOW_CONTAINER_SERVICE_NAME = "com.google.android.gms.kids.chimera.KidsBrokerServiceProxy";
    public static final String V9_OR_ABOVE_CONTAINER_SERVICE_NAME = "com.google.android.gms.kids.SupervisionService";
    private android.app.Service a;
    private final bb b = new bb(this);
    private final cct c = new cct();
    private cco d = null;

    static Intent getServiceIntent(Context context) {
        Intent intent = new Intent().setPackage(context.getPackageName());
        if (bus.a(context) >= 10200000) {
            intent.setClassName(context, V9_OR_ABOVE_CONTAINER_SERVICE_NAME);
        } else {
            intent.setClassName(context, V8_OR_BELOW_CONTAINER_SERVICE_NAME);
        }
        return intent;
    }

    public static Intent getPersistentServiceIntent(Context context) {
        return getServiceIntent(context).setAction("com.google.android.gms.kids.service.ACTION_PERSISTENT");
    }

    public static Intent getLockingIntent(Context context, byr byrVar) {
        return getServiceIntent(context).setAction(ACTION_LOCKING).putExtra("extra_lock_screen_state", byrVar.b());
    }

    public static Intent getUnlockingIntent(Context context) {
        return getServiceIntent(context).setAction("com.google.android.gms.kids.service.ACTION_UNLOCKING");
    }

    @Override // flm.af
    public x getLifecycle() {
        return this.b.a;
    }

    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        if (biw.d()) {
            this.a = new cck(context);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate() {
        if (!bte.a((Context) this)) {
            btv.c("Persistent", "Not profile owner, stop", new Object[0]);
            return;
        }
        btv.a("Persistent", "onCreate", new Object[0]);
        this.b.a(y.ON_CREATE);
        x lifecycle = getLifecycle();
        if (this.a != null) {
            lifecycle.a((cck) this.a);
        }
        lifecycle.a(this.c);
        lifecycle.a(new ccs(this));
        lifecycle.a(new ccl(this));
        lifecycle.a(new ccv(this));
        lifecycle.a(new ccm(this));
        startService(TimeLimitCheckingIntentOperation.a("persistent"));
    }

    public IBinder onBind(Intent intent) {
        if (this.a != null) {
            return this.a.onBind(intent);
        }
        btv.d("Persistent", "Binding to SupervisionService, but no deviceAdminService present", new Object[0]);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public int onStartCommand(Intent intent, int i, int i2) {
        boolean zD;
        if (!bte.a((Context) this)) {
            btv.c("Persistent", "Not profile owner, stop", new Object[0]);
            stopSelf();
            return 2;
        }
        this.b.a(y.ON_START);
        if (intent == null || intent.getAction() == null) {
            return 1;
        }
        btv.a("Persistent", "onStartCommand:%s", intent.getAction());
        switch (intent.getAction()) {
            case "com.google.android.gms.kids.service.ACTION_PERSISTENT":
                break;
            case "com.google.android.gms.kids.service.ACTION_LOCKING":
                try {
                    fin finVarA = fin.a(byr.i, intent.getByteArrayExtra("extra_lock_screen_state"));
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
                    byr byrVar = (byr) finVarA;
                    if (this.d == null) {
                        this.d = new cco(this);
                    }
                    cco ccoVar = this.d;
                    btv.a("TimeLimit", "Observer:start:%s", byrVar);
                    ccoVar.b = byrVar;
                    ccoVar.c.addAll(byt.b(ccoVar.a));
                    if (fra.b()) {
                        ccoVar.c.add("com.google.android.gms");
                        ccoVar.c.add("com.google.android.apps.kids.familylinkmanager");
                    }
                    ccoVar.e = false;
                    bul.a(true);
                    if (ccoVar.d == null) {
                        btv.a("TimeLimit", "Observer:register event listener", new Object[0]);
                        ccp ccpVar = new ccp(ccoVar);
                        IntentFilter intentFilter = new IntentFilter(LockScreenChimeraActivity.ACTION_LOCK_SCREEN_ACTIVITY_RECHECK);
                        intentFilter.addAction("android.intent.action.USER_PRESENT");
                        intentFilter.addAction("android.intent.action.SCREEN_OFF");
                        intentFilter.addAction("android.intent.action.USER_BACKGROUND");
                        ccoVar.a.registerReceiver(ccpVar, intentFilter);
                        ccoVar.d = ccpVar;
                    }
                    ccoVar.b();
                    break;
                } catch (fjg e) {
                    btv.c("Persistent", e, "Failed to parse lock screen state, ignore", new Object[0]);
                    btt.a("Persistent", e, "Failed to parse lock screen state, ignore", new Object[0]);
                    break;
                }
                break;
            case "com.google.android.gms.kids.service.ACTION_UNLOCKING":
                if (this.d != null) {
                    this.d.a();
                    this.d = null;
                    break;
                }
                break;
            default:
                cct cctVar = this.c;
                Message messageObtain = Message.obtain();
                messageObtain.obj = intent;
                cctVar.a.sendMessage(messageObtain);
                break;
        }
        return 1;
    }

    public void onDestroy() {
        btv.a("Persistent", "onDestroy", new Object[0]);
        bb bbVar = this.b;
        bbVar.a(y.ON_STOP);
        bbVar.a(y.ON_DESTROY);
        if (this.d != null) {
            this.d.a();
            this.d = null;
        }
    }
}
