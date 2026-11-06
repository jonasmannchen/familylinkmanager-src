package flm;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cre extends atm {
    public cre(Context context) {
        super(context, crw.a, (ata) null, new auo());
    }

    public final dbh a(crt crtVar) {
        String simpleName = crt.class.getSimpleName();
        bdi.checkNotNull(crtVar, "Listener must not be null");
        bdi.checkNotNull(simpleName, "Listener type must not be null");
        bdi.checkNotEmpty(simpleName, "Listener type must not be empty");
        axr axrVar = new axr(crtVar, simpleName);
        bdi.checkNotNull(axrVar, "Listener key cannot be null.");
        awt awtVar = this.f;
        dbk dbkVar = new dbk();
        awtVar.o.sendMessage(awtVar.o.obtainMessage(13, new axu(new aun(axrVar, dbkVar), awtVar.k.get(), this)));
        return dbkVar.a.a((dap) new ayk());
    }
}
