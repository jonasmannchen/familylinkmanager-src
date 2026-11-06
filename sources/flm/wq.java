package flm;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class wq {
    public int a;
    public int b;
    public int c;
    public int d;
    public ViewGroup e;
    public View f;
    public View g;
    public zi h;
    public zf i;
    public Context j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o = false;
    public boolean p;
    public Bundle q;

    wq(int i) {
        this.a = i;
    }

    final void a(zi ziVar) {
        if (ziVar != this.h) {
            if (this.h != null) {
                this.h.b(this.i);
            }
            this.h = ziVar;
            if (ziVar == null || this.i == null) {
                return;
            }
            ziVar.a(this.i);
        }
    }
}
