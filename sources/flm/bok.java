package flm;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bok extends bae {
    private bod a;
    private final /* synthetic */ boj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bok(boj bojVar, Context context, int i, int... iArr) {
        super(context, i, iArr);
        this.b = bojVar;
        this.a = bod.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bae
    public final Set getRequiredPermissionGroups() {
        return this.b.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bae
    public final Map getPermissionExplanations() {
        return this.b.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bae
    public final void onGetService(bbp bbpVar, bbn bbnVar) {
        bow.a(bbnVar, this.a);
        Parcel parcelObtain = Parcel.obtain();
        bbnVar.writeToParcel(parcelObtain, 0);
        boj bojVar = this.b;
        bon bonVar = new bon(bbpVar);
        parcelObtain.setDataPosition(0);
        bojVar.a(bonVar, (bbn) bbn.CREATOR.createFromParcel(parcelObtain));
        parcelObtain.recycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bae
    public final void verifyAccessForCallingPackage(String str) {
        bod bodVar;
        if (bhq.b()) {
            this.a = bod.ZERO_PARTY;
            return;
        }
        switch (this.b.f) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                throw new SecurityException("GMS Internal API");
            case 1:
                aqy.a(this.mContext).a(str);
                this.a = bod.FIRST_PARTY;
                return;
            default:
                if (aqy.a(this.mContext).b(str)) {
                    bodVar = bod.FIRST_PARTY;
                } else {
                    bodVar = bod.THIRD_PARTY;
                }
                this.a = bodVar;
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bae, flm.bco
    public final void getLegacyService(int i, bck bckVar, int i2, String str, String str2, String[] strArr, Bundle bundle, IBinder iBinder, String str3, String str4) {
        super.getLegacyService(i, bckVar, i2, str, str2, strArr, bundle, iBinder, str3, str4);
    }
}
