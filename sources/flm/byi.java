package flm;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class byi implements DialogInterface.OnClickListener {
    public static final DialogInterface.OnClickListener a = new byi();

    private byi() {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
