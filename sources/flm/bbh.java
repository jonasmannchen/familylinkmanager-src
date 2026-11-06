package flm;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bbh extends bbg {
    public final /* synthetic */ Activity val$activity;
    public final /* synthetic */ Intent val$intent;
    public final /* synthetic */ int val$requestCode;

    bbh(Intent intent, Activity activity, int i) {
        this.val$intent = intent;
        this.val$activity = activity;
        this.val$requestCode = i;
    }

    @Override // flm.bbg
    public final void redirect() {
        if (this.val$intent != null) {
            this.val$activity.startActivityForResult(this.val$intent, this.val$requestCode);
        }
    }
}
