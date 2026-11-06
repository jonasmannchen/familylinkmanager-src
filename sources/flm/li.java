package flm;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class li extends lr {
    private final /* synthetic */ lg a;

    li(lg lgVar) {
        this.a = lgVar;
    }

    @Override // flm.lr
    public final View a(int i) {
        if (this.a.K == null) {
            throw new IllegalStateException("Fragment does not have a view");
        }
        return this.a.K.findViewById(i);
    }

    @Override // flm.lr
    public final boolean a() {
        return this.a.K != null;
    }

    @Override // flm.lr
    public final lg a(Context context, String str, Bundle bundle) {
        return this.a.u.a(context, str, bundle);
    }
}
