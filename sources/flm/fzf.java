package flm;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fzf extends fws {
    public int a;
    private final Queue b = new ArrayDeque();

    public final void a(gez gezVar) {
        if (!(gezVar instanceof fzf)) {
            this.b.add(gezVar);
            this.a += gezVar.a();
            return;
        }
        fzf fzfVar = (fzf) gezVar;
        while (!fzfVar.b.isEmpty()) {
            this.b.add((gez) fzfVar.b.remove());
        }
        this.a += fzfVar.a;
        fzfVar.a = 0;
        fzfVar.close();
    }

    @Override // flm.gez
    public final int a() {
        return this.a;
    }

    @Override // flm.gez
    public final int b() {
        fzg fzgVar = new fzg();
        a(fzgVar, 1);
        return fzgVar.a;
    }

    @Override // flm.gez
    public final void a(byte[] bArr, int i, int i2) {
        a(new fzh(i, bArr), i2);
    }

    @Override // flm.fws, flm.gez, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (!this.b.isEmpty()) {
            ((gez) this.b.remove()).close();
        }
    }

    private final void a(fzi fziVar, int i) {
        a(i);
        if (!this.b.isEmpty()) {
            c();
        }
        while (i > 0 && !this.b.isEmpty()) {
            gez gezVar = (gez) this.b.peek();
            int iMin = Math.min(i, gezVar.a());
            try {
                fziVar.a = fziVar.a(gezVar, iMin);
            } catch (IOException e) {
                fziVar.b = e;
            }
            if (!(fziVar.b != null)) {
                i -= iMin;
                this.a -= iMin;
                c();
            } else {
                return;
            }
        }
        if (i > 0) {
            throw new AssertionError("Failed executing read operation");
        }
    }

    private final void c() {
        if (((gez) this.b.peek()).a() == 0) {
            ((gez) this.b.remove()).close();
        }
    }

    @Override // flm.gez
    public final /* synthetic */ gez b(int i) {
        a(i);
        this.a -= i;
        fzf fzfVar = new fzf();
        while (i > 0) {
            gez gezVar = (gez) this.b.peek();
            if (gezVar.a() > i) {
                fzfVar.a(gezVar.b(i));
                i = 0;
            } else {
                fzfVar.a((gez) this.b.poll());
                i -= gezVar.a();
            }
        }
        return fzfVar;
    }
}
