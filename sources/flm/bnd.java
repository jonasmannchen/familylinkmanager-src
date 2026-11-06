package flm;

import android.app.ApplicationErrorReport;
import android.os.Bundle;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bnd {
    public String a;
    public boolean b;
    public ApplicationErrorReport c;
    private Bundle d = new Bundle();
    private List e = new ArrayList();
    private String f;
    private boolean g;
    private long h;

    @Deprecated
    public bnd() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f = new StringBuilder(41).append(jCurrentTimeMillis).append("-").append(Math.abs(new SecureRandom().nextLong())).toString();
        this.g = false;
        this.h = 0L;
    }

    public bnc a() {
        bnc bncVar = new bnc(new ApplicationErrorReport());
        bncVar.m = null;
        bncVar.f = null;
        bncVar.a = null;
        bncVar.c = null;
        bncVar.b = this.d;
        bncVar.e = this.a;
        bncVar.h = this.e;
        bncVar.i = this.b;
        bncVar.j = null;
        bncVar.k = null;
        bncVar.l = false;
        bncVar.n = this.f;
        bncVar.o = false;
        bncVar.p = 0L;
        return bncVar;
    }
}
