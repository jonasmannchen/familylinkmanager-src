package flm;

import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bbi extends bbg {
    public final /* synthetic */ lg val$fragment;
    public final /* synthetic */ Intent val$intent;
    public final /* synthetic */ int val$requestCode;

    bbi(Intent intent, lg lgVar, int i) {
        this.val$intent = intent;
        this.val$fragment = lgVar;
        this.val$requestCode = i;
    }

    @Override // flm.bbg
    public final void redirect() {
        if (this.val$intent != null) {
            this.val$fragment.startActivityForResult(this.val$intent, this.val$requestCode);
        }
    }
}
