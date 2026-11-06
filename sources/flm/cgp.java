package flm;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cgp extends cep {
    public cgp(KidSetupViewModel kidSetupViewModel) {
        super(kidSetupViewModel);
    }

    @Override // flm.cep
    protected final String a() {
        return "PreLaunchCheckTask";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.cep
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final cia b() {
        cia ciaVar;
        final String stringExtra;
        final boolean zIsSupervisedAccountNonUnicorn;
        HashSet hashSet;
        final Intent intent = (Intent) this.b.b.a();
        Context context = this.a;
        Bundle extras = intent.getExtras();
        if (extras != null && extras.containsKey("flow_type")) {
            String string = extras.getString("flow_type");
            cia ciaVarA = cic.a(string);
            if (ciaVarA != null) {
                ciaVar = ciaVarA;
            } else {
                btv.e("KidSetup", "Unknown explicit flow type: %s.", string);
                ciaVar = cia.ABORT_WITH_RESULT_CANCELED;
            }
        } else if ("android.app.action.PROVISION_FINALIZATION".equals(intent.getAction())) {
            ciaVar = cia.SYNC_TAIL_FLOW;
        } else if ("com.google.android.gms.auth.addaccount.DM_PRE_ADD_ACCOUNT".equals(intent.getAction())) {
            ciaVar = cia.AUTH_ADD_FLOW;
        } else if ("com.google.android.gms.auth.removeaccount.DM_PRE_REMOVE_ACCOUNT".equals(intent.getAction())) {
            ciaVar = cia.SIGN_OUT_FLOW;
        } else if ("com.google.android.gms.kids.ADD_SECONDARY_ACCOUNT".equals(intent.getAction())) {
            ciaVar = cia.SECONDARY_SIGN_IN_FLOW;
        } else if (intent.hasCategory("android.intent.category.HOME")) {
            ciaVar = cia.SYNC_TAIL_FLOW;
        } else if (extras != null && extras.containsKey("is_setup_wizard")) {
            if (!extras.getBoolean("is_setup_wizard")) {
                ciaVar = cia.ADD_ACCOUNT_FLOW;
            } else if (extras.getBoolean("is_post_setup", false)) {
                ciaVar = cia.SYNC_TAIL_FLOW;
            } else {
                ciaVar = Settings.Secure.getInt(context.getContentResolver(), "user_setup_complete", 0) == 1 ? cia.DEFERRED_SETUP_FLOW : cia.OUT_OF_BOX_FLOW;
            }
        } else {
            btv.e("KidSetup", "Cannot determine flow type.", new Object[0]);
            ciaVar = cia.ABORT_WITH_RESULT_CANCELED;
        }
        if (ciaVar == cia.SYNC_TAIL_FLOW) {
            try {
                this.b.b().setStatusBarEnabled(false);
                this.b.b().setGoogleServicesActivityEnabled(true);
                final dvi dviVarA = col.a(this.a);
                if (dviVarA.a()) {
                    this.b.a(new coy(dviVarA) { // from class: flm.cgq
                        private final dvi a;

                        {
                            this.a = dviVarA;
                        }

                        @Override // flm.coy
                        public final Object a(Object obj) {
                            return cgp.a(this.a);
                        }
                    });
                    return cia.SYNC_TAIL_FLOW;
                }
            } catch (Exception e) {
            }
            return cia.ABORT_WITH_RESULT_OK;
        }
        if (ciaVar == cia.GELLER_FLOW) {
            stringExtra = intent.getStringExtra("geller_account");
            zIsSupervisedAccountNonUnicorn = true;
        } else {
            stringExtra = ((Account) dvl.a(this.b.b().getSupervisedAccount())).name;
            zIsSupervisedAccountNonUnicorn = this.b.b().isSupervisedAccountNonUnicorn();
        }
        dvl.a(!TextUtils.isEmpty(stringExtra));
        final String accountId = this.b.b().getAccountId(stringExtra);
        this.b.a(new coy(intent, stringExtra, accountId, zIsSupervisedAccountNonUnicorn) { // from class: flm.cgr
            private final Intent a;
            private final String b;
            private final String c;
            private final boolean d;

            {
                this.a = intent;
                this.b = stringExtra;
                this.c = accountId;
                this.d = zIsSupervisedAccountNonUnicorn;
            }

            @Override // flm.coy
            public final Object a(Object obj) {
                return cgp.a(this.a, this.b, this.c, this.d, (cij) obj);
            }
        });
        if (cic.b(ciaVar) && !intent.hasExtra("account")) {
            btv.c("KidSetup", "Intent does not contain the account to be added, aborting sign in...", new Object[0]);
            ciaVar = cia.ABORT_WITH_RESULT_CANCELED;
        }
        if (ciaVar == cia.SIGN_OUT_FLOW && intent.hasExtra("account")) {
            final Account account = (Account) intent.getParcelableExtra("account");
            if (!stringExtra.equals(account.name)) {
                if (!this.b.b().isCoexistenceEnabled()) {
                    btv.c("KidSetup", "Coexistence feature is not enabled, quitting the flow...", new Object[0]);
                    ciaVar = cia.ABORT_WITH_RESULT_CANCELED;
                } else {
                    this.b.a(new coy(account) { // from class: flm.cgs
                        private final Account a;

                        {
                            this.a = account;
                        }

                        @Override // flm.coy
                        public final Object a(Object obj) {
                            return cgp.a(this.a, (cij) obj);
                        }
                    });
                    ciaVar = cia.SECONDARY_SIGN_OUT_FLOW;
                }
            }
        }
        String suwLibraryFlows = this.b.b().getSuwLibraryFlows();
        duw duwVar = new duw(',');
        dvl.a(duwVar);
        dvo dvoVarA = new dvo(new dvp(duwVar)).a();
        duz duzVar = duz.a;
        dvl.a(duzVar);
        Iterable iterableA = new dvo(dvoVarA.c, dvoVarA.b, duzVar, dvoVarA.d).a((CharSequence) suwLibraryFlows);
        if (iterableA instanceof Collection) {
            hashSet = new HashSet((Collection) iterableA);
        } else {
            Iterator it = iterableA.iterator();
            hashSet = new HashSet();
            dyn.a(hashSet, it);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            cia ciaVarA2 = cic.a((String) it2.next());
            if (ciaVarA2 != null) {
                chz.a.add(ciaVarA2);
            }
        }
        btv.b("KidSetup", "%s: supervised account is %s, flow type is %s.", a(), stringExtra, cic.a(ciaVar));
        return ciaVar;
    }

    static final /* synthetic */ cij a(Account account, cij cijVar) {
        fio fioVar = (fio) cijVar.a(dp.au, (Object) null);
        fioVar.a((fin) cijVar);
        cik cikVar = (cik) fioVar;
        String str = account.name;
        cikVar.c();
        cij cijVar2 = (cij) cikVar.a;
        if (str == null) {
            throw new NullPointerException();
        }
        cijVar2.a |= 1024;
        cijVar2.l = str;
        return (cij) ((fin) cikVar.h());
    }

    static final /* synthetic */ cij a(Intent intent, String str, String str2, boolean z, cij cijVar) {
        fio fioVar = (fio) cijVar.a(dp.au, (Object) null);
        fioVar.a((fin) cijVar);
        cik cikVar = (cik) fioVar;
        String stringExtra = intent.getStringExtra("session_id");
        String string = TextUtils.isEmpty(stringExtra) ? UUID.randomUUID().toString() : stringExtra;
        cikVar.c();
        cij cijVar2 = (cij) cikVar.a;
        if (string == null) {
            throw new NullPointerException();
        }
        cijVar2.a |= 4;
        cijVar2.d = string;
        cikVar.c();
        cij cijVar3 = (cij) cikVar.a;
        if (str == null) {
            throw new NullPointerException();
        }
        cijVar3.a |= 8;
        cijVar3.e = str;
        cik cikVarA = cikVar.a(str2);
        cikVarA.c();
        cij cijVar4 = (cij) cikVarA.a;
        cijVar4.a |= 32;
        cijVar4.g = z;
        return (cij) ((fin) cikVarA.h());
    }

    static final /* synthetic */ cij a(dvi dviVar) {
        cij cijVar = (cij) dviVar.b();
        fio fioVar = (fio) cijVar.a(dp.au, (Object) null);
        fioVar.a((fin) cijVar);
        return (cij) ((fin) ((cik) fioVar).a(cia.SYNC_TAIL_FLOW).h());
    }
}
