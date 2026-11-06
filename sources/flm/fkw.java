package flm;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fkw {
    public final ArrayDeque a = new ArrayDeque();

    fkw() {
    }

    final void a(fgy fgyVar) {
        if (fgyVar.g()) {
            int iA = a(fgyVar.b());
            int i = fku.c[iA + 1];
            if (this.a.isEmpty() || ((fgy) this.a.peek()).b() >= i) {
                this.a.push(fgyVar);
                return;
            }
            int i2 = fku.c[iA];
            fgy fkuVar = (fgy) this.a.pop();
            while (!this.a.isEmpty() && ((fgy) this.a.peek()).b() < i2) {
                fkuVar = new fku((fgy) this.a.pop(), fkuVar);
            }
            fku fkuVar2 = new fku(fkuVar, fgyVar);
            while (!this.a.isEmpty()) {
                if (((fgy) this.a.peek()).b() >= fku.c[a(fkuVar2.b()) + 1]) {
                    break;
                } else {
                    fkuVar2 = new fku((fgy) this.a.pop(), fkuVar2);
                }
            }
            this.a.push(fkuVar2);
            return;
        }
        if (fgyVar instanceof fku) {
            fku fkuVar3 = (fku) fgyVar;
            a(fkuVar3.d);
            a(fkuVar3.e);
            return;
        }
        String strValueOf = String.valueOf(fgyVar.getClass());
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(strValueOf).length() + 49).append("Has a new type of ByteString been created? Found ").append(strValueOf).toString());
    }

    private static int a(int i) {
        int iBinarySearch = Arrays.binarySearch(fku.c, i);
        if (iBinarySearch < 0) {
            return (-(iBinarySearch + 1)) - 1;
        }
        return iBinarySearch;
    }
}
