package flm;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bng extends bdv {
    public static final Parcelable.Creator CREATOR = new bnh();
    public ParcelFileDescriptor a;
    public final String b;
    public final String c;
    private File d;

    bng(ParcelFileDescriptor parcelFileDescriptor, String str, String str2) {
        this.a = parcelFileDescriptor;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.a == null) {
            DataOutputStream dataOutputStream = new DataOutputStream(a());
            Object[] objArr = null;
            try {
                try {
                    dataOutputStream.writeInt(objArr.length);
                    dataOutputStream.writeUTF(this.b);
                    dataOutputStream.writeUTF(this.c);
                    dataOutputStream.write((byte[]) null);
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
        bdy.writeParcelable(parcel, 2, this.a, i, false);
        bdy.writeString(parcel, 3, this.b, false);
        bdy.writeString(parcel, 4, this.c, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final void a(File file) {
        if (file == null) {
            throw new NullPointerException("Cannot set null temp directory");
        }
        this.d = file;
    }

    private final FileOutputStream a() {
        if (this.d == null) {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel.");
        }
        try {
            File fileCreateTempFile = File.createTempFile("teleporter", ".tmp", this.d);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                this.a = ParcelFileDescriptor.open(fileCreateTempFile, 268435456);
                fileCreateTempFile.delete();
                return fileOutputStream;
            } catch (FileNotFoundException e) {
                throw new IllegalStateException("Temporary file is somehow already deleted.");
            }
        } catch (IOException e2) {
            throw new IllegalStateException("Could not create temporary file:", e2);
        }
    }

    private static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("FileTeleporter", "Could not close stream", e);
        }
    }
}
