package flm;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class vs {
    public final Context a;
    public final LayoutInflater b;
    public Drawable c;
    public CharSequence d;
    public View e;
    public CharSequence f;
    public CharSequence g;
    public DialogInterface.OnClickListener h;
    public CharSequence i;
    public DialogInterface.OnClickListener j;
    public CharSequence k;
    public DialogInterface.OnClickListener l;
    public DialogInterface.OnKeyListener n;
    public ListAdapter o;
    public DialogInterface.OnClickListener p;
    public int q;
    public View r;
    private int u = 0;
    private int v = 0;
    public boolean s = false;
    public int t = -1;
    public boolean m = true;

    public vs(Context context) {
        this.a = context;
        this.b = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
