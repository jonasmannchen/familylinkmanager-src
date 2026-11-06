package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bvp {
    public abstract String a(String str);

    protected abstract void a(bvo bvoVar);

    public abstract long b(String str);

    public abstract int d(String str);

    public abstract Integer e(String str);

    public long c(String str) {
        long jB = b(str);
        a(str, 0L);
        return jB;
    }

    public final boolean f(String str) {
        return b(str) != 0;
    }

    public final void a(String str, String str2) {
        a(new bvo(str, str2));
    }

    public final void a(String str, long j) {
        a(new bvo(str, String.valueOf(j)));
    }

    public final void a(String str, boolean z) {
        a(str, z ? 1L : 0L);
    }

    public boolean b(String str, long j) {
        if (b(str) != 0) {
            return false;
        }
        a(str, j);
        return true;
    }

    public void a(long j, long j2, boolean z) {
        a("key_in_gl_sign_out", 3L);
        a("key_supervision_exit_lock_start_timestamp", j);
        a("key_supervision_exit_lock_duration_timestamp", j2);
        a("key_supervision_exit_permalock_required", z);
    }

    public void a() {
        a("key_supervision_exit_lock_start_timestamp", 0L);
        a("key_supervision_exit_lock_duration_timestamp", 0L);
        a("key_supervision_exit_permalock_required", false);
    }
}
