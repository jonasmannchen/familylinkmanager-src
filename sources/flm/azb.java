package flm;

import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class azb implements eik {
    azb() {
    }

    @Override // flm.eik
    public final boolean a(Level level) {
        return ((long) level.intValue()) >= ((Long) azf.b.b()).longValue();
    }

    @Override // flm.eik
    public final eix a() {
        return bav.APK_IS_DEBUG_APK ? eix.DEV : eix.PROD;
    }
}
