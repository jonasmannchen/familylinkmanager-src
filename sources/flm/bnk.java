package flm;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bnk extends bdv {
    public static final Parcelable.Creator CREATOR = new bnl();
    public int a;
    public int b;

    bnk(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public bnk() {
        this(0, 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 2, this.a);
        bdy.writeInt(parcel, 3, this.b);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private static int a(Context context, String str, TypedArray typedArray) {
        int color = 0;
        try {
            color = typedArray.getColor(0, 0);
        } catch (Exception e) {
            String strValueOf = String.valueOf(context);
            Log.w("ThemeSettings", new StringBuilder(String.valueOf(strValueOf).length() + 48 + String.valueOf(str).length()).append("Could not get theme color for [context: ").append(strValueOf).append(", attr: ").append(str).toString());
        } finally {
            typedArray.recycle();
        }
        return color;
    }

    public static int a(Context context) {
        return a(context, "android:colorPrimary", context.obtainStyledAttributes((AttributeSet) null, new int[]{context.getResources().getIdentifier("android:colorPrimary", "attr", context.getPackageName())}));
    }
}
