package flm;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class akh implements ImageLoader.ImageListener {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ NetworkImageView b;

    public akh(NetworkImageView networkImageView, boolean z) {
        this.b = networkImageView;
        this.a = z;
    }

    @Override // com.android.volley.Response.ErrorListener
    public final void onErrorResponse(VolleyError volleyError) {
        NetworkImageView networkImageView = this.b;
        NetworkImageView networkImageView2 = this.b;
    }

    @Override // com.android.volley.toolbox.ImageLoader.ImageListener
    public final void onResponse(ImageLoader.ImageContainer imageContainer, boolean z) {
        if (z && this.a) {
            this.b.post(new aki(this, imageContainer));
            return;
        }
        if (imageContainer.getBitmap() != null) {
            this.b.setImageBitmap(imageContainer.getBitmap());
        } else if (this.b.a != 0) {
            this.b.setImageResource(this.b.a);
        } else if (this.b.b != null) {
            this.b.setImageBitmap(this.b.b);
        }
    }
}
