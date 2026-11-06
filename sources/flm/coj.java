package flm;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.volley.toolbox.ImageLoader;
import com.google.android.gms.kids.setup.widget.EnhancedNetworkImageView;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class coj {
    public static volatile boolean a = false;
    public static ImageLoader b;
    public static cok c;

    private coj() {
    }

    public static void a(EnhancedNetworkImageView enhancedNetworkImageView, String str) {
        dvl.a(enhancedNetworkImageView);
        a(enhancedNetworkImageView.getContext());
        enhancedNetworkImageView.setImageUrl(str, b);
    }

    public static void a(EnhancedNetworkImageView enhancedNetworkImageView, eta etaVar) {
        ete eteVar;
        dvl.a(enhancedNetworkImageView);
        dvl.a(etaVar);
        dvl.a(!etaVar.b.isEmpty());
        Context context = enhancedNetworkImageView.getContext();
        a(context);
        Bitmap bitmapB = b(context, etaVar.b);
        if (bitmapB != null) {
            enhancedNetworkImageView.setDefaultImageBitmap(bitmapB);
            return;
        }
        enhancedNetworkImageView.setDefaultImageBitmap(null);
        if (etaVar.c == null) {
            eteVar = ete.t;
        } else {
            eteVar = etaVar.c;
        }
        a(enhancedNetworkImageView, eteVar.d);
    }

    public static void a(Context context, String str) {
        dvl.a(!TextUtils.isEmpty(str));
        a(context);
        b(context, str);
    }

    private static Bitmap b(Context context, String str) {
        String str2 = String.format("app://%s", str);
        Bitmap bitmap = c.getBitmap(str2);
        if (bitmap == null) {
            try {
                bitmap = btm.a(context.getPackageManager().getApplicationIcon(str));
            } catch (PackageManager.NameNotFoundException e) {
            }
            if (bitmap != null) {
                c.put(str2, bitmap);
            }
        }
        return bitmap;
    }

    public static String a(String str) {
        return TextUtils.isEmpty(str) ? str : bad.a(TextUtils.join("-", Arrays.asList("cc", "mo", "rp")), str).toString();
    }

    private static void a(Context context) {
        if (!a) {
            synchronized (coj.class) {
                if (!a) {
                    c = new cok();
                    b = new ImageLoader(btz.a(context), c);
                    a = true;
                }
            }
        }
    }
}
