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
public final class cpo extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        View viewInflate = getLayoutInflater(bundle).inflate(R.layout.view_get_youtube_kids_dialog, (ViewGroup) null, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.kidsetup_get_youtube_kids_message);
        cij cijVarD = ((KidSetupViewModel) cin.a(getActivity()).a(KidSetupViewModel.class)).d();
        exj exjVar = cijVarD.h == null ? exj.g : cijVarD.h;
        exm exmVar = exjVar.d == null ? exm.h : exjVar.d;
        exo exoVarA = exo.a(exmVar.g);
        if (exoVarA == null) {
            exoVarA = exo.UNKNOWN_GENDER;
        }
        textView.setText(getString(coi.a(exoVarA, R.string.kidsetup_get_youtube_kids_dialog_message_male, R.string.kidsetup_get_youtube_kids_dialog_message_female, R.string.kidsetup_get_youtube_kids_dialog_message_other), new Object[]{exmVar.c}));
        return new vx(getActivity()).a(viewInflate).b(R.string.close_button_label, null).a();
    }
}
