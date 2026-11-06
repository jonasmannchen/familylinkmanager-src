package flm;

import android.accounts.Account;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.kids.database.SupervisionDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxk {
    private static final Object a = new Object();
    private final SupervisionDatabase b = SupervisionDatabase.h();
    private final Context c = ayt.a();
    private final DevicePolicyManager d = (DevicePolicyManager) this.c.getSystemService("device_policy");

    public static boolean a(String str, ekr... ekrVarArr) {
        return a(new String[]{str}, ekrVarArr);
    }

    public static boolean b(String str, ekr... ekrVarArr) {
        return new bxk().a(new String[]{str}, false, ekrVarArr);
    }

    public static boolean a(String[] strArr, ekr... ekrVarArr) {
        return new bxk().a(strArr, true, ekrVarArr);
    }

    private bxk() {
    }

    private final boolean a(String[] strArr, boolean z, ekr[] ekrVarArr) {
        boolean z2;
        long j;
        long jA;
        boolean zA;
        ekr ekrVar;
        String str;
        synchronized (a) {
            this.b.d();
            try {
                try {
                    buy buyVarJ = this.b.j();
                    HashMap map = new HashMap();
                    HashMap map2 = new HashMap();
                    Bundle bundle = new Bundle();
                    ArrayList arrayList = new ArrayList();
                    z2 = true;
                    if (z) {
                        long jA2 = a(ekrVarArr);
                        j = jA2;
                        jA = (3 & jA2) == 0 ? 0L : ((-1) ^ jA2) & 3;
                    } else {
                        j = 0;
                        jA = a(ekrVarArr);
                    }
                    for (String str2 : strArr) {
                        long jC = buyVarJ.c(str2);
                        buyVarJ.a(str2, j, jA);
                        long jC2 = buyVarJ.c(str2);
                        boolean z3 = jC2 != 0;
                        if (bbz.GOOGLE_NOW_PACKAGE_NAME.equals(str2)) {
                            if (z3) {
                                bte.b();
                            } else {
                                bte.a();
                            }
                            zA = true;
                        } else if (btb.a.getPackageName().equals(str2)) {
                            btv.d("App", "Can not disable myself", new Object[0]);
                            btt.a("App", "DisableSelf", "Shouldn't disable myself", new Object[0]);
                            zA = true;
                        } else if (this.d.isApplicationHidden(btb.a, str2) == z3) {
                            zA = true;
                        } else {
                            if (z3) {
                                this.b.j().a(str2);
                            } else {
                                this.b.j().a(str2, 16L, 0L);
                            }
                            zA = a(str2, z3);
                        }
                        z2 &= zA;
                        if (jC != jC2) {
                            if (jC2 == 0) {
                                str = "enabled";
                            } else if ((1 & jC2) == 1) {
                                str = "disabled_permanently";
                            } else if ((2 & jC2) == 2) {
                                str = "disabled_by_parent";
                            } else if ((4 & jC2) == 4) {
                                str = "disabled_until_updated";
                            } else {
                                btt.a("App", "AppState", "Don't understand app disable reasons: %s", Long.valueOf(jC2));
                                str = "enabled";
                            }
                            bundle.putString(str2, str);
                        }
                        if (jC2 != 0) {
                            if ((1 & jC2) == 1) {
                                ekrVar = ekr.POLICY_BLACKLIST;
                            } else if ((2 & jC2) == 2) {
                                ekrVar = ekr.POLICY_PARENT;
                            } else if ((4 & jC2) == 4) {
                                ekrVar = ekr.POLICY_MIN_VERSION;
                            } else {
                                btt.a("App", "AppState", "Don't understand app disable reasons: %s", Long.valueOf(jC2));
                                ekrVar = ekr.UNKNOWN;
                            }
                            ContentValues contentValues = new ContentValues(2);
                            contentValues.put("package_name", str2);
                            contentValues.put("disabled_reason", Integer.valueOf(ekrVar.e));
                            arrayList.add(contentValues);
                        }
                        (z3 ? map2 : map).put(str2, new sj(a(Long.valueOf(jC)), a(Long.valueOf(jC2))));
                        btv.a("App", "%s will have reasons %s", str2, Long.valueOf(jC2));
                    }
                    a(strArr, arrayList);
                    if (!bundle.keySet().isEmpty()) {
                        btv.c("App", "Broadcasting app state change intent", new Object[0]);
                        Intent intent = new Intent("com.google.android.libraries.kids.supervision.apps.APP_STATE_CHANGED");
                        intent.setPackage("com.android.vending");
                        intent.putExtra("disabled_apps_by_state", bundle);
                        intent.putExtra("account_name", bts.b());
                        this.c.sendBroadcast(intent);
                    }
                    int iB = bum.b();
                    Account accountC = bts.c();
                    btt.a(map, map2, iB, accountC != null && bts.a(accountC));
                    this.b.f();
                    this.b.e();
                } catch (Exception e) {
                    btv.c("App", e, "Failed to enable/disable app", new Object[0]);
                    this.b.e();
                    return false;
                }
            } catch (Throwable th) {
                this.b.e();
                throw th;
            }
        }
        return z2;
    }

    private final boolean a(String str, boolean z) throws Exception {
        boolean z2;
        try {
            boolean applicationHidden = this.d.setApplicationHidden(btb.a, str, z);
            if (this.d.isApplicationHidden(btb.a, str) == z) {
                return true;
            }
            btv.d("App", "hideApp failed for %s, %s", str, Boolean.valueOf(z));
            try {
                this.c.getPackageManager().getApplicationInfo(str, btb.c);
                if (z) {
                    Iterator<ComponentName> it = this.d.getActiveAdmins().iterator();
                    while (true) {
                        z2 = applicationHidden;
                        if (!it.hasNext()) {
                            break;
                        }
                        ComponentName next = it.next();
                        if (next.getPackageName().equals(str)) {
                            this.d.removeActiveAdmin(next);
                            applicationHidden = this.d.setApplicationHidden(btb.a, str, true);
                            if (this.d.isApplicationHidden(btb.a, str)) {
                                return true;
                            }
                        } else {
                            applicationHidden = z2;
                        }
                    }
                } else {
                    z2 = applicationHidden;
                }
                if (z2) {
                    Object[] objArr = new Object[2];
                    objArr[0] = z ? "disable" : "enable";
                    objArr[1] = str;
                    btt.a("Policy", "AppEnabledFailed", "Failed to %s %s, but system said it succeeded.", objArr);
                } else {
                    btt.a(z, str);
                }
                return false;
            } catch (PackageManager.NameNotFoundException e) {
                return true;
            }
        } catch (Exception e2) {
            btt.a("Policy", e2, "setApplicationHidden threw exception", new Object[0]);
            throw e2;
        }
    }

    private static long a(ekr[] ekrVarArr) {
        long j = 0;
        for (ekr ekrVar : ekrVarArr) {
            switch (ekrVar.ordinal()) {
                case 1:
                    j |= 2;
                    break;
                case 2:
                    j |= 1;
                    break;
                case 3:
                    j |= 4;
                    break;
                default:
                    btt.a("App", "", "Don't understand app disable reasons: %s", ekrVar);
                    break;
            }
        }
        return j;
    }

    private static Set a(Long l) {
        HashSet hashSet = new HashSet();
        if (l != null) {
            if ((l.longValue() & 1) == 1) {
                hashSet.add(101);
            }
            if ((l.longValue() & 2) == 2) {
                hashSet.add(100);
            }
            if ((l.longValue() & 4) == 4) {
                hashSet.add(102);
            }
        }
        return hashSet;
    }

    private final void a(String[] strArr, List list) {
        btv.b("App", "Send app state change to FamilyLink: %s", strArr);
        Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.libraries.kids.supervision.apps").build();
        ContentResolver contentResolver = this.c.getContentResolver();
        ContentValues[] contentValuesArr = (ContentValues[]) list.toArray(new ContentValues[list.size()]);
        try {
            for (String str : strArr) {
                contentResolver.delete(uriBuild, str, null);
            }
            if (contentResolver.bulkInsert(uriBuild, contentValuesArr) != contentValuesArr.length) {
                btv.d("App", "Not all app state are updated to FamilyLink", new Object[0]);
                btt.a("App", "AppState", "Not all app state are updated to FamilyLink", new Object[0]);
            }
        } catch (IllegalArgumentException e) {
            btv.d("App", "FamilyLink is not available, so can't update app state to it", new Object[0]);
        }
    }
}
