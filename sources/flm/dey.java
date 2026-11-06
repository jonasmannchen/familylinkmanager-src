package flm;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.SQLException;
import android.net.Uri;
import android.provider.BaseColumns;
import android.util.Log;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class dey implements BaseColumns {
    private static HashMap a = new HashMap();

    private static dfb a(ContentResolver contentResolver, Uri uri) {
        dfb dfbVar = (dfb) a.get(uri);
        if (dfbVar == null) {
            dfb dfbVar2 = new dfb();
            a.put(uri, dfbVar2);
            contentResolver.registerContentObserver(uri, true, new dez(null, dfbVar2));
            return dfbVar2;
        }
        if (!dfbVar.b.getAndSet(false)) {
            return dfbVar;
        }
        synchronized (dfbVar) {
            dfbVar.a.clear();
            new Object();
        }
        return dfbVar;
    }

    protected static boolean a(ContentResolver contentResolver, Uri uri, String str, String str2) {
        dfb dfbVarA;
        synchronized (dey.class) {
            dfbVarA = a(contentResolver, uri);
        }
        synchronized (dfbVarA) {
            dfbVarA.a.remove(str);
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("value", str2);
            contentResolver.insert(uri, contentValues);
            return true;
        } catch (SQLException e) {
            Log.e("GoogleSettings", "Can't set key " + str + " in " + uri, e);
            return false;
        } catch (IllegalArgumentException e2) {
            Log.e("GoogleSettings", "Can't set key " + str + " in " + uri, e2);
            return false;
        }
    }
}
