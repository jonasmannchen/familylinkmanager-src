package flm;

import android.text.TextUtils;
import com.google.android.gms.common.stats.WakeLockEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bga {
    public final int a;
    public final int b;
    public final int c;
    public boolean d;
    private final boolean e = ((Boolean) bfy.c.b()).booleanValue();

    bga(int i) {
        this.a = i;
        this.b = i;
        this.c = i;
        this.d = (this.c == bgb.b && this.b == bgb.b && this.a == bgb.b) ? false : true;
    }

    bga() {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        try {
            iIntValue = ((Integer) bfx.a.b()).intValue();
            iIntValue2 = ((Integer) bfy.a.b()).intValue();
            iIntValue3 = ((Integer) bfw.a.b()).intValue();
        } catch (SecurityException e) {
            iIntValue = bgb.b;
            iIntValue2 = bgb.b;
            iIntValue3 = bgb.b;
        }
        this.b = iIntValue2;
        this.a = iIntValue;
        this.c = iIntValue3;
        this.d = (this.c == bgb.b && this.b == bgb.b && this.a == bgb.b) ? false : true;
    }

    public final boolean a(String str) {
        if (!this.d) {
            return false;
        }
        switch (str) {
            case "alarms":
                return this.c != bgb.b;
            case "service_connections":
                return this.a != bgb.b;
            case "wakelocks":
                return this.b != bgb.b;
            default:
                throw new IllegalArgumentException(String.valueOf(str).concat(" is not a valid type"));
        }
    }

    public final boolean a(WakeLockEvent wakeLockEvent) {
        switch (wakeLockEvent.b()) {
            case 7:
            case 10:
                return (this.b & bgb.d) != 0 && TextUtils.isEmpty(wakeLockEvent.i);
            case 8:
            case 11:
                return (this.b & bgb.e) != 0 && TextUtils.isEmpty(wakeLockEvent.i);
            case 9:
            case 12:
            case 13:
            case 14:
            case 15:
            default:
                return false;
            case 16:
                return this.e && (this.b & bgb.c) != 0 && TextUtils.isEmpty(wakeLockEvent.i);
        }
    }
}
