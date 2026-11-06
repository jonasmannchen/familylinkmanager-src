package flm;

import android.database.sqlite.SQLiteException;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cj implements Runnable {
    private final /* synthetic */ ci a;

    cj(ci ciVar) {
        this.a = ciVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (this.a.f.g()) {
            return;
        }
        ci ciVar = this.a;
        if (ciVar.f.b()) {
            if (!ciVar.h) {
                ciVar.f.b.a();
            }
            if (ciVar.h) {
                z = true;
            } else {
                Log.e("ROOM", "database is not initialized even though it is open");
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        while (true) {
            try {
                int[] iArrA = this.a.j.a();
                if (iArrA == null) {
                    return;
                }
                int length = iArrA.length;
                bo boVarA = this.a.f.b.a();
                try {
                    boVarA.a();
                    for (int i = 0; i < length; i++) {
                        switch (iArrA[i]) {
                            case 1:
                                String str = this.a.b[i];
                                StringBuilder sb = new StringBuilder();
                                for (String str2 : ci.a) {
                                    sb.setLength(0);
                                    sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
                                    ci.a(sb, str, str2);
                                    sb.append(" AFTER ").append(str2).append(" ON `").append(str).append("` BEGIN INSERT OR REPLACE INTO room_table_modification_log").append(" VALUES(null, ").append(i).append("); END");
                                    boVarA.c(sb.toString());
                                }
                                break;
                            case 2:
                                String str3 = this.a.b[i];
                                StringBuilder sb2 = new StringBuilder();
                                for (String str4 : ci.a) {
                                    sb2.setLength(0);
                                    sb2.append("DROP TRIGGER IF EXISTS ");
                                    ci.a(sb2, str3, str4);
                                    boVarA.c(sb2.toString());
                                }
                                break;
                        }
                    }
                    boVarA.c();
                    boVarA.b();
                    cl clVar = this.a.j;
                    synchronized (clVar) {
                        clVar.a = false;
                    }
                } catch (Throwable th) {
                    boVarA.b();
                    throw th;
                }
            } catch (SQLiteException | IllegalStateException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                return;
            }
        }
    }
}
