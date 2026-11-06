package flm;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ta {
    private static boolean a = false;
    private static Method b = null;
    private static boolean c = false;
    private static Field d = null;

    public static boolean a(tb tbVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (tbVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return tbVar.a(keyEvent);
        }
        if (!(callback instanceof Activity)) {
            if (!(callback instanceof Dialog)) {
                return (view != null && ti.b(view, keyEvent)) || tbVar.a(keyEvent);
            }
            Dialog dialog = (Dialog) callback;
            DialogInterface.OnKeyListener onKeyListenerA = a(dialog);
            if (onKeyListenerA != null && onKeyListenerA.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            Window window = dialog.getWindow();
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (ti.b(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
        }
        Activity activity = (Activity) callback;
        activity.onUserInteraction();
        Window window2 = activity.getWindow();
        if (window2.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window2.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window2.getDecorView();
        if (ti.b(decorView2, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView2 != null ? decorView2.getKeyDispatcherState() : null, activity);
    }

    private static boolean a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!a) {
            try {
                b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException e) {
            }
            a = true;
        }
        if (b != null) {
            try {
                return ((Boolean) b.invoke(actionBar, keyEvent)).booleanValue();
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
            }
        }
        return false;
    }

    private static DialogInterface.OnKeyListener a(Dialog dialog) {
        if (!c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            c = true;
        }
        if (d != null) {
            try {
                return (DialogInterface.OnKeyListener) d.get(dialog);
            } catch (IllegalAccessException e2) {
            }
        }
        return null;
    }
}
