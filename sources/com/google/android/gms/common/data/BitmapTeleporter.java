package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import flm.azt;
import flm.bdv;
import flm.bdy;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class BitmapTeleporter extends bdv implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new azt();
    public final int a;
    public ParcelFileDescriptor b;
    public final int c;
    public File d;
    private Bitmap e = null;

    public BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.a = i;
        this.b = parcelFileDescriptor;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Bitmap bitmap = null;
        if (this.b == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(byteBufferAllocate);
            byte[] bArrArray = byteBufferAllocate.array();
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(a()));
            try {
                try {
                    dataOutputStream.writeInt(bArrArray.length);
                    Bitmap bitmap2 = null;
                    dataOutputStream.writeInt(bitmap2.getWidth());
                    Bitmap bitmap3 = null;
                    dataOutputStream.writeInt(bitmap3.getHeight());
                    Bitmap bitmap4 = null;
                    dataOutputStream.writeUTF(bitmap4.getConfig().toString());
                    dataOutputStream.write(bArrArray);
                    a(dataOutputStream);
                } catch (IOException e) {
                    throw new IllegalStateException("Could not write into unlinked file", e);
                }
            } catch (Throwable th) {
                a(dataOutputStream);
                throw th;
            }
        }
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 1, this.a);
        bdy.writeParcelable(parcel, 2, this.b, i | 1, false);
        bdy.writeInt(parcel, 3, this.c);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
        this.b = null;
    }

    private final FileOutputStream a() {
        if (this.d == null) {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
        try {
            File fileCreateTempFile = File.createTempFile("teleporter", ".tmp", this.d);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                this.b = ParcelFileDescriptor.open(fileCreateTempFile, 268435456);
                fileCreateTempFile.delete();
                return fileOutputStream;
            } catch (FileNotFoundException e) {
                throw new IllegalStateException("Temporary file is somehow already deleted");
            }
        } catch (IOException e2) {
            throw new IllegalStateException("Could not create temporary file", e2);
        }
    }

    private static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("BitmapTeleporter", "Could not close stream", e);
        }
    }
}
