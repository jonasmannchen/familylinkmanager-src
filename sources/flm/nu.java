package flm;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nu {
    public Context a;
    public ArrayList b;
    public ArrayList c;
    public CharSequence d;
    public CharSequence e;
    public PendingIntent f;
    public int g;
    public boolean h;
    public nv i;
    public boolean j;
    public Bundle k;
    public int l;
    public int m;
    public String n;
    public int o;
    public int p;
    public Notification q;

    @Deprecated
    public ArrayList r;

    private nu(Context context, String str) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.h = true;
        this.j = false;
        this.l = 0;
        this.m = 0;
        this.o = 0;
        this.p = 0;
        this.q = new Notification();
        this.a = context;
        this.n = null;
        this.q.when = System.currentTimeMillis();
        this.q.audioStreamType = -1;
        this.g = 0;
        this.r = new ArrayList();
    }

    @Deprecated
    public nu(Context context) {
        this(context, null);
    }

    public final nu a(int i) {
        this.q.icon = i;
        return this;
    }

    public final Bundle a() {
        if (this.k == null) {
            this.k = new Bundle();
        }
        return this.k;
    }

    public final nu a(nv nvVar) {
        if (this.i != nvVar) {
            this.i = nvVar;
            if (this.i != null) {
                nv nvVar2 = this.i;
                if (nvVar2.b != this) {
                    nvVar2.b = this;
                    if (nvVar2.b != null) {
                        nvVar2.b.a(nvVar2);
                    }
                }
            }
        }
        return this;
    }

    public static CharSequence a(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }
}
