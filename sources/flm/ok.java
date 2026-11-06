package flm;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ok implements Iterable {
    private final ArrayList a = new ArrayList();
    private final Context b;

    private ok(Context context) {
        this.b = context;
    }

    public static ok a(Context context) {
        return new ok(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ok a(Activity activity) {
        Intent supportParentActivityIntent = null;
        if (activity instanceof ol) {
            supportParentActivityIntent = ((ol) activity).getSupportParentActivityIntent();
        }
        Intent intentA = supportParentActivityIntent == null ? np.a(activity) : supportParentActivityIntent;
        if (intentA != null) {
            ComponentName component = intentA.getComponent();
            if (component == null) {
                component = intentA.resolveActivity(this.b.getPackageManager());
            }
            a(component);
            this.a.add(intentA);
        }
        return this;
    }

    private final ok a(ComponentName componentName) {
        int size = this.a.size();
        try {
            Intent intentA = np.a(this.b, componentName);
            while (intentA != null) {
                this.a.add(size, intentA);
                intentA = np.a(this.b, intentA.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator iterator() {
        return this.a.iterator();
    }

    public final void a() {
        if (this.a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.a.toArray(new Intent[this.a.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        oo.a(this.b, intentArr, null);
    }
}
