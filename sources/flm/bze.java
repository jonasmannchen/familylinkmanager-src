package flm;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.chimera.Fragment;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bze extends agm {
    public final Fragment p;
    public final View q;
    public final ImageView r;
    public final TextView s;

    bze(Fragment fragment, View view) {
        super(view);
        this.p = fragment;
        this.q = view.findViewById(R.id.kids_time_limit_whitelist_app_item_container);
        this.r = (ImageView) view.findViewById(R.id.kids_time_limit_whitelist_app_item_icon);
        this.s = (TextView) view.findViewById(R.id.kids_time_limit_whitelist_app_item_title);
    }
}
