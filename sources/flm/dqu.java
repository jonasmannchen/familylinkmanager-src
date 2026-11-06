package flm;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dqu implements dqy {
    public static final Map a = new rt();
    private static final String[] g = {"key", "value"};
    public volatile Map c;
    private final ContentResolver e;
    private final Uri f;
    public final Object b = new Object();
    public final List d = new ArrayList();

    private dqu(ContentResolver contentResolver, Uri uri) {
        this.e = contentResolver;
        this.f = uri;
        this.e.registerContentObserver(uri, false, new dqw(this, null));
    }

    public static dqu a(ContentResolver contentResolver, Uri uri) {
        dqu dquVar;
        synchronized (dqu.class) {
            dquVar = (dqu) a.get(uri);
            if (dquVar == null) {
                try {
                    dqu dquVar2 = new dqu(contentResolver, uri);
                    try {
                        a.put(uri, dquVar2);
                        dquVar = dquVar2;
                    } catch (SecurityException e) {
                        dquVar = dquVar2;
                    }
                } catch (SecurityException e2) {
                }
            }
        }
        return dquVar;
    }

    private final Map b() {
        Map mapC = this.c;
        if (mapC == null) {
            synchronized (this.b) {
                mapC = this.c;
                if (mapC == null) {
                    mapC = c();
                    this.c = mapC;
                }
            }
        }
        return mapC != null ? mapC : Collections.emptyMap();
    }

    private final Map c() {
        try {
            return (Map) dqz.a(new dra(this) { // from class: flm.dqv
                private final dqu a;

                {
                    this.a = this;
                }

                @Override // flm.dra
                public final Object a() {
                    return this.a.a();
                }
            });
        } catch (SQLiteException | SecurityException e) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        }
    }

    @Override // flm.dqy
    public final /* synthetic */ Object a(String str) {
        return (String) b().get(str);
    }

    final /* synthetic */ Map a() {
        Map map;
        Cursor cursorQuery = this.e.query(this.f, g, null, null, null);
        if (cursorQuery == null) {
            return Collections.emptyMap();
        }
        try {
            int count = cursorQuery.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                map = new rt(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (cursorQuery.moveToNext()) {
                map.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            return map;
        } finally {
            cursorQuery.close();
        }
    }
}
