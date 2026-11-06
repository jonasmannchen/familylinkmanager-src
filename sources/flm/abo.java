package flm;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.google.android.chimeraresources.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class abo {
    private static abo b;
    private WeakHashMap j;
    private rt k;
    private sp l;
    private final WeakHashMap m = new WeakHashMap(0);
    private TypedValue n;
    private boolean o;
    private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static final abr c = new abr(6);
    private static final int[] d = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
    private static final int[] e = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
    private static final int[] f = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl_dark, R.drawable.abc_text_select_handle_middle_mtrl_dark, R.drawable.abc_text_select_handle_right_mtrl_dark, R.drawable.abc_text_select_handle_left_mtrl_light, R.drawable.abc_text_select_handle_middle_mtrl_light, R.drawable.abc_text_select_handle_right_mtrl_light};
    private static final int[] g = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
    private static final int[] h = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
    private static final int[] i = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material};

    public static synchronized abo a() {
        if (b == null) {
            abo aboVar = new abo();
            b = aboVar;
            if (Build.VERSION.SDK_INT < 24) {
                aboVar.a("vector", new abt());
                aboVar.a("animated-vector", new abq());
                aboVar.a("animated-selector", new abp());
            }
        }
        return b;
    }

    public final synchronized Drawable a(Context context, int i2) {
        return a(context, i2, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (((r2 instanceof flm.ik) || "android.graphics.drawable.VectorDrawable".equals(r2.getClass().getName())) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final synchronized android.graphics.drawable.Drawable a(android.content.Context r8, int r9, boolean r10) {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            monitor-enter(r7)
            boolean r2 = r7.o     // Catch: java.lang.Throwable -> L35
            if (r2 != 0) goto L38
            r2 = 1
            r7.o = r2     // Catch: java.lang.Throwable -> L35
            r2 = 2130837587(0x7f020053, float:1.7280132E38)
            android.graphics.drawable.Drawable r2 = r7.a(r8, r2)     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L2a
            boolean r3 = r2 instanceof flm.ik     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L27
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L35
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L28
        L27:
            r0 = r1
        L28:
            if (r0 != 0) goto L38
        L2a:
            r0 = 0
            r7.o = r0     // Catch: java.lang.Throwable -> L35
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L35
            throw r0     // Catch: java.lang.Throwable -> L35
        L35:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L38:
            android.graphics.drawable.Drawable r0 = r7.c(r8, r9)     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L5d
            android.util.TypedValue r0 = r7.n     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L49
            android.util.TypedValue r0 = new android.util.TypedValue     // Catch: java.lang.Throwable -> L35
            r0.<init>()     // Catch: java.lang.Throwable -> L35
            r7.n = r0     // Catch: java.lang.Throwable -> L35
        L49:
            android.util.TypedValue r1 = r7.n     // Catch: java.lang.Throwable -> L35
            android.content.res.Resources r0 = r8.getResources()     // Catch: java.lang.Throwable -> L35
            r2 = 1
            r0.getValue(r9, r1, r2)     // Catch: java.lang.Throwable -> L35
            long r2 = a(r1)     // Catch: java.lang.Throwable -> L35
            android.graphics.drawable.Drawable r0 = r7.a(r8, r2)     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L70
        L5d:
            if (r0 != 0) goto L63
            android.graphics.drawable.Drawable r0 = flm.oo.a(r8, r9)     // Catch: java.lang.Throwable -> L35
        L63:
            if (r0 == 0) goto L69
            android.graphics.drawable.Drawable r0 = r7.a(r8, r9, r10, r0)     // Catch: java.lang.Throwable -> L35
        L69:
            if (r0 == 0) goto L6e
            flm.adn.b(r0)     // Catch: java.lang.Throwable -> L35
        L6e:
            monitor-exit(r7)
            return r0
        L70:
            r4 = 2130837518(0x7f02000e, float:1.7279992E38)
            if (r9 != r4) goto L91
            android.graphics.drawable.LayerDrawable r0 = new android.graphics.drawable.LayerDrawable     // Catch: java.lang.Throwable -> L35
            r4 = 2
            android.graphics.drawable.Drawable[] r4 = new android.graphics.drawable.Drawable[r4]     // Catch: java.lang.Throwable -> L35
            r5 = 0
            r6 = 2130837517(0x7f02000d, float:1.727999E38)
            android.graphics.drawable.Drawable r6 = r7.a(r8, r6)     // Catch: java.lang.Throwable -> L35
            r4[r5] = r6     // Catch: java.lang.Throwable -> L35
            r5 = 1
            r6 = 2130837519(0x7f02000f, float:1.7279994E38)
            android.graphics.drawable.Drawable r6 = r7.a(r8, r6)     // Catch: java.lang.Throwable -> L35
            r4[r5] = r6     // Catch: java.lang.Throwable -> L35
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L35
        L91:
            if (r0 == 0) goto L5d
            int r1 = r1.changingConfigurations     // Catch: java.lang.Throwable -> L35
            r0.setChangingConfigurations(r1)     // Catch: java.lang.Throwable -> L35
            r7.a(r8, r2, r0)     // Catch: java.lang.Throwable -> L35
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: flm.abo.a(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized void a(Context context) {
        sa saVar = (sa) this.m.get(context);
        if (saVar != null) {
            saVar.d();
        }
    }

    private static long a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private final Drawable a(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList colorStateListB = b(context, i2);
        if (colorStateListB != null) {
            if (adn.c(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable drawableE = qc.e(drawable);
            qc.a(drawableE, colorStateListB);
            PorterDuff.Mode mode = null;
            if (i2 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                qc.a(drawableE, mode);
                return drawableE;
            }
            return drawableE;
        }
        if (i2 == R.drawable.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            a(layerDrawable.findDrawableByLayerId(android.R.id.background), agz.a(context, R.attr.colorControlNormal), a);
            a(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), agz.a(context, R.attr.colorControlNormal), a);
            a(layerDrawable.findDrawableByLayerId(android.R.id.progress), agz.a(context, R.attr.colorControlActivated), a);
            return drawable;
        }
        if (i2 == R.drawable.abc_ratingbar_material || i2 == R.drawable.abc_ratingbar_indicator_material || i2 == R.drawable.abc_ratingbar_small_material) {
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            a(layerDrawable2.findDrawableByLayerId(android.R.id.background), agz.c(context, R.attr.colorControlNormal), a);
            a(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), agz.a(context, R.attr.colorControlActivated), a);
            a(layerDrawable2.findDrawableByLayerId(android.R.id.progress), agz.a(context, R.attr.colorControlActivated), a);
            return drawable;
        }
        if (!a(context, i2, drawable) && z) {
            return null;
        }
        return drawable;
    }

    private final Drawable c(Context context, int i2) {
        Drawable drawable;
        int next;
        if (this.k == null || this.k.isEmpty()) {
            return null;
        }
        if (this.l != null) {
            String str = (String) this.l.a(i2, null);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.k.get(str) == null)) {
                return null;
            }
        } else {
            this.l = new sp();
        }
        if (this.n == null) {
            this.n = new TypedValue();
        }
        TypedValue typedValue = this.n;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long jA = a(typedValue);
        Drawable drawableA = a(context, jA);
        if (drawableA != null) {
            return drawableA;
        }
        if (typedValue.string == null || !typedValue.string.toString().endsWith(".xml")) {
            drawable = drawableA;
        } else {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.l.c(i2, name);
                abs absVar = (abs) this.k.get(name);
                if (absVar != null) {
                    drawableA = absVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableA != null) {
                    drawableA.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, jA, drawableA);
                }
                drawable = drawableA;
            } catch (Exception e2) {
                Log.e("AppCompatDrawableManag", "Exception while inflating drawable", e2);
                drawable = drawableA;
            }
        }
        if (drawable == null) {
            this.l.c(i2, "appcompat_skip_skip");
            return drawable;
        }
        return drawable;
    }

    private final synchronized Drawable a(Context context, long j) {
        WeakReference weakReference;
        Drawable drawableNewDrawable;
        sa saVar = (sa) this.m.get(context);
        if (saVar == null || (weakReference = (WeakReference) saVar.a(j, null)) == null) {
            drawableNewDrawable = null;
        } else {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                drawableNewDrawable = constantState.newDrawable(context.getResources());
            } else {
                int iA = rx.a(saVar.c, saVar.e, j);
                if (iA >= 0 && saVar.d[iA] != sa.a) {
                    saVar.d[iA] = sa.a;
                    saVar.b = true;
                }
                drawableNewDrawable = null;
            }
        }
        return drawableNewDrawable;
    }

    private final synchronized boolean a(Context context, long j, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            sa saVar = (sa) this.m.get(context);
            if (saVar == null) {
                saVar = new sa();
                this.m.put(context, saVar);
            }
            saVar.b(j, new WeakReference(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    final synchronized Drawable a(Context context, ahv ahvVar, int i2) {
        Drawable drawableC;
        drawableC = c(context, i2);
        if (drawableC == null) {
            drawableC = ahvVar.a(i2);
        }
        return drawableC != null ? a(context, i2, false, drawableC) : null;
    }

    static boolean a(Context context, int i2, Drawable drawable) {
        int iRound;
        int i3;
        PorterDuff.Mode mode;
        boolean z;
        PorterDuff.Mode mode2 = a;
        if (a(d, i2)) {
            i3 = R.attr.colorControlNormal;
            mode = mode2;
            z = true;
            iRound = -1;
        } else if (a(f, i2)) {
            i3 = R.attr.colorControlActivated;
            mode = mode2;
            z = true;
            iRound = -1;
        } else if (a(g, i2)) {
            z = true;
            mode = PorterDuff.Mode.MULTIPLY;
            i3 = 16842801;
            iRound = -1;
        } else if (i2 == R.drawable.abc_list_divider_mtrl_alpha) {
            i3 = android.R.attr.colorForeground;
            iRound = Math.round(40.8f);
            mode = mode2;
            z = true;
        } else if (i2 == R.drawable.abc_dialog_material_background) {
            i3 = 16842801;
            mode = mode2;
            z = true;
            iRound = -1;
        } else {
            iRound = -1;
            i3 = 0;
            mode = mode2;
            z = false;
        }
        if (!z) {
            return false;
        }
        if (adn.c(drawable)) {
            drawable = drawable.mutate();
        }
        drawable.setColorFilter(a(agz.a(context, i3), mode));
        if (iRound == -1) {
            return true;
        }
        drawable.setAlpha(iRound);
        return true;
    }

    private final void a(String str, abs absVar) {
        if (this.k == null) {
            this.k = new rt();
        }
        this.k.put(str, absVar);
    }

    private static boolean a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    final synchronized ColorStateList b(Context context, int i2) {
        ColorStateList colorStateList;
        ColorStateList colorStateListA;
        sp spVar;
        colorStateList = (this.j == null || (spVar = (sp) this.j.get(context)) == null) ? null : (ColorStateList) spVar.a(i2, null);
        if (colorStateList == null) {
            if (i2 == R.drawable.abc_edit_text_material) {
                colorStateListA = xn.a(context, R.color.abc_tint_edittext);
            } else if (i2 == R.drawable.abc_switch_track_mtrl_alpha) {
                colorStateListA = xn.a(context, R.color.abc_tint_switch_track);
            } else if (i2 == R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                ColorStateList colorStateListB = agz.b(context, R.attr.colorSwitchThumbNormal);
                if (colorStateListB != null && colorStateListB.isStateful()) {
                    iArr[0] = agz.a;
                    iArr2[0] = colorStateListB.getColorForState(iArr[0], 0);
                    iArr[1] = agz.d;
                    iArr2[1] = agz.a(context, R.attr.colorControlActivated);
                    iArr[2] = agz.e;
                    iArr2[2] = colorStateListB.getDefaultColor();
                } else {
                    iArr[0] = agz.a;
                    iArr2[0] = agz.c(context, R.attr.colorSwitchThumbNormal);
                    iArr[1] = agz.d;
                    iArr2[1] = agz.a(context, R.attr.colorControlActivated);
                    iArr[2] = agz.e;
                    iArr2[2] = agz.a(context, R.attr.colorSwitchThumbNormal);
                }
                colorStateListA = new ColorStateList(iArr, iArr2);
            } else if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
                colorStateListA = d(context, agz.a(context, R.attr.colorButtonNormal));
            } else if (i2 == R.drawable.abc_btn_borderless_material) {
                colorStateListA = d(context, 0);
            } else if (i2 == R.drawable.abc_btn_colored_material) {
                colorStateListA = d(context, agz.a(context, R.attr.colorAccent));
            } else if (i2 == R.drawable.abc_spinner_mtrl_am_alpha || i2 == R.drawable.abc_spinner_textfield_background_material) {
                colorStateListA = xn.a(context, R.color.abc_tint_spinner);
            } else if (a(e, i2)) {
                colorStateListA = agz.b(context, R.attr.colorControlNormal);
            } else if (a(h, i2)) {
                colorStateListA = xn.a(context, R.color.abc_tint_default);
            } else if (a(i, i2)) {
                colorStateListA = xn.a(context, R.color.abc_tint_btn_checkable);
            } else {
                colorStateListA = i2 == R.drawable.abc_seekbar_thumb_material ? xn.a(context, R.color.abc_tint_seek_thumb) : colorStateList;
            }
            if (colorStateListA != null) {
                if (this.j == null) {
                    this.j = new WeakHashMap();
                }
                sp spVar2 = (sp) this.j.get(context);
                if (spVar2 == null) {
                    spVar2 = new sp();
                    this.j.put(context, spVar2);
                }
                spVar2.c(i2, colorStateListA);
            }
            colorStateList = colorStateListA;
        }
        return colorStateList;
    }

    private static ColorStateList d(Context context, int i2) {
        int iA = agz.a(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{agz.a, agz.c, agz.b, agz.e}, new int[]{agz.c(context, R.attr.colorButtonNormal), po.a(iA, i2), po.a(iA, i2), i2});
    }

    static void a(Drawable drawable, ahc ahcVar, int[] iArr) {
        PorterDuffColorFilter porterDuffColorFilterA = null;
        if (!adn.c(drawable) || drawable.mutate() == drawable) {
            if (ahcVar.d || ahcVar.c) {
                ColorStateList colorStateList = ahcVar.d ? ahcVar.a : null;
                PorterDuff.Mode mode = ahcVar.c ? ahcVar.b : a;
                if (colorStateList != null && mode != null) {
                    porterDuffColorFilterA = a(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilterA);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    public static synchronized PorterDuffColorFilter a(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        porterDuffColorFilter = (PorterDuffColorFilter) c.get(Integer.valueOf(abr.a(i2, mode)));
        if (porterDuffColorFilter == null) {
            PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i2, mode);
            porterDuffColorFilter = porterDuffColorFilter2;
        }
        return porterDuffColorFilter;
    }

    private static void a(Drawable drawable, int i2, PorterDuff.Mode mode) {
        if (adn.c(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = a;
        }
        drawable.setColorFilter(a(i2, mode));
    }
}
