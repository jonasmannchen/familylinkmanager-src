package flm;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bi extends bk {
    private Application a;

    public bi(Application application) {
        this.a = application;
    }

    @Override // flm.bk, flm.bj
    public final bg a(Class cls) {
        if (AndroidViewModel.class.isAssignableFrom(cls)) {
            try {
                return (bg) cls.getConstructor(Application.class).newInstance(this.a);
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }
        return super.a(cls);
    }
}
