package flm;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.geller.AboutSupervisionExitFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class clz extends ClickableSpan {
    private final View.OnClickListener a;
    private final /* synthetic */ AboutSupervisionExitFragment b;

    public clz(AboutSupervisionExitFragment aboutSupervisionExitFragment, View.OnClickListener onClickListener) {
        this.b = aboutSupervisionExitFragment;
        this.a = onClickListener;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.b.a(R.color.quantum_googblue));
        textPaint.setUnderlineText(false);
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.onClick(view);
    }
}
