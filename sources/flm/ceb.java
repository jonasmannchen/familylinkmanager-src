package flm;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.kids.setup.KidSetupChimeraActivity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ceb extends bpo {
    private final /* synthetic */ KidSetupChimeraActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceb(KidSetupChimeraActivity kidSetupChimeraActivity, Context context) {
        super(context);
        this.a = kidSetupChimeraActivity;
    }

    @Override // flm.bpo
    public final void a(Context context, Intent intent) {
        cih.a(this.a).d = true;
        Activity containerActivity = this.a.getContainerActivity();
        Account account = new Account(this.a.a.d().e, "com.google");
        String stringExtra = intent.getStringExtra("help_topic");
        String stringExtra2 = intent.getStringExtra("fallback_url");
        if (!TextUtils.isEmpty(stringExtra)) {
            GoogleHelp googleHelp = new GoogleHelp(stringExtra);
            bnk bnkVar = new bnk();
            bnkVar.a = 0;
            bnkVar.b = bnk.a(containerActivity);
            googleHelp.t = bnkVar;
            googleHelp.c = account;
            if (!TextUtils.isEmpty(stringExtra2)) {
                googleHelp.q = Uri.parse(stringExtra2);
            }
            brn brnVarA = bqp.a(containerActivity);
            Intent intentPutExtra = new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", googleHelp);
            bdi.checkNotNull(brnVarA.h);
            bda.toVoidTask(brn.g.a(brnVarA.e, brnVarA.h, intentPutExtra));
        }
    }
}
