package flm;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aqd extends aqf {
    private static final Object e = new Object();
    public static final aqd a = new aqd();
    public static final int b = aqf.c;

    public final boolean a(Activity activity, axm axmVar, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogA = a(activity, i, bbg.getInstance(axmVar, a(activity, i, "d"), 2), onCancelListener);
        if (dialogA == null) {
            return false;
        }
        a(activity, dialogA, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean a(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogA = a(activity, i, bbg.getInstance(activity, a(activity, i, "d"), 2), onCancelListener);
        if (dialogA == null) {
            return false;
        }
        a(activity, dialogA, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final Dialog a(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(bbd.getErrorMessage(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        a(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    public final axf a(Context context, axg axgVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme(bbz.PACKAGE_SCHEME);
        axf axfVar = new axf(axgVar);
        context.registerReceiver(axfVar, intentFilter);
        axfVar.a = context;
        if (!aqx.a(context, "com.google.android.gms")) {
            axgVar.a();
            axfVar.a();
            return null;
        }
        return axfVar;
    }

    private final String a() {
        synchronized (e) {
        }
        return null;
    }

    private static Dialog a(Context context, int i, bbg bbgVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(bbd.getErrorMessage(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String errorDialogButtonMessage = bbd.getErrorDialogButtonMessage(context, i);
        if (errorDialogButtonMessage != null) {
            builder.setPositiveButton(errorDialogButtonMessage, bbgVar);
        }
        String errorTitle = bbd.getErrorTitle(context, i);
        if (errorTitle != null) {
            builder.setTitle(errorTitle);
        }
        return builder.create();
    }

    private static void a(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof ln) {
            lu luVarC = ((ln) activity).c();
            arc arcVar = new arc();
            Dialog dialog2 = (Dialog) bdi.checkNotNull(dialog, "Cannot display null dialog");
            dialog2.setOnCancelListener(null);
            dialog2.setOnDismissListener(null);
            arcVar.X = dialog2;
            if (onCancelListener != null) {
                arcVar.Y = onCancelListener;
            }
            arcVar.a(luVarC, str);
            return;
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        aqa aqaVar = new aqa();
        Dialog dialog3 = (Dialog) bdi.checkNotNull(dialog, "Cannot display null dialog");
        dialog3.setOnCancelListener(null);
        dialog3.setOnDismissListener(null);
        aqaVar.a = dialog3;
        if (onCancelListener != null) {
            aqaVar.b = onCancelListener;
        }
        aqaVar.show(fragmentManager, str);
    }

    @TargetApi(20)
    public final void a(Context context, int i, String str, PendingIntent pendingIntent) {
        Notification notificationBuild;
        int i2;
        if (i == 18) {
            new aqe(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w(bbd.TAG, "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String errorNotificationTitle = bbd.getErrorNotificationTitle(context, i);
        String errorNotificationMessage = bbd.getErrorNotificationMessage(context, i);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        nu nuVar = new nu(context);
        nuVar.j = true;
        nuVar.q.flags |= 16;
        nuVar.d = nu.a(errorNotificationTitle);
        nt ntVar = new nt();
        ntVar.a = nu.a(errorNotificationMessage);
        nu nuVarA = nuVar.a(ntVar);
        if (bik.a(context)) {
            bdi.checkState(true);
            nuVarA.a(context.getApplicationInfo().icon).g = 2;
            if (bik.b(context)) {
                nuVarA.b.add(new ns(com.google.android.chimeraresources.R.drawable.common_full_open_on_phone, resources.getString(com.google.android.chimeraresources.R.string.common_open_on_phone), pendingIntent));
            } else {
                nuVarA.f = pendingIntent;
            }
        } else {
            nu nuVarA2 = nuVarA.a(R.drawable.stat_sys_warning);
            nuVarA2.q.tickerText = nu.a(resources.getString(com.google.android.chimeraresources.R.string.common_google_play_services_notification_ticker));
            nuVarA2.q.when = System.currentTimeMillis();
            nuVarA2.f = pendingIntent;
            nuVarA2.e = nu.a(errorNotificationMessage);
        }
        if (biw.d()) {
            bdi.checkState(biw.d());
            String strA = a();
            if (strA == null) {
                strA = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String defaultNotificationChannelName = bbd.getDefaultNotificationChannelName(context);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", defaultNotificationChannelName, 4));
                } else if (!defaultNotificationChannelName.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(defaultNotificationChannelName);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            nuVarA.n = strA;
        }
        nw nwVar = new nw(nuVarA);
        nv nvVar = nwVar.b.i;
        if (nvVar != null) {
            nvVar.a(nwVar);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            notificationBuild = nwVar.a.build();
        } else if (Build.VERSION.SDK_INT >= 24) {
            Notification notificationBuild2 = nwVar.a.build();
            if (nwVar.f != 0) {
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) != 0 && nwVar.f == 2) {
                    nw.a(notificationBuild2);
                }
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) == 0 && nwVar.f == 1) {
                    nw.a(notificationBuild2);
                }
            }
            notificationBuild = notificationBuild2;
        } else {
            nwVar.a.setExtras(nwVar.e);
            Notification notificationBuild3 = nwVar.a.build();
            if (nwVar.c != null) {
                notificationBuild3.contentView = nwVar.c;
            }
            if (nwVar.d != null) {
                notificationBuild3.bigContentView = nwVar.d;
            }
            if (nwVar.g != null) {
                notificationBuild3.headsUpContentView = nwVar.g;
            }
            if (nwVar.f != 0) {
                if (notificationBuild3.getGroup() != null && (notificationBuild3.flags & 512) != 0 && nwVar.f == 2) {
                    nw.a(notificationBuild3);
                }
                if (notificationBuild3.getGroup() != null && (notificationBuild3.flags & 512) == 0 && nwVar.f == 1) {
                    nw.a(notificationBuild3);
                }
            }
            notificationBuild = notificationBuild3;
        }
        if (nvVar != null) {
            nr.a(notificationBuild);
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                i2 = 10436;
                aqx.d.set(false);
                break;
            default:
                i2 = 39789;
                break;
        }
        if (str == null) {
            notificationManager.notify(i2, notificationBuild);
        } else {
            notificationManager.notify(str, i2, notificationBuild);
        }
    }
}
