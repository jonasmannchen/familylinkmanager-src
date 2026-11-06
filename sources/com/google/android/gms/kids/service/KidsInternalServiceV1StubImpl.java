package com.google.android.gms.kids.service;

import android.content.Context;
import android.database.CursorWindow;
import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.kids.database.SupervisionDatabase;
import com.google.android.gms.kids.internal.IKidsCursorWindowCallback;
import com.google.android.gms.kids.internal.IKidsService;
import flm.aqy;
import flm.btt;
import flm.btv;
import flm.bwg;
import flm.byv;
import flm.cas;
import flm.dvl;
import flm.fco;
import flm.fdc;
import flm.fee;
import flm.fib;
import flm.fin;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class KidsInternalServiceV1StubImpl extends IKidsService.Stub {
    private final KidsChimeraService a;

    KidsInternalServiceV1StubImpl(KidsChimeraService kidsChimeraService) {
        this.a = kidsChimeraService;
    }

    @Override // com.google.android.gms.kids.internal.IKidsService
    public CursorWindow getAppliedTimeLimit() {
        fee feeVar;
        SupervisionDatabase supervisionDatabaseH = SupervisionDatabase.h();
        try {
            bwg bwgVarB = supervisionDatabaseH.l().b(fdc.TYPE_TIME_LIMIT, "");
            dvl.a(bwgVarB);
            fco fcoVar = (fco) fin.b(fco.c, bwgVarB.f, fib.b());
            if (fcoVar.b == null) {
                feeVar = fee.f;
            } else {
                feeVar = fcoVar.b;
            }
            return cas.a(byv.a(supervisionDatabaseH, feeVar));
        } catch (Exception e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    @Override // com.google.android.gms.kids.internal.IKidsService
    public void getAppliedTimeLimitAsync(IKidsCursorWindowCallback iKidsCursorWindowCallback) {
        throw new UnsupportedOperationException();
    }

    @Override // flm.akl, android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        try {
            aqy.a((Context) this.a).a(Binder.getCallingUid());
            return super.onTransact(i, parcel, parcel2, i2);
        } catch (Throwable th) {
            btv.c("KidsService", th, "V1 transaction fails:%s", Integer.valueOf(i));
            btt.a("KidsService", th, "V1 transaction fails:%s", Integer.valueOf(i));
            throw th;
        }
    }
}
