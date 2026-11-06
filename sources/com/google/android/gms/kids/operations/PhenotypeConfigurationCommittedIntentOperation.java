package com.google.android.gms.kids.operations;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import flm.btv;
import flm.buk;
import flm.bum;
import flm.euz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class PhenotypeConfigurationCommittedIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if (intent == null || !"com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction())) {
            btv.d("System", "PhenotypeConfigurationCommittedIntentOperation received invalid intent", new Object[0]);
            return;
        }
        if (!"com.google.android.gms.kids".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            btv.b("System", "New Phenotype configuration committed, but package isn't %s, skipping setup", "com.google.android.gms.kids");
        } else if (!bum.a()) {
            btv.b("System", "New Phenotype configuration committed, but state isn't ALL_GOOD, skipping setup", new Object[0]);
        } else {
            btv.b("System", "New Phenotype configuration committed, triggering setup", new Object[0]);
            buk.a(euz.PHENOTYPE_FLAG_COMMITTED);
        }
    }
}
