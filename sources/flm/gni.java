package flm;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gni {
    public static final gni a = new gni((byte) 0);
    public final byte b = 0;

    private gni(byte b) {
    }

    public final boolean a() {
        return (this.b & 1) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof gni) && this.b == ((gni) obj).b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new byte[]{this.b});
    }

    public final String toString() {
        return new StringBuilder(27).append("TraceOptions{sampled=").append(a()).append("}").toString();
    }
}
