package flm;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class fjg extends IOException {
    public static final long serialVersionUID = -1616151763072450476L;

    public fjg(String str) {
        super(str);
    }

    static fjg a() {
        return new fjg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static fjg b() {
        return new fjg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static fjg c() {
        return new fjg("CodedInputStream encountered a malformed varint.");
    }

    static fjg d() {
        return new fjg("Protocol message contained an invalid tag (zero).");
    }

    static fjg e() {
        return new fjg("Protocol message end-group tag did not match expected tag.");
    }

    static fjh f() {
        return new fjh("Protocol message tag had invalid wire type.");
    }

    static fjg g() {
        return new fjg("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static fjg h() {
        return new fjg("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static fjg i() {
        return new fjg("Failed to parse the message.");
    }

    static fjg j() {
        return new fjg("Protocol message had invalid UTF-8.");
    }
}
