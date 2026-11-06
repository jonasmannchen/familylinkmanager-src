package flm;

import java.lang.ref.Reference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dnu {
    private static final Map a;
    private final dod b;
    private final ByteBuffer c;
    private int j;
    private final doi d = new doi();
    private final doi e = new doi();
    private final dok f = new dok();
    private final dok g = new dok();
    private final Map h = new rt();
    private final doi i = new doi();
    private String k = "";
    private final dok l = new dok();
    private final dok m = new dok();
    private final doo n = new doo();

    public static dof a(dod dodVar, Iterable iterable, Iterable iterable2, Iterable iterable3) {
        Object obj;
        dnu dnuVar = new dnu(dodVar, iterable, iterable2, iterable3);
        while (dnuVar.c.hasRemaining()) {
            byte b = dnuVar.c.get();
            dnuVar.c.getInt();
            if (dnuVar.c.getInt(dnuVar.c.position()) < 0) {
                throw new RuntimeException("Length too large to parse.");
            }
            switch (b) {
                case 1:
                    int iPosition = dnuVar.c.position();
                    int i = dnuVar.c.getInt();
                    dnuVar.d.a(dnuVar.b.a(), iPosition);
                    dnuVar.b.c(i - dnuVar.b.b);
                    break;
                case 2:
                    dnuVar.c.getInt();
                    dnuVar.c.getInt();
                    int iPosition2 = dnuVar.c.position();
                    int iA = dnuVar.b.a();
                    dnuVar.c.getInt();
                    int iB = dnuVar.d.b(dnuVar.b.a());
                    dnp dnpVar = new dnp(iPosition2, iB);
                    dnuVar.f.a(iA, dnpVar);
                    dod dodVar2 = dnuVar.b;
                    int i2 = dodVar2.a.getInt(iB) - dodVar2.b;
                    int i3 = dnuVar.b.b + iB + 4;
                    doo dooVar = dnuVar.n;
                    ByteBuffer byteBuffer = dnuVar.c;
                    int i4 = i2 + i3;
                    dop dopVar = dooVar.a;
                    int i5 = i3;
                    while (true) {
                        if (i5 < i4) {
                            byte b2 = byteBuffer.get(i5);
                            if (dopVar.b == null || (dopVar = (dop) dopVar.b.a(b2, null)) == null) {
                                obj = null;
                            } else {
                                i5++;
                            }
                        } else {
                            obj = dopVar.a;
                        }
                    }
                    dnv dnvVar = (dnv) obj;
                    if (dnvVar == dnv.IDENTIFY_OBJECT_CLASS) {
                        dnuVar.j = iA;
                    } else if (dnvVar == dnv.IDENTIFY_JAVA_LANG_CLASS) {
                        dnp.a = dnpVar;
                    } else if (dnvVar == dnv.CLASSIFY_REF) {
                        dnpVar.o |= 2;
                    } else if (dnvVar != null) {
                        dnuVar.l.a(iA, dnvVar);
                    }
                    break;
                case 12:
                case 28:
                    int iPosition3 = dnuVar.c.position() + dnuVar.c.getInt();
                    while (dnuVar.c.position() < iPosition3) {
                        int i6 = dnuVar.c.get() & 255;
                        if (dnuVar.b.c.c(i6)) {
                            int iB2 = dnuVar.b.c.b(i6);
                            if (dnuVar.i.c(i6)) {
                                dnuVar.b.c(iB2);
                            } else {
                                dnuVar.e.a(dnuVar.b.a(), i6);
                                dnuVar.b.c(iB2 - dnuVar.b.b);
                            }
                        } else {
                            switch (i6) {
                                case 32:
                                    int iA2 = dnuVar.b.a();
                                    if (iA2 == dnuVar.j) {
                                        dnp dnpVar2 = (dnp) dnuVar.f.b(iA2);
                                        dod dodVar3 = dnuVar.b;
                                        dok dokVar = dnuVar.f;
                                        ByteBuffer byteBuffer2 = dodVar3.a;
                                        dnpVar2.k = byteBuffer2.position() - dodVar3.b;
                                        byteBuffer2.getInt();
                                        dnpVar2.g = (dnp) dokVar.b(dodVar3.a());
                                        dodVar3.c(dodVar3.b * 5);
                                        dnpVar2.i = byteBuffer2.getInt();
                                        dnp.d(dodVar3);
                                        ByteBuffer byteBuffer3 = dodVar3.a;
                                        int i7 = 65535 & byteBuffer3.getShort();
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            dodVar3.a();
                                            dodVar3.c(dodVar3.b(byteBuffer3.get()));
                                        }
                                        dnpVar2.b = new int[0];
                                        dnpVar2.c = new int[0];
                                        ByteBuffer byteBuffer4 = dodVar3.a;
                                        int i9 = 65535 & byteBuffer4.getShort();
                                        dnpVar2.f = 0;
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            dodVar3.a();
                                            dnpVar2.f = dodVar3.b(byteBuffer4.get()) + dnpVar2.f;
                                        }
                                        dnpVar2.d = new int[0];
                                        dnpVar2.e = new int[0];
                                    } else {
                                        dnp dnpVar3 = (dnp) dnuVar.f.b(iA2);
                                        dod dodVar4 = dnuVar.b;
                                        dok dokVar2 = dnuVar.f;
                                        doi doiVar = dnuVar.d;
                                        ByteBuffer byteBuffer5 = dodVar4.a;
                                        dnpVar3.k = byteBuffer5.position() - dodVar4.b;
                                        byteBuffer5.getInt();
                                        dnpVar3.g = (dnp) dokVar2.b(dodVar4.a());
                                        dodVar4.c(dodVar4.b * 5);
                                        dnpVar3.i = byteBuffer5.getInt();
                                        dnp.d(dodVar4);
                                        ByteBuffer byteBuffer6 = dodVar4.a;
                                        int i11 = byteBuffer6.getShort() & 65535;
                                        dnpVar3.b = new int[i11];
                                        dnpVar3.c = new int[i11];
                                        int i12 = 0;
                                        for (int i13 = 0; i13 < i11; i13++) {
                                            int iA3 = dodVar4.a();
                                            byte b3 = byteBuffer6.get();
                                            dnpVar3.j += dodVar4.b(b3);
                                            if (dod.e(b3)) {
                                                int iA4 = dodVar4.a();
                                                if (iA4 != 0) {
                                                    dnpVar3.b[i12] = iA4;
                                                    dnpVar3.c[i12] = doiVar.b(iA3);
                                                    i12++;
                                                }
                                            } else {
                                                dodVar4.c(dodVar4.b(b3));
                                            }
                                        }
                                        dnpVar3.b = i12 == i11 ? dnpVar3.b : Arrays.copyOf(dnpVar3.b, i12);
                                        dnpVar3.c = i12 == i11 ? dnpVar3.c : Arrays.copyOf(dnpVar3.c, i12);
                                        ByteBuffer byteBuffer7 = dodVar4.a;
                                        int i14 = byteBuffer7.getShort() & 65535;
                                        dnpVar3.d = new int[i14];
                                        dnpVar3.e = new int[i14];
                                        dnpVar3.f = 0;
                                        int i15 = 0;
                                        for (int i16 = 0; i16 < i14; i16++) {
                                            int iA5 = dodVar4.a();
                                            byte b4 = byteBuffer7.get();
                                            if (dod.e(b4)) {
                                                dnpVar3.d[i15] = doiVar.b(iA5);
                                                dnpVar3.e[i15] = dnpVar3.f;
                                                i15++;
                                            }
                                            dnpVar3.f += dodVar4.b(b4);
                                        }
                                        dnpVar3.d = i15 == i14 ? dnpVar3.d : Arrays.copyOf(dnpVar3.d, i15);
                                        dnpVar3.e = i15 == i14 ? dnpVar3.e : Arrays.copyOf(dnpVar3.e, i15);
                                    }
                                    break;
                                case 33:
                                    int iPosition4 = dnuVar.c.position();
                                    int iA6 = dnuVar.b.a();
                                    dnuVar.c.getInt();
                                    int iA7 = dnuVar.b.a();
                                    int i17 = dnuVar.c.getInt();
                                    dnp dnpVar4 = (dnp) dnuVar.f.b(iA7);
                                    dnv dnvVar2 = (dnv) dnuVar.l.b(iA7);
                                    if (dnpVar4 != null && dnvVar2 != dnv.EXCLUDE_INSTANCE) {
                                        dnq dnqVar = new dnq(iPosition4, dnpVar4);
                                        dnqVar.q = dnuVar.k;
                                        dnuVar.g.a(iA6, dnqVar);
                                        if (dnvVar2 == dnv.FIND_INSTANCE) {
                                            String strC = dnpVar4.c(dnuVar.b);
                                            List arrayList = (List) dnuVar.h.get(strC);
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                                dnuVar.h.put(strC, arrayList);
                                            }
                                            arrayList.add(dnqVar);
                                        }
                                    }
                                    dnuVar.b.c(i17);
                                    break;
                                case 34:
                                    int iPosition5 = dnuVar.c.position();
                                    int iA8 = dnuVar.b.a();
                                    dnuVar.c.getInt();
                                    int i18 = dnuVar.c.getInt();
                                    int iA9 = dnuVar.b.a();
                                    dnv dnvVar3 = (dnv) dnuVar.l.b(iA9);
                                    if (dnuVar.f.c(iA9) && dnvVar3 != dnv.EXCLUDE_INSTANCE) {
                                        dno dnoVar = new dno(iPosition5, (dnp) dnuVar.f.b(iA9));
                                        dnoVar.q = dnuVar.k;
                                        dnuVar.g.a(iA8, dnoVar);
                                    }
                                    dnuVar.b.c(dnuVar.b.b * i18);
                                    break;
                                case 35:
                                case 195:
                                    int iPosition6 = dnuVar.c.position();
                                    int iA10 = dnuVar.b.a();
                                    dnuVar.c.getInt();
                                    int i19 = dnuVar.c.getInt();
                                    byte b5 = dnuVar.c.get();
                                    dnv dnvVar4 = (dnv) dnuVar.m.b(b5);
                                    dnuVar.b.c(i19 * dnuVar.b.b(b5));
                                    if (dnvVar4 != dnv.EXCLUDE_INSTANCE) {
                                        dnw dnwVar = new dnw(iPosition6);
                                        dnwVar.q = dnuVar.k;
                                        dnuVar.g.a(iA10, dnwVar);
                                    }
                                    break;
                                case 254:
                                    dnuVar.c.getInt();
                                    dnuVar.k = dnuVar.b.a(dnuVar.d.b(dnuVar.b.a()));
                                    break;
                                default:
                                    throw new IllegalArgumentException(new StringBuilder(23).append("Unknown tag ").append(i6).toString());
                            }
                        }
                    }
                    dse.b(dnuVar.c.position() == iPosition3);
                    break;
                default:
                    dnuVar.b.c(dnuVar.c.getInt());
                    break;
            }
        }
        dom domVarB = dnuVar.f.b();
        while (domVarB.a()) {
            ((dnp) domVarB.b).c();
        }
        ArrayList arrayList2 = new ArrayList();
        doi doiVar2 = dnuVar.e;
        doj dojVar = new doj(doiVar2.c, doiVar2.d, doiVar2.b);
        while (true) {
            dojVar.f = dojVar.c;
            while (dojVar.f == dojVar.c && dojVar.d < dojVar.b.length) {
                int[] iArr = dojVar.b;
                int i20 = dojVar.d;
                dojVar.d = i20 + 1;
                dojVar.f = iArr[i20];
            }
            if (dojVar.d > 0) {
                dojVar.e = dojVar.a[dojVar.d - 1];
            }
            if (dojVar.f == dojVar.c) {
                dnuVar.d.a();
                dnuVar.l.a();
                return new dof(dnuVar.f, dnuVar.g, arrayList2, dnuVar.h);
            }
            int i21 = dojVar.e;
            dnt dntVar = (dnt) dnuVar.f.b(i21);
            if (dntVar != null || (dntVar = (dnt) dnuVar.g.b(i21)) != null) {
                dntVar.o |= 1;
                dntVar.p = dojVar.f;
                arrayList2.add(dntVar);
            }
        }
    }

    private dnu(dod dodVar, Iterable iterable, Iterable iterable2, Iterable iterable3) {
        this.b = dodVar;
        this.c = dodVar.a;
        this.n.a(Reference.class.getName(), dnv.CLASSIFY_REF);
        this.n.a(Object.class.getName(), dnv.IDENTIFY_OBJECT_CLASS);
        this.n.a(Class.class.getName(), dnv.IDENTIFY_JAVA_LANG_CLASS);
        if (iterable2 != null) {
            Iterator it = iterable2.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                this.n.a(str, dnv.EXCLUDE_INSTANCE);
                if (a.containsKey(str)) {
                    this.m.a(((Integer) a.get(str)).intValue(), dnv.EXCLUDE_INSTANCE);
                }
            }
        }
        if (iterable3 != null) {
            Iterator it2 = iterable3.iterator();
            while (it2.hasNext()) {
                this.n.a((String) it2.next(), dnv.FIND_INSTANCE);
            }
        }
        if (iterable != null) {
            Iterator it3 = iterable.iterator();
            while (it3.hasNext()) {
                this.i.a(((Integer) it3.next()).intValue(), 0);
            }
        }
    }

    static {
        rt rtVar = new rt();
        a = rtVar;
        rtVar.put("boolean[]", 4);
        a.put("char[]", 5);
        a.put("float[]", 6);
        a.put("double[]", 7);
        a.put("byte[]", 8);
        a.put("short[]", 9);
        a.put("int[]", 10);
        a.put("long[]", 11);
    }
}
