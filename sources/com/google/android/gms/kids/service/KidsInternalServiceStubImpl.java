package com.google.android.gms.kids.service;

import android.accounts.Account;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.database.CursorWindow;
import android.os.Binder;
import android.os.Parcel;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.kids.aidl.IKidsInternalService;
import com.google.android.gms.kids.database.SupervisionDatabase;
import com.google.android.gms.kids.features.timelimit.TimeLimitCheckingIntentOperation;
import flm.alt;
import flm.aqy;
import flm.ayt;
import flm.baw;
import flm.bbx;
import flm.bbz;
import flm.bhq;
import flm.bjb;
import flm.bpp;
import flm.bsy;
import flm.bta;
import flm.btb;
import flm.btc;
import flm.bte;
import flm.btj;
import flm.btl;
import flm.bts;
import flm.btt;
import flm.btv;
import flm.btw;
import flm.bty;
import flm.bud;
import flm.bue;
import flm.buj;
import flm.buk;
import flm.bul;
import flm.buw;
import flm.bvp;
import flm.bvw;
import flm.bvx;
import flm.bxi;
import flm.bxj;
import flm.bxk;
import flm.bxn;
import flm.bzg;
import flm.bzh;
import flm.cak;
import flm.cal;
import flm.car;
import flm.caw;
import flm.ccx;
import flm.cdu;
import flm.cdv;
import flm.dp;
import flm.dvj;
import flm.dvl;
import flm.dyu;
import flm.eho;
import flm.ehp;
import flm.ehq;
import flm.ehs;
import flm.eht;
import flm.ehu;
import flm.ehv;
import flm.ehw;
import flm.ehx;
import flm.ehy;
import flm.eia;
import flm.eib;
import flm.eic;
import flm.eid;
import flm.eie;
import flm.eig;
import flm.eih;
import flm.eii;
import flm.ekr;
import flm.elz;
import flm.esq;
import flm.esr;
import flm.ess;
import flm.eta;
import flm.etb;
import flm.etu;
import flm.etv;
import flm.eug;
import flm.euh;
import flm.eui;
import flm.euo;
import flm.eup;
import flm.euq;
import flm.euz;
import flm.evh;
import flm.evi;
import flm.evj;
import flm.evx;
import flm.evy;
import flm.exy;
import flm.exz;
import flm.eya;
import flm.eyc;
import flm.eyd;
import flm.eye;
import flm.eyg;
import flm.eyh;
import flm.eyi;
import flm.eys;
import flm.eyt;
import flm.eyu;
import flm.eyw;
import flm.eyx;
import flm.ezn;
import flm.ezp;
import flm.ezq;
import flm.ezs;
import flm.ezt;
import flm.ezu;
import flm.faa;
import flm.fab;
import flm.fac;
import flm.fdc;
import flm.fdp;
import flm.fgy;
import flm.fin;
import flm.fio;
import flm.fiv;
import flm.fjg;
import flm.fjo;
import flm.fkp;
import flm.fqc;
import flm.fqd;
import flm.fql;
import flm.fqx;
import flm.fqy;
import flm.fuf;
import flm.fuh;
import flm.fvd;
import flm.fvg;
import flm.gkn;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class KidsInternalServiceStubImpl extends IKidsInternalService.Stub {
    private static final List a = Arrays.asList("com.google.android.apps.kids.familylink", "com.google.android.apps.kids.familylinkmanager", "com.google.android.apps.kids.familylinkhelper", "com.google.android.apps.kids.home");
    private static final String[] b = {"com.google.android.apps.walletnfcrel"};
    private final Context c;

    public KidsInternalServiceStubImpl(Context context) {
        this.c = context;
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public Account getSupervisedAccount() {
        return bts.c();
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public boolean hasMultipleAccounts() {
        return bts.a().size() > 1;
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public String getAccountId(String str) {
        dvl.a(!TextUtils.isEmpty(str), "Email is not set");
        try {
            return bts.a(str);
        } catch (alt | IOException e) {
            btv.c("KidsService", e, "Failed to get the Gaia ID of supervised account.", new Object[0]);
            throw new IllegalStateException(e);
        }
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public boolean isSupervisedAccountNonUnicorn() {
        Account supervisedAccount = getSupervisedAccount();
        dvl.b(supervisedAccount != null, "No supervised account found on this device");
        return bts.a(supervisedAccount);
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public String getStoredSupervisedAccountName() {
        String strA = SupervisionDatabase.h().k().a("key_supervised_account");
        if (TextUtils.isEmpty(strA)) {
            btv.d("KidsService", "No stored supervised account name was found in the DB", new Object[0]);
            btt.a("KidsService", "getStoredSupervisedAccountName", "No stored supervised account name was found in the DB", new Object[0]);
        }
        return strA;
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public void setPolicyLevel(int i) {
        new Object[1][0] = Integer.valueOf(i);
        SupervisionDatabase.h().k().a("key_policy_level", i);
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public CursorWindow reportDeviceInfo() {
        bty.a(this.c);
        try {
            return btc.a((fdp) dvl.a(bxn.a(true, euz.BOOTSTRAP, true)));
        } catch (bxj e) {
            btv.c("KidsService", e, "Failed to report device info to the server.", new Object[0]);
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public CursorWindow initializeDeviceSetup(String str) {
        new Object[1][0] = str;
        try {
            eyu eyuVarA = cal.a().a(cal.c(), (eys) ((fin) ((eyt) ((fio) eys.d.a(dp.au, (Object) null))).a(str).b(btl.a()).h()));
            SupervisionDatabase.h().k().a("key_supervision_exit_permalock_required", eyuVarA.c);
            return btc.a(eyuVarA);
        } catch (alt | fvg e) {
            btv.c("KidsService", e, "Error occurred while making gRPC calls to initialize device setup.", new Object[0]);
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public CursorWindow listFamilyMembers(boolean z) {
        ezt eztVar = (ezt) ((fio) ezs.c.a(dp.au, (Object) null));
        eztVar.c();
        ezs ezsVar = (ezs) eztVar.a;
        if ("mine" == 0) {
            throw new NullPointerException();
        }
        ezsVar.a |= 2;
        ezsVar.b = "mine";
        ezs ezsVar2 = (ezs) ((fin) eztVar.h());
        try {
            car carVarA = cal.a();
            baw bawVarA = cal.a(z);
            if (car.g == null) {
                car.g = fuf.a(fuh.UNARY, "google.kidsmanagement.v1.KidsManagementService/ListMembers", gkn.a(ezs.c), gkn.a(ezu.c));
            }
            return btc.a((ezu) carVarA.a.a(car.g, bawVarA, ezsVar2, 10000L, TimeUnit.MILLISECONDS));
        } catch (alt | fvg e) {
            btv.c("KidsService", e, "Error occurred while making gRPC calls to list family members.", new Object[0]);
            throw new IllegalStateException(e.getMessage(), e);
        }
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
    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public CursorWindow getAppsInfo(String str) {
        exz exzVar = (exz) ((fio) exy.d.a(dp.au, (Object) null));
        exzVar.c();
        exy exyVar = (exy) exzVar.a;
        if (str == null) {
            throw new NullPointerException();
        }
        exyVar.a |= 2;
        exyVar.b = str;
        List arrayList = new ArrayList();
        Iterator<ResolveInfo> it = ayt.a().getPackageManager().queryIntentActivities(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER"), 0).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().activityInfo.packageName);
        }
        exzVar.c();
        exy exyVar2 = (exy) exzVar.a;
        if (!exyVar2.c.a()) {
            exyVar2.c = fin.a(exyVar2.c);
        }
        List list = exyVar2.c;
        fiv.a(arrayList);
        if (arrayList instanceof fjo) {
            List listD = ((fjo) arrayList).d();
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
        } else if (arrayList instanceof fkp) {
            list.addAll(arrayList);
        } else {
            if ((list instanceof ArrayList) && (arrayList instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
            }
            int size3 = list.size();
            for (Object obj2 : arrayList) {
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
        exy exyVar3 = (exy) ((fin) exzVar.h());
        try {
            car carVarA = cal.a();
            baw bawVarC = cal.c();
            if (car.c == null) {
                car.c = fuf.a(fuh.UNARY, "google.kidsmanagement.v1.KidsManagementService/GetAppsInfo", gkn.a(exy.d), gkn.a(eya.c));
            }
            return btc.a((eya) carVarA.a.a(car.c, bawVarC, exyVar3, 10000L, TimeUnit.MILLISECONDS));
        } catch (alt | fvg e) {
            btv.c("KidsService", e, "Error occurred while making gRPC calls to list apps.", new Object[0]);
            throw new IllegalStateException(e.getMessage(), e);
        }
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
    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public void batchUpdateApps(String str, Map map, boolean z, boolean z2) {
        List arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            etv etvVar = (etv) ((fio) etu.d.a(dp.au, (Object) null));
            boolean z3 = !((Boolean) entry.getValue()).booleanValue();
            etvVar.c();
            etu etuVar = (etu) etvVar.a;
            etuVar.a |= 1;
            etuVar.b = z3;
            if (((String) entry.getKey()).equals(bbz.GOOGLE_NOW_PACKAGE_NAME)) {
                boolean z4 = !z;
                etvVar.c();
                etu etuVar2 = (etu) etvVar.a;
                etuVar2.a |= 8;
                etuVar2.c = z4;
            }
            etb etbVarA = ((etb) ((fio) eta.f.a(dp.au, (Object) null))).a((String) entry.getKey());
            etbVarA.c();
            eta etaVar = (eta) etbVarA.a;
            etaVar.d = (etu) ((fin) etvVar.h());
            etaVar.a |= 4;
            arrayList.add((eta) ((fin) etbVarA.h()));
        }
        euh euhVar = (euh) ((fio) eug.d.a(dp.au, (Object) null));
        euhVar.c();
        eug eugVar = (eug) euhVar.a;
        if (str == null) {
            throw new NullPointerException();
        }
        eugVar.a |= 2;
        eugVar.b = str;
        euhVar.c();
        eug eugVar2 = (eug) euhVar.a;
        if (!eugVar2.c.a()) {
            eugVar2.c = fin.a(eugVar2.c);
        }
        List list = eugVar2.c;
        fiv.a(arrayList);
        if (arrayList instanceof fjo) {
            List listD = ((fjo) arrayList).d();
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
        } else if (arrayList instanceof fkp) {
            list.addAll(arrayList);
        } else {
            if ((list instanceof ArrayList) && (arrayList instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
            }
            int size3 = list.size();
            for (Object obj2 : arrayList) {
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
        eug eugVar3 = (eug) ((fin) euhVar.h());
        try {
            car carVarA = cal.a();
            baw bawVarA = cal.a(z2);
            if (car.b == null) {
                car.b = fuf.a(fuh.UNARY, "google.kidsmanagement.v1.KidsManagementService/BatchUpdateApps", gkn.a(eug.d), gkn.a(eui.a));
            }
        } catch (alt | fvg e) {
            btv.c("KidsService", e, "Error occurred while making gRPC call to batch update apps.", new Object[0]);
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public void setGoogleServicesActivityEnabled(boolean z) {
        Settings.Secure.putInt(this.c.getContentResolver(), "setup_wizard_suppress_google_services_screen_for_unicorn", z ? 0 : 1);
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public void disableBlacklistedApps() {
        if (!bxk.a(b, ekr.POLICY_BLACKLIST)) {
            throw new IllegalStateException("Failed to disable blacklisted apps.");
        }
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public void addPersistentPreferredActivity(IntentFilter intentFilter, ComponentName componentName) {
        ((DevicePolicyManager) this.c.getSystemService("device_policy")).addPersistentPreferredActivity(btb.a, intentFilter, componentName);
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public void setStatusBarEnabled(boolean z) {
        bul.a(!z);
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public void turnOffFamilyLinkSupervision() {
        bte.a(this.c, true);
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public boolean syncPolicies() {
        try {
            ccx.a(euz.BOOTSTRAP);
            return true;
        } catch (bxj e) {
            btv.c("KidsService", e, "Failed to sync policies.", new Object[0]);
            return false;
        }
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public List applyHideAppPolicies() {
        try {
            return dyu.a(ccx.a(euz.BOOTSTRAP, fdc.TYPE_HIDE_APP), cdu.a);
        } catch (bxi e) {
            btv.c("KidsService", e, "Failed to apply hide app policies.", new Object[0]);
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public boolean applyAllButHideAppPolicies() {
        try {
            ccx.a(euz.BOOTSTRAP, fdc.TYPE_HIDE_APP);
            return true;
        } catch (bxi e) {
            btv.c("KidsService", e, "Failed to apply policies.", new Object[0]);
            return false;
        }
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public boolean isAppOnlyDisabledByMinVersion(String str) {
        return SupervisionDatabase.h().j().b(str);
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public CursorWindow initializeSupervision(String str, String str2) {
        Object[] objArr = {str, str2};
        try {
            return btc.a(cal.a().a(cal.c(), (eyw) ((fin) ((eyx) ((fio) eyw.f.a(dp.au, (Object) null))).a(str).b(btl.a()).c(str2).a(btw.a(Settings.Secure.getInt(ayt.a().getContentResolver(), "location_mode", 0)).f).h())));
        } catch (alt | fvg e) {
            btv.c("KidsService", e, "Error occurred while making gRPC call to initialize supervision.", new Object[0]);
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public void finishDeviceSetup() {
        this.c.sendBroadcast(new Intent("android.server.checkin.CHECKIN_NOW").setPackage("com.google.android.gms"));
        buk.a(euz.FORCED_SYNC);
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public void scheduleSafetyNetJob(int i, String str, String str2, String str3, boolean z) {
        caw.a(i, str, str2, str3, z);
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public void scheduleFinishDeviceSetupJob() {
        this.c.sendBroadcast(new Intent("android.server.checkin.CHECKIN_NOW").setPackage("com.google.android.gms"));
        caw.a(2, (String) null, (String) null);
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public String reauth(String str, String str2) {
        try {
            Context context = this.c;
            buj.a();
            return (String) buj.a(context, str, "me", str2, new ArrayList()).c();
        } catch (IOException | InterruptedException | JSONException e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            btv.c("KidsService", e, "Failed to send reauth request.", new Object[0]);
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public String reauthWithParentDelegation(String str, String str2, String str3) {
        try {
            Context context = this.c;
            buj.a();
            return (String) buj.a(context, str, str2, str3, dyu.a(Pair.create("delegationType", "unicorn"))).c();
        } catch (IOException | InterruptedException | JSONException e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            btv.c("KidsService", e, "Failed to send reauth request.", new Object[0]);
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public void unlockTimeLimit() {
        this.c.startService(TimeLimitCheckingIntentOperation.a());
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public boolean verifyParentAccessCode(String str) {
        new Object[1][0] = str;
        boolean zA = bud.a("KidsService", str);
        if (!zA) {
            try {
                Thread.sleep(((Long) buw.j.b()).longValue());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        return zA;
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public boolean verifyParentAccessCodeAndUnlockTimeLimit(String str) {
        boolean zA = bud.a("KidsService", str);
        if (zA) {
            unlockTimeLimit();
        }
        return zA;
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public void removeSupervisedAccount(String str, boolean z) {
        new Object[1][0] = str;
        Account accountC = bts.c();
        if (accountC == null || !accountC.name.equals(str)) {
            btv.d("KidsService", "Account to be removed does not exist.", new Object[0]);
            return;
        }
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) this.c.getSystemService("device_policy");
        SupervisionDatabase supervisionDatabaseH = SupervisionDatabase.h();
        supervisionDatabaseH.d();
        try {
            try {
                devicePolicyManager.setAccountManagementDisabled(btb.a, "com.google", false);
                supervisionDatabaseH.k().a("key_supervised_account", (String) null);
                if (z) {
                    btt.o();
                }
                if (!bts.b(accountC)) {
                    devicePolicyManager.setAccountManagementDisabled(btb.a, "com.google", isNativeAccountManagementEnabled() ? false : true);
                } else {
                    supervisionDatabaseH.f();
                    btt.a("KidsService", "accountRemoval", "Supervised account removed in KidsInternalServiceStubImpl", new Object[0]);
                }
                supervisionDatabaseH.e();
            } catch (Exception e) {
                btt.a("KidsService", e, "Failed to remove supervised account.", new Object[0]);
                throw new IllegalStateException("Failed to remove supervised account.", e);
            }
        } catch (Throwable th) {
            supervisionDatabaseH.e();
            throw th;
        }
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public void revokeSupervision() throws Throwable {
        buk.a();
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public boolean isCoexistenceEnabled() {
        return bsy.a();
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public boolean isSecondaryAccountSignInEnabled() {
        return bsy.c();
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public boolean isNativeAccountManagementEnabled() {
        return fql.b();
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public CursorWindow fetchConsentInfoForSecondaryAccount(String str) {
        dvl.a(!TextUtils.isEmpty(str), "Child ID is not set.");
        eyd eydVar = (eyd) ((fio) eyc.c.a(dp.au, (Object) null));
        eydVar.c();
        eyc eycVar = (eyc) eydVar.a;
        if (str == null) {
            throw new NullPointerException();
        }
        eycVar.a |= 2;
        eycVar.b = str;
        eyc eycVar2 = (eyc) ((fin) eydVar.h());
        try {
            car carVarA = cal.a();
            baw bawVarD = cal.d();
            if (car.h == null) {
                car.h = fuf.a(fuh.UNARY, "google.kidsmanagement.v1.KidsManagementService/GetConsentInfoForSecondaryAccountSignIn", gkn.a(eyc.c), gkn.a(eye.c));
            }
            return btc.a((eye) carVarA.a.a(car.h, bawVarD, eycVar2, 10000L, TimeUnit.MILLISECONDS));
        } catch (alt | fvg e) {
            btv.c("KidsService", e, "Error occurred while making gRPC calls to get consent info forsigning in with secondary account", new Object[0]);
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public void savePartialConsentForSecondaryAccountSignIn(String str, String str2, String str3) {
        dvl.a(!TextUtils.isEmpty(str), "Parent ID is not set.");
        dvl.a(!TextUtils.isEmpty(str2), "Parent's RAPT is not set.");
        dvl.a(TextUtils.isEmpty(str3) ? false : true, "Secondary account sign-in consent text version is not set.");
        bvw bvwVar = new bvw();
        bvwVar.b = str;
        bvwVar.c = str2;
        bvwVar.d = str3;
        bvwVar.e = btj.b();
        bvx bvxVarO = SupervisionDatabase.h().o();
        bvwVar.a = 0;
        bvxVarO.a(bvwVar);
        try {
            cal.a(str, str2);
        } catch (alt | IOException e) {
            btv.c("KidsService", e, "Error while calling getToken for signing in with secondary account", new Object[0]);
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public void removeSecondaryAccount(String str, String str2, String str3) {
        dvl.a(!TextUtils.isEmpty(str), "Secondary account email is not set.");
        dvl.a(!TextUtils.isEmpty(str2), "Parent ID is not set.");
        dvl.a(TextUtils.isEmpty(str3) ? false : true, "Parent's RAPT is not set.");
        if (str.equals(bts.b())) {
            btv.e("KidsService", "Attempted to remove supervised account.", new Object[0]);
            throw new IllegalArgumentException("Attempted to remove supervised account.");
        }
        for (Account account : bts.a()) {
            if (account.name.equals(str)) {
                try {
                    cal.a().a(cal.a(str2, str3), (evx) ((fin) ((evy) ((fio) evx.d.a(dp.au, (Object) null))).a(dvj.b(bts.a(bts.b()))).a(((evi) ((fio) evh.f.a(dp.au, (Object) null))).a(evj.SIGN_OUT).a(btl.a()).b(account.name).c("v190963178")).h()));
                    btv.a("KidsService", "Wrote consent for secondary account sign-out to server successfully.", new Object[0]);
                    btt.a("KidsService", "accountRemoval", "Secondary account removed in KidsInternalServiceStubImpl", new Object[0]);
                    btt.q();
                    if (!bts.b(account)) {
                        btv.e("KidsService", "Failed to remove secondary account.", new Object[0]);
                        throw new IllegalStateException("Failed to remove secondary account.");
                    }
                    return;
                } catch (Exception e) {
                    btv.c("KidsService", e, "Failure when writing secondary account sign-out consent to server.", new Object[0]);
                    throw new IllegalStateException("Failure when writing secondary account sign-out consent to server.", e);
                }
            }
        }
        btv.d("KidsService", "Secondary account for removal not found.", new Object[0]);
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public void startService(String str, String str2) {
        this.c.startService(bta.a(this.c, str, str2));
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public CursorWindow listSupervisableDevices(String str) {
        new Object[1][0] = str;
        fab fabVar = (fab) ((fio) faa.c.a(dp.au, (Object) null));
        long jA = bhq.a(this.c);
        fabVar.c();
        faa faaVar = (faa) fabVar.a;
        faaVar.a |= 2;
        faaVar.b = jA;
        faa faaVar2 = (faa) ((fin) fabVar.h());
        try {
            car carVarA = cal.a();
            baw bawVarA = cal.a(str);
            if (car.m == null) {
                car.m = fuf.a(fuh.UNARY, "google.kidsmanagement.v1.KidsManagementService/ListSupervisableDevices", gkn.a(faa.c), gkn.a(fac.d));
            }
            return btc.a((fac) carVarA.a.a(car.m, bawVarA, faaVar2, 10000L, TimeUnit.MILLISECONDS));
        } catch (alt | fvg e) {
            btv.c("KidsService", e, "Error occurred while making gRPC calls to list supervisable devices.", new Object[0]);
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public String acceptPairing(String str, String str2) {
        Object[] objArr = {str2, str};
        esr esrVar = (esr) ((fio) esq.e.a(dp.au, (Object) null));
        esrVar.c();
        esq esqVar = (esq) esrVar.a;
        if (str == null) {
            throw new NullPointerException();
        }
        esqVar.a |= 2;
        esqVar.b = str;
        String strA = bpp.a(this.c);
        esrVar.c();
        esq esqVar2 = (esq) esrVar.a;
        if (strA == null) {
            throw new NullPointerException();
        }
        esqVar2.a |= 16;
        esqVar2.d = strA;
        String strA2 = btl.a();
        esrVar.c();
        esq esqVar3 = (esq) esrVar.a;
        if (strA2 == null) {
            throw new NullPointerException();
        }
        esqVar3.a |= 8;
        esqVar3.c = strA2;
        esq esqVar4 = (esq) ((fin) esrVar.h());
        try {
            car carVarA = cal.a();
            baw bawVarA = cal.a(str2);
            if (car.k == null) {
                car.k = fuf.a(fuh.UNARY, "google.kidsmanagement.v1.KidsManagementService/AcceptPairing", gkn.a(esq.e), gkn.a(ess.c));
            }
            ess essVar = (ess) carVarA.a.a(car.k, bawVarA, esqVar4, 10000L, TimeUnit.MILLISECONDS);
            new Object[1][0] = essVar.b;
            return essVar.b;
        } catch (alt e) {
            btv.c("KidsService", e, "Auth error occurred while making gRPC call to GetOnboardingInitiator", new Object[0]);
            throw new IllegalStateException(e.getMessage(), e);
        } catch (fvg e2) {
            fvd fvdVar = e2.a.m;
            btv.c("KidsService", "gRPC %s error occurred while making call to GetOnboardingInitiator", fvdVar);
            switch (fvdVar.ordinal()) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    throw new IllegalStateException("StatusException should never have code OK", e2);
                case 5:
                    return null;
                default:
                    btv.c("KidsService", e2, "Unexpected gRPC %s error occurred while making call to GetOnboardingInitiator", fvdVar);
                    throw new IllegalStateException(e2.getMessage(), e2);
            }
        }
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public CursorWindow getOnboardingInitiator(String str, String str2) {
        new Object[1][0] = str;
        eyh eyhVar = (eyh) ((fio) eyg.c.a(dp.au, (Object) null));
        eyhVar.c();
        eyg eygVar = (eyg) eyhVar.a;
        if (str == null) {
            throw new NullPointerException();
        }
        eygVar.a |= 2;
        eygVar.b = str;
        eyg eygVar2 = (eyg) ((fin) eyhVar.h());
        try {
            car carVarA = cal.a();
            baw bawVarA = cal.a(str2);
            if (car.l == null) {
                car.l = fuf.a(fuh.UNARY, "google.kidsmanagement.v1.KidsManagementService/GetOnboardingInitiator", gkn.a(eyg.c), gkn.a(eyi.f));
            }
            return btc.a((eyi) carVarA.a.a(car.l, bawVarA, eygVar2, 10000L, TimeUnit.MILLISECONDS));
        } catch (alt e) {
            btv.c("KidsService", e, "Auth error occurred while making gRPC call to GetOnboardingInitiator", new Object[0]);
            throw new IllegalStateException(e.getMessage(), e);
        } catch (fvg e2) {
            fvd fvdVar = e2.a.m;
            btv.c("KidsService", "gRPC %s error occurred while making call to GetOnboardingInitiator", fvdVar);
            switch (fvdVar.ordinal()) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    throw new IllegalStateException("StatusException should never have code OK", e2);
                case 5:
                case 7:
                    return null;
                default:
                    btv.c("KidsService", e2, "Unexpected gRPC %s error occurred while making call to GetOnboardingInitiator", fvdVar);
                    throw new IllegalStateException(e2.getMessage(), e2);
            }
        }
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public void cancelOnboarding(String str, String str2) {
        new Object[1][0] = str;
        dvl.a(!TextUtils.isEmpty(str));
        dvl.a(!TextUtils.isEmpty(str2));
        eup eupVar = (eup) ((fio) euo.c.a(dp.au, (Object) null));
        eupVar.c();
        euo euoVar = (euo) eupVar.a;
        if (str == null) {
            throw new NullPointerException();
        }
        euoVar.a |= 2;
        euoVar.b = str;
        euo euoVar2 = (euo) ((fin) eupVar.h());
        try {
            car carVarA = cal.a();
            baw bawVarA = cal.a(str2);
            if (car.n == null) {
                car.n = fuf.a(fuh.UNARY, "google.kidsmanagement.v1.KidsManagementService/CancelOnboarding", gkn.a(euo.c), gkn.a(euq.a));
            }
        } catch (alt e) {
            btv.c("KidsService", e, "Auth error occurred while making gRPC call to CancelOnboarding", new Object[0]);
            throw new IllegalStateException(e.getMessage(), e);
        } catch (fvg e2) {
            fvd fvdVar = e2.a.m;
            btv.c("KidsService", "gRPC %s error occurred while making call to CancelOnboarding", fvdVar);
            if (fvdVar != fvd.NOT_FOUND) {
                btv.c("KidsService", e2, "Unexpected gRPC %s error occurred while making call to CancelOnboarding", fvdVar);
                throw new IllegalStateException(e2.getMessage(), e2);
            }
        }
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public CursorWindow acceptInvitation(String str, String str2) {
        Object[] objArr = {str2, str};
        dvl.a(!TextUtils.isEmpty(str));
        ehp ehpVar = (ehp) ((fio) eho.e.a(dp.au, (Object) null));
        ehs ehsVarA = a();
        ehpVar.c();
        eho ehoVar = (eho) ehpVar.a;
        if (ehsVarA == null) {
            throw new NullPointerException();
        }
        ehoVar.b = ehsVarA;
        ehoVar.a |= 1;
        ehpVar.c();
        eho ehoVar2 = (eho) ehpVar.a;
        if (str == null) {
            throw new NullPointerException();
        }
        ehoVar2.a |= 2;
        ehoVar2.c = str;
        ehpVar.c();
        eho ehoVar3 = (eho) ehpVar.a;
        ehoVar3.a |= 4;
        ehoVar3.d = true;
        eho ehoVar4 = (eho) ((fin) ehpVar.h());
        try {
            cak cakVarB = cal.b();
            baw bawVarA = cal.a(str2);
            if (cak.d == null) {
                cak.d = fuf.a(fuh.UNARY, "google.familymanagement.v1.FamilyManagementService/AcceptInvitation", gkn.a(eho.e), gkn.a(ehq.a));
            }
            return btc.a((ehq) cakVarB.a.a(cak.d, bawVarA, ehoVar4, 10000L, TimeUnit.MILLISECONDS));
        } catch (alt | fvg e) {
            btv.c("KidsService", e, "Error occurred while making gRPC call to AcceptInvitation", new Object[0]);
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public void removeAllAccountsExcept(String str) {
        new Object[1][0] = str;
        for (Account account : bts.a()) {
            if (!account.name.equals(str)) {
                bts.b(account);
            }
        }
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public CursorWindow optInSupervision(String str, String str2) {
        Account account;
        new Object[1][0] = str;
        dvl.a(TextUtils.isEmpty(str2) ? false : true);
        dvl.b(bte.f((DevicePolicyManager) this.c.getSystemService("device_policy")));
        Iterator it = bts.a().iterator();
        do {
            if (!it.hasNext()) {
                account = null;
                break;
            }
            account = (Account) it.next();
        } while (!str.equals(account.name));
        Account account2 = (Account) dvl.a(account);
        eid eidVar = (eid) ((fio) eic.e.a(dp.au, (Object) null));
        ehs ehsVarA = a();
        eidVar.c();
        eic eicVar = (eic) eidVar.a;
        if (ehsVarA == null) {
            throw new NullPointerException();
        }
        eicVar.b = ehsVarA;
        eicVar.a |= 1;
        String strA = btl.a();
        eidVar.c();
        eic eicVar2 = (eic) eidVar.a;
        if (strA == null) {
            throw new NullPointerException();
        }
        eicVar2.a |= 2;
        eicVar2.c = strA;
        ehv ehvVar = (ehv) ((fio) ehu.c.a(dp.au, (Object) null));
        ehx ehxVar = (ehx) ((fio) ehw.d.a(dp.au, (Object) null));
        ehxVar.c();
        ehw ehwVar = (ehw) ehxVar.a;
        if (str2 == null) {
            throw new NullPointerException();
        }
        ehwVar.b = 2;
        ehwVar.c = str2;
        ehvVar.c();
        ehu ehuVar = (ehu) ehvVar.a;
        ehuVar.b = (ehw) ((fin) ehxVar.h());
        ehuVar.a |= 1;
        eidVar.c();
        eic eicVar3 = (eic) eidVar.a;
        eicVar3.d = (ehu) ((fin) ehvVar.h());
        eicVar3.a |= 4;
        eic eicVar4 = (eic) ((fin) eidVar.h());
        try {
            cak cakVarB = cal.b();
            baw bawVarA = cal.a(str);
            if (cak.b == null) {
                cak.b = fuf.a(fuh.UNARY, "google.familymanagement.v1.FamilyManagementService/OptInSupervision", gkn.a(eic.e), gkn.a(eie.a));
            }
            eie eieVar = (eie) cakVarB.a.a(cak.b, bawVarA, eicVar4, 10000L, TimeUnit.MILLISECONDS);
            try {
                bts.a(account2);
                Account accountC = bts.c();
                long jB = ((fqd) fqc.a.a()).b();
                for (int i = 0; i < jB && accountC == null; i++) {
                    new Object[1][0] = Integer.valueOf(i);
                    Thread.sleep(1000L);
                    accountC = bts.c();
                }
                dvl.a(accountC, "Account did not register as supervised after waiting for 10 seconds.");
                return btc.a(eieVar);
            } catch (alt e) {
                e = e;
                btv.c("KidsService", e, "Error while refreshing tokens", new Object[0]);
                throw new IllegalStateException(e.getMessage(), e);
            } catch (IOException e2) {
                e = e2;
                btv.c("KidsService", e, "Error while refreshing tokens", new Object[0]);
                throw new IllegalStateException(e.getMessage(), e);
            } catch (InterruptedException e3) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e3);
            }
        } catch (alt | fvg e4) {
            btv.c("KidsService", e4, "Error occurred while making gRPC call to OptInSupervision", new Object[0]);
            throw new IllegalStateException(e4.getMessage(), e4);
        }
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public void optOutSupervision() {
        if (bts.c() != null) {
            new Object[1][0] = bts.c();
            caw.c();
            try {
                eih eihVar = (eih) ((fio) eig.d.a(dp.au, (Object) null));
                ehs ehsVarA = a();
                eihVar.c();
                eig eigVar = (eig) eihVar.a;
                if (ehsVarA == null) {
                    throw new NullPointerException();
                }
                eigVar.b = ehsVarA;
                eigVar.a |= 1;
                String strA = bts.a(bts.b());
                eihVar.c();
                eig eigVar2 = (eig) eihVar.a;
                if (strA == null) {
                    throw new NullPointerException();
                }
                eigVar2.a |= 2;
                eigVar2.c = strA;
                eig eigVar3 = (eig) ((fin) eihVar.h());
                cak cakVarB = cal.b();
                baw bawVarD = cal.d();
                if (cak.c == null) {
                    cak.c = fuf.a(fuh.UNARY, "google.familymanagement.v1.FamilyManagementService/OptOutSupervision", gkn.a(eig.d), gkn.a(eii.a));
                }
                bue.a(ayt.a());
                Account accountC = bts.c();
                if (accountC != null) {
                    try {
                        bts.a(accountC);
                    } catch (alt | IOException e) {
                        btv.c("KidsService", e, "Error while refreshing tokens", new Object[0]);
                    }
                }
            } catch (alt e2) {
                e = e2;
                btv.c("KidsService", e, "Error occurred while making gRPC call to OptOutSupervision", new Object[0]);
                throw new IllegalStateException(e.getMessage(), e);
            } catch (fvg e3) {
                e = e3;
                btv.c("KidsService", e, "Error occurred while making gRPC call to OptOutSupervision", new Object[0]);
                throw new IllegalStateException(e.getMessage(), e);
            } catch (IOException e4) {
                e = e4;
                btv.c("KidsService", e, "Error occurred while making gRPC call to OptOutSupervision", new Object[0]);
                throw new IllegalStateException(e.getMessage(), e);
            }
        }
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public int getMemberSvExitState() {
        return SupervisionDatabase.h().k().d("key_in_gl_sign_out");
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public void setMemberSvExitState(int i) {
        new Object[1][0] = Integer.valueOf(i);
        SupervisionDatabase.h().k().a("key_in_gl_sign_out", i);
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public CursorWindow getLockdownInfo() {
        long j;
        bvp bvpVarK = SupervisionDatabase.h().k();
        boolean zF = bvpVarK.f("key_supervision_exit_permalock_required");
        boolean zD = ((fqd) fqc.a.a()).d();
        long jB = btj.b();
        long jB2 = bvpVarK.b("key_supervision_exit_lock_start_timestamp");
        if (jB2 == 0) {
            if (zD) {
                bvpVarK.a("key_supervision_exit_lock_start_timestamp", jB);
            }
            j = jB;
        } else {
            j = jB2;
        }
        long jB3 = bvpVarK.b("key_supervision_exit_lock_duration_timestamp");
        long jF = jB3 == 0 ? ((fqd) fqc.a.a()).f() : jB3;
        Object[] objArr = {Long.valueOf(j), Long.valueOf(jF)};
        bzh bzhVarA = ((bzh) ((fio) bzg.f.a(dp.au, (Object) null))).a((j + jF) - jB);
        bzhVarA.c();
        bzg bzgVar = (bzg) bzhVarA.a;
        bzgVar.a |= 2;
        bzgVar.c = jF;
        bzhVarA.c();
        bzg bzgVar2 = (bzg) bzhVarA.a;
        bzgVar2.a |= 4;
        bzgVar2.d = zD;
        bzhVarA.c();
        bzg bzgVar3 = (bzg) bzhVarA.a;
        bzgVar3.a |= 8;
        bzgVar3.e = zF;
        return btc.a((bzg) ((fin) bzhVarA.h()));
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public void setLockdownInfoForPermalock(boolean z) {
        SupervisionDatabase.h().k().a("key_supervision_exit_permalock_required", z);
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public void clearLockdownInfo() {
        SupervisionDatabase.h().k().a();
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public CursorWindow listManagedDevices() {
        try {
            String strA = bts.a(bts.b());
            new Object[1][0] = strA;
            ezp ezpVar = (ezp) ((fio) ezn.d.a(dp.au, (Object) null));
            ezpVar.c();
            ezn eznVar = (ezn) ezpVar.a;
            eznVar.a |= 4;
            eznVar.c = false;
            ezpVar.c();
            ezn eznVar2 = (ezn) ezpVar.a;
            if (strA == null) {
                throw new NullPointerException();
            }
            eznVar2.a |= 2;
            eznVar2.b = strA;
            ezn eznVar3 = (ezn) ((fin) ezpVar.h());
            car carVarA = cal.a();
            baw bawVarD = cal.d();
            if (car.d == null) {
                car.d = fuf.a(fuh.UNARY, "google.kidsmanagement.v1.KidsManagementService/ListDevices", gkn.a(ezn.d), gkn.a(ezq.c));
            }
            return btc.a((ezq) carVarA.a.a(car.d, bawVarD, eznVar3, 10000L, TimeUnit.MILLISECONDS));
        } catch (alt | fvg | IOException e) {
            btv.c("KidsService", e, "Error occurred while making gRPC calls to list devices.", new Object[0]);
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    @Override // flm.akl, android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        try {
            if (!bhq.b()) {
                int callingUid = Binder.getCallingUid();
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    if (bjb.a(this.c, callingUid, (String) it.next())) {
                        aqy.a(this.c).a(callingUid);
                    }
                }
                throw new SecurityException(new StringBuilder(38).append("Invalid caller of kids API:").append(callingUid).toString());
            }
            return super.onTransact(i, parcel, parcel2, i2);
        } catch (Throwable th) {
            btv.c("KidsService", th, "Internal transaction fails:%s", Integer.valueOf(i));
            btt.a("KidsService", th, "Internal transaction fails:%s", Integer.valueOf(i));
            throw th;
        }
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public void logToClearcutFromUi(int i, CursorWindow cursorWindow, String str, long j, long j2) {
        try {
            btt.a(i, (elz) btc.a(cursorWindow, cdv.a), str, j, j2);
        } catch (fjg e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    private final ehs a() {
        eht ehtVar = (eht) ((fio) ehs.c.a(dp.au, (Object) null));
        eib eibVar = (eib) ((fio) eia.d.a(dp.au, (Object) null));
        ehy ehyVar = ehy.ANDROID_GMSCORE;
        eibVar.c();
        eia eiaVar = (eia) eibVar.a;
        if (ehyVar == null) {
            throw new NullPointerException();
        }
        eiaVar.a |= 2;
        eiaVar.c = ehyVar.b;
        String strValueOf = String.valueOf(ModuleManager.get(this.c).getCurrentModule().moduleVersion);
        eibVar.c();
        eia eiaVar2 = (eia) eibVar.a;
        if (strValueOf == null) {
            throw new NullPointerException();
        }
        eiaVar2.a |= 1;
        eiaVar2.b = strValueOf;
        ehtVar.c();
        ehs ehsVar = (ehs) ehtVar.a;
        ehsVar.b = (eia) ((fin) eibVar.h());
        ehsVar.a |= 4;
        return (ehs) ((fin) ehtVar.h());
    }

    @Override // com.google.android.gms.kids.aidl.IKidsInternalService
    public String getSuwLibraryFlows() {
        return ((fqy) fqx.a.a()).a();
    }
}
