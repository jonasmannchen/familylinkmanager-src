package com.google.android.gms.net;

import android.content.Context;
import android.support.annotation.Keep;
import com.google.android.apps.common.proguard.UsedByReflection;
import flm.aqu;
import flm.aqv;
import flm.bdi;
import flm.cuv;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class PlayServicesCronetProvider extends CronetProvider {
    @UsedByReflection
    public PlayServicesCronetProvider(Context context) {
        super(context);
    }

    @Keep
    public CronetEngine.Builder createBuilder() {
        CronetEngine.Builder builder = null;
        try {
            cuv.a(this.mContext);
            try {
                e = null;
                builder = new ExperimentalCronetEngine.Builder((ICronetEngineBuilder) cuv.b().c.getClassLoader().loadClass("org.chromium.net.impl.NativeCronetEngineBuilderImpl").asSubclass(ICronetEngineBuilder.class).getConstructor(Context.class).newInstance(this.mContext));
            } catch (ClassNotFoundException e) {
                e = e;
            } catch (IllegalAccessException e2) {
                e = e2;
            } catch (InstantiationException e3) {
                e = e3;
            } catch (NoSuchMethodException e4) {
                e = e4;
            } catch (InvocationTargetException e5) {
                e = e5;
            }
            if (e != null) {
                throw new RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", e);
            }
            bdi.checkNotNull(builder, "The value of the constructed builder should never be null");
            return builder;
        } catch (aqu e6) {
            throw new IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", e6);
        } catch (aqv e7) {
            throw new IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e7);
        }
    }

    @Keep
    public String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }

    @Keep
    public String getVersion() {
        a();
        return cuv.c();
    }

    @Keep
    public boolean isEnabled() {
        a();
        return cuv.a();
    }

    private final void a() {
        try {
            cuv.a(this.mContext);
        } catch (aqu e) {
        } catch (aqv e2) {
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{PlayServicesCronetProvider.class, this.mContext});
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof PlayServicesCronetProvider) && this.mContext.equals(((PlayServicesCronetProvider) obj).mContext));
    }
}
