package flm;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class doo {
    public final dop a = new dop();

    public final Object a(String str, Object obj) {
        int i = 0;
        dse.a(str.length() > 0);
        dse.a(obj);
        byte[] bytes = str.getBytes(Charset.defaultCharset());
        dop dopVar = this.a;
        int length = bytes.length;
        dop dopVar2 = dopVar;
        while (i < length) {
            byte b = bytes[i];
            if (dopVar2.b == null) {
                dopVar2.b = new sp();
            }
            dop dopVar3 = (dop) dopVar2.b.a(b, null);
            if (dopVar3 == null) {
                dopVar3 = new dop();
                dopVar2.b.b(b, dopVar3);
            }
            i++;
            dopVar2 = dopVar3;
        }
        if (dopVar2.a != null) {
            return dopVar2.a;
        }
        dopVar2.a = obj;
        return null;
    }
}
