package flm;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lp extends lt {
    private final /* synthetic */ ln e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp(ln lnVar) {
        super(lnVar);
        this.e = lnVar;
    }

    @Override // flm.lt
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.e.dump(str, null, printWriter, strArr);
    }

    @Override // flm.lt
    public final boolean b() {
        return !this.e.isFinishing();
    }

    @Override // flm.lt
    public final LayoutInflater c() {
        return this.e.getLayoutInflater().cloneInContext(this.e);
    }

    @Override // flm.lt
    public final void d() {
        this.e.b();
    }

    @Override // flm.lt
    public final void a(lg lgVar, Intent intent, int i, Bundle bundle) {
        ln lnVar = this.e;
        lnVar.c = true;
        try {
            if (i == -1) {
                kz.a(lnVar, intent, -1, bundle);
                lnVar.c = false;
                return;
            }
            ln.a(i);
            if (lnVar.e.c() >= 65534) {
                throw new IllegalStateException("Too many pending Fragment activity results.");
            }
            while (true) {
                sp spVar = lnVar.e;
                int i2 = lnVar.d;
                if (spVar.b) {
                    spVar.b();
                }
                if (rx.a(spVar.c, spVar.e, i2) >= 0) {
                    lnVar.d = (lnVar.d + 1) % 65534;
                } else {
                    int i3 = lnVar.d;
                    lnVar.e.b(i3, lgVar.h);
                    lnVar.d = (lnVar.d + 1) % 65534;
                    kz.a(lnVar, intent, ((i3 + 1) << 16) + (65535 & i), bundle);
                    lnVar.c = false;
                    return;
                }
            }
        } catch (Throwable th) {
            lnVar.c = false;
            throw th;
        }
    }

    @Override // flm.lt
    public final boolean e() {
        return this.e.getWindow() != null;
    }

    @Override // flm.lt
    public final int f() {
        Window window = this.e.getWindow();
        if (window == null) {
            return 0;
        }
        return window.getAttributes().windowAnimations;
    }

    @Override // flm.lt, flm.lr
    public final View a(int i) {
        return this.e.findViewById(i);
    }

    @Override // flm.lt, flm.lr
    public final boolean a() {
        Window window = this.e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }
}
