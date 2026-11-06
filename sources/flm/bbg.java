package flm;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bbg implements DialogInterface.OnClickListener {
    public static final String TAG = "DialogRedirect";

    protected abstract void redirect();

    public static bbg getInstance(Activity activity, Intent intent, int i) {
        return new bbh(intent, activity, i);
    }

    public static bbg getInstance(lg lgVar, Intent intent, int i) {
        return new bbi(intent, lgVar, i);
    }

    public static bbg getInstance(axm axmVar, Intent intent, int i) {
        return new bbj(intent, axmVar, i);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            redirect();
        } catch (ActivityNotFoundException e) {
            Log.e(TAG, "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
