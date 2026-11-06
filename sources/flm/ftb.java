package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ftb {
    public String a;
    public ftc b;
    public ftk c;
    private Long d;

    public final ftb a(long j) {
        this.d = Long.valueOf(j);
        return this;
    }

    public final fta a() {
        dvl.a(this.a, "description");
        dvl.a(this.b, "severity");
        dvl.a(this.d, "timestampNanos");
        dvl.b(true, (Object) "at least one of channelRef and subchannelRef must be null");
        return new fta(this.a, this.b, this.d.longValue(), null, this.c);
    }
}
