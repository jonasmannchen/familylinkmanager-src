package flm;

import android.os.IBinder;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class blt extends blr {
    private final Object a;

    private blt(Object obj) {
        this.a = obj;
    }

    public static blq a(Object obj) {
        return new blt(obj);
    }

    public static Object a(blq blqVar) {
        int i = 0;
        if (blqVar instanceof blt) {
            return ((blt) blqVar).a;
        }
        IBinder iBinderAsBinder = blqVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int length = declaredFields.length;
        int i2 = 0;
        while (i2 < length) {
            Field field2 = declaredFields[i2];
            if (field2.isSynthetic()) {
                field2 = field;
            } else {
                i++;
            }
            i2++;
            field = field2;
        }
        if (i == 1) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(iBinderAsBinder);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (NullPointerException e2) {
                    throw new IllegalArgumentException("Binder object is null.", e2);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new IllegalArgumentException(new StringBuilder(64).append("Unexpected number of IObjectWrapper declared fields: ").append(declaredFields.length).toString());
    }
}
