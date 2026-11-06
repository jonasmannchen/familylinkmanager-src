package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Keep;
import com.google.android.chimera.Activity;
import flm.ave;
import flm.axl;
import flm.axm;
import flm.axn;
import flm.ayg;
import flm.bav;
import flm.ln;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class LifecycleCallback {
    public final axm f;

    @Keep
    private static axm getChimeraLifecycleFragmentImpl(axl axlVar) {
        if (bav.IS_PACKAGE_SIDE) {
            return ave.a((Activity) axlVar.a);
        }
        throw new IllegalStateException("Method not available in SDK.");
    }

    public static axm a(axl axlVar) {
        if (axlVar.a instanceof ln) {
            return ayg.a((ln) axlVar.a);
        }
        if (axlVar.a instanceof android.app.Activity) {
            return axn.a((android.app.Activity) axlVar.a);
        }
        if (bav.IS_PACKAGE_SIDE) {
            if (bav.IS_PACKAGE_SIDE && (axlVar.a instanceof Activity)) {
                return getChimeraLifecycleFragmentImpl(axlVar);
            }
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    public LifecycleCallback(axm axmVar) {
        this.f = axmVar;
    }

    public final android.app.Activity f() {
        return this.f.a();
    }

    public void a(Bundle bundle) {
    }

    public void a() {
    }

    public void e() {
    }

    public void b(Bundle bundle) {
    }

    public void a(int i, int i2, Intent intent) {
    }

    public void b() {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
