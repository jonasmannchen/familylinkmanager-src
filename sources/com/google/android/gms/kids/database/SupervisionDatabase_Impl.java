package com.google.android.gms.kids.database;

import flm.bp;
import flm.br;
import flm.bs;
import flm.buy;
import flm.buz;
import flm.bvf;
import flm.bvg;
import flm.bvj;
import flm.bvk;
import flm.bvp;
import flm.bvq;
import flm.bvt;
import flm.bvu;
import flm.bvx;
import flm.bvy;
import flm.bwb;
import flm.bwc;
import flm.bwi;
import flm.bwj;
import flm.bwn;
import flm.cf;
import flm.ci;
import flm.cq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class SupervisionDatabase_Impl extends SupervisionDatabase {
    private volatile buy f;
    private volatile bvp g;
    private volatile bwb h;
    private volatile bvj i;
    private volatile bvt j;
    private volatile bvx k;
    private volatile bwj l;
    private volatile bvf m;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cn
    public final bp a(cf cfVar) {
        cq cqVar = new cq(cfVar, new bwi(this, 16), "a7719730905a8ef358258285b082de24", "1d43eabaa90855bf2d2cf53b27fdfede");
        bs bsVar = new bs(cfVar.b);
        bsVar.b = cfVar.c;
        bsVar.c = cqVar;
        if (bsVar.c == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        if (bsVar.a == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        return cfVar.a.a(new br(bsVar.a, bsVar.b, bsVar.c));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cn
    public final ci a() {
        return new ci(this, "ActivitySampleEntity", "AppPendingDisableEntity", "AppStateEntity", "ConsentStatusEntity", "DeviceEventEntity", "GeonotificationStateEntity", "KeyValue", "KidsModuleInfo", "LocationSampleEntity", "PartialConsentForSecondaryAccountSignIn", "PolicyEntity", "TimeLimitKeyValueEntity", "TimeLimitLocalOverrideEntity", "TrackedPlace");
    }

    @Override // com.google.android.gms.kids.database.SupervisionDatabase
    public final buy j() {
        buy buyVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            if (this.f == null) {
                this.f = new buz(this);
            }
            buyVar = this.f;
        }
        return buyVar;
    }

    @Override // com.google.android.gms.kids.database.SupervisionDatabase
    public final bvp k() {
        bvp bvpVar;
        if (this.g != null) {
            return this.g;
        }
        synchronized (this) {
            if (this.g == null) {
                this.g = new bvq(this);
            }
            bvpVar = this.g;
        }
        return bvpVar;
    }

    @Override // com.google.android.gms.kids.database.SupervisionDatabase
    public final bwb l() {
        bwb bwbVar;
        if (this.h != null) {
            return this.h;
        }
        synchronized (this) {
            if (this.h == null) {
                this.h = new bwc(this);
            }
            bwbVar = this.h;
        }
        return bwbVar;
    }

    @Override // com.google.android.gms.kids.database.SupervisionDatabase
    public final bvj m() {
        bvj bvjVar;
        if (this.i != null) {
            return this.i;
        }
        synchronized (this) {
            if (this.i == null) {
                this.i = new bvk(this);
            }
            bvjVar = this.i;
        }
        return bvjVar;
    }

    @Override // com.google.android.gms.kids.database.SupervisionDatabase
    public final bvt n() {
        bvt bvtVar;
        if (this.j != null) {
            return this.j;
        }
        synchronized (this) {
            if (this.j == null) {
                this.j = new bvu(this);
            }
            bvtVar = this.j;
        }
        return bvtVar;
    }

    @Override // com.google.android.gms.kids.database.SupervisionDatabase
    public final bvx o() {
        bvx bvxVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            if (this.k == null) {
                this.k = new bvy(this);
            }
            bvxVar = this.k;
        }
        return bvxVar;
    }

    @Override // com.google.android.gms.kids.database.SupervisionDatabase
    public final bwj p() {
        bwj bwjVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new bwn(this);
            }
            bwjVar = this.l;
        }
        return bwjVar;
    }

    @Override // com.google.android.gms.kids.database.SupervisionDatabase
    public final bvf q() {
        bvf bvfVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new bvg(this);
            }
            bvfVar = this.m;
        }
        return bvfVar;
    }
}
