package com.google.android.gms.kids.features.timelimit;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.admin.DevicePolicyManager;
import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.media.AudioManager;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimeraresources.R;
import com.google.android.gms.common.app.BaseApplicationContext;
import com.google.android.gms.kids.database.SupervisionDatabase;
import com.google.android.gms.kids.persistent.SupervisionChimeraService;
import flm.ayt;
import flm.bbz;
import flm.bel;
import flm.bfr;
import flm.bfs;
import flm.bhq;
import flm.bij;
import flm.bis;
import flm.biw;
import flm.bjd;
import flm.bsu;
import flm.bta;
import flm.btb;
import flm.bte;
import flm.btj;
import flm.btm;
import flm.btt;
import flm.btv;
import flm.btx;
import flm.buc;
import flm.bui;
import flm.bum;
import flm.bur;
import flm.bvp;
import flm.bwg;
import flm.bwj;
import flm.bws;
import flm.byr;
import flm.bys;
import flm.byt;
import flm.byv;
import flm.byx;
import flm.byy;
import flm.byz;
import flm.bza;
import flm.cav;
import flm.caw;
import flm.dp;
import flm.duj;
import flm.duw;
import flm.duz;
import flm.dvl;
import flm.dvo;
import flm.dvp;
import flm.ene;
import flm.enf;
import flm.esu;
import flm.etw;
import flm.eua;
import flm.euc;
import flm.euz;
import flm.ewr;
import flm.ews;
import flm.fco;
import flm.fdc;
import flm.fee;
import flm.feg;
import flm.feh;
import flm.fei;
import flm.fej;
import flm.few;
import flm.fey;
import flm.ffc;
import flm.ffe;
import flm.ffg;
import flm.ffi;
import flm.fgy;
import flm.fib;
import flm.fin;
import flm.fio;
import flm.fiv;
import flm.fjf;
import flm.fjo;
import flm.fkp;
import flm.fra;
import flm.frb;
import flm.oo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class TimeLimitCheckingIntentOperation extends IntentOperation {
    private static final int a = R.id.kids_time_limit_heads_up_notification_id;
    private static final long b = TimeUnit.MINUTES.toMillis(2);
    private static ScheduledFuture c = null;

    public static Intent a(String str) {
        Intent intentA = bta.a((Context) ayt.a(), TimeLimitCheckingIntentOperation.class, "com.google.android.gms.kids.features.timelimit.ACTION_CHECK");
        if (intentA != null) {
            intentA.putExtra("extra_trigger", str);
        }
        return intentA;
    }

    public static Intent a() {
        return bta.a((Context) ayt.a(), TimeLimitCheckingIntentOperation.class, "com.google.android.gms.kids.features.timelimit.ACTION_LOCAL_UNLOCK");
    }

    /* JADX WARN: Code duplicated, block: B:203:0x06bb  */
    /* JADX WARN: Multi-variable type inference failed */
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
    public final void onHandleIntent(Intent intent) {
        fee feeVar;
        eua euaVar;
        eua euaVar2;
        int i;
        String string;
        ffe ffeVar;
        long j;
        long j2;
        boolean z;
        ffe ffeVar2;
        fey feyVar;
        String str;
        int i2;
        int i3;
        fei feiVar;
        ffe ffeVar3;
        ffc ffcVar;
        ffi ffiVar;
        ffg ffgVar;
        if (intent == null) {
            btv.d("TimeLimit", "TimeLimitCheckingIntentOperation was started without an Intent", new Object[0]);
            return;
        }
        btv.c("TimeLimit", "Starting time limit check with Intent: %s, trigger = %s.", intent, intent.getStringExtra("extra_trigger"));
        bel belVarA = bel.a((Context) this);
        int iB = bum.b();
        new Object[1][0] = Integer.valueOf(iB);
        if (iB != 0) {
            try {
                if (!"com.google.android.gms.kids.features.timelimit.ACTION_LOCAL_UNLOCK".equals(intent.getAction())) {
                    if (iB == 103) {
                        belVarA.a(a);
                        a(SupervisionDatabase.h(), (byr) ((fin) ((bys) ((fio) byr.i.a(dp.au, (Object) null))).a(LockScreenChimeraActivity.ACTION_ACCOUNT_INTERCEPTOR).h()));
                        return;
                    } else {
                        if (iB == 4) {
                            if ("com.google.android.gms.kids.features.timelimit.ACTION_CHECK".equals(intent.getAction())) {
                                belVarA.a(a);
                                a(SupervisionDatabase.h(), (byr) ((fin) ((bys) ((fio) byr.i.a(dp.au, (Object) null))).a(LockScreenChimeraActivity.ACTION_MEMBER_SV_EXIT).h()));
                                return;
                            }
                            return;
                        }
                        new Object[1][0] = Integer.valueOf(iB);
                        bum.a(iB);
                        belVarA.a(a);
                        b();
                        return;
                    }
                }
            } catch (Throwable th) {
                btv.c("TimeLimit", th, "Failed to handle time limit intent, unlock", new Object[0]);
                btt.a("TimeLimit", th, "Failed to handle time limit intent, unlock", new Object[0]);
                try {
                    belVarA.a(a);
                    b();
                    return;
                } catch (Throwable th2) {
                    btv.c("TimeLimit", th2, "Failed to unlock", new Object[0]);
                    btt.a("TimeLimit", th2, "Failed to unlock", new Object[0]);
                    return;
                }
            }
        }
        SupervisionDatabase supervisionDatabaseH = SupervisionDatabase.h();
        bwg bwgVarB = supervisionDatabaseH.l().b(fdc.TYPE_TIME_LIMIT, "");
        if (bwgVarB == null) {
            b();
            bel.a((Context) this).a(a);
            return;
        }
        fco fcoVar = (fco) fin.b(fco.c, bwgVarB.f, fib.b());
        if (fcoVar.b == null) {
            feeVar = fee.f;
        } else {
            feeVar = fcoVar.b;
        }
        if ("com.google.android.gms.kids.features.timelimit.ACTION_LOCAL_UNLOCK".equals(intent.getAction())) {
            etw etwVar = byv.b(supervisionDatabaseH, feeVar).a;
            esu esuVarA = esu.a(etwVar.c);
            if (esuVarA == null) {
                esuVarA = esu.NO_ACTIVE_POLICY;
            }
            if (esuVarA != esu.NO_ACTIVE_POLICY) {
                long jB = btj.b();
                ArrayList arrayList = new ArrayList();
                if ((etwVar.a & 16384) == 16384) {
                    if (etwVar.p == null) {
                        ffiVar = ffi.i;
                    } else {
                        ffiVar = etwVar.p;
                    }
                    if (feeVar.b == null) {
                        ffgVar = ffg.f;
                    } else {
                        ffgVar = feeVar.b;
                    }
                    arrayList.add(new bws(fej.UNLOCK_WINDOW_LIMIT, jB, btx.a(ffgVar.c, Long.valueOf(ffiVar.e), Long.valueOf(ffiVar.h)), ffiVar.b));
                }
                if ((etwVar.a & 32) == 32 && etwVar.l == 0) {
                    if (etwVar.g == null) {
                        ffeVar3 = ffe.h;
                    } else {
                        ffeVar3 = etwVar.g;
                    }
                    if (feeVar.c == null) {
                        ffcVar = ffc.g;
                    } else {
                        ffcVar = feeVar.c;
                    }
                    arrayList.add(new bws(fej.UNLOCK_USAGE_LIMIT, jB, btx.a(ffcVar.c, Long.valueOf(ffeVar3.e), Long.valueOf(ffeVar3.g)), ffeVar3.b));
                }
                if (etwVar.v == null) {
                    feiVar = fei.h;
                } else {
                    feiVar = etwVar.v;
                }
                fej fejVarA = fej.a(feiVar.e);
                if (fejVarA == null) {
                    fejVarA = fej.UNSPECIFIED_ACTION;
                }
                if (fejVarA == fej.LOCK) {
                    arrayList.add(new bws(fej.UNLOCK_LOCK_OVERRIDE, jB, 0L, ""));
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    fei feiVarA = ((bws) it.next()).a();
                    feh fehVar = (feh) ((fio) feg.d.a(dp.au, (Object) null));
                    fehVar.c();
                    feg fegVar = (feg) fehVar.a;
                    if (feiVarA == null) {
                        throw new NullPointerException();
                    }
                    fegVar.c = feiVarA;
                    fegVar.b = 1;
                    feg fegVar2 = (feg) ((fin) fehVar.h());
                    ews ewsVar = (ews) ((fio) ewr.d.a(dp.au, (Object) null));
                    ewsVar.c();
                    ewr ewrVar = (ewr) ewsVar.a;
                    if (fegVar2 == null) {
                        throw new NullPointerException();
                    }
                    ewrVar.c = fegVar2;
                    ewrVar.b = 3;
                    arrayList2.add((ewr) ((fin) ewsVar.h()));
                }
                supervisionDatabaseH.p().a(arrayList);
                supervisionDatabaseH.m().a(13, jB, (ewr[]) arrayList2.toArray(new ewr[0]));
                caw.a(euz.LOCAL_UNLOCK);
            }
        }
        byx byxVarB = byv.b(supervisionDatabaseH, feeVar);
        etw etwVar2 = byxVarB.a;
        Long lValueOf = Long.valueOf(byxVarB.c);
        if (lValueOf != null && lValueOf.longValue() != Long.MAX_VALUE) {
            btv.b("TimeLimit", "Scheduling %s alarm at [%s]", "Kids:TimeReporting", new Date(lValueOf.longValue()));
            BaseApplicationContext baseApplicationContextA = ayt.a();
            PendingIntent pendingIntentA = bta.a(baseApplicationContextA, TimeLimitCheckingIntentOperation.class, a("Kids:TimeReporting"), 0, 134217728);
            bfr bfrVar = new bfr(baseApplicationContextA);
            bfrVar.a("Kids:TimeReporting", 1, lValueOf.longValue(), b, 0L, pendingIntentA, bjd.a(bfrVar.f, (String) null));
        }
        a(etwVar2.s, 0, "Kids:TimeLimitBedtime");
        if (etwVar2.s != etwVar2.d) {
            a(etwVar2.d, 1, "Kids:TimeLimitScreentime");
        }
        if (etwVar2.w == null) {
            euaVar = eua.f;
        } else {
            euaVar = etwVar2.w;
        }
        a(euaVar.e);
        boolean z2 = byxVarB.b;
        bel belVarA2 = bel.a((Context) this);
        if (etwVar2.w == null) {
            euaVar2 = eua.f;
        } else {
            euaVar2 = etwVar2.w;
        }
        if (euaVar2.b) {
            euc eucVarA = euc.a(euaVar2.c);
            euc eucVar = eucVarA == null ? euc.NO_NOTIFICATION : eucVarA;
            esu esuVarA2 = esu.a(etwVar2.f);
            esu esuVar = esuVarA2 == null ? esu.NO_ACTIVE_POLICY : esuVarA2;
            int i4 = euaVar2.d;
            if (z2) {
                str = "kids_alerts_channel";
            } else {
                str = "kids_setting_updates_channel";
            }
            switch (esuVar.ordinal()) {
                case 1:
                case 3:
                    i2 = R.string.kids_time_limit_warning_notification_title_usage_or_adhoc;
                    break;
                case 2:
                    i2 = R.string.kids_time_limit_warning_notification_title_bedtime;
                    break;
                default:
                    btv.e("TimeLimit", "Unexpected next active policy:%s", esuVar);
                    i2 = R.string.kids_time_limit_warning_notification_title_usage_or_adhoc;
                    break;
            }
            String string2 = getString(i2);
            String quantityString = getResources().getQuantityString(R.plurals.kids_time_limit_warning_notification_message, i4, Integer.valueOf(i4));
            Notification.Builder style = buc.a(this, byz.a, str).setContentTitle(string2).setContentText(quantityString).setStyle(new Notification.BigTextStyle().bigText(quantityString));
            long j3 = i4;
            int iA = btm.a(36);
            int iA2 = btm.a(64);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iA2, iA2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable.getPaint();
            if (eucVar == euc.ONE_MINUTE) {
                i3 = R.color.quantum_deeporange700;
            } else {
                i3 = R.color.quantum_lightblue700;
            }
            paint.setColor(oo.c(this, i3));
            shapeDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            shapeDrawable.draw(canvas);
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            paint2.setTextSize(iA);
            paint2.setTextAlign(Paint.Align.CENTER);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColor(oo.c(this, R.color.quantum_white_100));
            canvas.drawText(String.valueOf(j3), canvas.getWidth() / 2, (int) ((canvas.getHeight() / 2) - ((paint2.descent() + paint2.ascent()) / 2.0f)), paint2);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmapCreateBitmap);
            bitmapDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            Notification notificationBuild = style.setLargeIcon(bitmapDrawable.getBitmap()).setAutoCancel(false).setOngoing(true).build();
            int identifier = getResources().getIdentifier("right_icon", bbz.MARKET_URI_PARAM_ID, ((Package) dvl.a(android.R.class.getPackage())).getName());
            if (identifier != 0) {
                if (notificationBuild.contentView != null) {
                    notificationBuild.contentView.setViewVisibility(identifier, 4);
                }
                if (notificationBuild.bigContentView != null) {
                    notificationBuild.bigContentView.setViewVisibility(identifier, 4);
                }
            }
            belVarA2.a(a, notificationBuild);
        } else if (etwVar2.b) {
            esu esuVarA3 = esu.a(etwVar2.c);
            if (esuVarA3 == null) {
                esuVarA3 = esu.NO_ACTIVE_POLICY;
            }
            switch (esuVarA3.ordinal()) {
                case 1:
                    i = R.string.kids_time_limit_title_adhoc;
                    string = getString(R.string.kids_time_limit_desc_adhoc);
                    break;
                case 2:
                    i = R.string.kids_time_limit_title_bedtime;
                    string = getString(R.string.kids_time_limit_desc_bedtime, byt.a(etwVar2.e));
                    break;
                case 3:
                    if (etwVar2.g == null) {
                        ffeVar = ffe.h;
                    } else {
                        ffeVar = etwVar2.g;
                    }
                    if (ffeVar.f == 0) {
                        i = R.string.kids_time_limit_title_usage_locked_all_day;
                        string = getString(R.string.kids_time_limit_desc_usage_locked_all_day);
                    } else {
                        i = R.string.kids_time_limit_title_usage;
                        string = getString(R.string.kids_time_limit_desc_usage, byt.a(this, etwVar2.m));
                    }
                    break;
                default:
                    Object[] objArr = new Object[1];
                    esu esuVarA4 = esu.a(etwVar2.c);
                    if (esuVarA4 == null) {
                        esuVarA4 = esu.NO_ACTIVE_POLICY;
                    }
                    objArr[0] = esuVarA4;
                    btv.e("TimeLimit", "Unexpected next active policy:%s", objArr);
                    i = R.string.kids_time_limit_title_adhoc;
                    string = getString(R.string.kids_time_limit_desc_adhoc);
                    break;
            }
            belVarA2.a(a, buc.a(this, byz.a).setContentTitle(getString(i)).setContentText(string).setStyle(new Notification.BigTextStyle().bigText(string)).setAutoCancel(false).setOngoing(true).setPriority(2).setCategory("service").setVisibility(1).build());
        } else {
            belVarA2.a(a);
        }
        if (etwVar2.b && bis.a((Context) this).a()) {
            ArrayList arrayList3 = new ArrayList();
            if (fra.d()) {
                if (feeVar.d == null) {
                    feyVar = fey.c;
                } else {
                    feyVar = feeVar.d;
                }
                if (feyVar.b.size() != 0) {
                    Iterator it2 = feyVar.b.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((few) it2.next()).b);
                    }
                }
            }
            Long lValueOf2 = Long.valueOf(byxVarB.d);
            dvl.b(etwVar2.b);
            if ((etwVar2.a & 8) == 8) {
                j = etwVar2.e;
            } else {
                j = -1;
            }
            if ((etwVar2.a & 2048) == 2048) {
                j2 = etwVar2.m;
            } else {
                j2 = -1;
            }
            if ((etwVar2.a & 32) == 32) {
                if (etwVar2.g == null) {
                    ffeVar2 = ffe.h;
                } else {
                    ffeVar2 = etwVar2.g;
                }
                if (ffeVar2.f == 0) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            bys bysVarA = ((bys) ((fio) byr.i.a(dp.au, (Object) null))).a(LockScreenChimeraActivity.ACTION_START);
            esu esuVarA5 = esu.a(etwVar2.c);
            if (esuVarA5 == null) {
                esuVarA5 = esu.NO_ACTIVE_POLICY;
            }
            bys bysVarA2 = bysVarA.a(esuVarA5);
            bysVarA2.c();
            byr byrVar = (byr) bysVarA2.a;
            byrVar.a |= 8;
            byrVar.e = j;
            bysVarA2.c();
            byr byrVar2 = (byr) bysVarA2.a;
            byrVar2.a |= 16;
            byrVar2.f = j2;
            bysVarA2.c();
            byr byrVar3 = (byr) bysVarA2.a;
            byrVar3.a |= 4;
            byrVar3.d = z;
            long jLongValue = lValueOf2 == null ? -1L : lValueOf2.longValue();
            bysVarA2.c();
            byr byrVar4 = (byr) bysVarA2.a;
            byrVar4.a |= 32;
            byrVar4.g = jLongValue;
            bysVarA2.c();
            byr byrVar5 = (byr) bysVarA2.a;
            if (!byrVar5.h.a()) {
                fjf fjfVar = byrVar5.h;
                int size = fjfVar.size();
                byrVar5.h = fjfVar.a(size == 0 ? 10 : size << 1);
            }
            List list = byrVar5.h;
            fiv.a(arrayList3);
            if (arrayList3 instanceof fjo) {
                List listD = ((fjo) arrayList3).d();
                fjo fjoVar = (fjo) list;
                int size2 = list.size();
                for (Object obj : listD) {
                    if (obj == null) {
                        String string3 = new StringBuilder(37).append("Element at index ").append(fjoVar.size() - size2).append(" is null.").toString();
                        for (int size3 = fjoVar.size() - 1; size3 >= size2; size3--) {
                            fjoVar.remove(size3);
                        }
                        throw new NullPointerException(string3);
                    }
                    if (obj instanceof fgy) {
                        fjoVar.a((fgy) obj);
                    } else {
                        fjoVar.add((String) obj);
                    }
                }
            } else if (arrayList3 instanceof fkp) {
                list.addAll(arrayList3);
            } else {
                if ((list instanceof ArrayList) && (arrayList3 instanceof Collection)) {
                    ((ArrayList) list).ensureCapacity(arrayList3.size() + list.size());
                }
                int size4 = list.size();
                for (Object obj2 : arrayList3) {
                    if (obj2 == null) {
                        String string4 = new StringBuilder(37).append("Element at index ").append(list.size() - size4).append(" is null.").toString();
                        for (int size5 = list.size() - 1; size5 >= size4; size5--) {
                            list.remove(size5);
                        }
                        throw new NullPointerException(string4);
                    }
                    list.add(obj2);
                }
            }
            a(supervisionDatabaseH, (byr) ((fin) bysVarA2.h()));
        } else {
            b();
        }
        if ("com.google.android.gms.kids.features.timelimit.ACTION_LOCAL_UNLOCK".equals(intent.getAction())) {
            cav.a(euz.LOCAL_UNLOCK);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a(SupervisionDatabase supervisionDatabase, byr byrVar) {
        btv.c("TimeLimit", "locking device", new Object[0]);
        Object[] objArr = new Object[2];
        objArr[0] = byrVar.b;
        esu esuVarA = esu.a(byrVar.c);
        if (esuVarA == null) {
            esuVarA = esu.NO_ACTIVE_POLICY;
        }
        objArr[1] = Integer.valueOf(esuVarA.e);
        bui.a("TimeLimit", "android.permission.READ_PHONE_STATE");
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) getSystemService("device_policy");
        PackageManager packageManager = (PackageManager) dvl.a(getPackageManager());
        if (fra.d() && byt.a(byrVar)) {
            devicePolicyManager.setCameraDisabled(btb.a, false);
            bte.c(devicePolicyManager, true);
        } else {
            devicePolicyManager.setCameraDisabled(btb.a, true);
            bte.c(devicePolicyManager, false);
        }
        if (biw.e()) {
            packageManager.setComponentEnabledSetting(LockScreenChimeraActivity.getActivityComponentName(this), 1, 1);
            ArrayList arrayList = new ArrayList(byrVar.h);
            arrayList.add("com.google.android.gms");
            arrayList.add("com.google.android.apps.kids.familylinkmanager");
            devicePolicyManager.setLockTaskPackages(btb.a, (String[]) arrayList.toArray(new String[arrayList.size()]));
            devicePolicyManager.setLockTaskFeatures(btb.a, 49);
        } else {
            if (!biw.b()) {
                ActivityManager activityManager = (ActivityManager) getSystemService("activity");
                if (activityManager.isInLockTaskMode()) {
                    List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
                    if (runningTasks.isEmpty()) {
                        btt.a("KidsService", "noPinnedTask", "failed to get pinned task", new Object[0]);
                    }
                    PackageManager packageManager2 = getPackageManager();
                    String packageName = runningTasks.get(0).baseActivity.getPackageName();
                    int applicationEnabledSetting = packageManager2.getApplicationEnabledSetting(packageName);
                    packageManager2.setApplicationEnabledSetting(packageName, 2, 0);
                    packageManager2.setApplicationEnabledSetting(packageName, applicationEnabledSetting, 0);
                }
            }
            ComponentName activityComponentName = LockScreenChimeraActivity.getActivityComponentName(this);
            packageManager.setComponentEnabledSetting(activityComponentName, 1, 1);
            PackageManager packageManager3 = getPackageManager();
            bwj bwjVarP = supervisionDatabase.p();
            if (bwjVarP.b() == null) {
                ResolveInfo resolveInfoResolveActivity = packageManager3.resolveActivity(byz.a(), 65536);
                if (resolveInfoResolveActivity == null) {
                    btv.d("TimeLimit", "Can't find any home launcher activity!", new Object[0]);
                    btt.a("TimeLimit", "user_home", "Can't find any home launcher activity!", new Object[0]);
                } else {
                    bwjVarP.a(new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name));
                    devicePolicyManager.addPersistentPreferredActivity(btb.a, byz.b(), activityComponentName);
                }
            } else {
                devicePolicyManager.addPersistentPreferredActivity(btb.a, byz.b(), activityComponentName);
            }
            bsu.a("TimeLimit", true);
            byz.a(true);
        }
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = bza.a;
        audioManager.requestAudioFocus(onAudioFocusChangeListener, 3, 1);
        audioManager.abandonAudioFocus(onAudioFocusChangeListener);
        byz.a(this, supervisionDatabase, !fra.c());
        a(devicePolicyManager, true, a(byrVar));
        bvp bvpVarK = supervisionDatabase.k();
        supervisionDatabase.d();
        try {
            if (bvpVarK.b("key_last_lock_time", bij.a.a())) {
                bvpVarK.a("key_last_lock_state", !((KeyguardManager) dvl.a(getSystemService("keyguard"))).isKeyguardLocked() && ((PowerManager) dvl.a(getSystemService("power"))).isInteractive());
            }
            supervisionDatabase.f();
            supervisionDatabase.e();
            startService(SupervisionChimeraService.getLockingIntent(this, byrVar));
            btt.e();
        } catch (Throwable th) {
            supervisionDatabase.e();
            throw th;
        }
    }

    @TargetApi(24)
    private static void a(DevicePolicyManager devicePolicyManager, boolean z, Set set) {
        if (biw.b() && bte.f(devicePolicyManager) && fra.c()) {
            String[] packagesSuspended = devicePolicyManager.setPackagesSuspended(btb.a, (String[]) set.toArray(new String[0]), z);
            if (packagesSuspended.length != 0) {
                btv.d("TimeLimit", "Failed to set suspend to %s for packages:%s", Boolean.valueOf(z), Arrays.toString(packagesSuspended));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Set a(byr byrVar) {
        HashSet hashSet = new HashSet(byrVar.h);
        hashSet.add(getPackageName());
        duw duwVar = new duw(',');
        dvl.a(duwVar);
        dvo dvoVar = new dvo(new dvp(duwVar));
        duz duzVar = duz.a;
        dvl.a(duzVar);
        hashSet.addAll(new dvo(dvoVar.c, dvoVar.b, duzVar, dvoVar.d).c(((frb) fra.a.a()).a()));
        hashSet.addAll(byt.b((Context) this));
        HashSet hashSet2 = new HashSet();
        Iterator<ResolveInfo> it = getPackageManager().queryIntentActivities(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER"), 0).iterator();
        while (it.hasNext()) {
            String str = it.next().activityInfo.packageName;
            if (!hashSet.contains(str)) {
                hashSet2.add(str);
            }
        }
        return hashSet2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void b() {
        btv.c("TimeLimit", "unlocking device", new Object[0]);
        SupervisionDatabase supervisionDatabaseH = SupervisionDatabase.h();
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) dvl.a(getSystemService("device_policy"));
        if (bte.f(devicePolicyManager)) {
            devicePolicyManager.setCameraDisabled(btb.a, false);
            bte.c(devicePolicyManager, false);
        }
        bsu.a("TimeLimit", false);
        a(devicePolicyManager, false, a(byt.a()));
        startService(SupervisionChimeraService.getUnlockingIntent(this));
        ComponentName componentNameA = a(new ComponentName("com.google.android.gms", "com.google.android.gms.kids.LockscreenActivity"));
        ComponentName componentNameA2 = a(new ComponentName("com.google.android.apps.kids.familylinkmanager", "com.google.android.gms.kids.LockscreenActivity"));
        if (componentNameA != null || componentNameA2 != null) {
            bwj bwjVarP = supervisionDatabaseH.p();
            ComponentName componentNameB = bwjVarP.b();
            if (componentNameB != null) {
                if (bte.f(devicePolicyManager)) {
                    devicePolicyManager.addPersistentPreferredActivity(btb.a, byz.b(), componentNameB);
                    devicePolicyManager.clearPackagePersistentPreferredActivities(btb.a, componentNameB.getPackageName());
                }
                bwjVarP.a((ComponentName) null);
            }
            startActivity(LockScreenChimeraActivity.getIntent(this, byt.a()));
            b(componentNameA);
            b(componentNameA2);
            if (bhq.a()) {
                startActivity(byz.a());
            }
        }
        byz.a(this, supervisionDatabaseH, false);
        byz.a(false);
        long jC = supervisionDatabaseH.k().c("key_last_lock_time");
        if (jC != 0) {
            boolean zF = supervisionDatabaseH.k().f("key_last_lock_state");
            UsageStatsManager usageStatsManager = (UsageStatsManager) getSystemService("usagestats");
            long jA = bij.a.a();
            UsageEvents usageEventsQueryEvents = usageStatsManager.queryEvents(jC, jA);
            UsageEvents.Event event = new UsageEvents.Event();
            long timeStamp = 0;
            long timeStamp2 = jC;
            boolean z = zF;
            String packageName = null;
            while (usageEventsQueryEvents.hasNextEvent()) {
                usageEventsQueryEvents.getNextEvent(event);
                timeStamp += z ? event.getTimeStamp() - timeStamp2 : 0L;
                String packageName2 = event.getPackageName();
                switch (event.getEventType()) {
                    case 1:
                        packageName = event.getPackageName();
                        z = packageName2 != null && !packageName2.equals("com.google.android.gms") && !packageName2.equals("android");
                        break;
                    case 2:
                        if (packageName == null || packageName.equals(event.getPackageName())) {
                            z = false;
                        }
                        break;
                }
                timeStamp2 = event.getTimeStamp();
            }
            if (z) {
                timeStamp += jA - timeStamp2;
            }
            enf enfVar = (enf) ((fio) ene.d.a(dp.au, (Object) null));
            enfVar.c();
            ene eneVar = (ene) enfVar.a;
            eneVar.a |= 1;
            eneVar.b = jA - jC;
            enfVar.c();
            ene eneVar2 = (ene) enfVar.a;
            eneVar2.a |= 2;
            eneVar2.c = timeStamp;
            ene eneVar3 = (ene) ((fin) enfVar.h());
            btv.b("TimeLimit", "Lock screen summary: %s", eneVar3);
            btt.a(eneVar3);
        }
        btt.f();
    }

    private final ComponentName a(ComponentName componentName) {
        try {
            if (getPackageManager().getComponentEnabledSetting(componentName) == 1) {
                return componentName;
            }
            return null;
        } catch (IllegalArgumentException e) {
        }
    }

    private final void b(ComponentName componentName) {
        if (componentName != null) {
            getPackageManager().setComponentEnabledSetting(componentName, 0, bhq.a() ? 1 : 0);
        }
    }

    private static void a(long j, int i, String str) {
        if (j != 0) {
            btv.b("TimeLimit", "Scheduling %s alarm at [%s]", str, new Date(j));
            BaseApplicationContext baseApplicationContextA = ayt.a();
            PendingIntent pendingIntentA = bta.a(baseApplicationContextA, TimeLimitCheckingIntentOperation.class, a(str), 0, 134217728);
            bfr bfrVar = new bfr(baseApplicationContextA);
            if (biw.a()) {
                if (bfr.a(j)) {
                    try {
                        bfrVar.e.setExactAndAllowWhileIdle(i, j, pendingIntentA);
                        bfs.a(bfrVar.f, i, str, j, bfr.a, 0L, null, bfr.d | bfr.c);
                        duj.a();
                        return;
                    } catch (SecurityException e) {
                        Log.e("AlarmManager", "Failed to set alarm", e);
                        return;
                    }
                }
                return;
            }
            bfrVar.a(str, i, j, bfr.a, 0L, pendingIntentA, bjd.a(bfrVar.f, (String) null));
        }
    }

    private static void a(long j) {
        if (j != 0) {
            btv.c("TimeLimit", "Next near future check after %s seconds", Long.valueOf(j / 1000));
            synchronized (TimeLimitCheckingIntentOperation.class) {
                if (c != null) {
                    c.cancel(true);
                }
                c = bur.a.schedule(new byy(), j, TimeUnit.MILLISECONDS);
            }
        }
    }
}
