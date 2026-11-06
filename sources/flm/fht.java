package flm;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fht extends IOException {
    public static final long serialVersionUID = -6947486886997889499L;

    fht() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    fht(String str) {
        String strValueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
        String strValueOf2 = String.valueOf(str);
        super(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
    }

    fht(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    fht(String str, Throwable th) {
        String strValueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
        String strValueOf2 = String.valueOf(str);
        super(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf), th);
    }
}
