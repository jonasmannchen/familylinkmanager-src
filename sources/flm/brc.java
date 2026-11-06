package flm;

import android.content.Intent;
import android.graphics.Bitmap;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class brc extends brm {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ WeakReference c;
    public final /* synthetic */ brb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    brc(brb brbVar, atp atpVar, Intent intent, Bitmap bitmap, WeakReference weakReference) {
        super(atpVar);
        this.d = brbVar;
        this.a = intent;
        this.b = bitmap;
        this.c = weakReference;
    }

    @Override // flm.brl
    protected final void a(brr brrVar) {
        GoogleHelp googleHelp = (GoogleHelp) this.a.getParcelableExtra("EXTRA_GOOGLE_HELP");
        bqm bqmVar = new bqm(googleHelp);
        GoogleHelp googleHelp2 = bqmVar.a;
        GoogleHelp googleHelp3 = bqmVar.a;
        brw brwVar = new brw(googleHelp);
        brd brdVar = new brd(this, brrVar, this, null, null);
        if (0 == 0) {
            brdVar.a(brwVar.a);
        } else {
            brwVar.a(brwVar.b.a(brwVar.a, null, brdVar), 10);
        }
    }
}
