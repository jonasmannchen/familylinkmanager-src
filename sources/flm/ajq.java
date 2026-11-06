package flm;

import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ajq extends LinkMovementMethod implements ajp {
    private boolean a = false;
    private MotionEvent b;

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        this.b = motionEvent;
        boolean zOnTouchEvent = super.onTouchEvent(textView, spannable, motionEvent);
        if (motionEvent.getAction() == 0) {
            this.a = Selection.getSelectionStart(spannable) != -1;
        } else {
            this.a = zOnTouchEvent;
        }
        return zOnTouchEvent;
    }

    @Override // flm.ajp
    public final MotionEvent a() {
        return this.b;
    }

    @Override // flm.ajp
    public final boolean b() {
        return this.a;
    }
}
