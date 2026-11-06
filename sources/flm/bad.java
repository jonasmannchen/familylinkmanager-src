package flm;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bad {
    private static final dvo a = dvo.a("=").a();
    private static final dvo b = dvo.a("/").a();

    public static Uri a(String str, String str2) {
        boolean z;
        Uri uri = Uri.parse(str2);
        ArrayList arrayListA = a(b.a((CharSequence) uri.getPath()));
        int size = arrayListA.size();
        int i = (arrayListA.size() <= 1 || !((String) arrayListA.get(0)).equals("image")) ? size : size - 1;
        if (i < 4 || i > 6) {
            if (i != 1) {
                return uri;
            }
            String str3 = (String) a(a.a((CharSequence) uri.getPath())).get(0);
            return uri.buildUpon().path(new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str).length()).append(str3).append("=").append(str).toString()).build();
        }
        String path = uri.getPath();
        ArrayList arrayListA2 = a(b.a((CharSequence) path));
        if (arrayListA2.size() <= 0 || !((String) arrayListA2.get(0)).equals("image")) {
            z = false;
        } else {
            arrayListA2.remove(0);
            z = true;
        }
        int size2 = arrayListA2.size();
        boolean zEndsWith = path.endsWith("/");
        boolean z2 = !zEndsWith && size2 == 5;
        boolean z3 = size2 == 4;
        if (z2) {
            arrayListA2.add((String) arrayListA2.get(4));
        }
        if (z3) {
            arrayListA2.add(str);
        } else {
            arrayListA2.set(4, str);
        }
        if (z) {
            arrayListA2.add(0, "image");
        }
        if (zEndsWith) {
            arrayListA2.add("");
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String strValueOf = String.valueOf(TextUtils.join("/", arrayListA2));
        return builderBuildUpon.path(strValueOf.length() != 0 ? "/".concat(strValueOf) : new String("/")).build();
    }

    private static ArrayList a(Iterable iterable) {
        Iterator it = iterable.iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    static {
        Pattern.compile("^((http(s)?):)?\\/\\/((((lh[3-6](-tt|-d[a-g,z])?\\.((ggpht)|(googleusercontent)|(google)))|(([1-4]\\.bp\\.blogspot)|(bp[0-3]\\.blogger))|((((cp|ci|gp)[3-6])|(ap[1-2]))\\.(ggpht|googleusercontent))|(gm[1-4]\\.ggpht)|(((yt[3-4])|(sp[1-3]))\\.(ggpht|googleusercontent)))\\.com)|(dp[3-6]\\.googleusercontent\\.cn)|(lh[3-6]\\.(googleadsserving\\.cn|xn--9kr7l\\.com))|((dev|dev2|dev3|qa|qa2|qa3|qa-red|qa-blue|canary)[-.]lighthouse\\.sandbox\\.google\\.com\\/image)|(image\\-dev\\-lighthouse\\.sandbox\\.google\\.com(\\/image)?))\\/");
    }
}
