package flm;

import com.google.android.gms.kids.aidl.IKidsInternalService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class flm {
    static String a(fgy fgyVar) {
        fln flnVar = new fln(fgyVar);
        StringBuilder sb = new StringBuilder(flnVar.a());
        for (int i = 0; i < flnVar.a(); i++) {
            byte bA = flnVar.a(i);
            switch (bA) {
                case 7:
                    sb.append("\\a");
                    break;
                case 8:
                    sb.append("\\b");
                    break;
                case 9:
                    sb.append("\\t");
                    break;
                case 10:
                    sb.append("\\n");
                    break;
                case 11:
                    sb.append("\\v");
                    break;
                case 12:
                    sb.append("\\f");
                    break;
                case 13:
                    sb.append("\\r");
                    break;
                case 34:
                    sb.append("\\\"");
                    break;
                case IKidsInternalService.Stub.TRANSACTION_startService /* 39 */:
                    sb.append("\\'");
                    break;
                case 92:
                    sb.append("\\\\");
                    break;
                default:
                    if (bA < 32 || bA > 126) {
                        sb.append('\\');
                        sb.append((char) (((bA >>> 6) & 3) + 48));
                        sb.append((char) (((bA >>> 3) & 7) + 48));
                        sb.append((char) ((bA & 7) + 48));
                    } else {
                        sb.append((char) bA);
                    }
                    break;
            }
        }
        return sb.toString();
    }
}
