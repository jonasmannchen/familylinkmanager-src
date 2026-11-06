package flm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.chimeraresources.R;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cjo extends ArrayAdapter {
    cjo(Context context, List list) {
        super(context, 0, list);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) (view instanceof TextView ? view : LayoutInflater.from(getContext()).inflate(R.layout.view_cant_add_account_list_item, viewGroup, false));
        textView.setText(coh.a((CharSequence) getItem(i), textView.getCurrentTextColor()));
        return textView;
    }
}
