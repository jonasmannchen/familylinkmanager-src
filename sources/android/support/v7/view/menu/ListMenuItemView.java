package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.chimeraresources.R;
import flm.aab;
import flm.ahe;
import flm.ti;
import flm.xl;
import flm.zi;
import flm.zm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements AbsListView.SelectionBoundsAdjuster, aab {
    public zm a;
    public ImageView b;
    public boolean c;
    public boolean d;
    public boolean e;
    private ImageView f;
    private RadioButton g;
    private TextView h;
    private CheckBox i;
    private TextView j;
    private ImageView k;
    private LinearLayout l;
    private Drawable m;
    private int n;
    private Context o;
    private Drawable p;
    private LayoutInflater q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        ahe aheVarA = ahe.a(getContext(), attributeSet, xl.bR, i, 0);
        this.m = aheVarA.a(xl.bS);
        this.n = aheVarA.g(xl.bT, -1);
        this.c = aheVarA.a(xl.bU, false);
        this.o = context;
        this.p = aheVarA.a(xl.bV);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.d = typedArrayObtainStyledAttributes.hasValue(0);
        aheVarA.b.recycle();
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        ti.a(this, this.m);
        this.h = (TextView) findViewById(R.id.title);
        if (this.n != -1) {
            this.h.setTextAppearance(this.o, this.n);
        }
        this.j = (TextView) findViewById(R.id.shortcut);
        this.k = (ImageView) findViewById(R.id.submenuarrow);
        if (this.k != null) {
            this.k.setImageDrawable(this.p);
        }
        this.b = (ImageView) findViewById(R.id.group_divider);
        this.l = (LinearLayout) findViewById(R.id.content);
    }

    @Override // flm.aab
    public final void a(zm zmVar, int i) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        String string;
        this.a = zmVar;
        setVisibility(zmVar.isVisible() ? 0 : 8);
        CharSequence charSequenceA = zmVar.a(this);
        if (charSequenceA != null) {
            this.h.setText(charSequenceA);
            if (this.h.getVisibility() != 0) {
                this.h.setVisibility(0);
            }
        } else if (this.h.getVisibility() != 8) {
            this.h.setVisibility(8);
        }
        boolean zIsCheckable = zmVar.isCheckable();
        if (zIsCheckable || this.g != null || this.i != null) {
            if (this.a.e()) {
                if (this.g == null) {
                    this.g = (RadioButton) c().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                    a(this.g, -1);
                }
                compoundButton = this.g;
                compoundButton2 = this.i;
            } else {
                if (this.i == null) {
                    this.i = (CheckBox) c().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                    a(this.i, -1);
                }
                compoundButton = this.i;
                compoundButton2 = this.g;
            }
            if (zIsCheckable) {
                compoundButton.setChecked(this.a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (compoundButton2 != null && compoundButton2.getVisibility() != 8) {
                    compoundButton2.setVisibility(8);
                }
            } else {
                if (this.i != null) {
                    this.i.setVisibility(8);
                }
                if (this.g != null) {
                    this.g.setVisibility(8);
                }
            }
        }
        boolean zD = zmVar.d();
        zmVar.c();
        int i2 = (zD && this.a.d()) ? 0 : 8;
        if (i2 == 0) {
            TextView textView = this.j;
            zm zmVar2 = this.a;
            char c = zmVar2.c();
            if (c == 0) {
                string = "";
            } else {
                Resources resources = zmVar2.d.a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(zmVar2.d.a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i3 = zmVar2.d.c() ? zmVar2.c : zmVar2.b;
                zm.a(sb, i3, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                zm.a(sb, i3, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                zm.a(sb, i3, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                zm.a(sb, i3, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                zm.a(sb, i3, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                zm.a(sb, i3, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                switch (c) {
                    case '\b':
                        sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        break;
                    case '\n':
                        sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        break;
                    case ' ':
                        sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        break;
                    default:
                        sb.append(c);
                        break;
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.j.getVisibility() != i2) {
            this.j.setVisibility(i2);
        }
        Drawable icon = zmVar.getIcon();
        zi ziVar = this.a.d;
        boolean z = this.e;
        if ((z || this.c) && (this.f != null || icon != null || this.c)) {
            if (this.f == null) {
                this.f = (ImageView) c().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                a(this.f, 0);
            }
            if (icon != null || this.c) {
                this.f.setImageDrawable(z ? icon : null);
                if (this.f.getVisibility() != 0) {
                    this.f.setVisibility(0);
                }
            } else {
                this.f.setVisibility(8);
            }
        }
        setEnabled(zmVar.isEnabled());
        boolean zHasSubMenu = zmVar.hasSubMenu();
        if (this.k != null) {
            this.k.setVisibility(zHasSubMenu ? 0 : 8);
        }
        setContentDescription(zmVar.getContentDescription());
    }

    private final void a(View view, int i) {
        if (this.l != null) {
            this.l.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    @Override // flm.aab
    public final zm a() {
        return this.a;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f != null && this.c) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // flm.aab
    public final boolean b() {
        return false;
    }

    private final LayoutInflater c() {
        if (this.q == null) {
            this.q = LayoutInflater.from(getContext());
        }
        return this.q;
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        if (this.b != null && this.b.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            rect.top = layoutParams.bottomMargin + this.b.getHeight() + layoutParams.topMargin + rect.top;
        }
    }
}
