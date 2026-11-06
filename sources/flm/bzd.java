package flm;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimeraresources.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bzd extends afm {
    public final List c = new ArrayList();
    private final Fragment d;

    public bzd(Fragment fragment) {
        this.d = fragment;
    }

    @Override // flm.afm
    public final int a() {
        return this.c.size();
    }

    @Override // flm.afm
    public final /* synthetic */ void a(agm agmVar, int i) {
        final bze bzeVar = (bze) agmVar;
        final String str = (String) this.c.get(i);
        final PackageManager packageManager = bzeVar.q.getContext().getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            bzeVar.r.setImageDrawable(packageManager.getApplicationIcon(applicationInfo));
            bzeVar.s.setText(packageManager.getApplicationLabel(applicationInfo));
            bzeVar.q.setOnClickListener(new View.OnClickListener(bzeVar, packageManager, str) { // from class: flm.bzf
                private final bze a;
                private final PackageManager b;
                private final String c;

                {
                    this.a = bzeVar;
                    this.b = packageManager;
                    this.c = str;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bze bzeVar2 = this.a;
                    Intent launchIntentForPackage = this.b.getLaunchIntentForPackage(this.c);
                    Activity activity = bzeVar2.p.getActivity();
                    if (activity == null || launchIntentForPackage == null) {
                        return;
                    }
                    activity.startActivityForResult(launchIntentForPackage, 0);
                }
            });
        } catch (PackageManager.NameNotFoundException e) {
            btv.d("TimeLimit", "Can't find whitelist app:%s", str);
        }
    }

    @Override // flm.afm
    public final /* synthetic */ agm a(ViewGroup viewGroup, int i) {
        return new bze(this.d, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.kids_time_limit_whitelist_app_item, viewGroup, false));
    }
}
