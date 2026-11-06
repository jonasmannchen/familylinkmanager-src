package flm;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fkq {
    public static final fkq a = new fkq();
    private final fkz b;
    private final ConcurrentMap c = new ConcurrentHashMap();

    public final fky a(Class cls) {
        fiv.a((Object) cls, "messageType");
        fky fkyVar = (fky) this.c.get(cls);
        if (fkyVar != null) {
            return fkyVar;
        }
        fky fkyVarA = this.b.a(cls);
        fiv.a((Object) cls, "messageType");
        fiv.a((Object) fkyVarA, "schema");
        fky fkyVar2 = (fky) this.c.putIfAbsent(cls, fkyVarA);
        return fkyVar2 != null ? fkyVar2 : fkyVarA;
    }

    public final fky a(Object obj) {
        return a((Class) obj.getClass());
    }

    private fkq() {
        fkz fkzVarA = null;
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        for (int i = 0; i <= 0; i++) {
            fkzVarA = a(strArr[0]);
            if (fkzVarA != null) {
                break;
            }
        }
        this.b = fkzVarA == null ? new fjt() : fkzVarA;
    }

    private static fkz a(String str) {
        try {
            return (fkz) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            return null;
        }
    }
}
