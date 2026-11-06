package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class adl {
    public agm a;
    public agm b;
    public int c;
    public int d;
    public int e;
    public int f;

    private adl(agm agmVar, agm agmVar2) {
        this.a = agmVar;
        this.b = agmVar2;
    }

    adl(agm agmVar, agm agmVar2, int i, int i2, int i3, int i4) {
        this(agmVar, agmVar2);
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final String toString() {
        return "ChangeInfo{oldHolder=" + this.a + ", newHolder=" + this.b + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + '}';
    }
}
