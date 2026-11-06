package flm;

import android.graphics.Bitmap;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class brd implements bra {
    private final /* synthetic */ brr a;
    private final /* synthetic */ brm b;
    private final /* synthetic */ bql c;
    private final /* synthetic */ bmt d;
    private final /* synthetic */ brc e;

    brd(brc brcVar, brr brrVar, brm brmVar, bql bqlVar, bmt bmtVar) {
        this.e = brcVar;
        this.a = brrVar;
        this.b = brmVar;
        this.c = bqlVar;
        this.d = bmtVar;
    }

    @Override // flm.bra
    public final void a(GoogleHelp googleHelp) {
        try {
            brr brrVar = this.a;
            Bitmap bitmap = this.e.b;
            brb brbVar = this.e.d;
            brm brmVar = this.b;
            brrVar.a(googleHelp, bitmap, new bri(brbVar, this.e.a, this.e.c, brmVar, this.c, this.d));
        } catch (RemoteException e) {
            Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e);
            this.e.forceFailureUnlessReady(brb.a);
        }
    }
}
