package com.google.android.gms.kids.service;

import android.database.CursorWindow;
import com.google.android.gms.kids.internal.IKidsCursorWindowCallback;
import com.google.android.gms.kids.internal.IKidsService;
import flm.boo;
import flm.bop;
import flm.boq;
import flm.bos;
import flm.cdt;
import flm.cqw;
import flm.duc;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class KidsApiStub extends IKidsService.Stub implements bos {
    private final boo a;

    KidsApiStub(boo booVar) {
        this.a = booVar;
    }

    @Override // com.google.android.gms.kids.internal.IKidsService
    public CursorWindow getAppliedTimeLimit() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.kids.internal.IKidsService
    public void getAppliedTimeLimitAsync(IKidsCursorWindowCallback iKidsCursorWindowCallback) throws Throwable {
        boo booVar = this.a;
        cdt cdtVar = new cdt(iKidsCursorWindowCallback);
        ExecutorService executorService = booVar.f;
        cqw cqwVarA = booVar.i.a(cdtVar.b(), bop.a);
        Throwable th = null;
        try {
            executorService.execute(duc.a(new boq(booVar, cdtVar)));
            if (cqwVarA != null) {
                cqwVarA.close();
            }
        } catch (Throwable th2) {
            th = th2;
            if (cqwVarA != null) {
                if (th != null) {
                    cqwVarA.close();
                } else {
                    cqwVarA.close();
                }
            }
            throw th;
        }
    }
}
