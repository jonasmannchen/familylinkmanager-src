package flm;

import android.content.Context;
import android.os.IBinder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class blu {
    public final String mCreatorClassName;
    public Object mCreatorInstance;

    public blu(String str) {
        this.mCreatorClassName = str;
    }

    public abstract Object getRemoteCreator(IBinder iBinder);

    public final Object getRemoteCreatorInstance(Context context) throws blv {
        if (this.mCreatorInstance == null) {
            bdi.checkNotNull(context);
            Context contextE = aqx.e(context);
            if (contextE == null) {
                throw new blv("Could not get remote context.");
            }
            try {
                this.mCreatorInstance = getRemoteCreator((IBinder) contextE.getClassLoader().loadClass(this.mCreatorClassName).newInstance());
            } catch (ClassNotFoundException e) {
                throw new blv("Could not load creator class.", e);
            } catch (IllegalAccessException e2) {
                throw new blv("Could not access creator.", e2);
            } catch (InstantiationException e3) {
                throw new blv("Could not instantiate creator.", e3);
            }
        }
        return this.mCreatorInstance;
    }
}
