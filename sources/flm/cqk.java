package flm;

import android.content.Intent;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.gms.kids.widget.TextViewWithActionLink;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cqk extends ClickableSpan {
    private final /* synthetic */ Intent a;
    private final /* synthetic */ TextViewWithActionLink b;

    public cqk(TextViewWithActionLink textViewWithActionLink, Intent intent) {
        this.b = textViewWithActionLink;
        this.a = intent;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.getContext().sendBroadcast(this.a);
    }
}
