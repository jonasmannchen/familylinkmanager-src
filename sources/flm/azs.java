package flm;

import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class azs implements azu {
    public final DataHolder a;

    public azs(DataHolder dataHolder) {
        this.a = dataHolder;
    }

    @Override // flm.azu
    public final int b() {
        if (this.a == null) {
            return 0;
        }
        return this.a.h;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new azv(this);
    }

    @Override // flm.atv
    public final void a() {
        if (this.a != null) {
            this.a.close();
        }
    }
}
