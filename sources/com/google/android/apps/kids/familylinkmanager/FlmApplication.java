package com.google.android.apps.kids.familylinkmanager;

import android.app.Application;
import android.content.Context;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.PathClassLoader;
import flm.ehh;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FlmApplication extends Application {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) throws Throwable {
        Throwable th;
        Throwable th2;
        Throwable th3 = null;
        super.attachBaseContext(context);
        File file = new File(getDir("dex", 0), "chimera_runtime.apk");
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(getAssets().open("chimera_runtime.apk"));
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = bufferedInputStream.read(bArr, 0, 4096);
                        if (i <= 0) {
                            break;
                        } else {
                            bufferedOutputStream.write(bArr, 0, i);
                        }
                    }
                    a((Throwable) null, bufferedOutputStream);
                    a((Throwable) null, bufferedInputStream);
                    ClassLoader classLoader = FlmApplication.class.getClassLoader();
                    PathClassLoader pathClassLoader = new PathClassLoader(file.getAbsolutePath(), classLoader);
                    try {
                        if (!(getClassLoader() instanceof BaseDexClassLoader)) {
                            throw new UnsupportedOperationException("Class loader not supported");
                        }
                        BaseDexClassLoader baseDexClassLoader = (BaseDexClassLoader) classLoader;
                        Object obj = a(pathClassLoader, "pathList").get(pathClassLoader);
                        Object obj2 = a(obj, "dexElements").get(obj);
                        Object obj3 = a(baseDexClassLoader, "pathList").get(baseDexClassLoader);
                        a(obj3, "dexElements").set(obj3, obj2);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th2 = null;
                    a(th2, bufferedOutputStream);
                    throw th;
                }
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    th3 = th5;
                    th = th6;
                    a(th3, bufferedInputStream);
                    throw th;
                }
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static Field a(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException e) {
            }
        }
        String strValueOf = String.valueOf(obj.getClass());
        throw new NoSuchFieldException(new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(strValueOf).length()).append("Field ").append(str).append(" not found in ").append(strValueOf).toString());
    }

    private static /* synthetic */ void a(Throwable th, OutputStream outputStream) throws IOException {
        if (th == null) {
            outputStream.close();
            return;
        }
        try {
            outputStream.close();
        } catch (Throwable th2) {
            ehh.a(th, th2);
        }
    }

    private static /* synthetic */ void a(Throwable th, BufferedInputStream bufferedInputStream) throws IOException {
        if (th == null) {
            bufferedInputStream.close();
            return;
        }
        try {
            bufferedInputStream.close();
        } catch (Throwable th2) {
            ehh.a(th, th2);
        }
    }
}
