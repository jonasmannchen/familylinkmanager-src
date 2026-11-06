package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.chimeraresources.R;
import flm.vn;
import flm.vu;
import flm.ws;
import flm.xl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class AlertController {
    public NestedScrollView A;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public Handler Q;
    public final Context a;
    public final ws b;
    public final Window c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public ListView g;
    public View h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public Button o;
    public CharSequence p;
    public Message q;
    public Drawable r;
    public Button s;
    public CharSequence t;
    public Message u;
    public Drawable v;
    public Button w;
    public CharSequence x;
    public Message y;
    public Drawable z;
    public boolean n = false;
    public int B = 0;
    public int I = -1;
    private int S = 0;
    public final View.OnClickListener R = new vn(this);

    public AlertController(Context context, ws wsVar, Window window) {
        this.a = context;
        this.b = wsVar;
        this.c = window;
        this.Q = new vu(wsVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, xl.D, R.attr.alertDialogStyle, 0);
        this.J = typedArrayObtainStyledAttributes.getResourceId(xl.E, 0);
        this.K = typedArrayObtainStyledAttributes.getResourceId(xl.G, 0);
        this.L = typedArrayObtainStyledAttributes.getResourceId(xl.I, 0);
        this.M = typedArrayObtainStyledAttributes.getResourceId(xl.J, 0);
        this.N = typedArrayObtainStyledAttributes.getResourceId(xl.L, 0);
        this.O = typedArrayObtainStyledAttributes.getResourceId(xl.H, 0);
        this.P = typedArrayObtainStyledAttributes.getBoolean(xl.K, true);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(xl.F, 0);
        typedArrayObtainStyledAttributes.recycle();
        wsVar.a(1);
    }

    /* JADX INFO: compiled from: PG */
    public class RecycleListView extends ListView {
        public final int a;
        public final int b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xl.bZ);
            this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(xl.ca, -1);
            this.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(xl.cb, -1);
        }
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public final void a(CharSequence charSequence) {
        this.e = charSequence;
        if (this.E != null) {
            this.E.setText(charSequence);
        }
    }

    public final void a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (onClickListener != null) {
            message = this.Q.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case -3:
                this.x = charSequence;
                this.y = message;
                this.z = drawable;
                return;
            case -2:
                this.t = charSequence;
                this.u = message;
                this.v = drawable;
                return;
            case -1:
                this.p = charSequence;
                this.q = message;
                this.r = drawable;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }

    public static ViewGroup a(View view, View view2) {
        if (view == null) {
            return (ViewGroup) (view2 instanceof ViewStub ? ((ViewStub) view2).inflate() : view2);
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        return (ViewGroup) (view instanceof ViewStub ? ((ViewStub) view).inflate() : view);
    }

    public static void a(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public static void a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }
}
