package flm;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class deq extends bhs {
    private final bhs b;
    private final Context c;

    deq(bhs bhsVar, Context context) {
        new HashSet();
        this.b = bhsVar;
        this.c = context;
    }

    @Override // flm.bhs
    public final int a(String str, int i, String str2) {
        deo deoVarA;
        return (den.a() && dev.a(i) && (deoVarA = deo.a(this.c)) != null) ? a(deoVarA, str, i, str2) : this.b.a(str, i, str2);
    }

    @Override // flm.bhs
    public final String a(String str) {
        return this.b.a(str);
    }

    private static int a(deo deoVar, String str, int i, String str2) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("op", str);
            bundle.putInt("uid", i);
            bundle.putString("packageName", str2);
            return deoVar.a("noteOpNoThrow", bundle).getInt("result");
        } catch (RemoteException e) {
            return 2;
        }
    }
}
