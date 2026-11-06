package flm;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.chimera.IntentOperation;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class anx extends IntentOperation {
    public any a() {
        return null;
    }

    public void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.GOOGLE_SETTINGS_OPERATION".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            Boolean.valueOf(intent.getBooleanExtra("isSearchIndexingIntent", false));
            if (extras == null) {
                throw new IllegalArgumentException("Bundle passed from GoogleSettingsActivity must not be null.");
            }
            IBinder binder = extras.getBinder("settingsListKey");
            if (binder != null && binder.pingBinder()) {
                List list = (List) blt.a(blr.a(binder));
                any anyVarA = a();
                if (anyVarA != null) {
                    if (anyVarA.d == null && anyVarA.o >= 0) {
                        anyVarA.d = getResources().getString(anyVarA.o);
                    }
                    if (anyVarA.i == null && anyVarA.p >= 0) {
                        anyVarA.i = getResources().getString(anyVarA.p);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    anyVarA.writeToParcel(parcelObtain, 0);
                    list.add(parcelObtain);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("GoogleSettingsIntentOperation should only be called with the com.google.android.gms.GOOGLE_SETTINGS_OPERATION action.");
    }
}
