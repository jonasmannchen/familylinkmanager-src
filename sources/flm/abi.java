package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class abi {
    public int a;
    public int b;
    public Object c;
    public int d;

    abi(int i, int i2, int i3, Object obj) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = obj;
    }

    public final String toString() {
        String str;
        StringBuilder sbAppend = new StringBuilder().append(Integer.toHexString(System.identityHashCode(this))).append("[");
        switch (this.a) {
            case 1:
                str = "add";
                break;
            case 2:
                str = "rm";
                break;
            case 3:
            case 5:
            case 6:
            case 7:
            default:
                str = "??";
                break;
            case 4:
                str = "up";
                break;
            case 8:
                str = "mv";
                break;
        }
        return sbAppend.append(str).append(",s:").append(this.b).append("c:").append(this.d).append(",p:").append(this.c).append("]").toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        abi abiVar = (abi) obj;
        if (this.a != abiVar.a) {
            return false;
        }
        if (this.a == 8 && Math.abs(this.d - this.b) == 1 && this.d == abiVar.b && this.b == abiVar.d) {
            return true;
        }
        if (this.d == abiVar.d && this.b == abiVar.b) {
            if (this.c != null) {
                return this.c.equals(abiVar.c);
            }
            return abiVar.c == null;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }
}
