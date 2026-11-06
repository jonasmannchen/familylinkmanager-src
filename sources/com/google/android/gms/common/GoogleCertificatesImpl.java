package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.util.DynamiteApi;
import flm.anw;
import flm.apt;
import flm.apv;
import flm.apz;
import flm.aqi;
import flm.aqj;
import flm.aqo;
import flm.aqq;
import flm.aqz;
import flm.arb;
import flm.bcr;
import flm.blq;
import flm.blt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@DynamiteApi
@KeepName
public final class GoogleCertificatesImpl extends bcr {
    @Override // flm.bcq
    @Deprecated
    public final blq getGoogleCertificates() {
        HashSet hashSet;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, aqo.a());
        HashSet hashSet2 = new HashSet();
        Context contextA = a();
        if (contextA == null) {
            hashSet = new HashSet();
        } else {
            SystemClock.elapsedRealtime();
            for (PackageInfo packageInfo : contextA.getPackageManager().getInstalledPackages(64)) {
                String str = packageInfo.packageName;
                byte[] byteArray = (packageInfo.signatures == null || packageInfo.signatures.length != 1) ? null : packageInfo.signatures[0].toByteArray();
                if (byteArray != null && a(new arb(str, byteArray))) {
                    hashSet2.add(new aqj(byteArray));
                }
            }
            hashSet = hashSet2;
        }
        arrayList.addAll(hashSet);
        return blt.a((aqi[]) arrayList.toArray(new aqi[0]));
    }

    @Override // flm.bcq
    @Deprecated
    public final blq getGoogleReleaseCertificates() {
        return blt.a(aqo.a());
    }

    @Override // flm.bcq
    @Deprecated
    public final boolean isGoogleSigned(String str, blq blqVar) {
        arb arbVar = new arb(str, new aqj((byte[]) blt.a(blqVar)));
        return a(arbVar, null) || a(arbVar);
    }

    @Override // flm.bcq
    @Deprecated
    public final boolean isGoogleReleaseSigned(String str, blq blqVar) {
        return a(new arb(str, new aqj((byte[]) blt.a(blqVar))), null);
    }

    @Override // flm.bcq
    public final boolean isGoogleOrPlatformSigned(aqq aqqVar, blq blqVar) {
        if (aqqVar.b == null) {
            return false;
        }
        aqz aqzVar = null;
        if (blqVar != null) {
            aqzVar = new aqz((PackageManager) blt.a(blqVar));
        }
        String str = aqqVar.a;
        arb arbVar = new arb(str, aqqVar.b);
        if (a(arbVar, aqzVar)) {
            return true;
        }
        if (!a(arbVar)) {
            return false;
        }
        if (aqqVar.c) {
            return true;
        }
        if (!aqqVar.d && apz.a(a(), str)) {
            Log.w("GoogleCertificatesImpl", String.valueOf(str).concat(" is signed with test keys"));
            return true;
        }
        return false;
    }

    private final boolean a(arb arbVar, aqz aqzVar) {
        aqi aqiVarA;
        if (!arbVar.a(apt.a())) {
            boolean z = aqzVar != null && aqzVar.b && aqz.a.contains(arbVar.a) && (aqiVarA = aqzVar.a()) != null && aqiVarA.equals(arbVar.b);
            if (!z) {
                return false;
            }
        }
        return true;
    }

    private static Context a() {
        Context context = anw.a;
        if (context == null) {
            throw new IllegalStateException("Missing DynamiteApplicationContext.");
        }
        return context;
    }

    private static boolean a(arb arbVar) {
        apv apvVar = apt.a;
        if (arbVar.d == null) {
            arbVar.d = arb.a(arbVar.c, "*");
        }
        if (apvVar.a(arbVar.d)) {
            return true;
        }
        return arbVar.a(apt.b());
    }
}
