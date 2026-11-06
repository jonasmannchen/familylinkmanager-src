package flm;

import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.geller.OtherDevicesFragment;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cne extends cgw {
    public final /* synthetic */ OtherDevicesFragment a;

    public cne(OtherDevicesFragment otherDevicesFragment) {
        this.a = otherDevicesFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a() {
        this.a.i(51);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.cnf
            private final cne a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.a.i();
            }
        });
    }

    private final void a(View view, LinearLayout linearLayout, List list) {
        linearLayout.removeAllViews();
        if (list.isEmpty()) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            evd evdVar = (evd) it.next();
            linearLayout.addView(new cpm(this.a.getActivity()).a(evdVar.b).a(evdVar.d).b(evdVar.c));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final /* synthetic */ void b(Object obj) {
        Map map = (Map) obj;
        LinearLayout linearLayout = (LinearLayout) this.a.g.findViewById(R.id.other_supervisable_devices_list);
        LinearLayout linearLayout2 = (LinearLayout) this.a.g.findViewById(R.id.unsupervisable_devices_list);
        this.a.j(51);
        a(this.a.a, linearLayout, (List) map.get(evf.SUPERVISABLE_WITH_ACTION));
        a(this.a.o, linearLayout2, (List) map.get(evf.UNSUPERVISABLE_BUT_ALLOWED));
    }
}
