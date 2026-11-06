package flm;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class beo {
    public final bhs a;
    public final Context b;
    public final baw c;

    public static beo a(Context context, baw bawVar) {
        return new beo(context, bawVar);
    }

    private beo(Context context, baw bawVar) {
        this(bhs.a.a(context), context, bawVar);
    }

    private beo(bhs bhsVar, Context context, baw bawVar) {
        this.a = (bhs) bdi.checkNotNull(bhsVar);
        this.b = (Context) bdi.checkNotNull(context);
        this.c = (baw) bdi.checkNotNull(bawVar);
        bdi.checkArgument(this.c.getCallingUid() >= 0, "Calling UID is not available.");
        bdi.checkNotNull(this.c.getCallingPackageName(), "Calling package name is not available.");
    }

    static {
        a(ayt.a(), new baw().setCallingUid(bhq.a).setCallingPackageName("com.google.android.gms"));
    }
}
