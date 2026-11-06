package flm;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.google.android.gms.kids.setup.widget.TextWithActionLinkAndIconView;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cqb extends ArrayAdapter {
    public cqb(Context context, List list) {
        super(context, 0, list);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextWithActionLinkAndIconView textWithActionLinkAndIconView = new TextWithActionLinkAndIconView(getContext());
        textWithActionLinkAndIconView.a((fec) getItem(i));
        return textWithActionLinkAndIconView;
    }
}
