package com.google.android.gms.kids.service;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import flm.aqy;
import flm.bbn;
import flm.boj;
import flm.bon;
import flm.boo;
import flm.btv;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class KidsApiChimeraService extends boj {
    public KidsApiChimeraService() {
        super(42, "com.google.android.gms.kids.service.START", Collections.emptySet(), 1, 10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // flm.boj
    public final void a(bon bonVar, bbn bbnVar) {
        btv.b("KidsService", "client version: %s", Integer.valueOf(bbnVar.getClientLibraryVersion()));
        String callingPackage = bbnVar.getCallingPackage();
        if (TextUtils.isEmpty(callingPackage)) {
            throw new IllegalArgumentException("invalid package name");
        }
        aqy.a((Context) this).a(callingPackage);
        try {
            bonVar.a.onPostInitComplete(0, new KidsApiStub(new boo(this, this.a, this.b)).asBinder(), null);
        } catch (RemoteException e) {
        }
    }
}
