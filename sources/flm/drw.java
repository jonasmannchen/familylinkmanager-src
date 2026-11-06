package flm;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.chimeraresources.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class drw extends lg implements nl {
    private ArrayAdapter X;
    public dry a;

    @Override // flm.lg
    public final void a(Context context) {
        super.a(context);
        bm bmVar = this.y;
        if (bmVar instanceof dry) {
            this.a = (dry) bmVar;
            return;
        }
        bm bmVarK = k();
        if (bmVarK instanceof dry) {
            this.a = (dry) bmVarK;
        }
    }

    @Override // flm.lg
    public final void e() {
        super.e();
        this.a = null;
    }

    @Override // flm.lg
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.libraries_social_licenses_license_menu_fragment, viewGroup, false);
    }

    @Override // flm.lg
    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        ln lnVarK = k();
        this.X = new ArrayAdapter(lnVarK, R.layout.libraries_social_licenses_license, R.id.license, new ArrayList());
        nk.a(lnVarK).a(54321, null, this);
        ListView listView = (ListView) view.findViewById(R.id.license_list);
        listView.setAdapter((ListAdapter) this.X);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(this) { // from class: flm.drx
            private final drw a;

            {
                this.a = this;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                drw drwVar = this.a;
                drs drsVar = (drs) adapterView.getItemAtPosition(i);
                if (drwVar.a != null) {
                    drwVar.a.a(drsVar);
                }
            }
        });
    }

    @Override // flm.lg
    public final void c() {
        super.c();
        nk.a(k()).a(54321);
    }

    @Override // flm.nl
    public final op a() {
        Bundle bundle = this.i;
        return (bundle == null || bundle.getStringArrayList("pluginLicensePaths") == null || bundle.getStringArrayList("pluginLicensePaths").isEmpty()) ? new drv(k()) : new drv(k(), bundle.getStringArrayList("pluginLicensePaths"));
    }

    @Override // flm.nl
    public final void b() {
        this.X.clear();
        this.X.notifyDataSetChanged();
    }

    @Override // flm.nl
    public final /* synthetic */ void a(op opVar, Object obj) {
        this.X.clear();
        this.X.addAll((List) obj);
        this.X.notifyDataSetChanged();
    }
}
