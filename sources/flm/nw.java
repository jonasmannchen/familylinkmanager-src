package flm;

import android.app.Notification;
import android.app.RemoteInput;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nw implements nq {
    public final Notification.Builder a;
    public final nu b;
    public RemoteViews c;
    public RemoteViews d;
    public int f;
    public RemoteViews g;
    private final List h = new ArrayList();
    public final Bundle e = new Bundle();

    public nw(nu nuVar) {
        RemoteInput[] remoteInputArr;
        this.b = nuVar;
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new Notification.Builder(nuVar.a, nuVar.n);
        } else {
            this.a = new Notification.Builder(nuVar.a);
        }
        Notification notification = nuVar.q;
        this.a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(nuVar.d).setContentText(nuVar.e).setContentInfo(null).setContentIntent(nuVar.f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setLargeIcon((Bitmap) null).setNumber(0).setProgress(0, 0, false);
        this.a.setSubText(null).setUsesChronometer(false).setPriority(nuVar.g);
        ArrayList arrayList = nuVar.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ns nsVar = (ns) arrayList.get(i);
            Notification.Action.Builder builder = new Notification.Action.Builder(nsVar.g, nsVar.h, nsVar.i);
            if (nsVar.b != null) {
                of[] ofVarArr = nsVar.b;
                if (ofVarArr == null) {
                    remoteInputArr = null;
                } else {
                    remoteInputArr = new RemoteInput[ofVarArr.length];
                    if (0 < ofVarArr.length) {
                        of ofVar = ofVarArr[0];
                        throw new NoSuchMethodError();
                    }
                }
                for (RemoteInput remoteInput : remoteInputArr) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            Bundle bundle = nsVar.a != null ? new Bundle(nsVar.a) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", nsVar.d);
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(nsVar.d);
            }
            bundle.putInt("android.support.action.semanticAction", nsVar.f);
            if (Build.VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(nsVar.f);
            }
            bundle.putBoolean("android.support.action.showsUserInterface", nsVar.e);
            builder.addExtras(bundle);
            this.a.addAction(builder.build());
            i = i2;
        }
        if (nuVar.k != null) {
            this.e.putAll(nuVar.k);
        }
        this.c = null;
        this.d = null;
        this.a.setShowWhen(nuVar.h);
        this.a.setLocalOnly(nuVar.j).setGroup(null).setGroupSummary(false).setSortKey(null);
        this.f = 0;
        this.a.setCategory(null).setColor(0).setVisibility(0).setPublicVersion(null).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = nuVar.r;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj = arrayList2.get(i3);
            i3++;
            this.a.addPerson((String) obj);
        }
        this.g = null;
        if (nuVar.c.size() > 0) {
            Bundle bundle2 = nuVar.a().getBundle("android.car.EXTENSIONS");
            Bundle bundle3 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle4 = new Bundle();
            for (int i4 = 0; i4 < nuVar.c.size(); i4++) {
                bundle4.putBundle(Integer.toString(i4), nx.a((ns) nuVar.c.get(i4)));
            }
            bundle3.putBundle("invisible_actions", bundle4);
            nuVar.a().putBundle("android.car.EXTENSIONS", bundle3);
            this.e.putBundle("android.car.EXTENSIONS", bundle3);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.a.setExtras(nuVar.k).setRemoteInputHistory(null);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.a.setBadgeIconType(0).setShortcutId(null).setTimeoutAfter(0L).setGroupAlertBehavior(0);
            if (TextUtils.isEmpty(nuVar.n)) {
                return;
            }
            this.a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
    }

    @Override // flm.nq
    public final Notification.Builder a() {
        return this.a;
    }

    public static void a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}
