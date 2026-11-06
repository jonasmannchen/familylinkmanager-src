package flm;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.widget.EnhancedNetworkImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cph extends FrameLayout {
    public final EnhancedNetworkImageView a;
    public final TextView b;
    public final TextView c;
    public final ViewGroup d;
    public final Switch e;
    public final ImageView f;

    public cph(Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View.inflate(context, R.layout.view_app_selector_row, this);
        this.a = (EnhancedNetworkImageView) findViewById(R.id.kidsetup_app_selector_row_app_icon);
        this.b = (TextView) findViewById(R.id.kidsetup_app_selector_row_app_title);
        this.c = (TextView) findViewById(R.id.kidsetup_app_selector_row_app_sub_title);
        this.d = (ViewGroup) findViewById(R.id.kidsetup_app_selector_row_switch_container);
        this.e = (Switch) findViewById(R.id.kidsetup_app_selector_row_app_switch);
        this.f = (ImageView) findViewById(R.id.kidsetup_app_selector_row_setting_gear);
        this.f.setImageResource(R.drawable.kidsetup_ic_settings);
    }
}
