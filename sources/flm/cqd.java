package flm;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.Fragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cqd extends DialogFragment implements DialogInterface.OnClickListener {
    public cqg a;
    private cqi b;

    public static cqh a(Fragment fragment) {
        return new cqh(fragment.getChildFragmentManager());
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        vx vxVar = new vx(getActivity());
        if (arguments.getInt("title_id", 0) != 0) {
            vxVar.a(arguments.getInt("title_id"));
        }
        CharSequence charSequenceA = a().a();
        if (!TextUtils.isEmpty(charSequenceA)) {
            vxVar.a(charSequenceA);
        } else {
            int i = arguments.getInt("message_id", 0);
            if (i != 0) {
                vxVar.a.f = vxVar.a.a.getText(i);
            }
        }
        int i2 = arguments.getInt("positive_button_text_id", 0);
        if (i2 != 0) {
            vxVar.a(i2, this);
        }
        int i3 = arguments.getInt("negative_button_text_id", 0);
        if (i3 != 0) {
            vxVar.b(i3, this);
        }
        int i4 = arguments.getInt("neutral_button_text_id", 0);
        if (i4 != 0) {
            vxVar.a.k = vxVar.a.a.getText(i4);
            vxVar.a.l = this;
        }
        vxVar.a.m = arguments.getBoolean("cancelable", true);
        vw vwVarA = vxVar.a();
        vwVarA.setCanceledOnTouchOutside(arguments.getBoolean("canceled_on_touch_outside", false));
        return vwVarA;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case -3:
                a();
                break;
            case -2:
                a().c();
                break;
            case -1:
                a().b();
                break;
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        a().d();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        a();
    }

    private final cqg a() {
        if (this.b == null) {
            if (getParentFragment() instanceof cqi) {
                this.b = getParentFragment();
            } else if (getActivity() instanceof cqi) {
                this.b = getActivity();
            } else {
                this.a = new cqf();
                this.b = new cqi(this) { // from class: flm.cqe
                    private final cqd a;

                    {
                        this.a = this;
                    }

                    @Override // flm.cqi
                    public final cqg f_() {
                        return this.a.a;
                    }
                };
            }
        }
        return this.b.f_();
    }
}
