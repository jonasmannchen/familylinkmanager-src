package flm;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bdy {
    public static final int OBJECT_HEADER = 20293;

    private bdy() {
    }

    private static void writeHeader(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt((-65536) | i);
            parcel.writeInt(i2);
        } else {
            parcel.writeInt((i2 << 16) | i);
        }
    }

    private static int beginVariableData(Parcel parcel, int i) {
        parcel.writeInt((-65536) | i);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void finishVariableData(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static int beginObjectHeader(Parcel parcel) {
        return beginVariableData(parcel, OBJECT_HEADER);
    }

    public static void finishObjectHeader(Parcel parcel, int i) {
        finishVariableData(parcel, i);
    }

    public static void writeBoolean(Parcel parcel, int i, boolean z) {
        writeHeader(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void writeBooleanObject(Parcel parcel, int i, Boolean bool, boolean z) {
        if (bool == null) {
            if (z) {
                writeHeader(parcel, i, 0);
            }
        } else {
            writeHeader(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public static void writeByte(Parcel parcel, int i, byte b) {
        writeHeader(parcel, i, 4);
        parcel.writeInt(b);
    }

    public static void writeChar(Parcel parcel, int i, char c) {
        writeHeader(parcel, i, 4);
        parcel.writeInt(c);
    }

    public static void writeShort(Parcel parcel, int i, short s) {
        writeHeader(parcel, i, 4);
        parcel.writeInt(s);
    }

    public static void writeInt(Parcel parcel, int i, int i2) {
        writeHeader(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void writeIntegerObject(Parcel parcel, int i, Integer num, boolean z) {
        if (num == null) {
            if (z) {
                writeHeader(parcel, i, 0);
            }
        } else {
            writeHeader(parcel, i, 4);
            parcel.writeInt(num.intValue());
        }
    }

    public static void writeLong(Parcel parcel, int i, long j) {
        writeHeader(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void writeLongObject(Parcel parcel, int i, Long l, boolean z) {
        if (l == null) {
            if (z) {
                writeHeader(parcel, i, 0);
            }
        } else {
            writeHeader(parcel, i, 8);
            parcel.writeLong(l.longValue());
        }
    }

    public static void writeBigInteger(Parcel parcel, int i, BigInteger bigInteger, boolean z) {
        if (bigInteger == null) {
            if (z) {
                writeHeader(parcel, i, 0);
            }
        } else {
            int iBeginVariableData = beginVariableData(parcel, i);
            parcel.writeByteArray(bigInteger.toByteArray());
            finishVariableData(parcel, iBeginVariableData);
        }
    }

    public static void writeFloat(Parcel parcel, int i, float f) {
        writeHeader(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void writeFloatObject(Parcel parcel, int i, Float f, boolean z) {
        if (f == null) {
            if (z) {
                writeHeader(parcel, i, 0);
            }
        } else {
            writeHeader(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        }
    }

    public static void writeDouble(Parcel parcel, int i, double d) {
        writeHeader(parcel, i, 8);
        parcel.writeDouble(d);
    }

    public static void writeDoubleObject(Parcel parcel, int i, Double d, boolean z) {
        if (d == null) {
            if (z) {
                writeHeader(parcel, i, 0);
            }
        } else {
            writeHeader(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        }
    }

    public static void writeBigDecimal(Parcel parcel, int i, BigDecimal bigDecimal, boolean z) {
        if (bigDecimal == null) {
            if (z) {
                writeHeader(parcel, i, 0);
            }
        } else {
            int iBeginVariableData = beginVariableData(parcel, i);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            finishVariableData(parcel, iBeginVariableData);
        }
    }

    public static void writeString(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                writeHeader(parcel, i, 0);
            }
        } else {
            int iBeginVariableData = beginVariableData(parcel, i);
            parcel.writeString(str);
            finishVariableData(parcel, iBeginVariableData);
        }
    }

    public static void writeIBinder(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                writeHeader(parcel, i, 0);
            }
        } else {
            int iBeginVariableData = beginVariableData(parcel, i);
            parcel.writeStrongBinder(iBinder);
            finishVariableData(parcel, iBeginVariableData);
        }
    }

    public static void writeParcelable(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                writeHeader(parcel, i, 0);
            }
        } else {
            int iBeginVariableData = beginVariableData(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            finishVariableData(parcel, iBeginVariableData);
        }
    }

    public static void writeBundle(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                writeHeader(parcel, i, 0);
            }
        } else {
            int iBeginVariableData = beginVariableData(parcel, i);
            parcel.writeBundle(bundle);
            finishVariableData(parcel, iBeginVariableData);
        }
    }

    public static void writeByteArray(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                writeHeader(parcel, i, 0);
            }
        } else {
            int iBeginVariableData = beginVariableData(parcel, i);
            parcel.writeByteArray(bArr);
            finishVariableData(parcel, iBeginVariableData);
        }
    }

    public static void writeByteArrayArray(Parcel parcel, int i, byte[][] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                writeHeader(parcel, i, 0);
                return;
            }
            return;
        }
        int iBeginVariableData = beginVariableData(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        finishVariableData(parcel, iBeginVariableData);
    }

    public static void writeBooleanArray(Parcel parcel, int i, boolean[] zArr, boolean z) {
        if (zArr == null) {
            if (z) {
                writeHeader(parcel, i, 0);
            }
        } else {
            int iBeginVariableData = beginVariableData(parcel, i);
            parcel.writeBooleanArray(zArr);
            finishVariableData(parcel, iBeginVariableData);
        }
    }

    public static void writeCharArray(Parcel parcel, int i, char[] cArr, boolean z) {
        if (cArr == null) {
            if (z) {
                writeHeader(parcel, i, 0);
            }
        } else {
            int iBeginVariableData = beginVariableData(parcel, i);
            parcel.writeCharArray(cArr);
            finishVariableData(parcel, iBeginVariableData);
        }
    }

    public static void writeIntArray(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr == null) {
            if (z) {
                writeHeader(parcel, i, 0);
            }
        } else {
            int iBeginVariableData = beginVariableData(parcel, i);
            parcel.writeIntArray(iArr);
            finishVariableData(parcel, iBeginVariableData);
        }
    }

    public static void writeLongArray(Parcel parcel, int i, long[] jArr, boolean z) {
        if (jArr == null) {
            if (z) {
                writeHeader(parcel, i, 0);
            }
        } else {
            int iBeginVariableData = beginVariableData(parcel, i);
            parcel.writeLongArray(jArr);
            finishVariableData(parcel, iBeginVariableData);
        }
    }

    public static void writeBigIntegerArray(Parcel parcel, int i, BigInteger[] bigIntegerArr, boolean z) {
        if (bigIntegerArr == null) {
            if (z) {
                writeHeader(parcel, i, 0);
                return;
            }
            return;
        }
        int iBeginVariableData = beginVariableData(parcel, i);
        parcel.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        finishVariableData(parcel, iBeginVariableData);
    }

    public static void writeFloatArray(Parcel parcel, int i, float[] fArr, boolean z) {
        if (fArr == null) {
            if (z) {
                writeHeader(parcel, i, 0);
            }
        } else {
            int iBeginVariableData = beginVariableData(parcel, i);
            parcel.writeFloatArray(fArr);
            finishVariableData(parcel, iBeginVariableData);
        }
    }

    public static void writeDoubleArray(Parcel parcel, int i, double[] dArr, boolean z) {
        if (dArr == null) {
            if (z) {
                writeHeader(parcel, i, 0);
            }
        } else {
            int iBeginVariableData = beginVariableData(parcel, i);
            parcel.writeDoubleArray(dArr);
            finishVariableData(parcel, iBeginVariableData);
        }
    }

    public static void writeBigDecimalArray(Parcel parcel, int i, BigDecimal[] bigDecimalArr, boolean z) {
        if (bigDecimalArr == null) {
            if (z) {
                writeHeader(parcel, i, 0);
                return;
            }
            return;
        }
        int iBeginVariableData = beginVariableData(parcel, i);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i2 = 0; i2 < length; i2++) {
            parcel.writeByteArray(bigDecimalArr[i2].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i2].scale());
        }
        finishVariableData(parcel, iBeginVariableData);
    }

    public static void writeStringArray(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                writeHeader(parcel, i, 0);
            }
        } else {
            int iBeginVariableData = beginVariableData(parcel, i);
            parcel.writeStringArray(strArr);
            finishVariableData(parcel, iBeginVariableData);
        }
    }

    public static void writeIBinderArray(Parcel parcel, int i, IBinder[] iBinderArr, boolean z) {
        if (iBinderArr == null) {
            if (z) {
                writeHeader(parcel, i, 0);
            }
        } else {
            int iBeginVariableData = beginVariableData(parcel, i);
            parcel.writeBinderArray(iBinderArr);
            finishVariableData(parcel, iBeginVariableData);
        }
    }

    public static void writeBooleanList(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                writeHeader(parcel, i, 0);
                return;
            }
            return;
        }
        int iBeginVariableData = beginVariableData(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Boolean) list.get(i2)).booleanValue() ? 1 : 0);
        }
        finishVariableData(parcel, iBeginVariableData);
    }

    public static void writeIntegerList(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                writeHeader(parcel, i, 0);
                return;
            }
            return;
        }
        int iBeginVariableData = beginVariableData(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) list.get(i2)).intValue());
        }
        finishVariableData(parcel, iBeginVariableData);
    }

    public static void writeLongList(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                writeHeader(parcel, i, 0);
                return;
            }
            return;
        }
        int iBeginVariableData = beginVariableData(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeLong(((Long) list.get(i2)).longValue());
        }
        finishVariableData(parcel, iBeginVariableData);
    }

    public static void writeFloatList(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                writeHeader(parcel, i, 0);
                return;
            }
            return;
        }
        int iBeginVariableData = beginVariableData(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeFloat(((Float) list.get(i2)).floatValue());
        }
        finishVariableData(parcel, iBeginVariableData);
    }

    public static void writeDoubleList(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                writeHeader(parcel, i, 0);
                return;
            }
            return;
        }
        int iBeginVariableData = beginVariableData(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeDouble(((Double) list.get(i2)).doubleValue());
        }
        finishVariableData(parcel, iBeginVariableData);
    }

    public static void writeStringList(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                writeHeader(parcel, i, 0);
            }
        } else {
            int iBeginVariableData = beginVariableData(parcel, i);
            parcel.writeStringList(list);
            finishVariableData(parcel, iBeginVariableData);
        }
    }

    public static void writeIBinderList(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                writeHeader(parcel, i, 0);
            }
        } else {
            int iBeginVariableData = beginVariableData(parcel, i);
            parcel.writeBinderList(list);
            finishVariableData(parcel, iBeginVariableData);
        }
    }

    public static void writeTypedArray(Parcel parcel, int i, Parcelable[] parcelableArr, int i2, boolean z) {
        if (parcelableArr == null) {
            if (z) {
                writeHeader(parcel, i, 0);
                return;
            }
            return;
        }
        int iBeginVariableData = beginVariableData(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                writeTypedItemWithSize(parcel, parcelable, i2);
            }
        }
        finishVariableData(parcel, iBeginVariableData);
    }

    public static void writeTypedList(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                writeHeader(parcel, i, 0);
                return;
            }
            return;
        }
        int iBeginVariableData = beginVariableData(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                writeTypedItemWithSize(parcel, parcelable, 0);
            }
        }
        finishVariableData(parcel, iBeginVariableData);
    }

    private static void writeTypedItemWithSize(Parcel parcel, Parcelable parcelable, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    public static void writeParcel(Parcel parcel, int i, Parcel parcel2, boolean z) {
        if (parcel2 == null) {
            if (z) {
                writeHeader(parcel, i, 0);
            }
        } else {
            int iBeginVariableData = beginVariableData(parcel, i);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            finishVariableData(parcel, iBeginVariableData);
        }
    }

    public static void writeParcelArray(Parcel parcel, int i, Parcel[] parcelArr, boolean z) {
        if (parcelArr == null) {
            if (z) {
                writeHeader(parcel, i, 0);
                return;
            }
            return;
        }
        int iBeginVariableData = beginVariableData(parcel, i);
        parcel.writeInt(parcelArr.length);
        for (Parcel parcel2 : parcelArr) {
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        finishVariableData(parcel, iBeginVariableData);
    }

    public static void writeParcelList(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                writeHeader(parcel, i, 0);
                return;
            }
            return;
        }
        int iBeginVariableData = beginVariableData(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcel parcel2 = (Parcel) list.get(i2);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        finishVariableData(parcel, iBeginVariableData);
    }

    public static void writeList(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                writeHeader(parcel, i, 0);
            }
        } else {
            int iBeginVariableData = beginVariableData(parcel, i);
            parcel.writeList(list);
            finishVariableData(parcel, iBeginVariableData);
        }
    }

    public static void writeSparseBooleanArray(Parcel parcel, int i, SparseBooleanArray sparseBooleanArray, boolean z) {
        if (sparseBooleanArray == null) {
            if (z) {
                writeHeader(parcel, i, 0);
            }
        } else {
            int iBeginVariableData = beginVariableData(parcel, i);
            parcel.writeSparseBooleanArray(sparseBooleanArray);
            finishVariableData(parcel, iBeginVariableData);
        }
    }

    public static void writeDoubleSparseArray(Parcel parcel, int i, SparseArray sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                writeHeader(parcel, i, 0);
                return;
            }
            return;
        }
        int iBeginVariableData = beginVariableData(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            parcel.writeDouble(((Double) sparseArray.valueAt(i2)).doubleValue());
        }
        finishVariableData(parcel, iBeginVariableData);
    }

    public static void writeFloatSparseArray(Parcel parcel, int i, SparseArray sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                writeHeader(parcel, i, 0);
                return;
            }
            return;
        }
        int iBeginVariableData = beginVariableData(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            parcel.writeFloat(((Float) sparseArray.valueAt(i2)).floatValue());
        }
        finishVariableData(parcel, iBeginVariableData);
    }

    public static void writeSparseIntArray(Parcel parcel, int i, SparseIntArray sparseIntArray, boolean z) {
        if (sparseIntArray == null) {
            if (z) {
                writeHeader(parcel, i, 0);
                return;
            }
            return;
        }
        int iBeginVariableData = beginVariableData(parcel, i);
        int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseIntArray.keyAt(i2));
            parcel.writeInt(sparseIntArray.valueAt(i2));
        }
        finishVariableData(parcel, iBeginVariableData);
    }

    public static void writeSparseLongArray(Parcel parcel, int i, SparseLongArray sparseLongArray, boolean z) {
        if (sparseLongArray == null) {
            if (z) {
                writeHeader(parcel, i, 0);
                return;
            }
            return;
        }
        int iBeginVariableData = beginVariableData(parcel, i);
        int size = sparseLongArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseLongArray.keyAt(i2));
            parcel.writeLong(sparseLongArray.valueAt(i2));
        }
        finishVariableData(parcel, iBeginVariableData);
    }

    public static void writeStringSparseArray(Parcel parcel, int i, SparseArray sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                writeHeader(parcel, i, 0);
                return;
            }
            return;
        }
        int iBeginVariableData = beginVariableData(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            parcel.writeString((String) sparseArray.valueAt(i2));
        }
        finishVariableData(parcel, iBeginVariableData);
    }

    public static void writeParcelSparseArray(Parcel parcel, int i, SparseArray sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                writeHeader(parcel, i, 0);
                return;
            }
            return;
        }
        int iBeginVariableData = beginVariableData(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            Parcel parcel2 = (Parcel) sparseArray.valueAt(i2);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        finishVariableData(parcel, iBeginVariableData);
    }

    public static void writeTypedSparseArray(Parcel parcel, int i, SparseArray sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                writeHeader(parcel, i, 0);
                return;
            }
            return;
        }
        int iBeginVariableData = beginVariableData(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            Parcelable parcelable = (Parcelable) sparseArray.valueAt(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                writeTypedItemWithSize(parcel, parcelable, 0);
            }
        }
        finishVariableData(parcel, iBeginVariableData);
    }

    public static void writeIBinderSparseArray(Parcel parcel, int i, SparseArray sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                writeHeader(parcel, i, 0);
                return;
            }
            return;
        }
        int iBeginVariableData = beginVariableData(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            parcel.writeStrongBinder((IBinder) sparseArray.valueAt(i2));
        }
        finishVariableData(parcel, iBeginVariableData);
    }

    public static void writeByteArraySparseArray(Parcel parcel, int i, SparseArray sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                writeHeader(parcel, i, 0);
                return;
            }
            return;
        }
        int iBeginVariableData = beginVariableData(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            parcel.writeByteArray((byte[]) sparseArray.valueAt(i2));
        }
        finishVariableData(parcel, iBeginVariableData);
    }
}
