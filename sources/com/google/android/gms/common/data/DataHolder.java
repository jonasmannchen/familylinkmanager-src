package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import flm.azy;
import flm.baa;
import flm.bdi;
import flm.bdv;
import flm.bdy;
import java.io.Closeable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@KeepName
public final class DataHolder extends bdv implements Closeable {
    public static final Parcelable.Creator CREATOR = new baa();
    public final int a;
    public final String[] b;
    public Bundle c;
    public final CursorWindow[] d;
    public final int e;
    public final Bundle f;
    public int[] g;
    public int h;
    private boolean i = false;
    private boolean j = true;

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.a = i;
        this.b = strArr;
        this.d = cursorWindowArr;
        this.e = i2;
        this.f = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeStringArray(parcel, 1, this.b, false);
        bdy.writeTypedArray(parcel, 2, this.d, i, false);
        bdy.writeInt(parcel, 3, this.e);
        bdy.writeBundle(parcel, 4, this.f, false);
        bdy.writeInt(parcel, 1000, this.a);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
        if ((i & 1) != 0) {
            close();
        }
    }

    public final void a(String str, int i) {
        if (this.c == null || !this.c.containsKey(str)) {
            String strValueOf = String.valueOf(str);
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "No such column: ".concat(strValueOf) : new String("No such column: "));
        }
        if (a()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i < 0 || i >= this.h) {
            throw new CursorIndexOutOfBoundsException(i, this.h);
        }
    }

    public final int a(int i) {
        int i2 = 0;
        bdi.checkState(i >= 0 && i < this.h);
        while (i2 < this.g.length) {
            if (i < this.g[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        if (i2 == this.g.length) {
            return i2 - 1;
        }
        return i2;
    }

    public final boolean a() {
        boolean z;
        synchronized (this) {
            z = this.i;
        }
        return z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.i) {
                this.i = true;
                for (int i = 0; i < this.d.length; i++) {
                    this.d[i].close();
                }
            }
        }
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.j && this.d.length > 0 && !a()) {
                close();
                String string = toString();
                Log.e("DataBuffer", new StringBuilder(String.valueOf(string).length() + 178).append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ").append(string).append(")").toString());
            }
        } finally {
            super.finalize();
        }
    }

    static {
        new azy(new String[0], null);
    }
}
