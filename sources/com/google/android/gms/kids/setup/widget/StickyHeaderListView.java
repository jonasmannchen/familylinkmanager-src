package com.google.android.gms.kids.setup.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.google.android.chimeraresources.R;
import flm.cqc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class StickyHeaderListView extends FrameLayout implements AbsListView.OnScrollListener {
    public final int a;
    public final int b;
    public final int c;
    public int d;
    public cqc e;
    public View f;
    public ListView g;
    private ViewGroup h;
    private View i;

    public StickyHeaderListView(Context context) {
        this(context, null);
    }

    public StickyHeaderListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = context.getResources().getDimensionPixelSize(R.dimen.sticky_header_elevation_dp);
        this.b = context.getResources().getInteger(R.integer.sticky_header_short_scroll_time_millis);
        this.c = context.getResources().getInteger(R.integer.sticky_header_long_scroll_time_millis);
        View.inflate(context, R.layout.view_sticky_header_list, this);
        this.g = (ListView) findViewById(R.id.kidsetup_sticky_header_list_view);
        this.h = (ViewGroup) findViewById(R.id.kidsetup_sticky_header_container);
        this.g.setOnScrollListener(this);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (this.e != null && this.g.getCount() - this.g.getHeaderViewsCount() != 0 && this.g.getLastVisiblePosition() >= this.g.getCount() - 1 && this.g.getChildAt(this.g.getChildCount() - 1).getBottom() <= this.g.getHeight()) {
            this.e.a();
        }
        if (this.e != null) {
            int firstVisiblePosition = this.g.getFirstVisiblePosition();
            int headerViewsCount = this.g.getHeaderViewsCount();
            int iD = this.e.d(firstVisiblePosition - headerViewsCount);
            if (this.d != iD) {
                this.d = iD;
                this.h.removeAllViews();
                if (iD >= 0) {
                    this.i = this.e.a(iD, this.i);
                    this.h.addView(this.i);
                }
            }
            View childAt = null;
            int lastVisiblePosition = this.g.getLastVisiblePosition();
            for (int iMax = Math.max(firstVisiblePosition, headerViewsCount); iMax <= lastVisiblePosition; iMax++) {
                if (this.e.c(iMax - headerViewsCount)) {
                    childAt = this.g.getChildAt(iMax - firstVisiblePosition);
                    break;
                }
            }
            int height = this.h.getChildCount() == 0 ? Integer.MAX_VALUE : this.i.getHeight();
            float y = childAt == null ? this.a + height : childAt.getY();
            float fA = a(y - height, 0.0f, this.a);
            float fA2 = a(this.a - y, 0.0f, this.a);
            this.h.setElevation(y < 0.0f ? this.a : fA);
            this.h.setY(y < 0.0f ? 0.0f : a(y - height, -height, 0.0f));
            if (this.f != null) {
                this.f.setElevation((this.a - fA) - fA2);
            }
            if (childAt != null) {
                childAt.setElevation(y >= 0.0f ? fA2 : 0.0f);
            }
        }
    }

    private static float a(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }
}
