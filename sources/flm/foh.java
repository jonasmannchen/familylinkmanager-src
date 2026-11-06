package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class foh {
    public fod a;
    public String b = "GET";
    public foc c = new foc();

    public final foh a(String str, String str2) {
        int i = 0;
        foc focVar = this.c;
        if (str == null) {
            throw new IllegalArgumentException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 31 || cCharAt >= 127) {
                throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), str));
            }
        }
        if (str2 == null) {
            throw new IllegalArgumentException("value == null");
        }
        int length2 = str2.length();
        for (int i3 = 0; i3 < length2; i3++) {
            char cCharAt2 = str2.charAt(i3);
            if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i3), str2));
            }
        }
        while (true) {
            int i4 = i;
            if (i4 < focVar.a.size()) {
                if (str.equalsIgnoreCase((String) focVar.a.get(i4))) {
                    focVar.a.remove(i4);
                    focVar.a.remove(i4);
                    i4 -= 2;
                }
                i = i4 + 2;
            } else {
                focVar.a.add(str);
                focVar.a.add(str2.trim());
                return this;
            }
        }
    }
}
