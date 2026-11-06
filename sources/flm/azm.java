package flm;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class azm extends azl {
    azm(String str, Boolean bool) {
        super(str, bool);
    }

    private static Boolean a(Context context, String str, Boolean bool) {
        String string = context.getSharedPreferences("gservices-direboot-cache", 0).getString(str, null);
        if (string != null) {
            try {
                return Boolean.valueOf(Boolean.parseBoolean(string));
            } catch (NumberFormatException e) {
                return bool;
            }
        }
        return bool;
    }

    @Override // flm.azl
    protected final /* bridge */ /* synthetic */ Object a(Context context, String str, Object obj) {
        return a(context, str, (Boolean) obj);
    }

    @Override // flm.azl
    protected final /* synthetic */ Object a(String str) {
        return azl.a.a(this.c, (Boolean) this.d);
    }
}
