package flm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dvo {
    public final duu a;
    public final boolean b;
    public final dvv c;
    public final int d;

    public dvo(dvv dvvVar) {
        this(dvvVar, false, duy.a, Integer.MAX_VALUE);
    }

    public dvo(dvv dvvVar, boolean z, duu duuVar, int i) {
        this.c = dvvVar;
        this.b = z;
        this.a = duuVar;
        this.d = i;
    }

    public static dvo a(char c) {
        duw duwVar = new duw(c);
        dvl.a(duwVar);
        return new dvo(new dvp(duwVar));
    }

    public static dvo a(String str) {
        dvl.a(str.length() != 0, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return a(str.charAt(0));
        }
        return new dvo(new dvr(str));
    }

    public final dvo a() {
        return new dvo(this.c, true, this.a, this.d);
    }

    public final dvo b() {
        duz duzVar = duz.a;
        dvl.a(duzVar);
        return new dvo(this.c, this.b, duzVar, this.d);
    }

    public final Iterable a(CharSequence charSequence) {
        dvl.a(charSequence);
        return new dvt(this, charSequence);
    }

    final Iterator b(CharSequence charSequence) {
        return this.c.a(this, charSequence);
    }

    public final List c(CharSequence charSequence) {
        dvl.a(charSequence);
        Iterator itB = b(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itB.hasNext()) {
            arrayList.add((String) itB.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
