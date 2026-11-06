package flm;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.setupwizardlib.TemplateLayout;
import com.android.setupwizardlib.view.NavigationBar;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.KidSetupFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ckp {
    public final KidSetupFragment a;
    public TemplateLayout b;
    public ViewGroup c;
    public boolean d;
    public boolean e;

    public ckp(KidSetupFragment kidSetupFragment) {
        this.a = kidSetupFragment;
    }

    public final void a(int i) {
        this.a.f.inflate(i, this.c, true);
    }

    public final void b(int i) {
        a(this.b.getContext().getResources().getString(i));
    }

    public final void a(CharSequence charSequence) {
        TextView textView = (TextView) this.b.findViewById(R.id.kid_setup_subheading);
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public final void a(Bitmap bitmap) {
        ImageView imageView = (ImageView) this.b.findViewById(R.id.kid_setup_illustration);
        imageView.setImageBitmap(bitmap);
        imageView.setVisibility(bitmap == null ? 8 : 0);
    }

    public final void c(int i) {
        b(this.b.getContext().getResources().getString(i));
    }

    public final void b(CharSequence charSequence) {
        TextView textViewA = a();
        textViewA.setText(charSequence);
        textViewA.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public final TextView a() {
        return (TextView) this.b.findViewById(R.id.kid_setup_description);
    }

    public final void a(boolean z) {
        if (this.d) {
            this.b.findViewById(R.id.kid_setup_circular_progress_bar).setVisibility(z ? 0 : 8);
        } else {
            ((aje) this.b.a(aje.class)).a(z);
        }
        this.c.setVisibility(z ? 4 : 0);
    }

    public final void b(boolean z) {
        this.e = z;
        if (this.d) {
            View viewFindViewById = this.b.findViewById(R.id.kid_setup_footer_glif);
            viewFindViewById.setEnabled(z);
            viewFindViewById.setVisibility(z ? 0 : 4);
        } else {
            NavigationBar navigationBarA = ((ajd) this.b.a(ajd.class)).a();
            navigationBarA.setEnabled(z);
            navigationBarA.a.setEnabled(z);
            navigationBarA.c.setEnabled(z);
            navigationBarA.b.setEnabled(z);
        }
    }

    public final Button b() {
        if (this.d) {
            return (Button) this.b.findViewById(R.id.kid_setup_primary_action_button);
        }
        return ((ajd) this.b.a(ajd.class)).a().a;
    }

    public final Button c() {
        if (this.d) {
            return (Button) this.b.findViewById(R.id.kid_setup_secondary_action_button);
        }
        return ((ajd) this.b.a(ajd.class)).a().b;
    }

    public final Button d() {
        if (this.d) {
            return (Button) this.b.findViewById(R.id.kid_setup_more_button);
        }
        return ((ajd) this.b.a(ajd.class)).a().c;
    }

    public final void e() {
        int paddingStart = this.c.getPaddingStart();
        int paddingEnd = this.c.getPaddingEnd();
        this.c.setPaddingRelative(0, this.c.getPaddingTop(), 0, this.c.getPaddingBottom());
        TextView textView = (TextView) this.b.findViewById(R.id.kid_setup_subheading);
        textView.setPaddingRelative(paddingStart, textView.getPaddingTop(), paddingEnd, textView.getPaddingBottom());
        TextView textView2 = (TextView) this.b.findViewById(R.id.kid_setup_description);
        textView2.setPaddingRelative(paddingStart, textView2.getPaddingTop(), paddingEnd, textView2.getPaddingBottom());
    }

    public final void f() {
        this.c.setPadding(this.c.getPaddingStart(), 0, this.c.getPaddingEnd(), 0);
        this.b.findViewById(R.id.kid_setup_content_frame_space).setVisibility(8);
    }

    public final Rect g() {
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        this.a.getActivity().getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics2);
        if (!(Math.min(displayMetrics2.widthPixels, displayMetrics2.heightPixels) >= btm.a((Context) this.a.getActivity(), 600))) {
            return new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        Resources resources = this.a.getResources();
        boolean z = resources.getConfiguration().orientation == 2;
        if (this.d) {
            return new Rect(0, 0, (int) resources.getDimension(R.dimen.suw_glif_card_width), (int) resources.getDimension(R.dimen.suw_glif_card_height));
        }
        if (z) {
            return new Rect(0, 0, displayMetrics.widthPixels / 2, displayMetrics.heightPixels);
        }
        return new Rect(0, 0, displayMetrics.widthPixels - ((int) (2.0f * resources.getDimension(R.dimen.suw_card_port_margin_sides))), displayMetrics.heightPixels - ((int) resources.getDimension(R.dimen.suw_card_land_header_text_margin_top)));
    }
}
