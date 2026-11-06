package flm;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cbt implements cci {
    public Activity a;
    public cbx b;
    public int c;
    private ccb f;
    private final HashMap g = new HashMap();
    public final Deque d = new ArrayDeque();
    private final cch h = new cbu(this);
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();

    public cbt(Activity activity) {
        this.a = activity;
        a(new cbz(this.a));
        a(new cbl(this.a));
    }

    public final boolean a() {
        if (this.d.isEmpty()) {
            throw new IllegalArgumentException("NavController back stack is empty");
        }
        boolean zA = false;
        while (!this.d.isEmpty() && !(zA = ((cbw) this.d.removeLast()).c.a())) {
        }
        return zA;
    }

    public final boolean a(int i, boolean z) {
        cbw cbwVar;
        boolean z2;
        if (this.d.isEmpty()) {
            throw new IllegalArgumentException("NavController back stack is empty");
        }
        ArrayList arrayList = new ArrayList();
        Iterator itDescendingIterator = this.d.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            cbw cbwVar2 = (cbw) itDescendingIterator.next();
            if (z || cbwVar2.e != i) {
                arrayList.add(cbwVar2);
            }
            if (cbwVar2.e == i) {
                break;
            }
        }
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        boolean z3 = false;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            while (true) {
                i2++;
                cbwVar = (cbw) obj;
                if (!this.d.isEmpty() && ((cbw) this.d.peekLast()).e != cbwVar.e) {
                    if (i2 < size) {
                        obj = arrayList2.get(i2);
                    } else {
                        cbwVar = null;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (cbwVar != null) {
                z2 = cbwVar.c.a() || z3;
            } else {
                z2 = z3;
            }
            z3 = z2;
        }
        return z3;
    }

    @Override // flm.cci
    public final ccf a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("navigator name cannot be null");
        }
        return (ccf) this.g.get(str);
    }

    public final void a(ccf ccfVar) {
        ccg ccgVar = (ccg) ccfVar.getClass().getAnnotation(ccg.class);
        String strA = ccgVar != null ? ccgVar.a() : null;
        if (TextUtils.isEmpty(strA)) {
            String strValueOf = String.valueOf(ccfVar.getClass().getSimpleName());
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "No @Navigator.Name annotation found for ".concat(strValueOf) : new String("No @Navigator.Name annotation found for "));
        }
        if (TextUtils.isEmpty(strA)) {
            throw new IllegalArgumentException("navigator name cannot be null");
        }
        ccfVar.c.add(this.h);
        this.g.put(strA, ccfVar);
    }

    public final ccb b() {
        if (this.f == null) {
            this.f = new ccb(this.a, this);
        }
        return this.f;
    }

    public final void a(int i) {
        this.b = b().a(i);
        this.c = i;
        c();
    }

    final void c() {
        boolean z;
        Bundle extras;
        int[] intArray;
        cbx cbxVar;
        boolean z2 = false;
        if (this.b != null && this.d.isEmpty()) {
            if (this.a != null) {
                Intent intent = this.a.getIntent();
                if (intent == null || intent.getExtras() == null || (intArray = (extras = intent.getExtras()).getIntArray("android-support-nav:controller:deepLinkIds")) == null || intArray.length == 0) {
                    z = false;
                } else {
                    int i = 0;
                    cbx cbxVar2 = this.b;
                    while (i < intArray.length) {
                        int i2 = intArray[i];
                        cbw cbwVarA = i == 0 ? this.b : cbxVar2.a(i2, true);
                        if (cbwVarA == null) {
                            String strValueOf = String.valueOf(this.a.getResources().getResourceName(i2));
                            throw new IllegalStateException(strValueOf.length() != 0 ? "unknown destination during deep link: ".concat(strValueOf) : new String("unknown destination during deep link: "));
                        }
                        if (i != intArray.length - 1) {
                            cbxVar = (cbx) cbwVarA;
                        } else {
                            while (!this.d.isEmpty()) {
                                ((cbw) this.d.peekLast()).c.a();
                            }
                            cbwVarA.a(extras.getBundle("android-support-nav:controller:deepLinkExtras"), (ccc) null);
                            cbxVar = cbxVar2;
                        }
                        i++;
                        cbxVar2 = cbxVar;
                    }
                    z = true;
                }
                if (z) {
                    z2 = true;
                }
            }
            if (!z2) {
                this.b.a((Bundle) null, (ccc) null);
            }
        }
    }

    public final cbw d() {
        return (cbw) this.d.peekLast();
    }

    public final cbw b(int i) {
        if (this.b == null) {
            return null;
        }
        if (this.b.e == i) {
            return this.b;
        }
        cbw cbwVar = this.d.isEmpty() ? this.b : (cbw) this.d.peekLast();
        return (cbwVar instanceof cbx ? (cbx) cbwVar : cbwVar.d).a(i, true);
    }

    public final void c(int i) {
        int i2;
        ccc cccVar;
        String strConcat;
        cbw cbwVar = this.d.isEmpty() ? this.b : (cbw) this.d.peekLast();
        if (cbwVar == null) {
            throw new IllegalStateException("no current navigation node");
        }
        cbs cbsVarA = cbwVar.a(i);
        if (cbsVarA != null) {
            cccVar = cbsVarA.b;
            if (cbsVarA.a == 0 && cccVar != null && cccVar.b != 0) {
                a(cccVar.b, cccVar.c);
                return;
            }
            i2 = cbsVarA.a;
        } else {
            i2 = i;
            cccVar = null;
        }
        cbw cbwVarB = b(i2);
        if (cbwVarB == null) {
            String resourceName = this.a.getResources().getResourceName(i2);
            if (cbsVarA != null) {
                String strValueOf = String.valueOf(this.a.getResources().getResourceName(i));
                strConcat = strValueOf.length() != 0 ? " referenced from action ".concat(strValueOf) : new String(" referenced from action ");
            } else {
                strConcat = "";
            }
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(resourceName).length() + 56 + String.valueOf(strConcat).length()).append("navigation destination ").append(resourceName).append(strConcat).append(" is unknown to this NavController").toString());
        }
        if (cccVar != null && cccVar.b != 0) {
            a(cccVar.b, cccVar.c);
        }
        cbwVarB.a((Bundle) null, cccVar);
    }

    public final void a(int i, Bundle bundle) {
        int i2;
        String strConcat;
        ccc cccVar = null;
        cbw cbwVar = this.d.isEmpty() ? this.b : (cbw) this.d.peekLast();
        if (cbwVar == null) {
            throw new IllegalStateException("no current navigation node");
        }
        cbs cbsVarA = cbwVar.a(i);
        if (cbsVarA != null) {
            cccVar = cbsVarA.b;
            if (cbsVarA.a == 0 && cccVar != null && cccVar.b != 0) {
                a(cccVar.b, cccVar.c);
                return;
            }
            i2 = cbsVarA.a;
        } else {
            i2 = i;
        }
        cbw cbwVarB = b(i2);
        if (cbwVarB == null) {
            String resourceName = this.a.getResources().getResourceName(i2);
            if (cbsVarA != null) {
                String strValueOf = String.valueOf(this.a.getResources().getResourceName(i));
                strConcat = strValueOf.length() != 0 ? " referenced from action ".concat(strValueOf) : new String(" referenced from action ");
            } else {
                strConcat = "";
            }
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(resourceName).length() + 56 + String.valueOf(strConcat).length()).append("navigation destination ").append(resourceName).append(strConcat).append(" is unknown to this NavController").toString());
        }
        if (cccVar != null && cccVar.b != 0) {
            a(cccVar.b, cccVar.c);
        }
        cbwVarB.a(bundle, cccVar);
    }
}
