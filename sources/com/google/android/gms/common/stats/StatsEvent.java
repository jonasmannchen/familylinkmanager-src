package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import flm.bdv;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class StatsEvent extends bdv implements ReflectedParcelable {
    public abstract long a();

    public abstract StatsEvent a(long j);

    public abstract StatsEvent a(StatsEvent statsEvent);

    public abstract int b();

    public abstract String c();

    public abstract long d();

    public abstract long e();

    public abstract String f();

    public abstract StatsEvent g();

    public String toString() {
        long jA = a();
        int iB = b();
        long jD = d();
        String strF = f();
        return new StringBuilder(String.valueOf(strF).length() + 53).append(jA).append("\t").append(iB).append("\t").append(jD).append(strF).toString();
    }
}
