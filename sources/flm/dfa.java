package flm;

import android.content.ContentResolver;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dfa extends dey {
    private static final Uri a = Uri.parse("content://com.google.settings/partner");

    public static boolean a(ContentResolver contentResolver, String str, String str2) {
        return a(contentResolver, a, str, str2);
    }
}
