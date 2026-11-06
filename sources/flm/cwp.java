package flm;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cwp implements Parcelable {
    public static final Parcelable.Creator CREATOR = new cwq();
    private final Cursor a;
    private final int b;

    private cwp(Cursor cursor) {
        this.a = cursor;
        this.b = cursor == null ? 0 : cursor.getCount();
    }

    static cwp a(Parcel parcel) {
        int i = parcel.readInt();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        int i2 = parcel.readInt();
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        if (i == 0 && i2 == 0) {
            matrixCursor = null;
        } else {
            for (int i3 = 0; i3 < i2; i3++) {
                matrixCursor.addRow(parcel.readArray(Object.class.getClassLoader()));
            }
        }
        return new cwp(matrixCursor);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.a == null) {
            parcel.writeInt(0);
            parcel.writeStringArray(new String[0]);
            parcel.writeInt(0);
            return;
        }
        try {
            int columnCount = this.a.getColumnCount();
            parcel.writeInt(columnCount);
            parcel.writeStringArray(this.a.getColumnNames());
            parcel.writeInt(this.b);
            this.a.moveToPosition(-1);
            while (this.a.moveToNext()) {
                Object[] objArr = new Object[columnCount];
                for (int i2 = 0; i2 < columnCount; i2++) {
                    switch (this.a.getType(i2)) {
                        case bbx.MSG_UNBIND_SERVICE /* 0 */:
                            objArr[i2] = null;
                            break;
                        case 1:
                            objArr[i2] = Integer.valueOf(this.a.getInt(i2));
                            break;
                        case 2:
                            objArr[i2] = Float.valueOf(this.a.getFloat(i2));
                            break;
                        case 3:
                            objArr[i2] = this.a.getString(i2);
                            break;
                        case 4:
                            objArr[i2] = this.a.getBlob(i2);
                            break;
                    }
                }
                parcel.writeArray(objArr);
            }
        } finally {
            this.a.close();
        }
    }
}
