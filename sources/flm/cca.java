package flm;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimeraresources.R;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cca extends Fragment {
    public cbt a;
    private int b = -1;
    private boolean c;

    public static cca a(int i) {
        Bundle bundle = null;
        if (i != 0) {
            bundle = new Bundle();
            bundle.putInt("android-support-nav:fragment:graphId", i);
        }
        cca ccaVar = new cca();
        if (bundle != null) {
            ccaVar.setArguments(bundle);
        }
        return ccaVar;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (this.c) {
            getFragmentManager().beginTransaction().setPrimaryNavigationFragment(this).commit();
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        int i;
        cbx cbxVarA = null;
        super.onCreate(bundle);
        Activity activity = getActivity();
        if (bundle != null) {
            this.b = bundle.getInt("android-support-nav:fragment:containerId", -1);
        }
        if (this.b == -1) {
            this.b = View.generateViewId();
        }
        this.a = new cbt(getActivity());
        this.a.a(new cbn(activity, getChildFragmentManager(), this.b));
        if (bundle != null) {
            bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.c = true;
                getFragmentManager().beginTransaction().setPrimaryNavigationFragment(this).commit();
            }
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            cbt cbtVar = this.a;
            if (bundle2 != null) {
                cbtVar.c = bundle2.getInt("android-support-nav:controller:graphId");
                if (cbtVar.c != 0) {
                    cbtVar.b = cbtVar.b().a(cbtVar.c);
                }
                int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackIds");
                if (intArray != null) {
                    for (int i2 : intArray) {
                        cbw cbwVarB = cbtVar.b(i2);
                        if (cbwVarB == null) {
                            String strValueOf = String.valueOf(cbtVar.a.getResources().getResourceName(i2));
                            throw new IllegalStateException(strValueOf.length() != 0 ? "unknown destination during restore: ".concat(strValueOf) : new String("unknown destination during restore: "));
                        }
                        cbtVar.d.add(cbwVarB);
                    }
                }
                cbtVar.c();
                return;
            }
            return;
        }
        Bundle arguments = getArguments();
        int i3 = arguments != null ? arguments.getInt("android-support-nav:fragment:graphId") : 0;
        if (i3 != 0) {
            this.a.a(i3);
            return;
        }
        cbt cbtVar2 = this.a;
        ccb ccbVarB = cbtVar2.b();
        Bundle bundle3 = ccbVarB.a.getApplicationInfo().metaData;
        if (bundle3 != null && (i = bundle3.getInt("android.nav.graph")) != 0) {
            cbxVarA = ccbVarB.a(i);
        }
        cbtVar2.b = cbxVarA;
        cbtVar2.c = 0;
        cbtVar2.c();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setId(this.b);
        return frameLayout;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!(view instanceof ViewGroup)) {
            String strValueOf = String.valueOf(view);
            throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf).length() + 37).append("created host view ").append(strValueOf).append(" is not a ViewGroup").toString());
        }
        view.setTag(R.id.nav_controller_view_tag, this.a);
    }

    public final void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(attributeSet, alg.y);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(alg.A, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(alg.z, false);
        if (resourceId != 0) {
            if (this.a == null) {
                Bundle arguments = getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putInt("android-support-nav:fragment:graphId", resourceId);
                setArguments(arguments);
            } else {
                this.a.a(resourceId);
            }
        }
        if (z) {
            this.c = true;
            if (isAdded()) {
                getFragmentManager().beginTransaction().setPrimaryNavigationFragment(this).commit();
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2;
        super.onSaveInstanceState(bundle);
        cbt cbtVar = this.a;
        Bundle bundle3 = null;
        if (cbtVar.c != 0) {
            bundle3 = new Bundle();
            bundle3.putInt("android-support-nav:controller:graphId", cbtVar.c);
        }
        if (cbtVar.d.isEmpty()) {
            bundle2 = bundle3;
        } else {
            bundle2 = bundle3 == null ? new Bundle() : bundle3;
            int[] iArr = new int[cbtVar.d.size()];
            Iterator it = cbtVar.d.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = ((cbw) it.next()).e;
                i++;
            }
            bundle2.putIntArray("android-support-nav:controller:backStackIds", iArr);
        }
        if (bundle2 != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", bundle2);
        }
        if (this.c) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        bundle.putInt("android-support-nav:fragment:containerId", this.b);
    }
}
