package com.google.android.gms.kids.features.timelimit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.features.timelimit.LockScreenAccountInterceptorFragment;
import flm.bya;
import flm.byl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public class LockScreenAccountInterceptorFragment extends Fragment {
    public byl a;
    private final bya b = new bya(this);

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.a = (byl) activity;
    }

    public void onDetach() {
        super.onDetach();
        this.a = null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.kids_time_limit_account_interceptor, viewGroup, false);
        ((TextView) viewInflate.findViewById(R.id.kids_time_limit_account_interceptor_desc_txt)).setText(getString(R.string.kids_time_limit_account_interceptor_desc, new Object[]{""}));
        viewInflate.findViewById(R.id.kids_time_limit_account_interceptor_emergency_btn).setOnClickListener(new View.OnClickListener(this) { // from class: flm.bxy
            private final LockScreenAccountInterceptorFragment a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.onEmergencyButtonClicked();
            }
        });
        viewInflate.findViewById(R.id.kids_time_limit_account_interceptor_parent_present_btn).setOnClickListener(new View.OnClickListener(this) { // from class: flm.bxz
            private final LockScreenAccountInterceptorFragment a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i;
                ccc cccVar;
                String strConcat;
                cbt cbtVarA = cce.a(this.a);
                cbw cbwVar = cbtVarA.d.isEmpty() ? cbtVarA.b : (cbw) cbtVarA.d.peekLast();
                if (cbwVar == null) {
                    throw new IllegalStateException("no current navigation node");
                }
                cbs cbsVarA = cbwVar.a(R.id.kids_action_local_unlock);
                if (cbsVarA != null) {
                    cccVar = cbsVarA.b;
                    if (cbsVarA.a == 0 && cccVar != null && cccVar.b != 0) {
                        cbtVarA.a(cccVar.b, cccVar.c);
                        return;
                    }
                    i = cbsVarA.a;
                } else {
                    i = R.id.kids_action_local_unlock;
                    cccVar = null;
                }
                cbw cbwVarB = cbtVarA.b(i);
                if (cbwVarB != null) {
                    if (cccVar != null && cccVar.b != 0) {
                        cbtVarA.a(cccVar.b, cccVar.c);
                    }
                    cbwVarB.a((Bundle) null, cccVar);
                    return;
                }
                String resourceName = cbtVarA.a.getResources().getResourceName(i);
                if (cbsVarA != null) {
                    String strValueOf = String.valueOf(cbtVarA.a.getResources().getResourceName(R.id.kids_action_local_unlock));
                    strConcat = strValueOf.length() != 0 ? " referenced from action ".concat(strValueOf) : new String(" referenced from action ");
                } else {
                    strConcat = "";
                }
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(resourceName).length() + 56 + String.valueOf(strConcat).length()).append("navigation destination ").append(resourceName).append(strConcat).append(" is unknown to this NavController").toString());
            }
        });
        return viewInflate;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getLoaderManager().initLoader(0, (Bundle) null, this.b);
    }
}
