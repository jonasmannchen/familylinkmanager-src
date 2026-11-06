package flm;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gic {
    private static final gjz a = new gjz(gjz.d, "https");
    private static final gjz b = new gjz(gjz.b, "POST");
    private static final gjz c = new gjz(gjz.b, "GET");
    private static final gjz d = new gjz(gbh.g.a, "application/grpc");
    private static final gjz e = new gjz("te", "trailers");

    public static List a(ftv ftvVar, String str, String str2, String str3, boolean z) {
        dvl.a(ftvVar, "headers");
        dvl.a(str, "defaultPath");
        dvl.a(str2, "authority");
        ftvVar.b(gbh.g);
        ftvVar.b(gbh.h);
        ftvVar.b(gbh.i);
        ArrayList arrayList = new ArrayList(fth.b(ftvVar) + 7);
        arrayList.add(a);
        if (z) {
            arrayList.add(c);
        } else {
            arrayList.add(b);
        }
        arrayList.add(new gjz(gjz.e, str2));
        arrayList.add(new gjz(gjz.c, str));
        arrayList.add(new gjz(gbh.i.a, str3));
        arrayList.add(d);
        arrayList.add(e);
        byte[][] bArrA = ghj.a(ftvVar);
        for (int i = 0; i < bArrA.length; i += 2) {
            guf gufVarA = guf.a(bArrA[i]);
            String strA = gufVarA.a();
            if ((strA.startsWith(":") || gbh.g.a.equalsIgnoreCase(strA) || gbh.i.a.equalsIgnoreCase(strA)) ? false : true) {
                arrayList.add(new gjz(gufVarA, guf.a(bArrA[i + 1])));
            }
        }
        return arrayList;
    }
}
