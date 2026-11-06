package flm;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class azo extends azl {
    azo(String str, Integer num) {
        super(str, num);
    }

    private static Integer a(Context context, String str, Integer num) {
        String string = context.getSharedPreferences("gservices-direboot-cache", 0).getString(str, null);
        if (string != null) {
            try {
                return Integer.valueOf(Integer.parseInt(string));
            } catch (NumberFormatException e) {
                return num;
            }
        }
        return num;
    }

    @Override // flm.azl
    protected final /* bridge */ /* synthetic */ Object a(Context context, String str, Object obj) {
        return a(context, str, (Integer) obj);
    }

    @Override // flm.azl
    protected final /* synthetic */ Object a(String str) {
        return azl.a.a(this.c, (Integer) this.d);
    }
}
