package flm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bjy extends bdv {
    public static final Parcelable.Creator CREATOR = new bjz();
    public final Map a = new HashMap();

    bjy(Bundle bundle) {
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                this.a.put(str, (bjw) bea.deserializeFromBytes(bundle.getByteArray(str), bjw.CREATOR));
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle;
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        if (this.a == null) {
            bundle = null;
        } else {
            Bundle bundle2 = new Bundle();
            for (Map.Entry entry : this.a.entrySet()) {
                bundle2.putByteArray((String) entry.getKey(), bea.serializeToBytes((bjw) entry.getValue()));
            }
            bundle = bundle2;
        }
        bdy.writeBundle(parcel, 2, bundle, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
