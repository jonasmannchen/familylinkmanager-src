package flm;

import android.widget.TextView;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.geller.AboutSupervisionExitFragment;
import com.google.android.gms.kids.setup.widget.EnhancedNetworkImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cly extends cgw {
    private final /* synthetic */ AboutSupervisionExitFragment a;

    public cly(AboutSupervisionExitFragment aboutSupervisionExitFragment) {
        this.a = aboutSupervisionExitFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        btv.c("MemberSpvsn", exc, "Failed to retrieve the supervised account info", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final /* synthetic */ void b(Object obj) {
        buh buhVar = (buh) obj;
        ((TextView) this.a.g.findViewById(R.id.about_supervision_exit_user_email)).setText(buhVar.b);
        EnhancedNetworkImageView enhancedNetworkImageView = (EnhancedNetworkImageView) this.a.g.findViewById(R.id.about_supervision_exit_user_avatar);
        enhancedNetworkImageView.setDefaultImageResId(R.drawable.product_logo_avatar_circle_blue_color_24);
        coj.a(enhancedNetworkImageView, coj.a(buhVar.e));
        this.a.g.findViewById(R.id.about_supervision_exit_user_content).setVisibility(0);
    }
}
