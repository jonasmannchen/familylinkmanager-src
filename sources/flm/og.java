package flm;

import android.app.Activity;
import android.content.Intent;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class og {
    public Intent a = new Intent().setAction("android.intent.action.SEND");
    public ArrayList b;

    public og(Activity activity) {
        this.a.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", activity.getPackageName());
        this.a.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", activity.getComponentName());
        this.a.addFlags(524288);
    }
}
