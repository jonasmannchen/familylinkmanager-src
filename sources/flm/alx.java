package flm;

import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class alx implements aly {
    private final /* synthetic */ String a;
    private final /* synthetic */ Bundle b;

    alx(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    @Override // flm.aly
    public final /* synthetic */ Object a(IBinder iBinder) throws alt {
        Bundle bundle = (Bundle) alv.a(akp.a(iBinder).a(this.a, this.b));
        String string = bundle.getString("Error");
        if (!bundle.getBoolean("booleanResult")) {
            throw new alt(string);
        }
        return null;
    }
}
