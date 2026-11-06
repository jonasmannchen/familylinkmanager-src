package flm;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class afa extends ado {
    public aey c;
    private final int d;
    private final int e;
    private MenuItem f;

    public afa(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.d = 21;
            this.e = 22;
        } else {
            this.d = 22;
            this.e = 21;
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.d) {
            if (listMenuItemView.isEnabled() && listMenuItemView.a.hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView != null && i == this.e) {
            setSelection(-1);
            ((zh) getAdapter()).a.a(false);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // flm.ado, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int i;
        zh zhVar;
        zm zmVar;
        int iPointToPosition;
        int i2;
        if (this.c != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                int headersCount = headerViewListAdapter.getHeadersCount();
                zh zhVar2 = (zh) headerViewListAdapter.getWrappedAdapter();
                i = headersCount;
                zhVar = zhVar2;
            } else {
                zh zhVar3 = (zh) adapter;
                i = 0;
                zhVar = zhVar3;
            }
            if (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = iPointToPosition - i) < 0 || i2 >= zhVar.getCount()) {
                zmVar = null;
            } else {
                zmVar = (zm) zhVar.getItem(i2);
            }
            MenuItem menuItem = this.f;
            if (menuItem != zmVar) {
                zi ziVar = zhVar.a;
                if (menuItem != null) {
                    this.c.a(ziVar, menuItem);
                }
                this.f = zmVar;
                if (zmVar != null) {
                    this.c.b(ziVar, zmVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // flm.ado
    public final /* bridge */ /* synthetic */ boolean a(MotionEvent motionEvent, int i) {
        return super.a(motionEvent, i);
    }

    @Override // flm.ado
    public final /* bridge */ /* synthetic */ int a(int i, int i2, int i3, int i4, int i5) {
        return super.a(i, i2, i3, i4, i5);
    }

    @Override // flm.ado, android.widget.AbsListView, android.view.View
    public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // flm.ado, android.widget.AbsListView
    public final /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }

    @Override // flm.ado, android.view.ViewGroup, android.view.View
    public final /* bridge */ /* synthetic */ boolean hasFocus() {
        return super.hasFocus();
    }

    @Override // flm.ado, android.view.View
    public final /* bridge */ /* synthetic */ boolean isFocused() {
        return super.isFocused();
    }

    @Override // flm.ado, android.view.View
    public final /* bridge */ /* synthetic */ boolean hasWindowFocus() {
        return super.hasWindowFocus();
    }

    @Override // flm.ado, android.view.View
    public final /* bridge */ /* synthetic */ boolean isInTouchMode() {
        return super.isInTouchMode();
    }
}
