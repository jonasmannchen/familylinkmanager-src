package flm;

import android.support.v7.widget.ActionBarContextView;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aan implements View.OnClickListener {
    private final /* synthetic */ yg a;

    public aan(ActionBarContextView actionBarContextView, yg ygVar) {
        this.a = ygVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.c();
    }
}
