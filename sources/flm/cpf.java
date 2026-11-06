package flm;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.widget.EnhancedNetworkImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cpf extends FrameLayout {
    public final EnhancedNetworkImageView a;
    public final TextView b;
    public final ImageButton c;

    public cpf(Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View.inflate(context, R.layout.view_app_selector_header, this);
        this.a = (EnhancedNetworkImageView) findViewById(R.id.kidsetup_app_selector_header_rating_icon);
        this.b = (TextView) findViewById(R.id.kidsetup_app_selector_header_title);
        this.c = (ImageButton) findViewById(R.id.kidsetup_app_selector_header_info_button);
    }
}
