package flm;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dro implements dqy {
    public static final Map a = new HashMap();
    public volatile Map c;
    private final SharedPreferences e;
    private final SharedPreferences.OnSharedPreferenceChangeListener f = new SharedPreferences.OnSharedPreferenceChangeListener(this) { // from class: flm.drp
        private final dro a;

        {
            this.a = this;
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            dro droVar = this.a;
            synchronized (droVar.b) {
                droVar.c = null;
                drf.a.incrementAndGet();
            }
            synchronized (droVar) {
                Iterator it = droVar.d.iterator();
                while (it.hasNext()) {
                    ((dqx) it.next()).a();
                }
            }
        }
    };
    public final Object b = new Object();
    public final List d = new ArrayList();

    static dro a(Context context, String str) {
        dro droVar;
        SharedPreferences sharedPreferences;
        boolean zB = true;
        if (dfj.a() && !str.startsWith("direct_boot:")) {
            zB = dfj.b(context);
        }
        if (!zB) {
            return null;
        }
        synchronized (dro.class) {
            droVar = (dro) a.get(str);
            if (droVar == null) {
                if (str.startsWith("direct_boot:")) {
                    if (dfj.a()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    sharedPreferences = context.getSharedPreferences(str.substring(12), 0);
                } else {
                    sharedPreferences = context.getSharedPreferences(str, 0);
                }
                droVar = new dro(sharedPreferences);
                a.put(str, droVar);
            }
        }
        return droVar;
    }

    private dro(SharedPreferences sharedPreferences) {
        this.e = sharedPreferences;
        this.e.registerOnSharedPreferenceChangeListener(this.f);
    }

    @Override // flm.dqy
    public final Object a(String str) {
        Map<String, ?> all = this.c;
        if (all == null) {
            synchronized (this.b) {
                all = this.c;
                if (all == null) {
                    all = this.e.getAll();
                    this.c = all;
                }
            }
        }
        if (all != null) {
            return all.get(str);
        }
        return null;
    }
}
