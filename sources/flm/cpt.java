package flm;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cpt extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        View viewInflate = getLayoutInflater(bundle).inflate(R.layout.perma_lock_disclaimer_dialog, (ViewGroup) null);
        viewInflate.findViewById(R.id.kid_setup_perma_lock_dialog_back_button).setOnClickListener(new View.OnClickListener(this) { // from class: flm.cpu
            private final cpt a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cpt cptVar = this.a;
                cptVar.a().a(cptVar);
            }
        });
        viewInflate.findViewById(R.id.kid_setup_perma_lock_dialog_i_understand_button).setOnClickListener(new View.OnClickListener(this) { // from class: flm.cpv
            private final cpt a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cpt cptVar = this.a;
                cptVar.a().b(cptVar);
            }
        });
        eu euVar = new eu(getActivity());
        euVar.setCancelable(true);
        euVar.setContentView(viewInflate);
        return euVar;
    }

    final cpw a() {
        cpw parentFragment = getParentFragment();
        dvl.b(parentFragment instanceof cpw);
        return parentFragment;
    }
}
