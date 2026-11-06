package flm;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.chimeraresources.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tq {
    private static final ArrayList b = new ArrayList();
    private WeakHashMap c = null;
    private SparseArray d = null;
    public WeakReference a = null;

    tq() {
    }

    final SparseArray a() {
        if (this.d == null) {
            this.d = new SparseArray();
        }
        return this.d;
    }

    static tq a(View view) {
        tq tqVar = (tq) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (tqVar == null) {
            tq tqVar2 = new tq();
            view.setTag(R.id.tag_unhandled_key_event_manager, tqVar2);
            return tqVar2;
        }
        return tqVar;
    }

    final View a(View view, KeyEvent keyEvent) {
        if (this.c == null || !this.c.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View viewA = a(viewGroup.getChildAt(childCount), keyEvent);
                if (viewA != null) {
                    return viewA;
                }
            }
        }
        if (b(view, keyEvent)) {
            return view;
        }
        return null;
    }

    static boolean b(View view, KeyEvent keyEvent) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((tp) arrayList.get(size)).a()) {
                    return true;
                }
            }
        }
        return false;
    }

    final void b() {
        if (this.c != null) {
            this.c.clear();
        }
        if (!b.isEmpty()) {
            synchronized (b) {
                if (this.c == null) {
                    this.c = new WeakHashMap();
                }
                for (int size = b.size() - 1; size >= 0; size--) {
                    View view = (View) ((WeakReference) b.get(size)).get();
                    if (view == null) {
                        b.remove(size);
                    } else {
                        this.c.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.c.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }
    }
}
