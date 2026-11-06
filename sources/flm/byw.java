package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class byw {
    private final /* synthetic */ String a;
    private final /* synthetic */ fee b;

    byw(String str, fee feeVar) {
        this.a = str;
        this.b = feeVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a).append(":");
        sb.append("\nwindowLimit:");
        fee feeVar = this.b;
        ffg ffgVar = feeVar.b == null ? ffg.f : feeVar.b;
        feu feuVarA = feu.a(ffgVar.b);
        if (feuVarA == null) {
            feuVarA = feu.UNSPECIFIED_TIME_LIMIT_STATE;
        }
        if (feuVarA == feu.TIME_LIMIT_ON) {
            sb.append("\n  modified: ").append((CharSequence) byv.a(ffgVar.e));
            sb.append("\n  entries(day => time):");
            for (ffi ffiVar : ffgVar.d) {
                feu feuVarA2 = feu.a(ffiVar.d);
                if (feuVarA2 == null) {
                    feuVarA2 = feu.UNSPECIFIED_TIME_LIMIT_STATE;
                }
                if (feuVarA2 == feu.TIME_LIMIT_ON) {
                    StringBuilder sbAppend = sb.append("\n    ");
                    Object[] objArr = new Object[1];
                    exf exfVarA = exf.a(ffiVar.c);
                    if (exfVarA == null) {
                        exfVarA = exf.UNSPECIFIED_EFFECTIVE_DAY;
                    }
                    objArr[0] = exfVarA;
                    sbAppend.append(String.format("%-9s", objArr)).append(" => ").append((CharSequence) byv.a(ffiVar.f == null ? ffa.d : ffiVar.f)).append(" ~ ").append((CharSequence) byv.a(ffiVar.g == null ? ffa.d : ffiVar.g));
                }
            }
        }
        sb.append("\nusageLimit:");
        fee feeVar2 = this.b;
        ffc ffcVar = feeVar2.c == null ? ffc.g : feeVar2.c;
        feu feuVarA3 = feu.a(ffcVar.b);
        if (feuVarA3 == null) {
            feuVarA3 = feu.UNSPECIFIED_TIME_LIMIT_STATE;
        }
        if (feuVarA3 == feu.TIME_LIMIT_ON) {
            sb.append("\n  modified: ").append((CharSequence) byv.a(ffcVar.f));
            sb.append("\n  reset: ").append((CharSequence) byv.a(ffcVar.d == null ? ffa.d : ffcVar.d));
            sb.append("\n  entries(day => quota_min):");
            for (ffe ffeVar : ffcVar.e) {
                feu feuVarA4 = feu.a(ffeVar.d);
                if (feuVarA4 == null) {
                    feuVarA4 = feu.UNSPECIFIED_TIME_LIMIT_STATE;
                }
                if (feuVarA4 == feu.TIME_LIMIT_ON) {
                    StringBuilder sbAppend2 = sb.append("\n    ");
                    Object[] objArr2 = new Object[1];
                    exf exfVarA2 = exf.a(ffeVar.c);
                    if (exfVarA2 == null) {
                        exfVarA2 = exf.UNSPECIFIED_EFFECTIVE_DAY;
                    }
                    objArr2[0] = exfVarA2;
                    sbAppend2.append(String.format("%-9s", objArr2)).append(" => ").append(ffeVar.f);
                }
            }
        }
        sb.append("\noverrides:");
        for (fei feiVar : this.b.e) {
            fem femVarA = fem.a(feiVar.g);
            if (femVarA == null) {
                femVarA = fem.DEFAULT;
            }
            if (femVarA == fem.DEFAULT) {
                StringBuilder sbAppend3 = sb.append("\n  action: ");
                fej fejVarA = fej.a(feiVar.e);
                if (fejVarA == null) {
                    fejVarA = fej.UNSPECIFIED_ACTION;
                }
                sbAppend3.append(fejVarA);
                sb.append("\n  created: ").append((CharSequence) byv.a(feiVar.d));
                sb.append("\n  session: ").append(feiVar.f);
            }
        }
        return sb.toString();
    }
}
