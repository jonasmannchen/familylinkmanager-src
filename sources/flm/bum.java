package flm;

import android.accounts.Account;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.chimeraresources.R;
import com.google.android.gms.common.app.BaseApplicationContext;
import com.google.android.gms.kids.database.SupervisionDatabase;
import com.google.android.gms.kids.features.timelimit.TimeLimitCheckingIntentOperation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bum {
    public static boolean a() {
        int iB = b();
        a(iB);
        return iB == 0 || iB == 4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:43:0x0110  */
    /* JADX WARN: Code duplicated, block: B:45:0x0118  */
    /* JADX WARN: Code duplicated, block: B:50:0x0147  */
    public static int b() {
        final int i;
        final BaseApplicationContext baseApplicationContextA = ayt.a();
        if (!bhq.c(baseApplicationContextA)) {
            bvp bvpVarK = SupervisionDatabase.h().k();
            final Account accountC = bts.c();
            boolean zF = bte.f((DevicePolicyManager) baseApplicationContextA.getSystemService("device_policy"));
            String strA = bvpVarK.a("key_supervised_account");
            if (bvpVarK.d("key_in_gl_sign_out") != 0) {
                if (zF && (accountC != null || strA != null)) {
                    btv.c(null, "State during supervision exit", new Object[0]);
                    i = 4;
                } else {
                    btv.d(null, "During supervision exit, but can't find any account or not profile owner!", new Object[0]);
                    i = -1;
                }
            } else {
                List listAsList = Arrays.asList(bhp.a(bts.a()));
                if (accountC == null) {
                    if (zF) {
                        if (TextUtils.isEmpty(strA)) {
                            switch (bvpVarK.d("key_policy_level")) {
                                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                                    btv.c(null, "State during sign out", new Object[0]);
                                    i = 2;
                                    break;
                                case 1:
                                case 2:
                                default:
                                    btv.c(null, "SignIn fails. State no supervision required", new Object[0]);
                                    i = -1;
                                    break;
                                case 3:
                                    btv.c(null, "State during onboarding", new Object[0]);
                                    i = 1;
                                    break;
                            }
                        } else if (listAsList.contains(strA)) {
                            btv.c(null, "State during graduation", new Object[0]);
                            i = 3;
                        } else {
                            btv.d(null, "State account removed without consent", new Object[0]);
                            i = 103;
                        }
                    } else {
                        if (!TextUtils.isEmpty(strA)) {
                            bvpVarK.a("key_supervised_account", "");
                        }
                        btv.c(null, "State no supervision required", new Object[0]);
                        i = -1;
                    }
                } else if (!zF) {
                    btv.d(null, "State no profile owner", new Object[0]);
                    i = 102;
                } else if (listAsList.size() > 1) {
                    if (bsy.a() && bhp.a((Context) baseApplicationContextA).size() <= 1) {
                        ArrayList arrayList = new ArrayList(listAsList);
                        arrayList.remove(accountC.name);
                        int iA = bsy.a(arrayList, SupervisionDatabase.h());
                        switch (iA) {
                            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                                btt.s();
                                if (bvpVarK.d("key_policy_level") != 0) {
                                    btv.c(null, "State during setup", new Object[0]);
                                    i = 1;
                                } else {
                                    bvpVarK.a("key_supervised_account", accountC.name);
                                    bur.a.execute(new Runnable(baseApplicationContextA, accountC) { // from class: flm.buo
                                        private final Context a;
                                        private final Account b;

                                        {
                                            this.a = baseApplicationContextA;
                                            this.b = accountC;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Context context = this.a;
                                            Account account = this.b;
                                            try {
                                                String strValueOf = String.valueOf(fqf.c());
                                                String strConcat = strValueOf.length() != 0 ? "oauth2:".concat(strValueOf) : new String("oauth2:");
                                                bts.d();
                                                bts.a(ayt.a(), account, strConcat);
                                            } catch (alt e) {
                                                if (amk.BAD_AUTHENTICATION.u.equals(e.getMessage())) {
                                                    btv.d(null, "State bad authentication", new Object[0]);
                                                    bum.a(context);
                                                } else if (!amk.ACCOUNT_DELETED.u.equals(e.getMessage())) {
                                                    btv.c(null, e, "Failed to check supervised account token", new Object[0]);
                                                } else {
                                                    btv.d(null, "State account deleted", new Object[0]);
                                                    bum.a(context);
                                                }
                                            } catch (IOException e2) {
                                                btv.b(null, e2, "Failed to check supervised account token, ignore for now", new Object[0]);
                                            }
                                        }
                                    });
                                    btv.c(null, "State all good", new Object[0]);
                                    i = 0;
                                }
                                break;
                            case 1:
                                if (bvpVarK.d("key_policy_level") != 0) {
                                    btv.c(null, "State during setup", new Object[0]);
                                    i = 1;
                                } else {
                                    bvpVarK.a("key_supervised_account", accountC.name);
                                    bur.a.execute(new Runnable(baseApplicationContextA, accountC) { // from class: flm.buo
                                        private final Context a;
                                        private final Account b;

                                        {
                                            this.a = baseApplicationContextA;
                                            this.b = accountC;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Context context = this.a;
                                            Account account = this.b;
                                            try {
                                                String strValueOf = String.valueOf(fqf.c());
                                                String strConcat = strValueOf.length() != 0 ? "oauth2:".concat(strValueOf) : new String("oauth2:");
                                                bts.d();
                                                bts.a(ayt.a(), account, strConcat);
                                            } catch (alt e) {
                                                if (amk.BAD_AUTHENTICATION.u.equals(e.getMessage())) {
                                                    btv.d(null, "State bad authentication", new Object[0]);
                                                    bum.a(context);
                                                } else if (!amk.ACCOUNT_DELETED.u.equals(e.getMessage())) {
                                                    btv.c(null, e, "Failed to check supervised account token", new Object[0]);
                                                } else {
                                                    btv.d(null, "State account deleted", new Object[0]);
                                                    bum.a(context);
                                                }
                                            } catch (IOException e2) {
                                                btv.b(null, e2, "Failed to check supervised account token, ignore for now", new Object[0]);
                                            }
                                        }
                                    });
                                    btv.c(null, "State all good", new Object[0]);
                                    i = 0;
                                }
                                break;
                            case 2:
                                btv.c(null, "Should fetch consent statuses, scheduling job", new Object[0]);
                                caw.d();
                                if (bvpVarK.d("key_policy_level") != 0) {
                                    btv.c(null, "State during setup", new Object[0]);
                                    i = 1;
                                } else {
                                    bvpVarK.a("key_supervised_account", accountC.name);
                                    bur.a.execute(new Runnable(baseApplicationContextA, accountC) { // from class: flm.buo
                                        private final Context a;
                                        private final Account b;

                                        {
                                            this.a = baseApplicationContextA;
                                            this.b = accountC;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Context context = this.a;
                                            Account account = this.b;
                                            try {
                                                String strValueOf = String.valueOf(fqf.c());
                                                String strConcat = strValueOf.length() != 0 ? "oauth2:".concat(strValueOf) : new String("oauth2:");
                                                bts.d();
                                                bts.a(ayt.a(), account, strConcat);
                                            } catch (alt e) {
                                                if (amk.BAD_AUTHENTICATION.u.equals(e.getMessage())) {
                                                    btv.d(null, "State bad authentication", new Object[0]);
                                                    bum.a(context);
                                                } else if (!amk.ACCOUNT_DELETED.u.equals(e.getMessage())) {
                                                    btv.c(null, e, "Failed to check supervised account token", new Object[0]);
                                                } else {
                                                    btv.d(null, "State account deleted", new Object[0]);
                                                    bum.a(context);
                                                }
                                            } catch (IOException e2) {
                                                btv.b(null, e2, "Failed to check supervised account token, ignore for now", new Object[0]);
                                            }
                                        }
                                    });
                                    btv.c(null, "State all good", new Object[0]);
                                    i = 0;
                                }
                                break;
                            case 3:
                                btv.d(null, "State unauthorized secondary accounts", new Object[0]);
                                i = 106;
                                break;
                            default:
                                btv.d(null, "unknown consent check result %s", Integer.valueOf(iA));
                                if (bvpVarK.d("key_policy_level") != 0) {
                                    btv.c(null, "State during setup", new Object[0]);
                                    i = 1;
                                } else {
                                    bvpVarK.a("key_supervised_account", accountC.name);
                                    bur.a.execute(new Runnable(baseApplicationContextA, accountC) { // from class: flm.buo
                                        private final Context a;
                                        private final Account b;

                                        {
                                            this.a = baseApplicationContextA;
                                            this.b = accountC;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Context context = this.a;
                                            Account account = this.b;
                                            try {
                                                String strValueOf = String.valueOf(fqf.c());
                                                String strConcat = strValueOf.length() != 0 ? "oauth2:".concat(strValueOf) : new String("oauth2:");
                                                bts.d();
                                                bts.a(ayt.a(), account, strConcat);
                                            } catch (alt e) {
                                                if (amk.BAD_AUTHENTICATION.u.equals(e.getMessage())) {
                                                    btv.d(null, "State bad authentication", new Object[0]);
                                                    bum.a(context);
                                                } else if (!amk.ACCOUNT_DELETED.u.equals(e.getMessage())) {
                                                    btv.c(null, e, "Failed to check supervised account token", new Object[0]);
                                                } else {
                                                    btv.d(null, "State account deleted", new Object[0]);
                                                    bum.a(context);
                                                }
                                            } catch (IOException e2) {
                                                btv.b(null, e2, "Failed to check supervised account token, ignore for now", new Object[0]);
                                            }
                                        }
                                    });
                                    btv.c(null, "State all good", new Object[0]);
                                    i = 0;
                                }
                                break;
                        }
                    } else {
                        btv.d(null, "State unexpected google accounts", new Object[0]);
                        i = 101;
                    }
                } else if (bvpVarK.d("key_policy_level") != 0) {
                    btv.c(null, "State during setup", new Object[0]);
                    i = 1;
                } else {
                    bvpVarK.a("key_supervised_account", accountC.name);
                    bur.a.execute(new Runnable(baseApplicationContextA, accountC) { // from class: flm.buo
                        private final Context a;
                        private final Account b;

                        {
                            this.a = baseApplicationContextA;
                            this.b = accountC;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Context context = this.a;
                            Account account = this.b;
                            try {
                                String strValueOf = String.valueOf(fqf.c());
                                String strConcat = strValueOf.length() != 0 ? "oauth2:".concat(strValueOf) : new String("oauth2:");
                                bts.d();
                                bts.a(ayt.a(), account, strConcat);
                            } catch (alt e) {
                                if (amk.BAD_AUTHENTICATION.u.equals(e.getMessage())) {
                                    btv.d(null, "State bad authentication", new Object[0]);
                                    bum.a(context);
                                } else if (!amk.ACCOUNT_DELETED.u.equals(e.getMessage())) {
                                    btv.c(null, e, "Failed to check supervised account token", new Object[0]);
                                } else {
                                    btv.d(null, "State account deleted", new Object[0]);
                                    bum.a(context);
                                }
                            } catch (IOException e2) {
                                btv.b(null, e2, "Failed to check supervised account token, ignore for now", new Object[0]);
                            }
                        }
                    });
                    btv.c(null, "State all good", new Object[0]);
                    i = 0;
                }
            }
        } else {
            i = -1;
        }
        SupervisionDatabase supervisionDatabaseH = SupervisionDatabase.h();
        final bvp bvpVarK2 = supervisionDatabaseH.k();
        supervisionDatabaseH.a(new Runnable(bvpVarK2, i) { // from class: flm.bun
            private final bvp a;
            private final int b;

            {
                this.a = bvpVarK2;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bvp bvpVar = this.a;
                int i2 = this.b;
                Integer numE = bvpVar.e("key_last_supervision_state");
                if (numE == null) {
                    numE = -1;
                }
                if (numE.intValue() != i2) {
                    btt.a(numE, i2);
                    bvpVar.a("key_last_supervision_state", i2);
                }
            }
        });
        return i;
    }

    public static void a(int i) {
        boolean z;
        btv.c(null, "State recover:%s", Integer.valueOf(i));
        BaseApplicationContext baseApplicationContextA = ayt.a();
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) baseApplicationContextA.getSystemService("device_policy");
        switch (i) {
            case -1:
                if (bte.f(devicePolicyManager)) {
                    try {
                        buk.a();
                        return;
                    } catch (Throwable th) {
                        btv.b(null, th, "Failed to cleanup state", new Object[0]);
                        btt.a((String) null, th, "Failed to cleanup state", new Object[0]);
                        return;
                    }
                }
                return;
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
            case 2:
            case 4:
            case 102:
                return;
            case 1:
                Account accountC = bts.c();
                if (accountC != null) {
                    caw.a(accountC.name);
                    return;
                }
                return;
            case 3:
                SupervisionDatabase supervisionDatabaseH = SupervisionDatabase.h();
                bwg bwgVarB = supervisionDatabaseH.l().b(fdc.TYPE_IS_SUPERVISED, "");
                if (bwgVarB != null) {
                    try {
                        z = ((fcm) fin.b(fcm.g, bwgVarB.f)).b;
                    } catch (fjg e) {
                        btv.b(null, e, "Failed to parse supervised policy, ignore for now", new Object[0]);
                        z = false;
                    }
                    break;
                } else {
                    z = false;
                }
                if (bwgVarB == null || z) {
                    supervisionDatabaseH.d();
                    try {
                        bvp bvpVarK = supervisionDatabaseH.k();
                        long jB = bvpVarK.b("key_recovery_task_start_time_millis");
                        long jLongValue = ((Long) buw.g.b()).longValue();
                        if (jLongValue > 0 && btj.b() - jB > jLongValue) {
                            long jB2 = btj.b();
                            caw.c(euz.SUPERVISION_STATE_CHANGED);
                            bvpVarK.a("key_recovery_task_start_time_millis", jB2);
                        }
                        supervisionDatabaseH.f();
                        return;
                    } finally {
                        supervisionDatabaseH.e();
                    }
                }
                return;
            case 101:
                Account accountC2 = bts.c();
                dvl.a(accountC2);
                List listA = bhp.a((Context) baseApplicationContextA);
                List listA2 = bhp.a((Context) baseApplicationContextA, baseApplicationContextA.getPackageName());
                ArrayList arrayList = new ArrayList(bsy.a() ? listA : listA2);
                arrayList.remove(accountC2);
                a(arrayList, baseApplicationContextA);
                if (listA.size() > 1) {
                    btt.n();
                }
                if (!bsy.a() && listA2.size() > listA.size()) {
                    btt.m();
                    return;
                }
                return;
            case 103:
                baseApplicationContextA.startService(TimeLimitCheckingIntentOperation.a("state"));
                return;
            case 106:
                List listA3 = bts.a();
                listA3.remove(bts.c());
                a(dyu.a(SupervisionDatabase.h().q().c(dyu.a(listA3, bup.a)), buq.a), baseApplicationContextA);
                btt.m();
                return;
            default:
                btv.d(null, "Invalid device state %s", Integer.valueOf(i));
                return;
        }
    }

    private static void a(List list, Context context) {
        bek bekVarA = bek.a(context);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Account account = (Account) it.next();
            if (bts.b(account) && bekVarA != null) {
                String string = context.getString(R.string.kids_account_removed_body_2, account.name);
                bekVarA.a(account.name, R.id.kids_state_account_removed_notification_id, buc.a(context, android.R.drawable.ic_dialog_alert).setAutoCancel(true).setContentTitle(context.getString(R.string.kids_account_removed_title)).setContentText(string).setStyle(new Notification.BigTextStyle().bigText(string)).build());
            }
        }
    }

    static void a(Context context) {
        bek bekVarA = bek.a(context);
        if (bekVarA != null) {
            String string = context.getString(R.string.kids_account_invalid_title);
            String string2 = context.getString(R.string.kids_account_invalid_message);
            Notification.Builder style = buc.a(context, android.R.drawable.ic_dialog_alert).setAutoCancel(true).setContentTitle(string).setContentText(string2).setStyle(new Notification.BigTextStyle().bigText(string2));
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.google.android.apps.kids.familylink");
            if (launchIntentForPackage != null) {
                style.setContentIntent(PendingIntent.getActivity(context, 0, launchIntentForPackage, 134217728));
            }
            bekVarA.a(R.id.kids_state_account_invalid_notification_id, style.build());
        }
    }
}
