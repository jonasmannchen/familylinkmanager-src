package flm;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class byf implements DialogInterface.OnClickListener {
    public static final DialogInterface.OnClickListener a = new byf();

    private byf() {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
