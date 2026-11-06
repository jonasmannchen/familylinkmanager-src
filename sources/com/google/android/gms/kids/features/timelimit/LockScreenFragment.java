package com.google.android.gms.kids.features.timelimit;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimera.Fragment;
import com.google.android.chimeraresources.R;
import flm.byr;
import flm.byt;
import flm.cbs;
import flm.cbt;
import flm.cbw;
import flm.ccc;
import flm.cce;
import flm.esu;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class LockScreenFragment extends Fragment implements View.OnClickListener {
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.kids_time_limit_default, viewGroup, false);
        viewInflate.findViewById(R.id.kids_time_limit_whitelist_apps_btn).setOnClickListener(this);
        viewInflate.findViewById(R.id.kids_time_limit_unlock_btn).setOnClickListener(this);
        String strA = byt.a((Context) getActivity());
        Button button = (Button) viewInflate.findViewById(R.id.kids_time_limit_emergency_btn);
        button.setVisibility(strA == null ? 4 : 0);
        button.setOnClickListener(this);
        return viewInflate;
    }

    public final void onResume() {
        super.onResume();
        byr state = ((LockScreenChimeraActivity) getActivity()).getState();
        TextView textView = (TextView) getView().findViewById(R.id.kids_time_limit_header_title);
        TextView textView2 = (TextView) getView().findViewById(R.id.kids_time_limit_header_desc);
        esu esuVarA = esu.a(state.c);
        if (esuVarA == null) {
            esuVarA = esu.NO_ACTIVE_POLICY;
        }
        switch (esuVarA.ordinal()) {
            case 1:
                textView.setText(R.string.kids_time_limit_title_adhoc);
                textView2.setText(getString(R.string.kids_time_limit_desc_adhoc));
                break;
            case 2:
                textView.setText(R.string.kids_time_limit_title_bedtime);
                Calendar calendarB = byt.b(state.e);
                Calendar calendarB2 = byt.b(state.g);
                Calendar calendar = (Calendar) calendarB2.clone();
                calendar.set(6, calendarB2.get(6) + 1);
                if (calendarB2.equals(calendarB)) {
                    textView2.setText(getString(R.string.kids_time_limit_desc_bedtime, new Object[]{byt.a(state.e)}));
                } else if (calendar.equals(calendarB)) {
                    textView2.setText(getString(R.string.kids_time_limit_desc_bedtime_ends_tomorrow, new Object[]{byt.a(state.e)}));
                } else {
                    textView2.setText(getString(R.string.kids_time_limit_desc_bedtime_ends_future, new Object[]{calendarB.getDisplayName(7, 2, Locale.getDefault()), byt.a(state.e)}));
                }
                break;
            case 3:
                if (state.d) {
                    textView.setText(R.string.kids_time_limit_title_usage_locked_all_day);
                    textView2.setText(R.string.kids_time_limit_desc_usage_locked_all_day);
                } else {
                    textView.setText(R.string.kids_time_limit_title_usage);
                    textView2.setText(getString(R.string.kids_time_limit_desc_usage, new Object[]{byt.a(getActivity(), state.f)}));
                }
                break;
            default:
                esu esuVarA2 = esu.a(state.c);
                if (esuVarA2 == null) {
                    esuVarA2 = esu.NO_ACTIVE_POLICY;
                }
                String strValueOf = String.valueOf(esuVarA2);
                throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf).length() + 22).append("Invalid active policy:").append(strValueOf).toString());
        }
        ((Button) getView().findViewById(R.id.kids_time_limit_whitelist_apps_btn)).setVisibility(byt.a(state) ? 0 : 8);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        ccc cccVar;
        String strConcat;
        int i2;
        ccc cccVar2;
        String strConcat2;
        int id = view.getId();
        LockScreenChimeraActivity lockScreenChimeraActivity = (LockScreenChimeraActivity) getActivity();
        if (id == R.id.kids_time_limit_unlock_btn) {
            cbt cbtVarA = cce.a(this);
            cbw cbwVar = cbtVarA.d.isEmpty() ? cbtVarA.b : (cbw) cbtVarA.d.peekLast();
            if (cbwVar == null) {
                throw new IllegalStateException("no current navigation node");
            }
            cbs cbsVarA = cbwVar.a(R.id.kids_action_local_unlock);
            if (cbsVarA != null) {
                cccVar2 = cbsVarA.b;
                if (cbsVarA.a == 0 && cccVar2 != null && cccVar2.b != 0) {
                    cbtVarA.a(cccVar2.b, cccVar2.c);
                    return;
                }
                i2 = cbsVarA.a;
            } else {
                i2 = R.id.kids_action_local_unlock;
                cccVar2 = null;
            }
            cbw cbwVarB = cbtVarA.b(i2);
            if (cbwVarB == null) {
                String resourceName = cbtVarA.a.getResources().getResourceName(i2);
                if (cbsVarA != null) {
                    String strValueOf = String.valueOf(cbtVarA.a.getResources().getResourceName(R.id.kids_action_local_unlock));
                    strConcat2 = strValueOf.length() != 0 ? " referenced from action ".concat(strValueOf) : new String(" referenced from action ");
                } else {
                    strConcat2 = "";
                }
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(resourceName).length() + 56 + String.valueOf(strConcat2).length()).append("navigation destination ").append(resourceName).append(strConcat2).append(" is unknown to this NavController").toString());
            }
            if (cccVar2 != null && cccVar2.b != 0) {
                cbtVarA.a(cccVar2.b, cccVar2.c);
            }
            cbwVarB.a((Bundle) null, cccVar2);
            return;
        }
        if (id == R.id.kids_time_limit_emergency_btn) {
            lockScreenChimeraActivity.onEmergencyButtonClicked();
            return;
        }
        if (id == R.id.kids_time_limit_whitelist_apps_btn) {
            cbt cbtVarA2 = cce.a(this);
            cbw cbwVar2 = cbtVarA2.d.isEmpty() ? cbtVarA2.b : (cbw) cbtVarA2.d.peekLast();
            if (cbwVar2 == null) {
                throw new IllegalStateException("no current navigation node");
            }
            cbs cbsVarA2 = cbwVar2.a(R.id.kids_action_white_list_apps);
            if (cbsVarA2 != null) {
                cccVar = cbsVarA2.b;
                if (cbsVarA2.a == 0 && cccVar != null && cccVar.b != 0) {
                    cbtVarA2.a(cccVar.b, cccVar.c);
                    return;
                }
                i = cbsVarA2.a;
            } else {
                i = R.id.kids_action_white_list_apps;
                cccVar = null;
            }
            cbw cbwVarB2 = cbtVarA2.b(i);
            if (cbwVarB2 == null) {
                String resourceName2 = cbtVarA2.a.getResources().getResourceName(i);
                if (cbsVarA2 != null) {
                    String strValueOf2 = String.valueOf(cbtVarA2.a.getResources().getResourceName(R.id.kids_action_white_list_apps));
                    strConcat = strValueOf2.length() != 0 ? " referenced from action ".concat(strValueOf2) : new String(" referenced from action ");
                } else {
                    strConcat = "";
                }
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(resourceName2).length() + 56 + String.valueOf(strConcat).length()).append("navigation destination ").append(resourceName2).append(strConcat).append(" is unknown to this NavController").toString());
            }
            if (cccVar != null && cccVar.b != 0) {
                cbtVarA2.a(cccVar.b, cccVar.c);
            }
            cbwVarB2.a((Bundle) null, cccVar);
        }
    }
}
