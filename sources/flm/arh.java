package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum arh implements fiy {
    STATE_NONE(0),
    STATE_CHARGING(1),
    STATE_SCREEN_ON(2),
    STATE_NOT_REPORTED(7),
    STATE_INVALID(-1);

    public final int b;

    @Override // flm.fiy
    public final int a() {
        return this.b;
    }

    arh(int i) {
        this.b = i;
    }
}
