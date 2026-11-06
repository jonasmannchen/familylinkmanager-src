package flm;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dvi implements Serializable {
    public static final long serialVersionUID = 0;

    public static dvi b(Object obj) {
        return new dvn(dvl.a(obj));
    }

    public abstract dvi a(dvc dvcVar);

    public abstract Object a(dvz dvzVar);

    public abstract Object a(Object obj);

    public abstract boolean a();

    public abstract Object b();

    public abstract Object c();

    public static dvi c(Object obj) {
        return obj == null ? dur.a : new dvn(obj);
    }

    dvi() {
    }
}
