package flm;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nx {
    private static final Object a = new Object();

    static Bundle a(ns nsVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("icon", nsVar.g);
        bundle.putCharSequence("title", nsVar.h);
        bundle.putParcelable("actionIntent", nsVar.i);
        Bundle bundle2 = nsVar.a != null ? new Bundle(nsVar.a) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", nsVar.d);
        bundle.putBundle(baw.KEY_EXTRAS, bundle2);
        bundle.putParcelableArray("remoteInputs", a(nsVar.b));
        bundle.putBoolean("showsUserInterface", nsVar.e);
        bundle.putInt("semanticAction", nsVar.f);
        return bundle;
    }

    private static Bundle[] a(of[] ofVarArr) {
        if (ofVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[ofVarArr.length];
        if (0 < ofVarArr.length) {
            of ofVar = ofVarArr[0];
            new Bundle();
            throw new NoSuchMethodError();
        }
        return bundleArr;
    }

    static {
        new Object();
    }
}
