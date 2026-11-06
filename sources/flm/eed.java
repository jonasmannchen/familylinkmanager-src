package flm;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eed extends eeb {
    private static final Map c;
    private final ebv d;

    public static eed a(int i, ebv ebvVar, ebw ebwVar) {
        return (i >= 10 || !ebwVar.a()) ? new eed(i, ebvVar, ebwVar) : ((eed[]) c.get(ebvVar))[i];
    }

    private eed(int i, ebv ebvVar, ebw ebwVar) {
        super(ebwVar, i);
        this.d = (ebv) eel.a(ebvVar, "format char");
        if (ebwVar.a()) {
            String str = ebvVar.j;
        } else {
            char c2 = ebvVar.g;
            ebwVar.a(new StringBuilder("%")).append(ebwVar.b() ? (char) (c2 & (-33)) : c2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.eeb
    public final void a(eec eecVar, Object obj) {
        eecVar.a(obj, this.d, this.b);
    }

    static {
        EnumMap enumMap = new EnumMap(ebv.class);
        for (ebv ebvVar : ebv.values()) {
            eed[] eedVarArr = new eed[10];
            for (int i = 0; i < 10; i++) {
                eedVarArr[i] = new eed(i, ebvVar, ebw.a);
            }
            enumMap.put(ebvVar, eedVarArr);
        }
        c = Collections.unmodifiableMap(enumMap);
    }
}
