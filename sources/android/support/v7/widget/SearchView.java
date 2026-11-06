package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.google.android.chimeraresources.R;
import flm.abj;
import flm.aei;
import flm.agv;
import flm.agw;
import flm.yi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class SearchView extends aei implements yi {
    public static final agv a = new agv();

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        throw new NoSuchMethodError();
    }

    /* JADX INFO: compiled from: PG */
    public class SearchAutoComplete extends abj {
        public boolean a;
        private int b;
        private final Runnable c;

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.c = new agw(this);
            this.b = getThreshold();
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            int i;
            super.onFinishInflate();
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                i = 256;
            } else if (i2 >= 600 || (i2 >= 640 && i3 >= 480)) {
                i = 192;
            } else {
                i = 160;
            }
            setMinWidth((int) TypedValue.applyDimension(1, i, displayMetrics));
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.b = i;
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z) {
                SearchView searchView = null;
                if (searchView.hasFocus() && getVisibility() == 0) {
                    this.a = true;
                    if (SearchView.a(getContext())) {
                        agv agvVar = SearchView.a;
                        if (agvVar.a != null) {
                            try {
                                agvVar.a.invoke(this, true);
                            } catch (Exception e) {
                            }
                        }
                    }
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView.c();
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.b <= 0 || super.enoughToFilter();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        View view = null;
                        view.clearFocus();
                        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
                        this.a = false;
                        removeCallbacks(this.c);
                        inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // flm.abj, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.a) {
                removeCallbacks(this.c);
                post(this.c);
            }
            return inputConnectionOnCreateInputConnection;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        throw new NoSuchMethodError();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.aei, android.view.View
    public final void onMeasure(int i, int i2) {
        throw new NoSuchMethodError();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.aei, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw new NoSuchMethodError();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        throw new NoSuchMethodError();
    }

    static void c() {
        throw new NoSuchMethodError();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        throw new NoSuchMethodError();
    }

    @Override // flm.yi
    public final void b() {
        throw new NoSuchMethodError();
    }

    @Override // flm.yi
    public final void a() {
        throw new NoSuchMethodError();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        throw new NoSuchMethodError();
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        throw new NoSuchMethodError();
    }

    static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }
}
