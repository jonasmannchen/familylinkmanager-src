package flm;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dwk extends eau {
    private int a = dp.am;
    private Object b;

    protected dwk() {
    }

    protected abstract Object a();

    protected final Object b() {
        this.a = dp.an;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        dvl.b(this.a != dp.ao);
        switch (this.a - 1) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return true;
            case 1:
            default:
                this.a = dp.ao;
                this.b = a();
                if (this.a == dp.an) {
                    return false;
                }
                this.a = dp.al;
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
        this.a = dp.am;
        Object obj = this.b;
        this.b = null;
        return obj;
    }
}
