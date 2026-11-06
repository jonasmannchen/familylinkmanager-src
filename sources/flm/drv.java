package flm;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class drv extends om {
    private List k;
    private List l;

    drv(Context context) {
        super(context.getApplicationContext());
    }

    drv(Context context, List list) {
        this(context);
        this.l = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.op
    public final void a(List list) {
        this.k = list;
        super.a((Object) list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.op
    public final void e() {
        if (this.k != null) {
            a(this.k);
        } else {
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.op
    public final void f() {
        b();
    }

    @Override // flm.om
    public final /* synthetic */ Object d() throws Throwable {
        ArrayList arrayList;
        TreeSet treeSet = new TreeSet();
        treeSet.addAll(drz.a(drz.a(this.e.getApplicationContext(), "third_party_license_metadata", 0L, -1), ""));
        if (this.l != null) {
            for (String str : this.l) {
                String strA = drz.a("res/raw/third_party_license_metadata", str, 0L, -1);
                if (strA != null) {
                    arrayList = drz.a(strA, str);
                } else {
                    arrayList = new ArrayList();
                }
                treeSet.addAll(arrayList);
            }
        }
        return Collections.unmodifiableList(new ArrayList(treeSet));
    }

    static {
        drv.class.getCanonicalName();
    }
}
