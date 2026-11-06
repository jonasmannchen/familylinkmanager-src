package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class eeb {
    public final int a;
    public final ebw b;

    public eeb(ebw ebwVar, int i) {
        if (ebwVar == null) {
            throw new IllegalArgumentException("format options cannot be null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(new StringBuilder(26).append("invalid index: ").append(i).toString());
        }
        this.a = i;
        this.b = ebwVar;
    }

    public abstract void a(eec eecVar, Object obj);
}
