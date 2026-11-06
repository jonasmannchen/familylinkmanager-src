package flm;

import java.text.ParseException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class gnu {
    public static final gnv a = new gnv();

    public byte[] a(gnb gnbVar) {
        return a(gnbVar);
    }

    @Deprecated
    private final gnb b(byte[] bArr) throws ParseException {
        try {
            return a(bArr);
        } catch (gny e) {
            throw new ParseException(e.toString(), 0);
        }
    }

    public gnb a(byte[] bArr) throws gny {
        try {
            return b(bArr);
        } catch (ParseException e) {
            throw new gny("Error while parsing.", e);
        }
    }
}
