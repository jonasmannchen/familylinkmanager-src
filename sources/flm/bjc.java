package flm;

import android.content.Context;
import android.text.TextUtils;
import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bjc {
    public static boolean a = false;
    public final Context b;
    public final Random c;
    public final big d;

    public bjc(Context context) {
        this(context.getApplicationContext(), new Random(), bij.a);
    }

    private bjc(Context context, Random random, big bigVar) {
        this.b = context;
        this.c = random;
        this.d = bigVar;
        String str = (String) azi.d.b();
        if (!TextUtils.isEmpty(str)) {
            str.split(bdp.WHITELIST_DELIMITER);
        }
    }
}
