package flm;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@ccg(a = "activity")
public final class cbl extends ccf {
    private Context a;
    private Activity b;

    public cbl(Context context) {
        this.a = context;
        for (Context baseContext = context; baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof Activity) {
                this.b = (Activity) baseContext;
                return;
            }
        }
    }

    @Override // flm.ccf
    public final boolean a() {
        if (this.b == null) {
            return false;
        }
        Intent intent = this.b.getIntent();
        int intExtra = intent != null ? intent.getIntExtra("android-support-navigation:ActivityNavigator:source", 0) : 0;
        this.b.finish();
        a(intExtra, 2);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0115  */
    /* JADX WARN: Code duplicated, block: B:53:0x011b  */
    @Override // flm.ccf
    public final /* synthetic */ void a(cbw cbwVar, Bundle bundle, ccc cccVar) {
        Intent intent;
        int intExtra;
        cbm cbmVar = (cbm) cbwVar;
        Intent intent2 = new Intent(cbmVar.a);
        if (bundle != null) {
            intent2.putExtras(bundle);
            String str = cbmVar.b;
            if (!TextUtils.isEmpty(str)) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (bundle.containsKey(strGroup)) {
                        matcher.appendReplacement(stringBuffer, "");
                        stringBuffer.append(Uri.encode(bundle.getString(strGroup)));
                    } else {
                        String strValueOf = String.valueOf(bundle);
                        throw new IllegalArgumentException(new StringBuilder(String.valueOf(strGroup).length() + 41 + String.valueOf(strValueOf).length() + String.valueOf(str).length()).append("Could not find ").append(strGroup).append(" in ").append(strValueOf).append(" to fill data pattern ").append(str).toString());
                    }
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        if (cccVar != null) {
            if ((cccVar.a & 4) != 0) {
                intent2.addFlags(32768);
            }
        }
        if (cccVar != null) {
            if ((cccVar.a & 2) != 0) {
                intent2.addFlags(524288);
            } else if (!(this.a instanceof Activity)) {
                intent2.addFlags(268435456);
            }
        } else if (!(this.a instanceof Activity)) {
            intent2.addFlags(268435456);
        }
        if (cccVar != null && cccVar.a()) {
            intent2.addFlags(536870912);
        }
        if (this.b != null && (intent = this.b.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        int i = cbmVar.e;
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", i);
        this.a.startActivity(intent2);
        if (cccVar != null && this.b != null) {
            int i2 = cccVar.d;
            int i3 = cccVar.e;
            if (i2 != -1 || i3 != -1) {
                if (i2 == -1) {
                    i2 = 0;
                }
                if (i3 == -1) {
                    i3 = 0;
                }
                this.b.overridePendingTransition(i2, i3);
            }
        }
        a(i, 0);
    }

    @Override // flm.ccf
    public final /* synthetic */ cbw b() {
        return new cbm(this);
    }
}
