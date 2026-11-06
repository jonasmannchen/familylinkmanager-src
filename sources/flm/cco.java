package flm;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.AudioPlaybackConfiguration;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import com.google.android.gms.kids.features.timelimit.LockScreenChimeraActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cco implements ae {
    public final Context a;
    public byr b;
    public Set c;
    public ccp d;
    public boolean e;
    private final ScheduledExecutorService f;
    private ScheduledFuture g;
    private ScheduledFuture h;
    private ccq i;
    private enc j;
    private long k;

    public cco(Context context) {
        this(context, bur.a);
    }

    private cco(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = byr.i;
        this.c = new HashSet();
        this.d = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.a = context;
        this.f = scheduledExecutorService;
    }

    public final void a() {
        btv.a("TimeLimit", "Observer:stop", new Object[0]);
        a(SystemClock.elapsedRealtime());
        if (this.d != null) {
            btv.a("TimeLimit", "Observer:unregister event listener", new Object[0]);
            this.a.unregisterReceiver(this.d);
        }
        c();
        bul.a(false);
        this.e = false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final synchronized void b() {
        boolean zA;
        synchronized (this) {
            btv.a("TimeLimit", "Observer:check foreground activity", new Object[0]);
            PowerManager powerManager = (PowerManager) this.a.getSystemService("power");
            KeyguardManager keyguardManager = (KeyguardManager) this.a.getSystemService("keyguard");
            boolean zA2 = bis.a(this.a).a();
            boolean zIsInteractive = ((PowerManager) dvl.a(powerManager)).isInteractive();
            boolean z = !((KeyguardManager) dvl.a(keyguardManager)).isKeyguardLocked();
            Context context = this.a;
            if (biw.d()) {
                Iterator<AudioPlaybackConfiguration> it = ((AudioManager) dvl.a((AudioManager) context.getSystemService(AudioManager.class))).getActivePlaybackConfigurations().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().getAudioAttributes().getUsage() == 4) {
                            zA = true;
                            break;
                        }
                    } else {
                        zA = false;
                        break;
                    }
                }
            } else {
                zA = bsx.a("TimeLimit");
            }
            HashSet hashSet = new HashSet(this.b.h);
            if (this.e) {
                hashSet.addAll(this.c);
            }
            btv.a("TimeLimit", "whitelisted packages: %s", dyk.a(hashSet));
            Set setA = bsw.a();
            boolean zIsEmpty = setA.isEmpty();
            Collection hashSet2 = new HashSet(setA);
            hashSet2.retainAll(hashSet);
            end endVar = (end) ((fio) enc.g.a(dp.au, (Object) null));
            boolean z2 = !zA2;
            endVar.c();
            enc encVar = (enc) endVar.a;
            encVar.a |= 1;
            encVar.b = z2;
            boolean z3 = !zIsInteractive;
            endVar.c();
            enc encVar2 = (enc) endVar.a;
            encVar2.a |= 2;
            encVar2.c = z3;
            boolean z4 = z ? false : true;
            endVar.c();
            enc encVar3 = (enc) endVar.a;
            encVar3.a |= 4;
            encVar3.d = z4;
            endVar.c();
            enc encVar4 = (enc) endVar.a;
            encVar4.a |= 16;
            encVar4.e = zA;
            endVar.c();
            enc encVar5 = (enc) endVar.a;
            if (!encVar5.f.a()) {
                encVar5.f = fin.a(encVar5.f);
            }
            List list = encVar5.f;
            fiv.a(hashSet2);
            if (hashSet2 instanceof fjo) {
                List listD = ((fjo) hashSet2).d();
                fjo fjoVar = (fjo) list;
                int size = list.size();
                for (Object obj : listD) {
                    if (obj == null) {
                        String string = new StringBuilder(37).append("Element at index ").append(fjoVar.size() - size).append(" is null.").toString();
                        for (int size2 = fjoVar.size() - 1; size2 >= size; size2--) {
                            fjoVar.remove(size2);
                        }
                        throw new NullPointerException(string);
                    }
                    if (obj instanceof fgy) {
                        fjoVar.a((fgy) obj);
                    } else {
                        fjoVar.add((String) obj);
                    }
                }
            } else if (hashSet2 instanceof fkp) {
                list.addAll(hashSet2);
            } else {
                if ((list instanceof ArrayList) && (hashSet2 instanceof Collection)) {
                    ((ArrayList) list).ensureCapacity(hashSet2.size() + list.size());
                }
                int size3 = list.size();
                for (Object obj2 : hashSet2) {
                    if (obj2 == null) {
                        String string2 = new StringBuilder(37).append("Element at index ").append(list.size() - size3).append(" is null.").toString();
                        for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                            list.remove(size4);
                        }
                        throw new NullPointerException(string2);
                    }
                    list.add(obj2);
                }
            }
            enc encVar6 = (enc) ((fin) endVar.h());
            btv.a("TimeLimit", "Lock screen determination: %s", encVar6.toString());
            if (!encVar6.equals(this.j)) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                a(jElapsedRealtime);
                btv.b("TimeLimit", "New determination: %s", encVar6.toString());
                this.j = encVar6;
                this.k = jElapsedRealtime;
            }
            if (zA2 && zIsInteractive && z) {
                if (zIsEmpty) {
                    if (biw.d() && (this.h == null || this.h.isDone())) {
                        this.h = this.f.schedule(new ccr(this), 2L, TimeUnit.SECONDS);
                    }
                } else if (!zA && hashSet2.isEmpty()) {
                    btv.a("TimeLimit", "Observer:start activity", new Object[0]);
                    Intent intent = LockScreenChimeraActivity.getIntent(this.a, this.b);
                    try {
                        try {
                            this.a.startActivity(intent);
                            this.e = true;
                        } catch (SecurityException e) {
                            btt.a("TimeLimit", e, "Starting lock screen faild", new Object[0]);
                            intent.setComponent(LockScreenChimeraActivity.getActivityComponentName(this.a));
                            try {
                                this.a.startActivity(intent);
                                this.e = true;
                            } catch (SecurityException e2) {
                                btt.a("TimeLimit", e, "Still failing to start lock screen.", new Object[0]);
                            }
                        }
                    } catch (ActivityNotFoundException e3) {
                        btv.b("TimeLimit", e3, "LockScreen Activity not available", new Object[0]);
                    }
                }
                btv.a("TimeLimit", "Observer: device in use", new Object[0]);
                if (!biw.e()) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        d();
                    } else {
                        if (this.h != null) {
                            this.h.cancel(false);
                            this.h = null;
                        }
                        if (this.g == null) {
                            btv.a("TimeLimit", "Observer:startPulling", new Object[0]);
                            this.g = this.f.scheduleAtFixedRate(new ccr(this), 2L, 2L, TimeUnit.SECONDS);
                        }
                    }
                }
            } else {
                btv.a("TimeLimit", "Observer: device not in use", new Object[0]);
                c();
            }
        }
    }

    private final void a(long j) {
        if (this.j != null) {
            enb enbVar = (enb) ((fio) ena.e.a(dp.au, (Object) null));
            enc encVar = this.j;
            enbVar.c();
            ena enaVar = (ena) enbVar.a;
            if (encVar == null) {
                throw new NullPointerException();
            }
            enaVar.b = encVar;
            enaVar.a |= 1;
            long j2 = this.k;
            enbVar.c();
            ena enaVar2 = (ena) enbVar.a;
            enaVar2.a |= 2;
            enaVar2.c = j2;
            long j3 = j - this.k;
            enbVar.c();
            ena enaVar3 = (ena) enbVar.a;
            enaVar3.a |= 4;
            enaVar3.d = j3;
            btt.a((ena) ((fin) enbVar.h()));
        }
        this.j = null;
    }

    private final void c() {
        if (!biw.e()) {
            if (this.i != null) {
                btv.a("TimeLimit", "Observer:stopObserve", new Object[0]);
                bui.a("TimeLimit", "android.permission.PACKAGE_USAGE_STATS");
                try {
                    ((ActivityManager) dvl.a((ActivityManager) this.a.getSystemService("activity"))).removeOnUidImportanceListener(this.i);
                    this.i = null;
                } catch (Exception e) {
                    btv.c("TimeLimit", e, "Failed to remove foreground listener", new Object[0]);
                    btt.a("TimeLimit", e, "Failed to remove foreground listener", new Object[0]);
                }
            }
            if (this.h != null) {
                this.h.cancel(false);
                this.h = null;
            }
            if (this.g != null) {
                this.g.cancel(false);
                this.g = null;
                btv.a("TimeLimit", "Observer:stopPulling", new Object[0]);
            }
        }
    }

    @TargetApi(26)
    private final void d() {
        if (this.i == null) {
            btv.a("TimeLimit", "Observer:startObserve", new Object[0]);
            bui.a("TimeLimit", "android.permission.PACKAGE_USAGE_STATS");
            ActivityManager activityManager = (ActivityManager) this.a.getSystemService("activity");
            try {
                ccq ccqVar = new ccq(this);
                ((ActivityManager) dvl.a(activityManager)).addOnUidImportanceListener(ccqVar, 100);
                this.i = ccqVar;
            } catch (Exception e) {
                btv.c("TimeLimit", e, "Failed to register foreground listener", new Object[0]);
                btt.a("TimeLimit", e, "Failed to register foreground listener", new Object[0]);
            }
        }
    }
}
