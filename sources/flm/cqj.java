package flm;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.widget.TextViewWithActionLink;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cqj extends LinkMovementMethod {
    private final /* synthetic */ Context a;
    private final /* synthetic */ TextViewWithActionLink b;

    public cqj(TextViewWithActionLink textViewWithActionLink, Context context) {
        this.b = textViewWithActionLink;
        this.a = context;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getAction() == 1) {
            TextViewWithActionLink textViewWithActionLink = this.b;
            Context context = this.a;
            URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
            int length = uRLSpanArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                }
                if (new Intent("android.intent.action.VIEW", Uri.parse(uRLSpanArr[i].getURL())).resolveActivity(context.getPackageManager()) == null) {
                    z = false;
                    break;
                }
                i++;
            }
            if (!z) {
                Snackbar.a(textView, R.string.no_intent_handler_app_found_message, -1).e();
                return true;
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
