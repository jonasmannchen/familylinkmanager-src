package flm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class lt extends lr {
    public final Activity a;
    public final Context b;
    public final Handler c;
    public final lw d;
    private final int e;

    lt(ln lnVar) {
        this(lnVar, lnVar, lnVar.a, 0);
    }

    private lt(Activity activity, Context context, Handler handler, int i) {
        this.d = new lw();
        this.a = activity;
        this.b = (Context) sn.a(context, "context == null");
        this.c = (Handler) sn.a(handler, "handler == null");
        this.e = 0;
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public boolean b() {
        return true;
    }

    public LayoutInflater c() {
        return LayoutInflater.from(this.b);
    }

    public void d() {
    }

    public void a(lg lgVar, Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.b.startActivity(intent);
    }

    public boolean e() {
        return true;
    }

    public int f() {
        return this.e;
    }

    @Override // flm.lr
    public View a(int i) {
        return null;
    }

    @Override // flm.lr
    public boolean a() {
        return true;
    }
}
