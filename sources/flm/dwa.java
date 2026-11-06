package flm;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dwa {
    public static dvz a(dvz dvzVar) {
        if ((dvzVar instanceof dwc) || (dvzVar instanceof dwb)) {
            return dvzVar;
        }
        return dvzVar instanceof Serializable ? new dwb(dvzVar) : new dwc(dvzVar);
    }

    public static dvz a(Object obj) {
        return new dwd(obj);
    }
}
