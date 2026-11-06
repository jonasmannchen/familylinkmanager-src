package flm;

import android.content.Context;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class alh extends atm {
    private static final atf g = new atf();
    private static final asx h = new ali();
    private static final asw i = new asw("Audit.API", h, g);

    public alh(Context context) {
        super(context, i, (ata) null, atn.a);
    }

    public static byte[] a() {
        als alsVar = new als();
        UUID uuidRandomUUID = UUID.randomUUID();
        ejn ejnVar = (ejn) ((fio) ejm.d.a(dp.au, (Object) null));
        long mostSignificantBits = uuidRandomUUID.getMostSignificantBits();
        ejnVar.c();
        ejm ejmVar = (ejm) ejnVar.a;
        ejmVar.a |= 1;
        ejmVar.b = mostSignificantBits;
        long leastSignificantBits = uuidRandomUUID.getLeastSignificantBits();
        ejnVar.c();
        ejm ejmVar2 = (ejm) ejnVar.a;
        ejmVar2.a |= 2;
        ejmVar2.c = leastSignificantBits;
        alsVar.a = (ejm) ((fin) ejnVar.h());
        return als.a(alsVar);
    }
}
