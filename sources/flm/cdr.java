package flm;

import android.app.Notification;
import android.content.Context;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.database.SupervisionDatabase;
import com.google.android.gms.kids.features.timelimit.TimeLimitCheckingIntentOperation;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cdr extends cdc {
    private final Context a = ayt.a();
    private final SupervisionDatabase b = SupervisionDatabase.h();
    private final bek c = (bek) dvl.a(bek.a(this.a));

    @Override // flm.cdc
    public final int a(bwg bwgVar, cdb cdbVar) {
        fee feeVar;
        fee feeVar2;
        ffg ffgVar;
        fee feeVar3;
        ffc ffcVar;
        fco fcoVar = (fco) fin.b(fco.c, bwgVar.f);
        if (fcoVar.b == null) {
            feeVar = fee.f;
        } else {
            feeVar = fcoVar.b;
        }
        if (feeVar.e.size() != 0) {
            HashSet hashSet = new HashSet();
            for (fei feiVar : feeVar.e) {
                if (!feiVar.f.isEmpty()) {
                    hashSet.add(feiVar.f);
                }
            }
            if (!hashSet.isEmpty()) {
                this.b.p().a(hashSet);
            }
        }
        this.b.p().a(btj.b() - TimeUnit.DAYS.toMillis(1L));
        this.a.startService(TimeLimitCheckingIntentOperation.a("policy"));
        if (cdbVar != cdb.BOOTSTRAP) {
            if (fcoVar.b == null) {
                feeVar2 = fee.f;
            } else {
                feeVar2 = fcoVar.b;
            }
            if (feeVar2.b == null) {
                ffgVar = ffg.f;
            } else {
                ffgVar = feeVar2.b;
            }
            feu feuVarA = feu.a(ffgVar.b);
            if (feuVarA == null) {
                feuVarA = feu.UNSPECIFIED_TIME_LIMIT_STATE;
            }
            if (feuVarA == feu.TIME_LIMIT_ON) {
                long jC = this.b.p().c("last_seen_window_limit_version");
                long j = ffgVar.e;
                if (j > jC) {
                    this.c.a("tag_window", R.id.kids_time_limit_changed_notification_id, a(this.a.getString(R.string.kids_time_limit_changed_title), this.a.getString(R.string.kids_window_limit_changed_message)));
                    this.b.p().a("last_seen_window_limit_version", j);
                }
            }
            if (fcoVar.b == null) {
                feeVar3 = fee.f;
            } else {
                feeVar3 = fcoVar.b;
            }
            if (feeVar3.c == null) {
                ffcVar = ffc.g;
            } else {
                ffcVar = feeVar3.c;
            }
            feu feuVarA2 = feu.a(ffcVar.b);
            if (feuVarA2 == null) {
                feuVarA2 = feu.UNSPECIFIED_TIME_LIMIT_STATE;
            }
            if (feuVarA2 == feu.TIME_LIMIT_ON) {
                long jC2 = this.b.p().c("last_seen_usage_limit_version");
                long j2 = ffcVar.f;
                if (j2 > jC2) {
                    this.c.a("tag_usage", R.id.kids_time_limit_changed_notification_id, a(this.a.getString(R.string.kids_time_limit_changed_title), this.a.getString(R.string.kids_usage_limit_changed_message)));
                    this.b.p().a("last_seen_usage_limit_version", j2);
                    return 2;
                }
                return 2;
            }
            return 2;
        }
        return 2;
    }

    @Override // flm.cdc
    public final void a(bwg bwgVar) {
        this.b.l().b(bwgVar);
        this.a.startService(TimeLimitCheckingIntentOperation.a("policy"));
        this.c.a(R.id.kids_time_limit_changed_notification_id);
    }

    private final Notification a(String str, String str2) {
        Notification.Builder group = buc.a(this.a, R.drawable.ic_familylink_notification_white_24).setAutoCancel(true).setContentTitle(str).setContentText(str2).setStyle(new Notification.BigTextStyle().bigText(str2)).setGroup("com.google.android.gms.kids.POLICY_UPDATES");
        bto.a(this.a, group);
        return group.build();
    }
}
