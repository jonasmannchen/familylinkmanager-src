package flm;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kg {
    public View b;
    public final Map a = new HashMap();
    public final ArrayList c = new ArrayList();

    public final boolean equals(Object obj) {
        return (obj instanceof kg) && this.b == ((kg) obj).b && this.a.equals(((kg) obj).a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n") + "    values:";
        Iterator it = this.a.keySet().iterator();
        while (true) {
            String str2 = str;
            if (it.hasNext()) {
                String str3 = (String) it.next();
                str = str2 + "    " + str3 + ": " + this.a.get(str3) + "\n";
            } else {
                return str2;
            }
        }
    }
}
