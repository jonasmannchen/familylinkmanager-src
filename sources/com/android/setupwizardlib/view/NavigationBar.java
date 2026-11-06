package com.android.setupwizardlib.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class NavigationBar extends LinearLayout implements View.OnClickListener {
    public Button a;
    public Button b;
    public Button c;

    private static Context a(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.suwNavBarTheme, android.R.attr.colorForeground, android.R.attr.colorBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId == 0) {
            float[] fArr = new float[3];
            float[] fArr2 = new float[3];
            Color.colorToHSV(typedArrayObtainStyledAttributes.getColor(1, 0), fArr);
            Color.colorToHSV(typedArrayObtainStyledAttributes.getColor(2, 0), fArr2);
            resourceId = (fArr[2] > fArr2[2] ? 1 : (fArr[2] == fArr2[2] ? 0 : -1)) > 0 ? R.style.SuwNavBarThemeDark : R.style.SuwNavBarThemeLight;
        }
        typedArrayObtainStyledAttributes.recycle();
        return new ContextThemeWrapper(context, resourceId);
    }

    public NavigationBar(Context context) {
        super(a(context));
        a();
    }

    public NavigationBar(Context context, AttributeSet attributeSet) {
        super(a(context), attributeSet);
        a();
    }

    @TargetApi(11)
    public NavigationBar(Context context, AttributeSet attributeSet, int i) {
        super(a(context), attributeSet, i);
        a();
    }

    private final void a() {
        View.inflate(getContext(), R.layout.suw_navbar_view, this);
        this.a = (Button) findViewById(R.id.suw_navbar_next);
        this.b = (Button) findViewById(R.id.suw_navbar_back);
        this.c = (Button) findViewById(R.id.suw_navbar_more);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }
}
