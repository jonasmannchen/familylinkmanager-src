package flm;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class pu extends px {
    public static final Method a;
    private static final Class b;
    private static final Constructor c;
    private static final Method d;

    pu() {
    }

    private static Object a() {
        try {
            return c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) a.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private static Typeface a(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) d.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // flm.px
    public final Typeface a(Context context, CancellationSignal cancellationSignal, ra[] raVarArr, int i) throws Throwable {
        Object objA = a();
        so soVar = new so();
        for (ra raVar : raVarArr) {
            Uri uri = raVar.a;
            ByteBuffer byteBufferA = (ByteBuffer) soVar.get(uri);
            if (byteBufferA == null) {
                byteBufferA = qb.a(context, cancellationSignal, uri);
                soVar.put(uri, byteBufferA);
            }
            if (!a(objA, byteBufferA, raVar.b, raVar.c, raVar.d)) {
                return null;
            }
        }
        return Typeface.create(a(objA), i);
    }

    @Override // flm.px
    public final Typeface a(Context context, pd pdVar, Resources resources, int i) {
        Object objA = a();
        for (pe peVar : pdVar.a) {
            ByteBuffer byteBufferA = qb.a(context, resources, peVar.f);
            if (byteBufferA == null || !a(objA, byteBufferA, peVar.e, peVar.b, peVar.c)) {
                return null;
            }
        }
        return a(objA);
    }

    static {
        Method method;
        Constructor<?> constructor;
        Class<?> cls;
        Method method2 = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls2.getConstructor(new Class[0]);
            Method method3 = cls2.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls2, 1).getClass());
            method2 = method3;
            constructor = constructor2;
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            method = null;
            constructor = null;
            cls = null;
        }
        c = constructor;
        b = cls;
        a = method2;
        d = method;
    }
}
