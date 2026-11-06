package flm;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cmj extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        exj exjVar;
        exm exmVar;
        KidSetupViewModel kidSetupViewModel = (KidSetupViewModel) cin.a(getActivity()).a(KidSetupViewModel.class);
        View viewInflate = getLayoutInflater(bundle).inflate(R.layout.allow_supervision_dialog, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.allow_supervision_dialog_heading);
        Object[] objArr = new Object[1];
        cij cijVarD = kidSetupViewModel.d();
        if (cijVarD.h == null) {
            exjVar = exj.g;
        } else {
            exjVar = cijVarD.h;
        }
        if (exjVar.d == null) {
            exmVar = exm.h;
        } else {
            exmVar = exjVar.d;
        }
        objArr[0] = exmVar.c;
        textView.setText(getString(R.string.allow_supervision_title, objArr));
        viewInflate.findViewById(R.id.allow_supervision_button).setOnClickListener(new View.OnClickListener(this) { // from class: flm.cmk
            private final cmj a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a().i();
            }
        });
        viewInflate.findViewById(R.id.dont_allow_supervision_button).setOnClickListener(new View.OnClickListener(this) { // from class: flm.cml
            private final cmj a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cmj cmjVar = this.a;
                cmjVar.a().a(cmjVar);
            }
        });
        eu euVar = new eu(getActivity());
        euVar.setCancelable(true);
        euVar.setCanceledOnTouchOutside(true);
        euVar.setContentView(viewInflate);
        return euVar;
    }

    final cmm a() {
        cmm parentFragment = getParentFragment();
        dvl.b(parentFragment instanceof cmm);
        return parentFragment;
    }
}
