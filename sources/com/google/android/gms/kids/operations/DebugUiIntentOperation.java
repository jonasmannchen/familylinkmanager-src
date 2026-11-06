package com.google.android.gms.kids.operations;

import com.google.android.gms.kids.admin.RegisterProfileOwnerChimeraActivity;
import flm.anx;
import flm.any;
import flm.buw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class DebugUiIntentOperation extends anx {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // flm.anx
    public final any a() {
        if (!((Boolean) buw.h.b()).booleanValue()) {
            return null;
        }
        any anyVar = new any(RegisterProfileOwnerChimeraActivity.getDebugIntent(this), 2, "KidsDebug");
        anyVar.f = true;
        return anyVar;
    }
}
