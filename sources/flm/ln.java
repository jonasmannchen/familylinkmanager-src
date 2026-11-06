package flm;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ln extends oj implements bm {
    public boolean c;
    public int d;
    public sp e;
    private bl f;
    private boolean g;
    private boolean h;
    public final Handler a = new lo(this);
    public final ls b = new ls(new lp(this));
    private boolean i = true;

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.b.a();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String str = (String) this.e.a(i4, null);
            sp spVar = this.e;
            int iA = rx.a(spVar.c, spVar.e, i4);
            if (iA >= 0 && spVar.d[iA] != sp.a) {
                spVar.d[iA] = sp.a;
                spVar.b = true;
            }
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            lg lgVarA = this.b.a(str);
            if (lgVarA == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + str);
                return;
            } else {
                lgVarA.a(65535 & i, i2, intent);
                return;
            }
        }
        la laVarA = kz.a();
        if (laVarA == null || !laVarA.a()) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        lw lwVar = this.b.a.d;
        boolean zD = lwVar.d();
        if (!zD || Build.VERSION.SDK_INT > 25) {
            if (zD || !lwVar.b()) {
                super.onBackPressed();
            }
        }
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.b.a.d.b(z);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.b.a.d.c(z);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.b.a();
        this.b.a.d.a(configuration);
    }

    @Override // flm.bm
    public final bl d() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f == null) {
            lq lqVar = (lq) getLastNonConfigurationInstance();
            if (lqVar != null) {
                this.f = lqVar.a;
            }
            if (this.f == null) {
                this.f = new bl();
            }
        }
        return this.f;
    }

    @Override // flm.oj, android.app.Activity
    public void onCreate(Bundle bundle) {
        ls lsVar = this.b;
        lsVar.a.d.a(lsVar.a, lsVar.a, (lg) null);
        super.onCreate(bundle);
        lq lqVar = (lq) getLastNonConfigurationInstance();
        if (lqVar != null && lqVar.a != null && this.f == null) {
            this.f = lqVar.a;
        }
        if (bundle != null) {
            this.b.a.d.a(bundle.getParcelable("android:support:fragments"), lqVar != null ? lqVar.b : null);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.d = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.e = new sp(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.e.b(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.e == null) {
            this.e = new sp();
            this.d = 0;
        }
        this.b.a.d.l();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean zOnCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        ls lsVar = this.b;
        return zOnCreatePanelMenu | lsVar.a.d.a(menu, getMenuInflater());
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewA = a(view, str, context, attributeSet);
        if (viewA == null) {
            return super.onCreateView(view, str, context, attributeSet);
        }
        return viewA;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewA = a(null, str, context, attributeSet);
        if (viewA == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return viewA;
    }

    private final View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.b.a.d.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f != null && !isChangingConfigurations()) {
            this.f.a();
        }
        this.b.a.d.q();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.b.a.d.r();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return this.b.a.d.a(menuItem);
            case 6:
                return this.b.a.d.b(menuItem);
            default:
                return false;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                this.b.a.d.b(menu);
                break;
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.h = false;
        if (this.a.hasMessages(2)) {
            this.a.removeMessages(2);
            this.b.a.d.o();
        }
        this.b.a.d.b(3);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.b.a();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.b.a();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.a.sendEmptyMessage(2);
        this.h = true;
        this.b.b();
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.a.removeMessages(2);
        this.b.a.d.o();
        this.b.b();
    }

    protected final void a() {
        this.b.a.d.o();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return (i != 0 || menu == null) ? super.onPreparePanel(i, view, menu) : super.onPreparePanel(0, view, menu) | this.b.a.d.a(menu);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        lw lwVar = this.b.a.d;
        lw.a(lwVar.l);
        mn mnVar = lwVar.l;
        if (mnVar == null && this.f == null) {
            return null;
        }
        lq lqVar = new lq();
        lqVar.a = this.f;
        lqVar.b = mnVar;
        return lqVar;
    }

    @Override // flm.oj, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        e();
        Parcelable parcelableI = this.b.a.d.i();
        if (parcelableI != null) {
            bundle.putParcelable("android:support:fragments", parcelableI);
        }
        if (this.e.c() > 0) {
            bundle.putInt("android:support:next_request_index", this.d);
            int[] iArr = new int[this.e.c()];
            String[] strArr = new String[this.e.c()];
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.e.c()) {
                    iArr[i2] = this.e.a(i2);
                    strArr[i2] = (String) this.e.b(i2);
                    i = i2 + 1;
                } else {
                    bundle.putIntArray("android:support:request_indicies", iArr);
                    bundle.putStringArray("android:support:request_fragment_who", strArr);
                    return;
                }
            }
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.i = false;
        if (!this.g) {
            this.g = true;
            this.b.a.d.m();
        }
        this.b.a();
        this.b.b();
        this.b.a.d.n();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.i = true;
        e();
        this.b.a.d.p();
    }

    @Deprecated
    public void b() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.g);
        printWriter.print(" mResumed=");
        printWriter.print(this.h);
        printWriter.print(" mStopped=");
        printWriter.print(this.i);
        if (getApplication() != null) {
            nk.a(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.b.a.d.a(str, fileDescriptor, printWriter, strArr);
    }

    public final lu c() {
        return this.b.a.d;
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        if (!this.c && i != -1) {
            a(i);
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!this.c && i != -1) {
            a(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (i != -1) {
            a(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i != -1) {
            a(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    static void a(int i) {
        if (((-65536) & i) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.b.a();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String str = (String) this.e.a(i3, null);
            sp spVar = this.e;
            int iA = rx.a(spVar.c, spVar.e, i3);
            if (iA >= 0 && spVar.d[iA] != sp.a) {
                spVar.d[iA] = sp.a;
                spVar.b = true;
            }
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            } else if (this.b.a(str) == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + str);
            } else {
                lg.n();
            }
        }
    }

    private final void e() {
        while (a(c(), z.CREATED)) {
        }
    }

    private static boolean a(lu luVar, z zVar) {
        boolean zA = false;
        for (lg lgVar : luVar.c()) {
            if (lgVar != null) {
                if (lgVar.getLifecycle().a().a(z.STARTED)) {
                    lgVar.T.a(zVar);
                    zA = true;
                }
                lw lwVar = lgVar.v;
                zA = lwVar != null ? a(lwVar, zVar) | zA : zA;
            }
        }
        return zA;
    }
}
