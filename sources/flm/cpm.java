package flm;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.widget.EnhancedNetworkImageView;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cpm extends FrameLayout {
    private final EnhancedNetworkImageView a;
    private final TextView b;
    private final TextView c;

    public cpm(Context context) {
        this(context, null);
    }

    private cpm(Context context, AttributeSet attributeSet) {
        super(context, null);
        View.inflate(context, R.layout.view_generic_device, this);
        this.a = (EnhancedNetworkImageView) findViewById(R.id.generic_device_view_avatar);
        this.b = (TextView) findViewById(R.id.generic_device_view_name);
        this.c = (TextView) findViewById(R.id.generic_device_view_secondary);
        this.a.setDefaultImageResId(R.drawable.quantum_ic_device_unknown_grey600_48);
        coj.a(this.a, (String) null);
    }

    public final cpm a(String str) {
        this.b.setText(str);
        return this;
    }

    public final cpm a(long j) {
        if (j == 0) {
            this.c.setText((CharSequence) null);
        } else {
            String string = getContext().getString(R.string.last_online_message, DateFormat.getDateInstance(2, Locale.getDefault()).format(new Date(j)));
            this.c.setText(string);
            if (TextUtils.isEmpty(string)) {
                this.c.setVisibility(8);
            } else {
                this.c.setVisibility(0);
            }
        }
        return this;
    }

    public final cpm b(String str) {
        coj.a(this.a, str);
        return this;
    }
}
