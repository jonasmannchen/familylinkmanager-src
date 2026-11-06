package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum gog implements fiy {
    UNKNOWN_METRIC(0),
    FRAME_DURATION_MILLIS(1),
    FRAME_JANK_COUNT(2),
    FRAME_DAVEY_JUNIOR_COUNT(3),
    FRAME_DAVEY_COUNT(4),
    CUSTOM_COUNTER(5),
    MEMORY_TOTAL_PSS_KB(6),
    MEMORY_ALLOCATED_KB(7);

    private final int i;

    @Override // flm.fiy
    public final int a() {
        return this.i;
    }

    gog(int i) {
        this.i = i;
    }
}
