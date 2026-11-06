package flm;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.widget.EnhancedNetworkImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cpe extends FrameLayout {
    public final EnhancedNetworkImageView a;
    public final TextView b;
    public final TextView c;

    public cpe(Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View.inflate(context, R.layout.view_app_permission_item, this);
        this.a = (EnhancedNetworkImageView) findViewById(R.id.kidsetup_app_permission_item_icon);
        this.b = (TextView) findViewById(R.id.kidsetup_app_permission_item_title);
        this.c = (TextView) findViewById(R.id.kidsetup_app_permission_item_description);
    }
}
