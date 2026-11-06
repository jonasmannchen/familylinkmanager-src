package flm;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class azp extends azl {
    azp(String str, String str2) {
        super(str, str2);
    }

    @Override // flm.azl
    protected final /* synthetic */ Object a(Context context, String str, Object obj) {
        return context.getSharedPreferences("gservices-direboot-cache", 0).getString(str, (String) obj);
    }

    @Override // flm.azl
    protected final /* synthetic */ Object a(String str) {
        return azl.a.a(this.c, (String) this.d);
    }
}
