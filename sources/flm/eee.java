package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eee extends eej {
    public static final eej a = new eee();

    private eee() {
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    @Override // flm.eej
    public final int a(eeg eegVar, int i, String str, int i2, int i3, int i4) {
        eeb eeaVar;
        int i5;
        int i6 = i4 + 1;
        char cCharAt = str.charAt(i4);
        ebw ebwVarA = ebw.a(str, i3, i4, (cCharAt & ' ') == 0);
        ebv ebvVar = ebv.f[(cCharAt | ' ') - 97];
        if (!((cCharAt & ' ') != 0)) {
            if (ebvVar == null) {
                ebvVar = null;
            } else {
                if (!((ebvVar.i & 128) != 0)) {
                    ebvVar = null;
                }
            }
        }
        if (ebvVar != null) {
            if (!ebwVarA.a(ebvVar.i, ebvVar.h.f)) {
                throw eei.a("invalid format specifier", str, i2, i6);
            }
            eeaVar = eed.a(i, ebvVar, ebwVarA);
            i5 = i6;
        } else if (cCharAt == 't' || cCharAt == 'T') {
            if (!ebwVarA.a(160, false)) {
                throw eei.a("invalid format specification", str, i2, i6);
            }
            int i7 = i6 + 1;
            if (i7 > str.length()) {
                throw eei.a("truncated format specifier", str, i2);
            }
            edz edzVar = (edz) edz.a.get(Character.valueOf(str.charAt(i4 + 1)));
            if (edzVar == null) {
                throw eei.a("illegal date/time conversion", str, i4 + 1);
            }
            eeaVar = new eea(ebwVarA, i, edzVar);
            i5 = i7;
        } else {
            if (cCharAt != 'h' && cCharAt != 'H') {
                throw eei.a("invalid format specification", str, i2, i4 + 1);
            }
            if (!ebwVarA.a(160, false)) {
                throw eei.a("invalid format specification", str, i2, i6);
            }
            eeaVar = new eef(ebwVarA, i, ebwVarA);
            i5 = i6;
        }
        if (eeaVar.a < 32) {
            eegVar.b = (1 << eeaVar.a) | eegVar.b;
        }
        eegVar.c = Math.max(eegVar.c, eeaVar.a);
        eegVar.a(i2, i5, eeaVar);
        return i5;
    }
}
