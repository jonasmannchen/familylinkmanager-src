package flm;

import android.R;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aho implements View.OnClickListener {
    private final yt a;
    private final /* synthetic */ ahn b;

    aho(ahn ahnVar) {
        this.b = ahnVar;
        this.a = new yt(this.b.a.getContext(), 0, R.id.home, 0, 0, this.b.b);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b.c != null && this.b.d) {
            this.b.c.onMenuItemSelected(0, this.a);
        }
    }
}
