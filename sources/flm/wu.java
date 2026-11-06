package flm;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class wu {
    public static final String LOG_TAG = "AppCompatViewInflater";
    public final Object[] mConstructorArgs = new Object[2];
    public static final Class[] sConstructorSignature = {Context.class, AttributeSet.class};
    public static final int[] sOnClickAttrs = {R.attr.onClick};
    public static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    public static final Map sConstructorMap = new rt();

    final View createView(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View viewCreateSeekBar;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = themifyContext(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = ahb.a(context2);
        }
        switch (str) {
            case "TextView":
                viewCreateSeekBar = createTextView(context2, attributeSet);
                verifyNotNull(viewCreateSeekBar, str);
                break;
            case "ImageView":
                viewCreateSeekBar = createImageView(context2, attributeSet);
                verifyNotNull(viewCreateSeekBar, str);
                break;
            case "Button":
                viewCreateSeekBar = createButton(context2, attributeSet);
                verifyNotNull(viewCreateSeekBar, str);
                break;
            case "EditText":
                viewCreateSeekBar = createEditText(context2, attributeSet);
                verifyNotNull(viewCreateSeekBar, str);
                break;
            case "Spinner":
                viewCreateSeekBar = createSpinner(context2, attributeSet);
                verifyNotNull(viewCreateSeekBar, str);
                break;
            case "ImageButton":
                viewCreateSeekBar = createImageButton(context2, attributeSet);
                verifyNotNull(viewCreateSeekBar, str);
                break;
            case "CheckBox":
                viewCreateSeekBar = createCheckBox(context2, attributeSet);
                verifyNotNull(viewCreateSeekBar, str);
                break;
            case "RadioButton":
                viewCreateSeekBar = createRadioButton(context2, attributeSet);
                verifyNotNull(viewCreateSeekBar, str);
                break;
            case "CheckedTextView":
                viewCreateSeekBar = createCheckedTextView(context2, attributeSet);
                verifyNotNull(viewCreateSeekBar, str);
                break;
            case "AutoCompleteTextView":
                viewCreateSeekBar = createAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(viewCreateSeekBar, str);
                break;
            case "MultiAutoCompleteTextView":
                viewCreateSeekBar = createMultiAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(viewCreateSeekBar, str);
                break;
            case "RatingBar":
                viewCreateSeekBar = createRatingBar(context2, attributeSet);
                verifyNotNull(viewCreateSeekBar, str);
                break;
            case "SeekBar":
                viewCreateSeekBar = createSeekBar(context2, attributeSet);
                verifyNotNull(viewCreateSeekBar, str);
                break;
            default:
                viewCreateSeekBar = createView(context2, str, attributeSet);
                break;
        }
        View viewCreateViewFromTag = (viewCreateSeekBar != null || context == context2) ? viewCreateSeekBar : createViewFromTag(context2, str, attributeSet);
        if (viewCreateViewFromTag != null) {
            checkOnClickListener(viewCreateViewFromTag, attributeSet);
        }
        return viewCreateViewFromTag;
    }

    protected acp createTextView(Context context, AttributeSet attributeSet) {
        return new acp(context, attributeSet);
    }

    protected aby createImageView(Context context, AttributeSet attributeSet) {
        return new aby(context, attributeSet);
    }

    public AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    protected abu createEditText(Context context, AttributeSet attributeSet) {
        return new abu(context, attributeSet);
    }

    protected acg createSpinner(Context context, AttributeSet attributeSet) {
        return new acg(context, attributeSet);
    }

    protected abw createImageButton(Context context, AttributeSet attributeSet) {
        return new abw(context, attributeSet);
    }

    public abl createCheckBox(Context context, AttributeSet attributeSet) {
        return new abl(context, attributeSet);
    }

    public acc createRadioButton(Context context, AttributeSet attributeSet) {
        return new acc(context, attributeSet);
    }

    protected abm createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new abm(context, attributeSet);
    }

    protected abj createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new abj(context, attributeSet);
    }

    protected abz createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new abz(context, attributeSet);
    }

    protected acd createRatingBar(Context context, AttributeSet attributeSet) {
        return new acd(context, attributeSet);
    }

    protected ace createSeekBar(Context context, AttributeSet attributeSet) {
        return new ace(context, attributeSet);
    }

    private void verifyNotNull(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    protected View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.mConstructorArgs[0] = context;
            this.mConstructorArgs[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (int i = 0; i < sClassPrefixList.length; i++) {
                    View viewCreateViewByPrefix = createViewByPrefix(context, str, sClassPrefixList[i]);
                    if (viewCreateViewByPrefix != null) {
                        return viewCreateViewByPrefix;
                    }
                }
                return null;
            }
            return createViewByPrefix(context, str, null);
        } catch (Exception e) {
            return null;
        } finally {
            this.mConstructorArgs[0] = null;
            this.mConstructorArgs[1] = null;
        }
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && ti.A(view)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new wv(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private View createViewByPrefix(Context context, String str, String str2) {
        Constructor constructor = (Constructor) sConstructorMap.get(str);
        if (constructor == null) {
            try {
                constructor = context.getClassLoader().loadClass(str2 != null ? str2 + str : str).asSubclass(View.class).getConstructor(sConstructorSignature);
                sConstructorMap.put(str, constructor);
            } catch (Exception e) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    private static Context themifyContext(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xl.dt, 0, 0);
        int resourceId = z ? typedArrayObtainStyledAttributes.getResourceId(xl.dC, 0) : 0;
        int resourceId2 = (z2 && resourceId == 0) ? typedArrayObtainStyledAttributes.getResourceId(xl.dD, 0) : resourceId;
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId2 != 0) {
            if (!(context instanceof yj) || ((yj) context).a != resourceId2) {
                return new yj(context, resourceId2);
            }
            return context;
        }
        return context;
    }
}
