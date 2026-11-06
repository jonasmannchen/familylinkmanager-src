package flm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class zi implements qi {
    private static final int[] k = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public zj b;
    public CharSequence f;
    public Drawable g;
    public View h;
    public zm i;
    public boolean j;
    private final Resources l;
    private boolean m;
    private boolean n;
    public int e = 0;
    private boolean s = false;
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private boolean w = false;
    private ArrayList x = new ArrayList();
    private CopyOnWriteArrayList y = new CopyOnWriteArrayList();
    private boolean z = false;
    public ArrayList c = new ArrayList();
    private ArrayList o = new ArrayList();
    private boolean p = true;
    public ArrayList d = new ArrayList();
    private ArrayList q = new ArrayList();
    private boolean r = true;

    public zi(Context context) {
        this.a = context;
        this.l = context.getResources();
        this.n = this.l.getConfiguration().keyboard != 1 && tr.c(ViewConfiguration.get(this.a), this.a);
    }

    public final void a(zy zyVar) {
        a(zyVar, this.a);
    }

    public final void a(zy zyVar, Context context) {
        this.y.add(new WeakReference(zyVar));
        zyVar.a(context, this);
        this.r = true;
    }

    public final void b(zy zyVar) {
        for (WeakReference weakReference : this.y) {
            zy zyVar2 = (zy) weakReference.get();
            if (zyVar2 == null || zyVar2 == zyVar) {
                this.y.remove(weakReference);
            }
        }
    }

    public final void a(Bundle bundle) {
        int size = size();
        int i = 0;
        SparseArray<? extends Parcelable> sparseArray = null;
        while (i < size) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            SparseArray<? extends Parcelable> sparseArray2 = sparseArray;
            if (item.hasSubMenu()) {
                ((aai) item.getSubMenu()).a(bundle);
            }
            i++;
            sparseArray = sparseArray2;
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(a(), sparseArray);
        }
    }

    public final void b(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(a());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (actionView != null && actionView.getId() != -1) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((aai) item.getSubMenu()).b(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (menuItemFindItem = findItem(i2)) != null) {
                menuItemFindItem.expandActionView();
            }
        }
    }

    protected String a() {
        return "android:menu:actionviewstates";
    }

    public void a(zj zjVar) {
        this.b = zjVar;
    }

    private final MenuItem a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = i3 >> 16;
        if (i5 < 0 || i5 >= k.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (k[i5] << 16) | (65535 & i3);
        zm zmVar = new zm(this, i, i2, i3, i6, charSequence, this.e);
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = this.c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            if (((zm) arrayList2.get(size)).a <= i6) {
                i4 = size + 1;
                arrayList.add(i4, zmVar);
                b(true);
                return zmVar;
            }
        }
        i4 = 0;
        arrayList.add(i4, zmVar);
        b(true);
        return zmVar;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return a(0, 0, 0, this.l.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.l.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.l.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        zm zmVar = (zm) a(i, i2, i3, charSequence);
        aai aaiVar = new aai(this.a, this, zmVar);
        zmVar.a(aaiVar);
        return aaiVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.l.getString(i4));
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.z = z;
    }

    public boolean b() {
        return this.z;
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        int i2;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((zm) this.c.get(i3)).getItemId() == i) {
                i2 = i3;
                a(i2, true);
            }
        }
        i2 = -1;
        a(i2, true);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int i2;
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                if (((zm) this.c.get(i3)).getGroupId() == i) {
                    i2 = i3;
                    break;
                }
                i3++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0) {
            int size2 = this.c.size() - i2;
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                if (i4 >= size2 || ((zm) this.c.get(i2)).getGroupId() != i) {
                    break;
                }
                a(i2, false);
                i4 = i5;
            }
            b(true);
        }
    }

    private final void a(int i, boolean z) {
        if (i >= 0 && i < this.c.size()) {
            this.c.remove(i);
            if (z) {
                b(true);
            }
        }
    }

    @Override // android.view.Menu
    public void clear() {
        if (this.i != null) {
            b(this.i);
        }
        this.c.clear();
        b(true);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            zm zmVar = (zm) this.c.get(i2);
            if (zmVar.getGroupId() == i) {
                zmVar.a(z2);
                zmVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.c.size();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < size) {
            zm zmVar = (zm) this.c.get(i2);
            i2++;
            z2 = (zmVar.getGroupId() == i && zmVar.c(z)) ? true : z2;
        }
        if (z2) {
            b(true);
        }
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            zm zmVar = (zm) this.c.get(i2);
            if (zmVar.getGroupId() == i) {
                zmVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.j) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((zm) this.c.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            zm zmVar = (zm) this.c.get(i2);
            if (zmVar.getItemId() != i) {
                if (zmVar.hasSubMenu() && (menuItemFindItem = zmVar.getSubMenu().findItem(i)) != null) {
                    return menuItemFindItem;
                }
            } else {
                return zmVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public int size() {
        return this.c.size();
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return (MenuItem) this.c.get(i);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return a(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.m = z;
        b(false);
    }

    public boolean c() {
        return this.m;
    }

    public boolean d() {
        return this.n;
    }

    boolean a(zi ziVar, MenuItem menuItem) {
        return this.b != null && this.b.a(ziVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        zm zmVarA = a(i, keyEvent);
        boolean zA = false;
        if (zmVarA != null) {
            zA = a(zmVarA, (zy) null, i2);
        }
        if ((i2 & 2) != 0) {
            a(true);
        }
        return zA;
    }

    private final void a(List list, int i, KeyEvent keyEvent) {
        boolean zC = c();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                zm zmVar = (zm) this.c.get(i2);
                if (zmVar.hasSubMenu()) {
                    ((zi) zmVar.getSubMenu()).a(list, i, keyEvent);
                }
                char alphabeticShortcut = zC ? zmVar.getAlphabeticShortcut() : zmVar.getNumericShortcut();
                if (((modifiers & 69647) == ((zC ? zmVar.getAlphabeticModifiers() : zmVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (zC && alphabeticShortcut == '\b' && i == 67)) && zmVar.isEnabled())) {
                    list.add(zmVar);
                }
            }
        }
    }

    private final zm a(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.x;
        arrayList.clear();
        a(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (zm) arrayList.get(0);
        }
        boolean zC = c();
        for (int i2 = 0; i2 < size; i2++) {
            zm zmVar = (zm) arrayList.get(i2);
            char alphabeticShortcut = zC ? zmVar.getAlphabeticShortcut() : zmVar.getNumericShortcut();
            if (alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) {
                return zmVar;
            }
            if (alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) {
                return zmVar;
            }
            if (zC && alphabeticShortcut == '\b' && i == 67) {
                return zmVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return a(findItem(i), (zy) null, i2);
    }

    public final boolean a(MenuItem menuItem, zy zyVar, int i) {
        boolean zA = false;
        zm zmVar = (zm) menuItem;
        if (zmVar == null || !zmVar.isEnabled()) {
            return false;
        }
        boolean zB = zmVar.b();
        sw swVar = zmVar.f;
        boolean z = swVar != null && swVar.e();
        if (zmVar.i()) {
            boolean zExpandActionView = zmVar.expandActionView() | zB;
            if (zExpandActionView) {
                a(true);
                return zExpandActionView;
            }
            return zExpandActionView;
        }
        if (zmVar.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                a(false);
            }
            if (!zmVar.hasSubMenu()) {
                zmVar.a(new aai(this.a, this, zmVar));
            }
            aai aaiVar = (aai) zmVar.getSubMenu();
            if (z) {
                swVar.a(aaiVar);
            }
            if (!this.y.isEmpty()) {
                zA = zyVar != null ? zyVar.a(aaiVar) : false;
                boolean zA2 = zA;
                for (WeakReference weakReference : this.y) {
                    zy zyVar2 = (zy) weakReference.get();
                    if (zyVar2 == null) {
                        this.y.remove(weakReference);
                    } else {
                        zA2 = !zA2 ? zyVar2.a(aaiVar) : zA2;
                    }
                }
                zA = zA2;
            }
            boolean z2 = zB | zA;
            if (!z2) {
                a(true);
                return z2;
            }
            return z2;
        }
        if ((i & 1) == 0) {
            a(true);
        }
        return zB;
    }

    public final void a(boolean z) {
        if (!this.w) {
            this.w = true;
            for (WeakReference weakReference : this.y) {
                zy zyVar = (zy) weakReference.get();
                if (zyVar == null) {
                    this.y.remove(weakReference);
                } else {
                    zyVar.a(this, z);
                }
            }
            this.w = false;
        }
    }

    @Override // android.view.Menu
    public void close() {
        a(true);
    }

    public final void b(boolean z) {
        if (!this.s) {
            if (z) {
                this.p = true;
                this.r = true;
            }
            if (!this.y.isEmpty()) {
                e();
                for (WeakReference weakReference : this.y) {
                    zy zyVar = (zy) weakReference.get();
                    if (zyVar == null) {
                        this.y.remove(weakReference);
                    } else {
                        zyVar.a(z);
                    }
                }
                f();
                return;
            }
            return;
        }
        this.t = true;
        if (z) {
            this.u = true;
        }
    }

    public final void e() {
        if (!this.s) {
            this.s = true;
            this.t = false;
            this.u = false;
        }
    }

    public final void f() {
        this.s = false;
        if (this.t) {
            this.t = false;
            b(this.u);
        }
    }

    final void g() {
        this.p = true;
        b(true);
    }

    final void h() {
        this.r = true;
        b(true);
    }

    public final ArrayList i() {
        if (!this.p) {
            return this.o;
        }
        this.o.clear();
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            zm zmVar = (zm) this.c.get(i);
            if (zmVar.isVisible()) {
                this.o.add(zmVar);
            }
        }
        this.p = false;
        this.r = true;
        return this.o;
    }

    public final void j() {
        ArrayList arrayListI = i();
        if (this.r) {
            boolean zA = false;
            for (WeakReference weakReference : this.y) {
                zy zyVar = (zy) weakReference.get();
                if (zyVar == null) {
                    this.y.remove(weakReference);
                } else {
                    zA = zyVar.a() | zA;
                }
            }
            if (zA) {
                this.d.clear();
                this.q.clear();
                int size = arrayListI.size();
                for (int i = 0; i < size; i++) {
                    zm zmVar = (zm) arrayListI.get(i);
                    if (zmVar.f()) {
                        this.d.add(zmVar);
                    } else {
                        this.q.add(zmVar);
                    }
                }
            } else {
                this.d.clear();
                this.q.clear();
                this.q.addAll(i());
            }
            this.r = false;
        }
    }

    public final ArrayList k() {
        j();
        return this.q;
    }

    public void clearHeader() {
        this.g = null;
        this.f = null;
        this.h = null;
        b(false);
    }

    final void a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.l;
        if (view != null) {
            this.h = view;
            this.f = null;
            this.g = null;
        } else {
            if (i > 0) {
                this.f = resources.getText(i);
            } else if (charSequence != null) {
                this.f = charSequence;
            }
            if (i2 > 0) {
                this.g = oo.a(this.a, i2);
            } else if (drawable != null) {
                this.g = drawable;
            }
            this.h = null;
        }
        b(false);
    }

    public zi l() {
        return this;
    }

    public boolean a(zm zmVar) {
        boolean zB = false;
        if (!this.y.isEmpty()) {
            e();
            Iterator it = this.y.iterator();
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    zB = z;
                    break;
                }
                WeakReference weakReference = (WeakReference) it.next();
                zy zyVar = (zy) weakReference.get();
                if (zyVar == null) {
                    this.y.remove(weakReference);
                } else {
                    zB = zyVar.b(zmVar);
                    if (zB) {
                        break;
                    }
                    z = zB;
                }
            }
            f();
            if (zB) {
                this.i = zmVar;
            }
        }
        return zB;
    }

    public boolean b(zm zmVar) {
        boolean zC = false;
        if (!this.y.isEmpty() && this.i == zmVar) {
            e();
            Iterator it = this.y.iterator();
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    zC = z;
                    break;
                }
                WeakReference weakReference = (WeakReference) it.next();
                zy zyVar = (zy) weakReference.get();
                if (zyVar == null) {
                    this.y.remove(weakReference);
                } else {
                    zC = zyVar.c(zmVar);
                    if (zC) {
                        break;
                    }
                    z = zC;
                }
            }
            f();
            if (zC) {
                this.i = null;
            }
        }
        return zC;
    }
}
