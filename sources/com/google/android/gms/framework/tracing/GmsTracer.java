package com.google.android.gms.framework.tracing;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import flm.bnz;
import flm.cqt;
import flm.cqw;
import flm.dvz;
import java.io.Closeable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class GmsTracer extends AbstractGmsTracer implements cqt {
    public GmsTracer(Context context, Class cls, bnz bnzVar) {
        super(cls.getClassLoader(), bnzVar, context, cls.getSimpleName());
    }

    public GmsTracer(Class cls, bnz bnzVar, String str) {
        super(cls.getClassLoader(), bnzVar, str, cls.getSimpleName());
    }

    public static cqw a(GmsTracer gmsTracer, String str) {
        if (gmsTracer != null) {
            return gmsTracer.a(gmsTracer.a(str.length()).append(str).toString(), (dvz) null);
        }
        return null;
    }

    @Override // flm.cqt
    public final cqw a(String str) {
        return a(a(str.length()).append(str).toString(), (dvz) null);
    }

    @Override // flm.cqt
    public final cqw a(ComponentName componentName, String str) {
        String className = componentName.getClassName();
        return a(a(className.length() + str.length() + 1).append(className).append('_').append(str).toString(), (dvz) null);
    }

    @UsedByReflection
    static Closeable beginTraceInternalUsingReflection(String str, byte[] bArr) {
        return AbstractGmsTracer.beginTraceInternalUsingReflection(str, bArr);
    }

    static {
        GmsTracer.class.getSimpleName();
    }
}
