package flm;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.chimeraresources.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bie {
    public static final boolean a;
    private static final LruCache b = new LruCache(16);

    public static String a(Context context) {
        String strSubstring;
        ModuleManager.ModuleInfo moduleInfoE = e(context);
        if (moduleInfoE == null) {
            return null;
        }
        String str = moduleInfoE.moduleId;
        if (str == null) {
            Log.w("ChimeraUtils", "Null module id!");
            return null;
        }
        if (str.startsWith("com.google.android.gms.")) {
            strSubstring = str.substring(23);
        } else {
            String strValueOf = String.valueOf(str);
            Log.w("ChimeraUtils", strValueOf.length() != 0 ? "Unexpected module id prefix: ".concat(strValueOf) : new String("Unexpected module id prefix: "));
            strSubstring = str;
        }
        if (!TextUtils.isEmpty(strSubstring)) {
            return strSubstring;
        }
        Log.w("ChimeraUtils", "Empty module id ignored");
        return null;
    }

    public static String a(String str) {
        if (str.startsWith("com.google.android.gms.")) {
            return str.substring(23);
        }
        if (str.isEmpty()) {
            return "container";
        }
        return str;
    }

    public static CharSequence b(Context context) {
        String strA = a(context);
        if (strA == null) {
            return null;
        }
        CharSequence charSequence = (CharSequence) b.get(strA);
        if (charSequence == null) {
            CharSequence charSequenceD = d(context);
            if (charSequenceD != null) {
                b.put(strA, charSequenceD);
                return charSequenceD;
            }
            return charSequenceD;
        }
        return charSequence;
    }

    private static CharSequence d(Context context) {
        String string;
        CharSequence text = null;
        Resources resources = context.getResources();
        ModuleManager.ModuleInfo moduleInfoE = e(context);
        if (moduleInfoE != null && resources != null) {
            int identifier = -1;
            try {
                try {
                    string = moduleInfoE.getMetadata(context).getString("display_name_string_id");
                    try {
                        if (!TextUtils.isEmpty(string)) {
                            identifier = resources.getIdentifier(string, "string", moduleInfoE.moduleApk.apkPackageName);
                            text = resources.getText(identifier);
                        } else {
                            Log.w("ChimeraUtils", String.format("Module %s has empty metadata %s", moduleInfoE.moduleId, "display_name_string_id"));
                        }
                    } catch (Resources.NotFoundException e) {
                        Log.w("ChimeraUtils", String.format("Module %s missing resource %s(%d)", moduleInfoE.moduleId, string, Integer.valueOf(identifier)));
                    } catch (RuntimeException e2) {
                        Log.w("ChimeraUtils", String.format("Module %s missing resource %s", moduleInfoE.moduleId, string));
                    }
                } catch (Resources.NotFoundException e3) {
                    string = null;
                } catch (RuntimeException e4) {
                    string = null;
                }
            } catch (InvalidConfigException e5) {
                Log.w("ChimeraUtils", String.format("Module %s has invalid metadata: %s", moduleInfoE.moduleId, e5.getMessage()));
            }
        }
        return text;
    }

    private static ModuleManager.ModuleInfo e(Context context) {
        try {
            return ModuleManager.get(context).getCurrentModule();
        } catch (IllegalStateException e) {
            Log.w("ChimeraUtils", "Non Chimera context");
            return null;
        }
    }

    public static CharSequence c(Context context) {
        try {
            return context.getResources().getString(R.string.common_app_name);
        } catch (Resources.NotFoundException e) {
            Log.w("ChimeraUtils", "Missing string: common_app_name");
            return "Google Play services";
        }
    }

    static {
        boolean z = true;
        new WeakHashMap();
        try {
            ModuleManager.getBasicModuleInfo((Context) null);
        } catch (LinkageError e) {
            z = false;
        } catch (NullPointerException e2) {
        }
        a = z;
    }
}
