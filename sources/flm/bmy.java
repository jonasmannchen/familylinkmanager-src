package flm;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.ErrorReport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bmy extends bmz {
    private final /* synthetic */ bnc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bmy(atp atpVar, bnc bncVar) {
        super(atpVar);
        this.a = bncVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.auv
    public final /* synthetic */ void doExecute(asy asyVar) {
        bnm bnmVar = (bnm) asyVar;
        bnc bncVar = this.a;
        if (((Boolean) bns.c.a()).booleanValue() && bncVar != null) {
            Parcel parcelObtain = Parcel.obtain();
            bncVar.writeToParcel(parcelObtain, 0);
            int iDataSize = parcelObtain.dataSize();
            parcelObtain.recycle();
            if (iDataSize > ((Integer) bns.b.a()).intValue()) {
                String strValueOf = String.valueOf(bns.b.a());
                throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf).length() + 104).append("Max allowed feedback options size of ").append(strValueOf).append(" exceeded, you are passing in feedback options of ").append(iDataSize).append(" size.").toString());
            }
        }
        ((bnn) bnmVar.getService()).a(new ErrorReport(bncVar, bnmVar.a.getCacheDir()));
        setResult((aty) Status.a);
    }
}
