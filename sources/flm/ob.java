package flm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ob implements ServiceConnection, Handler.Callback {
    public final Handler a;
    private final Context b;
    private final Map d = new HashMap();
    private Set e = new HashSet();
    private final HandlerThread c = new HandlerThread("NotificationManagerCompat");

    ob(Context context) {
        this.b = context;
        this.c.start();
        this.a = new Handler(this.c.getLooper(), this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ni njVar;
        switch (message.what) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                od odVar = (od) message.obj;
                Set setA = ny.a(this.b);
                if (!setA.equals(this.e)) {
                    this.e = setA;
                    List<ResolveInfo> listQueryIntentServices = this.b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                    HashSet<ComponentName> hashSet = new HashSet();
                    for (ResolveInfo resolveInfo : listQueryIntentServices) {
                        if (setA.contains(resolveInfo.serviceInfo.packageName)) {
                            ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                            if (resolveInfo.serviceInfo.permission != null) {
                                Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                            } else {
                                hashSet.add(componentName);
                            }
                        }
                    }
                    for (ComponentName componentName2 : hashSet) {
                        if (!this.d.containsKey(componentName2)) {
                            this.d.put(componentName2, new oc(componentName2));
                        }
                    }
                    Iterator it = this.d.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (!hashSet.contains(entry.getKey())) {
                            a((oc) entry.getValue());
                            it.remove();
                        }
                    }
                }
                for (oc ocVar : this.d.values()) {
                    ocVar.d.add(odVar);
                    c(ocVar);
                }
                return true;
            case 1:
                oa oaVar = (oa) message.obj;
                ComponentName componentName3 = oaVar.a;
                IBinder iBinder = oaVar.b;
                oc ocVar2 = (oc) this.d.get(componentName3);
                if (ocVar2 != null) {
                    if (iBinder == null) {
                        njVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof ni)) {
                            njVar = (ni) iInterfaceQueryLocalInterface;
                        } else {
                            njVar = new nj(iBinder);
                        }
                    }
                    ocVar2.c = njVar;
                    ocVar2.e = 0;
                    c(ocVar2);
                }
                return true;
            case 2:
                oc ocVar3 = (oc) this.d.get((ComponentName) message.obj);
                if (ocVar3 != null) {
                    a(ocVar3);
                }
                return true;
            case 3:
                oc ocVar4 = (oc) this.d.get((ComponentName) message.obj);
                if (ocVar4 != null) {
                    c(ocVar4);
                }
                return true;
            default:
                return false;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.obtainMessage(1, new oa(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.obtainMessage(2, componentName).sendToTarget();
    }

    private final void a(oc ocVar) {
        if (ocVar.b) {
            this.b.unbindService(this);
            ocVar.b = false;
        }
        ocVar.c = null;
    }

    private final void b(oc ocVar) {
        if (!this.a.hasMessages(3, ocVar.a)) {
            ocVar.e++;
            if (ocVar.e > 6) {
                Log.w("NotifManCompat", "Giving up on delivering " + ocVar.d.size() + " tasks to " + ocVar.a + " after " + ocVar.e + " retries");
                ocVar.d.clear();
            } else {
                this.a.sendMessageDelayed(this.a.obtainMessage(3, ocVar.a), (1 << (ocVar.e - 1)) * 1000);
            }
        }
    }

    private final void c(oc ocVar) {
        boolean z;
        if (!ocVar.d.isEmpty()) {
            if (ocVar.b) {
                z = true;
            } else {
                ocVar.b = this.b.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(ocVar.a), this, 33);
                if (ocVar.b) {
                    ocVar.e = 0;
                } else {
                    Log.w("NotifManCompat", "Unable to bind to listener " + ocVar.a);
                    this.b.unbindService(this);
                }
                z = ocVar.b;
            }
            if (!z || ocVar.c == null) {
                b(ocVar);
                return;
            }
            while (true) {
                od odVar = (od) ocVar.d.peek();
                if (odVar == null) {
                    break;
                }
                try {
                    odVar.a(ocVar.c);
                    ocVar.d.remove();
                } catch (DeadObjectException e) {
                } catch (RemoteException e2) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + ocVar.a, e2);
                }
            }
            if (!ocVar.d.isEmpty()) {
                b(ocVar);
            }
        }
    }
}
