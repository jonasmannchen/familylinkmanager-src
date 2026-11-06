package flm;

import android.arch.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aj {
    private static Map a = new HashMap();
    private static Map b = new HashMap();

    static w a(Object obj) {
        int i = 0;
        if (obj instanceof t) {
            return new u((t) obj);
        }
        if (obj instanceof w) {
            return (w) obj;
        }
        Class<?> cls = obj.getClass();
        if (b(cls) != 2) {
            return new ay(obj);
        }
        List list = (List) b.get(cls);
        if (list.size() == 1) {
            return new bd(a((Constructor) list.get(0), obj));
        }
        v[] vVarArr = new v[list.size()];
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return new r(vVarArr);
            }
            vVarArr[i2] = a((Constructor) list.get(i2), obj);
            i = i2 + 1;
        }
    }

    private static v a(Constructor constructor, Object obj) {
        try {
            return (v) constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Constructor a(Class cls) {
        try {
            Package r1 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r1 != null ? r1.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String str = canonicalName.replace(".", "_") + "_LifecycleAdapter";
            if (!name.isEmpty()) {
                str = name + "." + str;
            }
            Constructor declaredConstructor = Class.forName(str).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
                return declaredConstructor;
            }
            return declaredConstructor;
        } catch (ClassNotFoundException e) {
            return null;
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00da  */
    /* JADX WARN: Code duplicated, block: B:46:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2 A[SYNTHETIC] */
    private static int b(Class cls) {
        boolean zBooleanValue;
        Class<?>[] interfaces;
        int length;
        int i;
        Class<?> cls2;
        ArrayList arrayList;
        int i2 = 0;
        if (a.containsKey(cls)) {
            return ((Integer) a.get(cls)).intValue();
        }
        if (cls.getCanonicalName() == null) {
            i = 1;
        } else {
            Constructor constructorA = a(cls);
            if (constructorA != null) {
                b.put(cls, Collections.singletonList(constructorA));
                i = 2;
            } else {
                o oVar = o.a;
                if (oVar.b.containsKey(cls)) {
                    zBooleanValue = ((Boolean) oVar.b.get(cls)).booleanValue();
                } else {
                    Method[] methodArrA = o.a(cls);
                    int length2 = methodArrA.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            if (((OnLifecycleEvent) methodArrA[i3].getAnnotation(OnLifecycleEvent.class)) != null) {
                                oVar.a(cls, methodArrA);
                                zBooleanValue = true;
                                break;
                            }
                            i3++;
                        } else {
                            oVar.b.put(cls, false);
                            zBooleanValue = false;
                            break;
                        }
                    }
                }
                if (zBooleanValue) {
                    i = 1;
                } else {
                    Class superclass = cls.getSuperclass();
                    ArrayList arrayList2 = null;
                    if (c(superclass)) {
                        if (b(superclass) == 1) {
                            i = 1;
                        } else {
                            arrayList2 = new ArrayList((Collection) b.get(superclass));
                            interfaces = cls.getInterfaces();
                            length = interfaces.length;
                            while (i2 < length) {
                                cls2 = interfaces[i2];
                                if (c(cls2)) {
                                    arrayList = arrayList2;
                                } else if (b(cls2) == 1) {
                                    i = 1;
                                } else {
                                    if (arrayList2 == null) {
                                        arrayList = new ArrayList();
                                    } else {
                                        arrayList = arrayList2;
                                    }
                                    arrayList.addAll((Collection) b.get(cls2));
                                }
                                i2++;
                                arrayList2 = arrayList;
                            }
                            if (arrayList2 != null) {
                                b.put(cls, arrayList2);
                                i = 2;
                            } else {
                                i = 1;
                            }
                        }
                    } else {
                        interfaces = cls.getInterfaces();
                        length = interfaces.length;
                        while (i2 < length) {
                            cls2 = interfaces[i2];
                            if (c(cls2)) {
                                arrayList = arrayList2;
                            } else if (b(cls2) == 1) {
                                i = 1;
                            } else {
                                if (arrayList2 == null) {
                                    arrayList = new ArrayList();
                                } else {
                                    arrayList = arrayList2;
                                }
                                arrayList.addAll((Collection) b.get(cls2));
                            }
                            i2++;
                            arrayList2 = arrayList;
                        }
                        if (arrayList2 != null) {
                            b.put(cls, arrayList2);
                            i = 2;
                        } else {
                            i = 1;
                        }
                    }
                }
            }
        }
        a.put(cls, Integer.valueOf(i));
        return i;
    }

    private static boolean c(Class cls) {
        return cls != null && ae.class.isAssignableFrom(cls);
    }
}
