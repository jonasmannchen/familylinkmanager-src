package flm;

import android.content.ComponentName;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bmq {
    private static final ComponentName a;

    public static String a(String str) {
        String strValueOf = String.valueOf(str);
        return strValueOf.length() != 0 ? "com.google.android.gms.family.".concat(strValueOf) : new String("com.google.android.gms.family.");
    }

    public static Intent a(bmr bmrVar) {
        return new Intent().setComponent(a).putExtras(bmrVar.a());
    }

    static {
        new ComponentName("com.google.android.gms", "com.google.android.gms.family.v2.manage.DeleteMemberActivity");
        new ComponentName("com.google.android.gms", "com.google.android.gms.family.v2.create.FamilyCreationActivity");
        new ComponentName("com.google.android.gms", "com.google.android.gms.family.v2.invites.SendInvitationsActivity");
        a = new ComponentName("com.google.android.gms", "com.google.android.gms.family.v2.manage.FamilyManagementActivity");
    }
}
