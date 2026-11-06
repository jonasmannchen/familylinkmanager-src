package flm;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.widget.EnhancedNetworkImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class coz extends DialogFragment {
    private ewz a;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            this.a = (ewz) fin.b(ewz.g, getArguments().getByteArray("display_category"));
        } catch (fjg e) {
            throw new IllegalStateException(e);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        View viewInflate = getLayoutInflater(bundle).inflate(R.layout.view_app_category_dialog, (ViewGroup) null, false);
        ((TextView) viewInflate.findViewById(R.id.kidsetup_app_category_title)).setText(this.a.d);
        ((TextView) viewInflate.findViewById(R.id.kidsetup_app_category_description)).setText(this.a.e);
        EnhancedNetworkImageView enhancedNetworkImageView = (EnhancedNetworkImageView) viewInflate.findViewById(R.id.kidsetup_app_category_icon);
        if (TextUtils.isEmpty(this.a.f)) {
            enhancedNetworkImageView.setVisibility(8);
        } else {
            enhancedNetworkImageView.setVisibility(0);
            coj.a(enhancedNetworkImageView, this.a.f);
        }
        return new vx(getActivity()).a(viewInflate).a(R.string.common_got_it, null).a();
    }
}
