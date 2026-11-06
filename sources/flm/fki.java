package flm;

import com.google.android.gms.kids.aidl.IKidsInternalService;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fki implements fky {
    private static final int[] a = new int[0];
    private static final Unsafe b = flw.a();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final fke g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final int[] l;
    private final int m;
    private final int n;
    private final fkl o;
    private final fjp p;
    private final flq q;
    private final fid r;
    private final fjz s;

    private fki(int[] iArr, Object[] objArr, int i, int i2, fke fkeVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, fkl fklVar, fjp fjpVar, flq flqVar, fid fidVar, fjz fjzVar) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = fkeVar instanceof fin;
        this.j = z;
        this.h = fidVar != null && fidVar.a(fkeVar);
        this.k = z2;
        this.l = iArr2;
        this.m = i3;
        this.n = i4;
        this.o = fklVar;
        this.p = fjpVar;
        this.q = flqVar;
        this.r = fidVar;
        this.g = fkeVar;
        this.s = fjzVar;
    }

    /* JADX WARN: Code duplicated, block: B:191:0x04db  */
    static fki a(fkc fkcVar, fkl fklVar, fjp fjpVar, flq flqVar, fid fidVar, fjz fjzVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int iCharAt;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        char cCharAt;
        char cCharAt2;
        char cCharAt3;
        char cCharAt4;
        char cCharAt5;
        char cCharAt6;
        char cCharAt7;
        char cCharAt8;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iObjectFieldOffset;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Field fieldA;
        char cCharAt9;
        int i25;
        int i26;
        Field fieldA2;
        Field fieldA3;
        int i27;
        char cCharAt10;
        char cCharAt11;
        char cCharAt12;
        int i28;
        char cCharAt13;
        char cCharAt14;
        if (fkcVar instanceof fks) {
            fks fksVar = (fks) fkcVar;
            boolean z = fksVar.a() == dp.az;
            String str = fksVar.b;
            int length = str.length();
            int i29 = 1;
            char cCharAt15 = str.charAt(0);
            if (cCharAt15 >= 55296) {
                int i30 = cCharAt15 & 8191;
                int i31 = 13;
                while (true) {
                    i2 = i29 + 1;
                    cCharAt14 = str.charAt(i29);
                    if (cCharAt14 < 55296) {
                        break;
                    }
                    i30 |= (cCharAt14 & 8191) << i31;
                    i31 += 13;
                    i29 = i2;
                }
                i = (cCharAt14 << i31) | i30;
            } else {
                i = cCharAt15;
                i2 = 1;
            }
            int i32 = i2 + 1;
            int iCharAt2 = str.charAt(i2);
            if (iCharAt2 >= 55296) {
                int i33 = iCharAt2 & 8191;
                int i34 = 13;
                while (true) {
                    i28 = i32 + 1;
                    cCharAt13 = str.charAt(i32);
                    if (cCharAt13 < 55296) {
                        break;
                    }
                    i33 |= (cCharAt13 & 8191) << i34;
                    i34 += 13;
                    i32 = i28;
                }
                iCharAt2 = (cCharAt13 << i34) | i33;
                i3 = i28;
            } else {
                i3 = i32;
            }
            if (iCharAt2 == 0) {
                iCharAt = 0;
                iArr = a;
                i7 = 0;
                i5 = 0;
                i6 = 0;
                i8 = 0;
                i9 = 0;
                i10 = 0;
            } else {
                int i35 = i3 + 1;
                int iCharAt3 = str.charAt(i3);
                if (iCharAt3 >= 55296) {
                    int i36 = iCharAt3 & 8191;
                    int i37 = 13;
                    while (true) {
                        i4 = i35 + 1;
                        cCharAt8 = str.charAt(i35);
                        if (cCharAt8 < 55296) {
                            break;
                        }
                        i36 |= (cCharAt8 & 8191) << i37;
                        i37 += 13;
                        i35 = i4;
                    }
                    iCharAt3 = (cCharAt8 << i37) | i36;
                } else {
                    i4 = i35;
                }
                int i38 = i4 + 1;
                int iCharAt4 = str.charAt(i4);
                if (iCharAt4 >= 55296) {
                    int i39 = iCharAt4 & 8191;
                    int i40 = 13;
                    while (true) {
                        int i41 = i38;
                        i38 = i41 + 1;
                        cCharAt7 = str.charAt(i41);
                        if (cCharAt7 < 55296) {
                            break;
                        }
                        i39 |= (cCharAt7 & 8191) << i40;
                        i40 += 13;
                    }
                    iCharAt4 = (cCharAt7 << i40) | i39;
                }
                int i42 = i38 + 1;
                int iCharAt5 = str.charAt(i38);
                if (iCharAt5 >= 55296) {
                    int i43 = iCharAt5 & 8191;
                    int i44 = 13;
                    while (true) {
                        int i45 = i42;
                        i42 = i45 + 1;
                        cCharAt6 = str.charAt(i45);
                        if (cCharAt6 < 55296) {
                            break;
                        }
                        i43 |= (cCharAt6 & 8191) << i44;
                        i44 += 13;
                    }
                    iCharAt5 = (cCharAt6 << i44) | i43;
                }
                int i46 = i42 + 1;
                int iCharAt6 = str.charAt(i42);
                if (iCharAt6 >= 55296) {
                    int i47 = iCharAt6 & 8191;
                    int i48 = 13;
                    while (true) {
                        int i49 = i46;
                        i46 = i49 + 1;
                        cCharAt5 = str.charAt(i49);
                        if (cCharAt5 < 55296) {
                            break;
                        }
                        i47 |= (cCharAt5 & 8191) << i48;
                        i48 += 13;
                    }
                    iCharAt6 = (cCharAt5 << i48) | i47;
                }
                int i50 = i46 + 1;
                int iCharAt7 = str.charAt(i46);
                if (iCharAt7 >= 55296) {
                    int i51 = iCharAt7 & 8191;
                    int i52 = 13;
                    while (true) {
                        int i53 = i50;
                        i50 = i53 + 1;
                        cCharAt4 = str.charAt(i53);
                        if (cCharAt4 < 55296) {
                            break;
                        }
                        i51 |= (cCharAt4 & 8191) << i52;
                        i52 += 13;
                    }
                    iCharAt7 = (cCharAt4 << i52) | i51;
                }
                int i54 = i50 + 1;
                int iCharAt8 = str.charAt(i50);
                if (iCharAt8 >= 55296) {
                    int i55 = iCharAt8 & 8191;
                    int i56 = 13;
                    while (true) {
                        int i57 = i54;
                        i54 = i57 + 1;
                        cCharAt3 = str.charAt(i57);
                        if (cCharAt3 < 55296) {
                            break;
                        }
                        i55 |= (cCharAt3 & 8191) << i56;
                        i56 += 13;
                    }
                    iCharAt8 = (cCharAt3 << i56) | i55;
                }
                int i58 = i54 + 1;
                int iCharAt9 = str.charAt(i54);
                if (iCharAt9 >= 55296) {
                    int i59 = iCharAt9 & 8191;
                    int i60 = 13;
                    while (true) {
                        int i61 = i58;
                        i58 = i61 + 1;
                        cCharAt2 = str.charAt(i61);
                        if (cCharAt2 < 55296) {
                            break;
                        }
                        i59 |= (cCharAt2 & 8191) << i60;
                        i60 += 13;
                    }
                    iCharAt9 = (cCharAt2 << i60) | i59;
                }
                i3 = i58 + 1;
                iCharAt = str.charAt(i58);
                if (iCharAt >= 55296) {
                    int i62 = iCharAt & 8191;
                    int i63 = 13;
                    while (true) {
                        int i64 = i3;
                        i3 = i64 + 1;
                        cCharAt = str.charAt(i64);
                        if (cCharAt < 55296) {
                            break;
                        }
                        i62 |= (cCharAt & 8191) << i63;
                        i63 += 13;
                    }
                    iCharAt = (cCharAt << i63) | i62;
                }
                iArr = new int[iCharAt9 + iCharAt + iCharAt8];
                i5 = iCharAt8;
                i6 = iCharAt3;
                i7 = iCharAt4 + (iCharAt3 << 1);
                int i65 = iCharAt6;
                i8 = iCharAt5;
                i9 = iCharAt7;
                i10 = i65;
            }
            Unsafe unsafe = b;
            Object[] objArr = fksVar.c;
            int i66 = 0;
            Class<?> cls = fksVar.a.getClass();
            int[] iArr2 = new int[i9 * 3];
            Object[] objArr2 = new Object[i9 << 1];
            int i67 = iCharAt + i5;
            int i68 = 0;
            int i69 = iCharAt;
            int i70 = i7;
            int i71 = i3;
            while (i71 < length) {
                int i72 = i71 + 1;
                char cCharAt16 = str.charAt(i71);
                if (cCharAt16 >= 55296) {
                    int i73 = cCharAt16 & 8191;
                    int i74 = 13;
                    while (true) {
                        i12 = i72 + 1;
                        cCharAt12 = str.charAt(i72);
                        if (cCharAt12 < 55296) {
                            break;
                        }
                        i73 |= (cCharAt12 & 8191) << i74;
                        i74 += 13;
                        i72 = i12;
                    }
                    i11 = (cCharAt12 << i74) | i73;
                } else {
                    i11 = cCharAt16;
                    i12 = i72;
                }
                int i75 = i12 + 1;
                char cCharAt17 = str.charAt(i12);
                if (cCharAt17 >= 55296) {
                    int i76 = cCharAt17 & 8191;
                    int i77 = 13;
                    while (true) {
                        int i78 = i75;
                        i75 = i78 + 1;
                        cCharAt11 = str.charAt(i78);
                        if (cCharAt11 < 55296) {
                            break;
                        }
                        i76 |= (cCharAt11 & 8191) << i77;
                        i77 += 13;
                    }
                    i13 = (cCharAt11 << i77) | i76;
                    i14 = i75;
                } else {
                    i13 = cCharAt17;
                    i14 = i75;
                }
                int i79 = i13 & 255;
                if ((i13 & 1024) != 0) {
                    iArr[i66] = i68;
                    i15 = i66 + 1;
                } else {
                    i15 = i66;
                }
                if (i79 >= 51) {
                    int i80 = i14 + 1;
                    char cCharAt18 = str.charAt(i14);
                    if (cCharAt18 >= 55296) {
                        int i81 = cCharAt18 & 8191;
                        int i82 = 13;
                        while (true) {
                            i27 = i80 + 1;
                            cCharAt10 = str.charAt(i80);
                            if (cCharAt10 < 55296) {
                                break;
                            }
                            i81 |= (cCharAt10 & 8191) << i82;
                            i82 += 13;
                            i80 = i27;
                        }
                        i25 = (cCharAt10 << i82) | i81;
                        i21 = i27;
                    } else {
                        i21 = i80;
                        i25 = cCharAt18;
                    }
                    int i83 = i79 - 51;
                    if (i83 == 9 || i83 == 17) {
                        objArr2[((i68 / 3) << 1) + 1] = objArr[i70];
                        i26 = i70 + 1;
                    } else if (i83 == 12 && (i & 1) == 1) {
                        objArr2[((i68 / 3) << 1) + 1] = objArr[i70];
                        i26 = i70 + 1;
                    } else {
                        i26 = i70;
                    }
                    int i84 = i25 << 1;
                    Object obj = objArr[i84];
                    if (obj instanceof Field) {
                        fieldA2 = (Field) obj;
                    } else {
                        fieldA2 = a((Class) cls, (String) obj);
                        objArr[i84] = fieldA2;
                    }
                    int iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldA2);
                    int i85 = i84 + 1;
                    Object obj2 = objArr[i85];
                    if (obj2 instanceof Field) {
                        fieldA3 = (Field) obj2;
                    } else {
                        fieldA3 = a((Class) cls, (String) obj2);
                        objArr[i85] = fieldA3;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldA3);
                    i70 = i26;
                    i22 = 0;
                    i20 = iObjectFieldOffset2;
                    i23 = i67;
                } else {
                    int i86 = i70 + 1;
                    Field fieldA4 = a((Class) cls, (String) objArr[i70]);
                    if (i79 == 9 || i79 == 17) {
                        objArr2[((i68 / 3) << 1) + 1] = fieldA4.getType();
                        i16 = i86;
                        i17 = i69;
                    } else if (i79 == 27 || i79 == 49) {
                        int i87 = i86 + 1;
                        objArr2[((i68 / 3) << 1) + 1] = objArr[i86];
                        i17 = i69;
                        i16 = i87;
                    } else if (i79 == 12 || i79 == 30 || i79 == 44) {
                        if ((i & 1) == 1) {
                            int i88 = i86 + 1;
                            objArr2[((i68 / 3) << 1) + 1] = objArr[i86];
                            i17 = i69;
                            i16 = i88;
                        } else {
                            i16 = i86;
                            i17 = i69;
                        }
                    } else if (i79 == 50) {
                        int i89 = i69 + 1;
                        iArr[i69] = i68;
                        i16 = i86 + 1;
                        objArr2[(i68 / 3) << 1] = objArr[i86];
                        if ((i13 & 2048) != 0) {
                            objArr2[((i68 / 3) << 1) + 1] = objArr[i16];
                            i16++;
                            i17 = i89;
                        } else {
                            i17 = i89;
                        }
                    } else {
                        i16 = i86;
                        i17 = i69;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldA4);
                    if ((i & 1) == 1 && i79 <= 17) {
                        int i90 = i14 + 1;
                        char cCharAt19 = str.charAt(i14);
                        if (cCharAt19 >= 55296) {
                            int i91 = cCharAt19 & 8191;
                            int i92 = 13;
                            while (true) {
                                i19 = i90 + 1;
                                cCharAt9 = str.charAt(i90);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i91 |= (cCharAt9 & 8191) << i92;
                                i92 += 13;
                                i90 = i19;
                            }
                            i24 = (cCharAt9 << i92) | i91;
                        } else {
                            i24 = cCharAt19;
                            i19 = i90;
                        }
                        int i93 = (i24 / 32) + (i6 << 1);
                        Object obj3 = objArr[i93];
                        if (obj3 instanceof Field) {
                            fieldA = (Field) obj3;
                        } else {
                            fieldA = a((Class) cls, (String) obj3);
                            objArr[i93] = fieldA;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldA);
                        i18 = i24 % 32;
                    } else {
                        iObjectFieldOffset = 0;
                        i18 = 0;
                        i19 = i14;
                    }
                    if (i79 < 18 || i79 > 49) {
                        i70 = i16;
                        i20 = iObjectFieldOffset3;
                        i21 = i19;
                        i69 = i17;
                        i22 = i18;
                        i23 = i67;
                    } else {
                        iArr[i67] = iObjectFieldOffset3;
                        int i94 = i18;
                        i23 = i67 + 1;
                        i70 = i16;
                        i20 = iObjectFieldOffset3;
                        i21 = i19;
                        i69 = i17;
                        i22 = i94;
                    }
                }
                int i95 = i68 + 1;
                iArr2[i68] = i11;
                int i96 = i95 + 1;
                iArr2[i95] = ((i13 & 256) != 0 ? 268435456 : 0) | ((i13 & 512) != 0 ? 536870912 : 0) | (i79 << 20) | i20;
                iArr2[i96] = iObjectFieldOffset | (i22 << 20);
                i68 = i96 + 1;
                i67 = i23;
                i71 = i21;
                i66 = i15;
            }
            return new fki(iArr2, objArr2, i8, i10, fksVar.a, z, false, iArr, iCharAt, i5 + iCharAt, fklVar, fjpVar, flqVar, fidVar, fjzVar);
        }
        throw new NoSuchMethodError();
    }

    private static Field a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            throw new RuntimeException(new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(string).length()).append("Field ").append(str).append(" for ").append(name).append(" not found. Known fields are ").append(string).toString());
        }
    }

    @Override // flm.fky
    public final Object a() {
        return this.o.a(this.g);
    }

    @Override // flm.fky
    public final boolean a(Object obj, Object obj2) {
        boolean zA;
        int length = this.c.length;
        for (int i = 0; i < length; i += 3) {
            int iD = d(i);
            long j = iD & 1048575;
            switch ((iD & 267386880) >>> 20) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    zA = c(obj, obj2, i) && Double.doubleToLongBits(flw.e(obj, j)) == Double.doubleToLongBits(flw.e(obj2, j));
                    break;
                case 1:
                    zA = c(obj, obj2, i) && Float.floatToIntBits(flw.d(obj, j)) == Float.floatToIntBits(flw.d(obj2, j));
                    break;
                case 2:
                    zA = c(obj, obj2, i) && flw.b(obj, j) == flw.b(obj2, j);
                    break;
                case 3:
                    zA = c(obj, obj2, i) && flw.b(obj, j) == flw.b(obj2, j);
                    break;
                case 4:
                    zA = c(obj, obj2, i) && flw.a(obj, j) == flw.a(obj2, j);
                    break;
                case 5:
                    zA = c(obj, obj2, i) && flw.b(obj, j) == flw.b(obj2, j);
                    break;
                case 6:
                    zA = c(obj, obj2, i) && flw.a(obj, j) == flw.a(obj2, j);
                    break;
                case 7:
                    zA = c(obj, obj2, i) && flw.c(obj, j) == flw.c(obj2, j);
                    break;
                case 8:
                    zA = c(obj, obj2, i) && fla.a(flw.f(obj, j), flw.f(obj2, j));
                    break;
                case 9:
                    zA = c(obj, obj2, i) && fla.a(flw.f(obj, j), flw.f(obj2, j));
                    break;
                case 10:
                    zA = c(obj, obj2, i) && fla.a(flw.f(obj, j), flw.f(obj2, j));
                    break;
                case 11:
                    zA = c(obj, obj2, i) && flw.a(obj, j) == flw.a(obj2, j);
                    break;
                case 12:
                    zA = c(obj, obj2, i) && flw.a(obj, j) == flw.a(obj2, j);
                    break;
                case 13:
                    zA = c(obj, obj2, i) && flw.a(obj, j) == flw.a(obj2, j);
                    break;
                case 14:
                    zA = c(obj, obj2, i) && flw.b(obj, j) == flw.b(obj2, j);
                    break;
                case 15:
                    zA = c(obj, obj2, i) && flw.a(obj, j) == flw.a(obj2, j);
                    break;
                case 16:
                    zA = c(obj, obj2, i) && flw.b(obj, j) == flw.b(obj2, j);
                    break;
                case 17:
                    zA = c(obj, obj2, i) && fla.a(flw.f(obj, j), flw.f(obj2, j));
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case IKidsInternalService.Stub.TRANSACTION_verifyParentAccessCode /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case IKidsInternalService.Stub.TRANSACTION_startService /* 39 */:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case IKidsInternalService.Stub.TRANSACTION_getMemberSvExitState /* 48 */:
                case IKidsInternalService.Stub.TRANSACTION_setMemberSvExitState /* 49 */:
                    zA = fla.a(flw.f(obj, j), flw.f(obj2, j));
                    break;
                case 50:
                    zA = fla.a(flw.f(obj, j), flw.f(obj2, j));
                    break;
                case IKidsInternalService.Stub.TRANSACTION_clearLockdownInfo /* 51 */:
                case IKidsInternalService.Stub.TRANSACTION_listManagedDevices /* 52 */:
                case IKidsInternalService.Stub.TRANSACTION_logToClearcutFromUi /* 53 */:
                case IKidsInternalService.Stub.TRANSACTION_getSuwLibraryFlows /* 54 */:
                case IKidsInternalService.Stub.TRANSACTION_getLockdownInfo /* 55 */:
                case IKidsInternalService.Stub.TRANSACTION_setLockdownInfoForPermalock /* 56 */:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    int iE = e(i);
                    zA = flw.a(obj, iE & 1048575) == flw.a(obj2, iE & 1048575) && fla.a(flw.f(obj, j), flw.f(obj2, j));
                    break;
                default:
                    zA = true;
                    break;
            }
            if (!zA) {
                return false;
            }
        }
        if (!this.q.b(obj).equals(this.q.b(obj2))) {
            return false;
        }
        if (this.h) {
            return this.r.a(obj).equals(this.r.a(obj2));
        }
        return true;
    }

    @Override // flm.fky
    public final int a(Object obj) {
        int length = this.c.length;
        int i = 0;
        int iHashCode = 0;
        while (i < length) {
            int iD = d(i);
            int i2 = this.c[i];
            long j = 1048575 & iD;
            switch ((iD & 267386880) >>> 20) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    iHashCode = (iHashCode * 53) + fiv.a(Double.doubleToLongBits(flw.e(obj, j)));
                    continue;
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 1:
                    iHashCode = (iHashCode * 53) + Float.floatToIntBits(flw.d(obj, j));
                    continue;
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 2:
                    iHashCode = (iHashCode * 53) + fiv.a(flw.b(obj, j));
                    continue;
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 3:
                    iHashCode = (iHashCode * 53) + fiv.a(flw.b(obj, j));
                    continue;
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 4:
                    iHashCode = (iHashCode * 53) + flw.a(obj, j);
                    continue;
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 5:
                    iHashCode = (iHashCode * 53) + fiv.a(flw.b(obj, j));
                    continue;
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 6:
                    iHashCode = (iHashCode * 53) + flw.a(obj, j);
                    continue;
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 7:
                    iHashCode = (iHashCode * 53) + fiv.a(flw.c(obj, j));
                    continue;
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 8:
                    iHashCode = ((String) flw.f(obj, j)).hashCode() + (iHashCode * 53);
                    continue;
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 9:
                    Object objF = flw.f(obj, j);
                    iHashCode = (objF != null ? objF.hashCode() : 37) + (iHashCode * 53);
                    continue;
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 10:
                    iHashCode = (iHashCode * 53) + flw.f(obj, j).hashCode();
                    continue;
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 11:
                    iHashCode = (iHashCode * 53) + flw.a(obj, j);
                    continue;
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 12:
                    iHashCode = (iHashCode * 53) + flw.a(obj, j);
                    continue;
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 13:
                    iHashCode = (iHashCode * 53) + flw.a(obj, j);
                    continue;
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 14:
                    iHashCode = (iHashCode * 53) + fiv.a(flw.b(obj, j));
                    continue;
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 15:
                    iHashCode = (iHashCode * 53) + flw.a(obj, j);
                    continue;
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 16:
                    iHashCode = (iHashCode * 53) + fiv.a(flw.b(obj, j));
                    continue;
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 17:
                    Object objF2 = flw.f(obj, j);
                    iHashCode = (objF2 != null ? objF2.hashCode() : 37) + (iHashCode * 53);
                    continue;
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case IKidsInternalService.Stub.TRANSACTION_verifyParentAccessCode /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case IKidsInternalService.Stub.TRANSACTION_startService /* 39 */:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case IKidsInternalService.Stub.TRANSACTION_getMemberSvExitState /* 48 */:
                case IKidsInternalService.Stub.TRANSACTION_setMemberSvExitState /* 49 */:
                    iHashCode = (iHashCode * 53) + flw.f(obj, j).hashCode();
                    continue;
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 50:
                    iHashCode = (iHashCode * 53) + flw.f(obj, j).hashCode();
                    continue;
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case IKidsInternalService.Stub.TRANSACTION_clearLockdownInfo /* 51 */:
                    if (a(obj, i2, i)) {
                        iHashCode = (iHashCode * 53) + fiv.a(Double.doubleToLongBits(b(obj, j)));
                    }
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case IKidsInternalService.Stub.TRANSACTION_listManagedDevices /* 52 */:
                    if (a(obj, i2, i)) {
                        iHashCode = (iHashCode * 53) + Float.floatToIntBits(c(obj, j));
                    }
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case IKidsInternalService.Stub.TRANSACTION_logToClearcutFromUi /* 53 */:
                    if (a(obj, i2, i)) {
                        iHashCode = (iHashCode * 53) + fiv.a(e(obj, j));
                    }
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case IKidsInternalService.Stub.TRANSACTION_getSuwLibraryFlows /* 54 */:
                    if (a(obj, i2, i)) {
                        iHashCode = (iHashCode * 53) + fiv.a(e(obj, j));
                    }
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case IKidsInternalService.Stub.TRANSACTION_getLockdownInfo /* 55 */:
                    if (a(obj, i2, i)) {
                        iHashCode = (iHashCode * 53) + d(obj, j);
                    }
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case IKidsInternalService.Stub.TRANSACTION_setLockdownInfoForPermalock /* 56 */:
                    if (a(obj, i2, i)) {
                        iHashCode = (iHashCode * 53) + fiv.a(e(obj, j));
                    }
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 57:
                    if (a(obj, i2, i)) {
                        iHashCode = (iHashCode * 53) + d(obj, j);
                    }
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 58:
                    if (a(obj, i2, i)) {
                        iHashCode = (iHashCode * 53) + fiv.a(f(obj, j));
                    }
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 59:
                    if (a(obj, i2, i)) {
                        iHashCode = ((String) flw.f(obj, j)).hashCode() + (iHashCode * 53);
                    }
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 60:
                    if (a(obj, i2, i)) {
                        iHashCode = flw.f(obj, j).hashCode() + (iHashCode * 53);
                    }
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 61:
                    if (a(obj, i2, i)) {
                        iHashCode = (iHashCode * 53) + flw.f(obj, j).hashCode();
                    }
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 62:
                    if (a(obj, i2, i)) {
                        iHashCode = (iHashCode * 53) + d(obj, j);
                    }
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 63:
                    if (a(obj, i2, i)) {
                        iHashCode = (iHashCode * 53) + d(obj, j);
                    }
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 64:
                    if (a(obj, i2, i)) {
                        iHashCode = (iHashCode * 53) + d(obj, j);
                    }
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 65:
                    if (a(obj, i2, i)) {
                        iHashCode = (iHashCode * 53) + fiv.a(e(obj, j));
                    }
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 66:
                    if (a(obj, i2, i)) {
                        iHashCode = (iHashCode * 53) + d(obj, j);
                    }
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 67:
                    if (a(obj, i2, i)) {
                        iHashCode = (iHashCode * 53) + fiv.a(e(obj, j));
                    }
                    i += 3;
                    iHashCode = iHashCode;
                    break;
                case 68:
                    if (a(obj, i2, i)) {
                        iHashCode = flw.f(obj, j).hashCode() + (iHashCode * 53);
                    }
                    i += 3;
                    iHashCode = iHashCode;
                    break;
            }
            i += 3;
            iHashCode = iHashCode;
        }
        int iHashCode2 = (iHashCode * 53) + this.q.b(obj).hashCode();
        if (this.h) {
            return (iHashCode2 * 53) + this.r.a(obj).hashCode();
        }
        return iHashCode2;
    }

    @Override // flm.fky
    public final void b(Object obj, Object obj2) {
        if (obj2 == null) {
            throw new NullPointerException();
        }
        for (int i = 0; i < this.c.length; i += 3) {
            int iD = d(i);
            long j = 1048575 & iD;
            int i2 = this.c[i];
            switch ((iD & 267386880) >>> 20) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    if (a(obj2, i)) {
                        flw.a(obj, j, flw.e(obj2, j));
                        b(obj, i);
                    }
                    break;
                case 1:
                    if (a(obj2, i)) {
                        flw.a(obj, j, flw.d(obj2, j));
                        b(obj, i);
                    }
                    break;
                case 2:
                    if (a(obj2, i)) {
                        flw.a(obj, j, flw.b(obj2, j));
                        b(obj, i);
                    }
                    break;
                case 3:
                    if (a(obj2, i)) {
                        flw.a(obj, j, flw.b(obj2, j));
                        b(obj, i);
                    }
                    break;
                case 4:
                    if (a(obj2, i)) {
                        flw.a(obj, j, flw.a(obj2, j));
                        b(obj, i);
                    }
                    break;
                case 5:
                    if (a(obj2, i)) {
                        flw.a(obj, j, flw.b(obj2, j));
                        b(obj, i);
                    }
                    break;
                case 6:
                    if (a(obj2, i)) {
                        flw.a(obj, j, flw.a(obj2, j));
                        b(obj, i);
                    }
                    break;
                case 7:
                    if (a(obj2, i)) {
                        flw.a(obj, j, flw.c(obj2, j));
                        b(obj, i);
                    }
                    break;
                case 8:
                    if (a(obj2, i)) {
                        flw.a(obj, j, flw.f(obj2, j));
                        b(obj, i);
                    }
                    break;
                case 9:
                    a(obj, obj2, i);
                    break;
                case 10:
                    if (a(obj2, i)) {
                        flw.a(obj, j, flw.f(obj2, j));
                        b(obj, i);
                    }
                    break;
                case 11:
                    if (a(obj2, i)) {
                        flw.a(obj, j, flw.a(obj2, j));
                        b(obj, i);
                    }
                    break;
                case 12:
                    if (a(obj2, i)) {
                        flw.a(obj, j, flw.a(obj2, j));
                        b(obj, i);
                    }
                    break;
                case 13:
                    if (a(obj2, i)) {
                        flw.a(obj, j, flw.a(obj2, j));
                        b(obj, i);
                    }
                    break;
                case 14:
                    if (a(obj2, i)) {
                        flw.a(obj, j, flw.b(obj2, j));
                        b(obj, i);
                    }
                    break;
                case 15:
                    if (a(obj2, i)) {
                        flw.a(obj, j, flw.a(obj2, j));
                        b(obj, i);
                    }
                    break;
                case 16:
                    if (a(obj2, i)) {
                        flw.a(obj, j, flw.b(obj2, j));
                        b(obj, i);
                    }
                    break;
                case 17:
                    a(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case IKidsInternalService.Stub.TRANSACTION_verifyParentAccessCode /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case IKidsInternalService.Stub.TRANSACTION_startService /* 39 */:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case IKidsInternalService.Stub.TRANSACTION_getMemberSvExitState /* 48 */:
                case IKidsInternalService.Stub.TRANSACTION_setMemberSvExitState /* 49 */:
                    this.p.a(obj, obj2, j);
                    break;
                case 50:
                    fla.a(this.s, obj, obj2, j);
                    break;
                case IKidsInternalService.Stub.TRANSACTION_clearLockdownInfo /* 51 */:
                case IKidsInternalService.Stub.TRANSACTION_listManagedDevices /* 52 */:
                case IKidsInternalService.Stub.TRANSACTION_logToClearcutFromUi /* 53 */:
                case IKidsInternalService.Stub.TRANSACTION_getSuwLibraryFlows /* 54 */:
                case IKidsInternalService.Stub.TRANSACTION_getLockdownInfo /* 55 */:
                case IKidsInternalService.Stub.TRANSACTION_setLockdownInfoForPermalock /* 56 */:
                case 57:
                case 58:
                case 59:
                    if (a(obj2, i2, i)) {
                        flw.a(obj, j, flw.f(obj2, j));
                        b(obj, i2, i);
                    }
                    break;
                case 60:
                    b(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (a(obj2, i2, i)) {
                        flw.a(obj, j, flw.f(obj2, j));
                        b(obj, i2, i);
                    }
                    break;
                case 68:
                    b(obj, obj2, i);
                    break;
            }
        }
        if (!this.j) {
            fla.a(this.q, obj, obj2);
            if (this.h) {
                fla.a(this.r, obj, obj2);
            }
        }
    }

    private final void a(Object obj, Object obj2, int i) {
        long jD = d(i) & 1048575;
        if (a(obj2, i)) {
            Object objF = flw.f(obj, jD);
            Object objF2 = flw.f(obj2, jD);
            if (objF != null && objF2 != null) {
                flw.a(obj, jD, fiv.a(objF, objF2));
                b(obj, i);
            } else if (objF2 != null) {
                flw.a(obj, jD, objF2);
                b(obj, i);
            }
        }
    }

    private final void b(Object obj, Object obj2, int i) {
        int iD = d(i);
        int i2 = this.c[i];
        long j = iD & 1048575;
        if (a(obj2, i2, i)) {
            Object objF = flw.f(obj, j);
            Object objF2 = flw.f(obj2, j);
            if (objF != null && objF2 != null) {
                flw.a(obj, j, fiv.a(objF, objF2));
                b(obj, i2, i);
            } else if (objF2 != null) {
                flw.a(obj, j, objF2);
                b(obj, i2, i);
            }
        }
    }

    @Override // flm.fky
    public final int b(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.j) {
            Unsafe unsafe = b;
            int i5 = 0;
            int iC = 0;
            while (true) {
                int i6 = i5;
                if (i6 < this.c.length) {
                    int iD = d(i6);
                    int i7 = (267386880 & iD) >>> 20;
                    int i8 = this.c[i6];
                    long j = iD & 1048575;
                    if (i7 >= fii.DOUBLE_LIST_PACKED.h && i7 <= fii.SINT64_LIST_PACKED.h) {
                        i4 = this.c[i6 + 2] & 1048575;
                    } else {
                        i4 = 0;
                    }
                    switch (i7) {
                        case bbx.MSG_UNBIND_SERVICE /* 0 */:
                            if (a(obj, i6)) {
                                iC += fhp.b(i8, 0.0d);
                            }
                            break;
                        case 1:
                            if (a(obj, i6)) {
                                iC += fhp.b(i8, 0.0f);
                            }
                            break;
                        case 2:
                            if (a(obj, i6)) {
                                iC += fhp.d(i8, flw.b(obj, j));
                            }
                            break;
                        case 3:
                            if (a(obj, i6)) {
                                iC += fhp.e(i8, flw.b(obj, j));
                            }
                            break;
                        case 4:
                            if (a(obj, i6)) {
                                iC += fhp.f(i8, flw.a(obj, j));
                            }
                            break;
                        case 5:
                            if (a(obj, i6)) {
                                iC += fhp.g(i8, 0L);
                            }
                            break;
                        case 6:
                            if (a(obj, i6)) {
                                iC += fhp.i(i8, 0);
                            }
                            break;
                        case 7:
                            if (a(obj, i6)) {
                                iC += fhp.b(i8, true);
                            }
                            break;
                        case 8:
                            if (a(obj, i6)) {
                                Object objF = flw.f(obj, j);
                                if (objF instanceof fgy) {
                                    iC += fhp.c(i8, (fgy) objF);
                                } else {
                                    iC += fhp.b(i8, (String) objF);
                                }
                            }
                            break;
                        case 9:
                            if (a(obj, i6)) {
                                iC += fla.a(i8, flw.f(obj, j), a(i6));
                            }
                            break;
                        case 10:
                            if (a(obj, i6)) {
                                iC += fhp.c(i8, (fgy) flw.f(obj, j));
                            }
                            break;
                        case 11:
                            if (a(obj, i6)) {
                                iC += fhp.g(i8, flw.a(obj, j));
                            }
                            break;
                        case 12:
                            if (a(obj, i6)) {
                                iC += fhp.k(i8, flw.a(obj, j));
                            }
                            break;
                        case 13:
                            if (a(obj, i6)) {
                                iC += fhp.j(i8, 0);
                            }
                            break;
                        case 14:
                            if (a(obj, i6)) {
                                iC += fhp.h(i8, 0L);
                            }
                            break;
                        case 15:
                            if (a(obj, i6)) {
                                iC += fhp.h(i8, flw.a(obj, j));
                            }
                            break;
                        case 16:
                            if (a(obj, i6)) {
                                iC += fhp.f(i8, flw.b(obj, j));
                            }
                            break;
                        case 17:
                            if (a(obj, i6)) {
                                iC += fhp.c(i8, (fke) flw.f(obj, j), a(i6));
                            }
                            break;
                        case 18:
                            iC += fla.i(i8, a(obj, j), false);
                            break;
                        case 19:
                            iC += fla.h(i8, a(obj, j), false);
                            break;
                        case 20:
                            iC += fla.a(i8, a(obj, j), false);
                            break;
                        case 21:
                            iC += fla.b(i8, a(obj, j), false);
                            break;
                        case 22:
                            iC += fla.e(i8, a(obj, j), false);
                            break;
                        case 23:
                            iC += fla.i(i8, a(obj, j), false);
                            break;
                        case 24:
                            iC += fla.h(i8, a(obj, j), false);
                            break;
                        case 25:
                            iC += fla.j(i8, a(obj, j), false);
                            break;
                        case 26:
                            iC += fla.a(i8, a(obj, j));
                            break;
                        case 27:
                            iC += fla.a(i8, a(obj, j), a(i6));
                            break;
                        case 28:
                            iC += fla.b(i8, a(obj, j));
                            break;
                        case IKidsInternalService.Stub.TRANSACTION_verifyParentAccessCode /* 29 */:
                            iC += fla.f(i8, a(obj, j), false);
                            break;
                        case 30:
                            iC += fla.d(i8, a(obj, j), false);
                            break;
                        case 31:
                            iC += fla.h(i8, a(obj, j), false);
                            break;
                        case 32:
                            iC += fla.i(i8, a(obj, j), false);
                            break;
                        case 33:
                            iC += fla.g(i8, a(obj, j), false);
                            break;
                        case 34:
                            iC += fla.c(i8, a(obj, j), false);
                            break;
                        case 35:
                            int i9 = fla.i((List) unsafe.getObject(obj, j));
                            if (i9 > 0) {
                                if (this.k) {
                                    unsafe.putInt(obj, i4, i9);
                                }
                                iC += i9 + fhp.f(i8) + fhp.h(i9);
                            }
                            break;
                        case 36:
                            int iH = fla.h((List) unsafe.getObject(obj, j));
                            if (iH > 0) {
                                if (this.k) {
                                    unsafe.putInt(obj, i4, iH);
                                }
                                iC += iH + fhp.f(i8) + fhp.h(iH);
                            }
                            break;
                        case 37:
                            int iA = fla.a((List) unsafe.getObject(obj, j));
                            if (iA > 0) {
                                if (this.k) {
                                    unsafe.putInt(obj, i4, iA);
                                }
                                iC += iA + fhp.f(i8) + fhp.h(iA);
                            }
                            break;
                        case 38:
                            int iB = fla.b((List) unsafe.getObject(obj, j));
                            if (iB > 0) {
                                if (this.k) {
                                    unsafe.putInt(obj, i4, iB);
                                }
                                iC += iB + fhp.f(i8) + fhp.h(iB);
                            }
                            break;
                        case IKidsInternalService.Stub.TRANSACTION_startService /* 39 */:
                            int iE = fla.e((List) unsafe.getObject(obj, j));
                            if (iE > 0) {
                                if (this.k) {
                                    unsafe.putInt(obj, i4, iE);
                                }
                                iC += iE + fhp.f(i8) + fhp.h(iE);
                            }
                            break;
                        case 40:
                            int i10 = fla.i((List) unsafe.getObject(obj, j));
                            if (i10 > 0) {
                                if (this.k) {
                                    unsafe.putInt(obj, i4, i10);
                                }
                                iC += i10 + fhp.f(i8) + fhp.h(i10);
                            }
                            break;
                        case 41:
                            int iH2 = fla.h((List) unsafe.getObject(obj, j));
                            if (iH2 > 0) {
                                if (this.k) {
                                    unsafe.putInt(obj, i4, iH2);
                                }
                                iC += iH2 + fhp.f(i8) + fhp.h(iH2);
                            }
                            break;
                        case 42:
                            int iJ = fla.j((List) unsafe.getObject(obj, j));
                            if (iJ > 0) {
                                if (this.k) {
                                    unsafe.putInt(obj, i4, iJ);
                                }
                                iC += iJ + fhp.f(i8) + fhp.h(iJ);
                            }
                            break;
                        case 43:
                            int iF = fla.f((List) unsafe.getObject(obj, j));
                            if (iF > 0) {
                                if (this.k) {
                                    unsafe.putInt(obj, i4, iF);
                                }
                                iC += iF + fhp.f(i8) + fhp.h(iF);
                            }
                            break;
                        case 44:
                            int iD2 = fla.d((List) unsafe.getObject(obj, j));
                            if (iD2 > 0) {
                                if (this.k) {
                                    unsafe.putInt(obj, i4, iD2);
                                }
                                iC += iD2 + fhp.f(i8) + fhp.h(iD2);
                            }
                            break;
                        case 45:
                            int iH3 = fla.h((List) unsafe.getObject(obj, j));
                            if (iH3 > 0) {
                                if (this.k) {
                                    unsafe.putInt(obj, i4, iH3);
                                }
                                iC += iH3 + fhp.f(i8) + fhp.h(iH3);
                            }
                            break;
                        case 46:
                            int i11 = fla.i((List) unsafe.getObject(obj, j));
                            if (i11 > 0) {
                                if (this.k) {
                                    unsafe.putInt(obj, i4, i11);
                                }
                                iC += i11 + fhp.f(i8) + fhp.h(i11);
                            }
                            break;
                        case 47:
                            int iG = fla.g((List) unsafe.getObject(obj, j));
                            if (iG > 0) {
                                if (this.k) {
                                    unsafe.putInt(obj, i4, iG);
                                }
                                iC += iG + fhp.f(i8) + fhp.h(iG);
                            }
                            break;
                        case IKidsInternalService.Stub.TRANSACTION_getMemberSvExitState /* 48 */:
                            int iC2 = fla.c((List) unsafe.getObject(obj, j));
                            if (iC2 > 0) {
                                if (this.k) {
                                    unsafe.putInt(obj, i4, iC2);
                                }
                                iC += iC2 + fhp.f(i8) + fhp.h(iC2);
                            }
                            break;
                        case IKidsInternalService.Stub.TRANSACTION_setMemberSvExitState /* 49 */:
                            iC += fla.b(i8, a(obj, j), a(i6));
                            break;
                        case 50:
                            iC += this.s.a(i8, flw.f(obj, j), b(i6));
                            break;
                        case IKidsInternalService.Stub.TRANSACTION_clearLockdownInfo /* 51 */:
                            if (a(obj, i8, i6)) {
                                iC += fhp.b(i8, 0.0d);
                            }
                            break;
                        case IKidsInternalService.Stub.TRANSACTION_listManagedDevices /* 52 */:
                            if (a(obj, i8, i6)) {
                                iC += fhp.b(i8, 0.0f);
                            }
                            break;
                        case IKidsInternalService.Stub.TRANSACTION_logToClearcutFromUi /* 53 */:
                            if (a(obj, i8, i6)) {
                                iC += fhp.d(i8, e(obj, j));
                            }
                            break;
                        case IKidsInternalService.Stub.TRANSACTION_getSuwLibraryFlows /* 54 */:
                            if (a(obj, i8, i6)) {
                                iC += fhp.e(i8, e(obj, j));
                            }
                            break;
                        case IKidsInternalService.Stub.TRANSACTION_getLockdownInfo /* 55 */:
                            if (a(obj, i8, i6)) {
                                iC += fhp.f(i8, d(obj, j));
                            }
                            break;
                        case IKidsInternalService.Stub.TRANSACTION_setLockdownInfoForPermalock /* 56 */:
                            if (a(obj, i8, i6)) {
                                iC += fhp.g(i8, 0L);
                            }
                            break;
                        case 57:
                            if (a(obj, i8, i6)) {
                                iC += fhp.i(i8, 0);
                            }
                            break;
                        case 58:
                            if (a(obj, i8, i6)) {
                                iC += fhp.b(i8, true);
                            }
                            break;
                        case 59:
                            if (a(obj, i8, i6)) {
                                Object objF2 = flw.f(obj, j);
                                if (objF2 instanceof fgy) {
                                    iC += fhp.c(i8, (fgy) objF2);
                                } else {
                                    iC += fhp.b(i8, (String) objF2);
                                }
                            }
                            break;
                        case 60:
                            if (a(obj, i8, i6)) {
                                iC += fla.a(i8, flw.f(obj, j), a(i6));
                            }
                            break;
                        case 61:
                            if (a(obj, i8, i6)) {
                                iC += fhp.c(i8, (fgy) flw.f(obj, j));
                            }
                            break;
                        case 62:
                            if (a(obj, i8, i6)) {
                                iC += fhp.g(i8, d(obj, j));
                            }
                            break;
                        case 63:
                            if (a(obj, i8, i6)) {
                                iC += fhp.k(i8, d(obj, j));
                            }
                            break;
                        case 64:
                            if (a(obj, i8, i6)) {
                                iC += fhp.j(i8, 0);
                            }
                            break;
                        case 65:
                            if (a(obj, i8, i6)) {
                                iC += fhp.h(i8, 0L);
                            }
                            break;
                        case 66:
                            if (a(obj, i8, i6)) {
                                iC += fhp.h(i8, d(obj, j));
                            }
                            break;
                        case 67:
                            if (a(obj, i8, i6)) {
                                iC += fhp.f(i8, e(obj, j));
                            }
                            break;
                        case 68:
                            if (a(obj, i8, i6)) {
                                iC += fhp.c(i8, (fke) flw.f(obj, j), a(i6));
                            }
                            break;
                    }
                    i5 = i6 + 3;
                } else {
                    return a(this.q, obj) + iC;
                }
            }
        } else {
            Unsafe unsafe2 = b;
            int i12 = -1;
            int iC3 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i13 < this.c.length) {
                int iD3 = d(i13);
                int i15 = this.c[i13];
                int i16 = (267386880 & iD3) >>> 20;
                int i17 = 0;
                if (i16 <= 17) {
                    int i18 = this.c[i13 + 2];
                    int i19 = 1048575 & i18;
                    int i20 = 1 << (i18 >>> 20);
                    if (i19 != i12) {
                        i14 = unsafe2.getInt(obj, i19);
                        i12 = i19;
                    }
                    i = i12;
                    i2 = i14;
                    i3 = i20;
                    i17 = i18;
                } else if (!this.k || i16 < fii.DOUBLE_LIST_PACKED.h || i16 > fii.SINT64_LIST_PACKED.h) {
                    i = i12;
                    i2 = i14;
                    i3 = 0;
                } else {
                    i17 = this.c[i13 + 2] & 1048575;
                    i = i12;
                    i2 = i14;
                    i3 = 0;
                }
                long j2 = 1048575 & iD3;
                switch (i16) {
                    case bbx.MSG_UNBIND_SERVICE /* 0 */:
                        if ((i3 & i2) != 0) {
                            iC3 += fhp.b(i15, 0.0d);
                        }
                        break;
                    case 1:
                        if ((i3 & i2) != 0) {
                            iC3 += fhp.b(i15, 0.0f);
                        }
                        break;
                    case 2:
                        if ((i3 & i2) != 0) {
                            iC3 += fhp.d(i15, unsafe2.getLong(obj, j2));
                        }
                        break;
                    case 3:
                        if ((i3 & i2) != 0) {
                            iC3 += fhp.e(i15, unsafe2.getLong(obj, j2));
                        }
                        break;
                    case 4:
                        if ((i3 & i2) != 0) {
                            iC3 += fhp.f(i15, unsafe2.getInt(obj, j2));
                        }
                        break;
                    case 5:
                        if ((i3 & i2) != 0) {
                            iC3 += fhp.g(i15, 0L);
                        }
                        break;
                    case 6:
                        if ((i3 & i2) != 0) {
                            iC3 += fhp.i(i15, 0);
                        }
                        break;
                    case 7:
                        if ((i3 & i2) != 0) {
                            iC3 += fhp.b(i15, true);
                        }
                        break;
                    case 8:
                        if ((i3 & i2) != 0) {
                            Object object = unsafe2.getObject(obj, j2);
                            if (object instanceof fgy) {
                                iC3 += fhp.c(i15, (fgy) object);
                            } else {
                                iC3 += fhp.b(i15, (String) object);
                            }
                        }
                        break;
                    case 9:
                        if ((i3 & i2) != 0) {
                            iC3 += fla.a(i15, unsafe2.getObject(obj, j2), a(i13));
                        }
                        break;
                    case 10:
                        if ((i3 & i2) != 0) {
                            iC3 += fhp.c(i15, (fgy) unsafe2.getObject(obj, j2));
                        }
                        break;
                    case 11:
                        if ((i3 & i2) != 0) {
                            iC3 += fhp.g(i15, unsafe2.getInt(obj, j2));
                        }
                        break;
                    case 12:
                        if ((i3 & i2) != 0) {
                            iC3 += fhp.k(i15, unsafe2.getInt(obj, j2));
                        }
                        break;
                    case 13:
                        if ((i3 & i2) != 0) {
                            iC3 += fhp.j(i15, 0);
                        }
                        break;
                    case 14:
                        if ((i3 & i2) != 0) {
                            iC3 += fhp.h(i15, 0L);
                        }
                        break;
                    case 15:
                        if ((i3 & i2) != 0) {
                            iC3 += fhp.h(i15, unsafe2.getInt(obj, j2));
                        }
                        break;
                    case 16:
                        if ((i3 & i2) != 0) {
                            iC3 += fhp.f(i15, unsafe2.getLong(obj, j2));
                        }
                        break;
                    case 17:
                        if ((i3 & i2) != 0) {
                            iC3 += fhp.c(i15, (fke) unsafe2.getObject(obj, j2), a(i13));
                        }
                        break;
                    case 18:
                        iC3 += fla.i(i15, (List) unsafe2.getObject(obj, j2), false);
                        break;
                    case 19:
                        iC3 += fla.h(i15, (List) unsafe2.getObject(obj, j2), false);
                        break;
                    case 20:
                        iC3 += fla.a(i15, (List) unsafe2.getObject(obj, j2), false);
                        break;
                    case 21:
                        iC3 += fla.b(i15, (List) unsafe2.getObject(obj, j2), false);
                        break;
                    case 22:
                        iC3 += fla.e(i15, (List) unsafe2.getObject(obj, j2), false);
                        break;
                    case 23:
                        iC3 += fla.i(i15, (List) unsafe2.getObject(obj, j2), false);
                        break;
                    case 24:
                        iC3 += fla.h(i15, (List) unsafe2.getObject(obj, j2), false);
                        break;
                    case 25:
                        iC3 += fla.j(i15, (List) unsafe2.getObject(obj, j2), false);
                        break;
                    case 26:
                        iC3 += fla.a(i15, (List) unsafe2.getObject(obj, j2));
                        break;
                    case 27:
                        iC3 += fla.a(i15, (List) unsafe2.getObject(obj, j2), a(i13));
                        break;
                    case 28:
                        iC3 += fla.b(i15, (List) unsafe2.getObject(obj, j2));
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_verifyParentAccessCode /* 29 */:
                        iC3 += fla.f(i15, (List) unsafe2.getObject(obj, j2), false);
                        break;
                    case 30:
                        iC3 += fla.d(i15, (List) unsafe2.getObject(obj, j2), false);
                        break;
                    case 31:
                        iC3 += fla.h(i15, (List) unsafe2.getObject(obj, j2), false);
                        break;
                    case 32:
                        iC3 += fla.i(i15, (List) unsafe2.getObject(obj, j2), false);
                        break;
                    case 33:
                        iC3 += fla.g(i15, (List) unsafe2.getObject(obj, j2), false);
                        break;
                    case 34:
                        iC3 += fla.c(i15, (List) unsafe2.getObject(obj, j2), false);
                        break;
                    case 35:
                        int i21 = fla.i((List) unsafe2.getObject(obj, j2));
                        if (i21 > 0) {
                            if (this.k) {
                                unsafe2.putInt(obj, i17, i21);
                            }
                            iC3 += i21 + fhp.f(i15) + fhp.h(i21);
                        }
                        break;
                    case 36:
                        int iH4 = fla.h((List) unsafe2.getObject(obj, j2));
                        if (iH4 > 0) {
                            if (this.k) {
                                unsafe2.putInt(obj, i17, iH4);
                            }
                            iC3 += iH4 + fhp.f(i15) + fhp.h(iH4);
                        }
                        break;
                    case 37:
                        int iA2 = fla.a((List) unsafe2.getObject(obj, j2));
                        if (iA2 > 0) {
                            if (this.k) {
                                unsafe2.putInt(obj, i17, iA2);
                            }
                            iC3 += iA2 + fhp.f(i15) + fhp.h(iA2);
                        }
                        break;
                    case 38:
                        int iB2 = fla.b((List) unsafe2.getObject(obj, j2));
                        if (iB2 > 0) {
                            if (this.k) {
                                unsafe2.putInt(obj, i17, iB2);
                            }
                            iC3 += iB2 + fhp.f(i15) + fhp.h(iB2);
                        }
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_startService /* 39 */:
                        int iE2 = fla.e((List) unsafe2.getObject(obj, j2));
                        if (iE2 > 0) {
                            if (this.k) {
                                unsafe2.putInt(obj, i17, iE2);
                            }
                            iC3 += iE2 + fhp.f(i15) + fhp.h(iE2);
                        }
                        break;
                    case 40:
                        int i22 = fla.i((List) unsafe2.getObject(obj, j2));
                        if (i22 > 0) {
                            if (this.k) {
                                unsafe2.putInt(obj, i17, i22);
                            }
                            iC3 += i22 + fhp.f(i15) + fhp.h(i22);
                        }
                        break;
                    case 41:
                        int iH5 = fla.h((List) unsafe2.getObject(obj, j2));
                        if (iH5 > 0) {
                            if (this.k) {
                                unsafe2.putInt(obj, i17, iH5);
                            }
                            iC3 += iH5 + fhp.f(i15) + fhp.h(iH5);
                        }
                        break;
                    case 42:
                        int iJ2 = fla.j((List) unsafe2.getObject(obj, j2));
                        if (iJ2 > 0) {
                            if (this.k) {
                                unsafe2.putInt(obj, i17, iJ2);
                            }
                            iC3 += iJ2 + fhp.f(i15) + fhp.h(iJ2);
                        }
                        break;
                    case 43:
                        int iF2 = fla.f((List) unsafe2.getObject(obj, j2));
                        if (iF2 > 0) {
                            if (this.k) {
                                unsafe2.putInt(obj, i17, iF2);
                            }
                            iC3 += iF2 + fhp.f(i15) + fhp.h(iF2);
                        }
                        break;
                    case 44:
                        int iD4 = fla.d((List) unsafe2.getObject(obj, j2));
                        if (iD4 > 0) {
                            if (this.k) {
                                unsafe2.putInt(obj, i17, iD4);
                            }
                            iC3 += iD4 + fhp.f(i15) + fhp.h(iD4);
                        }
                        break;
                    case 45:
                        int iH6 = fla.h((List) unsafe2.getObject(obj, j2));
                        if (iH6 > 0) {
                            if (this.k) {
                                unsafe2.putInt(obj, i17, iH6);
                            }
                            iC3 += iH6 + fhp.f(i15) + fhp.h(iH6);
                        }
                        break;
                    case 46:
                        int i23 = fla.i((List) unsafe2.getObject(obj, j2));
                        if (i23 > 0) {
                            if (this.k) {
                                unsafe2.putInt(obj, i17, i23);
                            }
                            iC3 += i23 + fhp.f(i15) + fhp.h(i23);
                        }
                        break;
                    case 47:
                        int iG2 = fla.g((List) unsafe2.getObject(obj, j2));
                        if (iG2 > 0) {
                            if (this.k) {
                                unsafe2.putInt(obj, i17, iG2);
                            }
                            iC3 += iG2 + fhp.f(i15) + fhp.h(iG2);
                        }
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_getMemberSvExitState /* 48 */:
                        int iC4 = fla.c((List) unsafe2.getObject(obj, j2));
                        if (iC4 > 0) {
                            if (this.k) {
                                unsafe2.putInt(obj, i17, iC4);
                            }
                            iC3 += iC4 + fhp.f(i15) + fhp.h(iC4);
                        }
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_setMemberSvExitState /* 49 */:
                        iC3 += fla.b(i15, (List) unsafe2.getObject(obj, j2), a(i13));
                        break;
                    case 50:
                        iC3 += this.s.a(i15, unsafe2.getObject(obj, j2), b(i13));
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_clearLockdownInfo /* 51 */:
                        if (a(obj, i15, i13)) {
                            iC3 += fhp.b(i15, 0.0d);
                        }
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_listManagedDevices /* 52 */:
                        if (a(obj, i15, i13)) {
                            iC3 += fhp.b(i15, 0.0f);
                        }
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_logToClearcutFromUi /* 53 */:
                        if (a(obj, i15, i13)) {
                            iC3 += fhp.d(i15, e(obj, j2));
                        }
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_getSuwLibraryFlows /* 54 */:
                        if (a(obj, i15, i13)) {
                            iC3 += fhp.e(i15, e(obj, j2));
                        }
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_getLockdownInfo /* 55 */:
                        if (a(obj, i15, i13)) {
                            iC3 += fhp.f(i15, d(obj, j2));
                        }
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_setLockdownInfoForPermalock /* 56 */:
                        if (a(obj, i15, i13)) {
                            iC3 += fhp.g(i15, 0L);
                        }
                        break;
                    case 57:
                        if (a(obj, i15, i13)) {
                            iC3 += fhp.i(i15, 0);
                        }
                        break;
                    case 58:
                        if (a(obj, i15, i13)) {
                            iC3 += fhp.b(i15, true);
                        }
                        break;
                    case 59:
                        if (a(obj, i15, i13)) {
                            Object object2 = unsafe2.getObject(obj, j2);
                            if (object2 instanceof fgy) {
                                iC3 += fhp.c(i15, (fgy) object2);
                            } else {
                                iC3 += fhp.b(i15, (String) object2);
                            }
                        }
                        break;
                    case 60:
                        if (a(obj, i15, i13)) {
                            iC3 += fla.a(i15, unsafe2.getObject(obj, j2), a(i13));
                        }
                        break;
                    case 61:
                        if (a(obj, i15, i13)) {
                            iC3 += fhp.c(i15, (fgy) unsafe2.getObject(obj, j2));
                        }
                        break;
                    case 62:
                        if (a(obj, i15, i13)) {
                            iC3 += fhp.g(i15, d(obj, j2));
                        }
                        break;
                    case 63:
                        if (a(obj, i15, i13)) {
                            iC3 += fhp.k(i15, d(obj, j2));
                        }
                        break;
                    case 64:
                        if (a(obj, i15, i13)) {
                            iC3 += fhp.j(i15, 0);
                        }
                        break;
                    case 65:
                        if (a(obj, i15, i13)) {
                            iC3 += fhp.h(i15, 0L);
                        }
                        break;
                    case 66:
                        if (a(obj, i15, i13)) {
                            iC3 += fhp.h(i15, d(obj, j2));
                        }
                        break;
                    case 67:
                        if (a(obj, i15, i13)) {
                            iC3 += fhp.f(i15, e(obj, j2));
                        }
                        break;
                    case 68:
                        if (a(obj, i15, i13)) {
                            iC3 += fhp.c(i15, (fke) unsafe2.getObject(obj, j2), a(i13));
                        }
                        break;
                }
                i13 += 3;
                i14 = i2;
                i12 = i;
            }
            int iA3 = iC3 + a(this.q, obj);
            if (!this.h) {
                return iA3;
            }
            fig figVarA = this.r.a(obj);
            int i24 = 0;
            int iB3 = 0;
            while (true) {
                int i25 = i24;
                if (i25 < figVarA.a.b()) {
                    Map.Entry entryB = figVarA.a.b(i25);
                    iB3 += fig.b((fih) entryB.getKey(), entryB.getValue());
                    i24 = i25 + 1;
                } else {
                    for (Map.Entry entry : figVarA.a.c()) {
                        iB3 += fig.b((fih) entry.getKey(), entry.getValue());
                    }
                    return iA3 + iB3;
                }
            }
        }
    }

    private static int a(flq flqVar, Object obj) {
        return flqVar.f(flqVar.b(obj));
    }

    private static List a(Object obj, long j) {
        return (List) flw.f(obj, j);
    }

    @Override // flm.fky
    public final void a(Object obj, fmp fmpVar) {
        if (fmpVar.a() == dp.aC) {
            a(this.q, obj, fmpVar);
            Iterator it = null;
            Map.Entry entry = null;
            if (this.h) {
                fig figVarA = this.r.a(obj);
                if (!figVarA.a.isEmpty()) {
                    if (figVarA.c) {
                        it = new fjl(figVarA.a.d().iterator());
                    } else {
                        it = figVarA.a.d().iterator();
                    }
                    entry = (Map.Entry) it.next();
                }
            }
            int length = this.c.length - 3;
            while (length >= 0) {
                int iD = d(length);
                int i = this.c[length];
                Map.Entry entry2 = entry;
                while (entry2 != null && this.r.a(entry2) > i) {
                    this.r.a(fmpVar, entry2);
                    entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                switch ((267386880 & iD) >>> 20) {
                    case bbx.MSG_UNBIND_SERVICE /* 0 */:
                        if (a(obj, length)) {
                            fmpVar.a(i, flw.e(obj, 1048575 & iD));
                        }
                        break;
                    case 1:
                        if (a(obj, length)) {
                            fmpVar.a(i, flw.d(obj, 1048575 & iD));
                        }
                        break;
                    case 2:
                        if (a(obj, length)) {
                            fmpVar.a(i, flw.b(obj, 1048575 & iD));
                        }
                        break;
                    case 3:
                        if (a(obj, length)) {
                            fmpVar.c(i, flw.b(obj, 1048575 & iD));
                        }
                        break;
                    case 4:
                        if (a(obj, length)) {
                            fmpVar.c(i, flw.a(obj, 1048575 & iD));
                        }
                        break;
                    case 5:
                        if (a(obj, length)) {
                            fmpVar.d(i, flw.b(obj, 1048575 & iD));
                        }
                        break;
                    case 6:
                        if (a(obj, length)) {
                            fmpVar.d(i, flw.a(obj, 1048575 & iD));
                        }
                        break;
                    case 7:
                        if (a(obj, length)) {
                            fmpVar.a(i, flw.c(obj, 1048575 & iD));
                        }
                        break;
                    case 8:
                        if (a(obj, length)) {
                            a(i, flw.f(obj, 1048575 & iD), fmpVar);
                        }
                        break;
                    case 9:
                        if (a(obj, length)) {
                            fmpVar.a(i, flw.f(obj, 1048575 & iD), a(length));
                        }
                        break;
                    case 10:
                        if (a(obj, length)) {
                            fmpVar.a(i, (fgy) flw.f(obj, 1048575 & iD));
                        }
                        break;
                    case 11:
                        if (a(obj, length)) {
                            fmpVar.e(i, flw.a(obj, 1048575 & iD));
                        }
                        break;
                    case 12:
                        if (a(obj, length)) {
                            fmpVar.b(i, flw.a(obj, 1048575 & iD));
                        }
                        break;
                    case 13:
                        if (a(obj, length)) {
                            fmpVar.a(i, flw.a(obj, 1048575 & iD));
                        }
                        break;
                    case 14:
                        if (a(obj, length)) {
                            fmpVar.b(i, flw.b(obj, 1048575 & iD));
                        }
                        break;
                    case 15:
                        if (a(obj, length)) {
                            fmpVar.f(i, flw.a(obj, 1048575 & iD));
                        }
                        break;
                    case 16:
                        if (a(obj, length)) {
                            fmpVar.e(i, flw.b(obj, 1048575 & iD));
                        }
                        break;
                    case 17:
                        if (a(obj, length)) {
                            fmpVar.b(i, flw.f(obj, 1048575 & iD), a(length));
                        }
                        break;
                    case 18:
                        fla.a(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, false);
                        break;
                    case 19:
                        fla.b(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, false);
                        break;
                    case 20:
                        fla.c(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, false);
                        break;
                    case 21:
                        fla.d(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, false);
                        break;
                    case 22:
                        fla.h(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, false);
                        break;
                    case 23:
                        fla.f(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, false);
                        break;
                    case 24:
                        fla.k(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, false);
                        break;
                    case 25:
                        fla.n(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, false);
                        break;
                    case 26:
                        fla.a(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar);
                        break;
                    case 27:
                        fla.a(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, a(length));
                        break;
                    case 28:
                        fla.b(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar);
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_verifyParentAccessCode /* 29 */:
                        fla.i(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, false);
                        break;
                    case 30:
                        fla.m(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, false);
                        break;
                    case 31:
                        fla.l(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, false);
                        break;
                    case 32:
                        fla.g(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, false);
                        break;
                    case 33:
                        fla.j(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, false);
                        break;
                    case 34:
                        fla.e(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, false);
                        break;
                    case 35:
                        fla.a(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, true);
                        break;
                    case 36:
                        fla.b(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, true);
                        break;
                    case 37:
                        fla.c(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, true);
                        break;
                    case 38:
                        fla.d(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, true);
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_startService /* 39 */:
                        fla.h(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, true);
                        break;
                    case 40:
                        fla.f(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, true);
                        break;
                    case 41:
                        fla.k(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, true);
                        break;
                    case 42:
                        fla.n(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, true);
                        break;
                    case 43:
                        fla.i(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, true);
                        break;
                    case 44:
                        fla.m(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, true);
                        break;
                    case 45:
                        fla.l(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, true);
                        break;
                    case 46:
                        fla.g(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, true);
                        break;
                    case 47:
                        fla.j(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, true);
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_getMemberSvExitState /* 48 */:
                        fla.e(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, true);
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_setMemberSvExitState /* 49 */:
                        fla.b(this.c[length], (List) flw.f(obj, 1048575 & iD), fmpVar, a(length));
                        break;
                    case 50:
                        a(fmpVar, i, flw.f(obj, 1048575 & iD), length);
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_clearLockdownInfo /* 51 */:
                        if (a(obj, i, length)) {
                            fmpVar.a(i, b(obj, 1048575 & iD));
                        }
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_listManagedDevices /* 52 */:
                        if (a(obj, i, length)) {
                            fmpVar.a(i, c(obj, 1048575 & iD));
                        }
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_logToClearcutFromUi /* 53 */:
                        if (a(obj, i, length)) {
                            fmpVar.a(i, e(obj, 1048575 & iD));
                        }
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_getSuwLibraryFlows /* 54 */:
                        if (a(obj, i, length)) {
                            fmpVar.c(i, e(obj, 1048575 & iD));
                        }
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_getLockdownInfo /* 55 */:
                        if (a(obj, i, length)) {
                            fmpVar.c(i, d(obj, 1048575 & iD));
                        }
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_setLockdownInfoForPermalock /* 56 */:
                        if (a(obj, i, length)) {
                            fmpVar.d(i, e(obj, 1048575 & iD));
                        }
                        break;
                    case 57:
                        if (a(obj, i, length)) {
                            fmpVar.d(i, d(obj, 1048575 & iD));
                        }
                        break;
                    case 58:
                        if (a(obj, i, length)) {
                            fmpVar.a(i, f(obj, 1048575 & iD));
                        }
                        break;
                    case 59:
                        if (a(obj, i, length)) {
                            a(i, flw.f(obj, 1048575 & iD), fmpVar);
                        }
                        break;
                    case 60:
                        if (a(obj, i, length)) {
                            fmpVar.a(i, flw.f(obj, 1048575 & iD), a(length));
                        }
                        break;
                    case 61:
                        if (a(obj, i, length)) {
                            fmpVar.a(i, (fgy) flw.f(obj, 1048575 & iD));
                        }
                        break;
                    case 62:
                        if (a(obj, i, length)) {
                            fmpVar.e(i, d(obj, 1048575 & iD));
                        }
                        break;
                    case 63:
                        if (a(obj, i, length)) {
                            fmpVar.b(i, d(obj, 1048575 & iD));
                        }
                        break;
                    case 64:
                        if (a(obj, i, length)) {
                            fmpVar.a(i, d(obj, 1048575 & iD));
                        }
                        break;
                    case 65:
                        if (a(obj, i, length)) {
                            fmpVar.b(i, e(obj, 1048575 & iD));
                        }
                        break;
                    case 66:
                        if (a(obj, i, length)) {
                            fmpVar.f(i, d(obj, 1048575 & iD));
                        }
                        break;
                    case 67:
                        if (a(obj, i, length)) {
                            fmpVar.e(i, e(obj, 1048575 & iD));
                        }
                        break;
                    case 68:
                        if (a(obj, i, length)) {
                            fmpVar.b(i, flw.f(obj, 1048575 & iD), a(length));
                        }
                        break;
                }
                length -= 3;
                entry = entry2;
            }
            while (entry != null) {
                this.r.a(fmpVar, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            return;
        }
        if (this.j) {
            Iterator itB = null;
            Map.Entry entry3 = null;
            if (this.h) {
                fig figVarA2 = this.r.a(obj);
                if (!figVarA2.a.isEmpty()) {
                    itB = figVarA2.b();
                    entry3 = (Map.Entry) itB.next();
                }
            }
            int length2 = this.c.length;
            int i2 = 0;
            while (i2 < length2) {
                int iD2 = d(i2);
                int i3 = this.c[i2];
                Map.Entry entry4 = entry3;
                while (entry4 != null && this.r.a(entry4) <= i3) {
                    this.r.a(fmpVar, entry4);
                    entry4 = itB.hasNext() ? (Map.Entry) itB.next() : null;
                }
                switch ((267386880 & iD2) >>> 20) {
                    case bbx.MSG_UNBIND_SERVICE /* 0 */:
                        if (a(obj, i2)) {
                            fmpVar.a(i3, flw.e(obj, 1048575 & iD2));
                        }
                        break;
                    case 1:
                        if (a(obj, i2)) {
                            fmpVar.a(i3, flw.d(obj, 1048575 & iD2));
                        }
                        break;
                    case 2:
                        if (a(obj, i2)) {
                            fmpVar.a(i3, flw.b(obj, 1048575 & iD2));
                        }
                        break;
                    case 3:
                        if (a(obj, i2)) {
                            fmpVar.c(i3, flw.b(obj, 1048575 & iD2));
                        }
                        break;
                    case 4:
                        if (a(obj, i2)) {
                            fmpVar.c(i3, flw.a(obj, 1048575 & iD2));
                        }
                        break;
                    case 5:
                        if (a(obj, i2)) {
                            fmpVar.d(i3, flw.b(obj, 1048575 & iD2));
                        }
                        break;
                    case 6:
                        if (a(obj, i2)) {
                            fmpVar.d(i3, flw.a(obj, 1048575 & iD2));
                        }
                        break;
                    case 7:
                        if (a(obj, i2)) {
                            fmpVar.a(i3, flw.c(obj, 1048575 & iD2));
                        }
                        break;
                    case 8:
                        if (a(obj, i2)) {
                            a(i3, flw.f(obj, 1048575 & iD2), fmpVar);
                        }
                        break;
                    case 9:
                        if (a(obj, i2)) {
                            fmpVar.a(i3, flw.f(obj, 1048575 & iD2), a(i2));
                        }
                        break;
                    case 10:
                        if (a(obj, i2)) {
                            fmpVar.a(i3, (fgy) flw.f(obj, 1048575 & iD2));
                        }
                        break;
                    case 11:
                        if (a(obj, i2)) {
                            fmpVar.e(i3, flw.a(obj, 1048575 & iD2));
                        }
                        break;
                    case 12:
                        if (a(obj, i2)) {
                            fmpVar.b(i3, flw.a(obj, 1048575 & iD2));
                        }
                        break;
                    case 13:
                        if (a(obj, i2)) {
                            fmpVar.a(i3, flw.a(obj, 1048575 & iD2));
                        }
                        break;
                    case 14:
                        if (a(obj, i2)) {
                            fmpVar.b(i3, flw.b(obj, 1048575 & iD2));
                        }
                        break;
                    case 15:
                        if (a(obj, i2)) {
                            fmpVar.f(i3, flw.a(obj, 1048575 & iD2));
                        }
                        break;
                    case 16:
                        if (a(obj, i2)) {
                            fmpVar.e(i3, flw.b(obj, 1048575 & iD2));
                        }
                        break;
                    case 17:
                        if (a(obj, i2)) {
                            fmpVar.b(i3, flw.f(obj, 1048575 & iD2), a(i2));
                        }
                        break;
                    case 18:
                        fla.a(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, false);
                        break;
                    case 19:
                        fla.b(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, false);
                        break;
                    case 20:
                        fla.c(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, false);
                        break;
                    case 21:
                        fla.d(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, false);
                        break;
                    case 22:
                        fla.h(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, false);
                        break;
                    case 23:
                        fla.f(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, false);
                        break;
                    case 24:
                        fla.k(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, false);
                        break;
                    case 25:
                        fla.n(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, false);
                        break;
                    case 26:
                        fla.a(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar);
                        break;
                    case 27:
                        fla.a(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, a(i2));
                        break;
                    case 28:
                        fla.b(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar);
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_verifyParentAccessCode /* 29 */:
                        fla.i(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, false);
                        break;
                    case 30:
                        fla.m(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, false);
                        break;
                    case 31:
                        fla.l(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, false);
                        break;
                    case 32:
                        fla.g(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, false);
                        break;
                    case 33:
                        fla.j(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, false);
                        break;
                    case 34:
                        fla.e(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, false);
                        break;
                    case 35:
                        fla.a(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, true);
                        break;
                    case 36:
                        fla.b(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, true);
                        break;
                    case 37:
                        fla.c(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, true);
                        break;
                    case 38:
                        fla.d(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, true);
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_startService /* 39 */:
                        fla.h(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, true);
                        break;
                    case 40:
                        fla.f(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, true);
                        break;
                    case 41:
                        fla.k(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, true);
                        break;
                    case 42:
                        fla.n(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, true);
                        break;
                    case 43:
                        fla.i(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, true);
                        break;
                    case 44:
                        fla.m(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, true);
                        break;
                    case 45:
                        fla.l(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, true);
                        break;
                    case 46:
                        fla.g(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, true);
                        break;
                    case 47:
                        fla.j(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, true);
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_getMemberSvExitState /* 48 */:
                        fla.e(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, true);
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_setMemberSvExitState /* 49 */:
                        fla.b(this.c[i2], (List) flw.f(obj, 1048575 & iD2), fmpVar, a(i2));
                        break;
                    case 50:
                        a(fmpVar, i3, flw.f(obj, 1048575 & iD2), i2);
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_clearLockdownInfo /* 51 */:
                        if (a(obj, i3, i2)) {
                            fmpVar.a(i3, b(obj, 1048575 & iD2));
                        }
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_listManagedDevices /* 52 */:
                        if (a(obj, i3, i2)) {
                            fmpVar.a(i3, c(obj, 1048575 & iD2));
                        }
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_logToClearcutFromUi /* 53 */:
                        if (a(obj, i3, i2)) {
                            fmpVar.a(i3, e(obj, 1048575 & iD2));
                        }
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_getSuwLibraryFlows /* 54 */:
                        if (a(obj, i3, i2)) {
                            fmpVar.c(i3, e(obj, 1048575 & iD2));
                        }
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_getLockdownInfo /* 55 */:
                        if (a(obj, i3, i2)) {
                            fmpVar.c(i3, d(obj, 1048575 & iD2));
                        }
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_setLockdownInfoForPermalock /* 56 */:
                        if (a(obj, i3, i2)) {
                            fmpVar.d(i3, e(obj, 1048575 & iD2));
                        }
                        break;
                    case 57:
                        if (a(obj, i3, i2)) {
                            fmpVar.d(i3, d(obj, 1048575 & iD2));
                        }
                        break;
                    case 58:
                        if (a(obj, i3, i2)) {
                            fmpVar.a(i3, f(obj, 1048575 & iD2));
                        }
                        break;
                    case 59:
                        if (a(obj, i3, i2)) {
                            a(i3, flw.f(obj, 1048575 & iD2), fmpVar);
                        }
                        break;
                    case 60:
                        if (a(obj, i3, i2)) {
                            fmpVar.a(i3, flw.f(obj, 1048575 & iD2), a(i2));
                        }
                        break;
                    case 61:
                        if (a(obj, i3, i2)) {
                            fmpVar.a(i3, (fgy) flw.f(obj, 1048575 & iD2));
                        }
                        break;
                    case 62:
                        if (a(obj, i3, i2)) {
                            fmpVar.e(i3, d(obj, 1048575 & iD2));
                        }
                        break;
                    case 63:
                        if (a(obj, i3, i2)) {
                            fmpVar.b(i3, d(obj, 1048575 & iD2));
                        }
                        break;
                    case 64:
                        if (a(obj, i3, i2)) {
                            fmpVar.a(i3, d(obj, 1048575 & iD2));
                        }
                        break;
                    case 65:
                        if (a(obj, i3, i2)) {
                            fmpVar.b(i3, e(obj, 1048575 & iD2));
                        }
                        break;
                    case 66:
                        if (a(obj, i3, i2)) {
                            fmpVar.f(i3, d(obj, 1048575 & iD2));
                        }
                        break;
                    case 67:
                        if (a(obj, i3, i2)) {
                            fmpVar.e(i3, e(obj, 1048575 & iD2));
                        }
                        break;
                    case 68:
                        if (a(obj, i3, i2)) {
                            fmpVar.b(i3, flw.f(obj, 1048575 & iD2), a(i2));
                        }
                        break;
                }
                i2 += 3;
                entry3 = entry4;
            }
            while (entry3 != null) {
                this.r.a(fmpVar, entry3);
                entry3 = itB.hasNext() ? (Map.Entry) itB.next() : null;
            }
            a(this.q, obj, fmpVar);
            return;
        }
        b(obj, fmpVar);
    }

    private final void b(Object obj, fmp fmpVar) {
        int i;
        int i2;
        Iterator itB = null;
        Map.Entry entry = null;
        if (this.h) {
            fig figVarA = this.r.a(obj);
            if (!figVarA.a.isEmpty()) {
                itB = figVarA.b();
                entry = (Map.Entry) itB.next();
            }
        }
        int length = this.c.length;
        Unsafe unsafe = b;
        int i3 = 0;
        int i4 = -1;
        Map.Entry entry2 = entry;
        int i5 = 0;
        while (i3 < length) {
            int iD = d(i3);
            int i6 = this.c[i3];
            int i7 = (267386880 & iD) >>> 20;
            int i8 = 0;
            if (this.j || i7 > 17) {
                i = i4;
                i2 = i5;
            } else {
                int i9 = this.c[i3 + 2];
                int i10 = 1048575 & i9;
                if (i10 != i4) {
                    i5 = unsafe.getInt(obj, i10);
                } else {
                    i10 = i4;
                }
                i = i10;
                i8 = 1 << (i9 >>> 20);
                i2 = i5;
            }
            while (entry2 != null && this.r.a(entry2) <= i6) {
                this.r.a(fmpVar, entry2);
                entry2 = itB.hasNext() ? (Map.Entry) itB.next() : null;
            }
            long j = 1048575 & iD;
            switch (i7) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    if ((i2 & i8) != 0) {
                        fmpVar.a(i6, flw.e(obj, j));
                    }
                    break;
                case 1:
                    if ((i2 & i8) != 0) {
                        fmpVar.a(i6, flw.d(obj, j));
                    }
                    break;
                case 2:
                    if ((i2 & i8) != 0) {
                        fmpVar.a(i6, unsafe.getLong(obj, j));
                    }
                    break;
                case 3:
                    if ((i2 & i8) != 0) {
                        fmpVar.c(i6, unsafe.getLong(obj, j));
                    }
                    break;
                case 4:
                    if ((i2 & i8) != 0) {
                        fmpVar.c(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case 5:
                    if ((i2 & i8) != 0) {
                        fmpVar.d(i6, unsafe.getLong(obj, j));
                    }
                    break;
                case 6:
                    if ((i2 & i8) != 0) {
                        fmpVar.d(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case 7:
                    if ((i2 & i8) != 0) {
                        fmpVar.a(i6, flw.c(obj, j));
                    }
                    break;
                case 8:
                    if ((i2 & i8) != 0) {
                        a(i6, unsafe.getObject(obj, j), fmpVar);
                    }
                    break;
                case 9:
                    if ((i2 & i8) != 0) {
                        fmpVar.a(i6, unsafe.getObject(obj, j), a(i3));
                    }
                    break;
                case 10:
                    if ((i2 & i8) != 0) {
                        fmpVar.a(i6, (fgy) unsafe.getObject(obj, j));
                    }
                    break;
                case 11:
                    if ((i2 & i8) != 0) {
                        fmpVar.e(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case 12:
                    if ((i2 & i8) != 0) {
                        fmpVar.b(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case 13:
                    if ((i2 & i8) != 0) {
                        fmpVar.a(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case 14:
                    if ((i2 & i8) != 0) {
                        fmpVar.b(i6, unsafe.getLong(obj, j));
                    }
                    break;
                case 15:
                    if ((i2 & i8) != 0) {
                        fmpVar.f(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case 16:
                    if ((i2 & i8) != 0) {
                        fmpVar.e(i6, unsafe.getLong(obj, j));
                    }
                    break;
                case 17:
                    if ((i2 & i8) != 0) {
                        fmpVar.b(i6, unsafe.getObject(obj, j), a(i3));
                    }
                    break;
                case 18:
                    fla.a(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, false);
                    break;
                case 19:
                    fla.b(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, false);
                    break;
                case 20:
                    fla.c(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, false);
                    break;
                case 21:
                    fla.d(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, false);
                    break;
                case 22:
                    fla.h(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, false);
                    break;
                case 23:
                    fla.f(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, false);
                    break;
                case 24:
                    fla.k(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, false);
                    break;
                case 25:
                    fla.n(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, false);
                    break;
                case 26:
                    fla.a(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar);
                    break;
                case 27:
                    fla.a(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, a(i3));
                    break;
                case 28:
                    fla.b(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar);
                    break;
                case IKidsInternalService.Stub.TRANSACTION_verifyParentAccessCode /* 29 */:
                    fla.i(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, false);
                    break;
                case 30:
                    fla.m(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, false);
                    break;
                case 31:
                    fla.l(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, false);
                    break;
                case 32:
                    fla.g(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, false);
                    break;
                case 33:
                    fla.j(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, false);
                    break;
                case 34:
                    fla.e(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, false);
                    break;
                case 35:
                    fla.a(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, true);
                    break;
                case 36:
                    fla.b(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, true);
                    break;
                case 37:
                    fla.c(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, true);
                    break;
                case 38:
                    fla.d(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, true);
                    break;
                case IKidsInternalService.Stub.TRANSACTION_startService /* 39 */:
                    fla.h(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, true);
                    break;
                case 40:
                    fla.f(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, true);
                    break;
                case 41:
                    fla.k(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, true);
                    break;
                case 42:
                    fla.n(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, true);
                    break;
                case 43:
                    fla.i(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, true);
                    break;
                case 44:
                    fla.m(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, true);
                    break;
                case 45:
                    fla.l(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, true);
                    break;
                case 46:
                    fla.g(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, true);
                    break;
                case 47:
                    fla.j(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, true);
                    break;
                case IKidsInternalService.Stub.TRANSACTION_getMemberSvExitState /* 48 */:
                    fla.e(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, true);
                    break;
                case IKidsInternalService.Stub.TRANSACTION_setMemberSvExitState /* 49 */:
                    fla.b(this.c[i3], (List) unsafe.getObject(obj, j), fmpVar, a(i3));
                    break;
                case 50:
                    a(fmpVar, i6, unsafe.getObject(obj, j), i3);
                    break;
                case IKidsInternalService.Stub.TRANSACTION_clearLockdownInfo /* 51 */:
                    if (a(obj, i6, i3)) {
                        fmpVar.a(i6, b(obj, j));
                    }
                    break;
                case IKidsInternalService.Stub.TRANSACTION_listManagedDevices /* 52 */:
                    if (a(obj, i6, i3)) {
                        fmpVar.a(i6, c(obj, j));
                    }
                    break;
                case IKidsInternalService.Stub.TRANSACTION_logToClearcutFromUi /* 53 */:
                    if (a(obj, i6, i3)) {
                        fmpVar.a(i6, e(obj, j));
                    }
                    break;
                case IKidsInternalService.Stub.TRANSACTION_getSuwLibraryFlows /* 54 */:
                    if (a(obj, i6, i3)) {
                        fmpVar.c(i6, e(obj, j));
                    }
                    break;
                case IKidsInternalService.Stub.TRANSACTION_getLockdownInfo /* 55 */:
                    if (a(obj, i6, i3)) {
                        fmpVar.c(i6, d(obj, j));
                    }
                    break;
                case IKidsInternalService.Stub.TRANSACTION_setLockdownInfoForPermalock /* 56 */:
                    if (a(obj, i6, i3)) {
                        fmpVar.d(i6, e(obj, j));
                    }
                    break;
                case 57:
                    if (a(obj, i6, i3)) {
                        fmpVar.d(i6, d(obj, j));
                    }
                    break;
                case 58:
                    if (a(obj, i6, i3)) {
                        fmpVar.a(i6, f(obj, j));
                    }
                    break;
                case 59:
                    if (a(obj, i6, i3)) {
                        a(i6, unsafe.getObject(obj, j), fmpVar);
                    }
                    break;
                case 60:
                    if (a(obj, i6, i3)) {
                        fmpVar.a(i6, unsafe.getObject(obj, j), a(i3));
                    }
                    break;
                case 61:
                    if (a(obj, i6, i3)) {
                        fmpVar.a(i6, (fgy) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (a(obj, i6, i3)) {
                        fmpVar.e(i6, d(obj, j));
                    }
                    break;
                case 63:
                    if (a(obj, i6, i3)) {
                        fmpVar.b(i6, d(obj, j));
                    }
                    break;
                case 64:
                    if (a(obj, i6, i3)) {
                        fmpVar.a(i6, d(obj, j));
                    }
                    break;
                case 65:
                    if (a(obj, i6, i3)) {
                        fmpVar.b(i6, e(obj, j));
                    }
                    break;
                case 66:
                    if (a(obj, i6, i3)) {
                        fmpVar.f(i6, d(obj, j));
                    }
                    break;
                case 67:
                    if (a(obj, i6, i3)) {
                        fmpVar.e(i6, e(obj, j));
                    }
                    break;
                case 68:
                    if (a(obj, i6, i3)) {
                        fmpVar.b(i6, unsafe.getObject(obj, j), a(i3));
                    }
                    break;
            }
            i3 += 3;
            i5 = i2;
            i4 = i;
            entry2 = entry2;
        }
        Map.Entry entry3 = entry2;
        while (entry3 != null) {
            this.r.a(fmpVar, entry3);
            entry3 = itB.hasNext() ? (Map.Entry) itB.next() : null;
        }
        a(this.q, obj, fmpVar);
    }

    private final void a(fmp fmpVar, int i, Object obj, int i2) {
        if (obj != null) {
            fmpVar.a(i, this.s.e(b(i2)), this.s.b(obj));
        }
    }

    private static void a(flq flqVar, Object obj, fmp fmpVar) {
        flqVar.a(flqVar.b(obj), fmpVar);
    }

    /* JADX WARN: Code duplicated, block: B:170:0x067d  */
    /* JADX WARN: Code duplicated, block: B:179:0x0693  */
    /* JADX WARN: Code duplicated, block: B:266:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b5 A[Catch: all -> 0x00e1, TRY_LEAVE, TryCatch #1 {all -> 0x00e1, blocks: (B:6:0x000e, B:17:0x0034, B:22:0x003d, B:23:0x0041, B:25:0x004f, B:27:0x0054, B:24:0x0048, B:36:0x0075, B:40:0x0083, B:51:0x00b0, B:53:0x00b5, B:48:0x00a3, B:61:0x00d5, B:70:0x00fa, B:71:0x0106, B:72:0x0117, B:73:0x0128, B:74:0x0139, B:75:0x014a, B:76:0x015b, B:77:0x0163, B:79:0x0169, B:80:0x0188, B:81:0x019d, B:82:0x01ae, B:83:0x01bf, B:85:0x01c9, B:88:0x01dc, B:87:0x01cf, B:89:0x01e2, B:90:0x01f3, B:91:0x0204, B:92:0x0215, B:93:0x0226, B:95:0x022c, B:96:0x024b, B:97:0x0260, B:98:0x0270, B:99:0x0280, B:100:0x0290, B:101:0x02a0, B:102:0x02b0, B:103:0x02c0, B:104:0x02d0, B:105:0x02e0, B:107:0x02e6, B:108:0x02f6, B:109:0x0306, B:110:0x031a, B:111:0x032a, B:112:0x033a, B:113:0x0352, B:114:0x0362, B:115:0x0372, B:116:0x0382, B:117:0x0392, B:118:0x03a2, B:119:0x03b2, B:120:0x03c2, B:121:0x03d2, B:122:0x03e2, B:123:0x03f2, B:124:0x0402, B:125:0x0412, B:126:0x0422, B:127:0x043a, B:128:0x044a, B:129:0x045a, B:130:0x046a, B:131:0x047a, B:132:0x048e, B:134:0x04a1, B:135:0x04aa, B:136:0x04bb, B:138:0x04c3, B:139:0x04d2, B:140:0x04e7, B:141:0x04fc, B:142:0x0511, B:143:0x0526, B:144:0x053b, B:145:0x0550, B:146:0x0565, B:147:0x057a, B:148:0x0582, B:150:0x0588, B:151:0x05a5, B:152:0x05aa, B:153:0x05be, B:154:0x05cf, B:155:0x05e4, B:157:0x05ee, B:160:0x0605, B:159:0x05f4, B:161:0x060b, B:162:0x0620, B:163:0x0635, B:164:0x064a, B:165:0x065f), top: B:185:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c5 A[LOOP:2: B:57:0x00c1->B:59:0x00c5, LOOP_END] */
    @Override // flm.fky
    public final void a(Object obj, fkt fktVar, fib fibVar) throws Throwable {
        Throwable th;
        Object objA;
        Object objA2;
        int i;
        Object objA3;
        if (fibVar == null) {
            throw new NullPointerException();
        }
        flq flqVar = this.q;
        fid fidVar = this.r;
        Object objA4 = null;
        fig figVarB = null;
        while (true) {
            try {
                int iA = fktVar.a();
                int iG = g(iA);
                if (iG < 0) {
                    if (iA == Integer.MAX_VALUE) {
                        for (int i2 = this.m; i2 < this.n; i2++) {
                            objA4 = a(obj, this.l[i2], objA4, flqVar);
                        }
                        if (objA4 != null) {
                            flqVar.b(obj, objA4);
                            return;
                        }
                        return;
                    }
                    if (!this.h) {
                        objA2 = null;
                    } else {
                        objA2 = fidVar.a(fibVar, this.g, iA);
                    }
                    if (objA2 != null) {
                        if (figVarB == null) {
                            figVarB = fidVar.b(obj);
                        }
                        objA4 = fidVar.a(fktVar, objA2, fibVar, figVarB, objA4, flqVar);
                    } else {
                        flqVar.a();
                        objA = objA4 == null ? flqVar.c(obj) : objA4;
                        try {
                            if (!flqVar.a(objA, fktVar)) {
                                for (int i3 = this.m; i3 < this.n; i3++) {
                                    objA = a(obj, this.l[i3], objA, flqVar);
                                }
                                if (objA != null) {
                                    flqVar.b(obj, objA);
                                    return;
                                }
                                return;
                            }
                            objA4 = objA;
                        } catch (Throwable th2) {
                            th = th2;
                            for (int i4 = this.m; i4 < this.n; i4++) {
                                objA = a(obj, this.l[i4], objA, flqVar);
                            }
                            if (objA == null) {
                                throw th;
                            }
                            flqVar.b(obj, objA);
                            throw th;
                        }
                    }
                } else {
                    int iD = d(iG);
                    switch ((267386880 & iD) >>> 20) {
                        case bbx.MSG_UNBIND_SERVICE /* 0 */:
                            flw.a(obj, 1048575 & iD, fktVar.d());
                            b(obj, iG);
                            continue;
                        case 1:
                            flw.a(obj, 1048575 & iD, fktVar.e());
                            b(obj, iG);
                            continue;
                        case 2:
                            flw.a(obj, 1048575 & iD, fktVar.g());
                            b(obj, iG);
                            continue;
                        case 3:
                            flw.a(obj, 1048575 & iD, fktVar.f());
                            b(obj, iG);
                            continue;
                        case 4:
                            flw.a(obj, 1048575 & iD, fktVar.h());
                            b(obj, iG);
                            continue;
                        case 5:
                            flw.a(obj, 1048575 & iD, fktVar.i());
                            b(obj, iG);
                            continue;
                        case 6:
                            flw.a(obj, 1048575 & iD, fktVar.j());
                            b(obj, iG);
                            continue;
                        case 7:
                            flw.a(obj, 1048575 & iD, fktVar.k());
                            b(obj, iG);
                            continue;
                        case 8:
                            a(obj, iD, fktVar);
                            b(obj, iG);
                            continue;
                        case 9:
                            if (a(obj, iG)) {
                                flw.a(obj, 1048575 & iD, fiv.a(flw.f(obj, 1048575 & iD), fktVar.a(a(iG), fibVar)));
                            } else {
                                flw.a(obj, 1048575 & iD, fktVar.a(a(iG), fibVar));
                                b(obj, iG);
                                continue;
                            }
                            break;
                        case 10:
                            flw.a(obj, 1048575 & iD, fktVar.n());
                            b(obj, iG);
                            continue;
                        case 11:
                            flw.a(obj, 1048575 & iD, fktVar.o());
                            b(obj, iG);
                            continue;
                        case 12:
                            int iP = fktVar.p();
                            fiz fizVarC = c(iG);
                            if (fizVarC == null || fizVarC.a(iP)) {
                                flw.a(obj, 1048575 & iD, iP);
                                b(obj, iG);
                                continue;
                            } else {
                                objA4 = fla.a(iA, iP, objA4, flqVar);
                            }
                            break;
                        case 13:
                            flw.a(obj, 1048575 & iD, fktVar.q());
                            b(obj, iG);
                            continue;
                        case 14:
                            flw.a(obj, 1048575 & iD, fktVar.r());
                            b(obj, iG);
                            continue;
                        case 15:
                            flw.a(obj, 1048575 & iD, fktVar.s());
                            b(obj, iG);
                            continue;
                        case 16:
                            flw.a(obj, 1048575 & iD, fktVar.t());
                            b(obj, iG);
                            continue;
                        case 17:
                            if (a(obj, iG)) {
                                flw.a(obj, 1048575 & iD, fiv.a(flw.f(obj, 1048575 & iD), fktVar.b(a(iG), fibVar)));
                            } else {
                                flw.a(obj, 1048575 & iD, fktVar.b(a(iG), fibVar));
                                b(obj, iG);
                                continue;
                            }
                            break;
                        case 18:
                            fktVar.a(this.p.a(obj, 1048575 & iD));
                            continue;
                        case 19:
                            fktVar.b(this.p.a(obj, 1048575 & iD));
                            continue;
                        case 20:
                            fktVar.d(this.p.a(obj, 1048575 & iD));
                            continue;
                        case 21:
                            fktVar.c(this.p.a(obj, 1048575 & iD));
                            continue;
                        case 22:
                            fktVar.e(this.p.a(obj, 1048575 & iD));
                            continue;
                        case 23:
                            fktVar.f(this.p.a(obj, 1048575 & iD));
                            continue;
                        case 24:
                            fktVar.g(this.p.a(obj, 1048575 & iD));
                            continue;
                        case 25:
                            fktVar.h(this.p.a(obj, 1048575 & iD));
                            continue;
                        case 26:
                            if (f(iD)) {
                                fktVar.j(this.p.a(obj, 1048575 & iD));
                            } else {
                                fktVar.i(this.p.a(obj, 1048575 & iD));
                                continue;
                            }
                            break;
                        case 27:
                            fktVar.a(this.p.a(obj, 1048575 & iD), a(iG), fibVar);
                            continue;
                        case 28:
                            fktVar.k(this.p.a(obj, 1048575 & iD));
                            continue;
                        case IKidsInternalService.Stub.TRANSACTION_verifyParentAccessCode /* 29 */:
                            fktVar.l(this.p.a(obj, 1048575 & iD));
                            continue;
                        case 30:
                            List listA = this.p.a(obj, iD & 1048575);
                            fktVar.m(listA);
                            objA4 = fla.a(iA, listA, c(iG), objA4, flqVar);
                            continue;
                        case 31:
                            fktVar.n(this.p.a(obj, 1048575 & iD));
                            continue;
                        case 32:
                            fktVar.o(this.p.a(obj, 1048575 & iD));
                            continue;
                        case 33:
                            fktVar.p(this.p.a(obj, 1048575 & iD));
                            continue;
                        case 34:
                            fktVar.q(this.p.a(obj, 1048575 & iD));
                            continue;
                        case 35:
                            fktVar.a(this.p.a(obj, 1048575 & iD));
                            continue;
                        case 36:
                            fktVar.b(this.p.a(obj, 1048575 & iD));
                            continue;
                        case 37:
                            fktVar.d(this.p.a(obj, 1048575 & iD));
                            continue;
                        case 38:
                            fktVar.c(this.p.a(obj, 1048575 & iD));
                            continue;
                        case IKidsInternalService.Stub.TRANSACTION_startService /* 39 */:
                            fktVar.e(this.p.a(obj, 1048575 & iD));
                            continue;
                        case 40:
                            fktVar.f(this.p.a(obj, 1048575 & iD));
                            continue;
                        case 41:
                            fktVar.g(this.p.a(obj, 1048575 & iD));
                            continue;
                        case 42:
                            fktVar.h(this.p.a(obj, 1048575 & iD));
                            continue;
                        case 43:
                            fktVar.l(this.p.a(obj, 1048575 & iD));
                            continue;
                        case 44:
                            List listA2 = this.p.a(obj, iD & 1048575);
                            fktVar.m(listA2);
                            objA4 = fla.a(iA, listA2, c(iG), objA4, flqVar);
                            continue;
                        case 45:
                            fktVar.n(this.p.a(obj, 1048575 & iD));
                            continue;
                        case 46:
                            fktVar.o(this.p.a(obj, 1048575 & iD));
                            continue;
                        case 47:
                            fktVar.p(this.p.a(obj, 1048575 & iD));
                            continue;
                        case IKidsInternalService.Stub.TRANSACTION_getMemberSvExitState /* 48 */:
                            fktVar.q(this.p.a(obj, 1048575 & iD));
                            continue;
                        case IKidsInternalService.Stub.TRANSACTION_setMemberSvExitState /* 49 */:
                            fktVar.b(this.p.a(obj, 1048575 & iD), a(iG), fibVar);
                            continue;
                        case 50:
                            Object objB = b(iG);
                            long jD = d(iG) & 1048575;
                            Object objF = flw.f(obj, jD);
                            if (objF == null) {
                                objA3 = this.s.a();
                                flw.a(obj, jD, objA3);
                            } else if (this.s.c(objF)) {
                                objA3 = this.s.a();
                                this.s.a(objA3, objF);
                                flw.a(obj, jD, objA3);
                            } else {
                                objA3 = objF;
                            }
                            fktVar.a(this.s.a(objA3), this.s.e(objB), fibVar);
                            continue;
                        case IKidsInternalService.Stub.TRANSACTION_clearLockdownInfo /* 51 */:
                            flw.a(obj, iD & 1048575, Double.valueOf(fktVar.d()));
                            b(obj, iA, iG);
                            continue;
                        case IKidsInternalService.Stub.TRANSACTION_listManagedDevices /* 52 */:
                            flw.a(obj, iD & 1048575, Float.valueOf(fktVar.e()));
                            b(obj, iA, iG);
                            continue;
                        case IKidsInternalService.Stub.TRANSACTION_logToClearcutFromUi /* 53 */:
                            flw.a(obj, iD & 1048575, Long.valueOf(fktVar.g()));
                            b(obj, iA, iG);
                            continue;
                        case IKidsInternalService.Stub.TRANSACTION_getSuwLibraryFlows /* 54 */:
                            flw.a(obj, iD & 1048575, Long.valueOf(fktVar.f()));
                            b(obj, iA, iG);
                            continue;
                        case IKidsInternalService.Stub.TRANSACTION_getLockdownInfo /* 55 */:
                            flw.a(obj, iD & 1048575, Integer.valueOf(fktVar.h()));
                            b(obj, iA, iG);
                            continue;
                        case IKidsInternalService.Stub.TRANSACTION_setLockdownInfoForPermalock /* 56 */:
                            flw.a(obj, iD & 1048575, Long.valueOf(fktVar.i()));
                            b(obj, iA, iG);
                            continue;
                        case 57:
                            flw.a(obj, iD & 1048575, Integer.valueOf(fktVar.j()));
                            b(obj, iA, iG);
                            continue;
                        case 58:
                            flw.a(obj, iD & 1048575, Boolean.valueOf(fktVar.k()));
                            b(obj, iA, iG);
                            continue;
                        case 59:
                            a(obj, iD, fktVar);
                            b(obj, iA, iG);
                            continue;
                        case 60:
                            if (a(obj, iA, iG)) {
                                flw.a(obj, iD & 1048575, fiv.a(flw.f(obj, 1048575 & iD), fktVar.a(a(iG), fibVar)));
                            } else {
                                flw.a(obj, iD & 1048575, fktVar.a(a(iG), fibVar));
                                b(obj, iG);
                            }
                            b(obj, iA, iG);
                            continue;
                        case 61:
                            flw.a(obj, iD & 1048575, fktVar.n());
                            b(obj, iA, iG);
                            continue;
                        case 62:
                            flw.a(obj, iD & 1048575, Integer.valueOf(fktVar.o()));
                            b(obj, iA, iG);
                            continue;
                        case 63:
                            int iP2 = fktVar.p();
                            fiz fizVarC2 = c(iG);
                            if (fizVarC2 == null || fizVarC2.a(iP2)) {
                                flw.a(obj, iD & 1048575, Integer.valueOf(iP2));
                                b(obj, iA, iG);
                                continue;
                            } else {
                                objA4 = fla.a(iA, iP2, objA4, flqVar);
                            }
                            break;
                        case 64:
                            flw.a(obj, iD & 1048575, Integer.valueOf(fktVar.q()));
                            b(obj, iA, iG);
                            continue;
                        case 65:
                            flw.a(obj, iD & 1048575, Long.valueOf(fktVar.r()));
                            b(obj, iA, iG);
                            continue;
                        case 66:
                            flw.a(obj, iD & 1048575, Integer.valueOf(fktVar.s()));
                            b(obj, iA, iG);
                            continue;
                        case 67:
                            flw.a(obj, iD & 1048575, Long.valueOf(fktVar.t()));
                            b(obj, iA, iG);
                            continue;
                        case 68:
                            flw.a(obj, iD & 1048575, fktVar.b(a(iG), fibVar));
                            b(obj, iA, iG);
                            continue;
                        default:
                            if (objA4 == null) {
                                try {
                                    objA = flqVar.b();
                                } catch (fjh e) {
                                    flqVar.a();
                                    if (objA4 == null) {
                                        objA = flqVar.c(obj);
                                    } else {
                                        objA = objA4;
                                    }
                                    if (!flqVar.a(objA, fktVar)) {
                                        for (i = this.m; i < this.n; i++) {
                                            objA = a(obj, this.l[i], objA, flqVar);
                                        }
                                        if (objA != null) {
                                            flqVar.b(obj, objA);
                                            return;
                                        }
                                        return;
                                    }
                                    objA4 = objA;
                                }
                            } else {
                                objA = objA4;
                            }
                            try {
                                if (!flqVar.a(objA, fktVar)) {
                                    for (int i5 = this.m; i5 < this.n; i5++) {
                                        objA = a(obj, this.l[i5], objA, flqVar);
                                    }
                                    if (objA != null) {
                                        flqVar.b(obj, objA);
                                        return;
                                    }
                                    return;
                                }
                            } catch (fjh e2) {
                                objA4 = objA;
                                flqVar.a();
                                if (objA4 == null) {
                                    objA = flqVar.c(obj);
                                } else {
                                    objA = objA4;
                                }
                                if (!flqVar.a(objA, fktVar)) {
                                    while (i < this.n) {
                                        objA = a(obj, this.l[i], objA, flqVar);
                                    }
                                    if (objA != null) {
                                        flqVar.b(obj, objA);
                                        return;
                                    }
                                    return;
                                }
                            }
                    }
                    objA4 = objA;
                }
            } catch (Throwable th3) {
                th = th3;
                objA = objA4;
            }
        }
    }

    private static flr e(Object obj) {
        flr flrVar = ((fin) obj).E;
        if (flrVar == flr.a) {
            flr flrVar2 = new flr();
            ((fin) obj).E = flrVar2;
            return flrVar2;
        }
        return flrVar;
    }

    private static int a(fky fkyVar, byte[] bArr, int i, int i2, fgu fguVar) throws fjg {
        int i3;
        int iA = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            iA = fgt.a(i4, bArr, iA, fguVar);
            i3 = fguVar.a;
        } else {
            i3 = i4;
        }
        if (i3 < 0 || i3 > i2 - iA) {
            throw fjg.a();
        }
        Object objA = fkyVar.a();
        fkyVar.a(objA, bArr, iA, iA + i3, fguVar);
        fkyVar.c(objA);
        fguVar.c = objA;
        return iA + i3;
    }

    private static int a(fky fkyVar, byte[] bArr, int i, int i2, int i3, fgu fguVar) throws fjg {
        fki fkiVar = (fki) fkyVar;
        Object objA = fkiVar.a();
        int iA = fkiVar.a(objA, bArr, i, i2, i3, fguVar);
        fkiVar.c(objA);
        fguVar.c = objA;
        return iA;
    }

    private static int a(fky fkyVar, int i, byte[] bArr, int i2, int i3, fjf fjfVar, fgu fguVar) throws fjg {
        int iA = a(fkyVar, bArr, i2, i3, fguVar);
        fjfVar.add(fguVar.c);
        while (iA < i3) {
            int iA2 = fgt.a(bArr, iA, fguVar);
            if (i != fguVar.a) {
                break;
            }
            iA = a(fkyVar, bArr, iA2, i3, fguVar);
            fjfVar.add(fguVar.c);
        }
        return iA;
    }

    private static int a(byte[] bArr, int i, int i2, fmj fmjVar, Class cls, fgu fguVar) {
        switch (fmjVar.ordinal()) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                fguVar.c = Double.valueOf(fgt.c(bArr, i));
                return i + 8;
            case 1:
                fguVar.c = Float.valueOf(fgt.d(bArr, i));
                return i + 4;
            case 2:
            case 3:
                int iB = fgt.b(bArr, i, fguVar);
                fguVar.c = Long.valueOf(fguVar.b);
                return iB;
            case 4:
            case 12:
            case 13:
                int iA = fgt.a(bArr, i, fguVar);
                fguVar.c = Integer.valueOf(fguVar.a);
                return iA;
            case 5:
            case 15:
                fguVar.c = Long.valueOf(fgt.b(bArr, i));
                return i + 8;
            case 6:
            case 14:
                fguVar.c = Integer.valueOf(fgt.a(bArr, i));
                return i + 4;
            case 7:
                int iB2 = fgt.b(bArr, i, fguVar);
                fguVar.c = Boolean.valueOf(fguVar.b != 0);
                return iB2;
            case 8:
                return fgt.d(bArr, i, fguVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return a(fkq.a.a(cls), bArr, i, i2, fguVar);
            case 11:
                return fgt.e(bArr, i, fguVar);
            case 16:
                int iA2 = fgt.a(bArr, i, fguVar);
                fguVar.c = Integer.valueOf(fhk.f(fguVar.a));
                return iA2;
            case 17:
                int iB3 = fgt.b(bArr, i, fguVar);
                fguVar.c = Long.valueOf(fhk.a(fguVar.b));
                return iB3;
        }
    }

    private static int a(int i, byte[] bArr, int i2, int i3, Object obj, fgu fguVar) {
        return fgt.a(i, bArr, i2, i3, e(obj), fguVar);
    }

    private final int a(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, fgu fguVar) throws fjg {
        fjf fjfVarA;
        int iA;
        fjf fjfVar = (fjf) b.getObject(obj, j2);
        if (fjfVar.a()) {
            fjfVarA = fjfVar;
        } else {
            int size = fjfVar.size();
            fjfVarA = fjfVar.a(size == 0 ? 10 : size << 1);
            b.putObject(obj, j2, fjfVarA);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    fhy fhyVar = (fhy) fjfVarA;
                    int iA2 = fgt.a(bArr, i, fguVar);
                    int i8 = fguVar.a + iA2;
                    while (iA2 < i8) {
                        fhyVar.a(fgt.c(bArr, iA2));
                        iA2 += 8;
                    }
                    if (iA2 != i8) {
                        throw fjg.a();
                    }
                    return iA2;
                }
                if (i5 == 1) {
                    fhy fhyVar2 = (fhy) fjfVarA;
                    fhyVar2.a(fgt.c(bArr, i));
                    int i9 = i + 8;
                    while (i9 < i2) {
                        int iA3 = fgt.a(bArr, i9, fguVar);
                        if (i3 == fguVar.a) {
                            fhyVar2.a(fgt.c(bArr, iA3));
                            i9 = iA3 + 8;
                        } else {
                            return i9;
                        }
                    }
                    return i9;
                }
                return i;
            case 19:
            case 36:
                if (i5 == 2) {
                    fik fikVar = (fik) fjfVarA;
                    int iA4 = fgt.a(bArr, i, fguVar);
                    int i10 = fguVar.a + iA4;
                    while (iA4 < i10) {
                        fikVar.a(fgt.d(bArr, iA4));
                        iA4 += 4;
                    }
                    if (iA4 != i10) {
                        throw fjg.a();
                    }
                    return iA4;
                }
                if (i5 == 5) {
                    fik fikVar2 = (fik) fjfVarA;
                    fikVar2.a(fgt.d(bArr, i));
                    int i11 = i + 4;
                    while (i11 < i2) {
                        int iA5 = fgt.a(bArr, i11, fguVar);
                        if (i3 == fguVar.a) {
                            fikVar2.a(fgt.d(bArr, iA5));
                            i11 = iA5 + 4;
                        } else {
                            return i11;
                        }
                    }
                    return i11;
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    fjs fjsVar = (fjs) fjfVarA;
                    int iA6 = fgt.a(bArr, i, fguVar);
                    int i12 = fguVar.a + iA6;
                    while (iA6 < i12) {
                        iA6 = fgt.b(bArr, iA6, fguVar);
                        fjsVar.a(fguVar.b);
                    }
                    if (iA6 != i12) {
                        throw fjg.a();
                    }
                    return iA6;
                }
                if (i5 == 0) {
                    fjs fjsVar2 = (fjs) fjfVarA;
                    int iB = fgt.b(bArr, i, fguVar);
                    fjsVar2.a(fguVar.b);
                    while (iB < i2) {
                        int iA7 = fgt.a(bArr, iB, fguVar);
                        if (i3 == fguVar.a) {
                            iB = fgt.b(bArr, iA7, fguVar);
                            fjsVar2.a(fguVar.b);
                        } else {
                            return iB;
                        }
                    }
                    return iB;
                }
                return i;
            case 22:
            case IKidsInternalService.Stub.TRANSACTION_verifyParentAccessCode /* 29 */:
            case IKidsInternalService.Stub.TRANSACTION_startService /* 39 */:
            case 43:
                if (i5 == 2) {
                    return fgt.a(bArr, i, fjfVarA, fguVar);
                }
                if (i5 == 0) {
                    return fgt.a(i3, bArr, i, i2, fjfVarA, fguVar);
                }
                return i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    fjs fjsVar3 = (fjs) fjfVarA;
                    int iA8 = fgt.a(bArr, i, fguVar);
                    int i13 = fguVar.a + iA8;
                    while (iA8 < i13) {
                        fjsVar3.a(fgt.b(bArr, iA8));
                        iA8 += 8;
                    }
                    if (iA8 != i13) {
                        throw fjg.a();
                    }
                    return iA8;
                }
                if (i5 == 1) {
                    fjs fjsVar4 = (fjs) fjfVarA;
                    fjsVar4.a(fgt.b(bArr, i));
                    int i14 = i + 8;
                    while (i14 < i2) {
                        int iA9 = fgt.a(bArr, i14, fguVar);
                        if (i3 == fguVar.a) {
                            fjsVar4.a(fgt.b(bArr, iA9));
                            i14 = iA9 + 8;
                        } else {
                            return i14;
                        }
                    }
                    return i14;
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    fiu fiuVar = (fiu) fjfVarA;
                    int iA10 = fgt.a(bArr, i, fguVar);
                    int i15 = fguVar.a + iA10;
                    while (iA10 < i15) {
                        fiuVar.d(fgt.a(bArr, iA10));
                        iA10 += 4;
                    }
                    if (iA10 != i15) {
                        throw fjg.a();
                    }
                    return iA10;
                }
                if (i5 == 5) {
                    fiu fiuVar2 = (fiu) fjfVarA;
                    fiuVar2.d(fgt.a(bArr, i));
                    int i16 = i + 4;
                    while (i16 < i2) {
                        int iA11 = fgt.a(bArr, i16, fguVar);
                        if (i3 == fguVar.a) {
                            fiuVar2.d(fgt.a(bArr, iA11));
                            i16 = iA11 + 4;
                        } else {
                            return i16;
                        }
                    }
                    return i16;
                }
                return i;
            case 25:
            case 42:
                if (i5 == 2) {
                    fgw fgwVar = (fgw) fjfVarA;
                    int iA12 = fgt.a(bArr, i, fguVar);
                    int i17 = iA12 + fguVar.a;
                    while (iA12 < i17) {
                        iA12 = fgt.b(bArr, iA12, fguVar);
                        fgwVar.a(fguVar.b != 0);
                    }
                    if (iA12 != i17) {
                        throw fjg.a();
                    }
                    return iA12;
                }
                if (i5 == 0) {
                    fgw fgwVar2 = (fgw) fjfVarA;
                    int iB2 = fgt.b(bArr, i, fguVar);
                    fgwVar2.a(fguVar.b != 0);
                    while (iB2 < i2) {
                        int iA13 = fgt.a(bArr, iB2, fguVar);
                        if (i3 == fguVar.a) {
                            iB2 = fgt.b(bArr, iA13, fguVar);
                            fgwVar2.a(fguVar.b != 0);
                        } else {
                            return iB2;
                        }
                    }
                    return iB2;
                }
                return i;
            case 26:
                if (i5 != 2) {
                    return i;
                }
                if ((536870912 & j) == 0) {
                    int iA14 = fgt.a(bArr, i, fguVar);
                    int i18 = fguVar.a;
                    if (i18 < 0) {
                        throw fjg.b();
                    }
                    if (i18 == 0) {
                        fjfVarA.add("");
                    } else {
                        fjfVarA.add(new String(bArr, iA14, i18, fiv.a));
                        iA14 += i18;
                    }
                    while (iA14 < i2) {
                        int iA15 = fgt.a(bArr, iA14, fguVar);
                        if (i3 == fguVar.a) {
                            iA14 = fgt.a(bArr, iA15, fguVar);
                            int i19 = fguVar.a;
                            if (i19 < 0) {
                                throw fjg.b();
                            }
                            if (i19 == 0) {
                                fjfVarA.add("");
                            } else {
                                fjfVarA.add(new String(bArr, iA14, i19, fiv.a));
                                iA14 += i19;
                            }
                        } else {
                            return iA14;
                        }
                    }
                    return iA14;
                }
                int iA16 = fgt.a(bArr, i, fguVar);
                int i20 = fguVar.a;
                if (i20 < 0) {
                    throw fjg.b();
                }
                if (i20 == 0) {
                    fjfVarA.add("");
                } else {
                    if (!fmc.a(bArr, iA16, iA16 + i20)) {
                        throw fjg.j();
                    }
                    fjfVarA.add(new String(bArr, iA16, i20, fiv.a));
                    iA16 += i20;
                }
                while (iA16 < i2) {
                    int iA17 = fgt.a(bArr, iA16, fguVar);
                    if (i3 == fguVar.a) {
                        iA16 = fgt.a(bArr, iA17, fguVar);
                        int i21 = fguVar.a;
                        if (i21 < 0) {
                            throw fjg.b();
                        }
                        if (i21 == 0) {
                            fjfVarA.add("");
                        } else {
                            if (!fmc.a(bArr, iA16, iA16 + i21)) {
                                throw fjg.j();
                            }
                            fjfVarA.add(new String(bArr, iA16, i21, fiv.a));
                            iA16 += i21;
                        }
                    } else {
                        return iA16;
                    }
                }
                return iA16;
            case 27:
                if (i5 == 2) {
                    return a(a(i6), i3, bArr, i, i2, fjfVarA, fguVar);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    int iA18 = fgt.a(bArr, i, fguVar);
                    int i22 = fguVar.a;
                    if (i22 < 0) {
                        throw fjg.b();
                    }
                    if (i22 > bArr.length - iA18) {
                        throw fjg.a();
                    }
                    if (i22 == 0) {
                        fjfVarA.add(fgy.a);
                    } else {
                        fjfVarA.add(fgy.a(bArr, iA18, i22));
                        iA18 += i22;
                    }
                    while (iA18 < i2) {
                        int iA19 = fgt.a(bArr, iA18, fguVar);
                        if (i3 == fguVar.a) {
                            iA18 = fgt.a(bArr, iA19, fguVar);
                            int i23 = fguVar.a;
                            if (i23 < 0) {
                                throw fjg.b();
                            }
                            if (i23 > bArr.length - iA18) {
                                throw fjg.a();
                            }
                            if (i23 == 0) {
                                fjfVarA.add(fgy.a);
                            } else {
                                fjfVarA.add(fgy.a(bArr, iA18, i23));
                                iA18 += i23;
                            }
                        } else {
                            return iA18;
                        }
                    }
                    return iA18;
                }
                return i;
            case 30:
            case 44:
                if (i5 == 2) {
                    iA = fgt.a(bArr, i, fjfVarA, fguVar);
                } else if (i5 == 0) {
                    iA = fgt.a(i3, bArr, i, i2, fjfVarA, fguVar);
                } else {
                    return i;
                }
                flr flrVar = ((fin) obj).E;
                if (flrVar == flr.a) {
                    flrVar = null;
                }
                flr flrVar2 = (flr) fla.a(i4, fjfVarA, c(i6), flrVar, this.q);
                if (flrVar2 == null) {
                    return iA;
                }
                ((fin) obj).E = flrVar2;
                return iA;
            case 33:
            case 47:
                if (i5 == 2) {
                    fiu fiuVar3 = (fiu) fjfVarA;
                    int iA20 = fgt.a(bArr, i, fguVar);
                    int i24 = fguVar.a + iA20;
                    while (iA20 < i24) {
                        iA20 = fgt.a(bArr, iA20, fguVar);
                        fiuVar3.d(fhk.f(fguVar.a));
                    }
                    if (iA20 != i24) {
                        throw fjg.a();
                    }
                    return iA20;
                }
                if (i5 == 0) {
                    fiu fiuVar4 = (fiu) fjfVarA;
                    int iA21 = fgt.a(bArr, i, fguVar);
                    fiuVar4.d(fhk.f(fguVar.a));
                    while (iA21 < i2) {
                        int iA22 = fgt.a(bArr, iA21, fguVar);
                        if (i3 == fguVar.a) {
                            iA21 = fgt.a(bArr, iA22, fguVar);
                            fiuVar4.d(fhk.f(fguVar.a));
                        } else {
                            return iA21;
                        }
                    }
                    return iA21;
                }
                return i;
            case 34:
            case IKidsInternalService.Stub.TRANSACTION_getMemberSvExitState /* 48 */:
                if (i5 == 2) {
                    fjs fjsVar5 = (fjs) fjfVarA;
                    int iA23 = fgt.a(bArr, i, fguVar);
                    int i25 = fguVar.a + iA23;
                    while (iA23 < i25) {
                        iA23 = fgt.b(bArr, iA23, fguVar);
                        fjsVar5.a(fhk.a(fguVar.b));
                    }
                    if (iA23 != i25) {
                        throw fjg.a();
                    }
                    return iA23;
                }
                if (i5 == 0) {
                    fjs fjsVar6 = (fjs) fjfVarA;
                    int iB3 = fgt.b(bArr, i, fguVar);
                    fjsVar6.a(fhk.a(fguVar.b));
                    while (iB3 < i2) {
                        int iA24 = fgt.a(bArr, iB3, fguVar);
                        if (i3 == fguVar.a) {
                            iB3 = fgt.b(bArr, iA24, fguVar);
                            fjsVar6.a(fhk.a(fguVar.b));
                        } else {
                            return iB3;
                        }
                    }
                    return iB3;
                }
                return i;
            case IKidsInternalService.Stub.TRANSACTION_setMemberSvExitState /* 49 */:
                if (i5 == 3) {
                    fky fkyVarA = a(i6);
                    int i26 = (i3 & (-8)) | 4;
                    int iA25 = a(fkyVarA, bArr, i, i2, i26, fguVar);
                    fjfVarA.add(fguVar.c);
                    while (iA25 < i2) {
                        int iA26 = fgt.a(bArr, iA25, fguVar);
                        if (i3 == fguVar.a) {
                            iA25 = a(fkyVarA, bArr, iA26, i2, i26, fguVar);
                            fjfVarA.add(fguVar.c);
                        } else {
                            return iA25;
                        }
                    }
                    return iA25;
                }
                return i;
            default:
                return i;
        }
    }

    private final int a(Object obj, byte[] bArr, int i, int i2, int i3, long j, fgu fguVar) throws fjg {
        Object objA;
        Unsafe unsafe = b;
        Object objB = b(i3);
        Object object = unsafe.getObject(obj, j);
        if (this.s.c(object)) {
            objA = this.s.a();
            this.s.a(objA, object);
            unsafe.putObject(obj, j, objA);
        } else {
            objA = object;
        }
        fjx fjxVarE = this.s.e(objB);
        Map mapA = this.s.a(objA);
        int iA = fgt.a(bArr, i, fguVar);
        int i4 = fguVar.a;
        if (i4 < 0 || i4 > i2 - iA) {
            throw fjg.a();
        }
        int i5 = iA + i4;
        Object obj2 = fjxVarE.b;
        Object obj3 = fjxVarE.d;
        Object obj4 = obj2;
        int iA2 = iA;
        while (iA2 < i5) {
            int iA3 = iA2 + 1;
            int i6 = bArr[iA2];
            if (i6 < 0) {
                iA3 = fgt.a(i6, bArr, iA3, fguVar);
                i6 = fguVar.a;
            }
            int i7 = i6 & 7;
            switch (i6 >>> 3) {
                case 1:
                    if (i7 == fjxVarE.a.t) {
                        int iA4 = a(bArr, iA3, i2, fjxVarE.a, (Class) null, fguVar);
                        obj4 = fguVar.c;
                        iA2 = iA4;
                    } else {
                        iA2 = fgt.a(i6, bArr, iA3, i2, fguVar);
                    }
                    break;
                case 2:
                    if (i7 == fjxVarE.c.t) {
                        int iA5 = a(bArr, iA3, i2, fjxVarE.c, fjxVarE.d.getClass(), fguVar);
                        obj3 = fguVar.c;
                        iA2 = iA5;
                    } else {
                        iA2 = fgt.a(i6, bArr, iA3, i2, fguVar);
                    }
                    break;
                default:
                    iA2 = fgt.a(i6, bArr, iA3, i2, fguVar);
                    break;
            }
        }
        if (iA2 != i5) {
            throw fjg.i();
        }
        mapA.put(obj4, obj3);
        return i5;
    }

    private final int a(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, fgu fguVar) throws fjg {
        Object object;
        Object object2;
        Unsafe unsafe = b;
        long j2 = this.c[i8 + 2] & 1048575;
        switch (i7) {
            case IKidsInternalService.Stub.TRANSACTION_clearLockdownInfo /* 51 */:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(fgt.c(bArr, i)));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                return i;
            case IKidsInternalService.Stub.TRANSACTION_listManagedDevices /* 52 */:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(fgt.d(bArr, i)));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                return i;
            case IKidsInternalService.Stub.TRANSACTION_logToClearcutFromUi /* 53 */:
            case IKidsInternalService.Stub.TRANSACTION_getSuwLibraryFlows /* 54 */:
                if (i5 == 0) {
                    int iB = fgt.b(bArr, i, fguVar);
                    unsafe.putObject(obj, j, Long.valueOf(fguVar.b));
                    unsafe.putInt(obj, j2, i4);
                    return iB;
                }
                return i;
            case IKidsInternalService.Stub.TRANSACTION_getLockdownInfo /* 55 */:
            case 62:
                if (i5 == 0) {
                    int iA = fgt.a(bArr, i, fguVar);
                    unsafe.putObject(obj, j, Integer.valueOf(fguVar.a));
                    unsafe.putInt(obj, j2, i4);
                    return iA;
                }
                return i;
            case IKidsInternalService.Stub.TRANSACTION_setLockdownInfoForPermalock /* 56 */:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(fgt.b(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(fgt.a(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    int iB2 = fgt.b(bArr, i, fguVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(fguVar.b != 0));
                    unsafe.putInt(obj, j2, i4);
                    return iB2;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int iA2 = fgt.a(bArr, i, fguVar);
                    int i13 = fguVar.a;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((536870912 & i6) != 0 && !fmc.a(bArr, iA2, iA2 + i13)) {
                            throw fjg.j();
                        }
                        unsafe.putObject(obj, j, new String(bArr, iA2, i13, fiv.a));
                        iA2 += i13;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iA2;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    int iA3 = a(a(i8), bArr, i, i2, fguVar);
                    if (unsafe.getInt(obj, j2) == i4) {
                        object2 = unsafe.getObject(obj, j);
                    } else {
                        object2 = null;
                    }
                    if (object2 == null) {
                        unsafe.putObject(obj, j, fguVar.c);
                    } else {
                        unsafe.putObject(obj, j, fiv.a(object2, fguVar.c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iA3;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    int iE = fgt.e(bArr, i, fguVar);
                    unsafe.putObject(obj, j, fguVar.c);
                    unsafe.putInt(obj, j2, i4);
                    return iE;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int iA4 = fgt.a(bArr, i, fguVar);
                    int i14 = fguVar.a;
                    fiz fizVarC = c(i8);
                    if (fizVarC == null || fizVarC.a(i14)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i14));
                        unsafe.putInt(obj, j2, i4);
                        return iA4;
                    }
                    e(obj).a(i3, Long.valueOf(i14));
                    return iA4;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    int iA5 = fgt.a(bArr, i, fguVar);
                    unsafe.putObject(obj, j, Integer.valueOf(fhk.f(fguVar.a)));
                    unsafe.putInt(obj, j2, i4);
                    return iA5;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    int iB3 = fgt.b(bArr, i, fguVar);
                    unsafe.putObject(obj, j, Long.valueOf(fhk.a(fguVar.b)));
                    unsafe.putInt(obj, j2, i4);
                    return iB3;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    int iA6 = a(a(i8), bArr, i, i2, (i3 & (-8)) | 4, fguVar);
                    if (unsafe.getInt(obj, j2) == i4) {
                        object = unsafe.getObject(obj, j);
                    } else {
                        object = null;
                    }
                    if (object == null) {
                        unsafe.putObject(obj, j, fguVar.c);
                    } else {
                        unsafe.putObject(obj, j, fiv.a(object, fguVar.c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iA6;
                }
                return i;
            default:
                return i;
        }
    }

    private final fky a(int i) {
        int i2 = (i / 3) << 1;
        fky fkyVar = (fky) this.d[i2];
        if (fkyVar == null) {
            fky fkyVarA = fkq.a.a((Class) this.d[i2 + 1]);
            this.d[i2] = fkyVarA;
            return fkyVarA;
        }
        return fkyVar;
    }

    private final Object b(int i) {
        return this.d[(i / 3) << 1];
    }

    private final fiz c(int i) {
        return (fiz) this.d[((i / 3) << 1) + 1];
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x00b5. Please report as an issue. */
    private final int a(Object obj, byte[] bArr, int i, int i2, int i3, fgu fguVar) throws fjg {
        int i4;
        int i5;
        int i6;
        int i7;
        int iD;
        fjf fjfVarA;
        Unsafe unsafe = b;
        int i8 = -1;
        int i9 = 0;
        int i10 = 0;
        int iG = 0;
        int i11 = -1;
        int iA = i;
        while (true) {
            if (iA < i2) {
                int iA2 = iA + 1;
                i10 = bArr[iA];
                if (i10 < 0) {
                    iA2 = fgt.a(i10, bArr, iA2, fguVar);
                    i10 = fguVar.a;
                }
                i11 = (i10 == true ? 1 : 0) >>> 3;
                int i12 = (i10 == true ? 1 : 0) & 7;
                if (i11 > i11) {
                    iG = a(i11, iG / 3);
                } else {
                    iG = g(i11);
                }
                if (iG == -1) {
                    iG = 0;
                    i6 = i9;
                    i7 = i8;
                    iA = iA2;
                } else {
                    int i13 = this.c[iG + 1];
                    int i14 = (267386880 & i13) >>> 20;
                    long j = 1048575 & i13;
                    if (i14 <= 17) {
                        int i15 = this.c[iG + 2];
                        int i16 = 1 << (i15 >>> 20);
                        int i17 = i15 & 1048575;
                        if (i17 != i8) {
                            if (i8 != -1) {
                                unsafe.putInt(obj, i8, i9);
                            }
                            i9 = unsafe.getInt(obj, i17);
                            i8 = i17;
                        }
                        switch (i14) {
                            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                                if (i12 == 1) {
                                    flw.a(obj, j, fgt.c(bArr, iA2));
                                    iA = iA2 + 8;
                                    i9 |= i16;
                                } else {
                                    i6 = i9;
                                    i7 = i8;
                                    iA = iA2;
                                }
                                break;
                            case 1:
                                if (i12 == 5) {
                                    flw.a(obj, j, fgt.d(bArr, iA2));
                                    iA = iA2 + 4;
                                    i9 |= i16;
                                } else {
                                    i6 = i9;
                                    i7 = i8;
                                    iA = iA2;
                                }
                                break;
                            case 2:
                            case 3:
                                if (i12 == 0) {
                                    int iB = fgt.b(bArr, iA2, fguVar);
                                    unsafe.putLong(obj, j, fguVar.b);
                                    i9 |= i16;
                                    iA = iB;
                                } else {
                                    i6 = i9;
                                    i7 = i8;
                                    iA = iA2;
                                }
                                break;
                            case 4:
                            case 11:
                                if (i12 == 0) {
                                    int iA3 = fgt.a(bArr, iA2, fguVar);
                                    unsafe.putInt(obj, j, fguVar.a);
                                    i9 |= i16;
                                    iA = iA3;
                                } else {
                                    i6 = i9;
                                    i7 = i8;
                                    iA = iA2;
                                }
                                break;
                            case 5:
                            case 14:
                                if (i12 == 1) {
                                    unsafe.putLong(obj, j, fgt.b(bArr, iA2));
                                    iA = iA2 + 8;
                                    i9 |= i16;
                                } else {
                                    i6 = i9;
                                    i7 = i8;
                                    iA = iA2;
                                }
                                break;
                            case 6:
                            case 13:
                                if (i12 == 5) {
                                    unsafe.putInt(obj, j, fgt.a(bArr, iA2));
                                    iA = iA2 + 4;
                                    i9 |= i16;
                                } else {
                                    i6 = i9;
                                    i7 = i8;
                                    iA = iA2;
                                }
                                break;
                            case 7:
                                if (i12 == 0) {
                                    int iB2 = fgt.b(bArr, iA2, fguVar);
                                    flw.a(obj, j, fguVar.b != 0);
                                    i9 |= i16;
                                    iA = iB2;
                                } else {
                                    i6 = i9;
                                    i7 = i8;
                                    iA = iA2;
                                }
                                break;
                            case 8:
                                if (i12 == 2) {
                                    if ((536870912 & i13) == 0) {
                                        iD = fgt.c(bArr, iA2, fguVar);
                                    } else {
                                        iD = fgt.d(bArr, iA2, fguVar);
                                    }
                                    unsafe.putObject(obj, j, fguVar.c);
                                    i9 |= i16;
                                    iA = iD;
                                } else {
                                    i6 = i9;
                                    i7 = i8;
                                    iA = iA2;
                                }
                                break;
                            case 9:
                                if (i12 == 2) {
                                    int iA4 = a(a(iG), bArr, iA2, i2, fguVar);
                                    if ((i9 & i16) == 0) {
                                        unsafe.putObject(obj, j, fguVar.c);
                                    } else {
                                        unsafe.putObject(obj, j, fiv.a(unsafe.getObject(obj, j), fguVar.c));
                                    }
                                    i9 |= i16;
                                    iA = iA4;
                                } else {
                                    i6 = i9;
                                    i7 = i8;
                                    iA = iA2;
                                }
                                break;
                            case 10:
                                if (i12 == 2) {
                                    int iE = fgt.e(bArr, iA2, fguVar);
                                    unsafe.putObject(obj, j, fguVar.c);
                                    i9 |= i16;
                                    iA = iE;
                                } else {
                                    i6 = i9;
                                    i7 = i8;
                                    iA = iA2;
                                }
                                break;
                            case 12:
                                if (i12 == 0) {
                                    int iA5 = fgt.a(bArr, iA2, fguVar);
                                    int i18 = fguVar.a;
                                    fiz fizVarC = c(iG);
                                    if (fizVarC == null || fizVarC.a(i18)) {
                                        unsafe.putInt(obj, j, i18);
                                        i9 |= i16;
                                        iA = iA5;
                                    } else {
                                        e(obj).a((i10 == true ? 1 : 0) == true ? 1 : 0, Long.valueOf(i18));
                                        iA = iA5;
                                    }
                                } else {
                                    i6 = i9;
                                    i7 = i8;
                                    iA = iA2;
                                }
                                break;
                            case 15:
                                if (i12 == 0) {
                                    int iA6 = fgt.a(bArr, iA2, fguVar);
                                    unsafe.putInt(obj, j, fhk.f(fguVar.a));
                                    i9 |= i16;
                                    iA = iA6;
                                } else {
                                    i6 = i9;
                                    i7 = i8;
                                    iA = iA2;
                                }
                                break;
                            case 16:
                                if (i12 == 0) {
                                    int iB3 = fgt.b(bArr, iA2, fguVar);
                                    unsafe.putLong(obj, j, fhk.a(fguVar.b));
                                    i9 |= i16;
                                    iA = iB3;
                                } else {
                                    i6 = i9;
                                    i7 = i8;
                                    iA = iA2;
                                }
                                break;
                            case 17:
                                if (i12 == 3) {
                                    int iA7 = a(a(iG), bArr, iA2, i2, (i11 << 3) | 4, fguVar);
                                    if ((i9 & i16) == 0) {
                                        unsafe.putObject(obj, j, fguVar.c);
                                    } else {
                                        unsafe.putObject(obj, j, fiv.a(unsafe.getObject(obj, j), fguVar.c));
                                    }
                                    i9 |= i16;
                                    iA = iA7;
                                } else {
                                    i6 = i9;
                                    i7 = i8;
                                    iA = iA2;
                                }
                                break;
                            default:
                                i6 = i9;
                                i7 = i8;
                                iA = iA2;
                                break;
                        }
                    } else if (i14 == 27) {
                        if (i12 == 2) {
                            fjf fjfVar = (fjf) unsafe.getObject(obj, j);
                            if (fjfVar.a()) {
                                fjfVarA = fjfVar;
                            } else {
                                int size = fjfVar.size();
                                fjfVarA = fjfVar.a(size == 0 ? 10 : size << 1);
                                unsafe.putObject(obj, j, fjfVarA);
                            }
                            iA = a(a(iG), (i10 == true ? 1 : 0) == true ? 1 : 0, bArr, iA2, i2, fjfVarA, fguVar);
                        } else {
                            i6 = i9;
                            i7 = i8;
                            iA = iA2;
                        }
                    } else if (i14 <= 49) {
                        iA = a(obj, bArr, iA2, i2, i10 == true ? 1 : 0, i11, i12, iG, i13, i14, j, fguVar);
                        if (iA == iA2) {
                            i6 = i9;
                            i7 = i8;
                        }
                    } else if (i14 == 50) {
                        if (i12 == 2) {
                            iA = a(obj, bArr, iA2, i2, iG, j, fguVar);
                            if (iA == iA2) {
                                i6 = i9;
                                i7 = i8;
                            }
                        } else {
                            i6 = i9;
                            i7 = i8;
                            iA = iA2;
                        }
                    } else {
                        iA = a(obj, bArr, iA2, i2, (i10 == true ? 1 : 0) == true ? 1 : 0, i11, i12, i13, i14, j, iG, fguVar);
                        if (iA == iA2) {
                            i6 = i9;
                            i7 = i8;
                        }
                    }
                }
                if ((i10 == true ? 1 : 0) != i3 || i3 == 0) {
                    iA = a((i10 == true ? 1 : 0) == true ? 1 : 0, bArr, iA, i2, obj, fguVar);
                    i9 = i6;
                    i8 = i7;
                } else {
                    i4 = i6;
                    i5 = i7;
                }
            } else {
                i4 = i9;
                i5 = i8;
            }
        }
        if (i5 != -1) {
            unsafe.putInt(obj, i5, i4);
        }
        flr flrVar = null;
        for (int i19 = this.m; i19 < this.n; i19++) {
            flrVar = (flr) a(obj, this.l[i19], flrVar, this.q);
        }
        if (flrVar != null) {
            this.q.b(obj, flrVar);
        }
        if (i3 == 0) {
            if (iA != i2) {
                throw fjg.i();
            }
        } else if (iA > i2 || i10 != i3) {
            throw fjg.i();
        }
        return iA;
    }

    @Override // flm.fky
    public final void a(Object obj, byte[] bArr, int i, int i2, fgu fguVar) throws fjg {
        int iD;
        fjf fjfVarA;
        if (this.j) {
            Unsafe unsafe = b;
            int iG = 0;
            int i3 = -1;
            int iA = i;
            while (iA < i2) {
                int iA2 = iA + 1;
                int i4 = bArr[iA];
                if (i4 < 0) {
                    iA2 = fgt.a(i4, bArr, iA2, fguVar);
                    i4 = fguVar.a;
                }
                i3 = i4 >>> 3;
                int i5 = i4 & 7;
                if (i3 > i3) {
                    iG = a(i3, iG / 3);
                } else {
                    iG = g(i3);
                }
                if (iG == -1) {
                    iG = 0;
                    iA = iA2;
                } else {
                    int i6 = this.c[iG + 1];
                    int i7 = (267386880 & i6) >>> 20;
                    long j = 1048575 & i6;
                    if (i7 <= 17) {
                        switch (i7) {
                            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                                if (i5 != 1) {
                                    iA = iA2;
                                } else {
                                    flw.a(obj, j, fgt.c(bArr, iA2));
                                    iA = iA2 + 8;
                                }
                                break;
                            case 1:
                                if (i5 != 5) {
                                    iA = iA2;
                                } else {
                                    flw.a(obj, j, fgt.d(bArr, iA2));
                                    iA = iA2 + 4;
                                }
                                break;
                            case 2:
                            case 3:
                                if (i5 != 0) {
                                    iA = iA2;
                                } else {
                                    int iB = fgt.b(bArr, iA2, fguVar);
                                    unsafe.putLong(obj, j, fguVar.b);
                                    iA = iB;
                                }
                                break;
                            case 4:
                            case 11:
                                if (i5 != 0) {
                                    iA = iA2;
                                } else {
                                    int iA3 = fgt.a(bArr, iA2, fguVar);
                                    unsafe.putInt(obj, j, fguVar.a);
                                    iA = iA3;
                                }
                                break;
                            case 5:
                            case 14:
                                if (i5 != 1) {
                                    iA = iA2;
                                } else {
                                    unsafe.putLong(obj, j, fgt.b(bArr, iA2));
                                    iA = iA2 + 8;
                                }
                                break;
                            case 6:
                            case 13:
                                if (i5 != 5) {
                                    iA = iA2;
                                } else {
                                    unsafe.putInt(obj, j, fgt.a(bArr, iA2));
                                    iA = iA2 + 4;
                                }
                                break;
                            case 7:
                                if (i5 != 0) {
                                    iA = iA2;
                                } else {
                                    int iB2 = fgt.b(bArr, iA2, fguVar);
                                    flw.a(obj, j, fguVar.b != 0);
                                    iA = iB2;
                                }
                                break;
                            case 8:
                                if (i5 != 2) {
                                    iA = iA2;
                                } else {
                                    if ((536870912 & i6) == 0) {
                                        iD = fgt.c(bArr, iA2, fguVar);
                                    } else {
                                        iD = fgt.d(bArr, iA2, fguVar);
                                    }
                                    unsafe.putObject(obj, j, fguVar.c);
                                    iA = iD;
                                }
                                break;
                            case 9:
                                if (i5 != 2) {
                                    iA = iA2;
                                } else {
                                    int iA4 = a(a(iG), bArr, iA2, i2, fguVar);
                                    Object object = unsafe.getObject(obj, j);
                                    if (object == null) {
                                        unsafe.putObject(obj, j, fguVar.c);
                                        iA = iA4;
                                    } else {
                                        unsafe.putObject(obj, j, fiv.a(object, fguVar.c));
                                        iA = iA4;
                                    }
                                }
                                break;
                            case 10:
                                if (i5 != 2) {
                                    iA = iA2;
                                } else {
                                    int iE = fgt.e(bArr, iA2, fguVar);
                                    unsafe.putObject(obj, j, fguVar.c);
                                    iA = iE;
                                }
                                break;
                            case 12:
                                if (i5 != 0) {
                                    iA = iA2;
                                } else {
                                    int iA5 = fgt.a(bArr, iA2, fguVar);
                                    unsafe.putInt(obj, j, fguVar.a);
                                    iA = iA5;
                                }
                                break;
                            case 15:
                                if (i5 != 0) {
                                    iA = iA2;
                                } else {
                                    int iA6 = fgt.a(bArr, iA2, fguVar);
                                    unsafe.putInt(obj, j, fhk.f(fguVar.a));
                                    iA = iA6;
                                }
                                break;
                            case 16:
                                if (i5 != 0) {
                                    iA = iA2;
                                } else {
                                    int iB3 = fgt.b(bArr, iA2, fguVar);
                                    unsafe.putLong(obj, j, fhk.a(fguVar.b));
                                    iA = iB3;
                                }
                                break;
                            default:
                                iA = iA2;
                                break;
                        }
                    } else if (i7 == 27) {
                        if (i5 == 2) {
                            fjf fjfVar = (fjf) unsafe.getObject(obj, j);
                            if (fjfVar.a()) {
                                fjfVarA = fjfVar;
                            } else {
                                int size = fjfVar.size();
                                fjfVarA = fjfVar.a(size == 0 ? 10 : size << 1);
                                unsafe.putObject(obj, j, fjfVarA);
                            }
                            iA = a(a(iG), i4 == true ? 1 : 0, bArr, iA2, i2, fjfVarA, fguVar);
                        } else {
                            iA = iA2;
                        }
                    } else if (i7 <= 49) {
                        iA = a(obj, bArr, iA2, i2, i4, i3, i5, iG, i6, i7, j, fguVar);
                        if (iA != iA2) {
                        }
                    } else if (i7 == 50) {
                        if (i5 == 2) {
                            iA = a(obj, bArr, iA2, i2, iG, j, fguVar);
                            if (iA == iA2) {
                            }
                        } else {
                            iA = iA2;
                        }
                    } else {
                        iA = a(obj, bArr, iA2, i2, i4 == true ? 1 : 0, i3, i5, i6, i7, j, iG, fguVar);
                        if (iA == iA2) {
                        }
                    }
                }
                iA = a(i4 == true ? 1 : 0, bArr, iA, i2, obj, fguVar);
            }
            if (iA != i2) {
                throw fjg.i();
            }
            return;
        }
        a(obj, bArr, i, i2, 0, fguVar);
    }

    @Override // flm.fky
    public final void c(Object obj) {
        for (int i = this.m; i < this.n; i++) {
            long jD = d(this.l[i]) & 1048575;
            Object objF = flw.f(obj, jD);
            if (objF != null) {
                flw.a(obj, jD, this.s.d(objF));
            }
        }
        int length = this.l.length;
        for (int i2 = this.n; i2 < length; i2++) {
            this.p.b(obj, this.l[i2]);
        }
        this.q.d(obj);
        if (this.h) {
            this.r.c(obj);
        }
    }

    private final Object a(Object obj, int i, Object obj2, flq flqVar) {
        fiz fizVarC;
        int i2 = this.c[i];
        Object objF = flw.f(obj, d(i) & 1048575);
        if (objF != null && (fizVarC = c(i)) != null) {
            return a(i, i2, this.s.a(objF), fizVarC, obj2, flqVar);
        }
        return obj2;
    }

    private final Object a(int i, int i2, Map map, fiz fizVar, Object obj, flq flqVar) {
        fjx fjxVarE = this.s.e(b(i));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!fizVar.a(((Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = flqVar.b();
                }
                fhg fhgVarC = fgy.c(fjw.a(fjxVarE, entry.getKey(), entry.getValue()));
                try {
                    fjw.a(fhgVarC.a, fjxVarE, entry.getKey(), entry.getValue());
                    flqVar.a(obj, i2, fhgVarC.a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj;
    }

    @Override // flm.fky
    public final boolean d(Object obj) {
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int i4 = 0;
        int i5 = -1;
        int i6 = 0;
        while (i4 < this.m) {
            int i7 = this.l[i4];
            int i8 = this.c[i7];
            int iD = d(i7);
            if (this.j) {
                i = 0;
                i2 = i5;
                i3 = i6;
            } else {
                int i9 = this.c[i7 + 2];
                int i10 = i9 & 1048575;
                int i11 = 1 << (i9 >>> 20);
                if (i10 != i5) {
                    i3 = b.getInt(obj, i10);
                    i2 = i10;
                    i = i11;
                } else {
                    i = i11;
                    i2 = i5;
                    i3 = i6;
                }
            }
            if (((268435456 & iD) != 0) && !a(obj, i7, i3, i)) {
                return false;
            }
            switch ((267386880 & iD) >>> 20) {
                case 9:
                case 17:
                    if (a(obj, i7, i3, i) && !a(obj, iD, a(i7))) {
                        return false;
                    }
                    break;
                    break;
                case 27:
                case IKidsInternalService.Stub.TRANSACTION_setMemberSvExitState /* 49 */:
                    List list = (List) flw.f(obj, iD & 1048575);
                    if (list.isEmpty()) {
                        z2 = true;
                    } else {
                        fky fkyVarA = a(i7);
                        int i12 = 0;
                        while (true) {
                            if (i12 >= list.size()) {
                                z2 = true;
                            } else if (fkyVarA.d(list.get(i12))) {
                                i12++;
                            } else {
                                z2 = false;
                            }
                        }
                    }
                    if (!z2) {
                        return false;
                    }
                    break;
                    break;
                case 50:
                    Map mapB = this.s.b(flw.f(obj, iD & 1048575));
                    if (mapB.isEmpty()) {
                        z = true;
                    } else {
                        if (this.s.e(b(i7)).c.s != fmo.MESSAGE) {
                            z = true;
                        } else {
                            fky fkyVarA2 = null;
                            Iterator it = mapB.values().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (fkyVarA2 == null) {
                                        fkyVarA2 = fkq.a.a((Class) next.getClass());
                                    }
                                    if (!fkyVarA2.d(next)) {
                                        z = false;
                                    }
                                } else {
                                    z = true;
                                }
                            }
                        }
                    }
                    if (!z) {
                        return false;
                    }
                    break;
                    break;
                case 60:
                case 68:
                    if (a(obj, i8, i7) && !a(obj, iD, a(i7))) {
                        return false;
                    }
                    break;
                    break;
            }
            i4++;
            i6 = i3;
            i5 = i2;
        }
        return !this.h || this.r.a(obj).c();
    }

    private static boolean a(Object obj, int i, fky fkyVar) {
        return fkyVar.d(flw.f(obj, 1048575 & i));
    }

    private static void a(int i, Object obj, fmp fmpVar) {
        if (obj instanceof String) {
            fmpVar.a(i, (String) obj);
        } else {
            fmpVar.a(i, (fgy) obj);
        }
    }

    private final void a(Object obj, int i, fkt fktVar) {
        if (f(i)) {
            flw.a(obj, i & 1048575, fktVar.m());
        } else if (this.i) {
            flw.a(obj, i & 1048575, fktVar.l());
        } else {
            flw.a(obj, i & 1048575, fktVar.n());
        }
    }

    private final int d(int i) {
        return this.c[i + 1];
    }

    private final int e(int i) {
        return this.c[i + 2];
    }

    private static boolean f(int i) {
        return (536870912 & i) != 0;
    }

    private static double b(Object obj, long j) {
        return ((Double) flw.f(obj, j)).doubleValue();
    }

    private static float c(Object obj, long j) {
        return ((Float) flw.f(obj, j)).floatValue();
    }

    private static int d(Object obj, long j) {
        return ((Integer) flw.f(obj, j)).intValue();
    }

    private static long e(Object obj, long j) {
        return ((Long) flw.f(obj, j)).longValue();
    }

    private static boolean f(Object obj, long j) {
        return ((Boolean) flw.f(obj, j)).booleanValue();
    }

    private final boolean c(Object obj, Object obj2, int i) {
        return a(obj, i) == a(obj2, i);
    }

    private final boolean a(Object obj, int i, int i2, int i3) {
        if (this.j) {
            return a(obj, i);
        }
        return (i2 & i3) != 0;
    }

    private final boolean a(Object obj, int i) {
        if (this.j) {
            int iD = d(i);
            long j = iD & 1048575;
            switch ((iD & 267386880) >>> 20) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    return flw.e(obj, j) != 0.0d;
                case 1:
                    return flw.d(obj, j) != 0.0f;
                case 2:
                    return flw.b(obj, j) != 0;
                case 3:
                    return flw.b(obj, j) != 0;
                case 4:
                    return flw.a(obj, j) != 0;
                case 5:
                    return flw.b(obj, j) != 0;
                case 6:
                    return flw.a(obj, j) != 0;
                case 7:
                    return flw.c(obj, j);
                case 8:
                    Object objF = flw.f(obj, j);
                    if (objF instanceof String) {
                        return !((String) objF).isEmpty();
                    }
                    if (objF instanceof fgy) {
                        return !fgy.a.equals(objF);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return flw.f(obj, j) != null;
                case 10:
                    return !fgy.a.equals(flw.f(obj, j));
                case 11:
                    return flw.a(obj, j) != 0;
                case 12:
                    return flw.a(obj, j) != 0;
                case 13:
                    return flw.a(obj, j) != 0;
                case 14:
                    return flw.b(obj, j) != 0;
                case 15:
                    return flw.a(obj, j) != 0;
                case 16:
                    return flw.b(obj, j) != 0;
                case 17:
                    return flw.f(obj, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        }
        int iE = e(i);
        return (flw.a(obj, (long) (iE & 1048575)) & (1 << (iE >>> 20))) != 0;
    }

    private final void b(Object obj, int i) {
        if (!this.j) {
            int iE = e(i);
            long j = iE & 1048575;
            flw.a(obj, j, flw.a(obj, j) | (1 << (iE >>> 20)));
        }
    }

    private final boolean a(Object obj, int i, int i2) {
        return flw.a(obj, (long) (e(i2) & 1048575)) == i;
    }

    private final void b(Object obj, int i, int i2) {
        flw.a(obj, e(i2) & 1048575, i);
    }

    private final int g(int i) {
        if (i < this.e || i > this.f) {
            return -1;
        }
        return b(i, 0);
    }

    private final int a(int i, int i2) {
        if (i < this.e || i > this.f) {
            return -1;
        }
        return b(i, i2);
    }

    private final int b(int i, int i2) {
        int length = (this.c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.c[i4];
            if (i != i5) {
                if (i < i5) {
                    length = i3 - 1;
                } else {
                    i2 = i3 + 1;
                }
            } else {
                return i4;
            }
        }
        return -1;
    }
}
