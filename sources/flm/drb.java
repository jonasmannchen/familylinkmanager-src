package flm;

import android.content.Context;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class drb implements dqy {
    public static drb a;
    public final Context b;

    static drb a(Context context) {
        drb drbVar;
        synchronized (drb.class) {
            if (a == null) {
                a = oy.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new drb(context) : new drb();
            }
            drbVar = a;
        }
        return drbVar;
    }

    private drb(Context context) {
        this.b = context;
        this.b.getContentResolver().registerContentObserver(dfc.a, true, new drd(null));
    }

    private drb() {
        this.b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.dqy
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String a(final String str) {
        if (this.b == null) {
            return null;
        }
        try {
            return (String) dqz.a(new dra(this, str) { // from class: flm.drc
                private final drb a;
                private final String b;

                {
                    this.a = this;
                    this.b = str;
                }

                @Override // flm.dra
                public final Object a() {
                    drb drbVar = this.a;
                    return dfc.a(drbVar.b.getContentResolver(), this.b, (String) null);
                }
            });
        } catch (SecurityException e) {
            String strValueOf = String.valueOf(str);
            Log.e("GservicesLoader", strValueOf.length() != 0 ? "Unable to read GServices for: ".concat(strValueOf) : new String("Unable to read GServices for: "), e);
            return null;
        }
    }
}
