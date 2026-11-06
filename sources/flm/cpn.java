package flm;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.widget.EnhancedNetworkImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cpn extends acr {
    public final EnhancedNetworkImageView g;
    public final TextView h;
    public final TextView i;

    public cpn(Context context) {
        super(context);
        a(getResources().getDimension(R.dimen.app_update_item_view_radius));
        b(getResources().getDimension(R.dimen.app_update_item_view_card_elevation));
        a(true);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        LayoutInflater.from(context).inflate(R.layout.view_failed_to_hide_app_item, this);
        this.g = (EnhancedNetworkImageView) findViewById(R.id.kidsetup_failed_to_hide_item_icon);
        this.h = (TextView) findViewById(R.id.kidsetup_failed_to_hide_item_title);
        this.i = (TextView) findViewById(R.id.kidsetup_failed_to_hide_item_developer);
    }
}
