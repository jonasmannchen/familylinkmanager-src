package flm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bbe extends bdv {
    public static final Parcelable.Creator CREATOR = new bbf();
    public aqb[] availableFeatures;
    public Bundle resolutionBundle;

    bbe(Bundle bundle, aqb[] aqbVarArr) {
        this.resolutionBundle = bundle;
        this.availableFeatures = aqbVarArr;
    }

    public bbe() {
    }

    public final Bundle getResolutionBundle() {
        return this.resolutionBundle;
    }

    public final bbe setResolutionBundle(Bundle bundle) {
        this.resolutionBundle = bundle;
        return this;
    }

    public final aqb[] getAvailableFeatures() {
        return this.availableFeatures;
    }

    public final bbe setAvailableFeatures(aqb[] aqbVarArr) {
        this.availableFeatures = aqbVarArr;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        bbf.writeToParcel(this, parcel, i);
    }
}
