package flm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BoundService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bbw {
    public final String mAction;
    public final int mBindFlags;
    public final ComponentName mComponentName;
    public final String mPackage;

    public bbw(String str, int i) {
        this.mAction = bdi.checkNotEmpty(str);
        this.mPackage = "com.google.android.gms";
        this.mComponentName = null;
        this.mBindFlags = i;
    }

    public bbw(String str, String str2, int i) {
        this.mAction = bdi.checkNotEmpty(str);
        this.mPackage = bdi.checkNotEmpty(str2);
        this.mComponentName = null;
        this.mBindFlags = i;
    }

    public bbw(ComponentName componentName, int i) {
        this.mAction = null;
        this.mPackage = null;
        this.mComponentName = (ComponentName) bdi.checkNotNull(componentName);
        this.mBindFlags = i;
    }

    public final String toString() {
        return this.mAction == null ? this.mComponentName.flattenToString() : this.mAction;
    }

    public final String getAction() {
        return this.mAction;
    }

    public final String getPackage() {
        return this.mPackage;
    }

    public final ComponentName getComponentName() {
        return this.mComponentName;
    }

    public final int getBindFlags() {
        return this.mBindFlags;
    }

    public final Intent getStartServiceIntent(Context context) {
        if (this.mAction != null) {
            if (bif.a()) {
                try {
                    Intent startIntent = BoundService.getStartIntent(context, this.mAction);
                    if (startIntent != null) {
                        return startIntent;
                    }
                } catch (NoClassDefFoundError e) {
                }
            }
            return new Intent(this.mAction).setPackage(this.mPackage);
        }
        return new Intent().setComponent(this.mComponentName);
    }

    public final int hashCode() {
        return bcx.hashCode(this.mAction, this.mPackage, this.mComponentName, Integer.valueOf(this.mBindFlags));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbw)) {
            return false;
        }
        bbw bbwVar = (bbw) obj;
        return bcx.equal(this.mAction, bbwVar.mAction) && bcx.equal(this.mPackage, bbwVar.mPackage) && bcx.equal(this.mComponentName, bbwVar.mComponentName) && this.mBindFlags == bbwVar.mBindFlags;
    }
}
