package flm;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.widget.EnhancedNetworkImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cpl extends acr {
    public final EnhancedNetworkImageView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final ProgressBar k;

    public cpl(Context context) {
        super(context);
        a(getResources().getDimension(R.dimen.app_update_item_view_radius));
        b(getResources().getDimension(R.dimen.app_update_item_view_card_elevation));
        a(true);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        LayoutInflater.from(context).inflate(R.layout.view_app_update_item, this);
        this.g = (EnhancedNetworkImageView) findViewById(R.id.kidsetup_app_update_item_icon);
        this.h = (TextView) findViewById(R.id.kidsetup_app_update_item_title);
        this.i = (TextView) findViewById(R.id.kidsetup_app_update_item_developer);
        this.j = (TextView) findViewById(R.id.kidsetup_app_update_item_status);
        this.k = (ProgressBar) findViewById(R.id.kidsetup_app_update_item_progress);
    }
}
