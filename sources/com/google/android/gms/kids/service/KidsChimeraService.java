package com.google.android.gms.kids.service;

import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import com.google.android.chimera.Service;
import flm.dvj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class KidsChimeraService extends Service {
    /* JADX WARN: Multi-variable type inference failed */
    public final IBinder onBind(Intent intent) {
        if (!"com.google.android.gms.kids.service.START".equals(intent.getAction())) {
            return null;
        }
        String schemeSpecificPart = "v1";
        Uri data = intent.getData();
        if (data != null && "kids".equals(data.getScheme())) {
            schemeSpecificPart = data.getSchemeSpecificPart();
        }
        switch (dvj.b(schemeSpecificPart)) {
            case "v2":
                return new KidsInternalServiceStubImpl(this).asBinder();
            case "v1":
            default:
                return new KidsInternalServiceV1StubImpl(this).asBinder();
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
