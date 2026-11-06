package flm;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class pv extends pt {
    public final Class a;
    public final Method b;
    private final Constructor c;
    private final Method d;
    private final Method e;
    private final Method f;
    private final Method g;

    public pv() {
        Method methodA;
        Method method;
        Method method2;
        Method method3;
        Constructor<?> constructor;
        Class<?> cls;
        Method method4 = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls2.getConstructor(new Class[0]);
            Method method5 = cls2.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class);
            Method method6 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE);
            Method method7 = cls2.getMethod("freeze", new Class[0]);
            Method method8 = cls2.getMethod("abortCreation", new Class[0]);
            methodA = a((Class) cls2);
            method4 = method8;
            method = method7;
            method2 = method6;
            method3 = method5;
            constructor = constructor2;
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            methodA = null;
            method = null;
            method2 = null;
            method3 = null;
            constructor = null;
            cls = null;
        }
        this.a = cls;
        this.c = constructor;
        this.d = method3;
        this.e = method2;
        this.f = method;
        this.g = method4;
        this.b = methodA;
    }

    private final boolean a() {
        if (this.d == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.d != null;
    }

    private final Object b() {
        try {
            return this.c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private final boolean a(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.d.invoke(obj, context.getAssets(), str, 0, false, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private final boolean a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.e.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    protected Typeface a(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.a, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.b.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private final boolean b(Object obj) {
        try {
            return ((Boolean) this.f.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private final void c(Object obj) {
        try {
            this.g.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // flm.px
    public final Typeface a(Context context, pd pdVar, Resources resources, int i) {
        if (!a()) {
            return super.a(context, pdVar, resources, i);
        }
        Object objB = b();
        for (pe peVar : pdVar.a) {
            if (!a(context, objB, peVar.a, peVar.e, peVar.b, peVar.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(peVar.d))) {
                c(objB);
                return null;
            }
        }
        if (!b(objB)) {
            return null;
        }
        return a(objB);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x005a A[Catch: IOException -> 0x0044, TRY_LEAVE, TryCatch #1 {IOException -> 0x0044, blocks: (B:9:0x0013, B:12:0x0020, B:16:0x0040, B:26:0x0051, B:30:0x005a, B:29:0x0056, B:27:0x0054), top: B:53:0x0013, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // flm.pt, flm.px
    public final Typeface a(Context context, CancellationSignal cancellationSignal, ra[] raVarArr, int i) throws Throwable {
        if (raVarArr.length <= 0) {
            return null;
        }
        if (!a()) {
            ra raVarA = a(raVarArr, i);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(raVarA.a, "r", cancellationSignal);
                Throwable th = null;
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(raVarA.c).setItalic(raVarA.d).build();
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceBuild;
                    }
                    return typefaceBuild;
                } catch (Throwable th2) {
                    th = th2;
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        if (th != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } else {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                return null;
            }
        }
        Map mapA = qu.a(context, raVarArr, cancellationSignal);
        Object objB = b();
        boolean z = false;
        for (ra raVar : raVarArr) {
            ByteBuffer byteBuffer = (ByteBuffer) mapA.get(raVar.a);
            if (byteBuffer != null) {
                if (!a(objB, byteBuffer, raVar.b, raVar.c, raVar.d ? 1 : 0)) {
                    c(objB);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            c(objB);
            return null;
        }
        if (!b(objB)) {
            return null;
        }
        return Typeface.create(a(objB), i);
    }

    @Override // flm.px
    public final Typeface a(Context context, Resources resources, int i, String str, int i2) {
        if (!a()) {
            return super.a(context, resources, i, str, i2);
        }
        Object objB = b();
        if (!a(context, objB, str, 0, -1, -1, null)) {
            c(objB);
            return null;
        }
        if (b(objB)) {
            return a(objB);
        }
        return null;
    }

    protected Method a(Class cls) throws NoSuchMethodException {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), Integer.TYPE, Integer.TYPE);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
