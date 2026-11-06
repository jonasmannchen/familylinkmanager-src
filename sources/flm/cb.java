package flm;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cb implements DatabaseErrorHandler {
    private final /* synthetic */ bx[] a;
    private final /* synthetic */ bq b;

    cb(bx[] bxVarArr, bq bqVar) {
        this.a = bxVarArr;
        this.b = bqVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069 A[LOOP:1: B:21:0x0063->B:23:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) throws Throwable {
        List list;
        Throwable th;
        Iterator it;
        bx bxVar = this.a[0];
        if (bxVar != null) {
            bq bqVar = this.b;
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + bxVar.f());
            if (!bxVar.e()) {
                bq.a(bxVar.f());
                return;
            }
            List listG = null;
            try {
                listG = bxVar.g();
            } catch (SQLiteException e) {
            } catch (Throwable th2) {
                list = null;
                th = th2;
                if (list != null) {
                    bq.a(bxVar.f());
                    throw th;
                }
                it = list.iterator();
                while (it.hasNext()) {
                    bq.a((String) ((Pair) it.next()).second);
                }
                throw th;
            }
            try {
                bxVar.close();
            } catch (IOException e2) {
            } catch (Throwable th3) {
                list = listG;
                th = th3;
                if (list != null) {
                    bq.a(bxVar.f());
                    throw th;
                }
                it = list.iterator();
                while (it.hasNext()) {
                    bq.a((String) ((Pair) it.next()).second);
                }
                throw th;
            }
            if (listG == null) {
                bq.a(bxVar.f());
                return;
            }
            Iterator it2 = listG.iterator();
            while (it2.hasNext()) {
                bq.a((String) ((Pair) it2.next()).second);
            }
        }
    }
}
