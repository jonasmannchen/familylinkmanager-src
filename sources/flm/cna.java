package flm;

import android.content.DialogInterface;
import android.widget.TextView;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.geller.NotAllowedDevicesFragment;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cna extends cgw {
    public final /* synthetic */ NotAllowedDevicesFragment a;

    public cna(NotAllowedDevicesFragment notAllowedDevicesFragment) {
        this.a = notAllowedDevicesFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a() {
        this.a.i(51);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.cnb
            private final cna a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.a.i();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final /* synthetic */ void b(Object obj) {
        this.a.j(51);
        List list = (List) ((Map) obj).get(evf.NOT_ALLOWED);
        int size = list.size();
        ((TextView) this.a.g.findViewById(R.id.not_allowed_devices_warning)).setText(this.a.getResources().getQuantityString(R.plurals.not_allowed_devices_warning, size, Integer.valueOf(size)));
        this.a.a.clear();
        this.a.a.addAll(list);
    }
}
