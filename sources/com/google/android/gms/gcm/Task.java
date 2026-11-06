package com.google.android.gms.gcm;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import flm.baw;
import flm.bqe;
import flm.bqi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class Task implements ReflectedParcelable {
    public final String a;
    public final String b;
    private final boolean c;
    private final boolean d;
    private final int e;
    private final Set f;
    private final boolean g;
    private final boolean h;
    private final bqe i;
    private final Bundle j;

    Task(bqi bqiVar) {
        this.a = bqiVar.d;
        this.b = bqiVar.e;
        this.c = bqiVar.f;
        this.d = bqiVar.g;
        this.e = bqiVar.c;
        this.f = bqiVar.h;
        this.g = false;
        this.h = false;
        this.j = bqiVar.j;
        this.i = bqiVar.i != null ? bqiVar.i : bqe.a;
    }

    @Deprecated
    Task(Parcel parcel) {
        Log.e("Task", "Constructing a Task object using a parcel.");
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt() == 1;
        this.d = parcel.readInt() == 1;
        this.e = 2;
        this.f = Collections.emptySet();
        this.g = false;
        this.h = false;
        this.i = bqe.a;
        this.j = null;
    }

    public void a(Bundle bundle) {
        bundle.putString("tag", this.b);
        bundle.putBoolean("update_current", this.c);
        bundle.putBoolean("persisted", this.d);
        bundle.putString("service", this.a);
        bundle.putInt("requiredNetwork", this.e);
        if (!this.f.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                arrayList.add(((Uri) it.next()).toString());
            }
            bundle.putStringArrayList("reachabilityUris", arrayList);
        }
        bundle.putBoolean("requiresCharging", this.g);
        bundle.putBoolean("requiresIdle", this.h);
        bqe bqeVar = this.i;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("retry_policy", bqeVar.b);
        bundle2.putInt("initial_backoff_seconds", bqeVar.c);
        bundle2.putInt("maximum_backoff_seconds", bqeVar.d);
        bundle.putBundle("retryStrategy", bundle2);
        bundle.putBundle(baw.KEY_EXTRAS, this.j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static void b(Bundle bundle) {
        if (bundle != null) {
            Parcel parcelObtain = Parcel.obtain();
            bundle.writeToParcel(parcelObtain, 0);
            int iDataSize = parcelObtain.dataSize();
            parcelObtain.recycle();
            if (iDataSize > 10240) {
                throw new IllegalArgumentException(new StringBuilder(55).append("Extras exceeding maximum size(10240 bytes): ").append(iDataSize).toString());
            }
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                if (!((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof String) || (obj instanceof Boolean))) {
                    if (obj instanceof Bundle) {
                        b((Bundle) obj);
                    } else {
                        throw new IllegalArgumentException("Only the following extra parameter types are supported: Integer, Long, Double, String, Boolean, and nested Bundles with the same restrictions.");
                    }
                }
            }
        }
    }

    public static void a(Uri uri) {
        if (uri == null) {
            throw new IllegalArgumentException("Null URI");
        }
        String scheme = uri.getScheme();
        String host = uri.getHost();
        if (TextUtils.isEmpty(host) || "null".equals(host)) {
            throw new IllegalArgumentException("URI hostname is required");
        }
        try {
            int port = uri.getPort();
            if ("tcp".equals(scheme)) {
                if (port <= 0 || port > 65535) {
                    throw new IllegalArgumentException(new StringBuilder(38).append("Invalid required URI port: ").append(uri.getPort()).toString());
                }
            } else if ("ping".equals(scheme)) {
                if (port != -1) {
                    throw new IllegalArgumentException("Ping does not support port numbers");
                }
            } else {
                String strValueOf = String.valueOf(scheme);
                throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unsupported required URI scheme: ".concat(strValueOf) : new String("Unsupported required URI scheme: "));
            }
        } catch (NumberFormatException e) {
            String strValueOf2 = String.valueOf(e.getMessage());
            throw new IllegalArgumentException(strValueOf2.length() != 0 ? "Invalid port number: ".concat(strValueOf2) : new String("Invalid port number: "));
        }
    }
}
