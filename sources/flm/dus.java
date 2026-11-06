package flm;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class dus implements Iterator {
    public int a = dp.ah;
    private Object b;

    protected dus() {
    }

    protected abstract Object a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        dvl.b(this.a != dp.aj);
        switch (this.a - 1) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return true;
            case 1:
            default:
                this.a = dp.aj;
                this.b = a();
                if (this.a == dp.ai) {
                    return false;
                }
                this.a = dp.ag;
                return true;
            case 2:
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = dp.ah;
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
