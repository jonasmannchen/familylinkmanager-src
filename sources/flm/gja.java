package flm;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gja {
    public final Queue a;
    public final int b;
    public int c;
    public int d;
    public int e;
    public gij f;
    public final /* synthetic */ giz g;

    gja(giz gizVar, int i, int i2) {
        this.g = gizVar;
        this.b = i;
        this.d = i2;
        this.a = new ArrayDeque(2);
    }

    gja(giz gizVar, gij gijVar, int i) {
        this(gizVar, gijVar.g, i);
        this.f = gijVar;
    }

    final int a() {
        return Math.max(0, Math.min(this.d, this.c)) - this.e;
    }

    final int a(int i) {
        if (i > 0 && Integer.MAX_VALUE - i < this.d) {
            throw new IllegalArgumentException(new StringBuilder(44).append("Window size overflow for stream: ").append(this.b).toString());
        }
        this.d += i;
        return this.d;
    }

    final int b() {
        return Math.min(this.d, this.g.d.d);
    }

    final boolean c() {
        return !this.a.isEmpty();
    }

    final int a(int i, gjc gjcVar) {
        int i2;
        int iA = 0;
        int iMin = Math.min(i, b());
        while (true) {
            i2 = iA;
            int i3 = iMin;
            if (!c()) {
                break;
            }
            gjb gjbVar = (gjb) this.a.peek();
            if (i3 >= gjbVar.a()) {
                gjcVar.a();
                iA = gjbVar.a() + i2;
                gjbVar.b();
            } else {
                if (i3 <= 0) {
                    break;
                }
                gjb gjbVarA = gjbVar.a(i3);
                gjcVar.a();
                iA = gjbVarA.a() + i2;
                gjbVarA.b();
            }
            iMin = Math.min(i - iA, b());
        }
        return i2;
    }
}
