package flm;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.app.BaseApplicationContext;
import com.google.android.gms.common.stats.ConnectionEvent;
import com.google.android.gms.common.stats.StatsEvent;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bgd implements bgi {
    private static bgd d;
    public final bga a;
    public final ScheduledExecutorService b;
    public final Map c;
    private final long e;
    private final long f;
    private final File g;
    private final bge h;
    private final Map i;

    public static synchronized bgd a() {
        if (d == null) {
            d = new bgd();
        }
        return d;
    }

    private bgd() {
        this(null, null);
    }

    private bgd(ScheduledExecutorService scheduledExecutorService, bge bgeVar) {
        this.i = new rt();
        this.c = new rt();
        if (ayt.a() == null) {
            this.a = new bga(bgb.b);
            this.e = 0L;
            this.f = 0L;
            this.g = null;
            this.b = null;
            this.h = null;
            return;
        }
        try {
            dfc.a(ayt.a().getContentResolver(), "gms:common:stats:writer", "gms:common:stats:connections", "gms:common:stats:wakeLocks", "gms:common:stats:alarms");
        } catch (SecurityException e) {
            Log.w("StatisticalEventTracker", "Failed to cache log levels", e);
        }
        this.a = new bga();
        if (!this.a.d) {
            this.e = 0L;
            this.f = 0L;
            this.g = null;
            this.b = null;
            this.h = null;
            return;
        }
        BaseApplicationContext baseApplicationContextA = ayt.a();
        this.g = (dfj.a() ? dfj.c(baseApplicationContextA) : baseApplicationContextA).getDir("stats", 0);
        this.h = new bge();
        this.b = bgy.b(1, 10);
        this.e = ((Long) bfx.f.b()).longValue();
        this.f = ((Long) bfy.b.b()).longValue();
    }

    private final void a(String str, bgg bggVar) {
        long jMin = 0;
        bgh bghVar = new bgh(this, str, bggVar.a);
        ScheduledExecutorService scheduledExecutorService = this.b;
        StatsEvent statsEvent = bggVar.a;
        long jE = statsEvent.e();
        if (statsEvent instanceof ConnectionEvent) {
            if (jE == 0) {
                jMin = this.e;
            } else {
                jMin = Math.min(jE, this.e);
            }
        } else if (statsEvent instanceof WakeLockEvent) {
            if (jE == 0) {
                jMin = this.f;
            } else {
                jMin = Math.min(jE, this.f);
            }
        }
        bggVar.b = scheduledExecutorService.schedule(bghVar, jMin, TimeUnit.MILLISECONDS);
    }

    private final void a(String str, StatsEvent statsEvent) {
        bgg bggVar;
        synchronized (this.c) {
            bggVar = (bgg) this.c.remove(statsEvent.c());
        }
        if (bggVar != null) {
            if (bggVar.b != null) {
                bggVar.b.cancel(true);
            }
            this.b.execute(new bgf(this, str, bggVar.a, statsEvent));
            return;
        }
        Log.w("StatisticalEventTracker", "Close event missing open event.");
    }

    @Override // flm.bgi
    public final void a(WakeLockEvent wakeLockEvent) {
        boolean z = false;
        if (this.a.a("wakelocks")) {
            switch (wakeLockEvent.b()) {
                case 7:
                case 10:
                    synchronized (this.c) {
                        bgg bggVar = new bgg(wakeLockEvent);
                        this.c.put(wakeLockEvent.c(), bggVar);
                        bga bgaVar = this.a;
                        switch (wakeLockEvent.b()) {
                            case 7:
                            case 10:
                                if ((bgaVar.b & bgb.c) != 0) {
                                    z = true;
                                }
                                break;
                        }
                        if (z) {
                            a("wakelocks", bggVar);
                        }
                        break;
                    }
                    return;
                case 8:
                case 11:
                    if (this.a.a(wakeLockEvent)) {
                        a("wakelocks", (StatsEvent) wakeLockEvent);
                        return;
                    }
                    return;
                case 9:
                case 12:
                case 13:
                case 14:
                case 15:
                default:
                    return;
                case 16:
                    if (this.a.a(wakeLockEvent)) {
                        wakeLockEvent.a(wakeLockEvent.g);
                        this.b.execute(new bgf(this, "wakelocks", wakeLockEvent));
                        return;
                    }
                    return;
            }
        }
    }

    @Override // flm.bgi
    public final void a(ConnectionEvent connectionEvent) {
        boolean z = true;
        boolean z2 = false;
        if (this.a.a(bdn.CLEARCUT_TAG)) {
            switch (connectionEvent.b()) {
                case 1:
                case 4:
                case 14:
                    bga bgaVar = this.a;
                    switch (connectionEvent.b()) {
                        case 1:
                        case 4:
                        case 14:
                        case 15:
                            if ((bgaVar.a & bgb.e) == 0) {
                                z = false;
                            }
                            break;
                        case 2:
                        case 3:
                        case 13:
                            if ((bgaVar.a & bgb.d) == 0) {
                                z = false;
                            }
                            break;
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        default:
                            z = false;
                            break;
                    }
                    if (z) {
                        a(bdn.CLEARCUT_TAG, (StatsEvent) connectionEvent);
                        return;
                    }
                    return;
                case 2:
                case 3:
                case 13:
                    synchronized (this.c) {
                        bgg bggVar = new bgg(connectionEvent);
                        this.c.put(connectionEvent.c(), bggVar);
                        bga bgaVar2 = this.a;
                        switch (connectionEvent.b()) {
                            case 2:
                            case 3:
                            case 13:
                                if ((bgaVar2.a & bgb.c) != 0) {
                                    z2 = true;
                                }
                                break;
                        }
                        if (z2) {
                            a(bdn.CLEARCUT_TAG, bggVar);
                        }
                        break;
                    }
                    return;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                default:
                    return;
                case 15:
                    String strC = connectionEvent.c();
                    synchronized (this.c) {
                        Iterator it = this.c.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            if (((String) entry.getKey()).startsWith(strC)) {
                                if (((bgg) entry.getValue()).b != null) {
                                    ((bgg) entry.getValue()).b.cancel(true);
                                }
                                this.b.execute(new bgf(this, bdn.CLEARCUT_TAG, ((bgg) entry.getValue()).a, connectionEvent));
                                it.remove();
                            }
                        }
                        break;
                    }
                    return;
            }
        }
    }

    @Override // flm.bgi
    public final int a(int i) {
        bga bgaVar = this.a;
        switch (i) {
            case 1:
                return bgaVar.b;
            case 2:
                return bgaVar.a;
            case 3:
                return bgaVar.c;
            default:
                return bgb.b;
        }
    }

    private final bia a(String str) {
        bia biaVar;
        synchronized (this.i) {
            bia biaVar2 = (bia) this.i.get(str);
            biv bivVar = new biv(this.g, str);
            if (biaVar2 == null || !bivVar.exists()) {
                biaVar = new bia(bivVar, this.h.a, ((Long) bfv.b.b()).longValue(), TimeUnit.MILLISECONDS, ((Integer) bfv.c.b()).intValue());
                bia biaVar3 = (bia) this.i.put(str, biaVar);
                if (biaVar3 != null) {
                    try {
                        biaVar3.b();
                        biaVar3.close();
                    } catch (IOException e) {
                    }
                }
            } else {
                biaVar = biaVar2;
            }
        }
        return biaVar;
    }

    final void a(String str, Object obj) {
        bia biaVarA = a(str);
        try {
            biaVarA.append(obj.toString());
            biaVarA.append("\n");
        } catch (IOException e) {
            Log.e("StatisticalEventTracker", "Failed to write event.", e);
        }
    }

    private static ArrayList b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new ArrayList(Arrays.asList(str.split(bdp.WHITELIST_DELIMITER)));
    }

    @Override // flm.bgi
    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("ct_icp", b((String) bfx.b.b()));
        bundle.putStringArrayList("ct_ics", b((String) bfx.c.b()));
        bundle.putStringArrayList("ct_itp", b((String) bfx.d.b()));
        bundle.putStringArrayList("ct_its", b((String) bfx.e.b()));
        bundle.putLong("ct_st", ((Long) bfx.f.b()).longValue());
        return bundle;
    }
}
