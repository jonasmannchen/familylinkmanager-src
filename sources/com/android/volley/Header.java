package com.android.volley;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class Header {
    private final String a;
    private final String b;

    public Header(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String getName() {
        return this.a;
    }

    public final String getValue() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Header header = (Header) obj;
        return TextUtils.equals(this.a, header.a) && TextUtils.equals(this.b, header.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        return new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length()).append("Header[name=").append(str).append(",value=").append(str2).append("]").toString();
    }
}
