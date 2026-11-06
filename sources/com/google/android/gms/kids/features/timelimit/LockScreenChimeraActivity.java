package com.google.android.gms.kids.features.timelimit;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.telecom.TelecomManager;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.features.timelimit.LockScreenChimeraActivity;
import flm.biw;
import flm.btv;
import flm.bus;
import flm.byl;
import flm.byr;
import flm.bys;
import flm.byt;
import flm.byu;
import flm.cbq;
import flm.cbt;
import flm.cca;
import flm.cce;
import flm.dp;
import flm.esu;
import flm.fin;
import flm.fio;
import flm.fjg;
import java.util.ArrayDeque;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class LockScreenChimeraActivity extends Activity implements byl {
    public static final String ACTION_ACCOUNT_INTERCEPTOR = "ACTION_START_ACCOUNT_INTERCEPTOR";
    public static final String ACTION_LOCK_SCREEN_ACTIVITY_RECHECK = "com.google.android.gms.kids.features.timelimit.ACTION_LOCK_SCREEN_ACTIVITY_RECHECK";
    public static final String ACTION_MEMBER_SV_EXIT = "ACTION_MEMBER_SV_EXIT";
    public static final String ACTION_START = "ACTION_START_LOCK_SCREEN";
    public static final String ACTION_STOP = "ACTION_STOP_LOCK_SCREEN";
    private byr a;

    public static ComponentName getActivityComponentName(Context context) {
        return bus.a(context) >= 12000000 ? new ComponentName("com.google.android.gms", "com.google.android.gms.kids.LockscreenActivity") : new ComponentName("com.google.android.apps.kids.familylinkmanager", "com.google.android.gms.kids.LockscreenActivity");
    }

    public static Intent getIntent(Context context, byr byrVar) {
        return new Intent().setAction("android.intent.action.MAIN").addCategory("android.intent.category.HOME").putExtra("extra_state", byrVar.b()).addFlags(335544320).setPackage(getActivityComponentName(context).getPackageName());
    }

    public byr getState() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // flm.byl
    public void onEmergencyButtonClicked() {
        String strA = byt.a((Context) this);
        if (strA != null) {
            startActivityForResult(new Intent(strA), 0);
        }
    }

    @Override // flm.byl
    public void showInterstitial(boolean z) {
        findViewById(R.id.kids_time_limit_progress_bar).setVisibility(z ? 0 : 8);
    }

    public void onCreate(Bundle bundle) {
        cca ccaVarA;
        super.onCreate(bundle);
        btv.b("TimeLimit", "Activity onCreate", new Object[0]);
        if (!a(getIntent())) {
            setIntent(new Intent());
            this.a = (byr) ((fin) ((bys) ((fio) byr.i.a(dp.au, (Object) null))).a(ACTION_START).a(esu.OVERRIDE).h());
            btv.d("TimeLimit", "Invalid state & intent, ignore", new Object[0]);
        }
        if (!isFinishing()) {
            if (biw.e()) {
                startLockTask();
            }
            requestWindowFeature(1);
            switch (this.a.b) {
                case "ACTION_START_ACCOUNT_INTERCEPTOR":
                    setTheme(R.style.Theme_LockScreen_AccountInterceptor);
                    break;
                case "ACTION_MEMBER_SV_EXIT":
                    setTheme(R.style.Theme_KidSetup_SuperviseeExit);
                    break;
                case "ACTION_START_LOCK_SCREEN":
                    esu esuVarA = esu.a(this.a.c);
                    if (esuVarA == null) {
                        esuVarA = esu.NO_ACTIVE_POLICY;
                    }
                    switch (esuVarA.ordinal()) {
                        case 1:
                            setTheme(R.style.Theme_LockScreen_AdHoc);
                            break;
                        case 2:
                            setTheme(R.style.Theme_LockScreen_Bedtime);
                            break;
                        case 3:
                            setTheme(R.style.Theme_LockScreen_Usage);
                            break;
                        default:
                            esu esuVarA2 = esu.a(this.a.c);
                            if (esuVarA2 == null) {
                                esuVarA2 = esu.NO_ACTIVE_POLICY;
                            }
                            String strValueOf = String.valueOf(esuVarA2);
                            throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf).length() + 22).append("Invalid active policy:").append(strValueOf).toString());
                    }
                    break;
                case "ACTION_STOP_LOCK_SCREEN":
                default:
                    String strValueOf2 = String.valueOf(this.a.b);
                    throw new IllegalStateException(strValueOf2.length() != 0 ? "Invalid action:".concat(strValueOf2) : new String("Invalid action:"));
            }
            if (!this.a.b.equals(ACTION_MEMBER_SV_EXIT)) {
                setContentView(R.layout.kids_time_limit_base);
                final View viewFindViewById = findViewById(android.R.id.content);
                viewFindViewById.setClickable(true);
                viewFindViewById.setFocusable(true);
                viewFindViewById.setFocusableInTouchMode(true);
                viewFindViewById.setSoundEffectsEnabled(false);
                viewFindViewById.setOnClickListener(new View.OnClickListener(viewFindViewById) { // from class: flm.bym
                    private final View a;

                    {
                        this.a = viewFindViewById;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.requestFocus();
                    }
                });
                viewFindViewById.setOnFocusChangeListener(new View.OnFocusChangeListener(this, viewFindViewById) { // from class: flm.byn
                    private final LockScreenChimeraActivity a;
                    private final View b;

                    {
                        this.a = this;
                        this.b = viewFindViewById;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z) {
                        this.a.lambda$handleClickOnRootView$1$LockScreenChimeraActivity(this.b, view, z);
                    }
                });
            }
            if (getSupportFragmentManager().getFragments().isEmpty()) {
                switch (this.a.b) {
                    case "ACTION_START_ACCOUNT_INTERCEPTOR":
                        ccaVarA = cca.a(R.xml.kids_account_interceptor_navigation);
                        break;
                    case "ACTION_START_LOCK_SCREEN":
                        ccaVarA = cca.a(R.xml.kids_time_limit_navigation);
                        break;
                    case "ACTION_MEMBER_SV_EXIT":
                        ccaVarA = cca.a(R.xml.kids_member_sv_exit_navigation);
                        break;
                    default:
                        String strValueOf3 = String.valueOf(this.a.b);
                        throw new IllegalStateException(strValueOf3.length() != 0 ? "Unknown state action:".concat(strValueOf3) : new String("Unknown state action:"));
                }
                getSupportFragmentManager().beginTransaction().setCustomAnimations(0, 0).replace(android.R.id.content, ccaVarA).commit();
                btv.a("TimeLimit", "Activity no state", new Object[0]);
                return;
            }
            if (!byt.a(this.a)) {
                cbt cbtVarA = cce.a(getSupportFragmentManager().findFragmentById(android.R.id.content));
                if (((cbq) cbtVarA.d()).a.equals(WhitelistAppsListFragment.class)) {
                    cbtVarA.a();
                }
            }
            btv.a("TimeLimit", "Activity restarted", new Object[0]);
        }
    }

    protected void onStart() {
        super.onStart();
        btv.a("TimeLimit", "Activity onStart", new Object[0]);
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (this.a == null) {
            finish();
            return;
        }
        String str = this.a.b;
        esu esuVarA = esu.a(this.a.c);
        if (esuVarA == null) {
            esuVarA = esu.NO_ACTIVE_POLICY;
        }
        if (!a(intent)) {
            btv.d("TimeLimit", "Invalid newIntent, ignore", new Object[0]);
            return;
        }
        setIntent(intent);
        if (!isFinishing()) {
            if (!Objects.equals(str, this.a.b)) {
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.beginTransaction().remove(supportFragmentManager.findFragmentById(android.R.id.content)).commitNow();
                recreate();
                return;
            }
            esu esuVarA2 = esu.a(this.a.c);
            if (esuVarA2 == null) {
                esuVarA2 = esu.NO_ACTIVE_POLICY;
            }
            if (esuVarA != esuVarA2) {
                recreate();
            }
        }
    }

    protected void onResume() {
        super.onResume();
        btv.a("TimeLimit", "Activity onResume", new Object[0]);
        TelecomManager telecomManager = (TelecomManager) getSystemService("telecom");
        if (telecomManager != null && biw.a() && checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
            telecomManager.showInCallScreen(false);
        }
    }

    protected void onStop() {
        super.onStop();
        btv.a("TimeLimit", "Activity onStop", new Object[0]);
        sendBroadcast(new Intent(ACTION_LOCK_SCREEN_ACTIVITY_RECHECK).setPackage("com.google.android.gms"));
    }

    public void onBackPressed() {
        View viewFindViewById = findViewById(R.id.kids_time_limit_progress_bar);
        if (viewFindViewById == null || viewFindViewById.getVisibility() == 8) {
            ArrayDeque arrayDeque = new ArrayDeque(getSupportFragmentManager().getFragments());
            while (!arrayDeque.isEmpty()) {
                byu byuVar = (Fragment) arrayDeque.poll();
                if (byuVar instanceof byu) {
                    byuVar.a();
                    return;
                }
                arrayDeque.addAll(byuVar.getChildFragmentManager().getFragments());
            }
            cbt cbtVarA = cce.a(getSupportFragmentManager().findFragmentById(android.R.id.content));
            if (cbtVarA.d().e != cbtVarA.b.b) {
                cbtVarA.a();
            }
        }
    }

    public void finish() {
        if (biw.e()) {
            stopLockTask();
        }
        super.finish();
    }

    private final boolean a(Intent intent) {
        if (intent != null) {
            try {
                if (intent.hasExtra("extra_state")) {
                    try {
                        byr byrVar = (byr) fin.b(byr.i, intent.getByteArrayExtra("extra_state"));
                        switch (byrVar.b) {
                            case "ACTION_START_ACCOUNT_INTERCEPTOR":
                            case "ACTION_MEMBER_SV_EXIT":
                            case "ACTION_START_LOCK_SCREEN":
                                this.a = byrVar;
                                return true;
                            case "ACTION_STOP_LOCK_SCREEN":
                                finish();
                                return true;
                            default:
                                return false;
                        }
                    } catch (fjg e) {
                        btv.c("TimeLimit", e, "Failed to parse lock screen state, ignore", new Object[0]);
                        return false;
                    }
                }
            } catch (BadParcelableException e2) {
                return false;
            }
        }
        return false;
    }

    public final /* synthetic */ void lambda$handleClickOnRootView$1$LockScreenChimeraActivity(View view, View view2, boolean z) {
        if (z) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
