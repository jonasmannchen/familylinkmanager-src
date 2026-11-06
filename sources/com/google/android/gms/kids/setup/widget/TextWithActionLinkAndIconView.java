package com.google.android.gms.kids.setup.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.widget.TextViewWithActionLink;
import flm.coj;
import flm.eym;
import flm.eyo;
import flm.fec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class TextWithActionLinkAndIconView extends LinearLayout {
    private EnhancedNetworkImageView a;
    private TextViewWithActionLink b;

    public TextWithActionLinkAndIconView(Context context) {
        this(context, null);
    }

    public TextWithActionLinkAndIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextWithActionLinkAndIconView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TextWithActionLinkAndIconView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setOrientation(0);
        View.inflate(context, R.layout.view_text_with_action_link_and_icon, this);
        this.a = (EnhancedNetworkImageView) findViewById(R.id.kidsetup_icon);
        this.b = (TextViewWithActionLink) findViewById(R.id.kidsetup_text_with_action_link);
    }

    public final TextWithActionLinkAndIconView a(fec fecVar) {
        eym eymVar;
        eym eymVar2;
        eym eymVar3;
        if (fecVar.e == null) {
            eymVar = eym.d;
        } else {
            eymVar = fecVar.e;
        }
        if ((eymVar.a & 1) == 1) {
            EnhancedNetworkImageView enhancedNetworkImageView = this.a;
            if (fecVar.e == null) {
                eymVar2 = eym.d;
            } else {
                eymVar2 = fecVar.e;
            }
            coj.a(enhancedNetworkImageView, eymVar2.b);
            if (fecVar.e == null) {
                eymVar3 = eym.d;
            } else {
                eymVar3 = fecVar.e;
            }
            eyo eyoVarA = eyo.a(eymVar3.c);
            if (eyoVarA == null) {
                eyoVarA = eyo.UNKNOWN_ICON_TYPE;
            }
            if (eyoVarA == eyo.SYSTEM) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.a.getLayoutParams();
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.consent_info_system_icon_size);
                layoutParams.width = dimensionPixelSize;
                layoutParams.height = dimensionPixelSize;
                layoutParams.rightMargin = getResources().getDimensionPixelSize(R.dimen.consent_info_system_icon_right_margin);
                this.b.a(getResources().getDimensionPixelSize(R.dimen.consent_info_system_baseline_to_top), getResources().getDimensionPixelSize(R.dimen.consent_info_system_baseline_to_bottom));
                this.a.setLayoutParams(layoutParams);
                if (Build.VERSION.SDK_INT < 23) {
                    this.b.setTextAppearance(getContext(), R.style.TextAppearance_AppCompat_Subhead);
                } else {
                    this.b.setTextAppearance(R.style.TextAppearance_AppCompat_Subhead);
                }
            } else {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.a.getLayoutParams();
                int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.consent_info_product_icon_size);
                layoutParams2.width = dimensionPixelSize2;
                layoutParams2.height = dimensionPixelSize2;
                layoutParams2.rightMargin = getResources().getDimensionPixelSize(R.dimen.consent_info_product_icon_right_margin);
                this.a.setLayoutParams(layoutParams2);
            }
            this.a.setVisibility(0);
        } else {
            this.a.setVisibility(8);
        }
        if ((fecVar.a & 2) == 2 && (fecVar.a & 4) == 4) {
            this.b.a(fecVar.c, fecVar.d, null);
        }
        this.b.setText(fecVar.b);
        return this;
    }
}
