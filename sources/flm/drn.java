package flm;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class drn {
    public final String a;
    public final Uri b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public drn(String str) {
        this(str, null, "", "", false, false, false);
    }

    public drn(Uri uri) {
        this(null, uri, "", "", false, false, false);
    }

    public drn(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = uri;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public final drn a(String str) {
        if (this.e) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new drn(this.a, this.b, str, this.d, this.e, this.f, this.g);
    }

    public final drn b(String str) {
        return new drn(this.a, this.b, this.c, str, this.e, this.f, this.g);
    }

    public final drn a() {
        if (!this.c.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new drn(this.a, this.b, this.c, this.d, true, this.f, this.g);
    }

    public final drn b() {
        return new drn(this.a, this.b, this.c, this.d, this.e, this.f, true);
    }

    public final drf a(String str, long j) {
        return drf.a(this, str, j);
    }

    public final drf a(String str, boolean z) {
        return drf.a(this, str, z);
    }

    public final drf a(String str, double d) {
        return drf.a(this, str, d);
    }

    public final drf a(String str, String str2) {
        return drf.a(this, str, str2);
    }

    public final drf a(String str, Object obj, drm drmVar) {
        return drf.a(this, str, obj, drmVar);
    }
}
