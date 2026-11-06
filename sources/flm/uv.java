package flm;

import android.widget.ListView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class uv extends uk {
    private final ListView f;

    public uv(ListView listView) {
        super(listView);
        this.f = listView;
    }

    @Override // flm.uk
    public final void a(int i) {
        this.f.scrollListBy(i);
    }

    @Override // flm.uk
    public final boolean b() {
        return false;
    }

    @Override // flm.uk
    public final boolean b(int i) {
        ListView listView = this.f;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }
}
