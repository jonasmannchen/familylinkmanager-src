package flm;

import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class azw {
    private final DataHolder a;
    private int b;
    private int c;

    public azw(DataHolder dataHolder, int i) {
        this.a = (DataHolder) bdi.checkNotNull(dataHolder);
        bdi.checkState(i >= 0 && i < this.a.h);
        this.b = i;
        this.c = this.a.a(this.b);
    }

    public final String a(String str) {
        DataHolder dataHolder = this.a;
        int i = this.b;
        int i2 = this.c;
        dataHolder.a(str, i);
        return dataHolder.d[i2].getString(i, dataHolder.c.getInt(str));
    }

    public int hashCode() {
        return bcx.hashCode(Integer.valueOf(this.b), Integer.valueOf(this.c), this.a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof azw)) {
            return false;
        }
        azw azwVar = (azw) obj;
        return bcx.equal(Integer.valueOf(azwVar.b), Integer.valueOf(this.b)) && bcx.equal(Integer.valueOf(azwVar.c), Integer.valueOf(this.c)) && azwVar.a == this.a;
    }
}
