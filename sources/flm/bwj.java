package flm;

import android.content.ComponentName;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bwj {
    public final cn a;

    bwj(cn cnVar) {
        this.a = cnVar;
    }

    protected abstract String a(String str);

    public abstract List a();

    public abstract void a(long j);

    protected abstract void a(bwr bwrVar);

    public abstract void a(List list);

    public abstract void a(Set set);

    public abstract Long b(String str);

    public final long c(String str) {
        Long lB = b(str);
        if (lB == null) {
            return 0L;
        }
        return lB.longValue();
    }

    public final boolean d(String str) {
        return c(str) != 0;
    }

    public final void a(String str, String str2) {
        a(new bwr(str, str2));
    }

    public final void a(String str, long j) {
        a(str, String.valueOf(j));
    }

    public final void a(String str, boolean z) {
        a(str, z ? 1L : 0L);
    }

    public final long a(final long j, final int i) {
        return ((Long) this.a.a(new Callable(this, j, i) { // from class: flm.bwk
            private final bwj a;
            private final long b;
            private final int c;

            {
                this.a = this;
                this.b = j;
                this.c = i;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                bwj bwjVar = this.a;
                long j2 = this.b;
                int i2 = this.c;
                long jC = bwjVar.c("committed_usage_time_millis");
                long jC2 = bwjVar.c("usage_period_start_elapsed_time");
                boolean z = jC2 != 0;
                if (z && j2 > jC2) {
                    jC += j2 - jC2;
                    bwjVar.a("committed_usage_time_millis", jC);
                }
                switch (i2) {
                    case 1:
                        bwjVar.a("usage_period_start_elapsed_time", j2);
                        break;
                    case 2:
                        if (z) {
                            bwjVar.a("usage_period_start_elapsed_time", 0L);
                        }
                        break;
                    case 3:
                        if (z) {
                            bwjVar.a("usage_period_start_elapsed_time", j2);
                        }
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
                return Long.valueOf(jC);
            }
        })).longValue();
    }

    public final void b(final long j) {
        this.a.a(new Runnable(this, j) { // from class: flm.bwl
            private final bwj a;
            private final long b;

            {
                this.a = this;
                this.b = j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bwj bwjVar = this.a;
                long j2 = this.b;
                bwjVar.a("usage_period_start_elapsed_time", 0L);
                bwjVar.a("committed_usage_time_millis", 0L);
                bwjVar.a("last_usage_reset_epoch_time", j2);
            }
        });
    }

    public final ComponentName b() {
        String strA = a("user_preferred_launcher");
        if (strA == null) {
            return null;
        }
        return ComponentName.unflattenFromString(strA);
    }

    public final void a(ComponentName componentName) {
        a("user_preferred_launcher", componentName == null ? null : componentName.flattenToString());
    }
}
