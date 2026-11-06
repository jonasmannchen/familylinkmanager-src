package com.google.android.gms.kids.setup;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.KidSetupChimeraActivity;
import com.google.android.gms.kids.setup.compat.LifecycleActivity;
import com.google.android.gms.kids.setup.fragment.KidSetupFragment;
import com.google.android.gms.kids.setup.sentinel.StartFragment;
import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;
import flm.as;
import flm.bek;
import flm.biw;
import flm.btm;
import flm.btv;
import flm.buc;
import flm.bus;
import flm.cea;
import flm.ceb;
import flm.cha;
import flm.cia;
import flm.cic;
import flm.cid;
import flm.cih;
import flm.cii;
import flm.cij;
import flm.cik;
import flm.cin;
import flm.coj;
import flm.col;
import flm.coy;
import flm.dp;
import flm.dvi;
import flm.dvl;
import flm.fin;
import flm.fio;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class KidSetupChimeraActivity extends LifecycleActivity {
    private KidSetupViewModel a;
    private cea b;
    private ceb c;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.kids.setup.compat.LifecycleActivity, flm.akr, flm.akx
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = (KidSetupViewModel) cin.a((Activity) this).a(KidSetupViewModel.class);
        this.a.b.b(getIntent());
        if (bundle == null) {
            btv.c("KidSetup", "KidSetupActivity started by %s.", getCallingActivity());
            this.a.a(new coy(this) { // from class: flm.cdw
                private final KidSetupChimeraActivity a;

                {
                    this.a = this;
                }

                @Override // flm.coy
                public final Object a(Object obj) {
                    return this.a.lambda$onCreate$0$KidSetupChimeraActivity((cij) obj);
                }
            });
        } else if (bundle.getBoolean("device_setup_state_saved", false)) {
            final dvi dviVarA = col.a(this);
            if (dviVarA.a()) {
                this.a.a(new coy(dviVarA) { // from class: flm.cdx
                    private final dvi a;

                    {
                        this.a = dviVarA;
                    }

                    @Override // flm.coy
                    public final Object a(Object obj) {
                        return KidSetupChimeraActivity.lambda$onCreate$1$KidSetupChimeraActivity(this.a, (cij) obj);
                    }
                });
                btv.c("KidSetup", "Restored setup state from shared preferences.", new Object[0]);
            }
            col.b(this);
        }
        updateTheme();
        getWindow().setSoftInputMode(16);
        setContentView(R.layout.kid_setup_chimera_activity);
        final View viewFindViewById = findViewById(R.id.kid_setup_default_touch_responder);
        viewFindViewById.setSoundEffectsEnabled(false);
        viewFindViewById.setOnClickListener(new View.OnClickListener(viewFindViewById) { // from class: flm.cdy
            private final View a;

            {
                this.a = viewFindViewById;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.requestFocus();
            }
        });
        viewFindViewById.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: flm.cdz
            private final KidSetupChimeraActivity a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.a.lambda$initializeDefaultTouchResponder$3$KidSetupChimeraActivity(view, z);
            }
        });
        if (bundle == null && getPackageName().equals("com.google.android.gms")) {
            if (!bus.b(this)) {
                btv.c("KidSetup", "GMS Core version below V15, delegating intent to Family Link Manager...", new Object[0]);
                a();
                return;
            } else if (a(this, "com.google.android.apps.kids.familylinkmanager")) {
                btv.c("KidSetup", "Delegating Sync Tail Flow to Family Link Manager...", new Object[0]);
                a();
                return;
            }
        }
        if (bundle == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.kid_setup_default_touch_responder, new StartFragment()).commitNow();
        }
        this.b = new cea(this, this);
        registerReceiver(this.b, new IntentFilter("com.google.android.gms.kids.action.FINISH_DEVICE_SETUP"));
        this.c = new ceb(this, this);
        registerReceiver(this.c, new IntentFilter("com.google.android.gms.kids.action.LAUNCH_GOOGLE_HELP"));
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            setResult(i2, intent);
            finish();
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.kids.setup.compat.LifecycleActivity, flm.akr, flm.akx
    public void onStart() {
        super.onStart();
        cia ciaVarA = cia.a(this.a.d().b);
        if (ciaVarA == null) {
            ciaVarA = cia.UNSPECIFIED;
        }
        if (cic.b(ciaVarA)) {
            cih.a(this).a();
        }
        if (getCurrentFocus() == null) {
            focusDefaultTouchResponder();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.kids.setup.compat.LifecycleActivity, flm.akr, flm.akx
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!isChangingConfigurations()) {
            col.a(this, this.a.d());
            bundle.putBoolean("device_setup_state_saved", true);
            btv.c("KidSetup", "Saved setup state to shared preferences.", new Object[0]);
            return;
        }
        bundle.remove("device_setup_state_saved");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.kids.setup.compat.LifecycleActivity, flm.akr, flm.akx
    public void onStop() {
        String str;
        super.onStop();
        if (!isChangingConfigurations() && !isFinishing()) {
            cia ciaVarA = cia.a(this.a.d().b);
            if (ciaVarA == null) {
                ciaVarA = cia.UNSPECIFIED;
            }
            if (cic.b(ciaVarA) && this.a.d().i == 1) {
                cih cihVarA = cih.a(this);
                if (cihVarA.d) {
                    cihVarA.d = false;
                    return;
                }
                cihVarA.e = new WeakReference((Activity) dvl.a(this));
                Intent intent = new Intent("com.google.android.gms.kids.setup.ACTION_RESUME_SETUP").setPackage(getPackageName());
                String string = cihVarA.b.getString(R.string.kidsetup_interrupted_notification_title);
                String string2 = cihVarA.b.getString(R.string.kidsetup_interrupted_notification_text);
                Context context = cihVarA.b;
                if (cihVarA.c) {
                    str = "kids_setting_updates_channel";
                } else {
                    str = "kids_alerts_channel";
                }
                Notification notificationBuild = buc.a(context, R.drawable.quantum_ic_warning_grey600_24, str).setCategory("sys").setContentTitle(string).setContentText(string2).setLargeIcon(btm.a(cihVarA.b.getDrawable(R.drawable.quantum_ic_warning_grey600_96))).setTicker(string).setStyle(new Notification.BigTextStyle().bigText(string2)).setAutoCancel(false).setOngoing(false).setShowWhen(false).build();
                notificationBuild.flags |= 32;
                notificationBuild.contentIntent = PendingIntent.getBroadcast(cihVarA.b, 0, intent, 134217728);
                bek.a(cihVarA.b).a(1, notificationBuild);
                if (cihVarA.f == null) {
                    cihVarA.f = new cii(cihVarA);
                    cihVarA.b.registerReceiver(cihVarA.f, new IntentFilter("com.google.android.gms.kids.setup.ACTION_RESUME_SETUP"));
                }
                cihVarA.c = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.kids.setup.compat.LifecycleActivity, flm.akr, flm.akx
    public void onDestroy() {
        super.onDestroy();
        cih.a(this).a();
        if (this.b != null) {
            unregisterReceiver(this.b);
        }
        if (this.c != null) {
            unregisterReceiver(this.c);
        }
        if (isFinishing()) {
            if (cih.a != null) {
                synchronized (cih.class) {
                    if (cih.a != null) {
                        cih.a.a();
                        cih.a = null;
                    }
                }
            }
            if (coj.a) {
                synchronized (coj.class) {
                    if (coj.a) {
                        coj.c.evictAll();
                        coj.c = null;
                        coj.b = null;
                        coj.a = false;
                    }
                }
            }
        }
    }

    public void onBackPressed() {
        Iterator it = b().iterator();
        if (it.hasNext()) {
            KidSetupFragment kidSetupFragment = (KidSetupFragment) it.next();
            if (kidSetupFragment.d) {
                if (kidSetupFragment.c.e) {
                    kidSetupFragment.c();
                    return;
                }
                return;
            } else {
                if (kidSetupFragment.m == null || kidSetupFragment.m.getVisibility() == 8) {
                    kidSetupFragment.c();
                    return;
                }
                return;
            }
        }
        super.onBackPressed();
    }

    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((KidSetupFragment) it.next()).e_();
        }
    }

    public void focusDefaultTouchResponder() {
        findViewById(R.id.kid_setup_default_touch_responder).requestFocus();
    }

    public void scheduleImmediateSafetyNetJobAndFinish() {
        btv.c("KidSetup", "Scheduling immediate safety net job...", new Object[0]);
        new cha(this.a, true).a((as) null);
        setResult(-1);
        finish();
    }

    public void updateTheme() {
        int i;
        cid cidVarA = cid.a(this.a.d().c);
        if (cidVarA == null) {
            cidVarA = cid.UNDEFINED;
        }
        int themeResId = getThemeResId();
        switch (cidVarA.ordinal()) {
            case 2:
                i = R.style.Theme_KidSetup_Glif;
                break;
            case 3:
                i = R.style.Theme_KidSetup_GlifV2;
                break;
            case 4:
                i = R.style.Theme_KidSetup_GlifV3;
                break;
            case 5:
                i = R.style.Theme_KidSetup_Supervisee;
                break;
            case 6:
                i = R.style.Theme_KidSetup_SuperviseeExit;
                break;
            case 7:
                i = R.style.SuwThemeMaterial_Light;
                break;
            case 8:
                i = R.style.SuwThemeGlif_Light;
                break;
            case 9:
                i = R.style.SuwThemeGlifV2_Light;
                break;
            case 10:
                i = R.style.SuwThemeGlifV3_Light;
                break;
            default:
                i = R.style.Theme_KidSetup_MaterialBlue;
                break;
        }
        if (themeResId != i) {
            btv.c("KidSetup", "Switching theme from %s to %s (%s).", Integer.valueOf(themeResId), Integer.valueOf(i), cidVarA.name());
            setTheme(i);
            TypedValue typedValue = new TypedValue();
            if (getTheme().resolveAttribute(android.R.attr.statusBarColor, typedValue, true)) {
                getWindow().setStatusBarColor(typedValue.data);
            }
            TypedValue typedValue2 = new TypedValue();
            if (getTheme().resolveAttribute(android.R.attr.navigationBarColor, typedValue2, true)) {
                getWindow().setNavigationBarColor(typedValue2.data);
            }
        }
    }

    private final void a() {
        startActivityForResult(new Intent().setComponent(new ComponentName("com.google.android.apps.kids.familylinkmanager", "com.google.android.gms.kids.KidSetupActivity")).putExtras(getIntent()), 1);
    }

    private final List b() {
        ArrayDeque arrayDeque = new ArrayDeque(getSupportFragmentManager().getFragments());
        ArrayList arrayList = new ArrayList();
        while (!arrayDeque.isEmpty()) {
            Fragment fragment = (Fragment) arrayDeque.poll();
            arrayDeque.addAll(fragment.getChildFragmentManager().getFragments());
            if (fragment instanceof KidSetupFragment) {
                arrayList.add((KidSetupFragment) fragment);
            }
        }
        return arrayList;
    }

    private static boolean a(Context context, String str) {
        dvl.a("com.google.android.gms".equals(str) || "com.google.android.apps.kids.familylinkmanager".equals(str));
        ComponentName componentName = new ComponentName(str, "com.google.android.gms.kids.SyncTailTrapperActivity");
        try {
            return context.getPackageManager().getComponentEnabledSetting(componentName) == 1;
        } catch (Exception e) {
            btv.b("KidSetup", e, "Failed to get enabled state for %s, assuming it's disabled.", componentName);
            return false;
        }
    }

    public final /* synthetic */ void lambda$initializeDefaultTouchResponder$3$KidSetupChimeraActivity(View view, boolean z) {
        if (z) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
        }
    }

    public static final /* synthetic */ cij lambda$onCreate$1$KidSetupChimeraActivity(dvi dviVar, cij cijVar) {
        return (cij) dviVar.b();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e3  */
    public final /* synthetic */ cij lambda$onCreate$0$KidSetupChimeraActivity(cij cijVar) {
        boolean z;
        cid cidVar;
        fio fioVar = (fio) cijVar.a(dp.au, (Object) null);
        fioVar.a((fin) cijVar);
        cik cikVar = (cik) fioVar;
        Intent intent = getIntent();
        if (intent != null) {
            Bundle bundleExtra = intent.getBundleExtra("ui_parameters");
            String string = bundleExtra != null ? bundleExtra.getString("theme") : null;
            if (TextUtils.isEmpty(string)) {
                string = intent.getStringExtra("theme");
            }
            if (!TextUtils.isEmpty(string)) {
                switch (string) {
                    case "glif":
                    case "glif_light":
                        cidVar = cid.GLIF;
                        break;
                    case "glif_v2":
                    case "glif_v2_light":
                        cidVar = cid.GLIF_V2;
                        break;
                    case "glif_v3":
                    case "glif_v3_light":
                        cidVar = cid.GLIF_V3;
                        break;
                    case "material":
                    case "material_light":
                        cidVar = cid.MATERIAL_BLUE;
                        break;
                    default:
                        if (Build.BRAND.toLowerCase().contains("google")) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (z) {
                            if (!biw.e()) {
                                cidVar = cid.GLIF_V2;
                            } else {
                                cidVar = cid.GLIF_V3;
                            }
                            break;
                        } else {
                            if (!biw.c()) {
                                cidVar = cid.MATERIAL_BLUE;
                            } else {
                                cidVar = cid.GLIF;
                            }
                            break;
                        }
                        break;
                }
            } else {
                if (Build.BRAND.toLowerCase().contains("google")) {
                    z = false;
                } else {
                    z = false;
                }
                if (z) {
                    if (!biw.e()) {
                        cidVar = cid.GLIF_V3;
                    } else {
                        cidVar = cid.GLIF_V2;
                    }
                } else if (!biw.c()) {
                    cidVar = cid.GLIF;
                } else {
                    cidVar = cid.MATERIAL_BLUE;
                }
            }
        } else {
            if (Build.BRAND.toLowerCase().contains("google") || !Build.MODEL.toLowerCase().contains("pixel")) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (!biw.e()) {
                    cidVar = cid.GLIF_V3;
                } else {
                    cidVar = cid.GLIF_V2;
                }
            } else if (!biw.c()) {
                cidVar = cid.GLIF;
            } else {
                cidVar = cid.MATERIAL_BLUE;
            }
        }
        return (cij) ((fin) cikVar.a(cidVar).h());
    }
}
