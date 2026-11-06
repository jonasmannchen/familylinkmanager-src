package com.google.android.libraries.social.licenses;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.chimeraresources.R;
import com.google.android.libraries.social.licenses.LicenseActivity;
import flm.drs;
import flm.drz;
import flm.vy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class LicenseActivity extends vy {
    @Override // flm.vy, flm.ln, flm.oj, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        String strA;
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_activity);
        drs drsVar = (drs) getIntent().getParcelableExtra("license");
        e().a().a(drsVar.a);
        e().a().a(true);
        e().a().b(true);
        e().a().a((Drawable) null);
        TextView textView = (TextView) findViewById(R.id.license_activity_textview);
        long j = drsVar.b;
        int i = drsVar.c;
        String str = drsVar.d;
        if (str.isEmpty()) {
            strA = drz.a(this, "third_party_licenses", j, i);
        } else {
            strA = drz.a("res/raw/third_party_licenses", str, j, i);
            if (strA == null) {
                throw new RuntimeException(new StringBuilder(String.valueOf(str).length() + 46).append(str).append(" does not contain res/raw/").append("third_party_licenses").toString());
            }
        }
        if (strA == null) {
            finish();
        } else {
            textView.setText(strA);
        }
    }

    @Override // flm.vy, flm.ln, flm.oj, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        Layout layout = ((TextView) findViewById(R.id.license_activity_textview)).getLayout();
        if (layout != null) {
            bundle.putInt("scroll_pos", layout.getLineStart(layout.getLineForVertical(scrollView.getScrollY())));
        }
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        final ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        final int i = bundle.getInt("scroll_pos");
        if (i != 0) {
            scrollView.post(new Runnable(this, i, scrollView) { // from class: flm.dru
                private final LicenseActivity a;
                private final int b;
                private final ScrollView c;

                {
                    this.a = this;
                    this.b = i;
                    this.c = scrollView;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    LicenseActivity licenseActivity = this.a;
                    int i2 = this.b;
                    ScrollView scrollView2 = this.c;
                    Layout layout = ((TextView) licenseActivity.findViewById(R.id.license_activity_textview)).getLayout();
                    if (layout != null) {
                        scrollView2.scrollTo(0, layout.getLineTop(layout.getLineForOffset(i2)));
                    }
                }
            });
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
