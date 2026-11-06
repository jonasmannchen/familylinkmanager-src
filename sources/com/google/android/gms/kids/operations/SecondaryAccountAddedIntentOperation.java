package com.google.android.gms.kids.operations;

import android.accounts.Account;
import android.app.Notification;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.database.SupervisionDatabase;
import flm.alt;
import flm.amb;
import flm.ayt;
import flm.baw;
import flm.bek;
import flm.bsy;
import flm.bte;
import flm.btl;
import flm.bts;
import flm.btt;
import flm.btv;
import flm.buc;
import flm.bvw;
import flm.bvx;
import flm.cal;
import flm.car;
import flm.dp;
import flm.dvi;
import flm.dvj;
import flm.dvl;
import flm.dvm;
import flm.dyk;
import flm.euk;
import flm.eul;
import flm.eum;
import flm.evh;
import flm.evi;
import flm.evj;
import flm.evx;
import flm.evy;
import flm.fin;
import flm.fio;
import flm.fpy;
import flm.fpz;
import flm.fqf;
import flm.fuf;
import flm.fuh;
import flm.fvg;
import flm.gkn;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class SecondaryAccountAddedIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        List list;
        Throwable th;
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) ayt.a().getSystemService("device_policy");
        if (!bsy.a() || !bte.f(devicePolicyManager)) {
            return;
        }
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("accountsAdded");
        if (parcelableArrayExtra == null || parcelableArrayExtra.length == 0) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(parcelableArrayExtra.length);
            for (Parcelable parcelable : parcelableArrayExtra) {
                arrayList.add((Account) parcelable);
            }
            list = arrayList;
        }
        if (list.isEmpty()) {
            btv.c("System", "Dropping account change broadcast because no account was added. Must have been triggered by removed or mutated accounts.", new Object[0]);
            return;
        }
        Account accountC = bts.c();
        if (accountC == null) {
            btv.c("System", "Dropping account change broadcast because no supervised account is present.", new Object[0]);
            return;
        }
        ArrayList arrayList2 = new ArrayList(list);
        arrayList2.remove(accountC);
        if (arrayList2.isEmpty()) {
            btv.c("System", "Dropping account change broadcast because only the supervised account has been added. No secondary accounts have been added.", new Object[0]);
            return;
        }
        bvx bvxVarO = SupervisionDatabase.h().o();
        bvw bvwVarA = bvxVarO.a();
        if (bvwVarA == null) {
            btv.e("System", "Unable to write consent for secondary account sign-in to server because there was no partial consent saved locally.", new Object[0]);
            return;
        }
        if (arrayList2.size() > 1) {
            btv.e("System", "Unable to write consent for secondary account sign-in to server because more than one account was added at once. Can't tell to which one the consent refers.", new Object[0]);
            a(ayt.a(), arrayList2);
            bvxVarO.a(bvwVarA.c);
            return;
        }
        Account account = (Account) arrayList2.get(0);
        if (!bsy.c()) {
            btv.d("System", "Won't try to write consent for secondary account sign-in to server because secondary account sign-in is disabled. Unless Phenotype sync disabling the flag happened exactly during sign-in, this shouldn't happen.", new Object[0]);
            a(ayt.a(), arrayList2);
            bvxVarO.a(bvwVarA.c);
            return;
        }
        try {
            eul eulVar = (eul) ((fio) euk.c.a(dp.au, (Object) null));
            eulVar.c();
            euk eukVar = (euk) eulVar.a;
            if ("me" == 0) {
                throw new NullPointerException();
            }
            eukVar.a |= 2;
            eukVar.b = "me";
            euk eukVar2 = (euk) ((fin) eulVar.h());
            car carVarA = cal.a();
            final String str = account.name;
            dvi dviVarC = dyk.c(bts.a(), new dvm(str) { // from class: flm.can
                private final String a;

                {
                    this.a = str;
                }

                @Override // flm.dvm
                public final boolean a(Object obj) {
                    return this.a.equals(((Account) obj).name);
                }
            });
            dvl.a(dviVarC.a(), "No account found with name %s", str);
            baw bawVarAddGrantedScope = cal.a((Account) dviVarC.b()).addGrantedScope(fqf.c());
            if (car.i == null) {
                car.i = fuf.a(fuh.UNARY, "google.kidsmanagement.v1.KidsManagementService/CanSignInSecondaryAccount", gkn.a(euk.c), gkn.a(eum.c));
            }
            if (!((eum) carVarA.a.a(car.i, bawVarAddGrantedScope, eukVar2, 10000L, TimeUnit.MILLISECONDS)).b) {
                btv.d("System", "The secondary account that was added is not allowed. Removing it.", new Object[0]);
                a(ayt.a(), arrayList2);
                bvxVarO.a(bvwVarA.c);
                return;
            }
            try {
                cal.a().a(cal.a(bvwVarA.b, bvwVarA.c), (evx) ((fin) ((evy) ((fio) evx.d.a(dp.au, (Object) null))).a(dvj.b(bts.a(bts.b()))).a(((evi) ((fio) evh.f.a(dp.au, (Object) null))).a(evj.SIGN_IN).a(btl.a()).b(account.name).c(bvwVarA.d)).h()));
                btv.a("System", "Wrote consent for secondary account sign-in to server successfully.", new Object[0]);
                btt.p();
            } catch (alt | fvg | IOException e) {
                btv.c("System", e, "Failure when writing secondary account sign-in consent to server.", new Object[0]);
                a(ayt.a(), arrayList2);
            }
            bvxVarO.a(bvwVarA.c);
        } catch (alt e2) {
            th = e2;
            if (((fpz) fpy.a.a()).d() || !(th instanceof amb)) {
                btv.b("System", th, "Failure when calling server to check whether secondary account is allowed. Removing it.", new Object[0]);
                a(ayt.a(), arrayList2);
                bvxVarO.a(bvwVarA.c);
            }
            btv.b("System", th, "Failure when calling server to check whether secondary account is allowed. Ignoring it and keeping the account.", new Object[0]);
        } catch (fvg e3) {
            th = e3;
            if (((fpz) fpy.a.a()).d()) {
            }
            btv.b("System", th, "Failure when calling server to check whether secondary account is allowed. Removing it.", new Object[0]);
            a(ayt.a(), arrayList2);
            bvxVarO.a(bvwVarA.c);
        }
    }

    private static void a(Context context, List list) {
        bek bekVarA = bek.a(context);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Account account = (Account) it.next();
            if (bts.b(account)) {
                if (bekVarA != null) {
                    String string = context.getString(R.string.kids_account_removed_body_2, account.name);
                    bekVarA.a(account.name, R.id.kids_state_account_removed_notification_id, buc.a(context, android.R.drawable.ic_dialog_alert).setAutoCancel(true).setContentTitle(context.getString(R.string.kids_account_removed_title)).setContentText(string).setStyle(new Notification.BigTextStyle().bigText(string)).build());
                }
                btt.m();
            }
        }
    }
}
