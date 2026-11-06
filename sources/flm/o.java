package flm;

import android.arch.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class o {
    public static o a = new o();
    private final Map c = new HashMap();
    public final Map b = new HashMap();

    o() {
    }

    static Method[] a(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    final p b(Class cls) {
        p pVar = (p) this.c.get(cls);
        if (pVar == null) {
            return a(cls, null);
        }
        return pVar;
    }

    private static void a(Map map, q qVar, y yVar, Class cls) {
        y yVar2 = (y) map.get(qVar);
        if (yVar2 != null && yVar != yVar2) {
            throw new IllegalArgumentException("Method " + qVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + yVar2 + ", new value " + yVar);
        }
        if (yVar2 == null) {
            map.put(qVar, yVar);
        }
    }

    final p a(Class cls, Method[] methodArr) {
        boolean z;
        int i;
        p pVarB;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (pVarB = b(superclass)) != null) {
            map.putAll(pVarB.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : b(cls2).b.entrySet()) {
                a(map, (q) entry.getKey(), (y) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = a(cls);
        }
        int length = methodArr.length;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < length) {
            Method method = methodArr[i2];
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(af.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                y yVarA = onLifecycleEvent.a();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(y.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (yVarA != y.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                a(map, new q(i, method), yVarA, cls);
                z = true;
            } else {
                z = z2;
            }
            i2++;
            z2 = z;
        }
        p pVar = new p(map);
        this.c.put(cls, pVar);
        this.b.put(cls, Boolean.valueOf(z2));
        return pVar;
    }
}
