package flm;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class azn extends azl {
    azn(String str, Long l) {
        super(str, l);
    }

    private static Long a(Context context, String str, Long l) {
        String string = context.getSharedPreferences("gservices-direboot-cache", 0).getString(str, null);
        if (string != null) {
            try {
                return Long.valueOf(Long.parseLong(string));
            } catch (NumberFormatException e) {
                return l;
            }
        }
        return l;
    }

    @Override // flm.azl
    protected final /* bridge */ /* synthetic */ Object a(Context context, String str, Object obj) {
        return a(context, str, (Long) obj);
    }

    @Override // flm.azl
    protected final /* synthetic */ Object a(String str) {
        return azl.a.a(this.c, (Long) this.d);
    }
}
