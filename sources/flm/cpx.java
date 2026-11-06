package flm;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.widget.TextWithActionLinkAndIconView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cpx extends LinearLayout {
    public final TextWithActionLinkAndIconView a;
    public final ImageView b;
    public final LinearLayout c;

    public cpx(Context context) {
        this(context, null);
    }

    private cpx(Context context, AttributeSet attributeSet) {
        super(context, null);
        setOrientation(1);
        View.inflate(context, R.layout.view_secondary_account_consent_section, this);
        this.a = (TextWithActionLinkAndIconView) findViewById(R.id.kidsetup_secondary_account_consent_section_text);
        this.b = (ImageView) findViewById(R.id.kidsetup_secondary_account_consent_list_button);
        this.c = (LinearLayout) findViewById(R.id.kidsetup_secondary_account_consent_subsections);
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: flm.cpy
            private final cpx a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a();
            }
        });
    }

    public final void a(boolean z) {
        int i;
        int i2;
        if (z) {
            this.c.setVisibility(0);
            measureChildren(-1, -2);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, this.c.getMeasuredHeight());
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: flm.cpz
                private final cpx a;

                {
                    this.a = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    cpx cpxVar = this.a;
                    cpxVar.c.getLayoutParams().height = valueAnimator.getAnimatedFraction() == 1.0f ? -2 : ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    cpxVar.c.requestLayout();
                }
            });
            valueAnimatorOfInt.start();
        } else {
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(this.c.getMeasuredHeight(), 0);
            valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: flm.cqa
                private final cpx a;

                {
                    this.a = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    cpx cpxVar = this.a;
                    if (valueAnimator.getAnimatedFraction() == 1.0f) {
                        cpxVar.c.setVisibility(8);
                        return;
                    }
                    cpxVar.c.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    cpxVar.c.requestLayout();
                }
            });
            valueAnimatorOfInt2.start();
        }
        ImageView imageView = this.b;
        Context context = getContext();
        if (z) {
            i = R.string.cd_common_list_button_collapse;
        } else {
            i = R.string.cd_common_list_button_expand;
        }
        imageView.setContentDescription(context.getString(i));
        ImageView imageView2 = this.b;
        if (z) {
            i2 = R.drawable.quantum_ic_expand_less_grey600_24;
        } else {
            i2 = R.drawable.quantum_ic_expand_more_grey600_24;
        }
        imageView2.setImageResource(i2);
    }

    final /* synthetic */ void a() {
        a(this.c.getVisibility() == 8);
    }
}
