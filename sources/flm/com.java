package flm;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class com {
    public static void a(Context context, TextView textView, View.OnClickListener onClickListener) {
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(textView.getText()).append(' ').append(context.getString(R.string.common_learn_more), new con(onClickListener), 0);
        if (!(textView.getMovementMethod() instanceof LinkMovementMethod)) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        textView.setText(spannableStringBuilderAppend);
        bss.a(textView);
    }
}
