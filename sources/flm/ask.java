package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ask extends fmv {
    private String[] a = fne.c;
    private String[] b = fne.c;

    public ask() {
        this.g = null;
        this.h = -1;
    }

    @Override // flm.fmv, flm.fnb
    public final void a(fmt fmtVar) throws fmu {
        if (this.a != null && this.a.length > 0) {
            for (int i = 0; i < this.a.length; i++) {
                String str = this.a[i];
                if (str != null) {
                    fmtVar.a(1, str);
                }
            }
        }
        if (this.b != null && this.b.length > 0) {
            for (int i2 = 0; i2 < this.b.length; i2++) {
                String str2 = this.b[i2];
                if (str2 != null) {
                    fmtVar.a(2, str2);
                }
            }
        }
        super.a(fmtVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fmv, flm.fnb
    public final int a() {
        int i;
        int iA = super.a();
        if (this.a == null || this.a.length <= 0) {
            i = iA;
        } else {
            int iA2 = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.a.length; i3++) {
                String str = this.a[i3];
                if (str != null) {
                    i2++;
                    iA2 += fmt.a(str);
                }
            }
            i = iA + iA2 + (i2 * 1);
        }
        if (this.b != null && this.b.length > 0) {
            int iA3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < this.b.length; i5++) {
                String str2 = this.b[i5];
                if (str2 != null) {
                    i4++;
                    iA3 += fmt.a(str2);
                }
            }
            return i + iA3 + (i4 * 1);
        }
        return i;
    }

    @Override // flm.fnb
    public final /* synthetic */ fnb a(fms fmsVar) throws fna {
        while (true) {
            int iA = fmsVar.a();
            switch (iA) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    break;
                case 10:
                    int iA2 = fne.a(fmsVar, 10);
                    int length = this.a == null ? 0 : this.a.length;
                    String[] strArr = new String[iA2 + length];
                    if (length != 0) {
                        System.arraycopy(this.a, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = fmsVar.c();
                        fmsVar.a();
                        length++;
                    }
                    strArr[length] = fmsVar.c();
                    this.a = strArr;
                    break;
                case 18:
                    int iA3 = fne.a(fmsVar, 18);
                    int length2 = this.b == null ? 0 : this.b.length;
                    String[] strArr2 = new String[iA3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.b, 0, strArr2, 0, length2);
                    }
                    while (length2 < strArr2.length - 1) {
                        strArr2[length2] = fmsVar.c();
                        fmsVar.a();
                        length2++;
                    }
                    strArr2[length2] = fmsVar.c();
                    this.b = strArr2;
                    break;
                default:
                    if (!super.a(fmsVar, iA)) {
                    }
                    break;
            }
        }
        return this;
    }
}
