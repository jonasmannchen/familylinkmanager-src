package flm;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fna extends IOException {
    public static final long serialVersionUID = -1616151763072450476L;

    public fna(String str) {
        super(str);
    }

    public fna(String str, Exception exc) {
        super(str, exc);
    }

    public static fna a() {
        return new fna("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public static fna b() {
        return new fna("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static fna c() {
        return new fna("CodedInputStream encountered a malformed varint.");
    }

    static fna d() {
        return new fna("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
