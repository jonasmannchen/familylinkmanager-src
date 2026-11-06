package com.google.android.gms.kids.setup.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import com.google.android.gms.kids.aidl.IKidsInternalService;
import flm.ak;
import flm.ap;
import flm.as;
import flm.be;
import flm.bsq;
import flm.bsr;
import flm.btv;
import flm.cij;
import flm.cop;
import flm.coq;
import flm.cot;
import flm.cou;
import flm.cov;
import flm.coy;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class KidSetupViewModel extends AndroidViewModel {
    public final as b;
    public final ak c;
    public final HashMap d;
    private cij e;
    private final Object f;
    private final as g;
    private final ak h;
    private bsr i;

    public KidSetupViewModel(Application application) {
        super(application);
        this.e = cij.C;
        this.f = new Object();
        this.g = new as();
        this.b = new as();
        this.h = be.a(this.g, cop.a);
        this.c = be.a(this.h, coq.a);
        this.d = new HashMap();
        this.i = bsq.a(application);
    }

    public final synchronized IKidsInternalService b() {
        if (this.i == null) {
            this.i = bsq.a(this.a);
        } else if (this.i.a) {
            bsq.a(this.a, this.i);
            this.i = bsq.a(this.a);
        }
        return this.i.a();
    }

    public final synchronized void c() {
        if (this.i != null) {
            bsq.a(this.a, this.i);
        }
        this.i = bsq.a(this.a);
    }

    public final cij d() {
        cij cijVar;
        synchronized (this.f) {
            cijVar = this.e;
        }
        return cijVar;
    }

    public final cov a(cou couVar) {
        ap apVar = new ap();
        apVar.a(this.g, new cot(couVar, apVar));
        return new cov(apVar);
    }

    public final void a(coy coyVar) {
        synchronized (this.f) {
            this.e = (cij) coyVar.a(this.e);
            this.g.a(this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bg
    public final void a() {
        if (this.i != null) {
            if (!this.i.a) {
                btv.c("KidSetup", "Disconnecting Kids service...", new Object[0]);
                bsq.a(this.a, this.i);
            }
            this.i = null;
        }
    }
}
