package flm;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bea {
    public static byte[] serializeToBytes(bdz bdzVar) {
        Parcel parcelObtain = Parcel.obtain();
        bdzVar.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static bdz deserializeFromBytes(byte[] bArr, Parcelable.Creator creator) {
        bdi.checkNotNull(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        bdz bdzVar = (bdz) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return bdzVar;
    }

    public static void serializeIterableToBundle(Iterable iterable, Bundle bundle, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(serializeToBytes((bdz) it.next()));
        }
        bundle.putSerializable(str, arrayList);
    }

    public static ArrayList deserializeIterableFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
        ArrayList arrayList = (ArrayList) bundle.getSerializable(str);
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = arrayList;
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            arrayList2.add(deserializeFromBytes((byte[]) obj, creator));
        }
        return arrayList2;
    }

    public static String serializeToString(bdz bdzVar) {
        byte[] bArrSerializeToBytes = serializeToBytes(bdzVar);
        if (bArrSerializeToBytes == null) {
            return null;
        }
        return Base64.encodeToString(bArrSerializeToBytes, 10);
    }

    public static bdz deserializeFromString(String str, Parcelable.Creator creator) {
        byte[] bArrDecode;
        if (str == null) {
            bArrDecode = null;
        } else {
            bArrDecode = Base64.decode(str, 10);
        }
        return deserializeFromBytes(bArrDecode, creator);
    }

    public static void serializeToIntentExtra(bdz bdzVar, Intent intent, String str) {
        intent.putExtra(str, serializeToBytes(bdzVar));
    }

    public static bdz deserializeFromIntentExtra(Intent intent, String str, Parcelable.Creator creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return deserializeFromBytes(byteArrayExtra, creator);
    }

    public static void serializeIterableToIntentExtra(Iterable iterable, Intent intent, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(serializeToBytes((bdz) it.next()));
        }
        intent.putExtra(str, arrayList);
    }

    public static ArrayList deserializeIterableFromIntentExtra(Intent intent, String str, Parcelable.Creator creator) {
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(str);
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = arrayList;
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            arrayList2.add(deserializeFromBytes((byte[]) obj, creator));
        }
        return arrayList2;
    }
}
