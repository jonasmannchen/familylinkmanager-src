package flm;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class lf extends lg implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private int X = 0;
    private int Y = 0;
    private boolean Z = true;
    public boolean a = true;
    private int aa = -1;
    private Dialog ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;

    public void a(lu luVar, String str) {
        this.ad = false;
        this.ae = true;
        ms msVarA = luVar.a();
        msVarA.a(this, str);
        msVarA.a();
    }

    @Override // flm.lg
    public final void a(Context context) {
        super.a(context);
        if (!this.ae) {
            this.ad = false;
        }
    }

    @Override // flm.lg
    public final void e() {
        super.e();
        if (!this.ae && !this.ad) {
            this.ad = true;
        }
    }

    @Override // flm.lg
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.a = this.A == 0;
        if (bundle != null) {
            this.X = bundle.getInt("android:style", 0);
            this.Y = bundle.getInt("android:theme", 0);
            this.Z = bundle.getBoolean("android:cancelable", true);
            this.a = bundle.getBoolean("android:showsDialog", this.a);
            this.aa = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // flm.lg
    public final LayoutInflater b(Bundle bundle) {
        if (!this.a) {
            return super.b(bundle);
        }
        this.ab = f();
        if (this.ab != null) {
            Dialog dialog = this.ab;
            switch (this.X) {
                case 3:
                    dialog.getWindow().addFlags(24);
                case 1:
                case 2:
                    dialog.requestWindowFeature(1);
                    break;
            }
            return (LayoutInflater) this.ab.getContext().getSystemService("layout_inflater");
        }
        return (LayoutInflater) this.u.b.getSystemService("layout_inflater");
    }

    public Dialog f() {
        return new Dialog(k(), this.Y);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.ac && !this.ad) {
            this.ad = true;
            this.ae = false;
            if (this.ab != null) {
                this.ab.dismiss();
            }
            this.ac = true;
            if (this.aa >= 0) {
                this.t.a(this.aa, 1);
                this.aa = -1;
            } else {
                ms msVarA = this.t.a();
                msVarA.a(this);
                msVarA.b();
            }
        }
    }

    @Override // flm.lg
    public final void c(Bundle bundle) {
        Bundle bundle2;
        super.c(bundle);
        if (this.a) {
            View view = this.K;
            if (view != null) {
                if (view.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.ab.setContentView(view);
            }
            ln lnVarK = k();
            if (lnVarK != null) {
                this.ab.setOwnerActivity(lnVarK);
            }
            this.ab.setCancelable(this.Z);
            this.ab.setOnCancelListener(this);
            this.ab.setOnDismissListener(this);
            if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
                this.ab.onRestoreInstanceState(bundle2);
            }
        }
    }

    @Override // flm.lg
    public final void g() {
        super.g();
        if (this.ab != null) {
            this.ac = false;
            this.ab.show();
        }
    }

    @Override // flm.lg
    public final void d(Bundle bundle) {
        Bundle bundleOnSaveInstanceState;
        super.d(bundle);
        if (this.ab != null && (bundleOnSaveInstanceState = this.ab.onSaveInstanceState()) != null) {
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        if (this.X != 0) {
            bundle.putInt("android:style", this.X);
        }
        if (this.Y != 0) {
            bundle.putInt("android:theme", this.Y);
        }
        if (!this.Z) {
            bundle.putBoolean("android:cancelable", this.Z);
        }
        if (!this.a) {
            bundle.putBoolean("android:showsDialog", this.a);
        }
        if (this.aa != -1) {
            bundle.putInt("android:backStackId", this.aa);
        }
    }

    @Override // flm.lg
    public final void i_() {
        super.i_();
        if (this.ab != null) {
            this.ab.hide();
        }
    }

    @Override // flm.lg
    public final void h() {
        super.h();
        if (this.ab != null) {
            this.ac = true;
            this.ab.dismiss();
            this.ab = null;
        }
    }
}
