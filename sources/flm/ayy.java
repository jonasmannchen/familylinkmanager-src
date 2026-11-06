package flm;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ayy implements edc {
    public final ayv a;

    public ayy(Context context) {
        this(context, new ayz(context), bgy.a(10));
    }

    private ayy(Context context, ayx ayxVar, Executor executor) {
        azb azbVar = new azb();
        this.a = new ayv(ayxVar, new eim("com.google.android.gms", bav.APK_BUILD_VERSION_CODE, bav.APK_BUILD_VERSION_NAME, azbVar.a()), new azc(context), azbVar, executor);
    }

    @Override // flm.edc
    public final ecg a(String str) {
        return new aza(this, str);
    }
}
