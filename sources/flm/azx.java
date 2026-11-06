package flm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class azx extends azs {
    private final Parcelable.Creator b;

    public azx(DataHolder dataHolder, Parcelable.Creator creator) {
        super(dataHolder);
        this.b = creator;
    }

    @Override // flm.azu
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public bdz a(int i) {
        DataHolder dataHolder = this.a;
        int iA = this.a.a(i);
        dataHolder.a("data", i);
        byte[] blob = dataHolder.d[iA].getBlob(i, dataHolder.c.getInt("data"));
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(blob, 0, blob.length);
        parcelObtain.setDataPosition(0);
        bdz bdzVar = (bdz) this.b.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return bdzVar;
    }

    static {
        new String[1][0] = "data";
    }
}
